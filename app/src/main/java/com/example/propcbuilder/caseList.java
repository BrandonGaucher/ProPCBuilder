package com.example.propcbuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class caseList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_case_list);
    }
    public void back (View view){
        Intent intent = new Intent(this, BuildActivity.class);
        startActivity(intent);

    }
    public void corsaircc9011075(View view){
        Intent intent = new Intent(this, cases.class);
        cases.amazonLink = "https://amzn.to/2HOu79S";
        cases.googleLink = "https://www.google.com/search?q=intel+i7+9700k&oq=intel+i&aqs=chrome.1.69i57j35i39l2j0l2j69i60l2j69i61.1977j1j4&sourceid=chrome&ie=UTF-8";
        cases.price = 49.99;
        cases.partName = "Corsair CC-9011075-WW Carbide Series";
        cases.image = R.drawable.corsaircc9011075ww;
        startActivity(intent);
    }
}