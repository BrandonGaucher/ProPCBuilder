package com.example.propcbuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class gpuList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpu_list);
    }

    public void back(View view) {
        Intent intent = new Intent(this, BuildActivity.class);
        startActivity(intent);

    }

    public void zotacRTX2060(View view) {
        Intent intent = new Intent(this, gpu.class);
        gpu.amazonLink = "https://amzn.to/2vT9W8a";
        gpu.googleLink = "https://www.google.com/search?q=zotac+gaming+geforce+rtx+2060+6gb&rlz=1C1CHBF_enCA791CA791&oq=ZOTAC+Gaming+GeForce+RTX+2060+6GB&aqs=chrome.0.0l8.774j0j8&sourceid=chrome&ie=UTF-8";
        gpu.price = 319.99;
        gpu.partName = "ZOTAC Gaming GeForce RTX 2060";
        gpu.image =  R.drawable.zotacrtx2060;
        startActivity(intent);
    }
}