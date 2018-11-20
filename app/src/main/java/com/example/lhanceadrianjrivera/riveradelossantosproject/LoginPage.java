package com.example.lhanceadrianjrivera.riveradelossantosproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.StringBufferInputStream;

public class LoginPage extends AppCompatActivity {
    DatabaseHelper helper = new DatabaseHelper(this);

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

            String password = helper.searchPass(user);
                if(pass.equals(password))
                {
                    Intent i = new Intent(this,OpeningPage.class) ;// health activity dito pepe
                    startActivity(i);
                }
                else
                {
                    Toast temp = Toast.makeText(this, "Username and Password does not match ", Toast.LENGTH_SHORT); //
                    temp.show();

                }



        }
    }
}

