package com.example.lhanceadrianjrivera.riveradelossantosproject;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpPage extends AppCompatActivity {

    DatabaseHelper helper = new DatabaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_page);
    }

    public void onSignupClick (View v)
    {
        if (v.getId()==R.id.Bsignupbutton)
        {
          EditText email =findViewById(R.id.TFemail);
          EditText uname =findViewById(R.id.TFuname);
          EditText pass1 =findViewById(R.id.TFpass1);
          EditText pass2 =findViewById(R.id.TFpass2);

          String emailstr = email.getText().toString();
          String unamestr = uname.getText().toString();
          String pass1str = pass1.getText().toString();
          String pass2str = pass2.getText().toString();
            if(!pass1str.equals(pass2str))
            {
                Toast pass = Toast.makeText(this, "Password do not match ", Toast.LENGTH_SHORT);
                pass.show();

            }
            else
            {
                Contact c = new Contact();
                c.setEmail(emailstr);
                c.setUname(unamestr);
                c.setPass(pass1str);

                helper.insertContact(c);
            }



        }
    }
}
