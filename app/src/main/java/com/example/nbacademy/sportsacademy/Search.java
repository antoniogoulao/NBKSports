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
import android.widget.Toast;

import com.example.nbacademy.sportsacademy.R;

import java.util.ArrayList;
import java.util.List;

public class Search extends AppCompatActivity {

    List<String> sports;
    List<String> levels;
    List<String> locals;
    List<String> availability;
    List<String> participants;
    List<String> rank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        sports= new ArrayList<String>();
        sports.add("Sport");
        sports.add("Football");
        sports.add("Running");
        sports.add("Basketball");
        sports.add("Swimming");
        sports.add("Cycling");
        sports.add("Volley");
        sports.add("Tenis");
        sports.add("Curling");


        levels = new ArrayList<String>();
        levels.add("Level");
        levels.add("Easy");
        levels.add("Medium");
        levels.add("Hard");

        locals = new ArrayList<String>();
        locals.add("Local");
        locals.add("Lisbon");
        locals.add("Porto");
        locals.add("Coimbra");
        locals.add("Faro");
        locals.add("Santarém");

        availability = new ArrayList<String>();
        availability.add("Scheduled");
        availability.add("6:00 - 7:00");
        availability.add("7:00 - 8:00");
        availability.add("8:00 - 9:00");
        availability.add("9:00 - 10:00");
        availability.add("10:00 - 11:00");
        availability.add("11:00 - 12:00");
        availability.add("12:00 - 13:00");
        availability.add("13:00 - 14:00");
        availability.add("14:00 - 15:00");
        availability.add("15:00 - 16:00");
        availability.add("16:00 - 17:00");
        availability.add("17:00 - 18:00");
        availability.add("18:00 - 19:00");
        availability.add("19:00 - 20:00");
        availability.add("20:00 - 21:00");
        availability.add("21:00 - 22:00");
        availability.add("22:00 - 23:00");
        availability.add("23:00 - 00:00");

        participants = new ArrayList<String>();
        participants.add("Participants");
        participants.add("1");
        participants.add("2");
        participants.add("3");
        participants.add("4");
        participants.add("5");
        participants.add("6");
        participants.add("7");
        participants.add("8");
        participants.add("9");
        participants.add("10+");

        rank = new ArrayList<String>();
        rank.add("Rank");
        rank.add("0* +");
        rank.add("10* +");
        rank.add("20* +");
        rank.add("30* +");
        rank.add("40* +");
        rank.add("50* +");
        rank.add("60* +");
        rank.add("70* +");
        rank.add("80* +");
        rank.add("90* +");

        ArrayAdapter<String> sportAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, sports);
        Spinner sportSpinner = (Spinner) findViewById(R.id.filterSport);
        sportSpinner.setAdapter(sportAdapter);

        ArrayAdapter<String> levelsAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, levels);
        Spinner levelsSpinner = (Spinner) findViewById(R.id.filterLevel);
        levelsSpinner.setAdapter(levelsAdapter);

        ArrayAdapter<String> localsAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, locals);
        Spinner localsSpinner = (Spinner) findViewById(R.id.filterLocal);
        localsSpinner.setAdapter(localsAdapter);

        ArrayAdapter<String> availabilityAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, availability);
        Spinner availabilitySpinner = (Spinner) findViewById(R.id.filterAvailability);
        availabilitySpinner.setAdapter(availabilityAdapter);

        ArrayAdapter<String> participantsAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, participants);
        Spinner participantsSpinner = (Spinner) findViewById(R.id.filterParticipants);
        participantsSpinner.setAdapter(participantsAdapter);

        ArrayAdapter<String> rankAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, rank);
        Spinner rankSpinner = (Spinner) findViewById(R.id.filterRank);
        rankSpinner.setAdapter(rankAdapter);

        LinearLayout resultList = (LinearLayout) findViewById(R.id.resultList);
        LinearLayout ll = new LinearLayout(getApplicationContext());
        LinearLayout.LayoutParams lpl = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        ll.setOrientation(LinearLayout.VERTICAL);
        ll.setLayoutParams(lpl);
        ll.setPadding(0, 0, 0, 20);

        TextView sport = new TextView(getApplicationContext());
        sport.setText("Football");
        sport.setTextColor(getResources().getColor(R.color.colorGrey));

        TextView local = new TextView(getApplicationContext());
        local.setText("Sede Novabase, Lisboa");
        local.setTextColor(getResources().getColor(R.color.colorGrey));

        TextView level = new TextView(getApplicationContext());
        level.setText("Easy");
        level.setTextColor(getResources().getColor(R.color.colorGrey));

        TextView date = new TextView(getApplicationContext());
        date.setText("23-11-2015 20:15h");
        date.setTextColor(getResources().getColor(R.color.colorGrey));

        TextView rank = new TextView(getApplicationContext());
        rank.setText("37*");
        rank.setTextColor(getResources().getColor(R.color.colorGrey));

        TextView pax = new TextView(getApplicationContext());
        pax.setText("Max: 14");
        pax.setTextColor(getResources().getColor(R.color.colorGrey));

        ll.addView(sport);
        ll.addView(local);
        ll.addView(level);
        ll.addView(date);
        ll.addView(rank);
        ll.addView(pax);

        ll.setOnClickListener(new SearchOnClickListener());

        resultList.addView(ll);

        LinearLayout ll2 = new LinearLayout(getApplicationContext());
        LinearLayout.LayoutParams lpl2 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        ll2.setOrientation(LinearLayout.VERTICAL);
        ll2.setLayoutParams(lpl2);
        ll2.setPadding(0, 0, 0, 20);

        TextView sport2 = new TextView(getApplicationContext());
        sport2.setText("Badminton");
        sport2.setTextColor(getResources().getColor(R.color.colorGrey));

        TextView local2 = new TextView(getApplicationContext());
        local2.setText("Pav. Portugal, Lisboa");
        local2.setTextColor(getResources().getColor(R.color.colorGrey));

        TextView level2 = new TextView(getApplicationContext());
        level2.setText("Easy");
        level2.setTextColor(getResources().getColor(R.color.colorGrey));

        TextView date2 = new TextView(getApplicationContext());
        date2.setText("06-12-2015 18:15h");
        date2.setTextColor(getResources().getColor(R.color.colorGrey));


        TextView rank2 = new TextView(getApplicationContext());
        rank2.setText("5*");
        rank2.setTextColor(getResources().getColor(R.color.colorGrey));

        TextView pax2 = new TextView(getApplicationContext());
        pax2.setText("Max: 4");
        pax2.setTextColor(getResources().getColor(R.color.colorGrey));

        ll2.addView(sport2);
        ll2.addView(local2);
        ll2.addView(level2);
        ll2.addView(date2);
        ll2.addView(rank2);
        ll2.addView(pax2);

        ll2.setOnClickListener(new SearchOnClickListener());

        resultList.addView(ll2);
    }

    private class SearchOnClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Intent i = new Intent(Search.this, InfoEvent.class);
            startActivity(i);
        }
    }

    public void searchOk (View view) {
        Toast.makeText(getApplicationContext(), "Search error", Toast.LENGTH_SHORT).show();
    }
}
