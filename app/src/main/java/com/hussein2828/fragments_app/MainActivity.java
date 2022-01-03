package com.hussein2828.fragments_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button Fragment_x;
    Button Fragment_y;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fragment_x=(Button)findViewById(R.id.Fragment_x);
        Fragment_y=(Button)findViewById(R.id.Fragment_y);
        
    }
}