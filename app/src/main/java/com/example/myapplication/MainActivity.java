package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.myapplication.dashboard.Dashboard;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       new Handler().postDelayed(() -> {
           Intent intent = new Intent(MainActivity.this,Dashboard.class);
           startActivity(intent);
           finish();
       },3000);

    }
}
