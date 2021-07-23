package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class PagerAdapter  extends FragmentStateAdapter {
    public PagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0 :
                return new PlaneFragment() ;

            case 1 :
                return new BoxFragment() ;

            case 2 :
                return new PlusFragment() ;

            case 3 :
                return new MessageFragment() ;

            default:
                return new UserFragment();

        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
