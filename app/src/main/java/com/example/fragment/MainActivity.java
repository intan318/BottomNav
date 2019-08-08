package com.example.fragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.example.fragment.Fragment.HomeFragment;
import com.example.fragment.Fragment.ProfileFragment;
import com.example.fragment.Fragment.WebViewFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView mainNav;
//        FrameLayout mainFrame;
        final HomeFragment homeFragment;
        final WebViewFragment webViewFragment;
        final ProfileFragment profileFragment;



        mainNav = findViewById(R.id.main_nav);
        homeFragment  = new HomeFragment();
        webViewFragment = new WebViewFragment();
        profileFragment = new ProfileFragment();


        mainNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch(menuItem.getItemId()){
                    case R.id.btnHome:
                        setFragment(homeFragment);
                        break;

                    case R.id.btnWebview:
                        setFragment(webViewFragment);
                        break;

                    case R.id.btnProfile:
                        setFragment(profileFragment);
                        break;
                }

                return true;
            }
        });
        mainNav.setSelectedItemId(R.id.btnHome);
    }

    private void setFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_frame, fragment);
        fragmentTransaction.commit();

    }
}
