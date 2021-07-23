package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class PageAdapterPlane extends FragmentStateAdapter {
    public PageAdapterPlane(@NonNull PlaneFragment fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new TousPlaneFragment();
            default:
                return new MesVoyPlaneFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
