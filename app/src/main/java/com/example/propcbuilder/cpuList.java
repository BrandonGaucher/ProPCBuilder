package com.example.propcbuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cpuList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpu_list);
    }
    public void back (View view){
        Intent intent = new Intent(this, BuildActivity.class);
        startActivity(intent);
    }
    public void i79700k (View view){
        Intent intent = new Intent(this, cpu.class);
        cpu.amazonLink = "https://amzn.to/2PfLBAp";
        cpu.googleLink = "https://www.google.com/search?q=intel+i7+9700k&oq=intel+i&aqs=chrome.1.69i57j35i39l2j0l2j69i60l2j69i61.1977j1j4&sourceid=chrome&ie=UTF-8";
        cpu.price = 399.99;
        cpu.partName = "Intel i7-9700K";
        cpu.image = R.drawable.i79700k;
        startActivity(intent);
    }
}
