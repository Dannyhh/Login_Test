package com.example.ros_dhhiggins.login_demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginIncorrect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_incorrect);
    }

    public void back(View view){
        Intent goBack = new Intent(this, LoginScreen.class);
            startActivity(goBack);
    }
}
