package com.example.propcbuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class savedBuilds extends AppCompatActivity {
    TextView buildName;
    TextView cost;
    TextView cpuName;
    TextView moboName;
    TextView gpuName;
    TextView ramName;
    TextView storageName;
    TextView psuName;
    TextView caseName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved_builds);
        Button home = findViewById(R.id.home);
        buildName = findViewById(R.id.readBuildName);
        cost = findViewById(R.id.readPrice);
        cpuName = findViewById(R.id.readCPUName);
        gpuName = findViewById(R.id.readGPUName);
        ramName = findViewById(R.id.readRAMName);
        moboName = findViewById(R.id.readMOBOName);
        storageName = findViewById(R.id.readStorageName);
        psuName = findViewById(R.id.readPSUName);
        caseName = findViewById(R.id.readCaseName);

        load();

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    public void load(){
        FileInputStream fis = null;
        try{
            fis = openFileInput("data.txt");
            InputStreamReader in = new InputStreamReader(fis);
            BufferedReader buffer = new BufferedReader(in);
            StringBuilder sb = new StringBuilder();
            String data;
            while((data = buffer.readLine()) != null){
                sb.append(data).append("\n");
                String parts[] = data.split(",");
                buildName.setText(parts[0]);
                cost.setText("$"+parts[1] +"/$"+parts[2]);
                cpuName.setText(parts[3]);
                moboName.setText(parts[4]);
                gpuName.setText(parts[5]);
                ramName.setText(parts[6]);
                storageName.setText(parts[7]);
                psuName.setText(parts[8]);
                caseName.setText(parts[9]);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void finish(){
        super.finish();
    }
}
