package com.example.ramadan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.Button;

public class ourWebSite extends Activity{

	//always remmember to add a pemission to access the internet
	WebView ourBrow;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.ourwebsite);

		ourBrow = (WebView) findViewById(R.id.webView1);
		
		ourBrow.getSettings().setJavaScriptEnabled(true);
		//ourBrow.getSettings().setLoadWithOverviewMode(true);
		ourBrow.getSettings().setUseWideViewPort(true);
		
		//ourBrow.setWebViewClient(new ourViewClient());
		try{
		ourBrow.loadUrl("http://www.projectsassociation.org/files/8-0mwqt.html");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}	
}
