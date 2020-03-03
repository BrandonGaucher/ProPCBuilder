package com.example.propcbuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class storageList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storage_list);
    }

    public void back(View view) {
        Intent intent = new Intent(this, BuildActivity.class);
        startActivity(intent);

    }

    public void wdblue1tb(View view) {
        Intent intent = new Intent(this, storage.class);
        storage.amazonLink = "https://amzn.to/2vZKca0";
        storage.googleLink = "https://www.google.com/search?safe=active&rlz=1C1CHBF_enCA791CA791&sxsrf=ALeKk02Wyq4drT98kCfr9V_Y85fOWwbagQ%3A1582401615776&ei=T4hRXsn3LvvO0PEPzqCmiAk&q=WD+Blue+1TB+PC+Hard+Drive&oq=WD+Blue+1TB+PC+Hard+Drive&gs_l=psy-ab.3..0l3j0i22i30l7.1488972.1488972..1489837...0.4..0.77.77.1......0....2j1..gws-wiz.......0i71.ovkru99axj8&ved=0ahUKEwiJ28yx-eXnAhV7JzQIHU6QCZEQ4dUDCAs&uact=5";
        storage.price = 47.99;
        storage.partName = "WD Blue 1TB PC Hard Drive";
        storage.image =R.drawable.wdblue1tb;
        startActivity(intent);
    }
}
