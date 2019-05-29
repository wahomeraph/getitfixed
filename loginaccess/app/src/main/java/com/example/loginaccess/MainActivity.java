package com.example.loginaccess;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.EditText;



import  org.json.JSONArray;
import  org.json.JSONException;
import  org.json.JSONObject;


public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText username;
    EditText password;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.login);
        username=(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password);
        submit=(Button)findViewById(R.id.submit);





    }
    public void start_account(){

    }
}
