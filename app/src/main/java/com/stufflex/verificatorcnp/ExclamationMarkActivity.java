package com.stufflex.verificatorcnp;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ExclamationMarkActivity extends AppCompatActivity {

    // Declarations
    private TextView txt_de_retinut, txt_explicatii;

    private Button btn_exclamation_mark;

    private ScrollView scrollLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exclamation_mark);

        // Navbar-fullscreen
        hideNavigationBar();

        // Initializations
        txt_de_retinut = findViewById(R.id.txt_de_retinut);
        txt_explicatii = findViewById(R.id.txt_explicatii);

        btn_exclamation_mark = findViewById(R.id.btn_exclamation_mark);

        scrollLayout = findViewById(R.id.scrollLayout);


        
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

    public void GoToMainActivity(View v){
        super.onBackPressed();

    }
}