package com.example.wifitest1;

import android.support.v7.app.ActionBarActivity;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {

	Button enableButton,disableButton; 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		enableButton = (Button) findViewById(R.id.enable);
		disableButton = (Button) findViewById(R.id.disable);
		
		
		enableButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				 WifiManager wifi = (WifiManager) getSystemService(Context.WIFI_SERVICE);  
	                wifi.setWifiEnabled(true); 
	               // Toast.makeText
			}
		});
		disableButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {


				 WifiManager wifi = (WifiManager) getSystemService(Context.WIFI_SERVICE);  
	                wifi.setWifiEnabled(false); 
			}
		});
	}

	

	
}
