package com.acer.tugaskelompokpwpb.bio.immanuel;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.acer.tugaskelompokpwpb.R;
import com.google.android.material.tabs.TabLayout;

public class BiodataActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.biodata_activity);

        initViews();

    }

    private void initViews() {
        // setting toolbar
        Toolbar toolbar1 = findViewById(R.id.toolbar);
        toolbar1.setTitle("Bio Immanuel");
        setSupportActionBar(toolbar1);

        // setting view pager
        ViewPager viewPager = findViewById(R.id.viewPager);
        setupViewPager(viewPager);

        // setting tabLayout
        TabLayout tabLayout = findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        MainFragmentPagerAdapter mainFragmentPagerAdapter = new MainFragmentPagerAdapter(getSupportFragmentManager());
        mainFragmentPagerAdapter.addFragment(new AboutFragment(), getString(R.string.about));
        mainFragmentPagerAdapter.addFragment(new ContactFragment(), getString(R.string.contact));
        viewPager.setAdapter(mainFragmentPagerAdapter);
    }
}