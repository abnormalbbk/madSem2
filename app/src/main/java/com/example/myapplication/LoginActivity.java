package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    // create the global variable
    Button btnCheckBox, btnLogin;
    TextView tvForgotPassword, tvSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // initialize the variable
        btnCheckBox = findViewById(R.id.btnCheckBox);
        btnLogin = findViewById(R.id.btnLogin);
        tvForgotPassword = findViewById(R.id.tvForgotPassword);
        tvSignUp = findViewById(R.id.tvSignUp);

        // login button
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // create the intent and go the main activity class
                Intent intentForgotPassword = new android.content.Intent(LoginActivity.this, MainActivity.class);
                startActivity(intentForgotPassword);
            }
        });

        // forgot password button
        tvForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // create the intent and go the forgot password activity class
                Intent intentForgotPassword = new Intent(LoginActivity.this, ForgotPasswordActivity.class);
                startActivity(intentForgotPassword);
            }
        });

        // sing up button
        tvSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // create the intent and go the forgot password activity class
//                Intent intentSignUp = new Intent(LoginActivity.this, SingUpActivity.class);
//                startActivity(intentSignUp);
            }
        });

        // create a setOnClickListener methods in btnCheckBox where click to toast message display
        final boolean[] check = {false};
        btnCheckBox.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (!check[0]){
                    btnCheckBox.setText("Thanks for remember");
                    check[0] = true;
                } else {
                    btnCheckBox.setText("Remember Me!");
                    check[0] = false;
                }
            }
        });
    }
}