package com.example.sandhya.date;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    DatePicker datePicker;
    Button button;
    TextView textView;

   protected void onCreate(Bundle savedInstanceState)
   {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

       textView =(TextView)findViewById(R.id.textView);

       datePicker=(DatePicker)findViewById(R.id.datePicker);
       button=(Button)findViewById(R.id.button);
       textView.setText(getCurrentDate());
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               textView.setText(getCurrentDate());
           }
       });





    }

    private String  getCurrentDate() {
        StringBuilder a=new StringBuilder();
        a.append("Current DATE");
        a.append((datePicker.getMonth()+1)+"/");
        a.append(datePicker.getDayOfMonth()+"/");
        a.append(datePicker.getYear());
        return a.toString();


    }
}
