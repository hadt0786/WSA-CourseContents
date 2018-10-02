package com.example.sandhya.video;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import java.net.URI;


public class MainActivity extends AppCompatActivity {
     MediaController mc;

    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button);
        VideoView v1=(VideoView)findViewById(R.id.videoView);
        MediaController mc =new MediaController(this);

        mc.setAnchorView(v1);
        //m1=MediaPlayer.create(getBaseContext(),R.raw.sample);

      String uripath="android.resource://" +
              getPackageName()+"/"+R.raw.sample;

              Uri uri =Uri.parse(uripath);
        v1.setVideoURI(uri);

        //v1.setVideoPath("android.resource://raw/sample.mp4");
        //  Uri. uri=Uri.parse(Environment.getExternalStorageDirectory().getPath()+"/home/sandhya/Downloads/sample.mp4");
           v1.setMediaController(mc);
          // v1.setVideoURI(uri);
           v1.requestFocus();
          v1.start();


       /* b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //   v1.requestFocus();
                v1.start();
            }
        });*/


       /* Uri Uripath=Uri.parse("https://www.youtu be.com/watch?v=L_0jexAQsB0/abc.3gp"+R.raw.abc);
        mc=new MediaController(MainActivity.this);
        mc.setAnchorView(v1);1
        v1.setMediaController(mc);
        v1.setVideoURI(Uripath);
        v1.requestFocus();
        v1.start();*/
     /*   b1.setOnClickListene
     r(new View.OnClickListener() {
            @Override
            public void onCli/ck(View v) {

                if(v1.isPlaying()==true)

                {
                    v1.start();
                }

            }
        });*/
    }
}
