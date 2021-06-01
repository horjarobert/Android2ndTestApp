package com.stufflex.verificatorcnp;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Handler;
import android.support.annotation.RequiresApi;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.TooltipCompat;
import android.text.Editable;
import android.text.TextWatcher;
import android.transition.TransitionManager;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    // Declarations
    private TextView txt_introduceti_cnp, txt_reimprospatare;

    private TextView txt_arrow_horizontal_sexul, txt_arrow_horizontal_anul, txt_arrow_horizontal_luna, txt_arrow_horizontal_ziua, txt_arrow_horizontal_judetul,
            txt_arrow_horizontal_numar_secvential, txt_arrow_horizontal_cifra_de_control;

    private TextView txt_arrow_sexul, txt_arrow_anul, txt_arrow_luna, txt_arrow_ziua, txt_arrow_judetul, txt_arrow_numar_secvential, txt_arrow_cifra_de_control;

    private EditText edit_text_sexul, edit_text_anul, edit_text_luna, edit_text_ziua, edit_text_judetul, edit_text_numar_secvential, edit_text_cifra_de_control;
    private Button btn_information_sign, btn_exclamation_mark, btn_verificare, btn_refresh;
    private ConstraintLayout mainLayout;

    private static final long TOAST_TIMEOUT_MS = 2000;
    private static long lastToastTime = 0;

    private int int_edit_text_sexul, int_edit_text_anul, int_edit_text_luna, int_edit_text_ziua, int_edit_text_judetul, int_edit_text_numar_secvential, int_edit_text_cifra_de_control;
    private int int_calcul_sexul, int_calcul_an_1, int_calcul_an_2, int_calcul_luna_1, int_calcul_luna_2, int_calcul_ziua_1, int_calcul_ziua_2, int_calcul_judet_1, int_calcul_judet_2,
                int_calcul_nr_secvential_1, int_calcul_nr_secvential_2, int_calcul_nr_secvential_3, int_calcul_cifra_de_control;

    private AnimatorSet setDownAndUp_Sexul, setDownAndUp_Anul, setDownAndUp_Luna, setDownAndUp_Ziua, setDownAndUp_Judetul,
                        setDownAndUp_NumarSecvential, setDownAndUp_CifraDeControl;

    private Animator scaleUp_Sexul, scaleUp_Anul, scaleUp_Luna, scaleUp_Ziua, scaleUp_Judetul, scaleUp_NumarSecvential, scaleUp_CifraDeControl;
    private Animator scaleDown_Sexul, scaleDown_Anul, scaleDown_Luna, scaleDown_Ziua, scaleDown_Judetul, scaleDown_NumarSecvential, scaleDown_CifraDeControl;

    private ConstraintSet constraintSetActivityOLD = new ConstraintSet();
    private ConstraintSet constraintSetActivityNEW = new ConstraintSet();

    private boolean verificareIsClicked = false;

    private Handler handler1, handler2, handler3, handler4, handler5, handler6, handler7;
    private Runnable runnable1, runnable2, runnable3, runnable4, runnable5, runnable6, runnable7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Navbar-fullscreen
        hideNavigationBar();

        // Disable screenshot option by using FLAG_SECURE
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);

        // Initializations
        txt_introduceti_cnp = findViewById(R.id.txt_introduceti_cnp);
        txt_reimprospatare = findViewById(R.id.txt_reimprospatare);

        txt_arrow_horizontal_sexul = findViewById(R.id.txt_arrow_horizontal_sexul);
        txt_arrow_horizontal_anul = findViewById(R.id.txt_arrow_horizontal_anul);
        txt_arrow_horizontal_luna = findViewById(R.id.txt_arrow_horizontal_luna);
        txt_arrow_horizontal_ziua = findViewById(R.id.txt_arrow_horizontal_ziua);
        txt_arrow_horizontal_judetul = findViewById(R.id.txt_arrow_horizontal_judetul);
        txt_arrow_horizontal_numar_secvential = findViewById(R.id.txt_arrow_horizontal_numar_secvential);
        txt_arrow_horizontal_cifra_de_control = findViewById(R.id.txt_arrow_horizontal_cifra_de_control);

        txt_arrow_sexul = findViewById(R.id.txt_arrow_sexul);
        txt_arrow_anul = findViewById(R.id.txt_arrow_anul);
        txt_arrow_luna = findViewById(R.id.txt_arrow_luna);
        txt_arrow_ziua = findViewById(R.id.txt_arrow_ziua);
        txt_arrow_judetul = findViewById(R.id.txt_arrow_judetul);
        txt_arrow_numar_secvential = findViewById(R.id.txt_arrow_numar_secvential);
        txt_arrow_cifra_de_control = findViewById(R.id.txt_arrow_cifra_de_control);

        edit_text_sexul = findViewById(R.id.edit_text_sexul);
        edit_text_anul = findViewById(R.id.edit_text_anul);
        edit_text_luna = findViewById(R.id.edit_text_luna);
        edit_text_ziua = findViewById(R.id.edit_text_ziua);
        edit_text_judetul = findViewById(R.id.edit_text_judetul);
        edit_text_numar_secvential = findViewById(R.id.edit_text_numar_secvential);
        edit_text_cifra_de_control = findViewById(R.id.edit_text_cifra_de_control);

        btn_information_sign = findViewById(R.id.btn_information_sign);
        btn_exclamation_mark = findViewById(R.id.btn_exclamation_mark);
        btn_verificare = findViewById(R.id.btn_verificare);
        btn_refresh = findViewById(R.id.btn_refresh);

        mainLayout = findViewById(R.id.mainLayout);

        // Hide this
        txt_reimprospatare.setVisibility(View.INVISIBLE);

        edit_text_sexul.setVisibility(View.INVISIBLE);
        edit_text_anul.setVisibility(View.INVISIBLE);
        edit_text_luna.setVisibility(View.INVISIBLE);
        edit_text_ziua.setVisibility(View.INVISIBLE);
        edit_text_judetul.setVisibility(View.INVISIBLE);
        edit_text_numar_secvential.setVisibility(View.INVISIBLE);
        edit_text_cifra_de_control.setVisibility(View.INVISIBLE);

        // Cloning
        constraintSetActivityOLD.clone(mainLayout);
        constraintSetActivityNEW.clone(this, R.layout.clone_activity_main);

        // Fullscreen
        mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Navbar-fullscreen
                hideNavigationBar();
            }
        });

        mainLayout.requestFocus();

        // Reîmprospătare
        btn_refresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ScaleDownAndUpAnimations();

                if (edit_text_sexul.length() > 0 || edit_text_anul.length() > 0 || edit_text_luna.length() > 0 || edit_text_ziua.length() > 0 ||
                        edit_text_judetul.length() > 0 || edit_text_numar_secvential.length() > 0 || edit_text_cifra_de_control.length() > 0) {

                    edit_text_sexul.setText("");
                    edit_text_anul.setText("");
                    edit_text_luna.setText("");
                    edit_text_ziua.setText("");
                    edit_text_judetul.setText("");
                    edit_text_numar_secvential.setText("");
                    edit_text_cifra_de_control.setText("");

                    edit_text_sexul.getBackground().setColorFilter(Color.GRAY, PorterDuff.Mode.SRC_ATOP);
                    edit_text_anul.getBackground().setColorFilter(Color.GRAY, PorterDuff.Mode.SRC_ATOP);
                    edit_text_luna.getBackground().setColorFilter(Color.GRAY, PorterDuff.Mode.SRC_ATOP);
                    edit_text_ziua.getBackground().setColorFilter(Color.GRAY, PorterDuff.Mode.SRC_ATOP);
                    edit_text_judetul.getBackground().setColorFilter(Color.GRAY, PorterDuff.Mode.SRC_ATOP);
                    edit_text_numar_secvential.getBackground().setColorFilter(Color.GRAY, PorterDuff.Mode.SRC_ATOP);
                    edit_text_cifra_de_control.getBackground().setColorFilter(Color.GRAY, PorterDuff.Mode.SRC_ATOP);

                    Reimprospatare();

                    // Disable. Why? To remove focus, if there is one
                    edit_text_sexul.setEnabled(false);
                    edit_text_anul.setEnabled(false);
                    edit_text_luna.setEnabled(false);
                    edit_text_ziua.setEnabled(false);
                    edit_text_judetul.setEnabled(false);
                    edit_text_numar_secvential.setEnabled(false);
                    edit_text_cifra_de_control.setEnabled(false);
                }

                // Enable (just in case)
                edit_text_sexul.setEnabled(true);
                edit_text_anul.setEnabled(true);
                edit_text_luna.setEnabled(true);
                edit_text_ziua.setEnabled(true);
                edit_text_judetul.setEnabled(true);
                edit_text_numar_secvential.setEnabled(true);
                edit_text_cifra_de_control.setEnabled(true);

                // Navbar-fullscreen
                hideNavigationBar();
            }
        });

        // Focus on next edit text
        FocusOnNextEditText();

        btn_verificare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // S conditions
                VerifyEditTextSexul();

                // AA conditions
                VerifyEditTextAnul();

                // LL conditions
                VerifyEditTextLuna();

                // ZZ conditions
                VerifyEditTextZiua();

                // JJ conditions
                VerifyEditTextJudetul();

                // NNN conditions
                VerifyEditTextNumarSecvential();

                // C conditions
                VerifyEditTextCifraDeControl();

                // Start edit texts animations
                ScaleDownAndUpAnimations();

                // New layout
                GoToTheNewLayout();
            }
        });

    }

    // Hide the navigation bar and make full screen all app
    private void hideNavigationBar() {
        this.getWindow().getDecorView()
                .setSystemUiVisibility(
                        View.SYSTEM_UI_FLAG_FULLSCREEN |
                                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION |
                                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY |
                                View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN |
                                View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION |
                                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                );
    }

    // When I exit for a moment from the app and I'll come back, the same effect must be continue
    @Override
    protected void onResume() {
        super.onResume();

        hideNavigationBar();

        ScaleDownAndUpAnimations();
    }

    // Refresh the app - clear all edit text boxes
    public void Reimprospatare() {

        txt_reimprospatare.setVisibility(View.VISIBLE);

        ScaleDownAndUpAnimations();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txt_reimprospatare.setVisibility(View.INVISIBLE);
            }
        }, 2000);

        // Navbar-fullscreen
        hideNavigationBar();

    }

    public void FocusOnNextEditText() {
        edit_text_sexul.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (edit_text_sexul.length() == 1) {
                    edit_text_anul.requestFocus();
                }

                // Navbar-fullscreen
                hideNavigationBar();
            }

            @Override
            public void afterTextChanged(Editable editable) {
                // Navbar-fullscreen
                hideNavigationBar();
            }
        });

        edit_text_anul.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (edit_text_anul.length() == 2) {
                    edit_text_luna.requestFocus();
                } else if (edit_text_anul.length() == 0) {
                    edit_text_sexul.requestFocus();
                }

                // Navbar-fullscreen
                hideNavigationBar();
            }

            @Override
            public void afterTextChanged(Editable editable) {
                // Navbar-fullscreen
                hideNavigationBar();
            }
        });

        edit_text_luna.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (edit_text_luna.length() == 2) {
                    edit_text_ziua.requestFocus();
                } else if (edit_text_luna.length() == 0) {
                    edit_text_anul.requestFocus();
                }

                // Navbar-fullscreen
                hideNavigationBar();
            }

            @Override
            public void afterTextChanged(Editable editable) {
                // Navbar-fullscreen
                hideNavigationBar();
            }
        });

        edit_text_ziua.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (edit_text_ziua.length() == 2) {
                    edit_text_judetul.requestFocus();
                } else if (edit_text_ziua.length() == 0) {
                    edit_text_luna.requestFocus();
                }

                // Navbar-fullscreen
                hideNavigationBar();
            }

            @Override
            public void afterTextChanged(Editable editable) {
                // Navbar-fullscreen
                hideNavigationBar();
            }
        });

        edit_text_judetul.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (edit_text_judetul.length() == 2) {
                    edit_text_numar_secvential.requestFocus();
                } else if (edit_text_judetul.length() == 0) {
                    edit_text_ziua.requestFocus();
                }

                // Navbar-fullscreen
                hideNavigationBar();
            }

            @Override
            public void afterTextChanged(Editable editable) {
                // Navbar-fullscreen
                hideNavigationBar();
            }
        });

        edit_text_numar_secvential.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (edit_text_numar_secvential.length() == 3) {
                    edit_text_cifra_de_control.requestFocus();
                } else if (edit_text_numar_secvential.length() == 0) {
                    edit_text_judetul.requestFocus();
                }

                // Navbar-fullscreen
                hideNavigationBar();
            }

            @Override
            public void afterTextChanged(Editable editable) {
                // Navbar-fullscreen
                hideNavigationBar();
            }
        });

        edit_text_cifra_de_control.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                if (edit_text_cifra_de_control.length() == 0) {
                    edit_text_numar_secvential.requestFocus();
                }
                // Navbar-fullscreen
                hideNavigationBar();
            }

            @Override
            public void afterTextChanged(Editable editable) {
                // Navbar-fullscreen
                hideNavigationBar();
            }
        });
    }

    public void VerifyEditTextSexul() {
        if (edit_text_sexul.length() > 0) {
            int_edit_text_sexul = Integer.parseInt(edit_text_sexul.getText().toString());
            if (int_edit_text_sexul >= 1 && int_edit_text_sexul <= 8) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        edit_text_sexul.getBackground().setColorFilter(Color.GREEN, PorterDuff.Mode.SRC_ATOP);
                        edit_text_sexul.setTextColor(Color.GREEN);
                    }
                }, 0);
                if (int_edit_text_sexul % 2 == 0) {
                    txt_arrow_horizontal_sexul.setText("Feminin");
                } else {
                    txt_arrow_horizontal_sexul.setText("Masculin");
                }
            } else {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        edit_text_sexul.getBackground().setColorFilter(Color.RED, PorterDuff.Mode.SRC_ATOP);
                        edit_text_sexul.setTextColor(Color.RED);
                    }
                }, 0);
            }
        } else {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    edit_text_sexul.getBackground().setColorFilter(Color.RED, PorterDuff.Mode.SRC_ATOP);
                    edit_text_sexul.setTextColor(Color.RED);
                }
            }, 0);
        }

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                edit_text_sexul.getBackground().setColorFilter(Color.GRAY, PorterDuff.Mode.SRC_ATOP);
                edit_text_sexul.setTextColor(Color.BLACK);
            }
        }, 2000);
    }

    public void VerifyEditTextAnul() {
        if (edit_text_anul.length() > 0) {
            int_edit_text_anul = Integer.parseInt(edit_text_anul.getText().toString());
            if (edit_text_anul.length() == 2) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        edit_text_anul.getBackground().setColorFilter(Color.GREEN, PorterDuff.Mode.SRC_ATOP);
                        edit_text_anul.setTextColor(Color.GREEN);
                    }
                }, 0);
                if (edit_text_sexul.length() > 0) {
                    int_edit_text_sexul = Integer.parseInt(edit_text_sexul.getText().toString());
                    if (int_edit_text_sexul == 1 || int_edit_text_sexul == 2) {
                        txt_arrow_horizontal_anul.setText("19" + edit_text_anul.getText().toString());
                    } else if (int_edit_text_sexul == 3 || int_edit_text_sexul == 4) {
                        txt_arrow_horizontal_anul.setText("18" + edit_text_anul.getText().toString());
                    } else if (int_edit_text_sexul == 5 || int_edit_text_sexul == 6) {
                        txt_arrow_horizontal_anul.setText("20" + edit_text_anul.getText().toString());
                    }else if (int_edit_text_sexul == 7) {
                        txt_arrow_horizontal_anul.setText("Rezident");
                    } else if (int_edit_text_sexul == 8) {
                        txt_arrow_horizontal_anul.setText("Rezidentă");

                    }
                }

            } else {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        edit_text_anul.getBackground().setColorFilter(Color.RED, PorterDuff.Mode.SRC_ATOP);
                        edit_text_anul.setTextColor(Color.RED);
                    }
                }, 0);
            }
        } else {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    edit_text_anul.getBackground().setColorFilter(Color.RED, PorterDuff.Mode.SRC_ATOP);
                    edit_text_anul.setTextColor(Color.RED);
                }
            }, 0);
        }

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                edit_text_anul.getBackground().setColorFilter(Color.GRAY, PorterDuff.Mode.SRC_ATOP);
                edit_text_anul.setTextColor(Color.BLACK);
            }
        }, 2000);
    }

    public void VerifyEditTextLuna() {
        if (edit_text_luna.length() > 0) {
            int_edit_text_luna = Integer.parseInt(edit_text_luna.getText().toString());
            if (int_edit_text_luna >= 1 && int_edit_text_luna <= 12 && edit_text_luna.length() == 2) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        edit_text_luna.getBackground().setColorFilter(Color.GREEN, PorterDuff.Mode.SRC_ATOP);
                        edit_text_luna.setTextColor(Color.GREEN);
                    }
                }, 0);

                switch (int_edit_text_luna) {
                    case 1:
                        txt_arrow_horizontal_luna.setText("Ianuarie");
                        break;
                    case 2:
                        txt_arrow_horizontal_luna.setText("Februarie");
                        break;
                    case 3:
                        txt_arrow_horizontal_luna.setText("Martie");
                        break;
                    case 4:
                        txt_arrow_horizontal_luna.setText("Aprilie");
                        break;
                    case 5:
                        txt_arrow_horizontal_luna.setText("Mai");
                        break;
                    case 6:
                        txt_arrow_horizontal_luna.setText("Iunie");
                        break;
                    case 7:
                        txt_arrow_horizontal_luna.setText("Iulie");
                        break;
                    case 8:
                        txt_arrow_horizontal_luna.setText("August");
                        break;
                    case 9:
                        txt_arrow_horizontal_luna.setText("Septembrie");
                        break;
                    case 10:
                        txt_arrow_horizontal_luna.setText("Octombrie");
                        break;
                    case 11:
                        txt_arrow_horizontal_luna.setText("Noiembrie");
                        break;
                    case 12:
                        txt_arrow_horizontal_luna.setText("Decembrie");
                        break;
                }
            } else {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        edit_text_luna.getBackground().setColorFilter(Color.RED, PorterDuff.Mode.SRC_ATOP);
                        edit_text_luna.setTextColor(Color.RED);
                    }
                }, 0);
            }
        } else {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    edit_text_luna.getBackground().setColorFilter(Color.RED, PorterDuff.Mode.SRC_ATOP);
                    edit_text_luna.setTextColor(Color.RED);
                }
            }, 0);
        }

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                edit_text_luna.getBackground().setColorFilter(Color.GRAY, PorterDuff.Mode.SRC_ATOP);
                edit_text_luna.setTextColor(Color.BLACK);
            }
        }, 2000);
    }

    public void VerifyEditTextZiua() {
        if (edit_text_ziua.length() > 0) {
            int_edit_text_ziua = Integer.parseInt(edit_text_ziua.getText().toString());
            if (int_edit_text_ziua >= 1 && int_edit_text_ziua <= 31 && edit_text_ziua.length() == 2) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        edit_text_ziua.getBackground().setColorFilter(Color.GREEN, PorterDuff.Mode.SRC_ATOP);
                        edit_text_ziua.setTextColor(Color.GREEN);
                    }
                }, 0);

                txt_arrow_horizontal_ziua.setText(R.string.string_baby);

            } else {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        edit_text_ziua.getBackground().setColorFilter(Color.RED, PorterDuff.Mode.SRC_ATOP);
                        edit_text_ziua.setTextColor(Color.RED);
                    }
                }, 0);
            }
        } else {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    edit_text_ziua.getBackground().setColorFilter(Color.RED, PorterDuff.Mode.SRC_ATOP);
                    edit_text_ziua.setTextColor(Color.RED);
                }
            }, 0);
        }

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                edit_text_ziua.getBackground().setColorFilter(Color.GRAY, PorterDuff.Mode.SRC_ATOP);
                edit_text_ziua.setTextColor(Color.BLACK);
            }
        }, 2000);
    }

    public void VerifyEditTextJudetul() {
        if (edit_text_judetul.length() > 0) {
            int_edit_text_judetul = Integer.parseInt(edit_text_judetul.getText().toString());
            if ((int_edit_text_judetul >= 1 && int_edit_text_judetul <= 46 || (int_edit_text_judetul == 51 || int_edit_text_judetul == 52)) && edit_text_judetul.length() == 2) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        edit_text_judetul.getBackground().setColorFilter(Color.GREEN, PorterDuff.Mode.SRC_ATOP);
                        edit_text_judetul.setTextColor(Color.GREEN);
                    }
                }, 0);

                switch (int_edit_text_judetul) {
                    case 1:
                        txt_arrow_horizontal_judetul.setText("Alba");
                        break;
                    case 2:
                        txt_arrow_horizontal_judetul.setText("Arad");
                        break;
                    case 3:
                        txt_arrow_horizontal_judetul.setText("Argeș");
                        break;
                    case 4:
                        txt_arrow_horizontal_judetul.setText("Bacău");
                        break;
                    case 5:
                        txt_arrow_horizontal_judetul.setText("Bihor");
                        break;
                    case 6:
                        txt_arrow_horizontal_judetul.setText("Bistrița-Năsăud");
                        break;
                    case 7:
                        txt_arrow_horizontal_judetul.setText("Botoșani");
                        break;
                    case 8:
                        txt_arrow_horizontal_judetul.setText("Brașov");
                        break;
                    case 9:
                        txt_arrow_horizontal_judetul.setText("Brăila");
                        break;
                    case 10:
                        txt_arrow_horizontal_judetul.setText("Buzău");
                        break;
                    case 11:
                        txt_arrow_horizontal_judetul.setText("Caraș-Severin");
                        break;
                    case 12:
                        txt_arrow_horizontal_judetul.setText("Cluj");
                        break;
                    case 13:
                        txt_arrow_horizontal_judetul.setText("Constanța");
                        break;
                    case 14:
                        txt_arrow_horizontal_judetul.setText("Covasna");
                        break;
                    case 15:
                        txt_arrow_horizontal_judetul.setText("Dâmbovița");
                        break;
                    case 16:
                        txt_arrow_horizontal_judetul.setText("Dolj");
                        break;
                    case 17:
                        txt_arrow_horizontal_judetul.setText("Galați");
                        break;
                    case 18:
                        txt_arrow_horizontal_judetul.setText("Gorj");
                        break;
                    case 19:
                        txt_arrow_horizontal_judetul.setText("Harghita");
                        break;
                    case 20:
                        txt_arrow_horizontal_judetul.setText("Hunedoara");
                        break;
                    case 21:
                        txt_arrow_horizontal_judetul.setText("Ialomița");
                        break;
                    case 22:
                        txt_arrow_horizontal_judetul.setText("Iași");
                        break;
                    case 23:
                        txt_arrow_horizontal_judetul.setText("Ilfov");
                        break;
                    case 24:
                        txt_arrow_horizontal_judetul.setText("Maramureș");
                        break;
                    case 25:
                        txt_arrow_horizontal_judetul.setText("Mehedinți");
                        break;
                    case 26:
                        txt_arrow_horizontal_judetul.setText("Mureș");
                        break;
                    case 27:
                        txt_arrow_horizontal_judetul.setText("Neamț");
                        break;
                    case 28:
                        txt_arrow_horizontal_judetul.setText("Olt");
                        break;
                    case 29:
                        txt_arrow_horizontal_judetul.setText("Prahova");
                        break;
                    case 30:
                        txt_arrow_horizontal_judetul.setText("Satu Mare");
                        break;
                    case 31:
                        txt_arrow_horizontal_judetul.setText("Sălaj");
                        break;
                    case 32:
                        txt_arrow_horizontal_judetul.setText("Sibiu");
                        break;
                    case 33:
                        txt_arrow_horizontal_judetul.setText("Suceava");
                        break;
                    case 34:
                        txt_arrow_horizontal_judetul.setText("Teleorman");
                        break;
                    case 35:
                        txt_arrow_horizontal_judetul.setText("Timiș");
                        break;
                    case 36:
                        txt_arrow_horizontal_judetul.setText("Tulcea");
                        break;
                    case 37:
                        txt_arrow_horizontal_judetul.setText("Vaslui");
                        break;
                    case 38:
                        txt_arrow_horizontal_judetul.setText("Vâlcea");
                        break;
                    case 39:
                        txt_arrow_horizontal_judetul.setText("Vrancea");
                        break;
                    case 40:
                        txt_arrow_horizontal_judetul.setText("București");
                        break;
                    case 41:
                        txt_arrow_horizontal_judetul.setText("Sector 1");
                        break;
                    case 42:
                        txt_arrow_horizontal_judetul.setText("Sector 2");
                        break;
                    case 43:
                        txt_arrow_horizontal_judetul.setText("Sector 3");
                        break;
                    case 44:
                        txt_arrow_horizontal_judetul.setText("Sector 4");
                        break;
                    case 45:
                        txt_arrow_horizontal_judetul.setText("Sector 5");
                        break;
                    case 46:
                        txt_arrow_horizontal_judetul.setText("Sector 6");
                        break;
                    case 51:
                        txt_arrow_horizontal_judetul.setText("Călărași");
                        break;
                    case 52:
                        txt_arrow_horizontal_judetul.setText("Giurgiu");
                        break;
                }

            } else {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        edit_text_judetul.getBackground().setColorFilter(Color.RED, PorterDuff.Mode.SRC_ATOP);
                        edit_text_judetul.setTextColor(Color.RED);
                    }
                }, 0);
            }
        } else {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    edit_text_judetul.getBackground().setColorFilter(Color.RED, PorterDuff.Mode.SRC_ATOP);
                    edit_text_judetul.setTextColor(Color.RED);
                }
            }, 0);
        }

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                edit_text_judetul.getBackground().setColorFilter(Color.GRAY, PorterDuff.Mode.SRC_ATOP);
                edit_text_judetul.setTextColor(Color.BLACK);
            }
        }, 2000);
    }

    public void VerifyEditTextNumarSecvential(){
        if (edit_text_numar_secvential.length() > 0) {
            int_edit_text_numar_secvential = Integer.parseInt(edit_text_numar_secvential.getText().toString());
            if (int_edit_text_numar_secvential > 1 && edit_text_numar_secvential.length() == 3) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        edit_text_numar_secvential.getBackground().setColorFilter(Color.GREEN, PorterDuff.Mode.SRC_ATOP);
                        edit_text_numar_secvential.setTextColor(Color.GREEN);
                    }
                }, 0);

                txt_arrow_horizontal_numar_secvential.setText(R.string.string_monocle);

            } else {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        edit_text_numar_secvential.getBackground().setColorFilter(Color.RED, PorterDuff.Mode.SRC_ATOP);
                        edit_text_numar_secvential.setTextColor(Color.RED);
                    }
                }, 0);
            }
        }
        else {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    edit_text_numar_secvential.getBackground().setColorFilter(Color.RED, PorterDuff.Mode.SRC_ATOP);
                    edit_text_numar_secvential.setTextColor(Color.RED);
                }
            }, 0);
        }

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                edit_text_numar_secvential.getBackground().setColorFilter(Color.GRAY, PorterDuff.Mode.SRC_ATOP);
                edit_text_numar_secvential.setTextColor(Color.BLACK);
            }
        }, 2000);
    }

    public void VerifyEditTextCifraDeControl(){
        CalculeazaCifraDeControl();

        if (edit_text_cifra_de_control.length() > 0) {
            int_edit_text_cifra_de_control = Integer.parseInt(edit_text_cifra_de_control.getText().toString());
            if (edit_text_cifra_de_control.length() == 1 && int_edit_text_cifra_de_control  == int_calcul_cifra_de_control) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        edit_text_cifra_de_control.getBackground().setColorFilter(Color.GREEN, PorterDuff.Mode.SRC_ATOP);
                        edit_text_cifra_de_control.setTextColor(Color.GREEN);
                    }
                }, 0);

                txt_arrow_horizontal_cifra_de_control.setText(R.string.string_sunglasses);

            } else {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        edit_text_cifra_de_control.getBackground().setColorFilter(Color.RED, PorterDuff.Mode.SRC_ATOP);
                        edit_text_cifra_de_control.setTextColor(Color.RED);
                    }
                }, 0);
            }
        }
        else {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    edit_text_cifra_de_control.getBackground().setColorFilter(Color.RED, PorterDuff.Mode.SRC_ATOP);
                    edit_text_cifra_de_control.setTextColor(Color.RED);
                }
            }, 0);
        }

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                edit_text_cifra_de_control.getBackground().setColorFilter(Color.GRAY, PorterDuff.Mode.SRC_ATOP);
                edit_text_cifra_de_control.setTextColor(Color.BLACK);
            }
        }, 2000);
    }

    public void CalculeazaCifraDeControl() {
        if (edit_text_sexul.length() == 1 && edit_text_anul.length() == 2 && edit_text_luna.length() == 2 && edit_text_ziua.length() == 2 && edit_text_judetul.length() == 2 && edit_text_numar_secvential.length() == 3) {
            int_edit_text_sexul = Integer.parseInt(edit_text_sexul.getText().toString());
            int_edit_text_anul = Integer.parseInt(edit_text_anul.getText().toString());
            int_edit_text_luna = Integer.parseInt(edit_text_luna.getText().toString());
            int_edit_text_ziua = Integer.parseInt(edit_text_ziua.getText().toString());
            int_edit_text_judetul = Integer.parseInt(edit_text_judetul.getText().toString());
            int_edit_text_numar_secvential = Integer.parseInt(edit_text_numar_secvential.getText().toString());

            // Calcul pentru 2 7 9 1 4 6 3 5 8 2 7 9
            int_calcul_sexul = int_edit_text_sexul * 2;

            int_calcul_an_1 = Integer.parseInt(String.valueOf(edit_text_anul.getText().toString().charAt(0))) * 7;
            int_calcul_an_2 = Integer.parseInt(String.valueOf(edit_text_anul.getText().toString().charAt(1))) * 9;

            int_calcul_luna_1 = Integer.parseInt(String.valueOf(edit_text_luna.getText().toString().charAt(0))) * 1;
            int_calcul_luna_2 = Integer.parseInt(String.valueOf(edit_text_luna.getText().toString().charAt(1))) * 4;

            int_calcul_ziua_1 = Integer.parseInt(String.valueOf(edit_text_ziua.getText().toString().charAt(0))) * 6;
            int_calcul_ziua_2 = Integer.parseInt(String.valueOf(edit_text_ziua.getText().toString().charAt(1))) * 3;

            int_calcul_judet_1 = Integer.parseInt(String.valueOf(edit_text_judetul.getText().toString().charAt(0))) * 5;
            int_calcul_judet_2 = Integer.parseInt(String.valueOf(edit_text_judetul.getText().toString().charAt(1))) * 8;

            int_calcul_nr_secvential_1 = Integer.parseInt(String.valueOf(edit_text_numar_secvential.getText().toString().charAt(0))) * 2;
            int_calcul_nr_secvential_2 = Integer.parseInt(String.valueOf(edit_text_numar_secvential.getText().toString().charAt(1))) * 7;
            int_calcul_nr_secvential_3 = Integer.parseInt(String.valueOf(edit_text_numar_secvential.getText().toString().charAt(2))) * 9;

            int_calcul_cifra_de_control = (
                    int_calcul_sexul + int_calcul_an_1 + int_calcul_an_2 + int_calcul_luna_1 + int_calcul_luna_2 + int_calcul_ziua_1 + int_calcul_ziua_2 +
                            int_calcul_judet_1 + int_calcul_judet_2 + int_calcul_nr_secvential_1 + int_calcul_nr_secvential_2 + int_calcul_nr_secvential_3
                    ) % 11 ;

           if (int_calcul_cifra_de_control == 10) {
                int_calcul_cifra_de_control = 1;
            }
        }
    }

    public void GoToQuestionMarkActivity(View v){
        Intent goToQuestionMarkActivity = new Intent(MainActivity.this, InformationSignActivity.class);

        Pair[] pairs = new Pair[1];

        pairs[0] = new Pair<View, String>(btn_information_sign, "informationTransition");

        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this, pairs);
        startActivity(goToQuestionMarkActivity, options.toBundle());

    }

    public void GoToExclamationMarkActivity(View v){
        Intent goToExclamationMarkActivity = new Intent(MainActivity.this, ExclamationMarkActivity.class);

        Pair[] pairs = new Pair[1];

        pairs[0] = new Pair<View, String>(btn_exclamation_mark, "exclamationTransition");

        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this, pairs);
        startActivity(goToExclamationMarkActivity, options.toBundle());

    }

    public void ScaleDownAndUpAnimations() {
        // Special guest | Animation for edit_text_sexul
        scaleDown_Sexul = AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_Sexul.setTarget(edit_text_sexul);

        scaleUp_Sexul = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_Sexul = new AnimatorSet();
        setDownAndUp_Sexul.playSequentially(scaleDown_Sexul, scaleUp_Sexul);

        // Special guest | Animation for edit_text_sexul
        scaleDown_Anul = AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_Anul.setTarget(edit_text_anul);

        scaleUp_Anul = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_Anul = new AnimatorSet();
        setDownAndUp_Anul.playSequentially(scaleDown_Anul, scaleUp_Anul);

        // Special guest | Animation for edit_text_luna
        scaleDown_Luna = AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_Luna.setTarget(edit_text_luna);

        scaleUp_Luna = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_Luna = new AnimatorSet();
        setDownAndUp_Luna.playSequentially(scaleDown_Luna, scaleUp_Luna);

        // Special guest | Animation for edit_text_ziua
        scaleDown_Ziua = AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_Ziua.setTarget(edit_text_ziua);

        scaleUp_Ziua = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_Ziua = new AnimatorSet();
        setDownAndUp_Ziua.playSequentially(scaleDown_Ziua, scaleUp_Ziua);

        // Special guest | Animation for edit_text_judetul
        scaleDown_Judetul = AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_Judetul.setTarget(edit_text_judetul);

        scaleUp_Judetul = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_Judetul = new AnimatorSet();
        setDownAndUp_Judetul.playSequentially(scaleDown_Judetul, scaleUp_Judetul);

        // Special guest | Animation for edit_text_numar_secvential
        scaleDown_NumarSecvential = AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_NumarSecvential.setTarget(edit_text_numar_secvential);

        scaleUp_NumarSecvential = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_NumarSecvential = new AnimatorSet();
        setDownAndUp_NumarSecvential.playSequentially(scaleDown_NumarSecvential, scaleUp_NumarSecvential);

        // Special guest | Animation for edit_text_cifra_de_control
        scaleDown_CifraDeControl = AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_CifraDeControl.setTarget(edit_text_cifra_de_control);

        scaleUp_CifraDeControl = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_CifraDeControl = new AnimatorSet();
        setDownAndUp_CifraDeControl.playSequentially(scaleDown_CifraDeControl, scaleUp_CifraDeControl);

        // Animations order
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                setDownAndUp_Ziua.start();
                edit_text_ziua.setVisibility(View.VISIBLE);
            }
        }, 200);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                setDownAndUp_Luna.start();
                setDownAndUp_Judetul.start();

                edit_text_luna.setVisibility(View.VISIBLE);
                edit_text_judetul.setVisibility(View.VISIBLE);
            }
        }, 400);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                setDownAndUp_Anul.start();
                setDownAndUp_NumarSecvential.start();

                edit_text_anul.setVisibility(View.VISIBLE);
                edit_text_numar_secvential.setVisibility(View.VISIBLE);
            }
        }, 600);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                setDownAndUp_Sexul.start();
                setDownAndUp_CifraDeControl.start();

                edit_text_sexul.setVisibility(View.VISIBLE);
                edit_text_cifra_de_control.setVisibility(View.VISIBLE);
            }
        }, 800);
    }

    public void GoToTheNewLayout() {
        // New Layout
        TransitionManager.beginDelayedTransition(mainLayout);

        // S conditions
        VerifyEditTextSexul();

        // AA conditions
        VerifyEditTextAnul();

        // LL conditions
        VerifyEditTextLuna();

        // ZZ conditions
        VerifyEditTextZiua();

        // JJ conditions
        VerifyEditTextJudetul();

        // NNN conditions
        VerifyEditTextNumarSecvential();

        // C conditions
        VerifyEditTextCifraDeControl();

        // Works only when all edit texts are green... otherwise not
        if ((int_edit_text_sexul >= 1 && int_edit_text_sexul <= 8) &&
                (edit_text_anul.length() == 2) &&
                (int_edit_text_luna >= 1 && int_edit_text_luna <= 12 && edit_text_luna.length() == 2) &&
                (int_edit_text_ziua >= 1 && int_edit_text_ziua <= 31 && edit_text_ziua.length() == 2) &&
                ((int_edit_text_judetul >= 1 && int_edit_text_judetul <= 46 || (int_edit_text_judetul == 51 || int_edit_text_judetul == 52)) && edit_text_judetul.length() == 2) &&
                (int_edit_text_numar_secvential > 1 && edit_text_numar_secvential.length() == 3) &&
                (edit_text_cifra_de_control.length() == 1 && int_edit_text_cifra_de_control  == int_calcul_cifra_de_control)
        ) {

            if (!verificareIsClicked) {
                constraintSetActivityNEW.applyTo(mainLayout);
                verificareIsClicked = true;

                edit_text_sexul.setEnabled(false);
                edit_text_anul.setEnabled(false);
                edit_text_luna.setEnabled(false);
                edit_text_ziua.setEnabled(false);
                edit_text_judetul.setEnabled(false);
                edit_text_numar_secvential.setEnabled(false);
                edit_text_cifra_de_control.setEnabled(false);

                txt_introduceti_cnp.setVisibility(View.INVISIBLE);
                btn_refresh.setVisibility(View.INVISIBLE);
                btn_verificare.setText(R.string.str_home);

                txt_arrow_sexul.setVisibility(View.VISIBLE);
                txt_arrow_anul.setVisibility(View.VISIBLE);
                txt_arrow_luna.setVisibility(View.VISIBLE);
                txt_arrow_ziua.setVisibility(View.VISIBLE);
                txt_arrow_judetul.setVisibility(View.VISIBLE);
                txt_arrow_numar_secvential.setVisibility(View.VISIBLE);
                txt_arrow_cifra_de_control.setVisibility(View.VISIBLE);

                handler1 = new Handler();
                runnable1 = new Runnable() {
                    @Override
                    public void run() {
                        txt_arrow_horizontal_sexul.setVisibility(View.VISIBLE);
                    }
                };
                handler1.postDelayed(runnable1, 1000);

                handler2 = new Handler();
                runnable2 = new Runnable() {
                    @Override
                    public void run() {
                        txt_arrow_horizontal_anul.setVisibility(View.VISIBLE);
                    }
                };
                handler2.postDelayed(runnable2, 1200);

                handler3 = new Handler();
                runnable3 = new Runnable() {
                    @Override
                    public void run() {
                        txt_arrow_horizontal_luna.setVisibility(View.VISIBLE);
                    }
                };
                handler3.postDelayed(runnable3, 1400);

                handler4 = new Handler();
                runnable4 = new Runnable() {
                    @Override
                    public void run() {
                        txt_arrow_horizontal_ziua.setVisibility(View.VISIBLE);
                    }
                };
                handler4.postDelayed(runnable4, 1600);

                handler5 = new Handler();
                runnable5 = new Runnable() {
                    @Override
                    public void run() {
                        txt_arrow_horizontal_judetul.setVisibility(View.VISIBLE);
                    }
                };
                handler5.postDelayed(runnable5, 1800);

                handler6 = new Handler();
                runnable6 = new Runnable() {
                    @Override
                    public void run() {
                        txt_arrow_horizontal_numar_secvential.setVisibility(View.VISIBLE);
                    }
                };
                handler6.postDelayed(runnable6, 2000);

                handler7 = new Handler();
                runnable7 = new Runnable() {
                    @Override
                    public void run() {
                        txt_arrow_horizontal_cifra_de_control.setVisibility(View.VISIBLE);
                    }
                };
                handler7.postDelayed(runnable7, 2200);

            } else {
                constraintSetActivityOLD.applyTo(mainLayout);
                verificareIsClicked = false;

                handler1.removeCallbacksAndMessages(null);
                handler2.removeCallbacksAndMessages(null);
                handler3.removeCallbacksAndMessages(null);
                handler4.removeCallbacksAndMessages(null);
                handler5.removeCallbacksAndMessages(null);
                handler6.removeCallbacksAndMessages(null);
                handler7.removeCallbacksAndMessages(null);

                edit_text_sexul.setEnabled(true);
                edit_text_anul.setEnabled(true);
                edit_text_luna.setEnabled(true);
                edit_text_ziua.setEnabled(true);
                edit_text_judetul.setEnabled(true);
                edit_text_numar_secvential.setEnabled(true);
                edit_text_cifra_de_control.setEnabled(true);

                txt_introduceti_cnp.setVisibility(View.VISIBLE);
                btn_refresh.setVisibility(View.VISIBLE);
                btn_verificare.setText(R.string.str_verifica_semn);

                btn_information_sign.setVisibility(View.VISIBLE);
                btn_exclamation_mark.setVisibility(View.VISIBLE);

                edit_text_sexul.setVisibility(View.VISIBLE);
                edit_text_anul.setVisibility(View.VISIBLE);
                edit_text_luna.setVisibility(View.VISIBLE);
                edit_text_ziua.setVisibility(View.VISIBLE);
                edit_text_judetul.setVisibility(View.VISIBLE);
                edit_text_numar_secvential.setVisibility(View.VISIBLE);
                edit_text_cifra_de_control.setVisibility(View.VISIBLE);

                txt_arrow_sexul.setVisibility(View.INVISIBLE);
                txt_arrow_anul.setVisibility(View.INVISIBLE);
                txt_arrow_luna.setVisibility(View.INVISIBLE);
                txt_arrow_ziua.setVisibility(View.INVISIBLE);
                txt_arrow_judetul.setVisibility(View.INVISIBLE);
                txt_arrow_numar_secvential.setVisibility(View.INVISIBLE);
                txt_arrow_cifra_de_control.setVisibility(View.INVISIBLE);

                txt_arrow_horizontal_sexul.setVisibility(View.INVISIBLE);
                txt_arrow_horizontal_anul.setVisibility(View.INVISIBLE);
                txt_arrow_horizontal_luna.setVisibility(View.INVISIBLE);
                txt_arrow_horizontal_ziua.setVisibility(View.INVISIBLE);
                txt_arrow_horizontal_judetul.setVisibility(View.INVISIBLE);
            }
        }

    }

    public void OnTxtArrowHorizontalClick_Sexul(View view) {

        //Set Tooltip
        TooltipCompat.setTooltipText(txt_arrow_horizontal_sexul,"Sexul");

        txt_arrow_horizontal_sexul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_arrow_horizontal_sexul.performLongClick();

            }
        });

    }

    public void OnTxtArrowHorizontalClick_Anul(View view) {

        //Set Tooltip
        txt_arrow_horizontal_anul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_arrow_horizontal_anul.performLongClick();

                if (edit_text_sexul.length() > 0) {
                    int_edit_text_sexul = Integer.parseInt(edit_text_sexul.getText().toString());
                    if (int_edit_text_sexul == 7) {
                        TooltipCompat.setTooltipText(txt_arrow_horizontal_anul,"Cetățean al altei țări");
                        txt_arrow_horizontal_anul.performLongClick();

                    } else if (int_edit_text_sexul == 8) {
                        TooltipCompat.setTooltipText(txt_arrow_horizontal_anul,"Cetățeană a altei țări");
                        txt_arrow_horizontal_anul.performLongClick();

                    } else {
                        TooltipCompat.setTooltipText(txt_arrow_horizontal_anul,"Anul nașterii");
                        txt_arrow_horizontal_anul.performLongClick();

                    }
                }
            }
        });

    }

    public void OnTxtArrowHorizontalClick_Luna(View view) {

        //Set Tooltip
        TooltipCompat.setTooltipText(txt_arrow_horizontal_luna,"Luna nașterii");

        txt_arrow_horizontal_luna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_arrow_horizontal_luna.performLongClick();
            }
        });

    }

    public void OnTxtArrowHorizontalClick_Ziua(View view) {

        //Set Tooltip
        TooltipCompat.setTooltipText(txt_arrow_horizontal_ziua,"Ziua nașterii");

        txt_arrow_horizontal_ziua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_arrow_horizontal_ziua.performLongClick();
            }
        });

    }

    public void OnTxtArrowHorizontalClick_Judetul(View view) {

        //Set Tooltip
        TooltipCompat.setTooltipText(txt_arrow_horizontal_judetul,"Județul (sectorul) nașterii");

        txt_arrow_horizontal_judetul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_arrow_horizontal_judetul.performLongClick();
            }
        });

    }

    public void OnTxtArrowHorizontalClick_Numar_Secvential(View view) {

        //Set Tooltip
        TooltipCompat.setTooltipText(txt_arrow_horizontal_numar_secvential,"Numărul secvențial");

        txt_arrow_horizontal_numar_secvential.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_arrow_horizontal_numar_secvential.performLongClick();
            }
        });

    }

    public void OnTxtArrowHorizontalClick_Cifra_De_Control(View view) {

        //Set Tooltip
        TooltipCompat.setTooltipText(txt_arrow_horizontal_cifra_de_control,"Cifra de control");

        txt_arrow_horizontal_cifra_de_control.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_arrow_horizontal_cifra_de_control.performLongClick();
            }
        });

    }
}