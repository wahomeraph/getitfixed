package com.example.revision;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    Toolbar x;
    ActionBarDrawerToggle y;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView=(BottomNavigationView)findViewById(R.id.btm_nav_drawer);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()){
                    case R.id.nav_facebook:
                    break;

                    case R.id.nav_Instagram:
                        getSupportFragmentManager().beginTransaction().
                                replace(R.id.fragment_container,new IgFragment()).commit();
                        break;

                    case R.id.nav_twiter:
                        break;




                }


                return true;
            }
        });


    }







}
