package com.rafihanif.nikahyuk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class FragActivity extends AppCompatActivity {

//    TabItem loginFragment, signupFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frag);

        TabLayout tabLayout = findViewById(R.id.tabLayoutLog);
        TabItem tabLogin = findViewById(R.id.loginId);
        TabItem tabSignup = findViewById(R.id.signupId);
        ViewPager viewPager = findViewById(R.id.viewPagerId);

        LoginPageAdapter pageAdapter = new LoginPageAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(pageAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

//        loginFragment = (TabItem) findViewById(R.id.loginId);
//        signupFragment = (TabItem) findViewById(R.id.signupId);
//
//        loginFragment.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view){
//                loadFragment(new LoginFragment());
//            }
//        });
//
//        signupFragment.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view){
//                loadFragment(new SignupFragment());
//            }
//        });
//    }
//    private void loadFragment (Fragment fragment){
//        FragmentManager fm = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fm.beginTransaction();
//
//        fragmentTransaction.replace(R.id.frameLayout, fragment);
//        fragmentTransaction.commit();
//    }
//
//    private void btnLogin(){
//        loadFragment(new LoginFragment());
//    }
//
//    private void btnSignup(){
//        loadFragment(new SignupFragment());
//    }
}
