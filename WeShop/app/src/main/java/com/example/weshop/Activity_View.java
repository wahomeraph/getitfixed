package com.example.weshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity_View extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__view);
        ImageView iv;
        TextView tv1n;

        iv=(ImageView)findViewById(R.id.iv_2);
        tv1n=(TextView)findViewById(R.id.tv_3);
            Intent open=getIntent();

            iv.setImageResource(open.getIntExtra("img",0));
            tv1n.setText(open.getStringExtra("name"));

        }
    }
