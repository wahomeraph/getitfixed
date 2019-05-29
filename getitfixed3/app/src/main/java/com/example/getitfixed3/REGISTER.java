package com.example.getitfixed3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class REGISTER extends AppCompatActivity {
    EditText username,email,password,confirmpassword,phonenunber,location;
    TextView signup,account;
    Button submit,login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        signup=(TextView)findViewById(R.id.user_registration);
        account=(TextView)findViewById(R.id.account);
        username=(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password);
        email=(EditText)findViewById(R.id.email);
        confirmpassword=(EditText)findViewById(R.id.confirmpassword);
        phonenunber=(EditText)findViewById(R.id.phonenumber);
        location=(EditText)findViewById(R.id.location);
        submit=(Button)findViewById(R.id.submit);
        login=(Button)findViewById(R.id.user_registration);

    }
}
