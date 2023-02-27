package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    // create the global variable
    Button btnCheckBox, btnLogin, btnGoogle, btnFacebook, btnTwitter;
    TextView tvForgotPassword, tvSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // initialize the button variable
        btnCheckBox = findViewById(R.id.btnCheckBox);
        btnLogin = findViewById(R.id.btnLogin);
        btnGoogle = findViewById(R.id.icGoogle);
        btnFacebook = findViewById(R.id.icFacebook);
        btnTwitter = findViewById(R.id.btnTwitter);

        // initialize the textEdit variable
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

        // go to the google
        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent followIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com"));
                startActivity(followIntent);
            }
        });

        // facebook button
        btnFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // intent used ot go the facebook page
                Intent followIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com"));
                startActivity(followIntent);
            }
        });

        // facebook button
        btnTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // intent used ot go the facebook page
                Intent followIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.twitter.com"));
                startActivity(followIntent);
            }
        });
    }
}