package com.yirmak.mycitybook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class loginActivity extends AppCompatActivity {
    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(loginActivity.this, MainActivity.class);
                startActivity(intent);
                finish();

            }
        }, 5000);
    }
}