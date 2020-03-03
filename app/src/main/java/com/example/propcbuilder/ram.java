package com.example.propcbuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ram extends AppCompatActivity {

    public static String amazonLink = "";
    public static String googleLink = "";
    public static double price = 0;
    public static String partName = "";
    public static int image = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ram);
        Button amazon = findViewById(R.id.amazon);
        Button google = findViewById(R.id.google);
        Button addToBuild = findViewById(R.id.addToBuild);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        addToBuild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateBuild(price);
            }
        });

        amazon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAmazon(amazonLink);
            }
        });
        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGoogle(googleLink);
            }
        });
    }

    public void openAmazon(String amazonLink) {
        Uri webpage = Uri.parse(amazonLink);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }

    public void openGoogle(String googleLink) {
        Uri webpage = Uri.parse(googleLink);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void updateBuild(Double price) {
        BuildActivity.totalPrice += price;
        BuildActivity.ramName = partName;
        BuildActivity.ramImage = image;
        Intent intent = new Intent(this, BuildActivity.class);
        startActivity(intent);
    }
}