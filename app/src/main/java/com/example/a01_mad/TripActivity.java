package com.example.a01_mad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.a01_mad.databinding.ActivityMainBinding;

public class TripActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView image1, image2, image3, image4;
    Button myButton = null;
    TextView destSelect = null;
    TextView namePrompt = null;
    private SharedPreferences savedValues;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        myLabel = findViewById(R.id.myLabel);
//
//        myButton = findViewById(R.id.myButton);
        ActivityMainBinding binding
                = DataBindingUtil.setContentView(this, R.layout.activity_main);
        myButton = binding.myButton;
        myButton.setOnClickListener(this);
        //      namePrompt.setText(getIntent().getStringExtra("ARG"));


        image1 = binding.image1;
        image2 = binding.image2;
        image3 = binding.image3;
        image4 = binding.image4;
        destSelect = binding.myText;

        image1.setOnClickListener(this);
        image2.setOnClickListener(this);
        image3.setOnClickListener(this);
        image4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.image1:
                destSelect.setText("Cuba");
                break;
            case R.id.image2:
                destSelect.setText("Florida");
                break;
            case R.id.image3:
                destSelect.setText("Hawaii");
                break;
            case R.id.image4:
                destSelect.setText("Paris");
                break;
            case R.id.myButton:
                break;
            default:
                break;
        }
    }

}