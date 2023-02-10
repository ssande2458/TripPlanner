package com.example.a01_mad;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class SelectStops extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_stops);

        //ActivityMainBinding binding =
        //        DataBindingUtil.setContentView(SelectStops.this, R.layout.activity_choose_destination);

        //Button chooseDestination = binding

        Button seeTripSummary = findViewById(R.id.btnSeeTripSummary);
        seeTripSummary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
    }
}
