package com.example.nbacademy.sportsacademy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MyEvent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_event);

        TextView sport = (TextView)findViewById(R.id.sport);
        sport.setText("Football");

        TextView level = (TextView)findViewById(R.id.level);
        level.setText("Iniciate");

        TextView date = (TextView)findViewById(R.id.date);
        date.setText("23-11-2015 20:15 h");

        TextView location = (TextView)findViewById(R.id.location);
        location.setText("Sede Novabase");

        TextView numUser = (TextView)findViewById(R.id.numUser);
        numUser.setText("Queijo");

    }
}
