package com.example.ramadan;

import java.util.Calendar;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
//import android.widget.CalendarView;

public class GridCal extends Activity implements OnClickListener {

	Context c;
	//CalendarView calendarview;
	//@TargetApi(Build.VERSION_CODES.JELLY_BEAN)
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		c = this;
		setContentView(R.layout.gridcal);
		/*calendarview=new CalendarView(this);
		calendarview = (CalendarView) findViewById(R.id.calendarView1);
		calendarview.setFocusedMonthDateColor(Color.RED);
		
		calendarview.setOnDateChangeListener( new CalendarView.OnDateChangeListener() {
		    public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
		    	try{
		    	Intent i = new Intent(c,Show.class);
		        i.putExtra("key", Integer.parseInt(initRam(month,dayOfMonth)));
		        startActivity(i);
		    	}catch(Exception e){
					e.printStackTrace();
				}
		     }//met
		  });
		*/

	}
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		//switch(){	
		//}
	}
	public String initRam(int month, int day) { // Sunday 1 Monday 2 Tuesday 3 Wednesday 4
		// Thursday 5 Friday 6 Saturday
		String x = "";

		if (month == 5) {
			if (day == 17) {
				x = "1";
			} else if (day == 18) {
				x = "2";
			} else if (day == 19) {
				x = "3";
			} else if (day == 20) {
				x = "4";
			} else if (day == 21) {
				x = "5";
			} else if (day == 22) {
				x = "6";
			} else if (day == 23) {
				x = "7";
			} else if (day == 24) {
				x = "8";
			} else if (day == 25) {
				x = "9";
			} else if (day == 26) {
				x = "10";
			} else if (day == 27) {
				x = "11";
			} else if (day == 28) {
				x = "12";
			} else if (day == 29) {
				x = "13";
			} else if (day == 30) {
				x = "14";
			}
		} else if (month == 6) {
			if (day == 1) {
				x = "15";
			} else if (day == 2) {
				x = "16";
			} else if (day == 3) {
				x = "17";
			} else if (day == 4) {
				x = "18";
			} else if (day == 5) {
				x = "19";
			} else if (day == 6) {
				x = "20";
			} else if (day == 7) {
				x = "21";
			} else if (day == 8) {
				x = "22";
			} else if (day == 9) {
				x = "23";
			} else if (day == 10) {
				x = "24";
			} else if (day == 11) {
				x = "25";
			} else if (day == 12) {
				x = "26";
			} else if (day == 13) {
				x = "27";
			} else if (day == 14) {
				x = "28";
			} else if (day == 15) {
				x = "29";
			} else if (day == 16) {
				x = "30";
			}
		}
		return x;
	}
}
