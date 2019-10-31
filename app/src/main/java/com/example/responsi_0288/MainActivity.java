package com.example.responsi_0288;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.responsi_0288.SharedPreferences.SharedPref;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (SharedPref.getInstance(MainActivity.this).isLogin()){
                    Intent intent = new Intent(MainActivity.this, ActivityLogin.class);
                    startActivity(intent);
                }
                else {
                    Intent intent = new Intent(MainActivity.this, ActivityLogin.class);
                    startActivity(intent);
                }
            }
        }, 2000);

    }
}
