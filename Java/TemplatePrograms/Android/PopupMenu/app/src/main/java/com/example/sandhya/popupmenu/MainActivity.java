package com.example.sandhya.popupmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu p1 =new PopupMenu(MainActivity.this,b1);
                //using menu xml file

                p1.getMenuInflater().inflate(R.menu.menu1,p1.getMenu());

                //registering popup with OnMenuItemClickListener

                p1.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener()
                {

                    @Override
                    public boolean onMenuItemClick(MenuItem item) {

                        Toast.makeText(MainActivity.this,"You Clicked"+item.getTitle(),Toast.LENGTH_LONG).show();

                        return true;

                    }
                });
                p1.show();
            }
        });
    }
}
