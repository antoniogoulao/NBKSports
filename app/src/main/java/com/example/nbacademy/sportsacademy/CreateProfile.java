package com.example.nbacademy.sportsacademy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_profile);
    }

    public void createProfile(View view) {
        EditText locationText = (EditText)findViewById(R.id.location_text);
        EditText sportText = (EditText) findViewById(R.id.sport_text);
        EditText levelText = (EditText) findViewById(R.id.level_text);
        EditText userText = (EditText) findViewById(R.id.user_text);
        EditText emailText = (EditText) findViewById(R.id.email_text);

        String locationString = locationText.getText().toString();
        String sportString = sportText.getText().toString();
        String levelString = levelText.getText().toString();
        String userString = userText.getText().toString();
        String emailString = emailText.getText().toString();

        Intent i=new Intent(CreateProfile.this,MainMenu.class);
        i.putExtra("location", locationString);
        i.putExtra("sport", sportString);
        i.putExtra("level", levelString);
        i.putExtra("uName", userString);
        i.putExtra("email", emailString);

        startActivity(i);
    }
}
