package com.example.ramadan;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class madih extends Activity implements OnClickListener{

	MediaPlayer song;
	Button bplay,bpause,bstop;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.madih);
		bplay = (Button) findViewById(R.id.button1);
		bpause = (Button) findViewById(R.id.button2);
		bstop = (Button) findViewById(R.id.button3);
		song = MediaPlayer.create(madih.this, R.raw.s2);
		
		bplay.setOnClickListener(this);
		bpause.setOnClickListener(this);
		bstop.setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getId())
		{
		case R.id.button1:
			song.start();
			break;
		case R.id.button2:
			song.pause();			
			break;
		case R.id.button3:
			song.stop();
			break;
		}
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		song.stop();
		finish();
	}
}
