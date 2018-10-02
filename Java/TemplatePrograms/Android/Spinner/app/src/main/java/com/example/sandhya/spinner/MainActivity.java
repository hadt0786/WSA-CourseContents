package com.example.sandhya.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements  AdapterView.OnItemSelectedListener{


        String[] flower = {"rose", "Marrigold", "Lotus"};
        @Override
        protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spin = (Spinner) findViewById(R.id.spinner);//initializing spinner object
        spin.setOnItemSelectedListener(this);
         // Creating ArrayAdapter a2
        ArrayAdapter a2 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, flower);
        a2.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spin.setAdapter(a2);//setting adapter to spinner
    }

    //OnItemSelectedListener has two method onItemSelected and onNothingSelected
@Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        Toast.makeText(getApplicationContext(), flower[position], Toast.LENGTH_LONG).show();

    }
@Override
    public void onNothingSelected(AdapterView<?>arg0)
    {

    }

}