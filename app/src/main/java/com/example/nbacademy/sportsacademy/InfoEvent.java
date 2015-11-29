package com.example.nbacademy.sportsacademy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class InfoEvent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_event);

        TextView sport = (TextView)findViewById(R.id.sport);
        sport.setText("Football");

        TextView level = (TextView)findViewById(R.id.level);
        level.setText("Easy");

        TextView date = (TextView)findViewById(R.id.date);
        date.setText("23-11-2015 20:15h");

        TextView location = (TextView)findViewById(R.id.location);
        location.setText("Sede Novabase");

        TextView numUser = new TextView(getApplicationContext());

        LinearLayout listParticipants = (LinearLayout) findViewById(R.id.listParticipants);
        numUser.setText("Suíço");
        listParticipants.addView(numUser);
        numUser.setText("MJ");
        listParticipants.addView(numUser);
        numUser.setText("Ramone");
        listParticipants.addView(numUser);
        numUser.setText("Quaresma17");
        listParticipants.addView(numUser);
    }

}
