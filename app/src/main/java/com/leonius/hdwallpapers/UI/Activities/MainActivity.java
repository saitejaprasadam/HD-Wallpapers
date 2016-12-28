package com.leonius.hdwallpapers.UI.Activities;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.leonius.hdwallpapers.R;
import com.leonius.hdwallpapers.UI.Fragments.HelperFragments.MainTabFragment;

import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        createTabFragment();
    }

    private void createTabFragment() {
        if (!isFinishing()) {

            if(getSupportActionBar() != null)
                getSupportActionBar().setElevation(0);

            FragmentManager mFragmentManager = getSupportFragmentManager();
            FragmentTransaction mFragmentTransaction = mFragmentManager.beginTransaction();
            mFragmentTransaction.replace(R.id.containerView, new MainTabFragment()).commit();
        }
    }
}