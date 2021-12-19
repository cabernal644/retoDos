package com.example.reto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class LogoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_logo);
        // Agregar animaciones
        Animation animation1 = AnimationUtils.loadAnimation( this, R.anim.desplazamiento_arriba);
        Animation animation2 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_abajo);
        TextView primero =findViewById(R.id.mejores);
        TextView segundo =findViewById(R.id.hamburguesas);
        ImageView logos = findViewById(R.id.imagenLogo);

        primero.setAnimation(animation1);
        segundo.setAnimation(animation1);
        logos.setAnimation(animation2);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(   LogoActivity.this, MainActivity.class );
                startActivity(intent);
                finish();
            }
        }, 4000); // no es tan facil nombrarlos
    }
}