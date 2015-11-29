package com.example.nbacademy.sportsacademy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void goToSearch(View view){

        Intent i = new Intent(MainMenu.this, Search.class);
        //i.putExtra("uName", uNameS);
        startActivity(i);
    }

    public void goToCreate(View view){
        Intent i = new Intent(MainMenu.this, CreateEvent.class);
        //i.putExtra("uName", uNameS);
        startActivity(i);
    }

    public void goToMyEvents(View view){
        Intent i = new Intent(MainMenu.this, MyEvents.class);
        //i.putExtra("uName", uNameS);
        startActivity(i);
    }

    public void goToProfile(View view){
        Intent i = new Intent(MainMenu.this, Profile.class);
        //i.putExtra("uName", uNameS);
        startActivity(i);
    }
}
