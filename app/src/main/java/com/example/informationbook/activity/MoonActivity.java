package com.example.informationbook.activity;

import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager2.widget.ViewPager2;
import com.example.informationbook.R;
import com.example.informationbook.adapter.ViewPageAdapterMoonCraters;
import com.example.informationbook.fragment.FragmentMoonCrater;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MoonActivity extends AppCompatActivity {

    private TabLayout tabLayoutMoon;
    private ViewPager2 viewPagerMoonCrater;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moon);

        tabLayoutMoon = findViewById(R.id.tabLayout);
        viewPagerMoonCrater = findViewById(R.id.viewPagerMoonCrater);

        ViewPageAdapterMoonCraters adapter = new ViewPageAdapterMoonCraters(getSupportFragmentManager(), getLifecycle());
        viewPagerMoonCrater.setAdapter(adapter);

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(
                tabLayoutMoon,
                viewPagerMoonCrater,
                true,
                true,
                (tab, position) -> {

                    switch (position) {
                        case 0:
                            tab.setText("Moon Crater 1");
                            break;
                    }

                });

        tabLayoutMediator.attach();



    }
}