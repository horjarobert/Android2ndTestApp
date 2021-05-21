package com.stufflex.verificatorcnp;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    // Declarations
    private TextView txt_letter_V;
    private TextView txt_letter_e;
    private TextView txt_letter_r_1;
    private TextView txt_letter_i_1;
    private TextView txt_letter_f;
    private TextView txt_letter_i_2;
    private TextView txt_letter_c;
    private TextView txt_letter_a;
    private TextView txt_letter_t;
    private TextView txt_letter_o;
    private TextView txt_letter_r_2;

    private Handler handler_letter_V;
    private Handler handler_letter_e;
    private Handler handler_letter_r_1;
    private Handler handler_letter_i_1;
    private Handler handler_letter_f;
    private Handler handler_letter_i_2;
    private Handler handler_letter_c;
    private Handler handler_letter_a;
    private Handler handler_letter_t;
    private Handler handler_letter_o;
    private Handler handler_letter_r_2;

    private Runnable runnable_letter_V;
    private Runnable runnable_letter_e;
    private Runnable runnable_letter_r_1;
    private Runnable runnable_letter_i_1;
    private Runnable runnable_letter_f;
    private Runnable runnable_letter_i_2;
    private Runnable runnable_letter_c;
    private Runnable runnable_letter_a;
    private Runnable runnable_letter_t;
    private Runnable runnable_letter_o;
    private Runnable runnable_letter_r_2;

    private Animation anim_letter_V;
    private Animation anim_letter_e;
    private Animation anim_letter_r_1;
    private Animation anim_letter_i_1;
    private Animation anim_letter_f;
    private Animation anim_letter_i_2;
    private Animation anim_letter_c;
    private Animation anim_letter_a;
    private Animation anim_letter_t;
    private Animation anim_letter_o;
    private Animation anim_letter_r_2;

    private Animation anim_letter_V_up;
    private Animation anim_letter_e_down;
    private Animation anim_letter_r_1_up;
    private Animation anim_letter_i_1_down;
    private Animation anim_letter_f_up;
    private Animation anim_letter_i_2_down;
    private Animation anim_letter_c_up;
    private Animation anim_letter_a_down;
    private Animation anim_letter_t_up;
    private Animation anim_letter_o_down;
    private Animation anim_letter_r_2_up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Navbar-fullscreen
        hideNavigationBar();

        // Initializations
        txt_letter_V = findViewById(R.id.txt_letter_V);
        txt_letter_e = findViewById(R.id.txt_letter_e);
        txt_letter_r_1 = findViewById(R.id.txt_letter_r_1);
        txt_letter_i_1 = findViewById(R.id.txt_letter_i_1);
        txt_letter_f = findViewById(R.id.txt_letter_f);
        txt_letter_i_2 = findViewById(R.id.txt_letter_i_2);
        txt_letter_c = findViewById(R.id.txt_letter_c);
        txt_letter_a = findViewById(R.id.txt_letter_a);
        txt_letter_t = findViewById(R.id.txt_letter_t);
        txt_letter_o = findViewById(R.id.txt_letter_o);
        txt_letter_r_2 = findViewById(R.id.txt_letter_r_2);

        // Hide txt
        txt_letter_V.setVisibility(View.INVISIBLE);
        txt_letter_e.setVisibility(View.INVISIBLE);
        txt_letter_r_1.setVisibility(View.INVISIBLE);
        txt_letter_i_1.setVisibility(View.INVISIBLE);
        txt_letter_f.setVisibility(View.INVISIBLE);
        txt_letter_i_2.setVisibility(View.INVISIBLE);
        txt_letter_c.setVisibility(View.INVISIBLE);
        txt_letter_a.setVisibility(View.INVISIBLE);
        txt_letter_t.setVisibility(View.INVISIBLE);
        txt_letter_o.setVisibility(View.INVISIBLE);
        txt_letter_r_2.setVisibility(View.INVISIBLE);

        // Set animations
        anim_letter_V = AnimationUtils.loadAnimation(this, R.anim.left_to_right);
        anim_letter_e = AnimationUtils.loadAnimation(this, R.anim.left_to_right);
        anim_letter_r_1 = AnimationUtils.loadAnimation(this, R.anim.left_to_right);
        anim_letter_i_1 = AnimationUtils.loadAnimation(this, R.anim.left_to_right);
        anim_letter_f = AnimationUtils.loadAnimation(this, R.anim.left_to_right);
        anim_letter_i_2 = AnimationUtils.loadAnimation(this, R.anim.left_to_right);
        anim_letter_c = AnimationUtils.loadAnimation(this, R.anim.left_to_right);
        anim_letter_a = AnimationUtils.loadAnimation(this, R.anim.left_to_right);
        anim_letter_t = AnimationUtils.loadAnimation(this, R.anim.left_to_right);
        anim_letter_o = AnimationUtils.loadAnimation(this, R.anim.left_to_right);
        anim_letter_r_2 = AnimationUtils.loadAnimation(this, R.anim.left_to_right);

        anim_letter_V_up = AnimationUtils.loadAnimation(this, R.anim.bottom_to_up);
        anim_letter_e_down = AnimationUtils.loadAnimation(this, R.anim.up_to_bottom);
        anim_letter_r_1_up = AnimationUtils.loadAnimation(this, R.anim.bottom_to_up);
        anim_letter_i_1_down = AnimationUtils.loadAnimation(this, R.anim.up_to_bottom);
        anim_letter_f_up = AnimationUtils.loadAnimation(this, R.anim.bottom_to_up);
        anim_letter_i_2_down = AnimationUtils.loadAnimation(this, R.anim.up_to_bottom);
        anim_letter_c_up = AnimationUtils.loadAnimation(this, R.anim.bottom_to_up);
        anim_letter_a_down = AnimationUtils.loadAnimation(this, R.anim.up_to_bottom);
        anim_letter_t_up = AnimationUtils.loadAnimation(this, R.anim.bottom_to_up);
        anim_letter_o_down = AnimationUtils.loadAnimation(this, R.anim.up_to_bottom);
        anim_letter_r_2_up = AnimationUtils.loadAnimation(this, R.anim.bottom_to_up);

        /*
         On show, handler & runnable party
         */

        // First round
        handler_letter_V = new Handler();
        runnable_letter_V = new Runnable() {
            @Override
            public void run() {
                txt_letter_V.setVisibility(View.VISIBLE);
                txt_letter_V.setAnimation(anim_letter_V);
            }
        };
        handler_letter_V.postDelayed(runnable_letter_V, 100);

        handler_letter_e = new Handler();
        runnable_letter_e = new Runnable() {
            @Override
            public void run() {
                txt_letter_e.setVisibility(View.VISIBLE);
                txt_letter_e.setAnimation(anim_letter_e);
            }
        };
        handler_letter_e.postDelayed(runnable_letter_e, 200);

        handler_letter_r_1 = new Handler();
        runnable_letter_r_1 = new Runnable() {
            @Override
            public void run() {
                txt_letter_r_1.setVisibility(View.VISIBLE);
                txt_letter_r_1.setAnimation(anim_letter_r_1);
            }
        };
        handler_letter_r_1.postDelayed(runnable_letter_r_1, 300);

        handler_letter_i_1 = new Handler();
        runnable_letter_i_1 = new Runnable() {
            @Override
            public void run() {
                txt_letter_i_1.setVisibility(View.VISIBLE);
                txt_letter_i_1.setAnimation(anim_letter_i_1);
            }
        };
        handler_letter_i_1.postDelayed(runnable_letter_i_1, 400);

        handler_letter_f = new Handler();
        runnable_letter_f = new Runnable() {
            @Override
            public void run() {
                txt_letter_f.setVisibility(View.VISIBLE);
                txt_letter_f.setAnimation(anim_letter_f);
            }
        };
        handler_letter_f.postDelayed(runnable_letter_f, 500);

        handler_letter_i_2 = new Handler();
        runnable_letter_i_2 = new Runnable() {
            @Override
            public void run() {
                txt_letter_i_2.setVisibility(View.VISIBLE);
                txt_letter_i_2.setAnimation(anim_letter_i_2);
            }
        };
        handler_letter_i_1.postDelayed(runnable_letter_i_2, 600);

        handler_letter_c = new Handler();
        runnable_letter_c = new Runnable() {
            @Override
            public void run() {
                txt_letter_c.setVisibility(View.VISIBLE);
                txt_letter_c.setAnimation(anim_letter_c);
            }
        };
        handler_letter_c.postDelayed(runnable_letter_c, 700);

        handler_letter_a = new Handler();
        runnable_letter_a = new Runnable() {
            @Override
            public void run() {
                txt_letter_a.setVisibility(View.VISIBLE);
                txt_letter_a.setAnimation(anim_letter_a);
            }
        };
        handler_letter_a.postDelayed(runnable_letter_a, 800);

        handler_letter_t = new Handler();
        runnable_letter_t = new Runnable() {
            @Override
            public void run() {
                txt_letter_t.setVisibility(View.VISIBLE);
                txt_letter_t.setAnimation(anim_letter_t);
            }
        };
        handler_letter_t.postDelayed(runnable_letter_t, 900);

        handler_letter_o = new Handler();
        runnable_letter_o = new Runnable() {
            @Override
            public void run() {
                txt_letter_o.setVisibility(View.VISIBLE);
                txt_letter_o.setAnimation(anim_letter_o);
            }
        };
        handler_letter_o.postDelayed(runnable_letter_o, 1000);

        handler_letter_r_2 = new Handler();
        runnable_letter_r_2 = new Runnable() {
            @Override
            public void run() {
                txt_letter_r_2.setVisibility(View.VISIBLE);
                txt_letter_r_2.setAnimation(anim_letter_r_2);
            }
        };
        handler_letter_r_2.postDelayed(runnable_letter_r_2, 1100);

        // Second round, without handler & runnable names
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txt_letter_V.setAnimation(anim_letter_V_up);

            }
        }, 1500);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txt_letter_V.setVisibility(View.INVISIBLE);

            }
        }, 1500);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txt_letter_e.setAnimation(anim_letter_e_down);

            }
        }, 1600);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txt_letter_e.setVisibility(View.INVISIBLE);

            }
        }, 1600);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txt_letter_r_1.setAnimation(anim_letter_r_1_up);

            }
        }, 1700);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txt_letter_r_1.setVisibility(View.INVISIBLE);

            }
        }, 1700);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txt_letter_i_1.setAnimation(anim_letter_i_1_down);

            }
        }, 1800);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txt_letter_i_1.setVisibility(View.INVISIBLE);

            }
        }, 1800);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txt_letter_f.setAnimation(anim_letter_f_up);

            }
        }, 1900);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txt_letter_f.setVisibility(View.INVISIBLE);

            }
        }, 1900);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txt_letter_i_2.setAnimation(anim_letter_i_2_down);

            }
        }, 2000);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txt_letter_i_2.setVisibility(View.INVISIBLE);

            }
        }, 2000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txt_letter_c.setAnimation(anim_letter_c_up);

            }
        }, 2100);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txt_letter_c.setVisibility(View.INVISIBLE);

            }
        }, 2100);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txt_letter_a.setAnimation(anim_letter_a_down);

            }
        }, 2200);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txt_letter_a.setVisibility(View.INVISIBLE);

            }
        }, 2200);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txt_letter_t.setAnimation(anim_letter_t_up);

            }
        }, 2300);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txt_letter_t.setVisibility(View.INVISIBLE);

            }
        }, 2300);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txt_letter_o.setAnimation(anim_letter_o_down);

            }
        }, 2400);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txt_letter_o.setVisibility(View.INVISIBLE);

            }
        }, 2400);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txt_letter_r_2.setAnimation(anim_letter_r_2_up);

            }
        }, 2500);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txt_letter_r_2.setVisibility(View.INVISIBLE);

            }
        }, 2500);

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
}