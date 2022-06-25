package com.sayanafi.pmppractice;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class splashScreen extends AppCompatActivity {
    //    set time splashscreen
    private static int splashInterval = 2000; //milliseconds

    TextView titlesplash;
    TextView descsplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_splash_screen);

        titlesplash = findViewById(R.id.pmp);
        descsplash = findViewById(R.id.namesplash);

        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
            Intent intent = new Intent(splashScreen.this, registrationScreen.class);
            @Override
            public void run() {
                startActivity(intent);
                finish();
            }
        },splashInterval);
    }
}