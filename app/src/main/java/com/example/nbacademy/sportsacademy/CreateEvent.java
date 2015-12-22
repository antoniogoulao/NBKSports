package com.example.nbacademy.sportsacademy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class CreateEvent extends AppCompatActivity {

    List<String> sports;
    List<String> levels;
    List<String> day;
    List<String> month;
    List<String> year;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_event);

        day = new ArrayList<String>();

        int i;
        for(i=1 ; i<32 ;i++) {
            day.add(""+i);
        }

        month= new ArrayList<String>();
        for(i=1 ; i<13 ;i++) {
            month.add(""+i);
        }

        year= new ArrayList<String>();
        for(i=2015 ; i<2020 ;i++) {
            year.add(""+i);
        }

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
        Spinner s = (Spinner) findViewById(R.id.sport);
        s.setAdapter(sportAdapter);

        sportAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, levels);
        s = (Spinner) findViewById(R.id.level);
        s.setAdapter(sportAdapter);

        sportAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, day);
        s = (Spinner) findViewById(R.id.dateDay);
        s.setAdapter(sportAdapter);

        sportAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, month);
        s = (Spinner) findViewById(R.id.dateMonth);
        s.setAdapter(sportAdapter);

        sportAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, year);
        s = (Spinner) findViewById(R.id.dateYear);
        s.setAdapter(sportAdapter);

        sportAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, day);
        s = (Spinner) findViewById(R.id.dateDayL);
        s.setAdapter(sportAdapter);

        sportAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, month);
        s = (Spinner) findViewById(R.id.dateMonthL);
        s.setAdapter(sportAdapter);

        sportAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, year);
        s = (Spinner) findViewById(R.id.dateYearL);
        s.setAdapter(sportAdapter);

    }

    public void createEvent(View view)
    {
        EditText local = (EditText)findViewById(R.id.Local);
        String localS =  local.getText().toString();

        Spinner sport = (Spinner)findViewById(R.id.sport);
        String sportS =  sport.getSelectedItem().toString();

        Spinner level = (Spinner)findViewById(R.id.level);
        String levelS =  level.getSelectedItem().toString();

        EditText playNumMin = (EditText)findViewById(R.id.PlayerNumMin);
        String playNumMinS =  playNumMin.getText().toString();

        EditText playNumMax = (EditText)findViewById(R.id.PlayerNumMax);
        String playNumMaxS =  playNumMax.getText().toString();

        /*EditText dateLimit = (EditText)findViewById(R.id.DateLimit);
        String dateLimitS =  dateLimit.getText().toString();*/

        if(localS.equals("") || sportS.equals("") || levelS.equals("") || playNumMinS.equals("") || playNumMaxS.equals(""))
        {
            Toast.makeText(this, "Some fields are missing. Please fill all fields with valid information.", Toast.LENGTH_SHORT).show();
        }
        else {
            Intent i = new Intent(CreateEvent.this, MainMenu.class);
            i.putExtra("local", localS);
            i.putExtra("sport", sportS);
            i.putExtra("level", levelS);
            i.putExtra("playNumMin", playNumMinS);
            i.putExtra("playNumMax", playNumMaxS);
            startActivity(i);
        }
    }
}


