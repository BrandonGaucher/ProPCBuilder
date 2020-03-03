package com.example.propcbuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class psuList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psu_list);
    }

    public void back(View view) {
        Intent intent = new Intent(this, BuildActivity.class);
        startActivity(intent);

    }

    public void evga600br(View view) {
        Intent intent = new Intent(this, psu.class);
        psu.amazonLink = "https://amzn.to/2Pe80hu";
        psu.googleLink = "https://www.google.com/search?q=EVGA+600+BR&rlz=1C1CHBF_enCA791CA791&oq=EVGA+600+BR&aqs=chrome..69i57j0l7.930j0j8&sourceid=chrome&ie=UTF-8";
        psu.price = 49.99;
        psu.partName = "EVGA 600 BR Power Supply";
        psu.image = R.drawable.evga600br;
        startActivity(intent);
    }
}
