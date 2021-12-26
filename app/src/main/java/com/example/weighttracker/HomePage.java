package com.example.weighttracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Date;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

        TextView dateView;
        dateView = findViewById(R.id.dateView);

        setDate(dateView);
    }

    public void setDate (TextView view){
        String str = String.format("%tc", new Date());
        view.setText(str);
    }


}