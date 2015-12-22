package com.example.nbacademy.sportsacademy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RateEvent extends AppCompatActivity {

    List<String> sports;
    List<String> level;
    List<String> local;
    List<String> date;
    List<String> playerNums;
    List<String> players;
    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate_event);


        sports= new ArrayList<String>();
        sports.add("Football");
        sports.add("Running");
        sports.add("Basketball");
        sports.add("Swimming");
        sports.add("Cycling");
        sports.add("Volley");
        sports.add("Tenis");
        sports.add("Curling");

        level = new ArrayList<String>();
        level.add("Easy");
        level.add("Medium");
        level.add("Hard");
        level.add("Easy");
        level.add("Medium");
        level.add("Hard");
        level.add("Medium");


        local = new ArrayList<String>();
        local.add("Pq.Nações");
        local.add("Chelas");
        local.add("Prior Velho");
        local.add("Moscavide");
        local.add("Sacavem");
        local.add("Olivais");
        local.add("Marvila");

        date = new ArrayList<String>();
        date.add("23-11-2015 21:15h");
        date.add("01-09-2015 22:30h");
        date.add("12-10-2015 17:45h");
        date.add("15-06-2015 16:00h");
        date.add("20-11-2015 19:30h");
        date.add("24-07-2015 19:20h");
        date.add("23-04-2015 19:20h");

        playerNums = new ArrayList<String>();
        playerNums.add("2");
        playerNums.add("5");
        playerNums.add("10");
        playerNums.add("6");
        playerNums.add("11");
        playerNums.add("12");
        playerNums.add("8");

        players = new ArrayList<String>();
        players.add("Hamburger");
        players.add("Africa");
        players.add("Porco");
        players.add("Salsicha");
        players.add("Europa");
        players.add("Vaca");
        players.add("CarneAssada");
        players.add("Asia");
        players.add("Ovelha");
        players.add("Bifana");
        players.add("Cabra");
        players.add("America");

        TextView sport = (TextView) findViewById(R.id.sport);
        TextView location = (TextView) findViewById(R.id.location);
        TextView dateTime = (TextView) findViewById(R.id.dateTime);
        TextView levels = (TextView) findViewById(R.id.level);
        TextView playerNum = (TextView) findViewById(R.id.playerNum);

        int max = 6;
        int min = 0;
        int r = new Random().nextInt((max - min) + 1);

        sport.setText(sports.get(r));
        location.setText(local.get(r));
        dateTime.setText(date.get(r));
        levels.setText(level.get(r));
        playerNum.setText(playerNums.get(r));

        LinearLayout playerList = (LinearLayout) findViewById(R.id.playerList);
        LinearLayout ll = new LinearLayout(getApplicationContext());
        LinearLayout.LayoutParams lpl = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        ll.setOrientation(LinearLayout.VERTICAL);
        ll.setLayoutParams(lpl);

        int i;
        int pn = Integer.parseInt(playerNums.get(r));
        for(i=0; i<pn; i++ ){
            TextView nome = new TextView(getApplicationContext());
            nome.setText(players.get(i));
            nome.setTextColor(getResources().getColor(R.color.colorGrey));
            playerList.addView(nome);
        }
    }

    public void vote(View view) {
        finish();
    }
}
