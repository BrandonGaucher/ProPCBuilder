package com.example.propcbuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ramList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ram_list);
    }
    public void back (View view){
        Intent intent = new Intent(this, BuildActivity.class);
        startActivity(intent);

    }
    public void corsairVenganceLPX16gb(View view){
        Intent intent = new Intent(this, ram.class);
        ram.amazonLink = "https://amzn.to/2vZG21S";
        ram.googleLink = "https://www.google.com/search?q=corsair+vengeance+lpx+16gb&rlz=1C1CHBF_enCA791CA791&oq=Corsair+Vengeance+LPX+16GB&aqs=chrome.0.0l7j69i60.674j0j7&sourceid=chrome&ie=UTF-8";
        ram.price = 72.99;
        ram.partName = "Corsair Vengeance LPX 16GB";
        ram.image =  R.drawable.vengancelpx16gb;
        startActivity(intent);
    }
}