package com.example.ramadan;

import java.util.Calendar;

import com.example.ramadan.front.DummySectionFragment;

import android.annotation.TargetApi;
//import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Toast;

public class grid extends Activity implements
		//ActionBar.OnNavigationListener,// Activity implements
		OnClickListener {
	private static final String STATE_SELECTED_NAVIGATION_ITEM = "selected_navigation_item";
	int day = 0, month = 0;
	Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15,
			b16, b17, b18, b19, b20, b21, b22, b23, b24, b25, b26, b27, b28,
			b29, b30;

	public static int count = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
		WindowManager.LayoutParams.FLAG_FULLSCREEN);
/*
		Calendar calendar = Calendar.getInstance();
		day = calendar.get(Calendar.DAY_OF_MONTH);
		month = calendar.get(Calendar.MONTH);
*/
		setContentView(R.layout.grid);
		Init();
		initBack();

		/*final ActionBar actionBar = getActionBar();
		actionBar.setDisplayShowTitleEnabled(false);
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);
		// Set up the dropdown list navigation in the action bar.
		actionBar.setListNavigationCallbacks(
		// Specify a SpinnerAdapter to populate the dropdown list.
				new ArrayAdapter<String>(getActionBarThemedContextCompat(),
						android.R.layout.simple_list_item_1,
						android.R.id.text1, new String[] {
								getString(R.string.title_section1),
								getString(R.string.title_section2),
								getString(R.string.title_section3),
								getString(R.string.title_section4), }), this);*/
	}
/*
	@TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
	private Context getActionBarThemedContextCompat() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH) {
			return getActionBar().getThemedContext();
		} else {
			return this;
		}
	}

	@Override
	public void onRestoreInstanceState(Bundle savedInstanceState) {
		// Restore the previously serialized current dropdown position.
		if (savedInstanceState.containsKey(STATE_SELECTED_NAVIGATION_ITEM)) {
			getActionBar().setSelectedNavigationItem(
					savedInstanceState.getInt(STATE_SELECTED_NAVIGATION_ITEM));
		}
	}
*/
	/*
	@Override
	public void onSaveInstanceState(Bundle outState) {
		// Serialize the current dropdown position.
		outState.putInt(STATE_SELECTED_NAVIGATION_ITEM, getActionBar()
				.getSelectedNavigationIndex());
	}
*/
	public void initBack() {
		// Sunday 1 Monday 2 Tuesday 3 Wednesday 4 Thursday 5 Friday 6 Saturday
		// 7
		if (month == 5) {
			if (day == 17) {
				b1.setBackgroundResource(R.drawable.ba);
			}
			if (day == 18) {
				b1.setBackgroundResource(R.drawable.ba);
				b2.setBackgroundResource(R.drawable.ba2);
			} else if (day == 19) {
				b1.setBackgroundResource(R.drawable.ba);
				b2.setBackgroundResource(R.drawable.ba2);
				b3.setBackgroundResource(R.drawable.ba3);
			} else if (day == 20) {
				b1.setBackgroundResource(R.drawable.ba);
				b2.setBackgroundResource(R.drawable.ba2);
				b3.setBackgroundResource(R.drawable.ba3);
				b4.setBackgroundResource(R.drawable.ba4);
			} else if (day == 21) {
				b1.setBackgroundResource(R.drawable.ba);
				b2.setBackgroundResource(R.drawable.ba2);
				b3.setBackgroundResource(R.drawable.ba3);
				b4.setBackgroundResource(R.drawable.ba4);
				b5.setBackgroundResource(R.drawable.ba5);// ////till heres
			} else if (day == 22) {
				b1.setBackgroundResource(R.drawable.ba);
				b2.setBackgroundResource(R.drawable.ba2);
				b3.setBackgroundResource(R.drawable.ba3);
				b4.setBackgroundResource(R.drawable.ba4);
				b5.setBackgroundResource(R.drawable.ba5);
				b6.setBackgroundResource(R.drawable.ba6);

			} else if (day == 23) {
				b1.setBackgroundResource(R.drawable.ba);
				b2.setBackgroundResource(R.drawable.ba2);
				b3.setBackgroundResource(R.drawable.ba3);
				b4.setBackgroundResource(R.drawable.ba4);
				b5.setBackgroundResource(R.drawable.ba5);
				b6.setBackgroundResource(R.drawable.ba6);
				b7.setBackgroundResource(R.drawable.ba7);
			} else if (day == 24) {
				b1.setBackgroundResource(R.drawable.ba);
				b2.setBackgroundResource(R.drawable.ba2);
				b3.setBackgroundResource(R.drawable.ba3);
				b4.setBackgroundResource(R.drawable.ba4);
				b5.setBackgroundResource(R.drawable.ba5);
				b6.setBackgroundResource(R.drawable.ba6);
				b7.setBackgroundResource(R.drawable.ba7);
				b8.setBackgroundResource(R.drawable.ba8);
			} else if (day == 25) {
				b1.setBackgroundResource(R.drawable.ba);
				b2.setBackgroundResource(R.drawable.ba2);
				b3.setBackgroundResource(R.drawable.ba3);
				b4.setBackgroundResource(R.drawable.ba4);
				b5.setBackgroundResource(R.drawable.ba5);
				b6.setBackgroundResource(R.drawable.ba6);
				b7.setBackgroundResource(R.drawable.ba7);
				b8.setBackgroundResource(R.drawable.ba8);
				b9.setBackgroundResource(R.drawable.ba9);
			} else if (day == 26) {
				b1.setBackgroundResource(R.drawable.ba);
				b2.setBackgroundResource(R.drawable.ba2);
				b3.setBackgroundResource(R.drawable.ba3);
				b4.setBackgroundResource(R.drawable.ba4);
				b5.setBackgroundResource(R.drawable.ba5);
				b6.setBackgroundResource(R.drawable.ba6);
				b7.setBackgroundResource(R.drawable.ba7);
				b8.setBackgroundResource(R.drawable.ba8);
				b9.setBackgroundResource(R.drawable.ba9);
				b10.setBackgroundResource(R.drawable.ba10);
			} else if (day == 27) {
				b1.setBackgroundResource(R.drawable.ba);
				b2.setBackgroundResource(R.drawable.ba2);
				b3.setBackgroundResource(R.drawable.ba3);
				b4.setBackgroundResource(R.drawable.ba4);
				b5.setBackgroundResource(R.drawable.ba5);
				b6.setBackgroundResource(R.drawable.ba6);
				b7.setBackgroundResource(R.drawable.ba7);
				b8.setBackgroundResource(R.drawable.ba8);
				b9.setBackgroundResource(R.drawable.ba9);
				b10.setBackgroundResource(R.drawable.ba10);
				b11.setBackgroundResource(R.drawable.ba11);
			} else if (day == 28) {
				b1.setBackgroundResource(R.drawable.ba);
				b2.setBackgroundResource(R.drawable.ba2);
				b3.setBackgroundResource(R.drawable.ba3);
				b4.setBackgroundResource(R.drawable.ba4);
				b5.setBackgroundResource(R.drawable.ba5);
				b6.setBackgroundResource(R.drawable.ba6);
				b7.setBackgroundResource(R.drawable.ba7);
				b8.setBackgroundResource(R.drawable.ba8);
				b9.setBackgroundResource(R.drawable.ba9);
				b10.setBackgroundResource(R.drawable.ba10);
				b11.setBackgroundResource(R.drawable.ba11);
				b12.setBackgroundResource(R.drawable.ba12);
			} else if (day == 29) {
				b1.setBackgroundResource(R.drawable.ba);
				b2.setBackgroundResource(R.drawable.ba2);
				b3.setBackgroundResource(R.drawable.ba3);
				b4.setBackgroundResource(R.drawable.ba4);
				b5.setBackgroundResource(R.drawable.ba5);
				b6.setBackgroundResource(R.drawable.ba6);
				b7.setBackgroundResource(R.drawable.ba7);
				b8.setBackgroundResource(R.drawable.ba8);
				b9.setBackgroundResource(R.drawable.ba9);
				b10.setBackgroundResource(R.drawable.ba10);
				b11.setBackgroundResource(R.drawable.ba11);
				b12.setBackgroundResource(R.drawable.ba12);
				b13.setBackgroundResource(R.drawable.ba13);
			} else if (day == 30) {
				b1.setBackgroundResource(R.drawable.ba);
				b2.setBackgroundResource(R.drawable.ba2);
				b3.setBackgroundResource(R.drawable.ba3);
				b4.setBackgroundResource(R.drawable.ba4);
				b5.setBackgroundResource(R.drawable.ba5);
				b6.setBackgroundResource(R.drawable.ba6);
				b7.setBackgroundResource(R.drawable.ba7);
				b8.setBackgroundResource(R.drawable.ba8);
				b9.setBackgroundResource(R.drawable.ba9);
				b10.setBackgroundResource(R.drawable.ba10);
				b11.setBackgroundResource(R.drawable.ba11);
				b12.setBackgroundResource(R.drawable.ba12);
				b13.setBackgroundResource(R.drawable.ba13);
				b14.setBackgroundResource(R.drawable.ba14);
			}
		} else if (month == 6) {
			if (day == 1) {
				b1.setBackgroundResource(R.drawable.ba);
				b2.setBackgroundResource(R.drawable.ba2);
				b3.setBackgroundResource(R.drawable.ba3);
				b4.setBackgroundResource(R.drawable.ba4);
				b5.setBackgroundResource(R.drawable.ba5);
				b6.setBackgroundResource(R.drawable.ba6);
				b7.setBackgroundResource(R.drawable.ba7);
				b8.setBackgroundResource(R.drawable.ba8);
				b9.setBackgroundResource(R.drawable.ba9);
				b10.setBackgroundResource(R.drawable.ba10);
				b11.setBackgroundResource(R.drawable.ba11);
				b12.setBackgroundResource(R.drawable.ba12);
				b13.setBackgroundResource(R.drawable.ba13);
				b14.setBackgroundResource(R.drawable.ba14);
				b15.setBackgroundResource(R.drawable.ba15);
			} else if (day == 2) {
				b1.setBackgroundResource(R.drawable.ba);
				b2.setBackgroundResource(R.drawable.ba2);
				b3.setBackgroundResource(R.drawable.ba3);
				b4.setBackgroundResource(R.drawable.ba4);
				b5.setBackgroundResource(R.drawable.ba5);
				b6.setBackgroundResource(R.drawable.ba6);
				b7.setBackgroundResource(R.drawable.ba7);
				b8.setBackgroundResource(R.drawable.ba8);
				b9.setBackgroundResource(R.drawable.ba9);
				b10.setBackgroundResource(R.drawable.ba10);
				b11.setBackgroundResource(R.drawable.ba11);
				b12.setBackgroundResource(R.drawable.ba12);
				b13.setBackgroundResource(R.drawable.ba13);
				b14.setBackgroundResource(R.drawable.ba14);
				b15.setBackgroundResource(R.drawable.ba15);
				b16.setBackgroundResource(R.drawable.ba16);
			} else if (day == 3) {
				b1.setBackgroundResource(R.drawable.ba);
				b2.setBackgroundResource(R.drawable.ba2);
				b3.setBackgroundResource(R.drawable.ba3);
				b4.setBackgroundResource(R.drawable.ba4);
				b5.setBackgroundResource(R.drawable.ba5);
				b6.setBackgroundResource(R.drawable.ba6);
				b7.setBackgroundResource(R.drawable.ba7);
				b8.setBackgroundResource(R.drawable.ba8);
				b9.setBackgroundResource(R.drawable.ba9);
				b10.setBackgroundResource(R.drawable.ba10);
				b11.setBackgroundResource(R.drawable.ba11);
				b12.setBackgroundResource(R.drawable.ba12);
				b13.setBackgroundResource(R.drawable.ba13);
				b14.setBackgroundResource(R.drawable.ba14);
				b15.setBackgroundResource(R.drawable.ba15);
				b16.setBackgroundResource(R.drawable.ba16);
				b17.setBackgroundResource(R.drawable.ba17);
			} else if (day == 4) {
				b1.setBackgroundResource(R.drawable.ba);
				b2.setBackgroundResource(R.drawable.ba2);
				b3.setBackgroundResource(R.drawable.ba3);
				b4.setBackgroundResource(R.drawable.ba4);
				b5.setBackgroundResource(R.drawable.ba5);
				b6.setBackgroundResource(R.drawable.ba6);
				b7.setBackgroundResource(R.drawable.ba7);
				b8.setBackgroundResource(R.drawable.ba8);
				b9.setBackgroundResource(R.drawable.ba9);
				b10.setBackgroundResource(R.drawable.ba10);
				b11.setBackgroundResource(R.drawable.ba11);
				b12.setBackgroundResource(R.drawable.ba12);
				b13.setBackgroundResource(R.drawable.ba13);
				b14.setBackgroundResource(R.drawable.ba14);
				b15.setBackgroundResource(R.drawable.ba15);
				b16.setBackgroundResource(R.drawable.ba16);
				b17.setBackgroundResource(R.drawable.ba17);
				b18.setBackgroundResource(R.drawable.ba18);
			} else if (day == 5) {
				b1.setBackgroundResource(R.drawable.ba);
				b2.setBackgroundResource(R.drawable.ba2);
				b3.setBackgroundResource(R.drawable.ba3);
				b4.setBackgroundResource(R.drawable.ba4);
				b5.setBackgroundResource(R.drawable.ba5);
				b6.setBackgroundResource(R.drawable.ba6);
				b7.setBackgroundResource(R.drawable.ba7);
				b8.setBackgroundResource(R.drawable.ba8);
				b9.setBackgroundResource(R.drawable.ba9);
				b10.setBackgroundResource(R.drawable.ba10);
				b11.setBackgroundResource(R.drawable.ba11);
				b12.setBackgroundResource(R.drawable.ba12);
				b13.setBackgroundResource(R.drawable.ba13);
				b14.setBackgroundResource(R.drawable.ba14);
				b15.setBackgroundResource(R.drawable.ba15);
				b16.setBackgroundResource(R.drawable.ba16);
				b17.setBackgroundResource(R.drawable.ba17);
				b18.setBackgroundResource(R.drawable.ba18);
				b19.setBackgroundResource(R.drawable.ba19);
			} else if (day == 6) {
				b1.setBackgroundResource(R.drawable.ba);
				b2.setBackgroundResource(R.drawable.ba2);
				b3.setBackgroundResource(R.drawable.ba3);
				b4.setBackgroundResource(R.drawable.ba4);
				b5.setBackgroundResource(R.drawable.ba5);
				b6.setBackgroundResource(R.drawable.ba6);
				b7.setBackgroundResource(R.drawable.ba7);
				b8.setBackgroundResource(R.drawable.ba8);
				b9.setBackgroundResource(R.drawable.ba9);
				b10.setBackgroundResource(R.drawable.ba10);
				b11.setBackgroundResource(R.drawable.ba11);
				b12.setBackgroundResource(R.drawable.ba12);
				b13.setBackgroundResource(R.drawable.ba13);
				b14.setBackgroundResource(R.drawable.ba14);
				b15.setBackgroundResource(R.drawable.ba15);
				b16.setBackgroundResource(R.drawable.ba16);
				b17.setBackgroundResource(R.drawable.ba17);
				b18.setBackgroundResource(R.drawable.ba18);
				b19.setBackgroundResource(R.drawable.ba19);
				b20.setBackgroundResource(R.drawable.ba20);
			} else if (day == 7) {
				b1.setBackgroundResource(R.drawable.ba);
				b2.setBackgroundResource(R.drawable.ba2);
				b3.setBackgroundResource(R.drawable.ba3);
				b4.setBackgroundResource(R.drawable.ba4);
				b5.setBackgroundResource(R.drawable.ba5);
				b6.setBackgroundResource(R.drawable.ba6);
				b7.setBackgroundResource(R.drawable.ba7);
				b8.setBackgroundResource(R.drawable.ba8);
				b9.setBackgroundResource(R.drawable.ba9);
				b10.setBackgroundResource(R.drawable.ba10);
				b11.setBackgroundResource(R.drawable.ba11);
				b12.setBackgroundResource(R.drawable.ba12);
				b13.setBackgroundResource(R.drawable.ba13);
				b14.setBackgroundResource(R.drawable.ba14);
				b15.setBackgroundResource(R.drawable.ba15);
				b16.setBackgroundResource(R.drawable.ba16);
				b17.setBackgroundResource(R.drawable.ba17);
				b18.setBackgroundResource(R.drawable.ba18);
				b19.setBackgroundResource(R.drawable.ba19);
				b20.setBackgroundResource(R.drawable.ba20);
				b21.setBackgroundResource(R.drawable.ba21);
			} else if (day == 8) {
				b1.setBackgroundResource(R.drawable.ba);
				b2.setBackgroundResource(R.drawable.ba2);
				b3.setBackgroundResource(R.drawable.ba3);
				b4.setBackgroundResource(R.drawable.ba4);
				b5.setBackgroundResource(R.drawable.ba5);
				b6.setBackgroundResource(R.drawable.ba6);
				b7.setBackgroundResource(R.drawable.ba7);
				b8.setBackgroundResource(R.drawable.ba8);
				b9.setBackgroundResource(R.drawable.ba9);
				b10.setBackgroundResource(R.drawable.ba10);
				b11.setBackgroundResource(R.drawable.ba11);
				b12.setBackgroundResource(R.drawable.ba12);
				b13.setBackgroundResource(R.drawable.ba13);
				b14.setBackgroundResource(R.drawable.ba14);
				b15.setBackgroundResource(R.drawable.ba15);
				b16.setBackgroundResource(R.drawable.ba16);
				b17.setBackgroundResource(R.drawable.ba17);
				b18.setBackgroundResource(R.drawable.ba18);
				b19.setBackgroundResource(R.drawable.ba19);
				b20.setBackgroundResource(R.drawable.ba20);
				b21.setBackgroundResource(R.drawable.ba21);
				b22.setBackgroundResource(R.drawable.ba22);
				// /////////////////////////////////////////
			} else if (day == 9) {
				b1.setBackgroundResource(R.drawable.ba);
				b2.setBackgroundResource(R.drawable.ba2);
				b3.setBackgroundResource(R.drawable.ba3);
				b4.setBackgroundResource(R.drawable.ba4);
				b5.setBackgroundResource(R.drawable.ba5);
				b6.setBackgroundResource(R.drawable.ba6);
				b7.setBackgroundResource(R.drawable.ba7);
				b8.setBackgroundResource(R.drawable.ba8);
				b9.setBackgroundResource(R.drawable.ba9);
				b10.setBackgroundResource(R.drawable.ba10);
				b11.setBackgroundResource(R.drawable.ba11);
				b12.setBackgroundResource(R.drawable.ba12);
				b13.setBackgroundResource(R.drawable.ba13);
				b14.setBackgroundResource(R.drawable.ba14);
				b15.setBackgroundResource(R.drawable.ba15);
				b16.setBackgroundResource(R.drawable.ba16);
				b17.setBackgroundResource(R.drawable.ba17);
				b18.setBackgroundResource(R.drawable.ba18);
				b19.setBackgroundResource(R.drawable.ba19);
				b20.setBackgroundResource(R.drawable.ba20);
				b21.setBackgroundResource(R.drawable.ba21);
				b22.setBackgroundResource(R.drawable.ba22);
				b23.setBackgroundResource(R.drawable.ba23);
			} else if (day == 10) {
				b1.setBackgroundResource(R.drawable.ba);
				b2.setBackgroundResource(R.drawable.ba2);
				b3.setBackgroundResource(R.drawable.ba3);
				b4.setBackgroundResource(R.drawable.ba4);
				b5.setBackgroundResource(R.drawable.ba5);
				b6.setBackgroundResource(R.drawable.ba6);
				b7.setBackgroundResource(R.drawable.ba7);
				b8.setBackgroundResource(R.drawable.ba8);
				b9.setBackgroundResource(R.drawable.ba9);
				b10.setBackgroundResource(R.drawable.ba10);
				b11.setBackgroundResource(R.drawable.ba11);
				b12.setBackgroundResource(R.drawable.ba12);
				b13.setBackgroundResource(R.drawable.ba13);
				b14.setBackgroundResource(R.drawable.ba14);
				b15.setBackgroundResource(R.drawable.ba15);
				b16.setBackgroundResource(R.drawable.ba16);
				b17.setBackgroundResource(R.drawable.ba17);
				b18.setBackgroundResource(R.drawable.ba18);
				b19.setBackgroundResource(R.drawable.ba19);
				b20.setBackgroundResource(R.drawable.ba20);
				b21.setBackgroundResource(R.drawable.ba21);
				b22.setBackgroundResource(R.drawable.ba22);
				b23.setBackgroundResource(R.drawable.ba23);
				b24.setBackgroundResource(R.drawable.ba24);
			} else if (day == 11) {
				b1.setBackgroundResource(R.drawable.ba);
				b2.setBackgroundResource(R.drawable.ba2);
				b3.setBackgroundResource(R.drawable.ba3);
				b4.setBackgroundResource(R.drawable.ba4);
				b5.setBackgroundResource(R.drawable.ba5);
				b6.setBackgroundResource(R.drawable.ba6);
				b7.setBackgroundResource(R.drawable.ba7);
				b8.setBackgroundResource(R.drawable.ba8);
				b9.setBackgroundResource(R.drawable.ba9);
				b10.setBackgroundResource(R.drawable.ba10);
				b11.setBackgroundResource(R.drawable.ba11);
				b12.setBackgroundResource(R.drawable.ba12);
				b13.setBackgroundResource(R.drawable.ba13);
				b14.setBackgroundResource(R.drawable.ba14);
				b15.setBackgroundResource(R.drawable.ba15);
				b16.setBackgroundResource(R.drawable.ba16);
				b17.setBackgroundResource(R.drawable.ba17);
				b18.setBackgroundResource(R.drawable.ba18);
				b19.setBackgroundResource(R.drawable.ba19);
				b20.setBackgroundResource(R.drawable.ba20);
				b21.setBackgroundResource(R.drawable.ba21);
				b22.setBackgroundResource(R.drawable.ba22);
				b23.setBackgroundResource(R.drawable.ba23);
				b24.setBackgroundResource(R.drawable.ba24);
				b25.setBackgroundResource(R.drawable.ba25);
			} else if (day == 12) {
				b1.setBackgroundResource(R.drawable.ba);
				b2.setBackgroundResource(R.drawable.ba2);
				b3.setBackgroundResource(R.drawable.ba3);
				b4.setBackgroundResource(R.drawable.ba4);
				b5.setBackgroundResource(R.drawable.ba5);
				b6.setBackgroundResource(R.drawable.ba6);
				b7.setBackgroundResource(R.drawable.ba7);
				b8.setBackgroundResource(R.drawable.ba8);
				b9.setBackgroundResource(R.drawable.ba9);
				b10.setBackgroundResource(R.drawable.ba10);
				b11.setBackgroundResource(R.drawable.ba11);
				b12.setBackgroundResource(R.drawable.ba12);
				b13.setBackgroundResource(R.drawable.ba13);
				b14.setBackgroundResource(R.drawable.ba14);
				b15.setBackgroundResource(R.drawable.ba15);
				b16.setBackgroundResource(R.drawable.ba16);
				b17.setBackgroundResource(R.drawable.ba17);
				b18.setBackgroundResource(R.drawable.ba18);
				b19.setBackgroundResource(R.drawable.ba19);
				b20.setBackgroundResource(R.drawable.ba20);
				b21.setBackgroundResource(R.drawable.ba21);
				b22.setBackgroundResource(R.drawable.ba22);
				b23.setBackgroundResource(R.drawable.ba23);
				b24.setBackgroundResource(R.drawable.ba24);
				b25.setBackgroundResource(R.drawable.ba25);
				b26.setBackgroundResource(R.drawable.ba26);
			} else if (day == 13) {
				b1.setBackgroundResource(R.drawable.ba);
				b2.setBackgroundResource(R.drawable.ba2);
				b3.setBackgroundResource(R.drawable.ba3);
				b4.setBackgroundResource(R.drawable.ba4);
				b5.setBackgroundResource(R.drawable.ba5);
				b6.setBackgroundResource(R.drawable.ba6);
				b7.setBackgroundResource(R.drawable.ba7);
				b8.setBackgroundResource(R.drawable.ba8);
				b9.setBackgroundResource(R.drawable.ba9);
				b10.setBackgroundResource(R.drawable.ba10);
				b11.setBackgroundResource(R.drawable.ba11);
				b12.setBackgroundResource(R.drawable.ba12);
				b13.setBackgroundResource(R.drawable.ba13);
				b14.setBackgroundResource(R.drawable.ba14);
				b15.setBackgroundResource(R.drawable.ba15);
				b16.setBackgroundResource(R.drawable.ba16);
				b17.setBackgroundResource(R.drawable.ba17);
				b18.setBackgroundResource(R.drawable.ba18);
				b19.setBackgroundResource(R.drawable.ba19);
				b20.setBackgroundResource(R.drawable.ba20);
				b21.setBackgroundResource(R.drawable.ba21);
				b22.setBackgroundResource(R.drawable.ba22);
				b23.setBackgroundResource(R.drawable.ba23);
				b24.setBackgroundResource(R.drawable.ba24);
				b25.setBackgroundResource(R.drawable.ba25);
				b26.setBackgroundResource(R.drawable.ba26);
				b27.setBackgroundResource(R.drawable.ba27);
			} else if (day == 14) {
				b1.setBackgroundResource(R.drawable.ba);
				b2.setBackgroundResource(R.drawable.ba2);
				b3.setBackgroundResource(R.drawable.ba3);
				b4.setBackgroundResource(R.drawable.ba4);
				b5.setBackgroundResource(R.drawable.ba5);
				b6.setBackgroundResource(R.drawable.ba6);
				b7.setBackgroundResource(R.drawable.ba7);
				b8.setBackgroundResource(R.drawable.ba8);
				b9.setBackgroundResource(R.drawable.ba9);
				b10.setBackgroundResource(R.drawable.ba10);
				b11.setBackgroundResource(R.drawable.ba11);
				b12.setBackgroundResource(R.drawable.ba12);
				b13.setBackgroundResource(R.drawable.ba13);
				b14.setBackgroundResource(R.drawable.ba14);
				b15.setBackgroundResource(R.drawable.ba15);
				b16.setBackgroundResource(R.drawable.ba16);
				b17.setBackgroundResource(R.drawable.ba17);
				b18.setBackgroundResource(R.drawable.ba18);
				b19.setBackgroundResource(R.drawable.ba19);
				b20.setBackgroundResource(R.drawable.ba20);
				b21.setBackgroundResource(R.drawable.ba21);
				b22.setBackgroundResource(R.drawable.ba22);
				b23.setBackgroundResource(R.drawable.ba23);
				b24.setBackgroundResource(R.drawable.ba24);
				b25.setBackgroundResource(R.drawable.ba25);
				b26.setBackgroundResource(R.drawable.ba26);
				b27.setBackgroundResource(R.drawable.ba27);
				b28.setBackgroundResource(R.drawable.ba28);
			} else if (day == 15) {
				b1.setBackgroundResource(R.drawable.ba);
				b2.setBackgroundResource(R.drawable.ba2);
				b3.setBackgroundResource(R.drawable.ba3);
				b4.setBackgroundResource(R.drawable.ba4);
				b5.setBackgroundResource(R.drawable.ba5);
				b6.setBackgroundResource(R.drawable.ba6);
				b7.setBackgroundResource(R.drawable.ba7);
				b8.setBackgroundResource(R.drawable.ba8);
				b9.setBackgroundResource(R.drawable.ba9);
				b10.setBackgroundResource(R.drawable.ba10);
				b11.setBackgroundResource(R.drawable.ba11);
				b12.setBackgroundResource(R.drawable.ba12);
				b13.setBackgroundResource(R.drawable.ba13);
				b14.setBackgroundResource(R.drawable.ba14);
				b15.setBackgroundResource(R.drawable.ba15);
				b16.setBackgroundResource(R.drawable.ba16);
				b17.setBackgroundResource(R.drawable.ba17);
				b18.setBackgroundResource(R.drawable.ba18);
				b19.setBackgroundResource(R.drawable.ba19);
				b20.setBackgroundResource(R.drawable.ba20);
				b21.setBackgroundResource(R.drawable.ba21);
				b22.setBackgroundResource(R.drawable.ba22);
				b23.setBackgroundResource(R.drawable.ba23);
				b24.setBackgroundResource(R.drawable.ba24);
				b25.setBackgroundResource(R.drawable.ba25);
				b26.setBackgroundResource(R.drawable.ba26);
				b27.setBackgroundResource(R.drawable.ba27);
				b28.setBackgroundResource(R.drawable.ba28);
				b29.setBackgroundResource(R.drawable.ba29);
			} else if (day == 16) {
				b1.setBackgroundResource(R.drawable.ba);
				b2.setBackgroundResource(R.drawable.ba2);
				b3.setBackgroundResource(R.drawable.ba3);
				b4.setBackgroundResource(R.drawable.ba4);
				b5.setBackgroundResource(R.drawable.ba5);
				b6.setBackgroundResource(R.drawable.ba6);
				b7.setBackgroundResource(R.drawable.ba7);
				b8.setBackgroundResource(R.drawable.ba8);
				b9.setBackgroundResource(R.drawable.ba9);
				b10.setBackgroundResource(R.drawable.ba10);
				b11.setBackgroundResource(R.drawable.ba11);
				b12.setBackgroundResource(R.drawable.ba12);
				b13.setBackgroundResource(R.drawable.ba13);
				b14.setBackgroundResource(R.drawable.ba14);
				b15.setBackgroundResource(R.drawable.ba15);
				b16.setBackgroundResource(R.drawable.ba16);
				b17.setBackgroundResource(R.drawable.ba17);
				b18.setBackgroundResource(R.drawable.ba18);
				b19.setBackgroundResource(R.drawable.ba19);
				b20.setBackgroundResource(R.drawable.ba20);
				b21.setBackgroundResource(R.drawable.ba21);
				b22.setBackgroundResource(R.drawable.ba22);
				b23.setBackgroundResource(R.drawable.ba23);
				b24.setBackgroundResource(R.drawable.ba24);
				b25.setBackgroundResource(R.drawable.ba25);
				b26.setBackgroundResource(R.drawable.ba26);
				b27.setBackgroundResource(R.drawable.ba27);
				b28.setBackgroundResource(R.drawable.ba28);
				b29.setBackgroundResource(R.drawable.ba29);
				b30.setBackgroundResource(R.drawable.ba30);
			}
		}
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		SharedPreferences getPrefs = PreferenceManager
				.getDefaultSharedPreferences(getBaseContext());
		String coin = getPrefs.getString("list", "1");
		if (coin.equals("1")) {
			Intent i = new Intent("com.example.ramadan.linear");
			finish();
			startActivity(i);
		}
	}

	public void Init() {

		b1 = (Button) findViewById(R.id.button1);

		b2 = (Button) findViewById(R.id.button2);
		// b1.setText("Sun\n29");
		b3 = (Button) findViewById(R.id.button3);
		// b2.setText("Mon\n30");
		b4 = (Button) findViewById(R.id.button4);
		// b3.setText("Tues\n01");
		b5 = (Button) findViewById(R.id.button5);
		// b4.setText("Wed\n02");
		b6 = (Button) findViewById(R.id.button6);
		// b5.setText("Thurs\n03");
		b7 = (Button) findViewById(R.id.button7);
		// b6.setText("Fri\n04");
		b8 = (Button) findViewById(R.id.button8);
		// b7.setText("Sat\n05");
		b9 = (Button) findViewById(R.id.button9);
		// b8.setText("Sun\n06");
		b10 = (Button) findViewById(R.id.button10);
		// b9.setText("Mon\n07");
		b11 = (Button) findViewById(R.id.button11);
		// b10.setText("tues\n08");
		b12 = (Button) findViewById(R.id.button12);
		// b11.setText("Wed\n09");
		b13 = (Button) findViewById(R.id.button13);
		// b12.setText("Thurs\n10");
		b14 = (Button) findViewById(R.id.button14);
		// b13.setText("Fri\n11");
		b15 = (Button) findViewById(R.id.button15);
		// b14.setText("Sat\n12");
		b16 = (Button) findViewById(R.id.button16);
		// b15.setText("Sun\n13");
		b17 = (Button) findViewById(R.id.button17);
		// b16.setText("Mon\n14");
		b18 = (Button) findViewById(R.id.button18);
		// b17.setText("Tues\n15");
		b19 = (Button) findViewById(R.id.button19);
		// b18.setText("Wed\n16");
		b20 = (Button) findViewById(R.id.button20);
		// b19.setText("Thurs\n17");
		b21 = (Button) findViewById(R.id.button21);
		// b20.setText("Fri\n18");
		b22 = (Button) findViewById(R.id.button22);
		b22.setOnClickListener(this);
		// b21.setText("Sat\n19");
		b23 = (Button) findViewById(R.id.button23);
		// b22.setText("Sun\n20");
		b24 = (Button) findViewById(R.id.button24);
		// b23.setText("Mon\n21");
		b25 = (Button) findViewById(R.id.button25);
		// b24.setText("Tues\n22");
		b26 = (Button) findViewById(R.id.button26);
		// b25.setText("Wed\n23");
		b27 = (Button) findViewById(R.id.button27);
		// b26.setText("Thurs\n24");
		b28 = (Button) findViewById(R.id.button28);
		// b27.setText("Fri\n25");
		b29 = (Button) findViewById(R.id.button29);
		// b28.setText("Sat\n26");
		b30 = (Button) findViewById(R.id.button30);

		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
		b3.setOnClickListener(this);
		b4.setOnClickListener(this);
		b5.setOnClickListener(this);
		b6.setOnClickListener(this);
		b7.setOnClickListener(this);
		b8.setOnClickListener(this);
		b9.setOnClickListener(this);
		b10.setOnClickListener(this);
		b11.setOnClickListener(this);
		b12.setOnClickListener(this);
		b13.setOnClickListener(this);
		b14.setOnClickListener(this);
		b15.setOnClickListener(this);
		b16.setOnClickListener(this);
		b17.setOnClickListener(this);
		b18.setOnClickListener(this);
		b19.setOnClickListener(this);
		b20.setOnClickListener(this);
		b21.setOnClickListener(this);
		b22.setOnClickListener(this);
		b23.setOnClickListener(this);
		b24.setOnClickListener(this);
		b25.setOnClickListener(this);
		b26.setOnClickListener(this);
		b27.setOnClickListener(this);
		b28.setOnClickListener(this);
		b29.setOnClickListener(this);
		b30.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
/*
	@Override
	public boolean onNavigationItemSelected(int position, long id) {
		// When the given dropdown item is selected, show its contents in the
		// container view.
		Fragment fragment = new DummySectionFragment();
		Bundle args = new Bundle();
		args.putInt(DummySectionFragment.ARG_SECTION_NUMBER, position + 1);
		fragment.setArguments(args);
		getSupportFragmentManager().beginTransaction()
				.replace(R.id.container, fragment).commit();
		return true;
	}*/

	/**
	 * A dummy fragment representing a section of the app, but that simply
	 * displays dummy text.
	 */
	public static class DummySectionFragment extends Fragment {
		/**
		 * The fragment argument representing the section number for this
		 * fragment.
		 */
		public static final String ARG_SECTION_NUMBER = "section_number";

		public DummySectionFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main_dummy,
					container, false);
			// TextView dummyTextView = (TextView) rootView
			// .findViewById(R.id.section_label);
			// dummyTextView.setText(Integer.toString(getArguments().getInt(
			// ARG_SECTION_NUMBER)));
			int x = getArguments().getInt(ARG_SECTION_NUMBER);
			
				if (x == 1) {
					if (count > 0) {
					// Intent dd = new Intent("com.example.ramadan.front");
					// startActivity(dd);
						//getActivity().finish();
					}
				} else if (x == 2) {
					Intent j = new Intent("com.example.ramadan.MainActivity2");
					startActivity(j);
				} else if (x == 3) {
					Intent j = new Intent("com.example.ramadan.");
					startActivity(j);
				} else if (x == 4) {
					SharedPreferences getPrefs = PreferenceManager
							.getDefaultSharedPreferences(getActivity()
									.getBaseContext());
					String coin = getPrefs.getString("list", "2");
					if (coin.equals("1")) {
						Intent s = new Intent("com.example.ramadan.linear");
						startActivity(s);
					} else if (coin.equals("2")) {
						Toast.makeText(getActivity(), "Activity already opened", Toast.LENGTH_SHORT).show();
						//Intent dd = new Intent("com.example.ramadan.grid");
						//startActivity(dd);
					}
				}
			
			count++;
			return rootView;
		}
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		// Intent dd = new Intent("com.example.ramadan.front");
		// startActivity(dd);
		 finish();
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
/*
		switch (item.getItemId()) {

		case R.id.settings:
			Intent j = new Intent("com.example.ramadan.PREFERENCESCREEN");
			startActivity(j);
			return true;

		case R.id.share:

			return true;

		default:
			return super.onOptionsItemSelected(item);
		}*/
		return false;
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch (arg0.getId()) {
		case R.id.button1:
			Show(1);
			break;
		case R.id.button2:
			Show(2);
			break;
		case R.id.button3:
			Show(3);
			break;
		case R.id.button4:
			Show(4);
			break;
		case R.id.button5:
			Show(5);
			break;
		case R.id.button6:
			Show(6);
			break;
		case R.id.button7:
			Show(7);
			break;
		case R.id.button8:
			Show(8);
			break;
		case R.id.button9:
			Show(9);
			break;
		case R.id.button10:
			Show(10);
			break;
		case R.id.button11:
			Show(11);
			break;
		case R.id.button12:
			Show(12);
			break;
		case R.id.button13:
			Show(13);
			break;
		case R.id.button14:
			Show(14);
			break;
		case R.id.button15:
			Show(15);
			break;
		case R.id.button16:
			Show(16);
			break;
		case R.id.button17:
			Show(17);
			break;
		case R.id.button18:
			Show(18);
			break;
		case R.id.button19:
			Show(19);
			break;
		case R.id.button20:
			Show(20);
			break;
		case R.id.button21:
			Show(21);
			break;
		case R.id.button22:
			Show(22);
			break;
		case R.id.button23:
			Show(23);
			break;
		case R.id.button24:
			Show(24);
			break;
		case R.id.button25:
			Show(25);
			break;
		case R.id.button26:
			Show(26);
			break;
		case R.id.button27:
			Show(27);
			break;
		case R.id.button28:
			Show(28);
			break;
		case R.id.button29:
			Show(29);
			break;
		case R.id.button30:
			Show(30);
			break;
		}
	}

	public void Show(int i) {
		Bundle t = new Bundle();
		t.putInt("key", i);
		Intent j = new Intent("com.example.ramadan.Show");
		j.putExtras(t);
		startActivity(j);
	}
}
