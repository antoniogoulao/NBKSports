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

        TextView numUser1 = new TextView(getApplicationContext());
        TextView numUser2 = new TextView(getApplicationContext());
        TextView numUser3 = new TextView(getApplicationContext());
        TextView numUser4 = new TextView(getApplicationContext());

        LinearLayout listParticipants = (LinearLayout) findViewById(R.id.listParticipants);
        numUser1.setText("Suíço");
        numUser1.setTextColor(getResources().getColor(R.color.colorGrey));
        listParticipants.addView(numUser1);
        numUser2.setText("MJ");
        numUser2.setTextColor(getResources().getColor(R.color.colorGrey));
        listParticipants.addView(numUser2);
        numUser3.setText("Ramone");
        numUser3.setTextColor(getResources().getColor(R.color.colorGrey));
        listParticipants.addView(numUser3);
        numUser4.setText("Quaresma17");
        numUser4.setTextColor(getResources().getColor(R.color.colorGrey));
        listParticipants.addView(numUser4);
    }

    public void cancelEvent(View view) {
        finish();
    }
}
