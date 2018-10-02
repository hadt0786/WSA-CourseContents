package com.example.activity12;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Activity1 extends Activity {



	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final Context context = this;
		
		final RadioButton maleRadio = (RadioButton)findViewById(R.id.radioButton1);
		
	
		maleRadio.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				if(((RadioButton)v).isChecked()){
					
					Toast.makeText(context, maleRadio.getText(), Toast.LENGTH_LONG).show();
				}
				
			}
		});
		
		
		
		
		
		
		
	
		
		
		
		
		
	}






}
