package com.example.nbacademy.sportsacademy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateEvent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_event);
    }

    public void createEvent(View view)
    {
        EditText local = (EditText)findViewById(R.id.Local);
        String localS =  local.getText().toString();

//        EditText sport = (EditText)findViewById(R.id.sport);
//        String sportS =  sport.getText().toString();
//
//        EditText level = (EditText)findViewById(R.id.level);
//        String levelS =  level.getText().toString();

        EditText date = (EditText)findViewById(R.id.Date);
        String dateS =  date.getText().toString();

        EditText playNumMin = (EditText)findViewById(R.id.PlayerNumMin);
        String playNumMinS =  playNumMin.getText().toString();

        EditText playNumMax = (EditText)findViewById(R.id.PlayerNumMax);
        String playNumMaxS =  playNumMax.getText().toString();

        EditText dateLimit = (EditText)findViewById(R.id.DateLimit);
        String dateLimitS =  dateLimit.getText().toString();


        Intent i = new Intent(CreateEvent.this, MainMenu.class);
        i.putExtra("local", localS);
//        i.putExtra("sport", sportS);
//        i.putExtra("level", levelS);
        i.putExtra("date", dateS);
        i.putExtra("playNumMin", playNumMinS);
        i.putExtra("playNumMax", playNumMaxS);
        i.putExtra("dateLimit", dateLimitS);
        startActivity(i);
    }
}


