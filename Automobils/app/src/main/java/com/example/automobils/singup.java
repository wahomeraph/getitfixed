package com.example.automobils;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class singup extends AppCompatActivity {
    EditText user,pass,email,phone,con,location;
    Button loog,sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singup);
        user=(EditText)findViewById(R.id.username);
        pass=(EditText)findViewById(R.id.password);
        email=(EditText)findViewById(R.id.email);
        phone=(EditText)findViewById(R.id.phonenumber);
        con=(EditText)findViewById(R.id.confirmpassword);
        location=(EditText)findViewById(R.id.location);
        loog=(Button)findViewById(R.id.submit);
        sub=(Button)findViewById(R.id.user_registration);

        loog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(singup.this,login.class);
                startActivity(intent);
            }
        });


        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(singup.this,login.class);
                startActivity(intent);
            }
        });







    }
}
