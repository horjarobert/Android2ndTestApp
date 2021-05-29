package com.stufflex.verificatorcnp;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Intent;
import android.os.Handler;
import android.support.constraint.ConstraintLayout;
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

    private TextView txt_letter_cnp_C;
    private TextView txt_letter_cnp_N;
    private TextView txt_letter_cnp_P;

    private TextView txt_by_Stufflex;

    private TextView txt_a_1, txt_a_2, txt_a_3, txt_a_4, txt_a_5, txt_a_6, txt_a_7, txt_a_8, txt_a_9, txt_a_10;
    private TextView txt_b_1, txt_b_2, txt_b_3, txt_b_4, txt_b_5, txt_b_6, txt_b_7, txt_b_8, txt_b_9, txt_b_10;
    private TextView txt_c_1, txt_c_2, txt_c_3, txt_c_4, txt_c_5, txt_c_6, txt_c_7, txt_c_8, txt_c_9, txt_c_10;
    private TextView txt_d_1, txt_d_2, txt_d_3, txt_d_4, txt_d_5, txt_d_6, txt_d_7, txt_d_8, txt_d_9, txt_d_10;
    private TextView txt_e_1, txt_e_2, txt_e_3, txt_e_4, txt_e_5, txt_e_6, txt_e_7, txt_e_8, txt_e_9, txt_e_10;
    private TextView txt_f_1, txt_f_2, txt_f_3, txt_f_4, txt_f_5, txt_f_6, txt_f_7, txt_f_8, txt_f_9, txt_f_10;
    private TextView txt_g_1, txt_g_2, txt_g_3, txt_g_4, txt_g_5, txt_g_6, txt_g_7, txt_g_8, txt_g_9, txt_g_10;
    private TextView txt_h_1, txt_h_2, txt_h_3, txt_h_4, txt_h_5, txt_h_6, txt_h_7, txt_h_8, txt_h_9, txt_h_10;
    private TextView txt_i_1, txt_i_2, txt_i_3, txt_i_4, txt_i_5, txt_i_6, txt_i_7, txt_i_8, txt_i_9, txt_i_10;
    private TextView txt_j_1, txt_j_2, txt_j_3, txt_j_4, txt_j_5, txt_j_6, txt_j_7, txt_j_8, txt_j_9, txt_j_10;
    private TextView txt_k_1, txt_k_2, txt_k_3, txt_k_4, txt_k_5, txt_k_6, txt_k_7, txt_k_8, txt_k_9, txt_k_10;
    private TextView txt_l_1, txt_l_2, txt_l_3, txt_l_4, txt_l_5, txt_l_6, txt_l_7, txt_l_8, txt_l_9, txt_l_10;
    private TextView txt_m_1, txt_m_2, txt_m_3, txt_m_4, txt_m_5, txt_m_6, txt_m_7, txt_m_8, txt_m_9, txt_m_10;
    private TextView txt_n_1, txt_n_2, txt_n_3, txt_n_4, txt_n_5, txt_n_6, txt_n_7, txt_n_8, txt_n_9, txt_n_10;
    private TextView txt_o_1, txt_o_2, txt_o_3, txt_o_4, txt_o_5, txt_o_6, txt_o_7, txt_o_8, txt_o_9, txt_o_10;
    private TextView txt_p_1, txt_p_2, txt_p_3, txt_p_4, txt_p_5, txt_p_6, txt_p_7, txt_p_8, txt_p_9, txt_p_10;
    private TextView txt_q_1, txt_q_2, txt_q_3, txt_q_4, txt_q_5, txt_q_6, txt_q_7, txt_q_8, txt_q_9, txt_q_10;
    private TextView txt_r_1, txt_r_2, txt_r_3, txt_r_4, txt_r_5, txt_r_6, txt_r_7, txt_r_8, txt_r_9, txt_r_10;
    private TextView txt_s_1, txt_s_2, txt_s_3, txt_s_4, txt_s_5, txt_s_6, txt_s_7, txt_s_8, txt_s_9, txt_s_10;
    private TextView txt_t_1, txt_t_2, txt_t_3, txt_t_4, txt_t_5, txt_t_6, txt_t_7, txt_t_8, txt_t_9, txt_t_10;

    private ConstraintLayout splashLayout;
    private ConstraintLayout clickToEndLayout;

    private Handler handler_letter_V, handler_letter_e, handler_letter_r_1, handler_letter_i_1, handler_letter_f, handler_letter_i_2,
                    handler_letter_c, handler_letter_a, handler_letter_t, handler_letter_o, handler_letter_r_2, handler_special;

    private Runnable runnable_letter_V, runnable_letter_e, runnable_letter_r_1, runnable_letter_i_1, runnable_letter_f, runnable_letter_i_2,
                     runnable_letter_c, runnable_letter_a, runnable_letter_t, runnable_letter_o, runnable_letter_r_2, runnable_special;

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

    private AnimatorSet setDownAndUp_C;
    private AnimatorSet setDownAndUp_N;
    private AnimatorSet setDownAndUp_P;

    private AnimatorSet setDownAndUp_txt_b_2, setDownAndUp_txt_b_3, setDownAndUp_txt_b_4, setDownAndUp_txt_b_5, setDownAndUp_txt_b_6, setDownAndUp_txt_b_7,setDownAndUp_txt_b_8, setDownAndUp_txt_b_9;
    private AnimatorSet setDownAndUp_txt_c_2, setDownAndUp_txt_c_3, setDownAndUp_txt_c_4, setDownAndUp_txt_c_5, setDownAndUp_txt_c_6, setDownAndUp_txt_c_7,setDownAndUp_txt_c_8, setDownAndUp_txt_c_9;
    private AnimatorSet setDownAndUp_txt_d_2, setDownAndUp_txt_d_3, setDownAndUp_txt_d_4, setDownAndUp_txt_d_5, setDownAndUp_txt_d_6, setDownAndUp_txt_d_7,setDownAndUp_txt_d_8, setDownAndUp_txt_d_9;
    private AnimatorSet setDownAndUp_txt_e_2, setDownAndUp_txt_e_3, setDownAndUp_txt_e_4, setDownAndUp_txt_e_5, setDownAndUp_txt_e_6, setDownAndUp_txt_e_7,setDownAndUp_txt_e_8, setDownAndUp_txt_e_9;
    private AnimatorSet setDownAndUp_txt_f_2, setDownAndUp_txt_f_3, setDownAndUp_txt_f_4, setDownAndUp_txt_f_5, setDownAndUp_txt_f_6, setDownAndUp_txt_f_7,setDownAndUp_txt_f_8, setDownAndUp_txt_f_9;
    private AnimatorSet setDownAndUp_txt_g_2, setDownAndUp_txt_g_3, setDownAndUp_txt_g_4, setDownAndUp_txt_g_5, setDownAndUp_txt_g_6, setDownAndUp_txt_g_7,setDownAndUp_txt_g_8, setDownAndUp_txt_g_9;
    private AnimatorSet setDownAndUp_txt_h_2, setDownAndUp_txt_h_3, setDownAndUp_txt_h_4, setDownAndUp_txt_h_5, setDownAndUp_txt_h_6, setDownAndUp_txt_h_7,setDownAndUp_txt_h_8, setDownAndUp_txt_h_9;
    private AnimatorSet setDownAndUp_txt_i_2, setDownAndUp_txt_i_3, setDownAndUp_txt_i_4, setDownAndUp_txt_i_5, setDownAndUp_txt_i_6, setDownAndUp_txt_i_7,setDownAndUp_txt_i_8, setDownAndUp_txt_i_9;
    private AnimatorSet setDownAndUp_txt_j_2, setDownAndUp_txt_j_3, setDownAndUp_txt_j_4, setDownAndUp_txt_j_5, setDownAndUp_txt_j_6, setDownAndUp_txt_j_7,setDownAndUp_txt_j_8, setDownAndUp_txt_j_9;
    private AnimatorSet setDownAndUp_txt_k_2, setDownAndUp_txt_k_3, setDownAndUp_txt_k_4, setDownAndUp_txt_k_5, setDownAndUp_txt_k_6, setDownAndUp_txt_k_7,setDownAndUp_txt_k_8, setDownAndUp_txt_k_9;
    private AnimatorSet setDownAndUp_txt_l_2, setDownAndUp_txt_l_3, setDownAndUp_txt_l_4, setDownAndUp_txt_l_5, setDownAndUp_txt_l_6, setDownAndUp_txt_l_7,setDownAndUp_txt_l_8, setDownAndUp_txt_l_9;
    private AnimatorSet setDownAndUp_txt_m_2, setDownAndUp_txt_m_3, setDownAndUp_txt_m_4, setDownAndUp_txt_m_5, setDownAndUp_txt_m_6, setDownAndUp_txt_m_7,setDownAndUp_txt_m_8, setDownAndUp_txt_m_9;
    private AnimatorSet setDownAndUp_txt_n_2, setDownAndUp_txt_n_3, setDownAndUp_txt_n_4, setDownAndUp_txt_n_5, setDownAndUp_txt_n_6, setDownAndUp_txt_n_7,setDownAndUp_txt_n_8, setDownAndUp_txt_n_9;
    private AnimatorSet setDownAndUp_txt_o_2, setDownAndUp_txt_o_3, setDownAndUp_txt_o_4, setDownAndUp_txt_o_5, setDownAndUp_txt_o_6, setDownAndUp_txt_o_7,setDownAndUp_txt_o_8, setDownAndUp_txt_o_9;
    private AnimatorSet setDownAndUp_txt_p_2, setDownAndUp_txt_p_3, setDownAndUp_txt_p_4, setDownAndUp_txt_p_5, setDownAndUp_txt_p_6, setDownAndUp_txt_p_7,setDownAndUp_txt_p_8, setDownAndUp_txt_p_9;
    private AnimatorSet setDownAndUp_txt_q_2, setDownAndUp_txt_q_3, setDownAndUp_txt_q_4, setDownAndUp_txt_q_5, setDownAndUp_txt_q_6, setDownAndUp_txt_q_7,setDownAndUp_txt_q_8, setDownAndUp_txt_q_9;
    private AnimatorSet setDownAndUp_txt_r_2, setDownAndUp_txt_r_3, setDownAndUp_txt_r_4, setDownAndUp_txt_r_5, setDownAndUp_txt_r_6, setDownAndUp_txt_r_7,setDownAndUp_txt_r_8, setDownAndUp_txt_r_9;
    private AnimatorSet setDownAndUp_txt_s_2, setDownAndUp_txt_s_3, setDownAndUp_txt_s_4, setDownAndUp_txt_s_5, setDownAndUp_txt_s_6, setDownAndUp_txt_s_7,setDownAndUp_txt_s_8, setDownAndUp_txt_s_9;

    private Animator scaleDown_C;
    private Animator scaleDown_N;
    private Animator scaleDown_P;

    private Animator scaleDown_txt_b_2, scaleDown_txt_b_3, scaleDown_txt_b_4, scaleDown_txt_b_5, scaleDown_txt_b_6, scaleDown_txt_b_7, scaleDown_txt_b_8, scaleDown_txt_b_9;
    private Animator scaleDown_txt_c_2, scaleDown_txt_c_3, scaleDown_txt_c_4, scaleDown_txt_c_5, scaleDown_txt_c_6, scaleDown_txt_c_7, scaleDown_txt_c_8, scaleDown_txt_c_9;
    private Animator scaleDown_txt_d_2, scaleDown_txt_d_3, scaleDown_txt_d_4, scaleDown_txt_d_5, scaleDown_txt_d_6, scaleDown_txt_d_7, scaleDown_txt_d_8, scaleDown_txt_d_9;
    private Animator scaleDown_txt_e_2, scaleDown_txt_e_3, scaleDown_txt_e_4, scaleDown_txt_e_5, scaleDown_txt_e_6, scaleDown_txt_e_7, scaleDown_txt_e_8, scaleDown_txt_e_9;
    private Animator scaleDown_txt_f_2, scaleDown_txt_f_3, scaleDown_txt_f_4, scaleDown_txt_f_5, scaleDown_txt_f_6, scaleDown_txt_f_7, scaleDown_txt_f_8, scaleDown_txt_f_9;
    private Animator scaleDown_txt_g_2, scaleDown_txt_g_3, scaleDown_txt_g_4, scaleDown_txt_g_5, scaleDown_txt_g_6, scaleDown_txt_g_7, scaleDown_txt_g_8, scaleDown_txt_g_9;
    private Animator scaleDown_txt_h_2, scaleDown_txt_h_3, scaleDown_txt_h_4, scaleDown_txt_h_5, scaleDown_txt_h_6, scaleDown_txt_h_7, scaleDown_txt_h_8, scaleDown_txt_h_9;
    private Animator scaleDown_txt_i_2, scaleDown_txt_i_3, scaleDown_txt_i_4, scaleDown_txt_i_5, scaleDown_txt_i_6, scaleDown_txt_i_7, scaleDown_txt_i_8, scaleDown_txt_i_9;
    private Animator scaleDown_txt_j_2, scaleDown_txt_j_3, scaleDown_txt_j_4, scaleDown_txt_j_5, scaleDown_txt_j_6, scaleDown_txt_j_7, scaleDown_txt_j_8, scaleDown_txt_j_9;
    private Animator scaleDown_txt_k_2, scaleDown_txt_k_3, scaleDown_txt_k_4, scaleDown_txt_k_5, scaleDown_txt_k_6, scaleDown_txt_k_7, scaleDown_txt_k_8, scaleDown_txt_k_9;
    private Animator scaleDown_txt_l_2, scaleDown_txt_l_3, scaleDown_txt_l_4, scaleDown_txt_l_5, scaleDown_txt_l_6, scaleDown_txt_l_7, scaleDown_txt_l_8, scaleDown_txt_l_9;
    private Animator scaleDown_txt_m_2, scaleDown_txt_m_3, scaleDown_txt_m_4, scaleDown_txt_m_5, scaleDown_txt_m_6, scaleDown_txt_m_7, scaleDown_txt_m_8, scaleDown_txt_m_9;
    private Animator scaleDown_txt_n_2, scaleDown_txt_n_3, scaleDown_txt_n_4, scaleDown_txt_n_5, scaleDown_txt_n_6, scaleDown_txt_n_7, scaleDown_txt_n_8, scaleDown_txt_n_9;
    private Animator scaleDown_txt_o_2, scaleDown_txt_o_3, scaleDown_txt_o_4, scaleDown_txt_o_5, scaleDown_txt_o_6, scaleDown_txt_o_7, scaleDown_txt_o_8, scaleDown_txt_o_9;
    private Animator scaleDown_txt_p_2, scaleDown_txt_p_3, scaleDown_txt_p_4, scaleDown_txt_p_5, scaleDown_txt_p_6, scaleDown_txt_p_7, scaleDown_txt_p_8, scaleDown_txt_p_9;
    private Animator scaleDown_txt_q_2, scaleDown_txt_q_3, scaleDown_txt_q_4, scaleDown_txt_q_5, scaleDown_txt_q_6, scaleDown_txt_q_7, scaleDown_txt_q_8, scaleDown_txt_q_9;
    private Animator scaleDown_txt_r_2, scaleDown_txt_r_3, scaleDown_txt_r_4, scaleDown_txt_r_5, scaleDown_txt_r_6, scaleDown_txt_r_7, scaleDown_txt_r_8, scaleDown_txt_r_9;
    private Animator scaleDown_txt_s_2, scaleDown_txt_s_3, scaleDown_txt_s_4, scaleDown_txt_s_5, scaleDown_txt_s_6, scaleDown_txt_s_7, scaleDown_txt_s_8, scaleDown_txt_s_9;

    private Animator scaleUp_C;
    private Animator scaleUp_N;
    private Animator scaleUp_P;

    private Animator scaleUp_txt_b_2, scaleUp_txt_b_3, scaleUp_txt_b_4, scaleUp_txt_b_5, scaleUp_txt_b_6, scaleUp_txt_b_7, scaleUp_txt_b_8, scaleUp_txt_b_9;
    private Animator scaleUp_txt_c_2, scaleUp_txt_c_3, scaleUp_txt_c_4, scaleUp_txt_c_5, scaleUp_txt_c_6, scaleUp_txt_c_7, scaleUp_txt_c_8, scaleUp_txt_c_9;
    private Animator scaleUp_txt_d_2, scaleUp_txt_d_3, scaleUp_txt_d_4, scaleUp_txt_d_5, scaleUp_txt_d_6, scaleUp_txt_d_7, scaleUp_txt_d_8, scaleUp_txt_d_9;
    private Animator scaleUp_txt_e_2, scaleUp_txt_e_3, scaleUp_txt_e_4, scaleUp_txt_e_5, scaleUp_txt_e_6, scaleUp_txt_e_7, scaleUp_txt_e_8, scaleUp_txt_e_9;
    private Animator scaleUp_txt_f_2, scaleUp_txt_f_3, scaleUp_txt_f_4, scaleUp_txt_f_5, scaleUp_txt_f_6, scaleUp_txt_f_7, scaleUp_txt_f_8, scaleUp_txt_f_9;
    private Animator scaleUp_txt_g_2, scaleUp_txt_g_3, scaleUp_txt_g_4, scaleUp_txt_g_5, scaleUp_txt_g_6, scaleUp_txt_g_7, scaleUp_txt_g_8, scaleUp_txt_g_9;
    private Animator scaleUp_txt_h_2, scaleUp_txt_h_3, scaleUp_txt_h_4, scaleUp_txt_h_5, scaleUp_txt_h_6, scaleUp_txt_h_7, scaleUp_txt_h_8, scaleUp_txt_h_9;
    private Animator scaleUp_txt_i_2, scaleUp_txt_i_3, scaleUp_txt_i_4, scaleUp_txt_i_5, scaleUp_txt_i_6, scaleUp_txt_i_7, scaleUp_txt_i_8, scaleUp_txt_i_9;
    private Animator scaleUp_txt_j_2, scaleUp_txt_j_3, scaleUp_txt_j_4, scaleUp_txt_j_5, scaleUp_txt_j_6, scaleUp_txt_j_7, scaleUp_txt_j_8, scaleUp_txt_j_9;
    private Animator scaleUp_txt_k_2, scaleUp_txt_k_3, scaleUp_txt_k_4, scaleUp_txt_k_5, scaleUp_txt_k_6, scaleUp_txt_k_7, scaleUp_txt_k_8, scaleUp_txt_k_9;
    private Animator scaleUp_txt_l_2, scaleUp_txt_l_3, scaleUp_txt_l_4, scaleUp_txt_l_5, scaleUp_txt_l_6, scaleUp_txt_l_7, scaleUp_txt_l_8, scaleUp_txt_l_9;
    private Animator scaleUp_txt_m_2, scaleUp_txt_m_3, scaleUp_txt_m_4, scaleUp_txt_m_5, scaleUp_txt_m_6, scaleUp_txt_m_7, scaleUp_txt_m_8, scaleUp_txt_m_9;
    private Animator scaleUp_txt_n_2, scaleUp_txt_n_3, scaleUp_txt_n_4, scaleUp_txt_n_5, scaleUp_txt_n_6, scaleUp_txt_n_7, scaleUp_txt_n_8, scaleUp_txt_n_9;
    private Animator scaleUp_txt_o_2, scaleUp_txt_o_3, scaleUp_txt_o_4, scaleUp_txt_o_5, scaleUp_txt_o_6, scaleUp_txt_o_7, scaleUp_txt_o_8, scaleUp_txt_o_9;
    private Animator scaleUp_txt_p_2, scaleUp_txt_p_3, scaleUp_txt_p_4, scaleUp_txt_p_5, scaleUp_txt_p_6, scaleUp_txt_p_7, scaleUp_txt_p_8, scaleUp_txt_p_9;
    private Animator scaleUp_txt_q_2, scaleUp_txt_q_3, scaleUp_txt_q_4, scaleUp_txt_q_5, scaleUp_txt_q_6, scaleUp_txt_q_7, scaleUp_txt_q_8, scaleUp_txt_q_9;
    private Animator scaleUp_txt_r_2, scaleUp_txt_r_3, scaleUp_txt_r_4, scaleUp_txt_r_5, scaleUp_txt_r_6, scaleUp_txt_r_7, scaleUp_txt_r_8, scaleUp_txt_r_9;
    private Animator scaleUp_txt_s_2, scaleUp_txt_s_3, scaleUp_txt_s_4, scaleUp_txt_s_5, scaleUp_txt_s_6, scaleUp_txt_s_7, scaleUp_txt_s_8, scaleUp_txt_s_9;

    private boolean isStartingAnimation = false;

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

        txt_letter_cnp_C = findViewById(R.id.txt_letter_cnp_C);
        txt_letter_cnp_N = findViewById(R.id.txt_letter_cnp_N);
        txt_letter_cnp_P = findViewById(R.id.txt_letter_cnp_P);

        txt_by_Stufflex = findViewById(R.id.txt_by_Stufflex);

        txt_a_1 = findViewById(R.id.txt_a_1);
        txt_a_2 = findViewById(R.id.txt_a_2);
        txt_a_3 = findViewById(R.id.txt_a_3);
        txt_a_4 = findViewById(R.id.txt_a_4);
        txt_a_5 = findViewById(R.id.txt_a_5);
        txt_a_6 = findViewById(R.id.txt_a_6);
        txt_a_7 = findViewById(R.id.txt_a_7);
        txt_a_8 = findViewById(R.id.txt_a_8);
        txt_a_9 = findViewById(R.id.txt_a_9);
        txt_a_10 = findViewById(R.id.txt_a_10);

        txt_b_1 = findViewById(R.id.txt_b_1);
        txt_b_2 = findViewById(R.id.txt_b_2);
        txt_b_3 = findViewById(R.id.txt_b_3);
        txt_b_4 = findViewById(R.id.txt_b_4);
        txt_b_5 = findViewById(R.id.txt_b_5);
        txt_b_6 = findViewById(R.id.txt_b_6);
        txt_b_7 = findViewById(R.id.txt_b_7);
        txt_b_8 = findViewById(R.id.txt_b_8);
        txt_b_9 = findViewById(R.id.txt_b_9);
        txt_b_10 = findViewById(R.id.txt_b_10);

        txt_c_1 = findViewById(R.id.txt_c_1);
        txt_c_2 = findViewById(R.id.txt_c_2);
        txt_c_3 = findViewById(R.id.txt_c_3);
        txt_c_4 = findViewById(R.id.txt_c_4);
        txt_c_5 = findViewById(R.id.txt_c_5);
        txt_c_6 = findViewById(R.id.txt_c_6);
        txt_c_7 = findViewById(R.id.txt_c_7);
        txt_c_8 = findViewById(R.id.txt_c_8);
        txt_c_9 = findViewById(R.id.txt_c_9);
        txt_c_10 = findViewById(R.id.txt_c_10);

        txt_d_1 = findViewById(R.id.txt_d_1);
        txt_d_2 = findViewById(R.id.txt_d_2);
        txt_d_3 = findViewById(R.id.txt_d_3);
        txt_d_4 = findViewById(R.id.txt_d_4);
        txt_d_5 = findViewById(R.id.txt_d_5);
        txt_d_6 = findViewById(R.id.txt_d_6);
        txt_d_7 = findViewById(R.id.txt_d_7);
        txt_d_8 = findViewById(R.id.txt_d_8);
        txt_d_9 = findViewById(R.id.txt_d_9);
        txt_d_10 = findViewById(R.id.txt_d_10);

        txt_e_1 = findViewById(R.id.txt_e_1);
        txt_e_2 = findViewById(R.id.txt_e_2);
        txt_e_3 = findViewById(R.id.txt_e_3);
        txt_e_4 = findViewById(R.id.txt_e_4);
        txt_e_5 = findViewById(R.id.txt_e_5);
        txt_e_6 = findViewById(R.id.txt_e_6);
        txt_e_7 = findViewById(R.id.txt_e_7);
        txt_e_8 = findViewById(R.id.txt_e_8);
        txt_e_9 = findViewById(R.id.txt_e_9);
        txt_e_10 = findViewById(R.id.txt_e_10);

        txt_f_1 = findViewById(R.id.txt_f_1);
        txt_f_2 = findViewById(R.id.txt_f_2);
        txt_f_3 = findViewById(R.id.txt_f_3);
        txt_f_4 = findViewById(R.id.txt_f_4);
        txt_f_5 = findViewById(R.id.txt_f_5);
        txt_f_6 = findViewById(R.id.txt_f_6);
        txt_f_7 = findViewById(R.id.txt_f_7);
        txt_f_8 = findViewById(R.id.txt_f_8);
        txt_f_9 = findViewById(R.id.txt_f_9);
        txt_f_10 = findViewById(R.id.txt_f_10);

        txt_g_1 = findViewById(R.id.txt_g_1);
        txt_g_2 = findViewById(R.id.txt_g_2);
        txt_g_3 = findViewById(R.id.txt_g_3);
        txt_g_4 = findViewById(R.id.txt_g_4);
        txt_g_5 = findViewById(R.id.txt_g_5);
        txt_g_6 = findViewById(R.id.txt_g_6);
        txt_g_7 = findViewById(R.id.txt_g_7);
        txt_g_8 = findViewById(R.id.txt_g_8);
        txt_g_9 = findViewById(R.id.txt_g_9);
        txt_g_10 = findViewById(R.id.txt_g_10);

        txt_h_1 = findViewById(R.id.txt_h_1);
        txt_h_2 = findViewById(R.id.txt_h_2);
        txt_h_3 = findViewById(R.id.txt_h_3);
        txt_h_4 = findViewById(R.id.txt_h_4);
        txt_h_5 = findViewById(R.id.txt_h_5);
        txt_h_6 = findViewById(R.id.txt_h_6);
        txt_h_7 = findViewById(R.id.txt_h_7);
        txt_h_8 = findViewById(R.id.txt_h_8);
        txt_h_9 = findViewById(R.id.txt_h_9);
        txt_h_10 = findViewById(R.id.txt_h_10);

        txt_i_1 = findViewById(R.id.txt_i_1);
        txt_i_2 = findViewById(R.id.txt_i_2);
        txt_i_3 = findViewById(R.id.txt_i_3);
        txt_i_4 = findViewById(R.id.txt_i_4);
        txt_i_5 = findViewById(R.id.txt_i_5);
        txt_i_6 = findViewById(R.id.txt_i_6);
        txt_i_7 = findViewById(R.id.txt_i_7);
        txt_i_8 = findViewById(R.id.txt_i_8);
        txt_i_9 = findViewById(R.id.txt_i_9);
        txt_i_10 = findViewById(R.id.txt_i_10);

        txt_j_1 = findViewById(R.id.txt_j_1);
        txt_j_2 = findViewById(R.id.txt_j_2);
        txt_j_3 = findViewById(R.id.txt_j_3);
        txt_j_4 = findViewById(R.id.txt_j_4);
        txt_j_5 = findViewById(R.id.txt_j_5);
        txt_j_6 = findViewById(R.id.txt_j_6);
        txt_j_7 = findViewById(R.id.txt_j_7);
        txt_j_8 = findViewById(R.id.txt_j_8);
        txt_j_9 = findViewById(R.id.txt_j_9);
        txt_j_10 = findViewById(R.id.txt_j_10);

        txt_k_1 = findViewById(R.id.txt_k_1);
        txt_k_2 = findViewById(R.id.txt_k_2);
        txt_k_3 = findViewById(R.id.txt_k_3);
        txt_k_4 = findViewById(R.id.txt_k_4);
        txt_k_5 = findViewById(R.id.txt_k_5);
        txt_k_6 = findViewById(R.id.txt_k_6);
        txt_k_7 = findViewById(R.id.txt_k_7);
        txt_k_8 = findViewById(R.id.txt_k_8);
        txt_k_9 = findViewById(R.id.txt_k_9);
        txt_k_10 = findViewById(R.id.txt_k_10);

        txt_l_1 = findViewById(R.id.txt_l_1);
        txt_l_2 = findViewById(R.id.txt_l_2);
        txt_l_3 = findViewById(R.id.txt_l_3);
        txt_l_4 = findViewById(R.id.txt_l_4);
        txt_l_5 = findViewById(R.id.txt_l_5);
        txt_l_6 = findViewById(R.id.txt_l_6);
        txt_l_7 = findViewById(R.id.txt_l_7);
        txt_l_8 = findViewById(R.id.txt_l_8);
        txt_l_9 = findViewById(R.id.txt_l_9);
        txt_l_10 = findViewById(R.id.txt_l_10);

        txt_m_1 = findViewById(R.id.txt_m_1);
        txt_m_2 = findViewById(R.id.txt_m_2);
        txt_m_3 = findViewById(R.id.txt_m_3);
        txt_m_4 = findViewById(R.id.txt_m_4);
        txt_m_5 = findViewById(R.id.txt_m_5);
        txt_m_6 = findViewById(R.id.txt_m_6);
        txt_m_7 = findViewById(R.id.txt_m_7);
        txt_m_8 = findViewById(R.id.txt_m_8);
        txt_m_9 = findViewById(R.id.txt_m_9);
        txt_m_10 = findViewById(R.id.txt_m_10);

        txt_n_1 = findViewById(R.id.txt_n_1);
        txt_n_2 = findViewById(R.id.txt_n_2);
        txt_n_3 = findViewById(R.id.txt_n_3);
        txt_n_4 = findViewById(R.id.txt_n_4);
        txt_n_5 = findViewById(R.id.txt_n_5);
        txt_n_6 = findViewById(R.id.txt_n_6);
        txt_n_7 = findViewById(R.id.txt_n_7);
        txt_n_8 = findViewById(R.id.txt_n_8);
        txt_n_9 = findViewById(R.id.txt_n_9);
        txt_n_10 = findViewById(R.id.txt_n_10);

        txt_o_1 = findViewById(R.id.txt_o_1);
        txt_o_2 = findViewById(R.id.txt_o_2);
        txt_o_3 = findViewById(R.id.txt_o_3);
        txt_o_4 = findViewById(R.id.txt_o_4);
        txt_o_5 = findViewById(R.id.txt_o_5);
        txt_o_6 = findViewById(R.id.txt_o_6);
        txt_o_7 = findViewById(R.id.txt_o_7);
        txt_o_8 = findViewById(R.id.txt_o_8);
        txt_o_9 = findViewById(R.id.txt_o_9);
        txt_o_10 = findViewById(R.id.txt_o_10);

        txt_p_1 = findViewById(R.id.txt_p_1);
        txt_p_2 = findViewById(R.id.txt_p_2);
        txt_p_3 = findViewById(R.id.txt_p_3);
        txt_p_4 = findViewById(R.id.txt_p_4);
        txt_p_5 = findViewById(R.id.txt_p_5);
        txt_p_6 = findViewById(R.id.txt_p_6);
        txt_p_7 = findViewById(R.id.txt_p_7);
        txt_p_8 = findViewById(R.id.txt_p_8);
        txt_p_9 = findViewById(R.id.txt_p_9);
        txt_p_10 = findViewById(R.id.txt_p_10);

        txt_q_1 = findViewById(R.id.txt_q_1);
        txt_q_2 = findViewById(R.id.txt_q_2);
        txt_q_3 = findViewById(R.id.txt_q_3);
        txt_q_4 = findViewById(R.id.txt_q_4);
        txt_q_5 = findViewById(R.id.txt_q_5);
        txt_q_6 = findViewById(R.id.txt_q_6);
        txt_q_7 = findViewById(R.id.txt_q_7);
        txt_q_8 = findViewById(R.id.txt_q_8);
        txt_q_9 = findViewById(R.id.txt_q_9);
        txt_q_10 = findViewById(R.id.txt_q_10);

        txt_r_1 = findViewById(R.id.txt_r_1);
        txt_r_2 = findViewById(R.id.txt_r_2);
        txt_r_3 = findViewById(R.id.txt_r_3);
        txt_r_4 = findViewById(R.id.txt_r_4);
        txt_r_5 = findViewById(R.id.txt_r_5);
        txt_r_6 = findViewById(R.id.txt_r_6);
        txt_r_7 = findViewById(R.id.txt_r_7);
        txt_r_8 = findViewById(R.id.txt_r_8);
        txt_r_9 = findViewById(R.id.txt_r_9);
        txt_r_10 = findViewById(R.id.txt_r_10);

        txt_s_1 = findViewById(R.id.txt_s_1);
        txt_s_2 = findViewById(R.id.txt_s_2);
        txt_s_3 = findViewById(R.id.txt_s_3);
        txt_s_4 = findViewById(R.id.txt_s_4);
        txt_s_5 = findViewById(R.id.txt_s_5);
        txt_s_6 = findViewById(R.id.txt_s_6);
        txt_s_7 = findViewById(R.id.txt_s_7);
        txt_s_8 = findViewById(R.id.txt_s_8);
        txt_s_9 = findViewById(R.id.txt_s_9);
        txt_s_10 = findViewById(R.id.txt_s_10);

        txt_t_1 = findViewById(R.id.txt_t_1);
        txt_t_2 = findViewById(R.id.txt_t_2);
        txt_t_3 = findViewById(R.id.txt_t_3);
        txt_t_4 = findViewById(R.id.txt_t_4);
        txt_t_5 = findViewById(R.id.txt_t_5);
        txt_t_6 = findViewById(R.id.txt_t_6);
        txt_t_7 = findViewById(R.id.txt_t_7);
        txt_t_8 = findViewById(R.id.txt_t_8);
        txt_t_9 = findViewById(R.id.txt_t_9);
        txt_t_10 = findViewById(R.id.txt_t_10);

        splashLayout = findViewById(R.id.splashLayout);
        clickToEndLayout = findViewById(R.id.clickToEndLayout);

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

        txt_letter_cnp_C.setVisibility(View.INVISIBLE);
        txt_letter_cnp_N.setVisibility(View.INVISIBLE);
        txt_letter_cnp_P.setVisibility(View.INVISIBLE);

        txt_by_Stufflex.setVisibility(View.INVISIBLE);

        TxtsVisibilityNone();

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

        // Special guest | Animation for txt_letter_cnp_C
        scaleDown_C = AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_C.setTarget(txt_letter_cnp_C);

        scaleUp_C = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_C = new AnimatorSet();
        setDownAndUp_C.playSequentially(scaleDown_C, scaleUp_C);

        scaleDown_C.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {
                txt_letter_cnp_C.setLayerType(View.LAYER_TYPE_HARDWARE, null);
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                txt_letter_cnp_C.setLayerType(View.LAYER_TYPE_NONE, null);
            }

            @Override
            public void onAnimationCancel(Animator animator) {
                txt_letter_cnp_C.setLayerType(View.LAYER_TYPE_NONE, null);
            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });

        scaleUp_C.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {
                txt_letter_cnp_C.setLayerType(View.LAYER_TYPE_HARDWARE, null);
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                txt_letter_cnp_C.setLayerType(View.LAYER_TYPE_NONE, null);
            }

            @Override
            public void onAnimationCancel(Animator animator) {
                txt_letter_cnp_C.setLayerType(View.LAYER_TYPE_NONE, null);
            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });

        setDownAndUp_C.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {
                txt_letter_cnp_C.setLayerType(View.LAYER_TYPE_HARDWARE, null);
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                txt_letter_cnp_C.setLayerType(View.LAYER_TYPE_NONE, null);
            }

            @Override
            public void onAnimationCancel(Animator animator) {
                txt_letter_cnp_C.setLayerType(View.LAYER_TYPE_NONE, null);
            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });

        // Special guest | Animation for txt_letter_cnp_N
        scaleDown_N = AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_N.setTarget(txt_letter_cnp_N);

        scaleUp_N = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_N = new AnimatorSet();
        setDownAndUp_N.playSequentially(scaleDown_N, scaleUp_N);

        scaleDown_N.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {
                txt_letter_cnp_N.setLayerType(View.LAYER_TYPE_HARDWARE, null);
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                txt_letter_cnp_N.setLayerType(View.LAYER_TYPE_NONE, null);
            }

            @Override
            public void onAnimationCancel(Animator animator) {
                txt_letter_cnp_N.setLayerType(View.LAYER_TYPE_NONE, null);
            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });

        scaleUp_N.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {
                txt_letter_cnp_N.setLayerType(View.LAYER_TYPE_HARDWARE, null);
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                txt_letter_cnp_N.setLayerType(View.LAYER_TYPE_NONE, null);
            }

            @Override
            public void onAnimationCancel(Animator animator) {
                txt_letter_cnp_N.setLayerType(View.LAYER_TYPE_NONE, null);
            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });

        setDownAndUp_N.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {
                txt_letter_cnp_N.setLayerType(View.LAYER_TYPE_HARDWARE, null);
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                txt_letter_cnp_N.setLayerType(View.LAYER_TYPE_NONE, null);
            }

            @Override
            public void onAnimationCancel(Animator animator) {
                txt_letter_cnp_N.setLayerType(View.LAYER_TYPE_NONE, null);
            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });

        // Special guest | Animation for txt_letter_cnp_P
        scaleDown_P = AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_P.setTarget(txt_letter_cnp_P);

        scaleUp_P = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_P = new AnimatorSet();
        setDownAndUp_P.playSequentially(scaleDown_P, scaleUp_P);

        scaleDown_P.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {
                txt_letter_cnp_P.setLayerType(View.LAYER_TYPE_HARDWARE, null);
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                txt_letter_cnp_P.setLayerType(View.LAYER_TYPE_NONE, null);
            }

            @Override
            public void onAnimationCancel(Animator animator) {
                txt_letter_cnp_P.setLayerType(View.LAYER_TYPE_NONE, null);
            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });

        scaleUp_P.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {
                txt_letter_cnp_P.setLayerType(View.LAYER_TYPE_HARDWARE, null);
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                txt_letter_cnp_P.setLayerType(View.LAYER_TYPE_NONE, null);
            }

            @Override
            public void onAnimationCancel(Animator animator) {
                txt_letter_cnp_P.setLayerType(View.LAYER_TYPE_NONE, null);
            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });

        setDownAndUp_P.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {
                txt_letter_cnp_P.setLayerType(View.LAYER_TYPE_HARDWARE, null);
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                txt_letter_cnp_P.setLayerType(View.LAYER_TYPE_NONE, null);
            }

            @Override
            public void onAnimationCancel(Animator animator) {
                txt_letter_cnp_P.setLayerType(View.LAYER_TYPE_NONE, null);
            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });

        StartAnimations();

        clickToEndLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isStartingAnimation = true;
                if (isStartingAnimation) {
                    handler_special.removeCallbacksAndMessages(null);
                    GoToMainActivity();
                }
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

    public void TxtsVisibilityNone(){
        txt_a_1.setVisibility(View.INVISIBLE);
        txt_a_2.setVisibility(View.INVISIBLE);
        txt_a_3.setVisibility(View.INVISIBLE);
        txt_a_4.setVisibility(View.INVISIBLE);
        txt_a_5.setVisibility(View.INVISIBLE);
        txt_a_6.setVisibility(View.INVISIBLE);
        txt_a_7.setVisibility(View.INVISIBLE);
        txt_a_8.setVisibility(View.INVISIBLE);
        txt_a_9.setVisibility(View.INVISIBLE);
        txt_a_10.setVisibility(View.INVISIBLE);

        txt_b_1.setVisibility(View.INVISIBLE);
        txt_b_2.setVisibility(View.INVISIBLE);
        txt_b_3.setVisibility(View.INVISIBLE);
        txt_b_4.setVisibility(View.INVISIBLE);
        txt_b_5.setVisibility(View.INVISIBLE);
        txt_b_6.setVisibility(View.INVISIBLE);
        txt_b_7.setVisibility(View.INVISIBLE);
        txt_b_8.setVisibility(View.INVISIBLE);
        txt_b_9.setVisibility(View.INVISIBLE);
        txt_b_10.setVisibility(View.INVISIBLE);

        txt_c_1.setVisibility(View.INVISIBLE);
        txt_c_2.setVisibility(View.INVISIBLE);
        txt_c_3.setVisibility(View.INVISIBLE);
        txt_c_4.setVisibility(View.INVISIBLE);
        txt_c_5.setVisibility(View.INVISIBLE);
        txt_c_6.setVisibility(View.INVISIBLE);
        txt_c_7.setVisibility(View.INVISIBLE);
        txt_c_8.setVisibility(View.INVISIBLE);
        txt_c_9.setVisibility(View.INVISIBLE);
        txt_c_10.setVisibility(View.INVISIBLE);

        txt_d_1.setVisibility(View.INVISIBLE);
        txt_d_2.setVisibility(View.INVISIBLE);
        txt_d_3.setVisibility(View.INVISIBLE);
        txt_d_4.setVisibility(View.INVISIBLE);
        txt_d_5.setVisibility(View.INVISIBLE);
        txt_d_6.setVisibility(View.INVISIBLE);
        txt_d_7.setVisibility(View.INVISIBLE);
        txt_d_8.setVisibility(View.INVISIBLE);
        txt_d_9.setVisibility(View.INVISIBLE);
        txt_d_10.setVisibility(View.INVISIBLE);

        txt_e_1.setVisibility(View.INVISIBLE);
        txt_e_2.setVisibility(View.INVISIBLE);
        txt_e_3.setVisibility(View.INVISIBLE);
        txt_e_4.setVisibility(View.INVISIBLE);
        txt_e_5.setVisibility(View.INVISIBLE);
        txt_e_6.setVisibility(View.INVISIBLE);
        txt_e_7.setVisibility(View.INVISIBLE);
        txt_e_8.setVisibility(View.INVISIBLE);
        txt_e_9.setVisibility(View.INVISIBLE);
        txt_e_10.setVisibility(View.INVISIBLE);

        txt_f_1.setVisibility(View.INVISIBLE);
        txt_f_2.setVisibility(View.INVISIBLE);
        txt_f_3.setVisibility(View.INVISIBLE);
        txt_f_4.setVisibility(View.INVISIBLE);
        txt_f_5.setVisibility(View.INVISIBLE);
        txt_f_6.setVisibility(View.INVISIBLE);
        txt_f_7.setVisibility(View.INVISIBLE);
        txt_f_8.setVisibility(View.INVISIBLE);
        txt_f_9.setVisibility(View.INVISIBLE);
        txt_f_10.setVisibility(View.INVISIBLE);

        txt_g_1.setVisibility(View.INVISIBLE);
        txt_g_2.setVisibility(View.INVISIBLE);
        txt_g_3.setVisibility(View.INVISIBLE);
        txt_g_4.setVisibility(View.INVISIBLE);
        txt_g_5.setVisibility(View.INVISIBLE);
        txt_g_6.setVisibility(View.INVISIBLE);
        txt_g_7.setVisibility(View.INVISIBLE);
        txt_g_8.setVisibility(View.INVISIBLE);
        txt_g_9.setVisibility(View.INVISIBLE);
        txt_g_10.setVisibility(View.INVISIBLE);

        txt_h_1.setVisibility(View.INVISIBLE);
        txt_h_2.setVisibility(View.INVISIBLE);
        txt_h_3.setVisibility(View.INVISIBLE);
        txt_h_4.setVisibility(View.INVISIBLE);
        txt_h_5.setVisibility(View.INVISIBLE);
        txt_h_6.setVisibility(View.INVISIBLE);
        txt_h_7.setVisibility(View.INVISIBLE);
        txt_h_8.setVisibility(View.INVISIBLE);
        txt_h_9.setVisibility(View.INVISIBLE);
        txt_h_10.setVisibility(View.INVISIBLE);

        txt_i_1.setVisibility(View.INVISIBLE);
        txt_i_2.setVisibility(View.INVISIBLE);
        txt_i_3.setVisibility(View.INVISIBLE);
        txt_i_4.setVisibility(View.INVISIBLE);
        txt_i_5.setVisibility(View.INVISIBLE);
        txt_i_6.setVisibility(View.INVISIBLE);
        txt_i_7.setVisibility(View.INVISIBLE);
        txt_i_8.setVisibility(View.INVISIBLE);
        txt_i_9.setVisibility(View.INVISIBLE);
        txt_i_10.setVisibility(View.INVISIBLE);

        txt_j_1.setVisibility(View.INVISIBLE);
        txt_j_2.setVisibility(View.INVISIBLE);
        txt_j_3.setVisibility(View.INVISIBLE);
        txt_j_4.setVisibility(View.INVISIBLE);
        txt_j_5.setVisibility(View.INVISIBLE);
        txt_j_6.setVisibility(View.INVISIBLE);
        txt_j_7.setVisibility(View.INVISIBLE);
        txt_j_8.setVisibility(View.INVISIBLE);
        txt_j_9.setVisibility(View.INVISIBLE);
        txt_j_10.setVisibility(View.INVISIBLE);

        txt_k_1.setVisibility(View.INVISIBLE);
        txt_k_2.setVisibility(View.INVISIBLE);
        txt_k_3.setVisibility(View.INVISIBLE);
        txt_k_4.setVisibility(View.INVISIBLE);
        txt_k_5.setVisibility(View.INVISIBLE);
        txt_k_6.setVisibility(View.INVISIBLE);
        txt_k_7.setVisibility(View.INVISIBLE);
        txt_k_8.setVisibility(View.INVISIBLE);
        txt_k_9.setVisibility(View.INVISIBLE);
        txt_k_10.setVisibility(View.INVISIBLE);

        txt_l_1.setVisibility(View.INVISIBLE);
        txt_l_2.setVisibility(View.INVISIBLE);
        txt_l_3.setVisibility(View.INVISIBLE);
        txt_l_4.setVisibility(View.INVISIBLE);
        txt_l_5.setVisibility(View.INVISIBLE);
        txt_l_6.setVisibility(View.INVISIBLE);
        txt_l_7.setVisibility(View.INVISIBLE);
        txt_l_8.setVisibility(View.INVISIBLE);
        txt_l_9.setVisibility(View.INVISIBLE);
        txt_l_10.setVisibility(View.INVISIBLE);

        txt_m_1.setVisibility(View.INVISIBLE);
        txt_m_2.setVisibility(View.INVISIBLE);
        txt_m_3.setVisibility(View.INVISIBLE);
        txt_m_4.setVisibility(View.INVISIBLE);
        txt_m_5.setVisibility(View.INVISIBLE);
        txt_m_6.setVisibility(View.INVISIBLE);
        txt_m_7.setVisibility(View.INVISIBLE);
        txt_m_8.setVisibility(View.INVISIBLE);
        txt_m_9.setVisibility(View.INVISIBLE);
        txt_m_10.setVisibility(View.INVISIBLE);

        txt_n_1.setVisibility(View.INVISIBLE);
        txt_n_2.setVisibility(View.INVISIBLE);
        txt_n_3.setVisibility(View.INVISIBLE);
        txt_n_4.setVisibility(View.INVISIBLE);
        txt_n_5.setVisibility(View.INVISIBLE);
        txt_n_6.setVisibility(View.INVISIBLE);
        txt_n_7.setVisibility(View.INVISIBLE);
        txt_n_8.setVisibility(View.INVISIBLE);
        txt_n_9.setVisibility(View.INVISIBLE);
        txt_n_10.setVisibility(View.INVISIBLE);

        txt_o_1.setVisibility(View.INVISIBLE);
        txt_o_2.setVisibility(View.INVISIBLE);
        txt_o_3.setVisibility(View.INVISIBLE);
        txt_o_4.setVisibility(View.INVISIBLE);
        txt_o_5.setVisibility(View.INVISIBLE);
        txt_o_6.setVisibility(View.INVISIBLE);
        txt_o_7.setVisibility(View.INVISIBLE);
        txt_o_8.setVisibility(View.INVISIBLE);
        txt_o_9.setVisibility(View.INVISIBLE);
        txt_o_10.setVisibility(View.INVISIBLE);

        txt_p_1.setVisibility(View.INVISIBLE);
        txt_p_2.setVisibility(View.INVISIBLE);
        txt_p_3.setVisibility(View.INVISIBLE);
        txt_p_4.setVisibility(View.INVISIBLE);
        txt_p_5.setVisibility(View.INVISIBLE);
        txt_p_6.setVisibility(View.INVISIBLE);
        txt_p_7.setVisibility(View.INVISIBLE);
        txt_p_8.setVisibility(View.INVISIBLE);
        txt_p_9.setVisibility(View.INVISIBLE);
        txt_p_10.setVisibility(View.INVISIBLE);

        txt_q_1.setVisibility(View.INVISIBLE);
        txt_q_2.setVisibility(View.INVISIBLE);
        txt_q_3.setVisibility(View.INVISIBLE);
        txt_q_4.setVisibility(View.INVISIBLE);
        txt_q_5.setVisibility(View.INVISIBLE);
        txt_q_6.setVisibility(View.INVISIBLE);
        txt_q_7.setVisibility(View.INVISIBLE);
        txt_q_8.setVisibility(View.INVISIBLE);
        txt_q_9.setVisibility(View.INVISIBLE);
        txt_q_10.setVisibility(View.INVISIBLE);

        txt_r_1.setVisibility(View.INVISIBLE);
        txt_r_2.setVisibility(View.INVISIBLE);
        txt_r_3.setVisibility(View.INVISIBLE);
        txt_r_4.setVisibility(View.INVISIBLE);
        txt_r_5.setVisibility(View.INVISIBLE);
        txt_r_6.setVisibility(View.INVISIBLE);
        txt_r_7.setVisibility(View.INVISIBLE);
        txt_r_8.setVisibility(View.INVISIBLE);
        txt_r_9.setVisibility(View.INVISIBLE);
        txt_r_10.setVisibility(View.INVISIBLE);

        txt_s_1.setVisibility(View.INVISIBLE);
        txt_s_2.setVisibility(View.INVISIBLE);
        txt_s_3.setVisibility(View.INVISIBLE);
        txt_s_4.setVisibility(View.INVISIBLE);
        txt_s_5.setVisibility(View.INVISIBLE);
        txt_s_6.setVisibility(View.INVISIBLE);
        txt_s_7.setVisibility(View.INVISIBLE);
        txt_s_8.setVisibility(View.INVISIBLE);
        txt_s_9.setVisibility(View.INVISIBLE);
        txt_s_10.setVisibility(View.INVISIBLE);

        txt_t_1.setVisibility(View.INVISIBLE);
        txt_t_2.setVisibility(View.INVISIBLE);
        txt_t_3.setVisibility(View.INVISIBLE);
        txt_t_4.setVisibility(View.INVISIBLE);
        txt_t_5.setVisibility(View.INVISIBLE);
        txt_t_6.setVisibility(View.INVISIBLE);
        txt_t_7.setVisibility(View.INVISIBLE);
        txt_t_8.setVisibility(View.INVISIBLE);
        txt_t_9.setVisibility(View.INVISIBLE);
        txt_t_10.setVisibility(View.INVISIBLE);
    }

    public void RomanianFlagShowsUp(){
        // BLUE
        txt_b_2.setVisibility(View.VISIBLE);
        txt_b_2.setBackgroundResource(R.drawable.layout_blue);
        txt_c_2.setVisibility(View.VISIBLE);
        txt_c_2.setBackgroundResource(R.drawable.layout_blue);
        txt_d_2.setVisibility(View.VISIBLE);
        txt_d_2.setBackgroundResource(R.drawable.layout_blue);
        txt_e_2.setVisibility(View.VISIBLE);
        txt_e_2.setBackgroundResource(R.drawable.layout_blue);
        txt_f_2.setVisibility(View.VISIBLE);
        txt_f_2.setBackgroundResource(R.drawable.layout_blue);
        txt_g_2.setVisibility(View.VISIBLE);
        txt_g_2.setBackgroundResource(R.drawable.layout_blue);

        txt_b_3.setVisibility(View.VISIBLE);
        txt_b_3.setBackgroundResource(R.drawable.layout_blue);
        txt_c_3.setVisibility(View.VISIBLE);
        txt_c_3.setBackgroundResource(R.drawable.layout_blue);
        txt_d_3.setVisibility(View.VISIBLE);
        txt_d_3.setBackgroundResource(R.drawable.layout_blue);
        txt_e_3.setVisibility(View.VISIBLE);
        txt_e_3.setBackgroundResource(R.drawable.layout_blue);
        txt_f_3.setVisibility(View.VISIBLE);
        txt_f_3.setBackgroundResource(R.drawable.layout_blue);
        txt_g_3.setVisibility(View.VISIBLE);
        txt_g_3.setBackgroundResource(R.drawable.layout_blue);

        txt_b_4.setVisibility(View.VISIBLE);
        txt_b_4.setBackgroundResource(R.drawable.layout_blue);
        txt_c_4.setVisibility(View.VISIBLE);
        txt_c_4.setBackgroundResource(R.drawable.layout_blue);
        txt_d_4.setVisibility(View.VISIBLE);
        txt_d_4.setBackgroundResource(R.drawable.layout_blue);
        txt_e_4.setVisibility(View.VISIBLE);
        txt_e_4.setBackgroundResource(R.drawable.layout_blue);
        txt_f_4.setVisibility(View.VISIBLE);
        txt_f_4.setBackgroundResource(R.drawable.layout_blue);
        txt_g_4.setVisibility(View.VISIBLE);
        txt_g_4.setBackgroundResource(R.drawable.layout_blue);

        txt_b_5.setVisibility(View.VISIBLE);
        txt_b_5.setBackgroundResource(R.drawable.layout_blue);
        txt_c_5.setVisibility(View.VISIBLE);
        txt_c_5.setBackgroundResource(R.drawable.layout_blue);
        txt_d_5.setVisibility(View.VISIBLE);
        txt_d_5.setBackgroundResource(R.drawable.layout_blue);
        txt_e_5.setVisibility(View.VISIBLE);
        txt_e_5.setBackgroundResource(R.drawable.layout_blue);
        txt_f_5.setVisibility(View.VISIBLE);
        txt_f_5.setBackgroundResource(R.drawable.layout_blue);
        txt_g_5.setVisibility(View.VISIBLE);
        txt_g_5.setBackgroundResource(R.drawable.layout_blue);

        txt_b_6.setVisibility(View.VISIBLE);
        txt_b_6.setBackgroundResource(R.drawable.layout_blue);
        txt_c_6.setVisibility(View.VISIBLE);
        txt_c_6.setBackgroundResource(R.drawable.layout_blue);
        txt_d_6.setVisibility(View.VISIBLE);
        txt_d_6.setBackgroundResource(R.drawable.layout_blue);
        txt_e_6.setVisibility(View.VISIBLE);
        txt_e_6.setBackgroundResource(R.drawable.layout_blue);
        txt_f_6.setVisibility(View.VISIBLE);
        txt_f_6.setBackgroundResource(R.drawable.layout_blue);
        txt_g_6.setVisibility(View.VISIBLE);
        txt_g_6.setBackgroundResource(R.drawable.layout_blue);

        txt_b_7.setVisibility(View.VISIBLE);
        txt_b_7.setBackgroundResource(R.drawable.layout_blue);
        txt_c_7.setVisibility(View.VISIBLE);
        txt_c_7.setBackgroundResource(R.drawable.layout_blue);
        txt_d_7.setVisibility(View.VISIBLE);
        txt_d_7.setBackgroundResource(R.drawable.layout_blue);
        txt_e_7.setVisibility(View.VISIBLE);
        txt_e_7.setBackgroundResource(R.drawable.layout_blue);
        txt_f_7.setVisibility(View.VISIBLE);
        txt_f_7.setBackgroundResource(R.drawable.layout_blue);
        txt_g_7.setVisibility(View.VISIBLE);
        txt_g_7.setBackgroundResource(R.drawable.layout_blue);

        txt_b_8.setVisibility(View.VISIBLE);
        txt_b_8.setBackgroundResource(R.drawable.layout_blue);
        txt_c_8.setVisibility(View.VISIBLE);
        txt_c_8.setBackgroundResource(R.drawable.layout_blue);
        txt_d_8.setVisibility(View.VISIBLE);
        txt_d_8.setBackgroundResource(R.drawable.layout_blue);
        txt_e_8.setVisibility(View.VISIBLE);
        txt_e_8.setBackgroundResource(R.drawable.layout_blue);
        txt_f_8.setVisibility(View.VISIBLE);
        txt_f_8.setBackgroundResource(R.drawable.layout_blue);
        txt_g_8.setVisibility(View.VISIBLE);
        txt_g_8.setBackgroundResource(R.drawable.layout_blue);

        txt_b_9.setVisibility(View.VISIBLE);
        txt_b_9.setBackgroundResource(R.drawable.layout_blue);
        txt_c_9.setVisibility(View.VISIBLE);
        txt_c_9.setBackgroundResource(R.drawable.layout_blue);
        txt_d_9.setVisibility(View.VISIBLE);
        txt_d_9.setBackgroundResource(R.drawable.layout_blue);
        txt_e_9.setVisibility(View.VISIBLE);
        txt_e_9.setBackgroundResource(R.drawable.layout_blue);
        txt_f_9.setVisibility(View.VISIBLE);
        txt_f_9.setBackgroundResource(R.drawable.layout_blue);
        txt_g_9.setVisibility(View.VISIBLE);
        txt_g_9.setBackgroundResource(R.drawable.layout_blue);

        // YELLOW
        txt_h_2.setVisibility(View.VISIBLE);
        txt_h_2.setBackgroundResource(R.drawable.layout_yellow);
        txt_i_2.setVisibility(View.VISIBLE);
        txt_i_2.setBackgroundResource(R.drawable.layout_yellow);
        txt_j_2.setVisibility(View.VISIBLE);
        txt_j_2.setBackgroundResource(R.drawable.layout_yellow);
        txt_k_2.setVisibility(View.VISIBLE);
        txt_k_2.setBackgroundResource(R.drawable.layout_yellow);
        txt_l_2.setVisibility(View.VISIBLE);
        txt_l_2.setBackgroundResource(R.drawable.layout_yellow);
        txt_m_2.setVisibility(View.VISIBLE);
        txt_m_2.setBackgroundResource(R.drawable.layout_yellow);

        txt_h_3.setVisibility(View.VISIBLE);
        txt_h_3.setBackgroundResource(R.drawable.layout_yellow);
        txt_i_3.setVisibility(View.VISIBLE);
        txt_i_3.setBackgroundResource(R.drawable.layout_yellow);
        txt_j_3.setVisibility(View.VISIBLE);
        txt_j_3.setBackgroundResource(R.drawable.layout_yellow);
        txt_k_3.setVisibility(View.VISIBLE);
        txt_k_3.setBackgroundResource(R.drawable.layout_yellow);
        txt_l_3.setVisibility(View.VISIBLE);
        txt_l_3.setBackgroundResource(R.drawable.layout_yellow);
        txt_m_3.setVisibility(View.VISIBLE);
        txt_m_3.setBackgroundResource(R.drawable.layout_yellow);

        txt_h_4.setVisibility(View.VISIBLE);
        txt_h_4.setBackgroundResource(R.drawable.layout_yellow);
        txt_i_4.setVisibility(View.VISIBLE);
        txt_i_4.setBackgroundResource(R.drawable.layout_yellow);
        txt_j_4.setVisibility(View.VISIBLE);
        txt_j_4.setBackgroundResource(R.drawable.layout_yellow);
        txt_k_4.setVisibility(View.VISIBLE);
        txt_k_4.setBackgroundResource(R.drawable.layout_yellow);
        txt_l_4.setVisibility(View.VISIBLE);
        txt_l_4.setBackgroundResource(R.drawable.layout_yellow);
        txt_m_4.setVisibility(View.VISIBLE);
        txt_m_4.setBackgroundResource(R.drawable.layout_yellow);

        txt_h_5.setVisibility(View.VISIBLE);
        txt_h_5.setBackgroundResource(R.drawable.layout_yellow);
        txt_i_5.setVisibility(View.VISIBLE);
        txt_i_5.setBackgroundResource(R.drawable.layout_yellow);
        txt_j_5.setVisibility(View.VISIBLE);
        txt_j_5.setBackgroundResource(R.drawable.layout_yellow);
        txt_k_5.setVisibility(View.VISIBLE);
        txt_k_5.setBackgroundResource(R.drawable.layout_yellow);
        txt_l_5.setVisibility(View.VISIBLE);
        txt_l_5.setBackgroundResource(R.drawable.layout_yellow);
        txt_m_5.setVisibility(View.VISIBLE);
        txt_m_5.setBackgroundResource(R.drawable.layout_yellow);

        txt_h_6.setVisibility(View.VISIBLE);
        txt_h_6.setBackgroundResource(R.drawable.layout_yellow);
        txt_i_6.setVisibility(View.VISIBLE);
        txt_i_6.setBackgroundResource(R.drawable.layout_yellow);
        txt_j_6.setVisibility(View.VISIBLE);
        txt_j_6.setBackgroundResource(R.drawable.layout_yellow);
        txt_k_6.setVisibility(View.VISIBLE);
        txt_k_6.setBackgroundResource(R.drawable.layout_yellow);
        txt_l_6.setVisibility(View.VISIBLE);
        txt_l_6.setBackgroundResource(R.drawable.layout_yellow);
        txt_m_6.setVisibility(View.VISIBLE);
        txt_m_6.setBackgroundResource(R.drawable.layout_yellow);

        txt_h_7.setVisibility(View.VISIBLE);
        txt_h_7.setBackgroundResource(R.drawable.layout_yellow);
        txt_i_7.setVisibility(View.VISIBLE);
        txt_i_7.setBackgroundResource(R.drawable.layout_yellow);
        txt_j_7.setVisibility(View.VISIBLE);
        txt_j_7.setBackgroundResource(R.drawable.layout_yellow);
        txt_k_7.setVisibility(View.VISIBLE);
        txt_k_7.setBackgroundResource(R.drawable.layout_yellow);
        txt_l_7.setVisibility(View.VISIBLE);
        txt_l_7.setBackgroundResource(R.drawable.layout_yellow);
        txt_m_7.setVisibility(View.VISIBLE);
        txt_m_7.setBackgroundResource(R.drawable.layout_yellow);

        txt_h_8.setVisibility(View.VISIBLE);
        txt_h_8.setBackgroundResource(R.drawable.layout_yellow);
        txt_i_8.setVisibility(View.VISIBLE);
        txt_i_8.setBackgroundResource(R.drawable.layout_yellow);
        txt_j_8.setVisibility(View.VISIBLE);
        txt_j_8.setBackgroundResource(R.drawable.layout_yellow);
        txt_k_8.setVisibility(View.VISIBLE);
        txt_k_8.setBackgroundResource(R.drawable.layout_yellow);
        txt_l_8.setVisibility(View.VISIBLE);
        txt_l_8.setBackgroundResource(R.drawable.layout_yellow);
        txt_m_8.setVisibility(View.VISIBLE);
        txt_m_8.setBackgroundResource(R.drawable.layout_yellow);

        txt_h_9.setVisibility(View.VISIBLE);
        txt_h_9.setBackgroundResource(R.drawable.layout_yellow);
        txt_i_9.setVisibility(View.VISIBLE);
        txt_i_9.setBackgroundResource(R.drawable.layout_yellow);
        txt_j_9.setVisibility(View.VISIBLE);
        txt_j_9.setBackgroundResource(R.drawable.layout_yellow);
        txt_k_9.setVisibility(View.VISIBLE);
        txt_k_9.setBackgroundResource(R.drawable.layout_yellow);
        txt_l_9.setVisibility(View.VISIBLE);
        txt_l_9.setBackgroundResource(R.drawable.layout_yellow);
        txt_m_9.setVisibility(View.VISIBLE);
        txt_m_9.setBackgroundResource(R.drawable.layout_yellow);

        // RED
        txt_n_2.setVisibility(View.VISIBLE);
        txt_n_2.setBackgroundResource(R.drawable.layout_red);
        txt_o_2.setVisibility(View.VISIBLE);
        txt_o_2.setBackgroundResource(R.drawable.layout_red);
        txt_p_2.setVisibility(View.VISIBLE);
        txt_p_2.setBackgroundResource(R.drawable.layout_red);
        txt_q_2.setVisibility(View.VISIBLE);
        txt_q_2.setBackgroundResource(R.drawable.layout_red);
        txt_r_2.setVisibility(View.VISIBLE);
        txt_r_2.setBackgroundResource(R.drawable.layout_red);
        txt_s_2.setVisibility(View.VISIBLE);
        txt_s_2.setBackgroundResource(R.drawable.layout_red);

        txt_n_3.setVisibility(View.VISIBLE);
        txt_n_3.setBackgroundResource(R.drawable.layout_red);
        txt_o_3.setVisibility(View.VISIBLE);
        txt_o_3.setBackgroundResource(R.drawable.layout_red);
        txt_p_3.setVisibility(View.VISIBLE);
        txt_p_3.setBackgroundResource(R.drawable.layout_red);
        txt_q_3.setVisibility(View.VISIBLE);
        txt_q_3.setBackgroundResource(R.drawable.layout_red);
        txt_r_3.setVisibility(View.VISIBLE);
        txt_r_3.setBackgroundResource(R.drawable.layout_red);
        txt_s_3.setVisibility(View.VISIBLE);
        txt_s_3.setBackgroundResource(R.drawable.layout_red);

        txt_n_4.setVisibility(View.VISIBLE);
        txt_n_4.setBackgroundResource(R.drawable.layout_red);
        txt_o_4.setVisibility(View.VISIBLE);
        txt_o_4.setBackgroundResource(R.drawable.layout_red);
        txt_p_4.setVisibility(View.VISIBLE);
        txt_p_4.setBackgroundResource(R.drawable.layout_red);
        txt_q_4.setVisibility(View.VISIBLE);
        txt_q_4.setBackgroundResource(R.drawable.layout_red);
        txt_r_4.setVisibility(View.VISIBLE);
        txt_r_4.setBackgroundResource(R.drawable.layout_red);
        txt_s_4.setVisibility(View.VISIBLE);
        txt_s_4.setBackgroundResource(R.drawable.layout_red);

        txt_n_5.setVisibility(View.VISIBLE);
        txt_n_5.setBackgroundResource(R.drawable.layout_red);
        txt_o_5.setVisibility(View.VISIBLE);
        txt_o_5.setBackgroundResource(R.drawable.layout_red);
        txt_p_5.setVisibility(View.VISIBLE);
        txt_p_5.setBackgroundResource(R.drawable.layout_red);
        txt_q_5.setVisibility(View.VISIBLE);
        txt_q_5.setBackgroundResource(R.drawable.layout_red);
        txt_r_5.setVisibility(View.VISIBLE);
        txt_r_5.setBackgroundResource(R.drawable.layout_red);
        txt_s_5.setVisibility(View.VISIBLE);
        txt_s_5.setBackgroundResource(R.drawable.layout_red);

        txt_n_6.setVisibility(View.VISIBLE);
        txt_n_6.setBackgroundResource(R.drawable.layout_red);
        txt_o_6.setVisibility(View.VISIBLE);
        txt_o_6.setBackgroundResource(R.drawable.layout_red);
        txt_p_6.setVisibility(View.VISIBLE);
        txt_p_6.setBackgroundResource(R.drawable.layout_red);
        txt_q_6.setVisibility(View.VISIBLE);
        txt_q_6.setBackgroundResource(R.drawable.layout_red);
        txt_r_6.setVisibility(View.VISIBLE);
        txt_r_6.setBackgroundResource(R.drawable.layout_red);
        txt_s_6.setVisibility(View.VISIBLE);
        txt_s_6.setBackgroundResource(R.drawable.layout_red);

        txt_n_7.setVisibility(View.VISIBLE);
        txt_n_7.setBackgroundResource(R.drawable.layout_red);
        txt_o_7.setVisibility(View.VISIBLE);
        txt_o_7.setBackgroundResource(R.drawable.layout_red);
        txt_p_7.setVisibility(View.VISIBLE);
        txt_p_7.setBackgroundResource(R.drawable.layout_red);
        txt_q_7.setVisibility(View.VISIBLE);
        txt_q_7.setBackgroundResource(R.drawable.layout_red);
        txt_r_7.setVisibility(View.VISIBLE);
        txt_r_7.setBackgroundResource(R.drawable.layout_red);
        txt_s_7.setVisibility(View.VISIBLE);
        txt_s_7.setBackgroundResource(R.drawable.layout_red);

        txt_n_8.setVisibility(View.VISIBLE);
        txt_n_8.setBackgroundResource(R.drawable.layout_red);
        txt_o_8.setVisibility(View.VISIBLE);
        txt_o_8.setBackgroundResource(R.drawable.layout_red);
        txt_p_8.setVisibility(View.VISIBLE);
        txt_p_8.setBackgroundResource(R.drawable.layout_red);
        txt_q_8.setVisibility(View.VISIBLE);
        txt_q_8.setBackgroundResource(R.drawable.layout_red);
        txt_r_8.setVisibility(View.VISIBLE);
        txt_r_8.setBackgroundResource(R.drawable.layout_red);
        txt_s_8.setVisibility(View.VISIBLE);
        txt_s_8.setBackgroundResource(R.drawable.layout_red);

        txt_n_9.setVisibility(View.VISIBLE);
        txt_n_9.setBackgroundResource(R.drawable.layout_red);
        txt_o_9.setVisibility(View.VISIBLE);
        txt_o_9.setBackgroundResource(R.drawable.layout_red);
        txt_p_9.setVisibility(View.VISIBLE);
        txt_p_9.setBackgroundResource(R.drawable.layout_red);
        txt_q_9.setVisibility(View.VISIBLE);
        txt_q_9.setBackgroundResource(R.drawable.layout_red);
        txt_r_9.setVisibility(View.VISIBLE);
        txt_r_9.setBackgroundResource(R.drawable.layout_red);
        txt_s_9.setVisibility(View.VISIBLE);
        txt_s_9.setBackgroundResource(R.drawable.layout_red);
    }
    
    public void SetDrawableUpAndDownTXTS_UP(){
        // TXTS VISIBLE
        txt_b_2.setVisibility(View.VISIBLE);
        txt_b_3.setVisibility(View.VISIBLE);
        txt_b_4.setVisibility(View.VISIBLE);
        txt_b_5.setVisibility(View.VISIBLE);
        txt_b_6.setVisibility(View.VISIBLE);
        txt_b_7.setVisibility(View.VISIBLE);
        txt_b_8.setVisibility(View.VISIBLE);
        txt_b_9.setVisibility(View.VISIBLE);

        txt_c_2.setVisibility(View.VISIBLE);
        txt_c_3.setVisibility(View.VISIBLE);
        txt_c_4.setVisibility(View.VISIBLE);
        txt_c_5.setVisibility(View.VISIBLE);
        txt_c_6.setVisibility(View.VISIBLE);
        txt_c_7.setVisibility(View.VISIBLE);
        txt_c_8.setVisibility(View.VISIBLE);
        txt_c_9.setVisibility(View.VISIBLE);

        txt_d_2.setVisibility(View.VISIBLE);
        txt_d_3.setVisibility(View.VISIBLE);
        txt_d_4.setVisibility(View.VISIBLE);
        txt_d_5.setVisibility(View.VISIBLE);
        txt_d_6.setVisibility(View.VISIBLE);
        txt_d_7.setVisibility(View.VISIBLE);
        txt_d_8.setVisibility(View.VISIBLE);
        txt_d_9.setVisibility(View.VISIBLE);

        txt_e_2.setVisibility(View.VISIBLE);
        txt_e_3.setVisibility(View.VISIBLE);
        txt_e_4.setVisibility(View.VISIBLE);
        txt_e_5.setVisibility(View.VISIBLE);
        txt_e_6.setVisibility(View.VISIBLE);
        txt_e_7.setVisibility(View.VISIBLE);
        txt_e_8.setVisibility(View.VISIBLE);
        txt_e_9.setVisibility(View.VISIBLE);

        txt_f_2.setVisibility(View.VISIBLE);
        txt_f_3.setVisibility(View.VISIBLE);
        txt_f_4.setVisibility(View.VISIBLE);
        txt_f_5.setVisibility(View.VISIBLE);
        txt_f_6.setVisibility(View.VISIBLE);
        txt_f_7.setVisibility(View.VISIBLE);
        txt_f_8.setVisibility(View.VISIBLE);
        txt_f_9.setVisibility(View.VISIBLE);

        txt_g_2.setVisibility(View.VISIBLE);
        txt_g_3.setVisibility(View.VISIBLE);
        txt_g_4.setVisibility(View.VISIBLE);
        txt_g_5.setVisibility(View.VISIBLE);
        txt_g_6.setVisibility(View.VISIBLE);
        txt_g_7.setVisibility(View.VISIBLE);
        txt_g_8.setVisibility(View.VISIBLE);
        txt_g_9.setVisibility(View.VISIBLE);

        txt_h_2.setVisibility(View.VISIBLE);
        txt_h_3.setVisibility(View.VISIBLE);
        txt_h_4.setVisibility(View.VISIBLE);
        txt_h_5.setVisibility(View.VISIBLE);
        txt_h_6.setVisibility(View.VISIBLE);
        txt_h_7.setVisibility(View.VISIBLE);
        txt_h_8.setVisibility(View.VISIBLE);
        txt_h_9.setVisibility(View.VISIBLE);

        txt_i_2.setVisibility(View.VISIBLE);
        txt_i_3.setVisibility(View.VISIBLE);
        txt_i_4.setVisibility(View.VISIBLE);
        txt_i_5.setVisibility(View.VISIBLE);
        txt_i_6.setVisibility(View.VISIBLE);
        txt_i_7.setVisibility(View.VISIBLE);
        txt_i_8.setVisibility(View.VISIBLE);
        txt_i_9.setVisibility(View.VISIBLE);

        txt_j_2.setVisibility(View.VISIBLE);
        txt_j_3.setVisibility(View.VISIBLE);
        txt_j_4.setVisibility(View.VISIBLE);
        txt_j_5.setVisibility(View.VISIBLE);
        txt_j_6.setVisibility(View.VISIBLE);
        txt_j_7.setVisibility(View.VISIBLE);
        txt_j_8.setVisibility(View.VISIBLE);
        txt_j_9.setVisibility(View.VISIBLE);

        txt_k_2.setVisibility(View.VISIBLE);
        txt_k_3.setVisibility(View.VISIBLE);
        txt_k_4.setVisibility(View.VISIBLE);
        txt_k_5.setVisibility(View.VISIBLE);
        txt_k_6.setVisibility(View.VISIBLE);
        txt_k_7.setVisibility(View.VISIBLE);
        txt_k_8.setVisibility(View.VISIBLE);
        txt_k_9.setVisibility(View.VISIBLE);

        txt_l_2.setVisibility(View.VISIBLE);
        txt_l_3.setVisibility(View.VISIBLE);
        txt_l_4.setVisibility(View.VISIBLE);
        txt_l_5.setVisibility(View.VISIBLE);
        txt_l_6.setVisibility(View.VISIBLE);
        txt_l_7.setVisibility(View.VISIBLE);
        txt_l_8.setVisibility(View.VISIBLE);
        txt_l_9.setVisibility(View.VISIBLE);

        txt_m_2.setVisibility(View.VISIBLE);
        txt_m_3.setVisibility(View.VISIBLE);
        txt_m_4.setVisibility(View.VISIBLE);
        txt_m_5.setVisibility(View.VISIBLE);
        txt_m_6.setVisibility(View.VISIBLE);
        txt_m_7.setVisibility(View.VISIBLE);
        txt_m_8.setVisibility(View.VISIBLE);
        txt_m_9.setVisibility(View.VISIBLE);

        txt_n_2.setVisibility(View.VISIBLE);
        txt_n_3.setVisibility(View.VISIBLE);
        txt_n_4.setVisibility(View.VISIBLE);
        txt_n_5.setVisibility(View.VISIBLE);
        txt_n_6.setVisibility(View.VISIBLE);
        txt_n_7.setVisibility(View.VISIBLE);
        txt_n_8.setVisibility(View.VISIBLE);
        txt_n_9.setVisibility(View.VISIBLE);

        txt_o_2.setVisibility(View.VISIBLE);
        txt_o_3.setVisibility(View.VISIBLE);
        txt_o_4.setVisibility(View.VISIBLE);
        txt_o_5.setVisibility(View.VISIBLE);
        txt_o_6.setVisibility(View.VISIBLE);
        txt_o_7.setVisibility(View.VISIBLE);
        txt_o_8.setVisibility(View.VISIBLE);
        txt_o_9.setVisibility(View.VISIBLE);

        txt_p_2.setVisibility(View.VISIBLE);
        txt_p_3.setVisibility(View.VISIBLE);
        txt_p_4.setVisibility(View.VISIBLE);
        txt_p_5.setVisibility(View.VISIBLE);
        txt_p_6.setVisibility(View.VISIBLE);
        txt_p_7.setVisibility(View.VISIBLE);
        txt_p_8.setVisibility(View.VISIBLE);
        txt_p_9.setVisibility(View.VISIBLE);

        txt_q_2.setVisibility(View.VISIBLE);
        txt_q_3.setVisibility(View.VISIBLE);
        txt_q_4.setVisibility(View.VISIBLE);
        txt_q_5.setVisibility(View.VISIBLE);
        txt_q_6.setVisibility(View.VISIBLE);
        txt_q_7.setVisibility(View.VISIBLE);
        txt_q_8.setVisibility(View.VISIBLE);
        txt_q_9.setVisibility(View.VISIBLE);

        txt_r_2.setVisibility(View.VISIBLE);
        txt_r_3.setVisibility(View.VISIBLE);
        txt_r_4.setVisibility(View.VISIBLE);
        txt_r_5.setVisibility(View.VISIBLE);
        txt_r_6.setVisibility(View.VISIBLE);
        txt_r_7.setVisibility(View.VISIBLE);
        txt_r_8.setVisibility(View.VISIBLE);
        txt_r_9.setVisibility(View.VISIBLE);

        txt_s_2.setVisibility(View.VISIBLE);
        txt_s_3.setVisibility(View.VISIBLE);
        txt_s_4.setVisibility(View.VISIBLE);
        txt_s_5.setVisibility(View.VISIBLE);
        txt_s_6.setVisibility(View.VISIBLE);
        txt_s_7.setVisibility(View.VISIBLE);
        txt_s_8.setVisibility(View.VISIBLE);
        txt_s_9.setVisibility(View.VISIBLE);

        // Special guest | Animation for txt_b_2
        scaleDown_txt_b_2 = AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_b_2.setTarget(txt_b_2);

        scaleUp_txt_b_2 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_b_2 = new AnimatorSet();
        setDownAndUp_txt_b_2.playSequentially(scaleDown_txt_b_2, scaleUp_txt_b_2);
        
        // Special guest | Animation for txt_b_3
        scaleDown_txt_b_3 = AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_b_3.setTarget(txt_b_3);

        scaleUp_txt_b_3 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_b_3 = new AnimatorSet();
        setDownAndUp_txt_b_3.playSequentially(scaleDown_txt_b_3, scaleUp_txt_b_3);      
        
        // Special guest | Animation for txt_b_4
        scaleDown_txt_b_4 = AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_b_4.setTarget(txt_b_4);

        scaleUp_txt_b_4 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_b_4 = new AnimatorSet();
        setDownAndUp_txt_b_4.playSequentially(scaleDown_txt_b_4, scaleUp_txt_b_4);    
        
        // Special guest | Animation for txt_b_5
        scaleDown_txt_b_5 = AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_b_5.setTarget(txt_b_5);

        scaleUp_txt_b_5 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_b_5 = new AnimatorSet();
        setDownAndUp_txt_b_5.playSequentially(scaleDown_txt_b_5, scaleUp_txt_b_5);     
        
        // Special guest | Animation for txt_b_6
        scaleDown_txt_b_6 = AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_b_6.setTarget(txt_b_6);

        scaleUp_txt_b_6 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_b_6 = new AnimatorSet();
        setDownAndUp_txt_b_6.playSequentially(scaleDown_txt_b_6, scaleUp_txt_b_6);       
        
        // Special guest | Animation for txt_b_7
        scaleDown_txt_b_7 = AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_b_7.setTarget(txt_b_7);

        scaleUp_txt_b_7 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_b_7 = new AnimatorSet();
        setDownAndUp_txt_b_7.playSequentially(scaleDown_txt_b_7, scaleUp_txt_b_7);   
        
        // Special guest | Animation for txt_b_8
        scaleDown_txt_b_8 = AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_b_8.setTarget(txt_b_8);

        scaleUp_txt_b_8 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_b_8 = new AnimatorSet();
        setDownAndUp_txt_b_8.playSequentially(scaleDown_txt_b_8, scaleUp_txt_b_8);       
        
        // Special guest | Animation for txt_b_9
        scaleDown_txt_b_9 = AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_b_9.setTarget(txt_b_9);

        scaleUp_txt_b_9 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_b_9 = new AnimatorSet();
        setDownAndUp_txt_b_9.playSequentially(scaleDown_txt_b_9, scaleUp_txt_b_9);
        
        // Special guest | Animation for txt_c_2
        scaleDown_txt_c_2 = AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_c_2.setTarget(txt_c_2);

        scaleUp_txt_c_2 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_c_2 = new AnimatorSet();
        setDownAndUp_txt_c_2.playSequentially(scaleDown_txt_c_2, scaleUp_txt_c_2);

        // Special guest | Animation for txt_c_3
        scaleDown_txt_c_3 = AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_c_3.setTarget(txt_c_3);

        scaleUp_txt_c_3 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_c_3 = new AnimatorSet();
        setDownAndUp_txt_c_3.playSequentially(scaleDown_txt_c_3, scaleUp_txt_c_3);

        // Special guest | Animation for txt_c_4
        scaleDown_txt_c_4 = AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_c_4.setTarget(txt_c_4);

        scaleUp_txt_c_4 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_c_4 = new AnimatorSet();
        setDownAndUp_txt_c_4.playSequentially(scaleDown_txt_c_4, scaleUp_txt_c_4);

        // Special guest | Animation for txt_c_5
        scaleDown_txt_c_5 = AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_c_5.setTarget(txt_c_5);

        scaleUp_txt_c_5 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_c_5 = new AnimatorSet();
        setDownAndUp_txt_c_5.playSequentially(scaleDown_txt_c_5, scaleUp_txt_c_5);

        // Special guest | Animation for txt_c_6
        scaleDown_txt_c_6 = AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_c_6.setTarget(txt_c_6);

        scaleUp_txt_c_6 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_c_6 = new AnimatorSet();
        setDownAndUp_txt_c_6.playSequentially(scaleDown_txt_c_6, scaleUp_txt_c_6);

        // Special guest | Animation for txt_c_7
        scaleDown_txt_c_7 = AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_c_7.setTarget(txt_c_7);

        scaleUp_txt_c_7 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_c_7 = new AnimatorSet();
        setDownAndUp_txt_c_7.playSequentially(scaleDown_txt_c_7, scaleUp_txt_c_7);
        
        // Special guest | Animation for txt_c_8
        scaleDown_txt_c_8 = AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_c_8.setTarget(txt_c_8);

        scaleUp_txt_c_8 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_c_8 = new AnimatorSet();
        setDownAndUp_txt_c_8.playSequentially(scaleDown_txt_c_8, scaleUp_txt_c_8);
        
        // Special guest | Animation for txt_c_9
        scaleDown_txt_c_9 = AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_c_9.setTarget(txt_c_9);

        scaleUp_txt_c_9 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_c_9 = new AnimatorSet();
        setDownAndUp_txt_c_9.playSequentially(scaleDown_txt_c_9, scaleUp_txt_c_9);

        // Special guest | Animation for txt_d_2
        scaleDown_txt_d_2 = AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_d_2.setTarget(txt_d_2);

        scaleUp_txt_d_2 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_d_2 = new AnimatorSet();
        setDownAndUp_txt_d_2.playSequentially(scaleDown_txt_d_2, scaleUp_txt_d_2);

        // Special guest | Animation for txt_d_3
        scaleDown_txt_d_3 = AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_d_3.setTarget(txt_d_3);

        scaleUp_txt_d_3 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_d_3 = new AnimatorSet();
        setDownAndUp_txt_d_3.playSequentially(scaleDown_txt_d_3, scaleUp_txt_d_3);

        // Special guest | Animation for txt_d_4
        scaleDown_txt_d_4 = AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_d_4.setTarget(txt_d_4);

        scaleUp_txt_d_4 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_d_4 = new AnimatorSet();
        setDownAndUp_txt_d_4.playSequentially(scaleDown_txt_d_4, scaleUp_txt_d_4);

        // Special guest | Animation for txt_d_5
        scaleDown_txt_d_5 = AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_d_5.setTarget(txt_d_5);

        scaleUp_txt_d_5 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_d_5 = new AnimatorSet();
        setDownAndUp_txt_d_5.playSequentially(scaleDown_txt_d_5, scaleUp_txt_d_5);

        // Special guest | Animation for txt_d_6
        scaleDown_txt_d_6 = AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_d_6.setTarget(txt_d_6);

        scaleUp_txt_d_6 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_d_6 = new AnimatorSet();
        setDownAndUp_txt_d_6.playSequentially(scaleDown_txt_d_6, scaleUp_txt_d_6);

        // Special guest | Animation for txt_d_7
        scaleDown_txt_d_7 = AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_d_7.setTarget(txt_d_7);

        scaleUp_txt_d_7 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_d_7 = new AnimatorSet();
        setDownAndUp_txt_d_7.playSequentially(scaleDown_txt_d_7, scaleUp_txt_d_7);

        // Special guest | Animation for txt_d_8
        scaleDown_txt_d_8 = AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_d_8.setTarget(txt_d_8);

        scaleUp_txt_d_8 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_d_8 = new AnimatorSet();
        setDownAndUp_txt_d_8.playSequentially(scaleDown_txt_d_8, scaleUp_txt_d_8);

        // Special guest | Animation for txt_d_9
        scaleDown_txt_d_9 = AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_d_9.setTarget(txt_d_9);

        scaleUp_txt_d_9 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_d_9 = new AnimatorSet();
        setDownAndUp_txt_d_9.playSequentially(scaleDown_txt_d_9, scaleUp_txt_d_9);

        // Special guest | Animation for txt_e_2
        scaleDown_txt_e_2 = AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_e_2.setTarget(txt_e_2);

        scaleUp_txt_e_2 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_e_2 = new AnimatorSet();
        setDownAndUp_txt_e_2.playSequentially(scaleDown_txt_e_2, scaleUp_txt_e_2);

        // Special guest | Animation for txt_e_3
        scaleDown_txt_e_3 = AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_e_3.setTarget(txt_e_3);

        scaleUp_txt_e_3 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_e_3 = new AnimatorSet();
        setDownAndUp_txt_e_3.playSequentially(scaleDown_txt_e_3, scaleUp_txt_e_3);

        // Special guest | Animation for txt_e_4
        scaleDown_txt_e_4 = AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_e_4.setTarget(txt_e_4);

        scaleUp_txt_e_4 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_e_4 = new AnimatorSet();
        setDownAndUp_txt_e_4.playSequentially(scaleDown_txt_e_4, scaleUp_txt_e_4);

        // Special guest | Animation for txt_e_5
        scaleDown_txt_e_5 = AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_e_5.setTarget(txt_e_5);

        scaleUp_txt_e_5 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_e_5 = new AnimatorSet();
        setDownAndUp_txt_e_5.playSequentially(scaleDown_txt_e_5, scaleUp_txt_e_5);

        // Special guest | Animation for txt_e_6
        scaleDown_txt_e_6 = AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_e_6.setTarget(txt_e_6);

        scaleUp_txt_e_6 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_e_6 = new AnimatorSet();
        setDownAndUp_txt_e_6.playSequentially(scaleDown_txt_e_6, scaleUp_txt_e_6);

        // Special guest | Animation for txt_e_7
        scaleDown_txt_e_7 = AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_e_7.setTarget(txt_e_7);

        scaleUp_txt_e_7 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_e_7 = new AnimatorSet();
        setDownAndUp_txt_e_7.playSequentially(scaleDown_txt_e_7, scaleUp_txt_e_7);

        // Special guest | Animation for txt_e_8
        scaleDown_txt_e_8 = AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_e_8.setTarget(txt_e_8);

        scaleUp_txt_e_8 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_e_8 = new AnimatorSet();
        setDownAndUp_txt_e_8.playSequentially(scaleDown_txt_e_8, scaleUp_txt_e_8);

        // Special guest | Animation for txt_e_9
        scaleDown_txt_e_9 = AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_e_9.setTarget(txt_e_9);

        scaleUp_txt_e_9 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_e_9 = new AnimatorSet();
        setDownAndUp_txt_e_9.playSequentially(scaleDown_txt_e_9, scaleUp_txt_e_9);

        // Special guest | Animation for txt_f_2
        scaleDown_txt_f_2 = AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_f_2.setTarget(txt_f_2);

        scaleUp_txt_f_2 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_f_2 = new AnimatorSet();
        setDownAndUp_txt_f_2.playSequentially(scaleDown_txt_f_2, scaleUp_txt_f_2);

        // Special guest | Animation for txt_f_3
        scaleDown_txt_f_3 = AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_f_3.setTarget(txt_f_3);

        scaleUp_txt_f_3 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_f_3 = new AnimatorSet();
        setDownAndUp_txt_f_3.playSequentially(scaleDown_txt_f_3, scaleUp_txt_f_3);

        // Special guest | Animation for txt_f_4
        scaleDown_txt_f_4 = AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_f_4.setTarget(txt_f_4);

        scaleUp_txt_f_4 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_f_4 = new AnimatorSet();
        setDownAndUp_txt_f_4.playSequentially(scaleDown_txt_f_4, scaleUp_txt_f_4);

        // Special guest | Animation for txt_f_5
        scaleDown_txt_f_5 = AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_f_5.setTarget(txt_f_5);

        scaleUp_txt_f_5 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_f_5 = new AnimatorSet();
        setDownAndUp_txt_f_5.playSequentially(scaleDown_txt_f_5, scaleUp_txt_f_5);

        // Special guest | Animation for txt_f_6
        scaleDown_txt_f_6 = AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_f_6.setTarget(txt_f_6);

        scaleUp_txt_f_6 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_f_6 = new AnimatorSet();
        setDownAndUp_txt_f_6.playSequentially(scaleDown_txt_f_6, scaleUp_txt_f_6);

        // Special guest | Animation for txt_f_7
        scaleDown_txt_f_7 = AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_f_7.setTarget(txt_f_7);

        scaleUp_txt_f_7 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_f_7 = new AnimatorSet();
        setDownAndUp_txt_f_7.playSequentially(scaleDown_txt_f_7, scaleUp_txt_f_7);

        // Special guest | Animation for txt_f_8
        scaleDown_txt_f_8 = AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_f_8.setTarget(txt_f_8);

        scaleUp_txt_f_8 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_f_8 = new AnimatorSet();
        setDownAndUp_txt_f_8.playSequentially(scaleDown_txt_f_8, scaleUp_txt_f_8);

        // Special guest | Animation for txt_f_9
        scaleDown_txt_f_9= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_f_9.setTarget(txt_f_9);

        scaleUp_txt_f_9 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_f_9 = new AnimatorSet();
        setDownAndUp_txt_f_9.playSequentially(scaleDown_txt_f_9, scaleUp_txt_f_9);

        // Special guest | Animation for txt_g_2
        scaleDown_txt_g_2= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_g_2.setTarget(txt_g_2);

        scaleUp_txt_g_2 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_g_2 = new AnimatorSet();
        setDownAndUp_txt_g_2.playSequentially(scaleDown_txt_g_2, scaleUp_txt_g_2);

        // Special guest | Animation for txt_g_3
        scaleDown_txt_g_3= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_g_3.setTarget(txt_g_3);

        scaleUp_txt_g_3 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_g_3 = new AnimatorSet();
        setDownAndUp_txt_g_3.playSequentially(scaleDown_txt_g_3, scaleUp_txt_g_3);

        // Special guest | Animation for txt_g_4
        scaleDown_txt_g_4= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_g_4.setTarget(txt_g_4);

        scaleUp_txt_g_4 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_g_4 = new AnimatorSet();
        setDownAndUp_txt_g_4.playSequentially(scaleDown_txt_g_4, scaleUp_txt_g_4);

        // Special guest | Animation for txt_g_5
        scaleDown_txt_g_5= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_g_5.setTarget(txt_g_5);

        scaleUp_txt_g_5 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_g_5 = new AnimatorSet();
        setDownAndUp_txt_g_5.playSequentially(scaleDown_txt_g_5, scaleUp_txt_g_5);

        // Special guest | Animation for txt_g_6
        scaleDown_txt_g_6= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_g_6.setTarget(txt_g_6);

        scaleUp_txt_g_6 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_g_6 = new AnimatorSet();
        setDownAndUp_txt_g_6.playSequentially(scaleDown_txt_g_6, scaleUp_txt_g_6);

        // Special guest | Animation for txt_g_7
        scaleDown_txt_g_7= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_g_7.setTarget(txt_g_7);

        scaleUp_txt_g_7 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_g_7 = new AnimatorSet();
        setDownAndUp_txt_g_7.playSequentially(scaleDown_txt_g_7, scaleUp_txt_g_7);

        // Special guest | Animation for txt_g_8
        scaleDown_txt_g_8= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_g_8.setTarget(txt_g_8);

        scaleUp_txt_g_8 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_g_8 = new AnimatorSet();
        setDownAndUp_txt_g_8.playSequentially(scaleDown_txt_g_8, scaleUp_txt_g_8);

        // Special guest | Animation for txt_g_9
        scaleDown_txt_g_9= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_g_9.setTarget(txt_g_9);

        scaleUp_txt_g_9 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_g_9 = new AnimatorSet();
        setDownAndUp_txt_g_9.playSequentially(scaleDown_txt_g_9, scaleUp_txt_g_9);

        // Special guest | Animation for txt_h_2
        scaleDown_txt_h_2= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_h_2.setTarget(txt_h_2);

        scaleUp_txt_h_2 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_h_2 = new AnimatorSet();
        setDownAndUp_txt_h_2.playSequentially(scaleDown_txt_h_2, scaleUp_txt_h_2);

        // Special guest | Animation for txt_h_3
        scaleDown_txt_h_3= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_h_3.setTarget(txt_h_3);

        scaleUp_txt_h_3 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_h_3 = new AnimatorSet();
        setDownAndUp_txt_h_3.playSequentially(scaleDown_txt_h_3, scaleUp_txt_h_3);

        // Special guest | Animation for txt_h_4
        scaleDown_txt_h_4= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_h_4.setTarget(txt_h_4);

        scaleUp_txt_h_4 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_h_4 = new AnimatorSet();
        setDownAndUp_txt_h_4.playSequentially(scaleDown_txt_h_4, scaleUp_txt_h_4);

        // Special guest | Animation for txt_h_5
        scaleDown_txt_h_5= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_h_5.setTarget(txt_h_5);

        scaleUp_txt_h_5 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_h_5 = new AnimatorSet();
        setDownAndUp_txt_h_5.playSequentially(scaleDown_txt_h_5, scaleUp_txt_h_5);

        // Special guest | Animation for txt_h_6
        scaleDown_txt_h_6= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_h_6.setTarget(txt_h_6);

        scaleUp_txt_h_6 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_h_6 = new AnimatorSet();
        setDownAndUp_txt_h_6.playSequentially(scaleDown_txt_h_6, scaleUp_txt_h_6);

        // Special guest | Animation for txt_h_7
        scaleDown_txt_h_7 = AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_h_7 .setTarget(txt_h_7);

        scaleUp_txt_h_7 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_h_7 = new AnimatorSet();
        setDownAndUp_txt_h_7.playSequentially(scaleDown_txt_h_7, scaleUp_txt_h_7);

        // Special guest | Animation for txt_h_8
        scaleDown_txt_h_8= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_h_8.setTarget(txt_h_8);

        scaleUp_txt_h_8 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_h_8 = new AnimatorSet();
        setDownAndUp_txt_h_8.playSequentially(scaleDown_txt_h_8, scaleUp_txt_h_8);

        // Special guest | Animation for txt_h_9
        scaleDown_txt_h_9= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_h_9.setTarget(txt_h_9);

        scaleUp_txt_h_9 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_h_9 = new AnimatorSet();
        setDownAndUp_txt_h_9.playSequentially(scaleDown_txt_h_9, scaleUp_txt_h_9);

        // Special guest | Animation for txt_i_2
        scaleDown_txt_i_2= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_i_2.setTarget(txt_i_2);

        scaleUp_txt_i_2 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_i_2 = new AnimatorSet();
        setDownAndUp_txt_i_2.playSequentially(scaleDown_txt_i_2, scaleUp_txt_i_2);

        // Special guest | Animation for txt_i_3
        scaleDown_txt_i_3= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_i_3.setTarget(txt_i_3);

        scaleUp_txt_i_3 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_i_3 = new AnimatorSet();
        setDownAndUp_txt_i_3.playSequentially(scaleDown_txt_i_3, scaleUp_txt_i_3);

        // Special guest | Animation for txt_i_4
        scaleDown_txt_i_4= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_i_4.setTarget(txt_i_4);

        scaleUp_txt_i_4 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_i_4 = new AnimatorSet();
        setDownAndUp_txt_i_4.playSequentially(scaleDown_txt_i_4, scaleUp_txt_i_4);

        // Special guest | Animation for txt_i_5
        scaleDown_txt_i_5= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_i_5.setTarget(txt_i_5);

        scaleUp_txt_i_5 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_i_5 = new AnimatorSet();
        setDownAndUp_txt_i_5.playSequentially(scaleDown_txt_i_5, scaleUp_txt_i_5);

        // Special guest | Animation for txt_i_6
        scaleDown_txt_i_6= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_i_6.setTarget(txt_i_6);

        scaleUp_txt_i_6 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_i_6 = new AnimatorSet();
        setDownAndUp_txt_i_6.playSequentially(scaleDown_txt_i_6, scaleUp_txt_i_6);

        // Special guest | Animation for txt_i_7
        scaleDown_txt_i_7= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_i_7.setTarget(txt_i_7);

        scaleUp_txt_i_7 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_i_7 = new AnimatorSet();
        setDownAndUp_txt_i_7.playSequentially(scaleDown_txt_i_7, scaleUp_txt_i_7);

        // Special guest | Animation for txt_i_8
        scaleDown_txt_i_8= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_i_8.setTarget(txt_i_8);

        scaleUp_txt_i_8 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_i_8 = new AnimatorSet();
        setDownAndUp_txt_i_8.playSequentially(scaleDown_txt_i_8, scaleUp_txt_i_8);

        // Special guest | Animation for txt_i_9
        scaleDown_txt_i_9= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_i_9.setTarget(txt_i_9);

        scaleUp_txt_i_9 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_i_9 = new AnimatorSet();
        setDownAndUp_txt_i_9.playSequentially(scaleDown_txt_i_9, scaleUp_txt_i_9);

        // Special guest | Animation for txt_j_2
        scaleDown_txt_j_2= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_j_2.setTarget(txt_j_2);

        scaleUp_txt_j_2 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_j_2 = new AnimatorSet();
        setDownAndUp_txt_j_2.playSequentially(scaleDown_txt_j_2, scaleUp_txt_j_2);

        // Special guest | Animation for txt_j_3
        scaleDown_txt_j_3= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_j_3.setTarget(txt_j_3);

        scaleUp_txt_j_3 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_j_3 = new AnimatorSet();
        setDownAndUp_txt_j_3.playSequentially(scaleDown_txt_j_3, scaleUp_txt_j_3);

        // Special guest | Animation for txt_j_4
        scaleDown_txt_j_4= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_j_4.setTarget(txt_j_4);

        scaleUp_txt_j_4 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_j_4 = new AnimatorSet();
        setDownAndUp_txt_j_4.playSequentially(scaleDown_txt_j_4, scaleUp_txt_j_4);

        // Special guest | Animation for txt_j_5
        scaleDown_txt_j_5= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_j_5.setTarget(txt_j_5);

        scaleUp_txt_j_5 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_j_5 = new AnimatorSet();
        setDownAndUp_txt_j_5.playSequentially(scaleDown_txt_j_5, scaleUp_txt_j_5);

        // Special guest | Animation for txt_j_6
        scaleDown_txt_j_6= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_j_6.setTarget(txt_j_6);

        scaleUp_txt_j_6 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_j_6 = new AnimatorSet();
        setDownAndUp_txt_j_6.playSequentially(scaleDown_txt_j_6, scaleUp_txt_j_6);

        // Special guest | Animation for txt_j_7
        scaleDown_txt_j_7= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_j_7.setTarget(txt_j_7);

        scaleUp_txt_j_7 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_j_7 = new AnimatorSet();
        setDownAndUp_txt_j_7.playSequentially(scaleDown_txt_j_7, scaleUp_txt_j_7);

        // Special guest | Animation for txt_j_8
        scaleDown_txt_j_8= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_j_8.setTarget(txt_j_8);

        scaleUp_txt_j_8 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_j_8 = new AnimatorSet();
        setDownAndUp_txt_j_8.playSequentially(scaleDown_txt_j_8, scaleUp_txt_j_8);

        // Special guest | Animation for txt_j_9
        scaleDown_txt_j_9= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_j_9.setTarget(txt_j_9);

        scaleUp_txt_j_9 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_j_9 = new AnimatorSet();
        setDownAndUp_txt_j_9.playSequentially(scaleDown_txt_j_9, scaleUp_txt_j_9);

        // Special guest | Animation for txt_k_2
        scaleDown_txt_k_2= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_k_2.setTarget(txt_k_2);

        scaleUp_txt_k_2 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_k_2 = new AnimatorSet();
        setDownAndUp_txt_k_2.playSequentially(scaleDown_txt_k_2, scaleUp_txt_k_2);

        // Special guest | Animation for txt_k_3
        scaleDown_txt_k_3= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_k_3.setTarget(txt_k_3);

        scaleUp_txt_k_3 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_k_3 = new AnimatorSet();
        setDownAndUp_txt_k_3.playSequentially(scaleDown_txt_k_3, scaleUp_txt_k_3);

        // Special guest | Animation for txt_k_4
        scaleDown_txt_k_4= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_k_4.setTarget(txt_k_4);

        scaleUp_txt_k_4 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_k_4 = new AnimatorSet();
        setDownAndUp_txt_k_4.playSequentially(scaleDown_txt_k_4, scaleUp_txt_k_4);

        // Special guest | Animation for txt_k_5
        scaleDown_txt_k_5= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_k_5.setTarget(txt_k_5);

        scaleUp_txt_k_5 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_k_5 = new AnimatorSet();
        setDownAndUp_txt_k_5.playSequentially(scaleDown_txt_k_5, scaleUp_txt_k_5);

        // Special guest | Animation for txt_k_6
        scaleDown_txt_k_6= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_k_6.setTarget(txt_k_6);

        scaleUp_txt_k_6 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_k_6 = new AnimatorSet();
        setDownAndUp_txt_k_6.playSequentially(scaleDown_txt_k_6, scaleUp_txt_k_6);

        // Special guest | Animation for txt_k_7
        scaleDown_txt_k_7= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_k_7.setTarget(txt_k_7);

        scaleUp_txt_k_7 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_k_7 = new AnimatorSet();
        setDownAndUp_txt_k_7.playSequentially(scaleDown_txt_k_7, scaleUp_txt_k_7);

        // Special guest | Animation for txt_k_8
        scaleDown_txt_k_8= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_k_8.setTarget(txt_k_8);

        scaleUp_txt_k_8 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_k_8 = new AnimatorSet();
        setDownAndUp_txt_k_8.playSequentially(scaleDown_txt_k_8, scaleUp_txt_k_8);

        // Special guest | Animation for txt_k_9
        scaleDown_txt_k_9= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_k_9.setTarget(txt_k_9);

        scaleUp_txt_k_9 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_k_9 = new AnimatorSet();
        setDownAndUp_txt_k_9.playSequentially(scaleDown_txt_k_9, scaleUp_txt_k_9);

        // Special guest | Animation for txt_l_2
        scaleDown_txt_l_2= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_l_2.setTarget(txt_l_2);

        scaleUp_txt_l_2 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_l_2 = new AnimatorSet();
        setDownAndUp_txt_l_2.playSequentially(scaleDown_txt_l_2, scaleUp_txt_l_2);

        // Special guest | Animation for txt_l_3
        scaleDown_txt_l_3= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_l_3.setTarget(txt_l_3);

        scaleUp_txt_l_3 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_l_3 = new AnimatorSet();
        setDownAndUp_txt_l_3.playSequentially(scaleDown_txt_l_3, scaleUp_txt_l_3);

        // Special guest | Animation for txt_l_4
        scaleDown_txt_l_4= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_l_4.setTarget(txt_l_4);

        scaleUp_txt_l_4 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_l_4 = new AnimatorSet();
        setDownAndUp_txt_l_4.playSequentially(scaleDown_txt_l_4, scaleUp_txt_l_4);

        // Special guest | Animation for txt_l_5
        scaleDown_txt_l_5= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_l_5.setTarget(txt_l_5);

        scaleUp_txt_l_5 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_l_5 = new AnimatorSet();
        setDownAndUp_txt_l_5.playSequentially(scaleDown_txt_l_5, scaleUp_txt_l_5);

        // Special guest | Animation for txt_l_6
        scaleDown_txt_l_6= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_l_6.setTarget(txt_l_6);

        scaleUp_txt_l_6 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_l_6 = new AnimatorSet();
        setDownAndUp_txt_l_6.playSequentially(scaleDown_txt_l_6, scaleUp_txt_l_6);

        // Special guest | Animation for txt_l_7
        scaleDown_txt_l_7= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_l_7.setTarget(txt_l_7);

        scaleUp_txt_l_7 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_l_7 = new AnimatorSet();
        setDownAndUp_txt_l_7.playSequentially(scaleDown_txt_l_7, scaleUp_txt_l_7);

        // Special guest | Animation for txt_l_8
        scaleDown_txt_l_8= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_l_8.setTarget(txt_l_8);

        scaleUp_txt_l_8 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_l_8 = new AnimatorSet();
        setDownAndUp_txt_l_8.playSequentially(scaleDown_txt_l_8, scaleUp_txt_l_8);

        // Special guest | Animation for txt_l_9
        scaleDown_txt_l_9= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_l_9.setTarget(txt_l_9);

        scaleUp_txt_l_9 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_l_9 = new AnimatorSet();
        setDownAndUp_txt_l_9.playSequentially(scaleDown_txt_l_9, scaleUp_txt_l_9);

        // Special guest | Animation for txt_m_2
        scaleDown_txt_m_2= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_m_2.setTarget(txt_m_2);

        scaleUp_txt_m_2 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_m_2 = new AnimatorSet();
        setDownAndUp_txt_m_2.playSequentially(scaleDown_txt_m_2, scaleUp_txt_m_2);

        // Special guest | Animation for txt_m_3
        scaleDown_txt_m_3= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_m_3.setTarget(txt_m_3);

        scaleUp_txt_m_3 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_m_3 = new AnimatorSet();
        setDownAndUp_txt_m_3.playSequentially(scaleDown_txt_m_3, scaleUp_txt_m_3);

        // Special guest | Animation for txt_m_4
        scaleDown_txt_m_4= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_m_4.setTarget(txt_m_4);

        scaleUp_txt_m_4 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_m_4 = new AnimatorSet();
        setDownAndUp_txt_m_4.playSequentially(scaleDown_txt_m_4, scaleUp_txt_m_4);

        // Special guest | Animation for txt_m_5
        scaleDown_txt_m_5= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_m_5.setTarget(txt_m_5);

        scaleUp_txt_m_5 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_m_5 = new AnimatorSet();
        setDownAndUp_txt_m_5.playSequentially(scaleDown_txt_m_5, scaleUp_txt_m_5);

        // Special guest | Animation for txt_m_6
        scaleDown_txt_m_6= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_m_6.setTarget(txt_m_6);

        scaleUp_txt_m_6 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_m_6 = new AnimatorSet();
        setDownAndUp_txt_m_6.playSequentially(scaleDown_txt_m_6, scaleUp_txt_m_6);

        // Special guest | Animation for txt_m_7
        scaleDown_txt_m_7= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_m_7.setTarget(txt_m_7);

        scaleUp_txt_m_7 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_m_7 = new AnimatorSet();
        setDownAndUp_txt_m_7.playSequentially(scaleDown_txt_m_7, scaleUp_txt_m_7);

        // Special guest | Animation for txt_m_8
        scaleDown_txt_m_8= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_m_8.setTarget(txt_m_8);

        scaleUp_txt_m_8 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_m_8 = new AnimatorSet();
        setDownAndUp_txt_m_8.playSequentially(scaleDown_txt_m_8, scaleUp_txt_m_8);

        // Special guest | Animation for txt_m_9
        scaleDown_txt_m_9= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_m_9.setTarget(txt_m_9);

        scaleUp_txt_m_9 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_m_9 = new AnimatorSet();
        setDownAndUp_txt_m_9.playSequentially(scaleDown_txt_m_9, scaleUp_txt_m_9);

        // Special guest | Animation for txt_n_2
        scaleDown_txt_n_2= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_n_2.setTarget(txt_n_2);

        scaleUp_txt_n_2 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_n_2 = new AnimatorSet();
        setDownAndUp_txt_n_2.playSequentially(scaleDown_txt_n_2, scaleUp_txt_n_2);

        // Special guest | Animation for txt_n_3
        scaleDown_txt_n_3= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_n_3.setTarget(txt_n_3);

        scaleUp_txt_n_3 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_n_3 = new AnimatorSet();
        setDownAndUp_txt_n_3.playSequentially(scaleDown_txt_n_3, scaleUp_txt_n_3);

        // Special guest | Animation for txt_n_4
        scaleDown_txt_n_4= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_n_4.setTarget(txt_n_4);

        scaleUp_txt_n_4 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_n_4 = new AnimatorSet();
        setDownAndUp_txt_n_4.playSequentially(scaleDown_txt_n_4, scaleUp_txt_n_4);

        // Special guest | Animation for txt_n_5
        scaleDown_txt_n_5= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_n_5.setTarget(txt_n_5);

        scaleUp_txt_n_5 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_n_5 = new AnimatorSet();
        setDownAndUp_txt_n_5.playSequentially(scaleDown_txt_n_5, scaleUp_txt_n_5);

        // Special guest | Animation for txt_n_6
        scaleDown_txt_n_6= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_n_6.setTarget(txt_n_6);

        scaleUp_txt_n_6 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_n_6 = new AnimatorSet();
        setDownAndUp_txt_n_6.playSequentially(scaleDown_txt_n_6, scaleUp_txt_n_6);

        // Special guest | Animation for txt_n_7
        scaleDown_txt_n_7= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_n_7.setTarget(txt_n_7);

        scaleUp_txt_n_7 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_n_7 = new AnimatorSet();
        setDownAndUp_txt_n_7.playSequentially(scaleDown_txt_n_7, scaleUp_txt_n_7);

        // Special guest | Animation for txt_n_8
        scaleDown_txt_n_8= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_n_8.setTarget(txt_n_8);

        scaleUp_txt_n_8 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_n_8 = new AnimatorSet();
        setDownAndUp_txt_n_8.playSequentially(scaleDown_txt_n_8, scaleUp_txt_n_8);

        // Special guest | Animation for txt_n_9
        scaleDown_txt_n_9= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_n_9.setTarget(txt_n_9);

        scaleUp_txt_n_9 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_n_9 = new AnimatorSet();
        setDownAndUp_txt_n_9.playSequentially(scaleDown_txt_n_9, scaleUp_txt_n_9);

        // Special guest | Animation for txt_o_2
        scaleDown_txt_o_2= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_o_2.setTarget(txt_o_2);

        scaleUp_txt_o_2 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_o_2 = new AnimatorSet();
        setDownAndUp_txt_o_2.playSequentially(scaleDown_txt_o_2, scaleUp_txt_o_2);

        // Special guest | Animation for txt_o_3
        scaleDown_txt_o_3= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_o_3.setTarget(txt_o_3);

        scaleUp_txt_o_3 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_o_3 = new AnimatorSet();
        setDownAndUp_txt_o_3.playSequentially(scaleDown_txt_o_3, scaleUp_txt_o_3);

        // Special guest | Animation for txt_o_4
        scaleDown_txt_o_4= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_o_4.setTarget(txt_o_4);

        scaleUp_txt_o_4 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_o_4 = new AnimatorSet();
        setDownAndUp_txt_o_4.playSequentially(scaleDown_txt_o_4, scaleUp_txt_o_4);

        // Special guest | Animation for txt_o_5
        scaleDown_txt_o_5= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_o_5.setTarget(txt_o_5);

        scaleUp_txt_o_5 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_o_5 = new AnimatorSet();
        setDownAndUp_txt_o_5.playSequentially(scaleDown_txt_o_5, scaleUp_txt_o_5);

        // Special guest | Animation for txt_o_6
        scaleDown_txt_o_6= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_o_6.setTarget(txt_o_6);

        scaleUp_txt_o_6 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_o_6 = new AnimatorSet();
        setDownAndUp_txt_o_6.playSequentially(scaleDown_txt_o_6, scaleUp_txt_o_6);

        // Special guest | Animation for txt_o_7
        scaleDown_txt_o_7= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_o_7.setTarget(txt_o_7);

        scaleUp_txt_o_7 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_o_7 = new AnimatorSet();
        setDownAndUp_txt_o_7.playSequentially(scaleDown_txt_o_7, scaleUp_txt_o_7);

        // Special guest | Animation for txt_o_8
        scaleDown_txt_o_8= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_o_8.setTarget(txt_o_8);

        scaleUp_txt_o_8 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_o_8 = new AnimatorSet();
        setDownAndUp_txt_o_8.playSequentially(scaleDown_txt_o_8, scaleUp_txt_o_8);

        // Special guest | Animation for txt_o_9
        scaleDown_txt_o_9= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_o_9.setTarget(txt_o_9);

        scaleUp_txt_o_9 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_o_9 = new AnimatorSet();
        setDownAndUp_txt_o_9.playSequentially(scaleDown_txt_o_9, scaleUp_txt_o_9);

        // Special guest | Animation for txt_p_2
        scaleDown_txt_p_2= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_p_2.setTarget(txt_p_2);

        scaleUp_txt_p_2 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_p_2 = new AnimatorSet();
        setDownAndUp_txt_p_2.playSequentially(scaleDown_txt_p_2, scaleUp_txt_p_2);

        // Special guest | Animation for txt_p_3
        scaleDown_txt_p_3= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_p_3.setTarget(txt_p_3);

        scaleUp_txt_p_3 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_p_3 = new AnimatorSet();
        setDownAndUp_txt_p_3.playSequentially(scaleDown_txt_p_3, scaleUp_txt_p_3);

        // Special guest | Animation for txt_p_4
        scaleDown_txt_p_4= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_p_4.setTarget(txt_p_4);

        scaleUp_txt_p_4 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_p_4 = new AnimatorSet();
        setDownAndUp_txt_p_4.playSequentially(scaleDown_txt_p_4, scaleUp_txt_p_4);

        // Special guest | Animation for txt_p_5
        scaleDown_txt_p_5= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_p_5.setTarget(txt_p_5);

        scaleUp_txt_p_5 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_p_5 = new AnimatorSet();
        setDownAndUp_txt_p_5.playSequentially(scaleDown_txt_p_5, scaleUp_txt_p_5);

        // Special guest | Animation for txt_p_6
        scaleDown_txt_p_6= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_p_6.setTarget(txt_p_6);

        scaleUp_txt_p_6 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_p_6 = new AnimatorSet();
        setDownAndUp_txt_p_6.playSequentially(scaleDown_txt_p_6, scaleUp_txt_p_6);

        // Special guest | Animation for txt_p_7
        scaleDown_txt_p_7= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_p_7.setTarget(txt_p_7);

        scaleUp_txt_p_7 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_p_7 = new AnimatorSet();
        setDownAndUp_txt_p_7.playSequentially(scaleDown_txt_p_7, scaleUp_txt_p_7);

        // Special guest | Animation for txt_p_8
        scaleDown_txt_p_8= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_p_8.setTarget(txt_p_8);

        scaleUp_txt_p_8 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_p_8 = new AnimatorSet();
        setDownAndUp_txt_p_8.playSequentially(scaleDown_txt_p_8, scaleUp_txt_p_8);

        // Special guest | Animation for txt_p_9
        scaleDown_txt_p_9= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_p_9.setTarget(txt_p_9);

        scaleUp_txt_p_9 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_p_9 = new AnimatorSet();
        setDownAndUp_txt_p_9.playSequentially(scaleDown_txt_p_9, scaleUp_txt_p_9);

        // Special guest | Animation for txt_q_2
        scaleDown_txt_q_2= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_q_2.setTarget(txt_q_2);

        scaleUp_txt_q_2 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_q_2 = new AnimatorSet();
        setDownAndUp_txt_q_2.playSequentially(scaleDown_txt_q_2, scaleUp_txt_q_2);

        // Special guest | Animation for txt_q_3
        scaleDown_txt_q_3= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_q_3.setTarget(txt_q_3);

        scaleUp_txt_q_3 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_q_3 = new AnimatorSet();
        setDownAndUp_txt_q_3.playSequentially(scaleDown_txt_q_3, scaleUp_txt_q_3);

        // Special guest | Animation for txt_q_4
        scaleDown_txt_q_4= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_q_4.setTarget(txt_q_4);

        scaleUp_txt_q_4 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_q_4 = new AnimatorSet();
        setDownAndUp_txt_q_4.playSequentially(scaleDown_txt_q_4, scaleUp_txt_q_4);

        // Special guest | Animation for txt_q_5
        scaleDown_txt_q_5= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_q_5.setTarget(txt_q_5);

        scaleUp_txt_q_5 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_q_5 = new AnimatorSet();
        setDownAndUp_txt_q_5.playSequentially(scaleDown_txt_q_5, scaleUp_txt_q_5);

        // Special guest | Animation for txt_q_6
        scaleDown_txt_q_6= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_q_6.setTarget(txt_q_6);

        scaleUp_txt_q_6 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_q_6 = new AnimatorSet();
        setDownAndUp_txt_q_6.playSequentially(scaleDown_txt_q_6, scaleUp_txt_q_6);

        // Special guest | Animation for txt_q_7
        scaleDown_txt_q_7= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_q_7.setTarget(txt_q_7);

        scaleUp_txt_q_7 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_q_7 = new AnimatorSet();
        setDownAndUp_txt_q_7.playSequentially(scaleDown_txt_q_7, scaleUp_txt_q_7);

        // Special guest | Animation for txt_q_8
        scaleDown_txt_q_8= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_q_8.setTarget(txt_q_8);

        scaleUp_txt_q_8 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_q_8 = new AnimatorSet();
        setDownAndUp_txt_q_8.playSequentially(scaleDown_txt_q_8, scaleUp_txt_q_8);

        // Special guest | Animation for txt_q_9
        scaleDown_txt_q_9= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_q_9.setTarget(txt_q_9);

        scaleUp_txt_q_9 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_q_9 = new AnimatorSet();
        setDownAndUp_txt_q_9.playSequentially(scaleDown_txt_q_9, scaleUp_txt_q_9);

        // Special guest | Animation for txt_r_2
        scaleDown_txt_r_2= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_r_2.setTarget(txt_r_2);

        scaleUp_txt_r_2 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_r_2 = new AnimatorSet();
        setDownAndUp_txt_r_2.playSequentially(scaleDown_txt_r_2, scaleUp_txt_r_2);

        // Special guest | Animation for txt_r_3
        scaleDown_txt_r_3= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_r_3.setTarget(txt_r_3);

        scaleUp_txt_r_3 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_r_3 = new AnimatorSet();
        setDownAndUp_txt_r_3.playSequentially(scaleDown_txt_r_3, scaleUp_txt_r_3);

        // Special guest | Animation for txt_r_4
        scaleDown_txt_r_4= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_r_4.setTarget(txt_r_4);

        scaleUp_txt_r_4 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_r_4 = new AnimatorSet();
        setDownAndUp_txt_r_4.playSequentially(scaleDown_txt_r_4, scaleUp_txt_r_4);

        // Special guest | Animation for txt_r_5
        scaleDown_txt_r_5= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_r_5.setTarget(txt_r_5);

        scaleUp_txt_r_5 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_r_5 = new AnimatorSet();
        setDownAndUp_txt_r_5.playSequentially(scaleDown_txt_r_5, scaleUp_txt_r_5);

        // Special guest | Animation for txt_r_6
        scaleDown_txt_r_6= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_r_6.setTarget(txt_r_6);

        scaleUp_txt_r_6 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_r_6 = new AnimatorSet();
        setDownAndUp_txt_r_6.playSequentially(scaleDown_txt_r_6, scaleUp_txt_r_6);

        // Special guest | Animation for txt_r_7
        scaleDown_txt_r_7= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_r_7.setTarget(txt_r_7);

        scaleUp_txt_r_7 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_r_7 = new AnimatorSet();
        setDownAndUp_txt_r_7.playSequentially(scaleDown_txt_r_7, scaleUp_txt_r_7);

        // Special guest | Animation for txt_r_8
        scaleDown_txt_r_8= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_r_8.setTarget(txt_r_8);

        scaleUp_txt_r_8 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_r_8 = new AnimatorSet();
        setDownAndUp_txt_r_8.playSequentially(scaleDown_txt_r_8, scaleUp_txt_r_8);

        // Special guest | Animation for txt_r_9
        scaleDown_txt_r_9= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_r_9.setTarget(txt_r_9);

        scaleUp_txt_r_9 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_r_9 = new AnimatorSet();
        setDownAndUp_txt_r_9.playSequentially(scaleDown_txt_r_9, scaleUp_txt_r_9);

        // Special guest | Animation for txt_s_2
        scaleDown_txt_s_2= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_s_2.setTarget(txt_s_2);

        scaleUp_txt_s_2 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_s_2 = new AnimatorSet();
        setDownAndUp_txt_s_2.playSequentially(scaleDown_txt_s_2, scaleUp_txt_s_2);

        // Special guest | Animation for txt_s_3
        scaleDown_txt_s_3= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_s_3.setTarget(txt_s_3);

        scaleUp_txt_s_3 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_s_3 = new AnimatorSet();
        setDownAndUp_txt_s_3.playSequentially(scaleDown_txt_s_3, scaleUp_txt_s_3);

        // Special guest | Animation for txt_s_4
        scaleDown_txt_s_4= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_s_4.setTarget(txt_s_4);

        scaleUp_txt_s_4 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_s_4 = new AnimatorSet();
        setDownAndUp_txt_s_4.playSequentially(scaleDown_txt_s_4, scaleUp_txt_s_4);

        // Special guest | Animation for txt_s_5
        scaleDown_txt_s_5= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_s_5.setTarget(txt_s_5);

        scaleUp_txt_s_5 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_s_5 = new AnimatorSet();
        setDownAndUp_txt_s_5.playSequentially(scaleDown_txt_s_5, scaleUp_txt_s_5);

        // Special guest | Animation for txt_s_6
        scaleDown_txt_s_6= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_s_6.setTarget(txt_s_6);

        scaleUp_txt_s_6 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_s_6 = new AnimatorSet();
        setDownAndUp_txt_s_6.playSequentially(scaleDown_txt_s_6, scaleUp_txt_s_6);

        // Special guest | Animation for txt_s_7
        scaleDown_txt_s_7= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_s_7.setTarget(txt_s_7);

        scaleUp_txt_s_7 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_s_7 = new AnimatorSet();
        setDownAndUp_txt_s_7.playSequentially(scaleDown_txt_s_7, scaleUp_txt_s_7);

        // Special guest | Animation for txt_s_8
        scaleDown_txt_s_8= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_s_8.setTarget(txt_s_8);

        scaleUp_txt_s_8 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_s_8 = new AnimatorSet();
        setDownAndUp_txt_s_8.playSequentially(scaleDown_txt_s_8, scaleUp_txt_s_8);

        // Special guest | Animation for txt_s_9
        scaleDown_txt_s_9= AnimatorInflater.loadAnimator(this, R.animator.scale_down);
        scaleDown_txt_s_9.setTarget(txt_s_9);

        scaleUp_txt_s_9 = AnimatorInflater.loadAnimator(this, R.animator.scale_up);

        setDownAndUp_txt_s_9 = new AnimatorSet();
        setDownAndUp_txt_s_9.playSequentially(scaleDown_txt_s_9, scaleUp_txt_s_9);

        // START
        setDownAndUp_txt_b_2.start();
        setDownAndUp_txt_b_3.start();
        setDownAndUp_txt_b_4.start();
        setDownAndUp_txt_b_5.start();
        setDownAndUp_txt_b_6.start();
        setDownAndUp_txt_b_7.start();
        setDownAndUp_txt_b_8.start();
        setDownAndUp_txt_b_9.start();

        setDownAndUp_txt_c_2.start();
        setDownAndUp_txt_c_3.start();
        setDownAndUp_txt_c_4.start();
        setDownAndUp_txt_c_5.start();
        setDownAndUp_txt_c_6.start();
        setDownAndUp_txt_c_7.start();
        setDownAndUp_txt_c_8.start();
        setDownAndUp_txt_c_9.start();

        setDownAndUp_txt_d_2.start();
        setDownAndUp_txt_d_3.start();
        setDownAndUp_txt_d_4.start();
        setDownAndUp_txt_d_5.start();
        setDownAndUp_txt_d_6.start();
        setDownAndUp_txt_d_7.start();
        setDownAndUp_txt_d_8.start();
        setDownAndUp_txt_d_9.start();

        setDownAndUp_txt_e_2.start();
        setDownAndUp_txt_e_3.start();
        setDownAndUp_txt_e_4.start();
        setDownAndUp_txt_e_5.start();
        setDownAndUp_txt_e_6.start();
        setDownAndUp_txt_e_7.start();
        setDownAndUp_txt_e_8.start();
        setDownAndUp_txt_e_9.start();

        setDownAndUp_txt_f_2.start();
        setDownAndUp_txt_f_3.start();
        setDownAndUp_txt_f_4.start();
        setDownAndUp_txt_f_5.start();
        setDownAndUp_txt_f_6.start();
        setDownAndUp_txt_f_7.start();
        setDownAndUp_txt_f_8.start();
        setDownAndUp_txt_f_9.start();

        setDownAndUp_txt_g_2.start();
        setDownAndUp_txt_g_3.start();
        setDownAndUp_txt_g_4.start();
        setDownAndUp_txt_g_5.start();
        setDownAndUp_txt_g_6.start();
        setDownAndUp_txt_g_7.start();
        setDownAndUp_txt_g_8.start();
        setDownAndUp_txt_g_9.start();

        setDownAndUp_txt_h_2.start();
        setDownAndUp_txt_h_3.start();
        setDownAndUp_txt_h_4.start();
        setDownAndUp_txt_h_5.start();
        setDownAndUp_txt_h_6.start();
        setDownAndUp_txt_h_7.start();
        setDownAndUp_txt_h_8.start();
        setDownAndUp_txt_h_9.start();

        setDownAndUp_txt_i_2.start();
        setDownAndUp_txt_i_3.start();
        setDownAndUp_txt_i_4.start();
        setDownAndUp_txt_i_5.start();
        setDownAndUp_txt_i_6.start();
        setDownAndUp_txt_i_7.start();
        setDownAndUp_txt_i_8.start();
        setDownAndUp_txt_i_9.start();

        setDownAndUp_txt_j_2.start();
        setDownAndUp_txt_j_3.start();
        setDownAndUp_txt_j_4.start();
        setDownAndUp_txt_j_5.start();
        setDownAndUp_txt_j_6.start();
        setDownAndUp_txt_j_7.start();
        setDownAndUp_txt_j_8.start();
        setDownAndUp_txt_j_9.start();

        setDownAndUp_txt_k_2.start();
        setDownAndUp_txt_k_3.start();
        setDownAndUp_txt_k_4.start();
        setDownAndUp_txt_k_5.start();
        setDownAndUp_txt_k_6.start();
        setDownAndUp_txt_k_7.start();
        setDownAndUp_txt_k_8.start();
        setDownAndUp_txt_k_9.start();

        setDownAndUp_txt_l_2.start();
        setDownAndUp_txt_l_3.start();
        setDownAndUp_txt_l_4.start();
        setDownAndUp_txt_l_5.start();
        setDownAndUp_txt_l_6.start();
        setDownAndUp_txt_l_7.start();
        setDownAndUp_txt_l_8.start();
        setDownAndUp_txt_l_9.start();

        setDownAndUp_txt_m_2.start();
        setDownAndUp_txt_m_3.start();
        setDownAndUp_txt_m_4.start();
        setDownAndUp_txt_m_5.start();
        setDownAndUp_txt_m_6.start();
        setDownAndUp_txt_m_7.start();
        setDownAndUp_txt_m_8.start();
        setDownAndUp_txt_m_9.start();

        setDownAndUp_txt_n_2.start();
        setDownAndUp_txt_n_3.start();
        setDownAndUp_txt_n_4.start();
        setDownAndUp_txt_n_5.start();
        setDownAndUp_txt_n_6.start();
        setDownAndUp_txt_n_7.start();
        setDownAndUp_txt_n_8.start();
        setDownAndUp_txt_n_9.start();

        setDownAndUp_txt_o_2.start();
        setDownAndUp_txt_o_3.start();
        setDownAndUp_txt_o_4.start();
        setDownAndUp_txt_o_5.start();
        setDownAndUp_txt_o_6.start();
        setDownAndUp_txt_o_7.start();
        setDownAndUp_txt_o_8.start();
        setDownAndUp_txt_o_9.start();

        setDownAndUp_txt_p_2.start();
        setDownAndUp_txt_p_3.start();
        setDownAndUp_txt_p_4.start();
        setDownAndUp_txt_p_5.start();
        setDownAndUp_txt_p_6.start();
        setDownAndUp_txt_p_7.start();
        setDownAndUp_txt_p_8.start();
        setDownAndUp_txt_p_9.start();

        setDownAndUp_txt_q_2.start();
        setDownAndUp_txt_q_3.start();
        setDownAndUp_txt_q_4.start();
        setDownAndUp_txt_q_5.start();
        setDownAndUp_txt_q_6.start();
        setDownAndUp_txt_q_7.start();
        setDownAndUp_txt_q_8.start();
        setDownAndUp_txt_q_9.start();

        setDownAndUp_txt_r_2.start();
        setDownAndUp_txt_r_3.start();
        setDownAndUp_txt_r_4.start();
        setDownAndUp_txt_r_5.start();
        setDownAndUp_txt_r_6.start();
        setDownAndUp_txt_r_7.start();
        setDownAndUp_txt_r_8.start();
        setDownAndUp_txt_r_9.start();

        setDownAndUp_txt_s_2.start();
        setDownAndUp_txt_s_3.start();
        setDownAndUp_txt_s_4.start();
        setDownAndUp_txt_s_5.start();
        setDownAndUp_txt_s_6.start();
        setDownAndUp_txt_s_7.start();
        setDownAndUp_txt_s_8.start();
        setDownAndUp_txt_s_9.start();

    }

    public void StartAnimations() {
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
        }, 1300);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txt_letter_V.setVisibility(View.INVISIBLE);

            }
        }, 1300);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txt_letter_e.setAnimation(anim_letter_e_down);

            }
        }, 1400);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txt_letter_e.setVisibility(View.INVISIBLE);

            }
        }, 1400);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txt_letter_r_1.setAnimation(anim_letter_r_1_up);

            }
        }, 1500);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txt_letter_r_1.setVisibility(View.INVISIBLE);

            }
        }, 1500);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txt_letter_i_1.setAnimation(anim_letter_i_1_down);

            }
        }, 1600);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txt_letter_i_1.setVisibility(View.INVISIBLE);

            }
        }, 1600);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txt_letter_f.setAnimation(anim_letter_f_up);

            }
        }, 1700);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txt_letter_f.setVisibility(View.INVISIBLE);

            }
        }, 1700);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txt_letter_i_2.setAnimation(anim_letter_i_2_down);

            }
        }, 1800);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txt_letter_i_2.setVisibility(View.INVISIBLE);

            }
        }, 1800);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txt_letter_c.setAnimation(anim_letter_c_up);

            }
        }, 1900);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txt_letter_c.setVisibility(View.INVISIBLE);

            }
        }, 1900);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txt_letter_a.setAnimation(anim_letter_a_down);

            }
        }, 2000);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txt_letter_a.setVisibility(View.INVISIBLE);

            }
        }, 2000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txt_letter_t.setAnimation(anim_letter_t_up);

            }
        }, 2100);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txt_letter_t.setVisibility(View.INVISIBLE);

            }
        }, 2100);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txt_letter_o.setAnimation(anim_letter_o_down);

            }
        }, 2200);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txt_letter_o.setVisibility(View.INVISIBLE);

            }
        }, 2200);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txt_letter_r_2.setAnimation(anim_letter_r_2_up);

            }
        }, 2300);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txt_letter_r_2.setVisibility(View.INVISIBLE);

            }
        }, 2300);

        // Third round
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txt_letter_cnp_C.setVisibility(View.VISIBLE);

                setDownAndUp_C.start();
            }
        }, 2600);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txt_letter_cnp_N.setVisibility(View.VISIBLE);

                setDownAndUp_N.start();
            }
        }, 2900);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txt_letter_cnp_P.setVisibility(View.VISIBLE);

                setDownAndUp_P.start();
            }
        }, 3200);

        // Fourth round
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                RomanianFlagShowsUp();

                SetDrawableUpAndDownTXTS_UP();

            }
        }, 3800);

        // Fifth round
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                txt_letter_cnp_C.setVisibility(View.INVISIBLE);
                txt_letter_cnp_N.setVisibility(View.INVISIBLE);
                txt_letter_cnp_P.setVisibility(View.INVISIBLE);

            }
        }, 4500);

        // Final round
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txt_by_Stufflex.setVisibility(View.VISIBLE);
            }
        }, 5000);

        // Splash screen time-limit
        handler_special = new Handler();
        runnable_special = new Runnable() {
            @Override
            public void run() {
                Intent toMainActivity = new Intent(SplashActivity.this, MainActivity.class);
                SplashActivity.this.startActivity(toMainActivity);
                SplashActivity.this.finish();
            }
        };
        handler_special.postDelayed(runnable_special, 5700);

    }

    // Go to MainActivity
    public void GoToMainActivity() {
        Intent toMainActivity = new Intent(SplashActivity.this, MainActivity.class);
        SplashActivity.this.startActivity(toMainActivity);
        SplashActivity.this.finish();
    }
}