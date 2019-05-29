package com.example.getitfixed3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView fixit,fix;
    ImageView mechanic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fixit=(TextView)findViewById(R.id.fixit);
        fix=(TextView)findViewById(R.id.fix);
        mechanic=(ImageView) findViewById(R.id.mechanic);


    }
}
