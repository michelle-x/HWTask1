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


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Set Dates
        Date current = new Date();
        DateFormat df = new SimpleDateFormat("dd/MM/yy hh:mm a");
        TextView textView;

        df.setTimeZone(TimeZone.getTimeZone("Australia/Sydney"));
        String syd = df.format(current);
        textView = findViewById(R.id.sydTime);
        textView.setText(syd);

        df.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        String ny = df.format(current);
        textView = findViewById(R.id.nyTime);
        textView.setText(ny);

        df.setTimeZone(TimeZone.getTimeZone("Asia/Tokyo"));
        String tokyo = df.format(current);
        textView = findViewById(R.id.tokyoTime);
        textView.setText(tokyo);

        df.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        String shanghai = df.format(current);
        textView = findViewById(R.id.shTime);
        textView.setText(shanghai);

        df.setTimeZone(TimeZone.getTimeZone("Europe/London"));
        String london = df.format(current);
        textView = findViewById(R.id.ldnTime);
        textView.setText(london);




    }

    //Button to see 24 hour
    public void buttonClick24(View v){
        Intent intent = new Intent(getApplicationContext(), MainActivity2ndTime.class);
        startActivity(intent);
    }

    //Button to refresh
    public void buttonClickRefresh(View v){
        finish();
        startActivity(getIntent());
    }

}
