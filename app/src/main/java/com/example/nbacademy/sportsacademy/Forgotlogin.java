package com.example.nbacademy.sportsacademy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Forgotlogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotlogin);
    }

    public void recoverPass(View view)

    {
        EditText forgotEmail = (EditText)findViewById(R.id.forgotEmail);
        String forgotEmailS =  forgotEmail.getText().toString();

        //Login validationD
        if(forgotEmailS.equals(""))

        {
            forgotEmail.setText("");
            Toast.makeText(this, "Insert your account email", Toast.LENGTH_SHORT).show();
        } else {
            finish();
            Toast.makeText(getApplicationContext(), "Email Sent", Toast.LENGTH_SHORT).show();
            finish();
        }
    }
}
