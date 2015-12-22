package com.example.nbacademy.sportsacademy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MyEvent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_event);

        TextView sport = (TextView)findViewById(R.id.sport);
        sport.setText(getIntent().getStringExtra("sport"));

        TextView level = (TextView)findViewById(R.id.level);
        level.setText("");

        TextView date = (TextView)findViewById(R.id.date);
        date.setText(getIntent().getStringExtra("date"));

        TextView location = (TextView)findViewById(R.id.location);
        location.setText(getIntent().getStringExtra("local"));

//        TextView numUser = (TextView)findViewById(R.id.numUser);
//        numUser.setText("Queijo");

    }

    public void cancelEvent(View view) {
        Toast.makeText(getApplicationContext(), "Server error, cannot delete event", Toast.LENGTH_SHORT).show();
        finish();
    }
}
