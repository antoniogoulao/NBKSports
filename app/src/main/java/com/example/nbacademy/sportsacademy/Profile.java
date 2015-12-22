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

public class Profile extends AppCompatActivity {

    List<String> sports;
    List<String> levels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

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

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        String local = getIntent().getStringExtra("local");
        EditText e = (EditText)findViewById(R.id.LocationProfile);
        if(local == null ) {
            e.setText("Lumiar");
        } else {
            e.setText(local);
        }

        ArrayAdapter<String> sportAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, sports);
        Spinner s = (Spinner) findViewById(R.id.sport1);
        s.setAdapter(sportAdapter);
        /*s = (Spinner) findViewById(R.id.sport2);
        s.setAdapter(sportAdapter);
        s = (Spinner) findViewById(R.id.sport3);
        s.setAdapter(sportAdapter);*/

        sportAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, levels);
        s = (Spinner) findViewById(R.id.level1);
        s.setAdapter(sportAdapter);
        /*s = (Spinner) findViewById(R.id.level2);
        s.setAdapter(sportAdapter);
        s = (Spinner) findViewById(R.id.level3);
        s.setAdapter(sportAdapter);*/
    }

    public void save(View view){
        EditText local = (EditText)findViewById(R.id.LocationProfile);
        String localS =  local.getText().toString();

       /* Intent i = new Intent(Profile.this, Profile.class);
        i.putExtra("local", localS);
        startActivity(i);*/
        Toast.makeText(this, "Server Error: Couldn't save changes", Toast.LENGTH_SHORT).show();
        finish();
    }

    public void cancel(View view){

        Intent i = new Intent(Profile.this, MainMenu.class);
        startActivity(i);
    }
    public void add(View view){

        Toast.makeText(this, "Server error, couldn't add new Sport", Toast.LENGTH_SHORT).show();

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
        sportAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, levels);
        Spinner s = new Spinner(getApplicationContext());
        s.setAdapter(sportAdapter);

        sportAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, levels);
        Spinner s2 = new Spinner(getApplicationContext());
        s2.setAdapter(sportAdapter);


    }
    public void delete(View view){
        Toast.makeText(this, "Server error, couldn't delete Sport", Toast.LENGTH_SHORT).show();
    }
}
