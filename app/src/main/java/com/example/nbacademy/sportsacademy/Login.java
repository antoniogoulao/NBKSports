package com.example.nbacademy.sportsacademy;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void login(View view)
    {
        EditText uName = (EditText)findViewById(R.id.UserName);
        String uNameS =  uName.getText().toString();

        EditText pass = (EditText)findViewById(R.id.Password);
        String uPassS = pass.getText().toString();

        //Login validation

        Intent i = new Intent(Login.this, MainMenu.class);
        i.putExtra("uName", uNameS);
        startActivity(i);
    }
    public void createAccount(View view)
    {
        EditText uName = (EditText)findViewById(R.id.UserName);
        String uNameS =  uName.getText().toString();

        Intent i = new Intent(Login.this, CreateProfile.class);
        i.putExtra("uName", uNameS);
        startActivity(i);
    }
    public void forgotPassword(View view)
    {
        //Send new pass to email
        Toast.makeText(this, "Lulz", Toast.LENGTH_SHORT).show();
    }
}
