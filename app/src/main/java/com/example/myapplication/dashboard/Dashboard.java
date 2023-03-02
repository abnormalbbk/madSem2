package com.example.myapplication.dashboard;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import com.example.myapplication.R;
import com.example.myapplication.dashboard.contact.ContactFragment;
import com.example.myapplication.dashboard.home_page.HomeFragment;
import com.example.myapplication.dashboard.payment.PaymentFragment;
import com.example.myapplication.dashboard.profile.ProfileFragment;
import com.example.myapplication.dashboard.setting.SettingFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Dashboard extends AppCompatActivity {


    HomeFragment homeFragment = new HomeFragment();
    PaymentFragment paymentFragment = new PaymentFragment();
    ContactFragment contactFragment = new ContactFragment();
    ProfileFragment profileFragment = new ProfileFragment();
    SettingFragment settingFragment = new SettingFragment();

    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_dashboard);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomView);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragHolder,homeFragment).commit();
        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.home:

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragHolder,homeFragment).commit();
                    return true;
                case R.id.payment:

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragHolder,paymentFragment).commit();
                    return true;
                case R.id.contact:

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragHolder,contactFragment).commit();
                    return true;
                case R.id.profile:

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragHolder,profileFragment).commit();
                    return true;
                case R.id.setting:

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragHolder,settingFragment).commit();
                    return true;
            }
            return false;
        });
    }
}