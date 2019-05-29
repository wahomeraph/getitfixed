package com.example.onoffice;

import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;

public class Home extends AppCompatActivity implements  Staff.OnFragmentInteractionListener,Goods.OnFragmentInteractionListener  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TableLayout tabLayout =(TableLayout) findViewById(R.id.tablelayout);
        tabLayout.addTab(tabLayout.newTab().setText("Staff"));
        tabLayout.addTab(tabLayout.newTab().setText("Goods"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);




        final ViewPager viewPager=(ViewPager)findViewById(R.id.viewpager);
        final PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener().TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });



    }

    //@Override
    public void onFragmentInteraction(Uri uri) {

    }
}







