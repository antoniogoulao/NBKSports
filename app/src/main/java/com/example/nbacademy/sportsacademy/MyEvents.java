package com.example.nbacademy.sportsacademy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MyEvents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_events);

        TextView sport1 = (TextView)findViewById(R.id.sport1);
        sport1.setText("Football");

        TextView date1 = (TextView)findViewById(R.id.date1);
        date1.setText("01/11/2015 20.00 até 22.00");

        TextView local1 = (TextView)findViewById(R.id.local1);
        local1.setText("Parque das nações");

        TextView rank1 = (TextView)findViewById(R.id.rank1);
        rank1.setText("30*");


        TextView sport2 = (TextView)findViewById(R.id.sport2);
        sport2.setText("running");

        TextView date2 = (TextView)findViewById(R.id.date2);
        date2.setText("02/11/2015 20.45 até 22.45");

        TextView local2 = (TextView)findViewById(R.id.local2);
        local2.setText("Quinta do Morgado");

        TextView rank2 = (TextView)findViewById(R.id.rank2);
        rank2.setText("50*");


        TextView sport3 = (TextView)findViewById(R.id.sport3);
        sport3.setText("basketball");

        TextView date3 = (TextView)findViewById(R.id.date3);
        date3.setText("02/11/2015 20.45 até 22.45");

        TextView local3 = (TextView)findViewById(R.id.local3);
        local3.setText("Avenida 5 de Outubro");

        TextView rank3 = (TextView)findViewById(R.id.rank3);
        rank3.setText("15*");

        LinearLayout event1 = (LinearLayout) findViewById(R.id.event1);
        event1.setOnClickListener(new EventOnClickListener());

        LinearLayout event2 = (LinearLayout) findViewById(R.id.event2);
        event2.setOnClickListener(new EventOnClickListener());

        LinearLayout event3 = (LinearLayout) findViewById(R.id.event3);
        event3.setOnClickListener(new EventOnClickListener());
    }

    private class EventOnClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Intent i = new Intent(MyEvents.this, MyEvent.class);
            String sport = ((TextView)((LinearLayout)((ViewGroup) v).getChildAt(0)).getChildAt(1)).getText().toString();
            i.putExtra("sport", sport);

            String date = ((TextView)((LinearLayout)((ViewGroup) v).getChildAt(1)).getChildAt(1)).getText().toString();
            i.putExtra("date", date);

            String local = ((TextView)((LinearLayout)((ViewGroup) v).getChildAt(2)).getChildAt(1)).getText().toString();
            i.putExtra("local", local);

            String rank = ((TextView)((LinearLayout)((ViewGroup) v).getChildAt(3)).getChildAt(1)).getText().toString();
            i.putExtra("rank", rank);


            startActivity(i);
        }
    }
}

