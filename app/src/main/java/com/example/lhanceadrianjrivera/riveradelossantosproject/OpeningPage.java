package com.example.lhanceadrianjrivera.riveradelossantosproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class OpeningPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.opening_page);
    }

    public void onButtonClick(View v)
    {
        if(v.getId() == R.id.BLogin){
            Intent i = new Intent(this , SignUpPage.class);
            startActivity(i);

        }
    }

}

