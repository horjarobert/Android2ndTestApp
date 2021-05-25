package com.stufflex.verificatorcnp;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Handler;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {

    // Declarations
    private TextView txt_introduceti_cnp, txt_reimprospatare;
    private EditText edit_text_sexul, edit_text_anul, edit_text_luna, edit_text_ziua, edit_text_judetul, edit_text_numar_secvential, edit_text_cifra_de_control;
    private Button btn_question_mark, btn_exclamation_mark, btn_verificare, btn_refresh;
    private ConstraintLayout mainLayout;

    private static final long TOAST_TIMEOUT_MS = 2000;
    private static long lastToastTime = 0;

    private int int_edit_text_sexul, int_edit_text_anul, int_edit_text_luna, int_edit_text_ziua, int_edit_text_judetul, int_edit_text_numar_secvential, int_edit_text_cifra_de_control;
    private int int_calcul_sexul, int_calcul_an_1, int_calcul_an_2, int_calcul_luna_1, int_calcul_luna_2, int_calcul_ziua_1, int_calcul_ziua_2, int_calcul_judet_1, int_calcul_judet_2,
                int_calcul_nr_secvential_1, int_calcul_nr_secvential_2, int_calcul_nr_secvential_3, int_calcul_cifra_de_control;

    private float float_calcul_cifra_de_control;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Navbar-fullscreen
        hideNavigationBar();

        // Initializations
        txt_introduceti_cnp = findViewById(R.id.txt_introduceti_cnp);
        txt_reimprospatare = findViewById(R.id.txt_reimprospatare);

        edit_text_sexul = findViewById(R.id.edit_text_sexul);
        edit_text_anul = findViewById(R.id.edit_text_anul);
        edit_text_luna = findViewById(R.id.edit_text_luna);
        edit_text_ziua = findViewById(R.id.edit_text_ziua);
        edit_text_judetul = findViewById(R.id.edit_text_judetul);
        edit_text_numar_secvential = findViewById(R.id.edit_text_numar_secvential);
        edit_text_cifra_de_control = findViewById(R.id.edit_text_cifra_de_control);

        btn_question_mark = findViewById(R.id.btn_question_mark);
        btn_exclamation_mark = findViewById(R.id.btn_exclamation_mark);
        btn_verificare = findViewById(R.id.btn_verificare);
        btn_refresh = findViewById(R.id.btn_refresh);

        mainLayout = findViewById(R.id.mainLayout);

        // Hide this
        txt_reimprospatare.setVisibility(View.INVISIBLE);

        // Fullscreen
        mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Navbar-fullscreen
                hideNavigationBar();
            }
        });

        // Reîmprospătare
        btn_refresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edit_text_sexul.length() > 0 || edit_text_anul.length() > 0 || edit_text_luna.length() > 0 || edit_text_ziua.length() > 0 ||
                        edit_text_judetul.length() > 0 || edit_text_numar_secvential.length() > 0 || edit_text_cifra_de_control.length() > 0) {

                    edit_text_sexul.setText("");
                    edit_text_anul.setText("");
                    edit_text_luna.setText("");
                    edit_text_ziua.setText("");
                    edit_text_judetul.setText("");
                    edit_text_numar_secvential.setText("");
                    edit_text_cifra_de_control.setText("");

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
    }

    // Refresh the app - clear all edit text boxes
    public void Reimprospatare() {

        txt_reimprospatare.setVisibility(View.VISIBLE);

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
                }
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
                }
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
                }
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
                }
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
                }
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
            if (edit_text_numar_secvential.length() == 3) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        edit_text_numar_secvential.getBackground().setColorFilter(Color.GREEN, PorterDuff.Mode.SRC_ATOP);
                        edit_text_numar_secvential.setTextColor(Color.GREEN);
                    }
                }, 0);
            } else {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        edit_text_judetul.getBackground().setColorFilter(Color.RED, PorterDuff.Mode.SRC_ATOP);
                        edit_text_judetul.setTextColor(Color.RED);
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
}