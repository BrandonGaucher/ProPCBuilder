package com.example.propcbuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void newBuild(View view) {
        Intent intent = new Intent(this, NewBuildForm.class);
        startActivity(intent);
    }
    public void savedBuilds(View view){
        Intent intent = new Intent(this, savedBuilds.class);
        startActivity(intent);
    }


}
