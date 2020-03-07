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
    public void r53600 (View view){
        Intent intent = new Intent(this, cpu.class);
        cpu.amazonLink = "https://amzn.to/2Tjrnry";
        cpu.googleLink = "https://www.google.com/search?safe=active&sxsrf=ALeKk00lSOnXAewX44-vfGctItIFSC-1kg%3A1583201469075&ei=vbxdXoiVBLTT9APOnomYCQ&q=AMD+Ryzen+5+3600+6-Core&oq=AMD+Ryzen+5+3600+6-Core&gs_l=psy-ab.3..0l10.8336.8336..9196...0.1..0.109.109.0j1......0....2j1..gws-wiz.......0i71.xaET6qdMucs&ved=0ahUKEwjI56-Jnf3nAhW0KX0KHU5PApMQ4dUDCAs&uact=5";
        cpu.price = 174.99;
        cpu.partName = "AMD Ryzen 5 3600 ";
        cpu.image = R.drawable.r53600;
        startActivity(intent);
    }
    public void r72700x (View view){
        Intent intent = new Intent(this, cpu.class);
        cpu.amazonLink = "https://amzn.to/2VEiSJp";
        cpu.googleLink = "https://www.google.com/search?q=AMD+Ryzen+7+2700X&oq=AMD+Ryzen+7+2700X&aqs=chrome..69i57j69i60l3.435j0j7&sourceid=chrome&ie=UTF-8";
        cpu.price = 246.72;
        cpu.partName = "AMD Ryzen 7 2700X";
        cpu.image = R.drawable.r72700x;
        startActivity(intent);
    }
    public void r52600 (View view){
        Intent intent = new Intent(this, cpu.class);
        cpu.amazonLink = "https://amzn.to/2TAuudA";
        cpu.googleLink = "https://www.google.com/search?safe=active&sxsrf=ALeKk01W1ZeBO0hvHVVshykE3eIL4DYqDQ%3A1583220366185&ei=jgZeXszvCoLI0PEP1e6xoAw&q=AMD+Ryzen+5+2600&oq=AMD+Ryzen+5+2600&gs_l=psy-ab.3..0i67l2j0l8.518.518..1511...0.0..0.67.67.1......0....2j1..gws-wiz.moWjz3BSmQc&ved=0ahUKEwjM7pu84_3nAhUCJDQIHVV3DMQQ4dUDCAs&uact=5";
        cpu.price = 137.99;
        cpu.partName = "AMD Ryzen 5 2600";
        cpu.image = R.drawable.r52600;
        startActivity(intent);
    }
    public void r73700x(View view){
        Intent intent = new Intent(this, cpu.class);
        cpu.amazonLink = "https://amzn.to/2VITQc3";
        cpu.googleLink = "https://www.google.com/search?safe=active&sxsrf=ALeKk02qqaTuQw5hKJxR8ch9J_7xcnqRrg%3A1583221645784&ei=jQteXpC1L8m90PEPufuugAI&q=AMD+Ryzen+7+3700X&oq=AMD+Ryzen+7+3700X&gs_l=psy-ab.3..0l10.629331.629331..630924...0.5..0.67.67.1......0....2j1..gws-wiz.......0i71.S26daHICWM8&ved=0ahUKEwjQr7Ce6P3nAhXJHjQIHbm9CyAQ4dUDCAs&uact=5";
        cpu.price = 299.63;
        cpu.partName = "AMD Ryzen 7 3700X";
        cpu.image = R.drawable.r73700x;
        startActivity(intent);
    }

}

