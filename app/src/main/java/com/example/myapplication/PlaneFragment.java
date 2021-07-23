package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;


public class PlaneFragment extends Fragment {

    ViewPager2 viewpagerplane ;
    TabLayout tablayoutplane ;
    public PlaneFragment(){

    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.frag_plane, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tablayoutplane=view.findViewById(R.id.tabLayoutPlane);
        viewpagerplane=view.findViewById(R.id.viewPagerPlane);
        viewpagerplane.setAdapter(new PageAdapterPlane(this));

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(
                tablayoutplane, viewpagerplane, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position){
                    case 0:{
                          tab.setText("Tous");
                        break;
                    }
                    case 1:{
                        tab.setText("Mes Voyages");
                        break;
                    }

                }

            }
        }
        );
        tabLayoutMediator.attach();
    }
}