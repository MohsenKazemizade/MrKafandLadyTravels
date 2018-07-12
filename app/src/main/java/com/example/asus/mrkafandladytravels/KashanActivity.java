package com.example.asus.mrkafandladytravels;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KashanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kashan);
        Button home, next, back;
        home = (Button) findViewById(R.id.btnHome);
        next = (Button) findViewById(R.id.btnNext);
        back = (Button) findViewById(R.id.btnBack);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KashanActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KashanActivity.this, BaneActivity.class);
                startActivity(intent);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KashanActivity.this, ShirazActivity.class);
                startActivity(intent);
            }
        });
    }
}
