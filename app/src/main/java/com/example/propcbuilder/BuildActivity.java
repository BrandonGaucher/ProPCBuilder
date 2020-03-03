package com.example.propcbuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;

public class BuildActivity extends AppCompatActivity {
    final DecimalFormat decimalFormat = new DecimalFormat("0.00");

    static String name = " ";
    static int budget = 0;
    static double totalPrice = 0.00;
    static String cpuName = "No CPU Selected";
    static String moboName = "No MOBO Selected";
    static String gpuName = "No GPU Selected";
    static String ramName = "No RAM Selected";
    static String storageName = "No Storage Selected";
    static String psuName = "No PSU Selected";
    static String caseName = "No Case Selected";
    static int cpuImage = 0;
    static int moboImage = 0;
    static int gpuImage = 0;
    static int ramImage = 0;
    static int storageImage = 0;
    static int psuImage = 0;
    static int caseImage = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_build);

        //textviews
        TextView theirBudget = findViewById(R.id.theirTotalCost);
        TextView theirBuildName = findViewById(R.id.theirBuildName);
        TextView theirCPU = findViewById(R.id.theirCPU);
        TextView theirMOBO = findViewById(R.id.theirMOBO);
        TextView theirGPU = findViewById(R.id.theirGPU);
        TextView theirRAM = findViewById(R.id.theirRAM);
        TextView theirStorage = findViewById(R.id.theirSTORAGE);
        TextView theirPSU = findViewById(R.id.theirPSU);
        TextView theirCase = findViewById(R.id.theirCASE);

        //imageviews
        ImageView cpu = findViewById(R.id.cpuimageView);
        ImageView mobo = findViewById(R.id.moboimageView);
        ImageView gpu = findViewById(R.id.gpuimageView);
        ImageView ram = findViewById(R.id.ramimageView);
        ImageView storage = findViewById(R.id.storageimageView);
        ImageView psu = findViewById(R.id.psuimageView);
        ImageView caseView = findViewById(R.id.caseimageView);


        //set text
        theirBudget.setText("$" + decimalFormat.format(totalPrice) + "/ $" + budget);
        theirBuildName.setText(name);
        theirCPU.setText(cpuName);
        theirMOBO.setText(moboName);
        theirGPU.setText(gpuName);
        theirRAM.setText(ramName);
        theirStorage.setText(storageName);
        theirPSU.setText(psuName);
        theirCase.setText(caseName);

        //set images
        cpu.setImageResource(cpuImage);
        mobo.setImageResource(moboImage);
        gpu.setImageResource(gpuImage);
        ram.setImageResource(ramImage);
        storage.setImageResource(storageImage);
        psu.setImageResource(psuImage);
        caseView.setImageResource(caseImage);


    }

    public void selectCPU(View view) {
        Intent intent = new Intent(this, cpuList.class);
        startActivity(intent);
    }

    public void selectMOBO(View view) {
        Intent intent = new Intent(this, moboList.class);
        startActivity(intent);
    }

    public void selectGPU(View view) {
        Intent intent = new Intent(this, gpuList.class);
        startActivity(intent);
    }

    public void selectRAM(View view) {
        Intent intent = new Intent(this, ramList.class);
        startActivity(intent);
    }

    public void selectSTORAGE(View view) {
        Intent intent = new Intent(this, storageList.class);
        startActivity(intent);
    }

    public void selectPSU(View view) {
        Intent intent = new Intent(this, psuList.class);
        startActivity(intent);
    }

    public void selectCASE(View view) {
        Intent intent = new Intent(this, caseList.class);
        startActivity(intent);
    }


}
