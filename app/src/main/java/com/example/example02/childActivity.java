package com.example.example02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class childActivity extends AppCompatActivity {
    String anyString;
    TextView myTxtViewMgr;
    Intent intentReciever;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        myTxtViewMgr = findViewById(R.id.textView2);
        intentReciever = getIntent();
        myTxtViewMgr.setText(intentReciever.getStringExtra("myExtra"));
    }
}