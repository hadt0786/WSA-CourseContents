package com.example.sandhya.gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<String> list;
    GridView grid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=new ArrayList<String>();
        grid=(GridView)findViewById(R.id.gridView);
        list.add("Grid 1");
        list.add("Grid 2");
        list.add("Grid 3");
        list.add("Grid 4");
        list.add("Grid 5");
        list.add("Grid 6");
        list.add("Grid 7");
        list.add("Grid 8");
        list.add("Grid 9");

        ArrayAdapter<String> a1=new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,list);
        grid.setAdapter(a1);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),list.get(2),Toast.LENGTH_SHORT).show();

            }
        });
    }
}
