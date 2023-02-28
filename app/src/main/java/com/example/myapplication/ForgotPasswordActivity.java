package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class ForgotPasswordActivity extends AppCompatActivity {

    Button btnBackLeftArrow,btnSendPassword;
    private EditText editTextOtpCode, editTextEmail, editTextPassword;
    private TextView txtOtpCode;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        // initialize the variable
        btnBackLeftArrow = findViewById(R.id.btnBackLeftArrow);
        btnSendPassword = findViewById(R.id.btnSendPassword);
        editTextOtpCode = findViewById(R.id.editTextOtpCode);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        txtOtpCode = findViewById(R.id.txtOtpCode);

        // create an object of random class and generated the number
        Random random = new Random();
        @SuppressLint("DefaultLocale")
        String randomNumber = String.format("%04d", random.nextInt(1001));
        btnSendPassword.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                // getText user data from LoginFragment class
                String otpCode = editTextOtpCode.getText().toString().trim();
                String email = editTextEmail.getText().toString().trim();
                String password = editTextPassword.getText().toString().trim();
                if (otpCode.isEmpty() || !otpCode.equals(randomNumber)) {
                    editTextOtpCode.setTextColor(Color.RED);;
                    toastMessage("Check the OTP code");
                }else if (email.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    editTextEmail.setTextColor(Color.RED); // color set
                    toastMessage("Enter the valid email!");
                } else if (password.isEmpty()){
                    toastMessage("Enter the strong password");
                } else {
                    // password are change in databases and go to login page
                    Intent intent = new Intent(ForgotPasswordActivity.this, LoginActivity.class);
                    startActivity(intent);
                }
            }
        });

        // show the otp number
        txtOtpCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtOtpCode.setText(randomNumber); // set the generated random number
            }
        });

        // right back button
        btnBackLeftArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // go to the  login activity  class
                Intent intent = new Intent(ForgotPasswordActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }

    // create the toast message methods
    public void toastMessage(String message){
        Toast.makeText(ForgotPasswordActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}