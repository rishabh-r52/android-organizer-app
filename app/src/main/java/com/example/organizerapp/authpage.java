package com.example.organizerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class authpage extends AppCompatActivity {

    Button btn_signup, btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authpage);

        btn_login = findViewById(R.id.btn_login);
        btn_login.setOnClickListener(this::onClick);
        btn_signup = findViewById(R.id.btn_signup);
        btn_signup.setOnClickListener(this::onClick);
    }


    public void onClick(View v){
        if(v.equals(btn_login)){
            startActivity(new Intent(authpage.this,loginPage.class));
        }
        else if(v.equals(btn_signup)) {
            startActivity(new Intent(authpage.this,signupPage.class));
        }
    }
}