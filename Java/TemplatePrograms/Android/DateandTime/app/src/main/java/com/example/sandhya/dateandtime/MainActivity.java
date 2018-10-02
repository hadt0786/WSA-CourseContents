package acom.example.sandhya.dateandtime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sandhya.dateandtime.R;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"WElcome Android", Toast.LENGTH_SHORT).show();
    }
}
