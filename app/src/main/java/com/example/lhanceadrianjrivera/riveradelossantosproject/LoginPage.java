package com.example.lhanceadrianjrivera.riveradelossantosproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.io.StringBufferInputStream;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);
    }

    public void buttonLoginClick(View v)
    {
        if (v.getId() == R.id.Blogin)
        {
            EditText a = findViewById(R.id.ETuname);
            String user = a.getText().toString();
            EditText b = findViewById(R.id.ETpass);
            String pass = b.getText().toString();

            String password = helper.searchPass


        }
    }
}

