package com.example.a01_mad;


import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.a01_mad.databinding.ActivityStartBinding;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    Button myButton = null;
    EditText myEditText = null;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        ActivityStartBinding binding
                = DataBindingUtil.setContentView(this, R.layout.activity_start);
        myButton = binding.destBtn;
        myEditText = binding.etName;
        myEditText = binding.etBudget;
        myEditText = binding.etDuration;
        myButton.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
        Intent myIntent = new Intent(MainActivity.this, TripActivity.class);
        myIntent.putExtra("ARG",myEditText.getText().toString());
        startActivity(myIntent);
    }
}