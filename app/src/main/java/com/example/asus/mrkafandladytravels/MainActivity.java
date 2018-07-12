package com.example.asus.mrkafandladytravels;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView shiraz, kish, bane, yazd, shomal, kashan;

        shiraz = (ImageView) findViewById(R.id.imageView1);
        kashan = (ImageView) findViewById(R.id.imageView2);
        shomal = (ImageView) findViewById(R.id.imageView3);
        bane = (ImageView) findViewById(R.id.imageView4);
        kish = (ImageView) findViewById(R.id.imageView5);
        yazd = (ImageView) findViewById(R.id.imageView6);

        shiraz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ShirazActivity.class );
                startActivity(intent);
            }
        });
        kashan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, KashanActivity.class );
                startActivity(intent);
            }
        });
        shomal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ShomalActivity.class );
                startActivity(intent);
            }
        });
        bane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BaneActivity.class);
                startActivity(intent);
            }
        });
        kish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, KishActivity.class);
                startActivity(intent);
            }
        });
        yazd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, YazdActivity.class);
                startActivity(intent);
            }
        });
    }

}
