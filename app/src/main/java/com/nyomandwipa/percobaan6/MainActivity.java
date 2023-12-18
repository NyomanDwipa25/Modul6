package com.nyomandwipa.percobaan6;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.nyomandwipa.percobaan6.FragmentAccount;
import com.nyomandwipa.percobaan6.FragmentExplore;
import com.nyomandwipa.percobaan6.FragmentHome;
import com.nyomandwipa.percobaan6.ViewPagerAdapter;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = (TabLayout) findViewById(R.id.tab_layout_id);
        appBarLayout = (AppBarLayout) findViewById((R.id.appBar_id));
        viewPager = (ViewPager) findViewById(R.id.viewpager_id);
        ViewPagerAdapter adapter = new ViewPagerAdapter((getSupportFragmentManager()));

        adapter.AddFragment(new FragmentHome(), "Home");
        adapter.AddFragment(new FragmentExplore(), "Explore");
        adapter.AddFragment(new FragmentAccount(), "Account");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}