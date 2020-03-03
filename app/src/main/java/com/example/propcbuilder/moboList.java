package com.example.propcbuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class moboList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobo_list);
    }

    public void back(View view) {
        Intent intent = new Intent(this, BuildActivity.class);
        startActivity(intent);

    }

    public void strixz390(View view) {
        Intent intent = new Intent(this, mobo.class);
        mobo.amazonLink = "https://amzn.to/2VaII7C";
        mobo.googleLink = "https://www.google.com/search?safe=active&rlz=1C1CHBF_enCA791CA791&sxsrf=ALeKk03SIDDMXxO1QWowKP-f_PbbtRqcHA%3A1582348698769&ei=mrlQXobBLsaS0PEPxJ2E6Aw&q=Asus+ROG+Strix+Z390-E+Gaming+Motherboard&oq=Asus+ROG+Strix+Z390-E+Gaming+Motherboard&gs_l=psy-ab.3..0l10.1614.14595..15817...9.2..1.87.1722.26......0....1j2..gws-wiz.....10..0i71j35i39j0i131i20i263j0i131j0i10j0i22i30j33i22i29i30j35i362i39j0i67.iShzHkPOYb8&ved=0ahUKEwiG9uagtOTnAhVGCTQIHcQOAc0Q4dUDCAs&uact=5";
        mobo.price = 236.08;
        mobo.partName = "Asus ROG Strix Z390-E";
        mobo.image = R.drawable.strixz390;
        startActivity(intent);
    }
}