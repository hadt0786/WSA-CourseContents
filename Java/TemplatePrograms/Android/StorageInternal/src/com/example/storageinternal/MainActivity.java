package com.example.storageinternal;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	EditText editData;
	EditText editFile;
	
	
	Button buttonSave;
	Button buttonRead;
	String  fileName;
	//-----------Input Output classes
	
	
	FileOutputStream fos;
	FileInputStream fis;
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		editData = (EditText)findViewById(R.id.editText1);
		editFile =(EditText)findViewById(R.id.editText2);
		
		buttonSave = (Button)findViewById(R.id.button1);
		buttonRead = (Button)findViewById(R.id.button2);
		
		
		//save operation listener
		
		
		buttonSave.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				
				
				
				save();
				
			}
			
		});
		
		
		// read button listener
		
		buttonRead.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				read();
				
				
			}
		});
		
		
		
	}
	
	//----------save operation
	
	
	public void save(){
		
		
		try{
			
			String data = editData.getText().toString();
			fileName = editFile.getText().toString();
			
			fos = openFileOutput(fileName, MODE_PRIVATE);
			
		
			byte [] b = data.getBytes();
			fos.write(b);
			
			Toast.makeText(this, "saved successfully", Toast.LENGTH_LONG).show();
			}
		
		catch(Exception e){
			
			e.printStackTrace();
			
		}
		
		
	}
	
	
	//------------read operation
	
	
	
	
	public void read(){
		
		
		try{
			
		
			fis = new FileInputStream(fileName);
		
			int a=0;
			while((a=fis.read())!=-1){
				
				Toast.makeText(this, (char)a, Toast.LENGTH_LONG).show();
				
			}
			
		}
		
		
		catch(Exception e){
			
			
			
			
		}
	}
	

	
}
