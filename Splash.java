package com.example.parikshit.minorfirst;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;

public class Splash extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("Splash","OnCreate - first line");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler handler = new Handler();
        Log.d("Splash","After Handler");
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Log.d("Splash","Inside Run");
                Intent intent = new Intent(Splash.this,MainActivity.class);
                Log.d("Splash","Before startActivity");
                startActivity(intent);
                Log.d("Splash","After startActivity");
            }
        }, 3000);
        Log.d("Splash","Exiting Oncreate");
    }

}
