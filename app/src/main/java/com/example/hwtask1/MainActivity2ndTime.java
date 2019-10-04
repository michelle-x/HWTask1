package com.example.hwtask1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class MainActivity2ndTime extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2nd_time);
        //Button

        Intent intent = getIntent();


        //24 hour times
        Date current = new Date();
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm ");
        TextView textView;

        df.setTimeZone(TimeZone.getTimeZone("Australia/Sydney"));
        String syd = df.format(current);
        textView = findViewById(R.id.sydTime24);
        textView.setText(syd);

        df.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        String ny = df.format(current);
        textView = findViewById(R.id.nyTime24);
        textView.setText(ny);

        df.setTimeZone(TimeZone.getTimeZone("Asia/Tokyo"));
        String tokyo = df.format(current);
        textView = findViewById(R.id.tokyoTime24);
        textView.setText(tokyo);

        df.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        String shanghai = df.format(current);
        textView = findViewById(R.id.shTime24);
        textView.setText(shanghai);

        df.setTimeZone(TimeZone.getTimeZone("Europe/London"));
        String london = df.format(current);
        textView = findViewById(R.id.ldnTime24);
        textView.setText(london);
    }

    public void buttonClick12(View v){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

    //Button to refresh
    public void buttonClickRefresh(View v){
        finish();
        startActivity(getIntent());
    }
}
