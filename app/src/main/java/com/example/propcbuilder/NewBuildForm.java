package com.example.propcbuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NewBuildForm extends AppCompatActivity {
    private static final String FILE_NAME = "example.txt";
    EditText buildName;
    EditText budget;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_build_form);
    }
    public void newBuild(View view) {
        buildName = findViewById(R.id.buildNameText);
        budget = findViewById(R.id.budgetText);

        int buildBudget = Integer.parseInt(budget.getText().toString());
        String name = buildName.getText().toString();

        Intent intent = new Intent(this, BuildActivity.class);

        BuildActivity.budget = buildBudget;
        BuildActivity.name = name;

        startActivity(intent);
    }


}