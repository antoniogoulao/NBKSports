package com.example.nbacademy.sportsacademy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class CreateProfile extends AppCompatActivity {

    List<String> sports;
    List<String> levels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_profile);

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

        ArrayAdapter<String> sportAdapter1 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, sports);
        Spinner sportSpinner1 = (Spinner) findViewById(R.id.sport_text1);
        sportSpinner1.setAdapter(sportAdapter1);

        ArrayAdapter<String> levelsAdapter1 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, levels);
        Spinner levelsSpinner1 = (Spinner) findViewById(R.id.level_text1);
        levelsSpinner1.setAdapter(levelsAdapter1);

/*        ArrayAdapter<String> sportAdapter2 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, sports);
        Spinner sportSpinner2 = (Spinner) findViewById(R.id.sport_text2);
        sportSpinner2.setAdapter(sportAdapter2);

        ArrayAdapter<String> levelsAdapter2 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, levels);
        Spinner levelsSpinner2 = (Spinner) findViewById(R.id.level_text2);
        levelsSpinner2.setAdapter(levelsAdapter2);

        ArrayAdapter<String> sportAdapter3 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, sports);
        Spinner sportSpinner3 = (Spinner) findViewById(R.id.sport_text3);
        sportSpinner3.setAdapter(sportAdapter3);

        ArrayAdapter<String> levelsAdapter3 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, levels);
        Spinner levelsSpinner3 = (Spinner) findViewById(R.id.level_text3);
        levelsSpinner3.setAdapter(levelsAdapter3);*/
    }

    public void createProfile(View view) {
        EditText locationText = (EditText)findViewById(R.id.location_text);
        Spinner sportText = (Spinner) findViewById(R.id.sport_text1);
        Spinner levelText = (Spinner) findViewById(R.id.level_text1);
        EditText userText = (EditText) findViewById(R.id.user_text);
        EditText emailText = (EditText) findViewById(R.id.email_text);
        EditText passText = (EditText) findViewById(R.id.pass_text);

        String locationString = locationText.getText().toString();
        String sportString = sportText.getSelectedItem().toString();
        String levelString = levelText.getSelectedItem().toString();
        String userString = userText.getText().toString();
        String emailString = emailText.getText().toString();
        String passString = passText.getText().toString();

        if(locationString.equals("")) {
            Toast.makeText(this, "Please insert your Location", Toast.LENGTH_SHORT).show();
        } else if(sportString.equals("")) {
            Toast.makeText(this, "Please enter one Sport", Toast.LENGTH_SHORT).show();
        } else if(userString.equals("")) {
            Toast.makeText(this, "Please enter your Username", Toast.LENGTH_SHORT).show();
        } else if(emailString.equals("")) {
            Toast.makeText(this, "Please enter your Email", Toast.LENGTH_SHORT).show();
        } else if(passString.equals("")) {
            Toast.makeText(this, "Please enter your Password", Toast.LENGTH_SHORT).show();
        } else {

            Intent i = new Intent(CreateProfile.this, MainMenu.class);
            startActivity(i);
        }
    }

    public void addSport(View view) {
        Toast.makeText(getApplicationContext(), "Server error, cannot delete event", Toast.LENGTH_SHORT).show();

        /*LinearLayout createSports = (LinearLayout) findViewById(R.id.createSports);

        LinearLayout ll = new LinearLayout(getApplicationContext());

        LinearLayout.LayoutParams lpl = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        ll.setLayoutParams(lpl);
        ll.setOrientation(LinearLayout.HORIZONTAL);

        createSports.addView(ll);

        Spinner sportSpinner = new Spinner(getApplicationContext());
        Spinner levelsSpinner = new Spinner(getApplicationContext());

        ArrayAdapter<String> sportAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, sports);
        sportSpinner.setAdapter(sportAdapter);

        ArrayAdapter<String> levelsAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, levels);
        levelsSpinner.setAdapter(levelsAdapter);

        ll.addView(sportSpinner);
        ll.addView(levelsSpinner);*/
    }
}
