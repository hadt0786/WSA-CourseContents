package com.example.progressbarexample;

import javax.security.auth.callback.Callback;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ProgressBar;

public class MainActivity extends ActionBarActivity {

	Thread t;
	Handler h;
	ProgressBar progressBar;
	//main thread-1
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		progressBar = (ProgressBar) findViewById(R.id.progressBar1);
		t = new Thread(new MyThread());
		t.start();
		// handler objects
		h = new Handler(){
			@Override
			public void handleMessage(Message message){
				
				progressBar.setProgress(message.arg1);
			}
		};
		
		
	}

	// other thread-2
	class MyThread implements Runnable{

		@Override
		public void run() {
			//Message message = h.obtainMessage();
			for(int i=0;i<100;i++){
				
				//getting message for progress bar activity
				Message message = Message.obtain();
				message.arg1=i;
				//sending messgae to the handler
				
				h.sendMessage(message);
				
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		}
		
		
		
	}
	
}
