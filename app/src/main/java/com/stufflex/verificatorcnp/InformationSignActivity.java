package com.stufflex.verificatorcnp;

import android.content.DialogInterface;
import android.os.Handler;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class InformationSignActivity extends AppCompatActivity {

    // Declarations
    private ConstraintLayout mainLayout;

    private Button btn_exclamation_mark, btn_sexul, btn_anul, btn_luna, btn_ziua, btn_judetul, btn_numar_secvential, btn_cifra_de_control, btn_important;

    private Animation anim_txt_titlu, anim_btn_sexul, anim_btn_anul, anim_btn_luna, anim_btn_ziua, anim_btn_judetul, anim_btn_numar_secvential, anim_btn_cifra_de_control, anim_btn_important;

    private TextView txt_informatii;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_sign);

        // Navbar-fullscreen
        hideNavigationBar();

        // Disable screenshot option by using FLAG_SECURE
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);

        // Initializations
        btn_exclamation_mark = findViewById(R.id.btn_exclamation_mark);
        btn_sexul = findViewById(R.id.btn_sexul);
        btn_anul = findViewById(R.id.btn_anul);
        btn_luna = findViewById(R.id.btn_luna);
        btn_ziua = findViewById(R.id.btn_ziua);
        btn_judetul = findViewById(R.id.btn_judetul);
        btn_numar_secvential = findViewById(R.id.btn_numar_secvential);
        btn_cifra_de_control = findViewById(R.id.btn_cifra_de_control);
        btn_important = findViewById(R.id.btn_important);

        txt_informatii = findViewById(R.id.txt_informatii);

        mainLayout = findViewById(R.id.mainLayout);

        // Hide these
        txt_informatii.setVisibility(View.INVISIBLE);
        btn_important.setVisibility(View.INVISIBLE);

        // Set animations
        anim_btn_sexul = AnimationUtils.loadAnimation(this, R.anim.info_up_to_bottom);
        anim_btn_anul = AnimationUtils.loadAnimation(this, R.anim.info_bottom_to_up);
        anim_btn_luna = AnimationUtils.loadAnimation(this, R.anim.info_up_to_bottom);
        anim_btn_ziua = AnimationUtils.loadAnimation(this, R.anim.info_bottom_to_up);
        anim_btn_judetul = AnimationUtils.loadAnimation(this, R.anim.info_up_to_bottom);
        anim_btn_numar_secvential = AnimationUtils.loadAnimation(this, R.anim.info_bottom_to_up);
        anim_btn_cifra_de_control = AnimationUtils.loadAnimation(this, R.anim.info_up_to_bottom);
        anim_txt_titlu = AnimationUtils.loadAnimation(this, R.anim.info_up_to_bottom);
        anim_btn_important = AnimationUtils.loadAnimation(this, R.anim.info_bottom_to_up);

        btn_sexul.setAnimation(anim_btn_sexul);
        btn_anul.setAnimation(anim_btn_anul);
        btn_luna.setAnimation(anim_btn_luna);
        btn_ziua.setAnimation(anim_btn_ziua);
        btn_judetul.setAnimation(anim_btn_judetul);
        btn_numar_secvential.setAnimation(anim_btn_numar_secvential);
        btn_cifra_de_control.setAnimation(anim_btn_cifra_de_control);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txt_informatii.setVisibility(View.VISIBLE);
                txt_informatii.setAnimation(anim_txt_titlu);
            }
        }, 500);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                btn_important.setVisibility(View.VISIBLE);
            }
        }, 2000);

        // setOnClickListener

        mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Navbar-fullscreen
                hideNavigationBar();
            }
        });

        btn_sexul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder sexul = new AlertDialog.Builder(InformationSignActivity.this);
                sexul.setTitle("??? Sexul, secolul na??terii");
                sexul.setMessage("\t\t1 ?????? persoane de sex masculin, n??scute ??ntre 1900 ??i 1999;\n" +
                        "\n\t\t2 ?????? persoane de sex feminin, n??scute ??ntre 1900 ??i 1999;\n" + "\n\t\t3 ?????? persoane de sex masculin, n??scute ??ntre 1800 ??i 1899;\n" +
                        "\n\t\t4 ?????? persoane de sex feminin, n??scute ??ntre 1800 ??i 1899;\n" + "\n\t\t5 ?????? persoane de sex masculin, n??scute ??ntre 2000 ??i 2999;\n" +
                        "\n\t\t6 ?????? persoane de sex feminin, n??scute ??ntre 2000 ??i 2999;\n" + "\n\t\t7 ?????? persoane de sex masculin, rezidente;\n" +
                        "\n\t\t8 ?????? persoane de sex feminin, rezidente.\n");
                sexul.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        hideNavigationBar();
                    }
                }).setCancelable(false).show();

                // Navbar-fullscreen
                hideNavigationBar();

            }
        });

        btn_anul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder anul = new AlertDialog.Builder(InformationSignActivity.this);
                anul.setTitle("??? Anul na??terii");
                anul.setMessage("\t\tUltimele dou?? cifre din anul na??terii.\n" +
                        "\n\t\tExemplu: o persoan?? n??scut?? ??n 1999, va avea num??rul '99' trecut ??n CNP.");
                anul.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        hideNavigationBar();
                    }
                }).setCancelable(false).show();

                // Navbar-fullscreen
                hideNavigationBar();

            }
        });

        btn_luna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder luna = new AlertDialog.Builder(InformationSignActivity.this);
                luna.setTitle("??? Luna na??terii");
                luna.setMessage("\t\tSe accept?? numere de la 1 la 12.\n" +
                        "\n\t\tPentru lunile de la 1 la 9 se adaug?? ??nainte cifra '0'.\n" +
                        "\n\t\tExemplu: o persoan?? n??scut?? ??n luna Ianuarie, va avea num??rul '01' trecut ??n CNP.");
                luna.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                                hideNavigationBar();
                            }
                        }).setCancelable(false).show();

                // Navbar-fullscreen
                hideNavigationBar();
            }
        });

        btn_ziua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder ziua = new AlertDialog.Builder(InformationSignActivity.this);
                ziua.setTitle("??? Ziua na??terii");
                ziua.setMessage("\t\tSe accept?? numere de la 1 la 31.\n" +
                        "\n\t\tPentru zilele de la 1 la 9 se adaug?? ??nainte cifra '0'.\n" +
                        "\n\t\tExemplu: o persoan?? n??scut?? ??n ziua a 9-a, va avea num??rul '09' trecut ??n CNP.");
                ziua.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        hideNavigationBar();
                    }
                }).setCancelable(false).show();

                // Navbar-fullscreen
                hideNavigationBar();
            }
        });

        btn_judetul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder judetul = new AlertDialog.Builder(InformationSignActivity.this);

                judetul.setTitle("??? Jude??ul na??terii");
                judetul.setMessage("\t\tCodul jude??ului (sau sectorului) ??n care s-a n??scut persoana respectiv?? sau ??n care avea domiciliul (re??edin??a) la momentul ??n care i-a fost f??cut CNP-ul.\n" +
                        "\n\t\tCoduri:\n" +
                        "\n\t\t01 ??????Alba\n" +
                        "\n\t\t02 ?????? Arad\n" +
                        "\n\t\t03 ?????? Arge??\n" +
                        "\n\t\t04 ?????? Bac??u\n" +
                        "\n\t\t05 ?????? Bihor\n" +
                        "\n\t\t06 ?????? Bistri??a-N??s??ud\n" +
                        "\n\t\t07 ?????? Boto??ani\n" +
                        "\n\t\t08 ?????? Bra??ov\n" +
                        "\n\t\t09 ?????? Br??ila\n" +
                        "\n\t\t10 ?????? Buz??u\n" +
                        "\n\t\t11 ?????? Cara??-Severin\n" +
                        "\n\t\t12 ?????? Cluj\n" +
                        "\n\t\t13 ?????? Constan??a\n" +
                        "\n\t\t14 ?????? Covasna\n" +
                        "\n\t\t15 ?????? D??mbovi??a\n" +
                        "\n\t\t16 ?????? Dolj\n" +
                        "\n\t\t17 ?????? Gala??i\n" +
                        "\n\t\t18 ?????? Gorj\n" +
                        "\n\t\t19 ?????? Harghita\n" +
                        "\n\t\t20 ?????? Hunedoara\n" +
                        "\n\t\t21 ?????? Ialomi??a\n" +
                        "\n\t\t22 ?????? Ia??i\n" +
                        "\n\t\t23 ?????? Ilfov\n" +
                        "\n\t\t24 ?????? Maramure??\n" +
                        "\n\t\t25 ?????? Mehedin??i\n" +
                        "\n\t\t26 ?????? Mure??\n" +
                        "\n\t\t27 ?????? Neam??\n" +
                        "\n\t\t28 ?????? Olt\n" +
                        "\n\t\t29 ?????? Prahova\n" +
                        "\n\t\t30 ?????? Satu Mare\n" +
                        "\n\t\t31 ?????? S??laj\n" +
                        "\n\t\t32 ?????? Sibiu\n" +
                        "\n\t\t33 ?????? Suceava\n" +
                        "\n\t\t34 ?????? Teleorman\n" +
                        "\n\t\t35 ?????? Timi??\n" +
                        "\n\t\t36 ?????? Tulcea\n" +
                        "\n\t\t37 ?????? Vaslui\n" +
                        "\n\t\t38 ?????? V??lcea\n" +
                        "\n\t\t39 ?????? Vrancea\n" +
                        "\n\t\t40 ?????? Bucure??ti\n" +
                        "\n\t\t41 ?????? Sector 1\n" +
                        "\n\t\t42 ?????? Sector 2\n" +
                        "\n\t\t43 ?????? Sector 3\n" +
                        "\n\t\t44 ?????? Sector 4\n" +
                        "\n\t\t45 ?????? Sector 5\n" +
                        "\n\t\t46 ?????? Sector 6\n" +
                        "\n\t\t51 ?????? C??l??ra??i\n" +
                        "\n\t\t52 ?????? Giurgiu\n" +

                        "\n\n\t\tNumerele de la 47 la 50, inclusiv, sunt nule...");
                judetul.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        hideNavigationBar();
                    }
                }).setCancelable(false).show();

                // Navbar-fullscreen
                hideNavigationBar();
            }
        });

        btn_numar_secvential.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder numar_secvential = new AlertDialog.Builder(InformationSignActivity.this);
                numar_secvential.setTitle("??? Num??r secven??ial");
                numar_secvential.setMessage("\t\tUn num??r secven??ial cuprins ??ntre 001 ??i 999.\n" +
                        "\n\t\tPrin acest num??r, unic, se diferen??iaz?? persoanele de acela??i sex, n??scute la aceea??i dat?? ??i ??n acela??i loc.\n");
                numar_secvential.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        hideNavigationBar();
                    }
                }).setCancelable(false).show();

                // Navbar-fullscreen
                hideNavigationBar();
            }
        });

        btn_cifra_de_control.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder cifra_de_control = new AlertDialog.Builder(InformationSignActivity.this);

                cifra_de_control.setTitle("??? Cifra de control");
                cifra_de_control.setMessage("\t\tNum??r de securitate.\n" +
                        "\n\t\tSe calculeaz?? pe baza primelor 12 cifre, care se ??nmul??esc cu num??rul '279146358279', fiecare cifr?? cu corespondentul din CNP, apoi se adun?? rezultate lor, iar ??n final se ??mparte suma la 11 ??i restul va fi cifra de control.\n" +
                        "\n\t\tDac?? restul este '10', cifra de control va fi '1'.");
                cifra_de_control.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        hideNavigationBar();
                    }
                }).setCancelable(false).show();

                // Navbar-fullscreen
                hideNavigationBar();
            }
        });

        btn_important.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btn_important.animate().rotation(btn_important.getRotation()-90).start();

                AlertDialog.Builder important = new AlertDialog.Builder(InformationSignActivity.this);

                important.setTitle("??? Informa??ii");
                important.setMessage("\t\tInforma??iile prezentate ??n aceast?? aplica??ie au fost publicate ??n Monitorul Oficial nr. 851 din 17 Octombrie, 2006.\n" +
                        "\n\t\tCNP-ul a fost introdus prin decretul nr. 59 din 2 Martie, 1978.\n" +
                        "\n\t\tCNP = Cod Numeric Personal");
                important.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        hideNavigationBar();

                        btn_important.animate().rotation(btn_important.getRotation()+90).start();
                    }
                }).setCancelable(false).show();

                // Navbar-fullscreen
                hideNavigationBar();
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

    public void GoToMainActivity(View v){
        super.onBackPressed();

    }
}