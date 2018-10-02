package com.example.sqlitetest;

import android.support.v7.app.ActionBarActivity;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	
	Button save, load;
	EditText name, email;
	
	DataHandler handler;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		save = (Button) findViewById(R.id.save);
		load = (Button) findViewById(R.id.load);
		
		name = (EditText) findViewById(R.id.name);
		email = (EditText) findViewById(R.id.email);
		
		
		save.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				String getName = name.getText().toString();
				String getEmail = email.getText().toString();
				
				handler = new DataHandler(getBaseContext());
				handler.open();
				
				long id = handler.insertData(getName, getEmail);
				Toast.makeText(getBaseContext(), "data inserted", Toast.LENGTH_LONG).show();
				handler.close();
				
			}
		});
		
		
		load.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {

				String getName,getEmail;
				
				getName=" ";
				getEmail=" ";
				handler = new DataHandler(getBaseContext());
				handler.open();
				
				Cursor c = handler.returnData();
				
				if(c.moveToFirst()){
					
					do{
						
						getName=c.getString(0);
						getEmail=c.getString(1);
					}while(c.moveToNext());
					
				}
				
				handler.close();
				Toast.makeText(getBaseContext(), "Name :"+getName +" Email: "+getEmail, Toast.LENGTH_LONG).show();
			}
		});
	}

	
}
