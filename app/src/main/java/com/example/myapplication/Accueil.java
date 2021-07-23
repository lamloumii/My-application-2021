package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class Accueil extends AppCompatActivity {
    ViewPager2 viewPager2 ;
    TabLayout tabLayout ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);
        tabLayout=findViewById(R.id.tabLayout2);
        viewPager2=findViewById(R.id.viewPager);
        viewPager2.setAdapter(new PagerAdapter(this));

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(
                tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position){
                    case 0:{
                    tab.setIcon(R.drawable.plane);

                    break;
                    }
                    case 1:{
                        tab.setIcon(R.drawable.box);
                        break;
                    }
                    case 2:{
                        tab.setIcon(R.drawable.plus);
                        break;
                    }
                    case 3:{
                        tab.setIcon(R.drawable.messanger);
                        break;
                    }
                    case 4:{
                        tab.setIcon(R.drawable.user);
                        break;
                    }
                }

            }
        }
        );
        tabLayoutMediator.attach();
    }
}