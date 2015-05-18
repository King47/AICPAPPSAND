package com.example.ramadan;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class Show extends Activity implements OnClickListener {

	String answer = "";
	// TextView t,tE,tM;
	TextView Emsak, Fajer, Shorok, Thohor, Aser, Maghreb, IshaA, d;
	Button s;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.show);
		s = (Button) findViewById(R.id.button1);
		s.setOnClickListener(this);

		// t = (TextView) findViewById(R.id.textView1);
		// tE = (TextView) findViewById(R.id.textView2);
		// tM = (TextView) findViewById(R.id.textView4);
		Lang();

		Emsak = (TextView) findViewById(R.id.text1);
		Fajer = (TextView) findViewById(R.id.text3);
		Thohor = (TextView) findViewById(R.id.text5);
		Aser = (TextView) findViewById(R.id.text7);
		Maghreb = (TextView) findViewById(R.id.text9);
		IshaA = (TextView) findViewById(R.id.text11);
		Shorok = (TextView) findViewById(R.id.text13);
		d = (TextView) findViewById(R.id.textViewImpo);
		// tE.setTextColor(Color.RED);
		// tM.setTextColor(Color.RED);

		Bundle g = getIntent().getExtras();
		int k = g.getInt("key");
		Ret(k);
	}

	public void Lang() {
		SharedPreferences getPrefs = PreferenceManager
				.getDefaultSharedPreferences(getBaseContext());
		String coin = getPrefs.getString("listy", "1");
		if (coin.equals("1")) {
			s.setText("لتوقيت غير بيروت اضغط هنا");
		} else if (coin.equals("2")) {
			s.setText("Click here for timing other than Beirut");
		}
	}

	public void SetTime(String Em, String Fa, String Sh, String Th, String As,
			String Ma, String Ish) {
		Emsak.setText(Em);
		Fajer.setText(Fa);
		Shorok.setText(Sh);
		Thohor.setText(Th);
		Aser.setText(As);
		Maghreb.setText(Ma);
		IshaA.setText(Ish);
	}

	public void dayO(int day, int Mon,int Month, int ram) {
		String da= "";
		String Mont = "";
		String Ra = ram + " رمضان";
		switch (day) {
		case 1:
			da = "Saturday 2015 السبت";
			break;
		case 2:
			da = "Sunday 2015 الاحد";
			break;
		case 3:
			da = "Monday 2015 الاثنين";
			break;
		case 4:
			da = "Tuesday 2015 الثلاثاء";
			break;
		case 5:
			da = "Wednesday 2015 الاربعاء";
			break;
		case 6:
			da = "Thursday 2015 الخميس";
			break;
		case 7:
			da = "Friday 2015 الجمعة";
			break;
		}
		switch(Mon)
		{
		case 1:
			Mont = Month + " June حزيران";
			break;
		case 2:
			Mont = Month + " July تموز";
			break;
		}
		d.setText(da+"\n"+ Mont + "\n"+Ra);
	}

	public void Ret(int x) {
		switch (x) {
		case 1:
			dayO(5,1,17,1);
			SetTime("3:13", "3:33", "5:20", "12:43", "4:28", "19:57","9:34");
			break;
		case 2:
			dayO(6,1,18,2);
			SetTime("3:12", "3:32", "5:19", "12:43", "4:28", "19:57","9:34");
			break;
		case 3:
			dayO(7,1,19,3);
			SetTime("3:12", "3:32", "5:19", "12:43", "4:28", "19:57","9:34");
			break;
		case 4:
			dayO(1,1,20,4);
			SetTime("3:12", "3:32", "5:19", "12:43", "4:28", "19:57","9:34");
			break;
		case 5:
			dayO(2,1,21,5);
			SetTime("3:12", "3:32", "5:19", "12:43", "4:28", "19:58","9:35");
			break;
		case 6:
			dayO(3,1,22,6);
			SetTime("3:12", "3:32", "5:19", "12:43", "4:28", "19:58","9:35");
			break;
		case 7:
			dayO(4,1,23,7);
			SetTime("3:12", "3:32", "5:19", "12:43", "4:28", "19:58","9:35");
			break;
		case 8:
			dayO(5,1,24,8);
			SetTime("3:13", "3:33", "5:20", "12:44", "4:29", "19:58","9:36");
			break;
		case 9:
			dayO(6,1,25,9);
			SetTime("3:13", "3:33", "5:20", "12:44", "4:29", "19:58","9:36");
			break;
		case 10:
			dayO(7,1,26,10);
			SetTime("3:14", "3:34", "5:21", "12:45", "4:30", "19:59","9:36");
			break;
		case 11:
			dayO(1,1,27,11);
			SetTime("3:14", "3:34", "5:21", "12:45", "4:30", "19:59","9:36");
			break;
		case 12:
			dayO(2,1,28,12);
			SetTime("3:15", "3:35", "5:21", "12:46", "4:30", "19:59","9:36");
			break;
		case 13:
			dayO(3,1,29,13);
			SetTime("3:15", "3:35", "5:21", "12:46", "4:30", "19:59","9:37");
			break;
		case 14:
			dayO(4,1,30,14);
			SetTime("3:16", "3:36", "5:22", "12:46", "4:30", "19:59","9:37");
			break;
		case 15:
			dayO(5,2,1,15);
			SetTime("3:17", "3:37", "5:23", "12:46", "4:31", "19:59","9:36");
			break;
		case 16:
			dayO(6,2,2,16);
			SetTime("3:17", "3:37", "5:23", "12:46", "4:31", "19:59","9:35");
			break;
		case 17:
			dayO(7,2,3,17);
			SetTime("3:18", "3:38", "5:24", "12:47", "4:31", "19:59","9:35");
			break;
		case 18:
			dayO(1,2,4,18);
			SetTime("3:19", "3:39", "5:25", "12:47", "4:31", "19:59","9:35");
			break;
		case 19:
			dayO(2,2,5,19);
			SetTime("3:20", "3:40", "5:25", "12:47", "4:32", "19:59","9:35");
			break;
		case 20:
			dayO(3,2,6,20);
			SetTime("3:21", "3:41", "5:26", "12:47", "4:32", "19:59","9:35");
			break;
		case 21:
			dayO(4,2,7,21);
			SetTime("3:22", "3:42", "5:27", "12:48", "4:33", "19:59","9:35");
			break;
		case 22:
			dayO(5,2,8,22);
			SetTime("3:23", "3:43", "5:27", "12:48", "4:33", "19:59","9:34");
			break;
		case 23:
			dayO(6,2,9,23);
			SetTime("3:24", "3:44", "5:28", "12:48", "4:33", "19:59","9:34");
			break;
		case 24:
			dayO(7,2,10,24);
			SetTime("3:25", "3:45", "5:29", "12:49", "4:34", "19:59","9:34");
			break;
		case 25:
			dayO(1,2,11,25);
			SetTime("3:25", "3:45", "5:29", "12:49", "4:34", "19:58","9:33");
			break;
		case 26:
			dayO(2,2,12,26);
			SetTime("3:26", "3:46", "5:30", "12:49", "4:34", "19:58","9:32");
			break;
		case 27:
			dayO(3,2,13,27);
			SetTime("3:26", "3:46", "5:30", "12:49", "4:34", "19:57","9:31");
			break;
		case 28:
			dayO(4,2,14,28);
			SetTime("3:27", "3:47", "5:31", "12:49", "4:34", "19:57","9:31");
			break;
		case 29:
			dayO(5,2,15,29);
			SetTime("3:28", "3:48", "5:32", "12:49", "4:34", "19:57","9:31");
			break;
		case 30:
			dayO(6,2,16,30);
			SetTime("3:28", "3:48", "5:32", "12:49", "4:34", "19:56","9:30");
			break;
		}
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent i = new Intent("com.example.ramadan.ourWebSite");
		startActivity(i);
	}
}
