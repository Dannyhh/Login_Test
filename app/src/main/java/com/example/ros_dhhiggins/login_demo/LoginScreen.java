package com.example.ros_dhhiggins.login_demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static com.example.ros_dhhiggins.login_demo.R.id.activity_login_screen;

public class LoginScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
    }
    public void login(View view){
        EditText user,pass;
        user = (EditText) findViewById(R.id.usernameText);
        pass = (EditText) findViewById(R.id.passwordText);
        if (user.toString().equalsIgnoreCase(getString(R.string.adminUser))
            && pass.toString().equalsIgnoreCase(getString(R.string.adminPass))){
                Intent correct = new Intent(this, LoginCorrect.class);
                startActivity(correct);

        }
    }
}
