package com.example.informationbook.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.example.informationbook.fragment.FragmentMoonCrater;
import org.jetbrains.annotations.NotNull;

public class ViewPageAdapterMoonCraters extends FragmentStateAdapter {

    public ViewPageAdapterMoonCraters(@NonNull @NotNull FragmentManager fragmentManager, @NonNull @NotNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @NotNull
    @Override
    public Fragment createFragment(int position) {

        Fragment fragment;
            switch (position){
                case 0:
                    fragment = FragmentMoonCrater.createInstance();
                    break;
                default:
                    return null;

            }

        return fragment;
    }

    @Override
    public int getItemCount() {
        return 1;
    }
}
