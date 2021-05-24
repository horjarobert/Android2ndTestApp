package com.stufflex.verificatorcnp;

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

public class MainActivity extends AppCompatActivity {

    // Declarations
    private TextView txt_introduceti_cnp, txt_reimprospatare;
    private EditText edit_text_sexul, edit_text_anul, edit_text_luna, edit_text_ziua, edit_text_judetul, edit_text_numar_secvential, edit_text_cifra_de_control;
    private Button btn_question_mark, btn_exclamation_mark, btn_verificare, btn_refresh;
    private ConstraintLayout mainLayout;

    private static final long TOAST_TIMEOUT_MS = 2000;
    private static long lastToastTime = 0;

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

    public void FocusOnNextEditText(){
        edit_text_sexul.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(edit_text_sexul.length() == 1) {
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
                if(edit_text_anul.length() == 2) {
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
                if(edit_text_luna.length() == 2) {
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
                if(edit_text_ziua.length() == 2) {
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
                if(edit_text_judetul.length() == 2) {
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
                if(edit_text_numar_secvential.length() == 3) {
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
}