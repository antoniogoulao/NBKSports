package com.example.nbacademy.sportsacademy;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.nbacademy.sportsacademy.R;

import java.util.ArrayList;
import java.util.List;

public class Search extends AppCompatActivity {

    List<String> sports;
    List<String> levels;
    List<String> locals;
    List<String> availability;
    List<String> participants;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        sports= new ArrayList<String>();
        sports.add("Football");
        sports.add("Running");
        sports.add("Basketball");
        sports.add("Swimming");
        sports.add("Cycling");
        sports.add("Volley");
        sports.add("Tenis");
        sports.add("Curling");


        levels = new ArrayList<String>();
        levels.add("Easy");
        levels.add("Medium");
        levels.add("Hard");

        ArrayAdapter<String> sportAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, sports);
        Spinner s = (Spinner) findViewById(R.id.filterSport);
        s.setAdapter(sportAdapter);

        sportAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, levels);
        s = (Spinner) findViewById(R.id.filterLevel);


        LinearLayout resultList = (LinearLayout) findViewById(R.id.resultList);
        LinearLayout ll = new LinearLayout(getApplicationContext());
        LinearLayout.LayoutParams lpl = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        ll.setOrientation(LinearLayout.VERTICAL);
        ll.setLayoutParams(lpl);

        TextView sport = new TextView(getApplicationContext());
        sport.setText("Football");
        sport.setTextColor(Color.parseColor("#000000"));

        TextView date = new TextView(getApplicationContext());
        date.setText("23-11-2015 20:15h");

        TextView local = new TextView(getApplicationContext());
        local.setText("Sede Novabase");

        TextView rank = new TextView(getApplicationContext());
        rank.setText("37*");

        ll.addView(sport);
        ll.addView(date);
        ll.addView(local);
        ll.addView(rank);

        ll.setOnClickListener(new SearchOnClickListener());

        resultList.addView(ll);
    }

    private class SearchOnClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Intent i = new Intent(Search.this, InfoEvent.class);
            startActivity(i);
        }
    }
}
