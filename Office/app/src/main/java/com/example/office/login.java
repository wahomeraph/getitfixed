package com.example.office;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class login extends AppCompatActivity {
    private Button login,register;
    private EditText username,password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        login=(Button)findViewById(R.id.bt_login);
        register=(Button)findViewById(R.id.bt_register);
        username=(EditText)findViewById(R.id.edit_username);
        password=(EditText)findViewById(R.id.edit_password);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(username.getText().toString(),password.getText().toString());

            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(login.this,Register.class);
                startActivity(intent2);

            }
        });




    }
    private void validate(String username,String password){
        if(username.equals("peter")&&(password.equals("123"))){
            Intent intent=new Intent(login.this,Home.class);
            startActivity(intent);
        }
        else if(username.isEmpty()&&(password.isEmpty())){
            Toast.makeText(this, "Input details to continue", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Incorrect details", Toast.LENGTH_SHORT).show();
        }
    }
}