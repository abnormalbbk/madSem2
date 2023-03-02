package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.myapplication.R;
import com.example.myapplication.dashboard.contact.ContactFragment;
import com.example.myapplication.dashboard.home_page.HomeFragment;
import com.example.myapplication.dashboard.payment.PaymentFragment;
import com.example.myapplication.dashboard.profile.ProfileFragment;
import com.example.myapplication.dashboard.setting.SettingFragment;
import com.example.myapplication.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Dashboard extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    HomeFragment homeFragment = new HomeFragment();
    PaymentFragment paymentFragment = new PaymentFragment();
    ContactFragment contactFragment = new ContactFragment();
    ProfileFragment profileFragment = new ProfileFragment();
    SettingFragment settingFragment = new SettingFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

    }
}