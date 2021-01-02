package com.example.mywhatsup;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SplachScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splach_screen);

        Thread backRound = new Thread() {


            public void run() {
                try {
                    sleep(2000);
                    Intent intent = new Intent(SplachScreen.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {

                }
            }
        };
        backRound.start();


    }
}
