package com.example.sandhya.sensorapp;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    SensorManager sm=null;
    TextView tx=null;
    List ls;
    SensorEventListener sl =new SensorEventListener() {
        @Override
   //called when sensor value changed
        public void onSensorChanged(SensorEvent event)
        {
            float[] val=event.values;

            tx.setText("x :"+val[0]+"\n y: "+val[1]+"\n Z :"+val[2]);
        }
// called when sensor accuracy changed
        @Override
        public void onAccuracyChanged(Sensor sensor, int accuracy) {

        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      sm=(SensorManager)getSystemService(SENSOR_SERVICE);
        tx=(TextView)findViewById(R.id.textView);
        ls=sm.getSensorList(Sensor.TYPE_ACCELEROMETER);
        if(ls.size()>0)
            sm.registerListener(sl,(Sensor)ls.get(0),SensorManager.SENSOR_DELAY_NORMAL);
 else
            Toast.makeText(getBaseContext(),"Error",Toast.LENGTH_LONG).show();

    }



}

