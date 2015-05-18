package com.example.ramadan;

import java.util.Calendar;
import java.util.GregorianCalendar;

import android.annotation.TargetApi;
//import android.app.ActionBar;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Handler;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.NavUtils;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v4.widget.DrawerLayout;
//import android.view.DragEvent;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
//import android.view.View.OnDragListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SlidingDrawer;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

public class front extends Activity implements
		//ActionBar.OnNavigationListener, 
			OnClickListener, //OnDragListener,
			OnPageChangeListener {
	
	// TextView t, s;
	Button bhan;
	Intent iii;
	PendingIntent pi1, pi2, pi3, pi4, pi5, pi6, pi7, pi8, pi9, pi10, pi11,
			pi12, pi13, pi14, pi15, pi16, pi17, pi18, pi19, pi20, pi21, pi22,
			pi23, pi24, pi25, pi26, pi27, pi28, pi29, pi30;
	AlarmManager am1, am2, am3, am4, am5, am6, am7, am8, am9, am10, am11, am12,
			am13, am14, am15, am16, am17, am18, am19, am20, am21, am22, am23,
			am24, am25, am26, am27, am28, am29, am30;

	// Nizar 01.10 New
	TextView t, today;
	// Fajer
	PendingIntent pii1, pii2, pii3, pii4, pii5, pii6, pii7, pii8, pii9, pii10,
			pii11, pii12, pii13, pii14, pii15, pii16, pii17, pii18, pii19,
			pii20, pii21, pii22, pii23, pii24, pii25, pii26, pii27, pii28,
			pii29, pii30;
	AlarmManager amm1, amm2, amm3, amm4, amm5, amm6, amm7, amm8, amm9, amm10,
			amm11, amm12, amm13, amm14, amm15, amm16, amm17, amm18, amm19,
			amm20, amm21, amm22, amm23, amm24, amm25, amm26, amm27, amm28,
			amm29, amm30;
	// 3aser
	PendingIntent piii1, piii2, piii3, piii4, piii5, piii6, piii7, piii8,
			piii9, piii10, piii11, piii12, piii13, piii14, piii15, piii16,
			piii17, piii18, piii19, piii20, piii21, piii22, piii23, piii24,
			piii25, piii26, piii27, piii28, piii29, piii30;
	AlarmManager ammm1, ammm2, ammm3, ammm4, ammm5, ammm6, ammm7, ammm8, ammm9,
			ammm10, ammm11, ammm12, ammm13, ammm14, ammm15, ammm16, ammm17,
			ammm18, ammm19, ammm20, ammm21, ammm22, ammm23, ammm24, ammm25,
			ammm26, ammm27, ammm28, ammm29, ammm30;

	// Maghreb
	PendingIntent piv1, piv2, piv3, piv4, piv5, piv6, piv7, piv8, piv9, piv10,
			piv11, piv12, piv13, piv14, piv15, piv16, piv17, piv18, piv19,
			piv20, piv21, piv22, piv23, piv24, piv25, piv26, piv27, piv28,
			piv29, piv30;
	AlarmManager amv1, amv2, amv3, amv4, amv5, amv6, amv7, amv8, amv9, amv10,
			amv11, amv12, amv13, amv14, amv15, amv16, amv17, amv18, amv19,
			amv20, amv21, amv22, amv23, amv24, amv25, amv26, amv27, amv28,
			amv29, amv30;

	// Thohor
	PendingIntent pv1, pv2, pv3, pv4, pv5, pv6, pv7, pv8, pv9, pv10, pv11,
			pv12, pv13, pv14, pv15, pv16, pv17, pv18, pv19, pv20, pv21, pv22,
			pv23, pv24, pv25, pv26, pv27, pv28, pv29, pv30;
	AlarmManager av1, av2, av3, av4, av5, av6, av7, av8, av9, av10, av11, av12,
			av13, av14, av15, av16, av17, av18, av19, av20, av21, av22, av23,
			av24, av25, av26, av27, av28, av29, av30;
	// Nizar01.00
	Button drawer, moree, settings, bRRules, bRTreasures, bCalendar, bShare,
			bBack, bNext;
	TextView emsak, fajer, shorook, Thohor, aser, maghreb, ishaa;
	// ViewFlipper vf;

	public static int counter = 0;
	/**
	 * The serialization (saved instance state) Bundle key representing the
	 * current dropdown position.
	 */

	/*
	 * CustomPagerAdapter mCustomPagerAdapter; ViewPager mViewPager; public
	 * static Runnable runnable; public static Handler handler; private static
	 * final String STATE_SELECTED_NAVIGATION_ITEM = "selected_navigation_item";
	 */
	public static int cp = 0, cp2 = 0;
	int[] mResources = { R.drawable.fajer, R.drawable.shorook,
			R.drawable.thohor, R.drawable.aser, R.drawable.maghreb,
			R.drawable.ishaa };
	public static int position = 0;
	public static String[] Mawakit;

	public static boolean music = false;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		 getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
		 WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.front);

		Calendar calendar = Calendar.getInstance();
		/*
		 * mCustomPagerAdapter = new CustomPagerAdapter(this);
		 * 
		 * mViewPager = (ViewPager) findViewById(R.id.pager);
		 * mViewPager.setAdapter(mCustomPagerAdapter);
		 * mViewPager.setOnDragListener(this);
		 * mViewPager.setOnPageChangeListener(this);
		 */
		//t = (TextView) findViewById(R.id.textView1);
		//t.setTextColor(Color.WHITE);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int month = calendar.get(Calendar.MONTH);
		Mawakit = initBack(month,day);

		emsak = (TextView) findViewById(R.id.mtext1);
		fajer = (TextView) findViewById(R.id.mtext3);
		shorook = (TextView) findViewById(R.id.mtext13);
		Thohor = (TextView) findViewById(R.id.mtext5);
		aser = (TextView) findViewById(R.id.mtext7);
		maghreb = (TextView) findViewById(R.id.mtext9);
		ishaa = (TextView) findViewById(R.id.mtext11);

		today = (TextView) findViewById(R.id.mtemp5);
		try{
		int dOf = calendar.DAY_OF_WEEK;
		int dOr = Integer.parseInt(initRam(month,day));
		today.setText(dayO(dOf,month,day,dOr));
		}catch(Exception e){
			e.printStackTrace();
		}
		bBack = (Button) findViewById(R.id.mtemp3);
		bNext = (Button) findViewById(R.id.mtemp4);
		bBack.setOnClickListener(this);
		bNext.setOnClickListener(this);
		
		bBack.setText("<");
		bNext.setText(">");
		if (Mawakit.length > 0) {
			emsak.setText(Mawakit[0]);
			fajer.setText(Mawakit[1]);
			shorook.setText(Mawakit[2]);
			Thohor.setText(Mawakit[3]);
			aser.setText(Mawakit[4]);
			maghreb.setText(Mawakit[5]);
			ishaa.setText(Mawakit[6]);
		}
		// t.setText("الفجر             " + Mawakit[0]);
		music = false;
		try {
			SharedPreferences getPrefs2 = PreferenceManager
					.getDefaultSharedPreferences(getBaseContext());
			music = getPrefs2.getBoolean("checko", false);
		} catch (Exception e) {
			e.printStackTrace();
			music = false;
		}
		// if (music == true) {
		/*
		 * handler = new Handler(); runnable = new Runnable() { public void
		 * run() { handler.postDelayed(runnable, 5000); if (music == true) {
		 * position = mViewPager.getCurrentItem(); mViewPager.setCurrentItem(
		 * mViewPager.getCurrentItem() + 1, true); if (position == 5) {
		 * mViewPager.setCurrentItem( mViewPager.getCurrentItem() - 5, true); }
		 * } } }; handler.postDelayed(runnable, 5000);
		 */
		/*
		 * settings = (Button) findViewById(R.id.buttonSettings); moree =
		 * (Button) findViewById(R.id.moree); drawer.setOnClickListener(this);
		 * moree.setOnClickListener(this); settings.setOnClickListener(this);
		 * 
		 * bRRules = (Button) findViewById(R.id.BRules); bShare = (Button)
		 * findViewById(R.id.BShare); bRTreasures = (Button)
		 * findViewById(R.id.BTreasures); bCalendar = (Button)
		 * findViewById(R.id.BCalendar);
		 * 
		 * bRRules.setOnClickListener(this); bShare.setOnClickListener(this);
		 * bRTreasures.setOnClickListener(this);
		 * bCalendar.setOnClickListener(this);
		 */

		/*
		 * s = (TextView) findViewById(R.id.serl); bhan = (Button)
		 * findViewById(R.id.handl); bhan.setOnClickListener(this);
		 */
		// s.setText("");
		// initBack();

		// check preferences to setup Alarms
		SharedPreferences getPrefs = PreferenceManager
				.getDefaultSharedPreferences(getBaseContext());
		boolean AdhanNotifi = getPrefs.getBoolean("check", true);
		if (AdhanNotifi == true) {
			setupAlarms();
			setupAlarms2();
			setupAlarms3();
			setupAlarms4();
			setupAlarms5();
		}

		// Set up the action bar to show a dropdown list.
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

	/**
	 * Backward-compatible version of {@link ActionBar#getThemedContext()} that
	 * simply returns the {@link android.app.Activity} if
	 * <code>getThemedContext</code> is unavailable.
	 */
	/*@TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
	private Context getActionBarThemedContextCompat() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH) {
			return getActionBar().getThemedContext();
		} else {
			return this;
		}
	}*/

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		try {
			SharedPreferences getPrefs2 = PreferenceManager
					.getDefaultSharedPreferences(getBaseContext());
			music = getPrefs2.getBoolean("checko", false);
		} catch (Exception e) {
			e.printStackTrace();
			music = false;
		}
	}

	@Override
	public void onRestoreInstanceState(Bundle savedInstanceState) {
		// Restore the previously serialized current dropdown position.
		/*
		 * if (savedInstanceState.containsKey(STATE_SELECTED_NAVIGATION_ITEM)) {
		 * getActionBar().setSelectedNavigationItem(
		 * savedInstanceState.getInt(STATE_SELECTED_NAVIGATION_ITEM)); }
		 */
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		// Serialize the current dropdown position.
		/*
		 * outState.putInt(STATE_SELECTED_NAVIGATION_ITEM, getActionBar()
		 * .getSelectedNavigationIndex());
		 */
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
	}
*/
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
			if (counter > 0) {
				int x = getArguments().getInt(ARG_SECTION_NUMBER);
				if (x == 1) {
					// Toast.makeText(getActivity(), "Activity already opened",
					// Toast.LENGTH_SHORT).show();
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
						//Intent dd = new Intent("com.example.ramadan.grid");
						//startActivity(dd);

						Intent j = new Intent(getActivity(),GridCal.class);
						startActivity(j);
					}
				}
			}
			counter++;
			return rootView;
		}
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
/*
		switch (item.getItemId()) {

		case R.id.settings:
			Intent j = new Intent("com.example.ramadan.PREFERENCESCREEN");
			startActivity(j);
			// finish();
			return true;

		case R.id.share:
			Intent sendIntent = new Intent();
			sendIntent.setAction(Intent.ACTION_SEND);
			sendIntent.putExtra(Intent.EXTRA_TEXT, "Ive Downloaded the new Ramadan Imsakiyyah for 2015 why dont you do the same!");
			sendIntent.setType("text/plain");
			startActivity(sendIntent);
			return true;

		default:
			return super.onOptionsItemSelected(item);
		}
		*/
		return false;
	}

	public void setupAlarms() {
		// for Adhan Notification
		iii = new Intent(this, Notifi_Adhan.class);
		// Every alarm manager should have its own calendar and its own pending
		// intent with a unique requestCode

		pi1 = PendingIntent.getBroadcast(this.getApplicationContext(), 111,
				iii, 0);
		Calendar cAdh1 = Calendar.getInstance(); // 17 june
		cAdh1.set(Calendar.MONTH, 5);
		cAdh1.set(Calendar.DAY_OF_MONTH, 17);
		cAdh1.set(Calendar.HOUR_OF_DAY, 19);
		cAdh1.set(Calendar.MINUTE, 57);
		if (cAdh1.getTimeInMillis() > System.currentTimeMillis()) {
			am1 = (AlarmManager) getSystemService(ALARM_SERVICE);
			am1.set(AlarmManager.RTC_WAKEUP, cAdh1.getTimeInMillis(), pi1);
		}

		pi2 = PendingIntent.getBroadcast(this.getApplicationContext(), 222,
				iii, 0);
		Calendar cAdh2 = Calendar.getInstance(); // 18 june
		cAdh2.set(Calendar.MONTH, 5);
		cAdh2.set(Calendar.DAY_OF_MONTH, 18);
		cAdh2.set(Calendar.HOUR_OF_DAY, 19);
		cAdh2.set(Calendar.MINUTE, 57);
		if (cAdh2.getTimeInMillis() > System.currentTimeMillis()) {
			am2 = (AlarmManager) getSystemService(ALARM_SERVICE);
			am2.set(AlarmManager.RTC_WAKEUP, cAdh2.getTimeInMillis(), pi2);
		}

		pi3 = PendingIntent.getBroadcast(this.getApplicationContext(), 333,
				iii, 0);
		Calendar cAdh3 = Calendar.getInstance(); // 19 june
		cAdh3.set(Calendar.MONTH, 5);
		cAdh3.set(Calendar.DAY_OF_MONTH, 19);
		cAdh3.set(Calendar.HOUR_OF_DAY, 19);
		cAdh3.set(Calendar.MINUTE, 57);
		if (cAdh3.getTimeInMillis() > System.currentTimeMillis()) {
			am3 = (AlarmManager) getSystemService(ALARM_SERVICE);
			am3.set(AlarmManager.RTC_WAKEUP, cAdh3.getTimeInMillis(), pi3);
		}

		pi4 = PendingIntent.getBroadcast(this.getApplicationContext(), 444,
				iii, 0);
		Calendar cAdh4 = Calendar.getInstance(); // 20 june
		cAdh4.set(Calendar.MONTH, 5);
		cAdh4.set(Calendar.DAY_OF_MONTH, 20);
		cAdh4.set(Calendar.HOUR_OF_DAY, 19);
		cAdh4.set(Calendar.MINUTE, 58);
		if (cAdh4.getTimeInMillis() > System.currentTimeMillis()) {
			am4 = (AlarmManager) getSystemService(ALARM_SERVICE);
			am4.set(AlarmManager.RTC_WAKEUP, cAdh4.getTimeInMillis(), pi4);
		}

		pi5 = PendingIntent.getBroadcast(this.getApplicationContext(), 555,
				iii, 0);
		Calendar cAdh5 = Calendar.getInstance(); // 21 june
		cAdh5.set(Calendar.MONTH, 5);
		cAdh5.set(Calendar.DAY_OF_MONTH, 21);
		cAdh5.set(Calendar.HOUR_OF_DAY, 19);
		cAdh5.set(Calendar.MINUTE, 58);
		if (cAdh5.getTimeInMillis() > System.currentTimeMillis()) {
			am5 = (AlarmManager) getSystemService(ALARM_SERVICE);
			am5.set(AlarmManager.RTC_WAKEUP, cAdh5.getTimeInMillis(), pi5);
		}

		pi6 = PendingIntent.getBroadcast(this.getApplicationContext(), 666,
				iii, 0);
		Calendar cAdh6 = Calendar.getInstance(); // 22 june
		cAdh6.set(Calendar.MONTH, 5);
		cAdh6.set(Calendar.DAY_OF_MONTH, 22);
		cAdh6.set(Calendar.HOUR_OF_DAY, 19);
		cAdh6.set(Calendar.MINUTE, 58);
		if (cAdh6.getTimeInMillis() > System.currentTimeMillis()) {
			am6 = (AlarmManager) getSystemService(ALARM_SERVICE);
			am6.set(AlarmManager.RTC_WAKEUP, cAdh6.getTimeInMillis(), pi6);
		}

		pi7 = PendingIntent.getBroadcast(this.getApplicationContext(), 777,
				iii, 0);
		Calendar cAdh7 = Calendar.getInstance(); // 23 june
		cAdh7.set(Calendar.MONTH, 5);
		cAdh7.set(Calendar.DAY_OF_MONTH, 23);
		cAdh7.set(Calendar.HOUR_OF_DAY, 19);
		cAdh7.set(Calendar.MINUTE, 58);
		if (cAdh2.getTimeInMillis() > System.currentTimeMillis()) {
			am7 = (AlarmManager) getSystemService(ALARM_SERVICE);
			am7.set(AlarmManager.RTC_WAKEUP, cAdh7.getTimeInMillis(), pi7);
		}

		pi8 = PendingIntent.getBroadcast(this.getApplicationContext(), 888,
				iii, 0);
		Calendar cAdh8 = Calendar.getInstance(); // 24 june
		cAdh8.set(Calendar.MONTH, 5);
		cAdh8.set(Calendar.DAY_OF_MONTH, 24);
		cAdh8.set(Calendar.HOUR_OF_DAY, 19);
		cAdh8.set(Calendar.MINUTE, 58);
		if (cAdh8.getTimeInMillis() > System.currentTimeMillis()) {
			am8 = (AlarmManager) getSystemService(ALARM_SERVICE);
			am8.set(AlarmManager.RTC_WAKEUP, cAdh8.getTimeInMillis(), pi8);
		}

		pi9 = PendingIntent.getBroadcast(this.getApplicationContext(), 999,
				iii, 0);
		Calendar cAdh9 = Calendar.getInstance(); // 25 june
		cAdh9.set(Calendar.MONTH, 5);
		cAdh9.set(Calendar.DAY_OF_MONTH, 25);
		cAdh9.set(Calendar.HOUR_OF_DAY, 19);
		cAdh9.set(Calendar.MINUTE, 58);
		if (cAdh2.getTimeInMillis() > System.currentTimeMillis()) {
			am9 = (AlarmManager) getSystemService(ALARM_SERVICE);
			am9.set(AlarmManager.RTC_WAKEUP, cAdh9.getTimeInMillis(), pi9);
		}

		pi10 = PendingIntent.getBroadcast(this.getApplicationContext(), 1010,
				iii, 0);
		Calendar cAdh10 = Calendar.getInstance(); // 26 june
		cAdh10.set(Calendar.MONTH, 5);
		cAdh10.set(Calendar.DAY_OF_MONTH, 26);
		cAdh10.set(Calendar.HOUR_OF_DAY, 19);
		cAdh10.set(Calendar.MINUTE, 59);
		if (cAdh10.getTimeInMillis() > System.currentTimeMillis()) {
			am10 = (AlarmManager) getSystemService(ALARM_SERVICE);
			am10.set(AlarmManager.RTC_WAKEUP, cAdh10.getTimeInMillis(), pi10);
		}

		pi11 = PendingIntent.getBroadcast(this.getApplicationContext(), 1111,
				iii, 0);
		Calendar cAdh11 = Calendar.getInstance(); // 27 june
		cAdh11.set(Calendar.MONTH, 5);
		cAdh11.set(Calendar.DAY_OF_MONTH, 27);
		cAdh11.set(Calendar.HOUR_OF_DAY, 19);
		cAdh11.set(Calendar.MINUTE, 59);
		if (cAdh11.getTimeInMillis() > System.currentTimeMillis()) {
			am11 = (AlarmManager) getSystemService(ALARM_SERVICE);
			am11.set(AlarmManager.RTC_WAKEUP, cAdh11.getTimeInMillis(), pi11);
		}

		pi12 = PendingIntent.getBroadcast(this.getApplicationContext(), 1212,
				iii, 0);
		Calendar cAdh12 = Calendar.getInstance(); // 28 june
		cAdh12.set(Calendar.MONTH, 5);
		cAdh12.set(Calendar.DAY_OF_MONTH, 28);
		cAdh12.set(Calendar.HOUR_OF_DAY, 19);
		cAdh12.set(Calendar.MINUTE, 59);
		if (cAdh12.getTimeInMillis() > System.currentTimeMillis()) {
			am12 = (AlarmManager) getSystemService(ALARM_SERVICE);
			am12.set(AlarmManager.RTC_WAKEUP, cAdh12.getTimeInMillis(), pi12);
		}

		pi13 = PendingIntent.getBroadcast(this.getApplicationContext(), 1313,
				iii, 0);
		Calendar cAdh13 = Calendar.getInstance(); // 29 june
		cAdh13.set(Calendar.MONTH, 5);
		cAdh13.set(Calendar.DAY_OF_MONTH, 29);
		cAdh13.set(Calendar.HOUR_OF_DAY, 19);
		cAdh13.set(Calendar.MINUTE, 59);
		if (cAdh13.getTimeInMillis() > System.currentTimeMillis()) {
			am13 = (AlarmManager) getSystemService(ALARM_SERVICE);
			am13.set(AlarmManager.RTC_WAKEUP, cAdh13.getTimeInMillis(), pi13);
		}

		pi14 = PendingIntent.getBroadcast(this.getApplicationContext(), 1414,
				iii, 0);
		Calendar cAdh14 = Calendar.getInstance(); // 30 june
		cAdh14.set(Calendar.MONTH, 5);
		cAdh14.set(Calendar.DAY_OF_MONTH, 30);
		cAdh14.set(Calendar.HOUR_OF_DAY, 19);
		cAdh14.set(Calendar.MINUTE, 59);
		if (cAdh14.getTimeInMillis() > System.currentTimeMillis()) {
			am14 = (AlarmManager) getSystemService(ALARM_SERVICE);
			am14.set(AlarmManager.RTC_WAKEUP, cAdh14.getTimeInMillis(), pi14);
		}

		pi15 = PendingIntent.getBroadcast(this.getApplicationContext(), 1515,
				iii, 0);
		Calendar cAdh15 = Calendar.getInstance(); // 1 july
		cAdh15.set(Calendar.MONTH, 6);
		cAdh15.set(Calendar.DAY_OF_MONTH, 1);
		cAdh15.set(Calendar.HOUR_OF_DAY, 19);
		cAdh15.set(Calendar.MINUTE, 59);
		if (cAdh15.getTimeInMillis() > System.currentTimeMillis()) {
			am15 = (AlarmManager) getSystemService(ALARM_SERVICE);
			am15.set(AlarmManager.RTC_WAKEUP, cAdh15.getTimeInMillis(), pi15);
		}

		pi16 = PendingIntent.getBroadcast(this.getApplicationContext(), 1616,
				iii, 0);
		Calendar cAdh16 = Calendar.getInstance(); // 2 july
		cAdh16.set(Calendar.MONTH, 6);
		cAdh16.set(Calendar.DAY_OF_MONTH, 2);
		cAdh16.set(Calendar.HOUR_OF_DAY, 19);
		cAdh16.set(Calendar.MINUTE, 59);
		if (cAdh16.getTimeInMillis() > System.currentTimeMillis()) {
			am16 = (AlarmManager) getSystemService(ALARM_SERVICE);
			am16.set(AlarmManager.RTC_WAKEUP, cAdh16.getTimeInMillis(), pi16);
		}

		pi17 = PendingIntent.getBroadcast(this.getApplicationContext(), 1717,
				iii, 0);
		Calendar cAdh17 = Calendar.getInstance(); // 3 july
		cAdh17.set(Calendar.MONTH, 6);
		cAdh17.set(Calendar.DAY_OF_MONTH, 3);
		cAdh17.set(Calendar.HOUR_OF_DAY, 19);
		cAdh17.set(Calendar.MINUTE, 59);
		if (cAdh17.getTimeInMillis() > System.currentTimeMillis()) {
			am17 = (AlarmManager) getSystemService(ALARM_SERVICE);
			am17.set(AlarmManager.RTC_WAKEUP, cAdh17.getTimeInMillis(), pi17);
		}

		pi18 = PendingIntent.getBroadcast(this.getApplicationContext(), 1818,
				iii, 0);
		Calendar cAdh18 = Calendar.getInstance(); // 4 july
		cAdh18.set(Calendar.MONTH, 6);
		cAdh18.set(Calendar.DAY_OF_MONTH, 4);
		cAdh18.set(Calendar.HOUR_OF_DAY, 19);
		cAdh18.set(Calendar.MINUTE, 59);
		if (cAdh18.getTimeInMillis() > System.currentTimeMillis()) {
			am18 = (AlarmManager) getSystemService(ALARM_SERVICE);
			am18.set(AlarmManager.RTC_WAKEUP, cAdh18.getTimeInMillis(), pi18);
		}

		pi19 = PendingIntent.getBroadcast(this.getApplicationContext(), 1919,
				iii, 0);
		Calendar cAdh19 = Calendar.getInstance(); // 5 july
		cAdh19.set(Calendar.MONTH, 6);
		cAdh19.set(Calendar.DAY_OF_MONTH, 5);
		cAdh19.set(Calendar.HOUR_OF_DAY, 19);
		cAdh19.set(Calendar.MINUTE, 59);
		if (cAdh19.getTimeInMillis() > System.currentTimeMillis()) {
			am19 = (AlarmManager) getSystemService(ALARM_SERVICE);
			am19.set(AlarmManager.RTC_WAKEUP, cAdh19.getTimeInMillis(), pi19);
		}

		pi20 = PendingIntent.getBroadcast(this.getApplicationContext(), 2020,
				iii, 0);
		Calendar cAdh20 = Calendar.getInstance(); // 6 july
		cAdh20.set(Calendar.MONTH, 6);
		cAdh20.set(Calendar.DAY_OF_MONTH, 6);
		cAdh20.set(Calendar.HOUR_OF_DAY, 19);
		cAdh20.set(Calendar.MINUTE, 59);
		if (cAdh20.getTimeInMillis() > System.currentTimeMillis()) {
			am20 = (AlarmManager) getSystemService(ALARM_SERVICE);
			am20.set(AlarmManager.RTC_WAKEUP, cAdh20.getTimeInMillis(), pi20);
		}

		pi21 = PendingIntent.getBroadcast(this.getApplicationContext(), 2121,
				iii, 0);
		Calendar cAdh21 = Calendar.getInstance(); // 7 july
		cAdh21.set(Calendar.MONTH, 6);
		cAdh21.set(Calendar.DAY_OF_MONTH, 7);
		cAdh21.set(Calendar.HOUR_OF_DAY, 19);
		cAdh21.set(Calendar.MINUTE, 59);
		if (cAdh21.getTimeInMillis() > System.currentTimeMillis()) {
			am21 = (AlarmManager) getSystemService(ALARM_SERVICE);
			am21.set(AlarmManager.RTC_WAKEUP, cAdh21.getTimeInMillis(), pi21);
		}

		pi22 = PendingIntent.getBroadcast(this.getApplicationContext(), 2222,
				iii, 0);
		Calendar cAdh22 = Calendar.getInstance(); // 8 july
		cAdh22.set(Calendar.MONTH, 6);
		cAdh22.set(Calendar.DAY_OF_MONTH, 8);
		cAdh22.set(Calendar.HOUR_OF_DAY, 19);
		cAdh22.set(Calendar.MINUTE, 59);
		if (cAdh22.getTimeInMillis() > System.currentTimeMillis()) {
			am22 = (AlarmManager) getSystemService(ALARM_SERVICE);
			am22.set(AlarmManager.RTC_WAKEUP, cAdh22.getTimeInMillis(), pi22);
		}

		pi23 = PendingIntent.getBroadcast(this.getApplicationContext(), 2323,
				iii, 0);
		Calendar cAdh23 = Calendar.getInstance(); // 9 july
		cAdh23.set(Calendar.MONTH, 6);
		cAdh23.set(Calendar.DAY_OF_MONTH, 9);
		cAdh23.set(Calendar.HOUR_OF_DAY, 19);
		cAdh23.set(Calendar.MINUTE, 59);
		if (cAdh23.getTimeInMillis() > System.currentTimeMillis()) {
			am23 = (AlarmManager) getSystemService(ALARM_SERVICE);
			am23.set(AlarmManager.RTC_WAKEUP, cAdh23.getTimeInMillis(), pi23);
		}

		pi24 = PendingIntent.getBroadcast(this.getApplicationContext(), 2424,
				iii, 0);
		Calendar cAdh24 = Calendar.getInstance(); // 10 july
		cAdh24.set(Calendar.MONTH, 6);
		cAdh24.set(Calendar.DAY_OF_MONTH, 10);
		cAdh24.set(Calendar.HOUR_OF_DAY, 19);
		cAdh24.set(Calendar.MINUTE, 59);
		if (cAdh24.getTimeInMillis() > System.currentTimeMillis()) {
			am24 = (AlarmManager) getSystemService(ALARM_SERVICE);
			am24.set(AlarmManager.RTC_WAKEUP, cAdh24.getTimeInMillis(), pi24);
		}

		pi25 = PendingIntent.getBroadcast(this.getApplicationContext(), 2525,
				iii, 0);
		Calendar cAdh25 = Calendar.getInstance(); // 11 july
		cAdh25.set(Calendar.MONTH, 6);
		cAdh25.set(Calendar.DAY_OF_MONTH, 11);
		cAdh25.set(Calendar.HOUR_OF_DAY, 19);
		cAdh25.set(Calendar.MINUTE, 58);
		if (cAdh25.getTimeInMillis() > System.currentTimeMillis()) {
			am25 = (AlarmManager) getSystemService(ALARM_SERVICE);
			am25.set(AlarmManager.RTC_WAKEUP, cAdh25.getTimeInMillis(), pi25);
		}

		pi26 = PendingIntent.getBroadcast(this.getApplicationContext(), 2626,
				iii, 0);
		Calendar cAdh26 = Calendar.getInstance(); // 12 july
		cAdh26.set(Calendar.MONTH, 6);
		cAdh26.set(Calendar.DAY_OF_MONTH, 12);
		cAdh26.set(Calendar.HOUR_OF_DAY, 19);
		cAdh26.set(Calendar.MINUTE, 58);
		if (cAdh26.getTimeInMillis() > System.currentTimeMillis()) {
			am26 = (AlarmManager) getSystemService(ALARM_SERVICE);
			am26.set(AlarmManager.RTC_WAKEUP, cAdh26.getTimeInMillis(), pi26);
		}

		pi27 = PendingIntent.getBroadcast(this.getApplicationContext(), 2727,
				iii, 0);
		Calendar cAdh27 = Calendar.getInstance(); // 13 july
		cAdh27.set(Calendar.MONTH, 6);
		cAdh27.set(Calendar.DAY_OF_MONTH, 13);
		cAdh27.set(Calendar.HOUR_OF_DAY, 19);
		cAdh27.set(Calendar.MINUTE, 57);
		if (cAdh27.getTimeInMillis() > System.currentTimeMillis()) {
			am27 = (AlarmManager) getSystemService(ALARM_SERVICE);
			am27.set(AlarmManager.RTC_WAKEUP, cAdh27.getTimeInMillis(), pi27);
		}

		pi28 = PendingIntent.getBroadcast(this.getApplicationContext(), 2828,
				iii, 0);
		Calendar cAdh28 = Calendar.getInstance(); // 14 july
		cAdh28.set(Calendar.MONTH, 6);
		cAdh28.set(Calendar.DAY_OF_MONTH, 14);
		cAdh28.set(Calendar.HOUR_OF_DAY, 19);
		cAdh28.set(Calendar.MINUTE, 57);
		if (cAdh28.getTimeInMillis() > System.currentTimeMillis()) {
			am28 = (AlarmManager) getSystemService(ALARM_SERVICE);
			am28.set(AlarmManager.RTC_WAKEUP, cAdh28.getTimeInMillis(), pi28);
		}

		pi29 = PendingIntent.getBroadcast(this.getApplicationContext(), 2929,
				iii, 0);
		Calendar cAdh29 = Calendar.getInstance(); // 15 july
		cAdh29.set(Calendar.MONTH, 6);
		cAdh29.set(Calendar.DAY_OF_MONTH, 15);
		cAdh29.set(Calendar.HOUR_OF_DAY, 19);
		cAdh29.set(Calendar.MINUTE, 57);
		if (cAdh29.getTimeInMillis() > System.currentTimeMillis()) {
			am29 = (AlarmManager) getSystemService(ALARM_SERVICE);
			am29.set(AlarmManager.RTC_WAKEUP, cAdh29.getTimeInMillis(), pi29);
		}

		pi30 = PendingIntent.getBroadcast(this.getApplicationContext(), 3030,
				iii, 0);
		Calendar cAdh30 = Calendar.getInstance(); // 16 july
		cAdh30.set(Calendar.MONTH, 6);
		cAdh30.set(Calendar.DAY_OF_MONTH, 16);
		cAdh30.set(Calendar.HOUR_OF_DAY, 19);
		cAdh30.set(Calendar.MINUTE, 56);
		if (cAdh30.getTimeInMillis() > System.currentTimeMillis()) {
			am30 = (AlarmManager) getSystemService(ALARM_SERVICE);
			am30.set(AlarmManager.RTC_WAKEUP, cAdh30.getTimeInMillis(), pi30);
		}
	}

	public void setupAlarms2() {
		// for Adhan Notification
		iii = new Intent(this, Notifi_Adhan2.class);
		// Every alarm manager should have its own calendar and its own pending
		// intent with a unique requestCode

		pii1 = PendingIntent.getBroadcast(this.getApplicationContext(), 111,
				iii, 0);
		Calendar cAdh1 = Calendar.getInstance(); // 17 june
		cAdh1.set(Calendar.MONTH, 5);
		cAdh1.set(Calendar.DAY_OF_MONTH, 17);
		cAdh1.set(Calendar.HOUR_OF_DAY, 3);
		cAdh1.set(Calendar.MINUTE, 33);
		if (cAdh1.getTimeInMillis() > System.currentTimeMillis()) {
			amm1 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amm1.set(AlarmManager.RTC_WAKEUP, cAdh1.getTimeInMillis(), pii1);
		}

		pii2 = PendingIntent.getBroadcast(this.getApplicationContext(), 222,
				iii, 0);
		Calendar cAdh2 = Calendar.getInstance(); // 18 june
		cAdh2.set(Calendar.MONTH, 5);
		cAdh2.set(Calendar.DAY_OF_MONTH, 18);
		cAdh2.set(Calendar.HOUR_OF_DAY, 3);
		cAdh2.set(Calendar.MINUTE, 32);
		if (cAdh2.getTimeInMillis() > System.currentTimeMillis()) {
			amm2 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amm2.set(AlarmManager.RTC_WAKEUP, cAdh2.getTimeInMillis(), pii2);
		}

		pii3 = PendingIntent.getBroadcast(this.getApplicationContext(), 333,
				iii, 0);
		Calendar cAdh3 = Calendar.getInstance(); // 19 june
		cAdh3.set(Calendar.MONTH, 5);
		cAdh3.set(Calendar.DAY_OF_MONTH, 19);
		cAdh3.set(Calendar.HOUR_OF_DAY, 3);
		cAdh3.set(Calendar.MINUTE, 32);
		if (cAdh3.getTimeInMillis() > System.currentTimeMillis()) {
			amm3 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amm3.set(AlarmManager.RTC_WAKEUP, cAdh3.getTimeInMillis(), pii3);
		}

		pii4 = PendingIntent.getBroadcast(this.getApplicationContext(), 444,
				iii, 0);
		Calendar cAdh4 = Calendar.getInstance(); // 20 june
		cAdh4.set(Calendar.MONTH, 5);
		cAdh4.set(Calendar.DAY_OF_MONTH, 20);
		cAdh4.set(Calendar.HOUR_OF_DAY, 3);
		cAdh4.set(Calendar.MINUTE, 32);
		if (cAdh4.getTimeInMillis() > System.currentTimeMillis()) {
			amm4 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amm4.set(AlarmManager.RTC_WAKEUP, cAdh4.getTimeInMillis(), pii4);
		}

		pii5 = PendingIntent.getBroadcast(this.getApplicationContext(), 555,
				iii, 0);
		Calendar cAdh5 = Calendar.getInstance(); // 21 june
		cAdh5.set(Calendar.MONTH, 5);
		cAdh5.set(Calendar.DAY_OF_MONTH, 21);
		cAdh5.set(Calendar.HOUR_OF_DAY, 3);
		cAdh5.set(Calendar.MINUTE, 32);
		if (cAdh5.getTimeInMillis() > System.currentTimeMillis()) {
			amm5 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amm5.set(AlarmManager.RTC_WAKEUP, cAdh5.getTimeInMillis(), pii5);
		}

		pii6 = PendingIntent.getBroadcast(this.getApplicationContext(), 666,
				iii, 0);
		Calendar cAdh6 = Calendar.getInstance(); // 22 june
		cAdh6.set(Calendar.MONTH, 5);
		cAdh6.set(Calendar.DAY_OF_MONTH, 22);
		cAdh6.set(Calendar.HOUR_OF_DAY, 3);
		cAdh6.set(Calendar.MINUTE, 32);
		if (cAdh6.getTimeInMillis() > System.currentTimeMillis()) {
			amm6 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amm6.set(AlarmManager.RTC_WAKEUP, cAdh6.getTimeInMillis(), pii6);
		}

		pii7 = PendingIntent.getBroadcast(this.getApplicationContext(), 777,
				iii, 0);
		Calendar cAdh7 = Calendar.getInstance(); // 23 june
		cAdh7.set(Calendar.MONTH, 5);
		cAdh7.set(Calendar.DAY_OF_MONTH, 23);
		cAdh7.set(Calendar.HOUR_OF_DAY, 3);
		cAdh7.set(Calendar.MINUTE, 32);
		if (cAdh2.getTimeInMillis() > System.currentTimeMillis()) {
			amm7 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amm7.set(AlarmManager.RTC_WAKEUP, cAdh7.getTimeInMillis(), pii7);
		}

		pii8 = PendingIntent.getBroadcast(this.getApplicationContext(), 888,
				iii, 0);
		Calendar cAdh8 = Calendar.getInstance(); // 24 june
		cAdh8.set(Calendar.MONTH, 5);
		cAdh8.set(Calendar.DAY_OF_MONTH, 24);
		cAdh8.set(Calendar.HOUR_OF_DAY, 3);
		cAdh8.set(Calendar.MINUTE, 33);
		if (cAdh8.getTimeInMillis() > System.currentTimeMillis()) {
			amm8 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amm8.set(AlarmManager.RTC_WAKEUP, cAdh8.getTimeInMillis(), pii8);
		}

		pii9 = PendingIntent.getBroadcast(this.getApplicationContext(), 999,
				iii, 0);
		Calendar cAdh9 = Calendar.getInstance(); // 25 june
		cAdh9.set(Calendar.MONTH, 5);
		cAdh9.set(Calendar.DAY_OF_MONTH, 25);
		cAdh9.set(Calendar.HOUR_OF_DAY, 3);
		cAdh9.set(Calendar.MINUTE, 33);
		if (cAdh2.getTimeInMillis() > System.currentTimeMillis()) {
			amm9 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amm9.set(AlarmManager.RTC_WAKEUP, cAdh9.getTimeInMillis(), pii9);
		}

		pii10 = PendingIntent.getBroadcast(this.getApplicationContext(), 1010,
				iii, 0);
		Calendar cAdh10 = Calendar.getInstance(); // 26 june
		cAdh10.set(Calendar.MONTH, 5);
		cAdh10.set(Calendar.DAY_OF_MONTH, 26);
		cAdh10.set(Calendar.HOUR_OF_DAY, 3);
		cAdh10.set(Calendar.MINUTE, 34);
		if (cAdh10.getTimeInMillis() > System.currentTimeMillis()) {
			amm10 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amm10.set(AlarmManager.RTC_WAKEUP, cAdh10.getTimeInMillis(), pii10);
		}

		pii11 = PendingIntent.getBroadcast(this.getApplicationContext(), 1111,
				iii, 0);
		Calendar cAdh11 = Calendar.getInstance(); // 27 june
		cAdh11.set(Calendar.MONTH, 5);
		cAdh11.set(Calendar.DAY_OF_MONTH, 27);
		cAdh11.set(Calendar.HOUR_OF_DAY, 3);
		cAdh11.set(Calendar.MINUTE, 34);
		if (cAdh11.getTimeInMillis() > System.currentTimeMillis()) {
			amm11 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amm11.set(AlarmManager.RTC_WAKEUP, cAdh11.getTimeInMillis(), pii11);
		}

		pii12 = PendingIntent.getBroadcast(this.getApplicationContext(), 1212,
				iii, 0);
		Calendar cAdh12 = Calendar.getInstance(); // 28 june
		cAdh12.set(Calendar.MONTH, 5);
		cAdh12.set(Calendar.DAY_OF_MONTH, 28);
		cAdh12.set(Calendar.HOUR_OF_DAY, 3);
		cAdh12.set(Calendar.MINUTE, 35);
		if (cAdh12.getTimeInMillis() > System.currentTimeMillis()) {
			amm12 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amm12.set(AlarmManager.RTC_WAKEUP, cAdh12.getTimeInMillis(), pii12);
		}

		pii13 = PendingIntent.getBroadcast(this.getApplicationContext(), 1313,
				iii, 0);
		Calendar cAdh13 = Calendar.getInstance(); // 29 june
		cAdh13.set(Calendar.MONTH, 5);
		cAdh13.set(Calendar.DAY_OF_MONTH, 29);
		cAdh13.set(Calendar.HOUR_OF_DAY, 3);
		cAdh13.set(Calendar.MINUTE, 35);
		if (cAdh13.getTimeInMillis() > System.currentTimeMillis()) {
			amm13 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amm13.set(AlarmManager.RTC_WAKEUP, cAdh13.getTimeInMillis(), pii13);
		}

		pii14 = PendingIntent.getBroadcast(this.getApplicationContext(), 1414,
				iii, 0);
		Calendar cAdh14 = Calendar.getInstance(); // 30 june
		cAdh14.set(Calendar.MONTH, 5);
		cAdh14.set(Calendar.DAY_OF_MONTH, 30);
		cAdh14.set(Calendar.HOUR_OF_DAY, 3);
		cAdh14.set(Calendar.MINUTE, 36);
		if (cAdh14.getTimeInMillis() > System.currentTimeMillis()) {
			amm14 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amm14.set(AlarmManager.RTC_WAKEUP, cAdh14.getTimeInMillis(), pii14);
		}

		pii15 = PendingIntent.getBroadcast(this.getApplicationContext(), 1515,
				iii, 0);
		Calendar cAdh15 = Calendar.getInstance(); // 1 july
		cAdh15.set(Calendar.MONTH, 6);
		cAdh15.set(Calendar.DAY_OF_MONTH, 1);
		cAdh15.set(Calendar.HOUR_OF_DAY, 3);
		cAdh15.set(Calendar.MINUTE, 37);
		if (cAdh15.getTimeInMillis() > System.currentTimeMillis()) {
			amm15 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amm15.set(AlarmManager.RTC_WAKEUP, cAdh15.getTimeInMillis(), pii15);
		}

		pii16 = PendingIntent.getBroadcast(this.getApplicationContext(), 1616,
				iii, 0);
		Calendar cAdh16 = Calendar.getInstance(); // 2 july
		cAdh16.set(Calendar.MONTH, 6);
		cAdh16.set(Calendar.DAY_OF_MONTH, 2);
		cAdh16.set(Calendar.HOUR_OF_DAY, 3);
		cAdh16.set(Calendar.MINUTE, 37);
		if (cAdh16.getTimeInMillis() > System.currentTimeMillis()) {
			amm16 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amm16.set(AlarmManager.RTC_WAKEUP, cAdh16.getTimeInMillis(), pii16);
		}

		pii17 = PendingIntent.getBroadcast(this.getApplicationContext(), 1717,
				iii, 0);
		Calendar cAdh17 = Calendar.getInstance(); // 3 july
		cAdh17.set(Calendar.MONTH, 6);
		cAdh17.set(Calendar.DAY_OF_MONTH, 3);
		cAdh17.set(Calendar.HOUR_OF_DAY, 3);
		cAdh17.set(Calendar.MINUTE, 38);
		if (cAdh17.getTimeInMillis() > System.currentTimeMillis()) {
			amm17 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amm17.set(AlarmManager.RTC_WAKEUP, cAdh17.getTimeInMillis(), pii17);
		}

		pii18 = PendingIntent.getBroadcast(this.getApplicationContext(), 1818,
				iii, 0);
		Calendar cAdh18 = Calendar.getInstance(); // 4 july
		cAdh18.set(Calendar.MONTH, 6);
		cAdh18.set(Calendar.DAY_OF_MONTH, 4);
		cAdh18.set(Calendar.HOUR_OF_DAY, 3);
		cAdh18.set(Calendar.MINUTE, 39);
		if (cAdh18.getTimeInMillis() > System.currentTimeMillis()) {
			amm18 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amm18.set(AlarmManager.RTC_WAKEUP, cAdh18.getTimeInMillis(), pii18);
		}

		pii19 = PendingIntent.getBroadcast(this.getApplicationContext(), 1919,
				iii, 0);
		Calendar cAdh19 = Calendar.getInstance(); // 5 july
		cAdh19.set(Calendar.MONTH, 6);
		cAdh19.set(Calendar.DAY_OF_MONTH, 5);
		cAdh19.set(Calendar.HOUR_OF_DAY, 3);
		cAdh19.set(Calendar.MINUTE, 40);
		if (cAdh19.getTimeInMillis() > System.currentTimeMillis()) {
			amm19 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amm19.set(AlarmManager.RTC_WAKEUP, cAdh19.getTimeInMillis(), pii19);
		}

		pii20 = PendingIntent.getBroadcast(this.getApplicationContext(), 2020,
				iii, 0);
		Calendar cAdh20 = Calendar.getInstance(); // 6 july
		cAdh20.set(Calendar.MONTH, 6);
		cAdh20.set(Calendar.DAY_OF_MONTH, 6);
		cAdh20.set(Calendar.HOUR_OF_DAY, 3);
		cAdh20.set(Calendar.MINUTE, 41);
		if (cAdh20.getTimeInMillis() > System.currentTimeMillis()) {
			amm20 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amm20.set(AlarmManager.RTC_WAKEUP, cAdh20.getTimeInMillis(), pii20);
		}

		pii21 = PendingIntent.getBroadcast(this.getApplicationContext(), 2121,
				iii, 0);
		Calendar cAdh21 = Calendar.getInstance(); // 7 july
		cAdh21.set(Calendar.MONTH, 6);
		cAdh21.set(Calendar.DAY_OF_MONTH, 7);
		cAdh21.set(Calendar.HOUR_OF_DAY, 3);
		cAdh21.set(Calendar.MINUTE, 42);
		if (cAdh21.getTimeInMillis() > System.currentTimeMillis()) {
			amm21 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amm21.set(AlarmManager.RTC_WAKEUP, cAdh21.getTimeInMillis(), pii21);
		}

		pii22 = PendingIntent.getBroadcast(this.getApplicationContext(), 2222,
				iii, 0);
		Calendar cAdh22 = Calendar.getInstance(); // 8 july
		cAdh22.set(Calendar.MONTH, 6);
		cAdh22.set(Calendar.DAY_OF_MONTH, 8);
		cAdh22.set(Calendar.HOUR_OF_DAY, 3);
		cAdh22.set(Calendar.MINUTE, 43);
		if (cAdh22.getTimeInMillis() > System.currentTimeMillis()) {
			amm22 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amm22.set(AlarmManager.RTC_WAKEUP, cAdh22.getTimeInMillis(), pii22);
		}

		pii23 = PendingIntent.getBroadcast(this.getApplicationContext(), 2323,
				iii, 0);
		Calendar cAdh23 = Calendar.getInstance(); // 9 july
		cAdh23.set(Calendar.MONTH, 6);
		cAdh23.set(Calendar.DAY_OF_MONTH, 9);
		cAdh23.set(Calendar.HOUR_OF_DAY, 3);
		cAdh23.set(Calendar.MINUTE, 44);
		if (cAdh23.getTimeInMillis() > System.currentTimeMillis()) {
			amm23 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amm23.set(AlarmManager.RTC_WAKEUP, cAdh23.getTimeInMillis(), pii23);
		}

		pii24 = PendingIntent.getBroadcast(this.getApplicationContext(), 2424,
				iii, 0);
		Calendar cAdh24 = Calendar.getInstance(); // 10 july
		cAdh24.set(Calendar.MONTH, 6);
		cAdh24.set(Calendar.DAY_OF_MONTH, 10);
		cAdh24.set(Calendar.HOUR_OF_DAY, 3);
		cAdh24.set(Calendar.MINUTE, 45);
		if (cAdh24.getTimeInMillis() > System.currentTimeMillis()) {
			amm24 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amm24.set(AlarmManager.RTC_WAKEUP, cAdh24.getTimeInMillis(), pii24);
		}

		pii25 = PendingIntent.getBroadcast(this.getApplicationContext(), 2525,
				iii, 0);
		Calendar cAdh25 = Calendar.getInstance(); // 11 july
		cAdh25.set(Calendar.MONTH, 6);
		cAdh25.set(Calendar.DAY_OF_MONTH, 11);
		cAdh25.set(Calendar.HOUR_OF_DAY, 3);
		cAdh25.set(Calendar.MINUTE, 45);
		if (cAdh25.getTimeInMillis() > System.currentTimeMillis()) {
			amm25 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amm25.set(AlarmManager.RTC_WAKEUP, cAdh25.getTimeInMillis(), pii25);
		}

		pii26 = PendingIntent.getBroadcast(this.getApplicationContext(), 2626,
				iii, 0);
		Calendar cAdh26 = Calendar.getInstance(); // 12 july
		cAdh26.set(Calendar.MONTH, 6);
		cAdh26.set(Calendar.DAY_OF_MONTH, 12);
		cAdh26.set(Calendar.HOUR_OF_DAY, 3);
		cAdh26.set(Calendar.MINUTE, 46);
		if (cAdh26.getTimeInMillis() > System.currentTimeMillis()) {
			amm26 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amm26.set(AlarmManager.RTC_WAKEUP, cAdh26.getTimeInMillis(), pii26);
		}

		pii27 = PendingIntent.getBroadcast(this.getApplicationContext(), 2727,
				iii, 0);
		Calendar cAdh27 = Calendar.getInstance(); // 13 july
		cAdh27.set(Calendar.MONTH, 6);
		cAdh27.set(Calendar.DAY_OF_MONTH, 13);
		cAdh27.set(Calendar.HOUR_OF_DAY, 3);
		cAdh27.set(Calendar.MINUTE, 46);
		if (cAdh27.getTimeInMillis() > System.currentTimeMillis()) {
			amm27 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amm27.set(AlarmManager.RTC_WAKEUP, cAdh27.getTimeInMillis(), pii27);
		}

		pii28 = PendingIntent.getBroadcast(this.getApplicationContext(), 2828,
				iii, 0);
		Calendar cAdh28 = Calendar.getInstance(); // 14 july
		cAdh28.set(Calendar.MONTH, 6);
		cAdh28.set(Calendar.DAY_OF_MONTH, 14);
		cAdh28.set(Calendar.HOUR_OF_DAY, 3);
		cAdh28.set(Calendar.MINUTE, 47);
		if (cAdh28.getTimeInMillis() > System.currentTimeMillis()) {
			amm28 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amm28.set(AlarmManager.RTC_WAKEUP, cAdh28.getTimeInMillis(), pii28);
		}

		pii29 = PendingIntent.getBroadcast(this.getApplicationContext(), 2929,
				iii, 0);
		Calendar cAdh29 = Calendar.getInstance(); // 15 july
		cAdh29.set(Calendar.MONTH, 6);
		cAdh29.set(Calendar.DAY_OF_MONTH, 15);
		cAdh29.set(Calendar.HOUR_OF_DAY, 3);
		cAdh29.set(Calendar.MINUTE, 48);
		if (cAdh29.getTimeInMillis() > System.currentTimeMillis()) {
			amm29 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amm29.set(AlarmManager.RTC_WAKEUP, cAdh29.getTimeInMillis(), pii29);
		}

		pii30 = PendingIntent.getBroadcast(this.getApplicationContext(), 3030,
				iii, 0);
		Calendar cAdh30 = Calendar.getInstance(); // 16 july
		cAdh30.set(Calendar.MONTH, 6);
		cAdh30.set(Calendar.DAY_OF_MONTH, 16);
		cAdh30.set(Calendar.HOUR_OF_DAY, 3);
		cAdh30.set(Calendar.MINUTE, 48);
		if (cAdh30.getTimeInMillis() > System.currentTimeMillis()) {
			amm30 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amm30.set(AlarmManager.RTC_WAKEUP, cAdh30.getTimeInMillis(), pii30);
		}
	}

	public void setupAlarms4() {
		// for Adhan Notification
		iii = new Intent(this, Notifi_Adhan4.class);
		// Every alarm manager should have its own calendar and its own pending
		// intent with a unique requestCode

		piv1 = PendingIntent.getBroadcast(this.getApplicationContext(), 111,
				iii, 0);
		Calendar cAdh1 = Calendar.getInstance(); // 17 june
		cAdh1.set(Calendar.MONTH, 5);
		cAdh1.set(Calendar.DAY_OF_MONTH, 17);
		cAdh1.set(Calendar.HOUR_OF_DAY, 21);
		cAdh1.set(Calendar.MINUTE, 34);
		if (cAdh1.getTimeInMillis() > System.currentTimeMillis()) {
			amv1 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amv1.set(AlarmManager.RTC_WAKEUP, cAdh1.getTimeInMillis(), piv1);
		}

		piv2 = PendingIntent.getBroadcast(this.getApplicationContext(), 222,
				iii, 0);
		Calendar cAdh2 = Calendar.getInstance(); // 18 june
		cAdh2.set(Calendar.MONTH, 5);
		cAdh2.set(Calendar.DAY_OF_MONTH, 18);
		cAdh2.set(Calendar.HOUR_OF_DAY, 21);
		cAdh2.set(Calendar.MINUTE, 34);
		if (cAdh2.getTimeInMillis() > System.currentTimeMillis()) {
			amv2 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amv2.set(AlarmManager.RTC_WAKEUP, cAdh2.getTimeInMillis(), piv2);
		}

		piv3 = PendingIntent.getBroadcast(this.getApplicationContext(), 333,
				iii, 0);
		Calendar cAdh3 = Calendar.getInstance(); // 19 june
		cAdh3.set(Calendar.MONTH, 5);
		cAdh3.set(Calendar.DAY_OF_MONTH, 19);
		cAdh3.set(Calendar.HOUR_OF_DAY, 21);
		cAdh3.set(Calendar.MINUTE, 34);
		if (cAdh3.getTimeInMillis() > System.currentTimeMillis()) {
			amv3 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amv3.set(AlarmManager.RTC_WAKEUP, cAdh3.getTimeInMillis(), piv3);
		}

		piv4 = PendingIntent.getBroadcast(this.getApplicationContext(), 444,
				iii, 0);
		Calendar cAdh4 = Calendar.getInstance(); // 20 june
		cAdh4.set(Calendar.MONTH, 5);
		cAdh4.set(Calendar.DAY_OF_MONTH, 20);
		cAdh4.set(Calendar.HOUR_OF_DAY, 21);
		cAdh4.set(Calendar.MINUTE, 34);
		if (cAdh4.getTimeInMillis() > System.currentTimeMillis()) {
			amv4 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amv4.set(AlarmManager.RTC_WAKEUP, cAdh4.getTimeInMillis(), piv4);
		}

		piv5 = PendingIntent.getBroadcast(this.getApplicationContext(), 555,
				iii, 0);
		Calendar cAdh5 = Calendar.getInstance(); // 21 june
		cAdh5.set(Calendar.MONTH, 5);
		cAdh5.set(Calendar.DAY_OF_MONTH, 21);
		cAdh5.set(Calendar.HOUR_OF_DAY, 21);
		cAdh5.set(Calendar.MINUTE, 35);
		if (cAdh5.getTimeInMillis() > System.currentTimeMillis()) {
			amv5 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amv5.set(AlarmManager.RTC_WAKEUP, cAdh5.getTimeInMillis(), piv5);
		}

		piv6 = PendingIntent.getBroadcast(this.getApplicationContext(), 666,
				iii, 0);
		Calendar cAdh6 = Calendar.getInstance(); // 22 june
		cAdh6.set(Calendar.MONTH, 5);
		cAdh6.set(Calendar.DAY_OF_MONTH, 22);
		cAdh6.set(Calendar.HOUR_OF_DAY, 21);
		cAdh6.set(Calendar.MINUTE, 35);
		if (cAdh6.getTimeInMillis() > System.currentTimeMillis()) {
			amv6 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amv6.set(AlarmManager.RTC_WAKEUP, cAdh6.getTimeInMillis(), piv6);
		}

		piv7 = PendingIntent.getBroadcast(this.getApplicationContext(), 777,
				iii, 0);
		Calendar cAdh7 = Calendar.getInstance(); // 23 june
		cAdh7.set(Calendar.MONTH, 5);
		cAdh7.set(Calendar.DAY_OF_MONTH, 23);
		cAdh7.set(Calendar.HOUR_OF_DAY, 21);
		cAdh7.set(Calendar.MINUTE, 35);
		if (cAdh2.getTimeInMillis() > System.currentTimeMillis()) {
			amv7 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amv7.set(AlarmManager.RTC_WAKEUP, cAdh7.getTimeInMillis(), piv7);
		}

		piv8 = PendingIntent.getBroadcast(this.getApplicationContext(), 888,
				iii, 0);
		Calendar cAdh8 = Calendar.getInstance(); // 24 june
		cAdh8.set(Calendar.MONTH, 5);
		cAdh8.set(Calendar.DAY_OF_MONTH, 24);
		cAdh8.set(Calendar.HOUR_OF_DAY, 21);
		cAdh8.set(Calendar.MINUTE, 36);
		if (cAdh8.getTimeInMillis() > System.currentTimeMillis()) {
			amv8 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amv8.set(AlarmManager.RTC_WAKEUP, cAdh8.getTimeInMillis(), piv8);
		}

		piv9 = PendingIntent.getBroadcast(this.getApplicationContext(), 999,
				iii, 0);
		Calendar cAdh9 = Calendar.getInstance(); // 25 june
		cAdh9.set(Calendar.MONTH, 5);
		cAdh9.set(Calendar.DAY_OF_MONTH, 25);
		cAdh9.set(Calendar.HOUR_OF_DAY, 21);
		cAdh9.set(Calendar.MINUTE, 36);
		if (cAdh2.getTimeInMillis() > System.currentTimeMillis()) {
			amv9 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amv9.set(AlarmManager.RTC_WAKEUP, cAdh9.getTimeInMillis(), piv9);
		}

		piv10 = PendingIntent.getBroadcast(this.getApplicationContext(), 1010,
				iii, 0);
		Calendar cAdh10 = Calendar.getInstance(); // 26 june
		cAdh10.set(Calendar.MONTH, 5);
		cAdh10.set(Calendar.DAY_OF_MONTH, 26);
		cAdh10.set(Calendar.HOUR_OF_DAY, 21);
		cAdh10.set(Calendar.MINUTE, 36);
		if (cAdh10.getTimeInMillis() > System.currentTimeMillis()) {
			amv10 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amv10.set(AlarmManager.RTC_WAKEUP, cAdh10.getTimeInMillis(), piv10);
		}

		piv11 = PendingIntent.getBroadcast(this.getApplicationContext(), 1111,
				iii, 0);
		Calendar cAdh11 = Calendar.getInstance(); // 27 june
		cAdh11.set(Calendar.MONTH, 5);
		cAdh11.set(Calendar.DAY_OF_MONTH, 27);
		cAdh11.set(Calendar.HOUR_OF_DAY, 21);
		cAdh11.set(Calendar.MINUTE, 36);
		if (cAdh11.getTimeInMillis() > System.currentTimeMillis()) {
			amv11 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amv11.set(AlarmManager.RTC_WAKEUP, cAdh11.getTimeInMillis(), piv11);
		}

		piv12 = PendingIntent.getBroadcast(this.getApplicationContext(), 1212,
				iii, 0);
		Calendar cAdh12 = Calendar.getInstance(); // 28 june
		cAdh12.set(Calendar.MONTH, 5);
		cAdh12.set(Calendar.DAY_OF_MONTH, 28);
		cAdh12.set(Calendar.HOUR_OF_DAY, 21);
		cAdh12.set(Calendar.MINUTE, 36);
		if (cAdh12.getTimeInMillis() > System.currentTimeMillis()) {
			amv12 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amv12.set(AlarmManager.RTC_WAKEUP, cAdh12.getTimeInMillis(), piv12);
		}

		piv13 = PendingIntent.getBroadcast(this.getApplicationContext(), 1313,
				iii, 0);
		Calendar cAdh13 = Calendar.getInstance(); // 29 june
		cAdh13.set(Calendar.MONTH, 5);
		cAdh13.set(Calendar.DAY_OF_MONTH, 29);
		cAdh13.set(Calendar.HOUR_OF_DAY, 21);
		cAdh13.set(Calendar.MINUTE, 37);
		if (cAdh13.getTimeInMillis() > System.currentTimeMillis()) {
			amv13 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amv13.set(AlarmManager.RTC_WAKEUP, cAdh13.getTimeInMillis(), piv13);
		}

		piv14 = PendingIntent.getBroadcast(this.getApplicationContext(), 1414,
				iii, 0);
		Calendar cAdh14 = Calendar.getInstance(); // 30 june
		cAdh14.set(Calendar.MONTH, 5);
		cAdh14.set(Calendar.DAY_OF_MONTH, 30);
		cAdh14.set(Calendar.HOUR_OF_DAY, 21);
		cAdh14.set(Calendar.MINUTE, 37);
		if (cAdh14.getTimeInMillis() > System.currentTimeMillis()) {
			amv14 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amv14.set(AlarmManager.RTC_WAKEUP, cAdh14.getTimeInMillis(), piv14);
		}

		piv15 = PendingIntent.getBroadcast(this.getApplicationContext(), 1515,
				iii, 0);
		Calendar cAdh15 = Calendar.getInstance(); // 1 july
		cAdh15.set(Calendar.MONTH, 6);
		cAdh15.set(Calendar.DAY_OF_MONTH, 1);
		cAdh15.set(Calendar.HOUR_OF_DAY, 21);
		cAdh15.set(Calendar.MINUTE, 36);
		if (cAdh15.getTimeInMillis() > System.currentTimeMillis()) {
			amv15 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amv15.set(AlarmManager.RTC_WAKEUP, cAdh15.getTimeInMillis(), piv15);
		}

		piv16 = PendingIntent.getBroadcast(this.getApplicationContext(), 1616,
				iii, 0);
		Calendar cAdh16 = Calendar.getInstance(); // 2 july
		cAdh16.set(Calendar.MONTH, 6);
		cAdh16.set(Calendar.DAY_OF_MONTH, 2);
		cAdh16.set(Calendar.HOUR_OF_DAY, 21);
		cAdh16.set(Calendar.MINUTE, 35);
		if (cAdh16.getTimeInMillis() > System.currentTimeMillis()) {
			amv16 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amv16.set(AlarmManager.RTC_WAKEUP, cAdh16.getTimeInMillis(), piv16);
		}

		piv17 = PendingIntent.getBroadcast(this.getApplicationContext(), 1717,
				iii, 0);
		Calendar cAdh17 = Calendar.getInstance(); // 3 july
		cAdh17.set(Calendar.MONTH, 6);
		cAdh17.set(Calendar.DAY_OF_MONTH, 3);
		cAdh17.set(Calendar.HOUR_OF_DAY, 21);
		cAdh17.set(Calendar.MINUTE, 35);
		if (cAdh17.getTimeInMillis() > System.currentTimeMillis()) {
			amv17 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amv17.set(AlarmManager.RTC_WAKEUP, cAdh17.getTimeInMillis(), piv17);
		}

		piv18 = PendingIntent.getBroadcast(this.getApplicationContext(), 1818,
				iii, 0);
		Calendar cAdh18 = Calendar.getInstance(); // 4 july
		cAdh18.set(Calendar.MONTH, 6);
		cAdh18.set(Calendar.DAY_OF_MONTH, 4);
		cAdh18.set(Calendar.HOUR_OF_DAY, 21);
		cAdh18.set(Calendar.MINUTE, 35);
		if (cAdh18.getTimeInMillis() > System.currentTimeMillis()) {
			amv18 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amv18.set(AlarmManager.RTC_WAKEUP, cAdh18.getTimeInMillis(), piv18);
		}

		piv19 = PendingIntent.getBroadcast(this.getApplicationContext(), 1919,
				iii, 0);
		Calendar cAdh19 = Calendar.getInstance(); // 5 july
		cAdh19.set(Calendar.MONTH, 6);
		cAdh19.set(Calendar.DAY_OF_MONTH, 5);
		cAdh19.set(Calendar.HOUR_OF_DAY, 21);
		cAdh19.set(Calendar.MINUTE, 35);
		if (cAdh19.getTimeInMillis() > System.currentTimeMillis()) {
			amv19 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amv19.set(AlarmManager.RTC_WAKEUP, cAdh19.getTimeInMillis(), piv19);
		}

		piv20 = PendingIntent.getBroadcast(this.getApplicationContext(), 2020,
				iii, 0);
		Calendar cAdh20 = Calendar.getInstance(); // 6 july
		cAdh20.set(Calendar.MONTH, 6);
		cAdh20.set(Calendar.DAY_OF_MONTH, 6);
		cAdh20.set(Calendar.HOUR_OF_DAY, 21);
		cAdh20.set(Calendar.MINUTE, 35);
		if (cAdh20.getTimeInMillis() > System.currentTimeMillis()) {
			amv20 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amv20.set(AlarmManager.RTC_WAKEUP, cAdh20.getTimeInMillis(), piv20);
		}

		piv21 = PendingIntent.getBroadcast(this.getApplicationContext(), 2121,
				iii, 0);
		Calendar cAdh21 = Calendar.getInstance(); // 7 july
		cAdh21.set(Calendar.MONTH, 6);
		cAdh21.set(Calendar.DAY_OF_MONTH, 7);
		cAdh21.set(Calendar.HOUR_OF_DAY, 21);
		cAdh21.set(Calendar.MINUTE, 35);
		if (cAdh21.getTimeInMillis() > System.currentTimeMillis()) {
			amv21 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amv21.set(AlarmManager.RTC_WAKEUP, cAdh21.getTimeInMillis(), piv21);
		}

		piv22 = PendingIntent.getBroadcast(this.getApplicationContext(), 2222,
				iii, 0);
		Calendar cAdh22 = Calendar.getInstance(); // 8 july
		cAdh22.set(Calendar.MONTH, 6);
		cAdh22.set(Calendar.DAY_OF_MONTH, 8);
		cAdh22.set(Calendar.HOUR_OF_DAY, 21);
		cAdh22.set(Calendar.MINUTE, 34);
		if (cAdh22.getTimeInMillis() > System.currentTimeMillis()) {
			amv22 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amv22.set(AlarmManager.RTC_WAKEUP, cAdh22.getTimeInMillis(), piv22);
		}

		piv23 = PendingIntent.getBroadcast(this.getApplicationContext(), 2323,
				iii, 0);
		Calendar cAdh23 = Calendar.getInstance(); // 9 july
		cAdh23.set(Calendar.MONTH, 6);
		cAdh23.set(Calendar.DAY_OF_MONTH, 9);
		cAdh23.set(Calendar.HOUR_OF_DAY, 21);
		cAdh23.set(Calendar.MINUTE, 34);
		if (cAdh23.getTimeInMillis() > System.currentTimeMillis()) {
			amv23 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amv23.set(AlarmManager.RTC_WAKEUP, cAdh23.getTimeInMillis(), piv23);
		}

		piv24 = PendingIntent.getBroadcast(this.getApplicationContext(), 2424,
				iii, 0);
		Calendar cAdh24 = Calendar.getInstance(); // 10 july
		cAdh24.set(Calendar.MONTH, 6);
		cAdh24.set(Calendar.DAY_OF_MONTH, 10);
		cAdh24.set(Calendar.HOUR_OF_DAY, 21);
		cAdh24.set(Calendar.MINUTE, 34);
		if (cAdh24.getTimeInMillis() > System.currentTimeMillis()) {
			amv24 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amv24.set(AlarmManager.RTC_WAKEUP, cAdh24.getTimeInMillis(), piv24);
		}

		piv25 = PendingIntent.getBroadcast(this.getApplicationContext(), 2525,
				iii, 0);
		Calendar cAdh25 = Calendar.getInstance(); // 11 july
		cAdh25.set(Calendar.MONTH, 6);
		cAdh25.set(Calendar.DAY_OF_MONTH, 11);
		cAdh25.set(Calendar.HOUR_OF_DAY, 21);
		cAdh25.set(Calendar.MINUTE, 33);
		if (cAdh25.getTimeInMillis() > System.currentTimeMillis()) {
			amv25 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amv25.set(AlarmManager.RTC_WAKEUP, cAdh25.getTimeInMillis(), piv25);
		}

		piv26 = PendingIntent.getBroadcast(this.getApplicationContext(), 2626,
				iii, 0);
		Calendar cAdh26 = Calendar.getInstance(); // 12 july
		cAdh26.set(Calendar.MONTH, 6);
		cAdh26.set(Calendar.DAY_OF_MONTH, 12);
		cAdh26.set(Calendar.HOUR_OF_DAY, 21);
		cAdh26.set(Calendar.MINUTE, 32);
		if (cAdh26.getTimeInMillis() > System.currentTimeMillis()) {
			amv26 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amv26.set(AlarmManager.RTC_WAKEUP, cAdh26.getTimeInMillis(), piv26);
		}

		piv27 = PendingIntent.getBroadcast(this.getApplicationContext(), 2727,
				iii, 0);
		Calendar cAdh27 = Calendar.getInstance(); // 13 july
		cAdh27.set(Calendar.MONTH, 6);
		cAdh27.set(Calendar.DAY_OF_MONTH, 13);
		cAdh27.set(Calendar.HOUR_OF_DAY, 21);
		cAdh27.set(Calendar.MINUTE, 31);
		if (cAdh27.getTimeInMillis() > System.currentTimeMillis()) {
			amv27 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amv27.set(AlarmManager.RTC_WAKEUP, cAdh27.getTimeInMillis(), piv27);
		}

		piv28 = PendingIntent.getBroadcast(this.getApplicationContext(), 2828,
				iii, 0);
		Calendar cAdh28 = Calendar.getInstance(); // 14 july
		cAdh28.set(Calendar.MONTH, 6);
		cAdh28.set(Calendar.DAY_OF_MONTH, 14);
		cAdh28.set(Calendar.HOUR_OF_DAY, 21);
		cAdh28.set(Calendar.MINUTE, 31);
		if (cAdh28.getTimeInMillis() > System.currentTimeMillis()) {
			amv28 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amv28.set(AlarmManager.RTC_WAKEUP, cAdh28.getTimeInMillis(), piv28);
		}

		piv29 = PendingIntent.getBroadcast(this.getApplicationContext(), 2929,
				iii, 0);
		Calendar cAdh29 = Calendar.getInstance(); // 15 july
		cAdh29.set(Calendar.MONTH, 6);
		cAdh29.set(Calendar.DAY_OF_MONTH, 15);
		cAdh29.set(Calendar.HOUR_OF_DAY, 21);
		cAdh29.set(Calendar.MINUTE, 31);
		if (cAdh29.getTimeInMillis() > System.currentTimeMillis()) {
			amv29 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amv29.set(AlarmManager.RTC_WAKEUP, cAdh29.getTimeInMillis(), piv29);
		}

		piv30 = PendingIntent.getBroadcast(this.getApplicationContext(), 3030,
				iii, 0);
		Calendar cAdh30 = Calendar.getInstance(); // 16 july
		cAdh30.set(Calendar.MONTH, 6);
		cAdh30.set(Calendar.DAY_OF_MONTH, 16);
		cAdh30.set(Calendar.HOUR_OF_DAY, 21);
		cAdh30.set(Calendar.MINUTE, 30);
		if (cAdh30.getTimeInMillis() > System.currentTimeMillis()) {
			amv30 = (AlarmManager) getSystemService(ALARM_SERVICE);
			amv30.set(AlarmManager.RTC_WAKEUP, cAdh30.getTimeInMillis(), piv30);
		}
	}

	public void setupAlarms3() {
		// for Adhan Notification
		iii = new Intent(this, Notifi_Adhan3.class);
		// Every alarm manager should have its own calendar and its own pending
		// intent with a unique requestCode

		piii1 = PendingIntent.getBroadcast(this.getApplicationContext(), 111,
				iii, 0);
		Calendar cAdh1 = Calendar.getInstance(); // 17 june
		cAdh1.set(Calendar.MONTH, 5);
		cAdh1.set(Calendar.DAY_OF_MONTH, 17);
		cAdh1.set(Calendar.HOUR_OF_DAY, 16);
		cAdh1.set(Calendar.MINUTE, 28);
		if (cAdh1.getTimeInMillis() > System.currentTimeMillis()) {
			ammm1 = (AlarmManager) getSystemService(ALARM_SERVICE);
			ammm1.set(AlarmManager.RTC_WAKEUP, cAdh1.getTimeInMillis(), piii1);
		}

		piii2 = PendingIntent.getBroadcast(this.getApplicationContext(), 222,
				iii, 0);
		Calendar cAdh2 = Calendar.getInstance(); // 18 june
		cAdh2.set(Calendar.MONTH, 5);
		cAdh2.set(Calendar.DAY_OF_MONTH, 18);
		cAdh2.set(Calendar.HOUR_OF_DAY, 16);
		cAdh2.set(Calendar.MINUTE, 28);
		if (cAdh2.getTimeInMillis() > System.currentTimeMillis()) {
			ammm2 = (AlarmManager) getSystemService(ALARM_SERVICE);
			ammm2.set(AlarmManager.RTC_WAKEUP, cAdh2.getTimeInMillis(), piii2);
		}

		piii3 = PendingIntent.getBroadcast(this.getApplicationContext(), 333,
				iii, 0);
		Calendar cAdh3 = Calendar.getInstance(); // 19 june
		cAdh3.set(Calendar.MONTH, 5);
		cAdh3.set(Calendar.DAY_OF_MONTH, 19);
		cAdh3.set(Calendar.HOUR_OF_DAY, 16);
		cAdh3.set(Calendar.MINUTE, 28);
		if (cAdh3.getTimeInMillis() > System.currentTimeMillis()) {
			ammm3 = (AlarmManager) getSystemService(ALARM_SERVICE);
			ammm3.set(AlarmManager.RTC_WAKEUP, cAdh3.getTimeInMillis(), piii3);
		}

		piii4 = PendingIntent.getBroadcast(this.getApplicationContext(), 444,
				iii, 0);
		Calendar cAdh4 = Calendar.getInstance(); // 20 june
		cAdh4.set(Calendar.MONTH, 5);
		cAdh4.set(Calendar.DAY_OF_MONTH, 20);
		cAdh4.set(Calendar.HOUR_OF_DAY, 16);
		cAdh4.set(Calendar.MINUTE, 28);
		if (cAdh4.getTimeInMillis() > System.currentTimeMillis()) {
			ammm4 = (AlarmManager) getSystemService(ALARM_SERVICE);
			ammm4.set(AlarmManager.RTC_WAKEUP, cAdh4.getTimeInMillis(), piii4);
		}

		piii5 = PendingIntent.getBroadcast(this.getApplicationContext(), 555,
				iii, 0);
		Calendar cAdh5 = Calendar.getInstance(); // 21 june
		cAdh5.set(Calendar.MONTH, 5);
		cAdh5.set(Calendar.DAY_OF_MONTH, 21);
		cAdh5.set(Calendar.HOUR_OF_DAY, 16);
		cAdh5.set(Calendar.MINUTE, 28);
		if (cAdh5.getTimeInMillis() > System.currentTimeMillis()) {
			ammm5 = (AlarmManager) getSystemService(ALARM_SERVICE);
			ammm5.set(AlarmManager.RTC_WAKEUP, cAdh5.getTimeInMillis(), piii5);
		}

		piii6 = PendingIntent.getBroadcast(this.getApplicationContext(), 666,
				iii, 0);
		Calendar cAdh6 = Calendar.getInstance(); // 22 june
		cAdh6.set(Calendar.MONTH, 5);
		cAdh6.set(Calendar.DAY_OF_MONTH, 22);
		cAdh6.set(Calendar.HOUR_OF_DAY, 16);
		cAdh6.set(Calendar.MINUTE, 28);
		if (cAdh6.getTimeInMillis() > System.currentTimeMillis()) {
			ammm6 = (AlarmManager) getSystemService(ALARM_SERVICE);
			ammm6.set(AlarmManager.RTC_WAKEUP, cAdh6.getTimeInMillis(), piii6);
		}

		piii7 = PendingIntent.getBroadcast(this.getApplicationContext(), 777,
				iii, 0);
		Calendar cAdh7 = Calendar.getInstance(); // 23 june
		cAdh7.set(Calendar.MONTH, 5);
		cAdh7.set(Calendar.DAY_OF_MONTH, 23);
		cAdh7.set(Calendar.HOUR_OF_DAY, 16);
		cAdh7.set(Calendar.MINUTE, 28);
		if (cAdh2.getTimeInMillis() > System.currentTimeMillis()) {
			ammm7 = (AlarmManager) getSystemService(ALARM_SERVICE);
			ammm7.set(AlarmManager.RTC_WAKEUP, cAdh7.getTimeInMillis(), piii7);
		}

		piii8 = PendingIntent.getBroadcast(this.getApplicationContext(), 888,
				iii, 0);
		Calendar cAdh8 = Calendar.getInstance(); // 24 june
		cAdh8.set(Calendar.MONTH, 5);
		cAdh8.set(Calendar.DAY_OF_MONTH, 24);
		cAdh8.set(Calendar.HOUR_OF_DAY, 16);
		cAdh8.set(Calendar.MINUTE, 29);
		if (cAdh8.getTimeInMillis() > System.currentTimeMillis()) {
			ammm8 = (AlarmManager) getSystemService(ALARM_SERVICE);
			ammm8.set(AlarmManager.RTC_WAKEUP, cAdh8.getTimeInMillis(), piii8);
		}

		piii9 = PendingIntent.getBroadcast(this.getApplicationContext(), 999,
				iii, 0);
		Calendar cAdh9 = Calendar.getInstance(); // 25 june
		cAdh9.set(Calendar.MONTH, 5);
		cAdh9.set(Calendar.DAY_OF_MONTH, 25);
		cAdh9.set(Calendar.HOUR_OF_DAY, 16);
		cAdh9.set(Calendar.MINUTE, 29);
		if (cAdh2.getTimeInMillis() > System.currentTimeMillis()) {
			ammm9 = (AlarmManager) getSystemService(ALARM_SERVICE);
			ammm9.set(AlarmManager.RTC_WAKEUP, cAdh9.getTimeInMillis(), piii9);
		}

		piii10 = PendingIntent.getBroadcast(this.getApplicationContext(), 1010,
				iii, 0);
		Calendar cAdh10 = Calendar.getInstance(); // 26 june
		cAdh10.set(Calendar.MONTH, 5);
		cAdh10.set(Calendar.DAY_OF_MONTH, 26);
		cAdh10.set(Calendar.HOUR_OF_DAY, 16);
		cAdh10.set(Calendar.MINUTE, 30);
		if (cAdh10.getTimeInMillis() > System.currentTimeMillis()) {
			ammm10 = (AlarmManager) getSystemService(ALARM_SERVICE);
			ammm10.set(AlarmManager.RTC_WAKEUP, cAdh10.getTimeInMillis(),
					piii10);
		}

		piii11 = PendingIntent.getBroadcast(this.getApplicationContext(), 1111,
				iii, 0);
		Calendar cAdh11 = Calendar.getInstance(); // 27 june
		cAdh11.set(Calendar.MONTH, 5);
		cAdh11.set(Calendar.DAY_OF_MONTH, 27);
		cAdh11.set(Calendar.HOUR_OF_DAY, 16);
		cAdh11.set(Calendar.MINUTE, 30);
		if (cAdh11.getTimeInMillis() > System.currentTimeMillis()) {
			ammm11 = (AlarmManager) getSystemService(ALARM_SERVICE);
			ammm11.set(AlarmManager.RTC_WAKEUP, cAdh11.getTimeInMillis(),
					piii11);
		}

		piii12 = PendingIntent.getBroadcast(this.getApplicationContext(), 1212,
				iii, 0);
		Calendar cAdh12 = Calendar.getInstance(); // 28 june
		cAdh12.set(Calendar.MONTH, 5);
		cAdh12.set(Calendar.DAY_OF_MONTH, 28);
		cAdh12.set(Calendar.HOUR_OF_DAY, 16);
		cAdh12.set(Calendar.MINUTE, 30);
		if (cAdh12.getTimeInMillis() > System.currentTimeMillis()) {
			ammm12 = (AlarmManager) getSystemService(ALARM_SERVICE);
			ammm12.set(AlarmManager.RTC_WAKEUP, cAdh12.getTimeInMillis(),
					piii12);
		}

		piii13 = PendingIntent.getBroadcast(this.getApplicationContext(), 1313,
				iii, 0);
		Calendar cAdh13 = Calendar.getInstance(); // 29 june
		cAdh13.set(Calendar.MONTH, 5);
		cAdh13.set(Calendar.DAY_OF_MONTH, 29);
		cAdh13.set(Calendar.HOUR_OF_DAY, 16);
		cAdh13.set(Calendar.MINUTE, 30);
		if (cAdh13.getTimeInMillis() > System.currentTimeMillis()) {
			ammm13 = (AlarmManager) getSystemService(ALARM_SERVICE);
			ammm13.set(AlarmManager.RTC_WAKEUP, cAdh13.getTimeInMillis(),
					piii13);
		}

		piii14 = PendingIntent.getBroadcast(this.getApplicationContext(), 1414,
				iii, 0);
		Calendar cAdh14 = Calendar.getInstance(); // 30 june
		cAdh14.set(Calendar.MONTH, 5);
		cAdh14.set(Calendar.DAY_OF_MONTH, 30);
		cAdh14.set(Calendar.HOUR_OF_DAY, 16);
		cAdh14.set(Calendar.MINUTE, 30);
		if (cAdh14.getTimeInMillis() > System.currentTimeMillis()) {
			ammm14 = (AlarmManager) getSystemService(ALARM_SERVICE);
			ammm14.set(AlarmManager.RTC_WAKEUP, cAdh14.getTimeInMillis(),
					piii14);
		}

		piii15 = PendingIntent.getBroadcast(this.getApplicationContext(), 1515,
				iii, 0);
		Calendar cAdh15 = Calendar.getInstance(); // 1 july
		cAdh15.set(Calendar.MONTH, 6);
		cAdh15.set(Calendar.DAY_OF_MONTH, 1);
		cAdh15.set(Calendar.HOUR_OF_DAY, 16);
		cAdh15.set(Calendar.MINUTE, 31);
		if (cAdh15.getTimeInMillis() > System.currentTimeMillis()) {
			ammm15 = (AlarmManager) getSystemService(ALARM_SERVICE);
			ammm15.set(AlarmManager.RTC_WAKEUP, cAdh15.getTimeInMillis(),
					piii15);
		}

		piii16 = PendingIntent.getBroadcast(this.getApplicationContext(), 1616,
				iii, 0);
		Calendar cAdh16 = Calendar.getInstance(); // 2 july
		cAdh16.set(Calendar.MONTH, 6);
		cAdh16.set(Calendar.DAY_OF_MONTH, 2);
		cAdh16.set(Calendar.HOUR_OF_DAY, 16);
		cAdh16.set(Calendar.MINUTE, 31);
		if (cAdh16.getTimeInMillis() > System.currentTimeMillis()) {
			ammm16 = (AlarmManager) getSystemService(ALARM_SERVICE);
			ammm16.set(AlarmManager.RTC_WAKEUP, cAdh16.getTimeInMillis(),
					piii16);
		}

		piii17 = PendingIntent.getBroadcast(this.getApplicationContext(), 1717,
				iii, 0);
		Calendar cAdh17 = Calendar.getInstance(); // 3 july
		cAdh17.set(Calendar.MONTH, 6);
		cAdh17.set(Calendar.DAY_OF_MONTH, 3);
		cAdh17.set(Calendar.HOUR_OF_DAY, 16);
		cAdh17.set(Calendar.MINUTE, 31);
		if (cAdh17.getTimeInMillis() > System.currentTimeMillis()) {
			ammm17 = (AlarmManager) getSystemService(ALARM_SERVICE);
			ammm17.set(AlarmManager.RTC_WAKEUP, cAdh17.getTimeInMillis(),
					piii17);
		}

		piii18 = PendingIntent.getBroadcast(this.getApplicationContext(), 1818,
				iii, 0);
		Calendar cAdh18 = Calendar.getInstance(); // 4 july
		cAdh18.set(Calendar.MONTH, 6);
		cAdh18.set(Calendar.DAY_OF_MONTH, 4);
		cAdh18.set(Calendar.HOUR_OF_DAY, 16);
		cAdh18.set(Calendar.MINUTE, 31);
		if (cAdh18.getTimeInMillis() > System.currentTimeMillis()) {
			ammm18 = (AlarmManager) getSystemService(ALARM_SERVICE);
			ammm18.set(AlarmManager.RTC_WAKEUP, cAdh18.getTimeInMillis(),
					piii18);
		}

		piii19 = PendingIntent.getBroadcast(this.getApplicationContext(), 1919,
				iii, 0);
		Calendar cAdh19 = Calendar.getInstance(); // 5 july
		cAdh19.set(Calendar.MONTH, 6);
		cAdh19.set(Calendar.DAY_OF_MONTH, 5);
		cAdh19.set(Calendar.HOUR_OF_DAY, 16);
		cAdh19.set(Calendar.MINUTE, 32);
		if (cAdh19.getTimeInMillis() > System.currentTimeMillis()) {
			ammm19 = (AlarmManager) getSystemService(ALARM_SERVICE);
			ammm19.set(AlarmManager.RTC_WAKEUP, cAdh19.getTimeInMillis(),
					piii19);
		}

		piii20 = PendingIntent.getBroadcast(this.getApplicationContext(), 2020,
				iii, 0);
		Calendar cAdh20 = Calendar.getInstance(); // 6 july
		cAdh20.set(Calendar.MONTH, 6);
		cAdh20.set(Calendar.DAY_OF_MONTH, 6);
		cAdh20.set(Calendar.HOUR_OF_DAY, 16);
		cAdh20.set(Calendar.MINUTE, 32);
		if (cAdh20.getTimeInMillis() > System.currentTimeMillis()) {
			ammm20 = (AlarmManager) getSystemService(ALARM_SERVICE);
			ammm20.set(AlarmManager.RTC_WAKEUP, cAdh20.getTimeInMillis(),
					piii20);
		}

		piii21 = PendingIntent.getBroadcast(this.getApplicationContext(), 2121,
				iii, 0);
		Calendar cAdh21 = Calendar.getInstance(); // 7 july
		cAdh21.set(Calendar.MONTH, 6);
		cAdh21.set(Calendar.DAY_OF_MONTH, 7);
		cAdh21.set(Calendar.HOUR_OF_DAY, 16);
		cAdh21.set(Calendar.MINUTE, 33);
		if (cAdh21.getTimeInMillis() > System.currentTimeMillis()) {
			ammm21 = (AlarmManager) getSystemService(ALARM_SERVICE);
			ammm21.set(AlarmManager.RTC_WAKEUP, cAdh21.getTimeInMillis(),
					piii21);
		}

		piii22 = PendingIntent.getBroadcast(this.getApplicationContext(), 2222,
				iii, 0);
		Calendar cAdh22 = Calendar.getInstance(); // 8 july
		cAdh22.set(Calendar.MONTH, 6);
		cAdh22.set(Calendar.DAY_OF_MONTH, 8);
		cAdh22.set(Calendar.HOUR_OF_DAY, 16);
		cAdh22.set(Calendar.MINUTE, 33);
		if (cAdh22.getTimeInMillis() > System.currentTimeMillis()) {
			ammm22 = (AlarmManager) getSystemService(ALARM_SERVICE);
			ammm22.set(AlarmManager.RTC_WAKEUP, cAdh22.getTimeInMillis(),
					piii22);
		}

		piii23 = PendingIntent.getBroadcast(this.getApplicationContext(), 2323,
				iii, 0);
		Calendar cAdh23 = Calendar.getInstance(); // 9 july
		cAdh23.set(Calendar.MONTH, 6);
		cAdh23.set(Calendar.DAY_OF_MONTH, 9);
		cAdh23.set(Calendar.HOUR_OF_DAY, 16);
		cAdh23.set(Calendar.MINUTE, 33);
		if (cAdh23.getTimeInMillis() > System.currentTimeMillis()) {
			ammm23 = (AlarmManager) getSystemService(ALARM_SERVICE);
			ammm23.set(AlarmManager.RTC_WAKEUP, cAdh23.getTimeInMillis(),
					piii23);
		}

		piii24 = PendingIntent.getBroadcast(this.getApplicationContext(), 2424,
				iii, 0);
		Calendar cAdh24 = Calendar.getInstance(); // 10 july
		cAdh24.set(Calendar.MONTH, 6);
		cAdh24.set(Calendar.DAY_OF_MONTH, 10);
		cAdh24.set(Calendar.HOUR_OF_DAY, 16);
		cAdh24.set(Calendar.MINUTE, 34);
		if (cAdh24.getTimeInMillis() > System.currentTimeMillis()) {
			ammm24 = (AlarmManager) getSystemService(ALARM_SERVICE);
			ammm24.set(AlarmManager.RTC_WAKEUP, cAdh24.getTimeInMillis(),
					piii24);
		}

		piii25 = PendingIntent.getBroadcast(this.getApplicationContext(), 2525,
				iii, 0);
		Calendar cAdh25 = Calendar.getInstance(); // 11 july
		cAdh25.set(Calendar.MONTH, 6);
		cAdh25.set(Calendar.DAY_OF_MONTH, 11);
		cAdh25.set(Calendar.HOUR_OF_DAY, 16);
		cAdh25.set(Calendar.MINUTE, 34);
		if (cAdh25.getTimeInMillis() > System.currentTimeMillis()) {
			ammm25 = (AlarmManager) getSystemService(ALARM_SERVICE);
			ammm25.set(AlarmManager.RTC_WAKEUP, cAdh25.getTimeInMillis(),
					piii25);
		}

		piii26 = PendingIntent.getBroadcast(this.getApplicationContext(), 2626,
				iii, 0);
		Calendar cAdh26 = Calendar.getInstance(); // 12 july
		cAdh26.set(Calendar.MONTH, 6);
		cAdh26.set(Calendar.DAY_OF_MONTH, 12);
		cAdh26.set(Calendar.HOUR_OF_DAY, 16);
		cAdh26.set(Calendar.MINUTE, 34);
		if (cAdh26.getTimeInMillis() > System.currentTimeMillis()) {
			ammm26 = (AlarmManager) getSystemService(ALARM_SERVICE);
			ammm26.set(AlarmManager.RTC_WAKEUP, cAdh26.getTimeInMillis(),
					piii26);
		}

		piii27 = PendingIntent.getBroadcast(this.getApplicationContext(), 2727,
				iii, 0);
		Calendar cAdh27 = Calendar.getInstance(); // 13 july
		cAdh27.set(Calendar.MONTH, 6);
		cAdh27.set(Calendar.DAY_OF_MONTH, 13);
		cAdh27.set(Calendar.HOUR_OF_DAY, 16);
		cAdh27.set(Calendar.MINUTE, 34);
		if (cAdh27.getTimeInMillis() > System.currentTimeMillis()) {
			ammm27 = (AlarmManager) getSystemService(ALARM_SERVICE);
			ammm27.set(AlarmManager.RTC_WAKEUP, cAdh27.getTimeInMillis(),
					piii27);
		}

		piii28 = PendingIntent.getBroadcast(this.getApplicationContext(), 2828,
				iii, 0);
		Calendar cAdh28 = Calendar.getInstance(); // 14 july
		cAdh28.set(Calendar.MONTH, 6);
		cAdh28.set(Calendar.DAY_OF_MONTH, 14);
		cAdh28.set(Calendar.HOUR_OF_DAY, 16);
		cAdh28.set(Calendar.MINUTE, 34);
		if (cAdh28.getTimeInMillis() > System.currentTimeMillis()) {
			ammm28 = (AlarmManager) getSystemService(ALARM_SERVICE);
			ammm28.set(AlarmManager.RTC_WAKEUP, cAdh28.getTimeInMillis(),
					piii28);
		}

		piii29 = PendingIntent.getBroadcast(this.getApplicationContext(), 2929,
				iii, 0);
		Calendar cAdh29 = Calendar.getInstance(); // 15 july
		cAdh29.set(Calendar.MONTH, 6);
		cAdh29.set(Calendar.DAY_OF_MONTH, 15);
		cAdh29.set(Calendar.HOUR_OF_DAY, 16);
		cAdh29.set(Calendar.MINUTE, 34);
		if (cAdh29.getTimeInMillis() > System.currentTimeMillis()) {
			ammm29 = (AlarmManager) getSystemService(ALARM_SERVICE);
			ammm29.set(AlarmManager.RTC_WAKEUP, cAdh29.getTimeInMillis(),
					piii29);
		}

		piii30 = PendingIntent.getBroadcast(this.getApplicationContext(), 3030,
				iii, 0);
		Calendar cAdh30 = Calendar.getInstance(); // 16 july
		cAdh30.set(Calendar.MONTH, 6);
		cAdh30.set(Calendar.DAY_OF_MONTH, 16);
		cAdh30.set(Calendar.HOUR_OF_DAY, 16);
		cAdh30.set(Calendar.MINUTE, 34);
		if (cAdh30.getTimeInMillis() > System.currentTimeMillis()) {
			ammm30 = (AlarmManager) getSystemService(ALARM_SERVICE);
			ammm30.set(AlarmManager.RTC_WAKEUP, cAdh30.getTimeInMillis(),
					piii30);
		}
	}

	public void setupAlarms5() {
		// for Adhan Notification
		iii = new Intent(this, Notifi_Adhan5.class);
		// Every alarm manager should have its own calendar and its own pending
		// intent with a unique requestCode

		pv1 = PendingIntent.getBroadcast(this.getApplicationContext(), 111,
				iii, 0);
		Calendar cAdh1 = Calendar.getInstance(); // 17 june
		cAdh1.set(Calendar.MONTH, 5);
		cAdh1.set(Calendar.DAY_OF_MONTH, 17);
		cAdh1.set(Calendar.HOUR_OF_DAY, 12);
		cAdh1.set(Calendar.MINUTE, 43);
		if (cAdh1.getTimeInMillis() > System.currentTimeMillis()) {
			av1 = (AlarmManager) getSystemService(ALARM_SERVICE);
			av1.set(AlarmManager.RTC_WAKEUP, cAdh1.getTimeInMillis(), pv1);
		}

		pv2 = PendingIntent.getBroadcast(this.getApplicationContext(), 222,
				iii, 0);
		Calendar cAdh2 = Calendar.getInstance(); // 18 june
		cAdh2.set(Calendar.MONTH, 5);
		cAdh2.set(Calendar.DAY_OF_MONTH, 18);
		cAdh2.set(Calendar.HOUR_OF_DAY, 12);
		cAdh2.set(Calendar.MINUTE, 43);
		if (cAdh2.getTimeInMillis() > System.currentTimeMillis()) {
			av2 = (AlarmManager) getSystemService(ALARM_SERVICE);
			av2.set(AlarmManager.RTC_WAKEUP, cAdh2.getTimeInMillis(), pv2);
		}

		pv3 = PendingIntent.getBroadcast(this.getApplicationContext(), 333,
				iii, 0);
		Calendar cAdh3 = Calendar.getInstance(); // 19 june
		cAdh3.set(Calendar.MONTH, 5);
		cAdh3.set(Calendar.DAY_OF_MONTH, 19);
		cAdh3.set(Calendar.HOUR_OF_DAY, 12);
		cAdh3.set(Calendar.MINUTE, 43);
		if (cAdh3.getTimeInMillis() > System.currentTimeMillis()) {
			av3 = (AlarmManager) getSystemService(ALARM_SERVICE);
			av3.set(AlarmManager.RTC_WAKEUP, cAdh3.getTimeInMillis(), pv3);
		}

		pv4 = PendingIntent.getBroadcast(this.getApplicationContext(), 444,
				iii, 0);
		Calendar cAdh4 = Calendar.getInstance(); // 20 june
		cAdh4.set(Calendar.MONTH, 5);
		cAdh4.set(Calendar.DAY_OF_MONTH, 20);
		cAdh4.set(Calendar.HOUR_OF_DAY, 12);
		cAdh4.set(Calendar.MINUTE, 43);
		if (cAdh4.getTimeInMillis() > System.currentTimeMillis()) {
			av4 = (AlarmManager) getSystemService(ALARM_SERVICE);
			av4.set(AlarmManager.RTC_WAKEUP, cAdh4.getTimeInMillis(), pv4);
		}

		pv5 = PendingIntent.getBroadcast(this.getApplicationContext(), 555,
				iii, 0);
		Calendar cAdh5 = Calendar.getInstance(); // 21 june
		cAdh5.set(Calendar.MONTH, 5);
		cAdh5.set(Calendar.DAY_OF_MONTH, 21);
		cAdh5.set(Calendar.HOUR_OF_DAY, 12);
		cAdh5.set(Calendar.MINUTE, 43);
		if (cAdh5.getTimeInMillis() > System.currentTimeMillis()) {
			av5 = (AlarmManager) getSystemService(ALARM_SERVICE);
			av5.set(AlarmManager.RTC_WAKEUP, cAdh5.getTimeInMillis(), pv5);
		}

		pv6 = PendingIntent.getBroadcast(this.getApplicationContext(), 666,
				iii, 0);
		Calendar cAdh6 = Calendar.getInstance(); // 22 june
		cAdh6.set(Calendar.MONTH, 5);
		cAdh6.set(Calendar.DAY_OF_MONTH, 22);
		cAdh6.set(Calendar.HOUR_OF_DAY, 12);
		cAdh6.set(Calendar.MINUTE, 43);
		if (cAdh6.getTimeInMillis() > System.currentTimeMillis()) {
			av6 = (AlarmManager) getSystemService(ALARM_SERVICE);
			av6.set(AlarmManager.RTC_WAKEUP, cAdh6.getTimeInMillis(), pv6);
		}

		pv7 = PendingIntent.getBroadcast(this.getApplicationContext(), 777,
				iii, 0);
		Calendar cAdh7 = Calendar.getInstance(); // 23 june
		cAdh7.set(Calendar.MONTH, 5);
		cAdh7.set(Calendar.DAY_OF_MONTH, 23);
		cAdh7.set(Calendar.HOUR_OF_DAY, 12);
		cAdh7.set(Calendar.MINUTE, 43);
		if (cAdh2.getTimeInMillis() > System.currentTimeMillis()) {
			av7 = (AlarmManager) getSystemService(ALARM_SERVICE);
			av7.set(AlarmManager.RTC_WAKEUP, cAdh7.getTimeInMillis(), pv7);
		}

		pv8 = PendingIntent.getBroadcast(this.getApplicationContext(), 888,
				iii, 0);
		Calendar cAdh8 = Calendar.getInstance(); // 24 june
		cAdh8.set(Calendar.MONTH, 5);
		cAdh8.set(Calendar.DAY_OF_MONTH, 24);
		cAdh8.set(Calendar.HOUR_OF_DAY, 12);
		cAdh8.set(Calendar.MINUTE, 44);
		if (cAdh8.getTimeInMillis() > System.currentTimeMillis()) {
			av8 = (AlarmManager) getSystemService(ALARM_SERVICE);
			av8.set(AlarmManager.RTC_WAKEUP, cAdh8.getTimeInMillis(), pv8);
		}

		pv9 = PendingIntent.getBroadcast(this.getApplicationContext(), 999,
				iii, 0);
		Calendar cAdh9 = Calendar.getInstance(); // 25 june
		cAdh9.set(Calendar.MONTH, 5);
		cAdh9.set(Calendar.DAY_OF_MONTH, 25);
		cAdh9.set(Calendar.HOUR_OF_DAY, 12);
		cAdh9.set(Calendar.MINUTE, 44);
		if (cAdh2.getTimeInMillis() > System.currentTimeMillis()) {
			av9 = (AlarmManager) getSystemService(ALARM_SERVICE);
			av9.set(AlarmManager.RTC_WAKEUP, cAdh9.getTimeInMillis(), pv9);
		}

		pv10 = PendingIntent.getBroadcast(this.getApplicationContext(), 1010,
				iii, 0);
		Calendar cAdh10 = Calendar.getInstance(); // 26 june
		cAdh10.set(Calendar.MONTH, 5);
		cAdh10.set(Calendar.DAY_OF_MONTH, 26);
		cAdh10.set(Calendar.HOUR_OF_DAY, 12);
		cAdh10.set(Calendar.MINUTE, 45);
		if (cAdh10.getTimeInMillis() > System.currentTimeMillis()) {
			av10 = (AlarmManager) getSystemService(ALARM_SERVICE);
			av10.set(AlarmManager.RTC_WAKEUP, cAdh10.getTimeInMillis(), pv10);
		}

		pv11 = PendingIntent.getBroadcast(this.getApplicationContext(), 1111,
				iii, 0);
		Calendar cAdh11 = Calendar.getInstance(); // 27 june
		cAdh11.set(Calendar.MONTH, 5);
		cAdh11.set(Calendar.DAY_OF_MONTH, 27);
		cAdh11.set(Calendar.HOUR_OF_DAY, 12);
		cAdh11.set(Calendar.MINUTE, 45);
		if (cAdh11.getTimeInMillis() > System.currentTimeMillis()) {
			av11 = (AlarmManager) getSystemService(ALARM_SERVICE);
			av11.set(AlarmManager.RTC_WAKEUP, cAdh11.getTimeInMillis(), pv11);
		}

		pv12 = PendingIntent.getBroadcast(this.getApplicationContext(), 1212,
				iii, 0);
		Calendar cAdh12 = Calendar.getInstance(); // 28 june
		cAdh12.set(Calendar.MONTH, 5);
		cAdh12.set(Calendar.DAY_OF_MONTH, 28);
		cAdh12.set(Calendar.HOUR_OF_DAY, 12);
		cAdh12.set(Calendar.MINUTE, 46);
		if (cAdh12.getTimeInMillis() > System.currentTimeMillis()) {
			av12 = (AlarmManager) getSystemService(ALARM_SERVICE);
			av12.set(AlarmManager.RTC_WAKEUP, cAdh12.getTimeInMillis(), pv12);
		}

		pv13 = PendingIntent.getBroadcast(this.getApplicationContext(), 1313,
				iii, 0);
		Calendar cAdh13 = Calendar.getInstance(); // 29 june
		cAdh13.set(Calendar.MONTH, 5);
		cAdh13.set(Calendar.DAY_OF_MONTH, 29);
		cAdh13.set(Calendar.HOUR_OF_DAY, 12);
		cAdh13.set(Calendar.MINUTE, 46);
		if (cAdh13.getTimeInMillis() > System.currentTimeMillis()) {
			av13 = (AlarmManager) getSystemService(ALARM_SERVICE);
			av13.set(AlarmManager.RTC_WAKEUP, cAdh13.getTimeInMillis(), pv13);
		}

		pv14 = PendingIntent.getBroadcast(this.getApplicationContext(), 1414,
				iii, 0);
		Calendar cAdh14 = Calendar.getInstance(); // 30 june
		cAdh14.set(Calendar.MONTH, 5);
		cAdh14.set(Calendar.DAY_OF_MONTH, 30);
		cAdh14.set(Calendar.HOUR_OF_DAY, 12);
		cAdh14.set(Calendar.MINUTE, 46);
		if (cAdh14.getTimeInMillis() > System.currentTimeMillis()) {
			av14 = (AlarmManager) getSystemService(ALARM_SERVICE);
			av14.set(AlarmManager.RTC_WAKEUP, cAdh14.getTimeInMillis(), pv14);
		}

		pv15 = PendingIntent.getBroadcast(this.getApplicationContext(), 1515,
				iii, 0);
		Calendar cAdh15 = Calendar.getInstance(); // 1 july
		cAdh15.set(Calendar.MONTH, 6);
		cAdh15.set(Calendar.DAY_OF_MONTH, 1);
		cAdh15.set(Calendar.HOUR_OF_DAY, 12);
		cAdh15.set(Calendar.MINUTE, 46);
		if (cAdh15.getTimeInMillis() > System.currentTimeMillis()) {
			av15 = (AlarmManager) getSystemService(ALARM_SERVICE);
			av15.set(AlarmManager.RTC_WAKEUP, cAdh15.getTimeInMillis(), pv15);
		}

		pv16 = PendingIntent.getBroadcast(this.getApplicationContext(), 1616,
				iii, 0);
		Calendar cAdh16 = Calendar.getInstance(); // 2 july
		cAdh16.set(Calendar.MONTH, 6);
		cAdh16.set(Calendar.DAY_OF_MONTH, 2);
		cAdh16.set(Calendar.HOUR_OF_DAY, 12);
		cAdh16.set(Calendar.MINUTE, 46);
		if (cAdh16.getTimeInMillis() > System.currentTimeMillis()) {
			av16 = (AlarmManager) getSystemService(ALARM_SERVICE);
			av16.set(AlarmManager.RTC_WAKEUP, cAdh16.getTimeInMillis(), pv16);
		}

		pv17 = PendingIntent.getBroadcast(this.getApplicationContext(), 1717,
				iii, 0);
		Calendar cAdh17 = Calendar.getInstance(); // 3 july
		cAdh17.set(Calendar.MONTH, 6);
		cAdh17.set(Calendar.DAY_OF_MONTH, 3);
		cAdh17.set(Calendar.HOUR_OF_DAY, 12);
		cAdh17.set(Calendar.MINUTE, 47);
		if (cAdh17.getTimeInMillis() > System.currentTimeMillis()) {
			av17 = (AlarmManager) getSystemService(ALARM_SERVICE);
			av17.set(AlarmManager.RTC_WAKEUP, cAdh17.getTimeInMillis(), pv17);
		}

		pv18 = PendingIntent.getBroadcast(this.getApplicationContext(), 1818,
				iii, 0);
		Calendar cAdh18 = Calendar.getInstance(); // 4 july
		cAdh18.set(Calendar.MONTH, 6);
		cAdh18.set(Calendar.DAY_OF_MONTH, 4);
		cAdh18.set(Calendar.HOUR_OF_DAY, 12);
		cAdh18.set(Calendar.MINUTE, 47);
		if (cAdh18.getTimeInMillis() > System.currentTimeMillis()) {
			av18 = (AlarmManager) getSystemService(ALARM_SERVICE);
			av18.set(AlarmManager.RTC_WAKEUP, cAdh18.getTimeInMillis(), pv18);
		}

		pv19 = PendingIntent.getBroadcast(this.getApplicationContext(), 1919,
				iii, 0);
		Calendar cAdh19 = Calendar.getInstance(); // 5 july
		cAdh19.set(Calendar.MONTH, 6);
		cAdh19.set(Calendar.DAY_OF_MONTH, 5);
		cAdh19.set(Calendar.HOUR_OF_DAY, 12);
		cAdh19.set(Calendar.MINUTE, 47);
		if (cAdh19.getTimeInMillis() > System.currentTimeMillis()) {
			av19 = (AlarmManager) getSystemService(ALARM_SERVICE);
			av19.set(AlarmManager.RTC_WAKEUP, cAdh19.getTimeInMillis(), pv19);
		}

		pv20 = PendingIntent.getBroadcast(this.getApplicationContext(), 2020,
				iii, 0);
		Calendar cAdh20 = Calendar.getInstance(); // 6 july
		cAdh20.set(Calendar.MONTH, 6);
		cAdh20.set(Calendar.DAY_OF_MONTH, 6);
		cAdh20.set(Calendar.HOUR_OF_DAY, 12);
		cAdh20.set(Calendar.MINUTE, 47);
		if (cAdh20.getTimeInMillis() > System.currentTimeMillis()) {
			av20 = (AlarmManager) getSystemService(ALARM_SERVICE);
			av20.set(AlarmManager.RTC_WAKEUP, cAdh20.getTimeInMillis(), pv20);
		}

		pv21 = PendingIntent.getBroadcast(this.getApplicationContext(), 2121,
				iii, 0);
		Calendar cAdh21 = Calendar.getInstance(); // 7 july
		cAdh21.set(Calendar.MONTH, 6);
		cAdh21.set(Calendar.DAY_OF_MONTH, 7);
		cAdh21.set(Calendar.HOUR_OF_DAY, 12);
		cAdh21.set(Calendar.MINUTE, 48);
		if (cAdh21.getTimeInMillis() > System.currentTimeMillis()) {
			av21 = (AlarmManager) getSystemService(ALARM_SERVICE);
			av21.set(AlarmManager.RTC_WAKEUP, cAdh21.getTimeInMillis(), pv21);
		}

		pv22 = PendingIntent.getBroadcast(this.getApplicationContext(), 2222,
				iii, 0);
		Calendar cAdh22 = Calendar.getInstance(); // 8 july
		cAdh22.set(Calendar.MONTH, 6);
		cAdh22.set(Calendar.DAY_OF_MONTH, 8);
		cAdh22.set(Calendar.HOUR_OF_DAY, 12);
		cAdh22.set(Calendar.MINUTE, 48);
		if (cAdh22.getTimeInMillis() > System.currentTimeMillis()) {
			av22 = (AlarmManager) getSystemService(ALARM_SERVICE);
			av22.set(AlarmManager.RTC_WAKEUP, cAdh22.getTimeInMillis(), pv22);
		}

		pv23 = PendingIntent.getBroadcast(this.getApplicationContext(), 2323,
				iii, 0);
		Calendar cAdh23 = Calendar.getInstance(); // 9 july
		cAdh23.set(Calendar.MONTH, 6);
		cAdh23.set(Calendar.DAY_OF_MONTH, 9);
		cAdh23.set(Calendar.HOUR_OF_DAY, 12);
		cAdh23.set(Calendar.MINUTE, 48);
		if (cAdh23.getTimeInMillis() > System.currentTimeMillis()) {
			av23 = (AlarmManager) getSystemService(ALARM_SERVICE);
			av23.set(AlarmManager.RTC_WAKEUP, cAdh23.getTimeInMillis(), pv23);
		}

		pv24 = PendingIntent.getBroadcast(this.getApplicationContext(), 2424,
				iii, 0);
		Calendar cAdh24 = Calendar.getInstance(); // 10 july
		cAdh24.set(Calendar.MONTH, 6);
		cAdh24.set(Calendar.DAY_OF_MONTH, 10);
		cAdh24.set(Calendar.HOUR_OF_DAY, 12);
		cAdh24.set(Calendar.MINUTE, 49);
		if (cAdh24.getTimeInMillis() > System.currentTimeMillis()) {
			av24 = (AlarmManager) getSystemService(ALARM_SERVICE);
			av24.set(AlarmManager.RTC_WAKEUP, cAdh24.getTimeInMillis(), pv24);
		}

		pv25 = PendingIntent.getBroadcast(this.getApplicationContext(), 2525,
				iii, 0);
		Calendar cAdh25 = Calendar.getInstance(); // 11 july
		cAdh25.set(Calendar.MONTH, 6);
		cAdh25.set(Calendar.DAY_OF_MONTH, 11);
		cAdh25.set(Calendar.HOUR_OF_DAY, 12);
		cAdh25.set(Calendar.MINUTE, 49);
		if (cAdh25.getTimeInMillis() > System.currentTimeMillis()) {
			av25 = (AlarmManager) getSystemService(ALARM_SERVICE);
			av25.set(AlarmManager.RTC_WAKEUP, cAdh25.getTimeInMillis(), pv25);
		}

		pv26 = PendingIntent.getBroadcast(this.getApplicationContext(), 2626,
				iii, 0);
		Calendar cAdh26 = Calendar.getInstance(); // 12 july
		cAdh26.set(Calendar.MONTH, 6);
		cAdh26.set(Calendar.DAY_OF_MONTH, 12);
		cAdh26.set(Calendar.HOUR_OF_DAY, 12);
		cAdh26.set(Calendar.MINUTE, 49);
		if (cAdh26.getTimeInMillis() > System.currentTimeMillis()) {
			av26 = (AlarmManager) getSystemService(ALARM_SERVICE);
			av26.set(AlarmManager.RTC_WAKEUP, cAdh26.getTimeInMillis(), pv26);
		}

		pv27 = PendingIntent.getBroadcast(this.getApplicationContext(), 2727,
				iii, 0);
		Calendar cAdh27 = Calendar.getInstance(); // 13 july
		cAdh27.set(Calendar.MONTH, 6);
		cAdh27.set(Calendar.DAY_OF_MONTH, 13);
		cAdh27.set(Calendar.HOUR_OF_DAY, 12);
		cAdh27.set(Calendar.MINUTE, 49);
		if (cAdh27.getTimeInMillis() > System.currentTimeMillis()) {
			av27 = (AlarmManager) getSystemService(ALARM_SERVICE);
			av27.set(AlarmManager.RTC_WAKEUP, cAdh27.getTimeInMillis(), pv27);
		}

		pv28 = PendingIntent.getBroadcast(this.getApplicationContext(), 2828,
				iii, 0);
		Calendar cAdh28 = Calendar.getInstance(); // 14 july
		cAdh28.set(Calendar.MONTH, 6);
		cAdh28.set(Calendar.DAY_OF_MONTH, 14);
		cAdh28.set(Calendar.HOUR_OF_DAY, 12);
		cAdh28.set(Calendar.MINUTE, 49);
		if (cAdh28.getTimeInMillis() > System.currentTimeMillis()) {
			av28 = (AlarmManager) getSystemService(ALARM_SERVICE);
			av28.set(AlarmManager.RTC_WAKEUP, cAdh28.getTimeInMillis(), pv28);
		}

		pv29 = PendingIntent.getBroadcast(this.getApplicationContext(), 2929,
				iii, 0);
		Calendar cAdh29 = Calendar.getInstance(); // 15 july
		cAdh29.set(Calendar.MONTH, 6);
		cAdh29.set(Calendar.DAY_OF_MONTH, 15);
		cAdh29.set(Calendar.HOUR_OF_DAY, 12);
		cAdh29.set(Calendar.MINUTE, 49);
		if (cAdh29.getTimeInMillis() > System.currentTimeMillis()) {
			av29 = (AlarmManager) getSystemService(ALARM_SERVICE);
			av29.set(AlarmManager.RTC_WAKEUP, cAdh29.getTimeInMillis(), pv29);
		}

		pv30 = PendingIntent.getBroadcast(this.getApplicationContext(), 3030,
				iii, 0);
		Calendar cAdh30 = Calendar.getInstance(); // 16 july
		cAdh30.set(Calendar.MONTH, 6);
		cAdh30.set(Calendar.DAY_OF_MONTH, 16);
		cAdh30.set(Calendar.HOUR_OF_DAY, 12);
		cAdh30.set(Calendar.MINUTE, 49);
		if (cAdh30.getTimeInMillis() > System.currentTimeMillis()) {
			av30 = (AlarmManager) getSystemService(ALARM_SERVICE);
			av30.set(AlarmManager.RTC_WAKEUP, cAdh30.getTimeInMillis(), pv30);
		}
	}

	public String[] initBack(int month, int day) { // Sunday 1 Monday 2 Tuesday 3 Wednesday 4
		// Thursday 5 Friday 6 Saturday
		String[] x = {};

		if (month == 5) {
			// t.setText("Ø§Ù„Ø§Ù…Ø³Ø§Ùƒ\nØ§Ù„Ù�Ø¬Ø±\nØ§Ù„Ø´Ø±ÙˆÙ‚\nØ§Ù„Ø¸Ù‡Ø±\nØ§Ù„Ø¹ØµØ±\nØ§Ù„Ù…ØºØ±Ø¨\nØ§Ù„Ø¹Ø´Ø§Ø¡");
			if (day == 17) {
				String[] mawakit = { "3:13", "3:33", "5:20", "12:43", "4:28",
						"19:57", "9:34" };
				return mawakit;
			} else if (day == 18) {
				String[] mawakit = { "3:12", "3:32", "5:19", "12:43", "4:28",
						"19:57", "9:34" };
				return mawakit;
			} else if (day == 19) {
				String[] mawakit = { "3:12", "3:32", "5:19", "12:43", "4:28",
						"19:57", "9:34" };
				return mawakit;
			} else if (day == 20) {
				String[] mawakit = { "3:12", "3:32", "5:19", "12:43", "4:28",
						"19:57", "9:34" };
				return mawakit;
			} else if (day == 21) {
				String[] mawakit = { "3:12", "3:32", "5:19", "12:43", "4:28",
						"19:58", "9:35" };
				return mawakit;
			} else if (day == 22) {
				String[] mawakit = { "3:12", "3:32", "5:19", "12:43", "4:28",
						"19:58", "9:35" };
				return mawakit;
			} else if (day == 23) {
				String[] mawakit = { "3:12", "3:32", "5:19", "12:43", "4:28",
						"19:58", "9:35" };
				return mawakit;
			} else if (day == 24) {
				String[] mawakit = { "3:13", "3:33", "5:20", "12:44", "4:29",
						"19:58", "9:36" };
				return mawakit;
			} else if (day == 25) {
				String[] mawakit = { "3:13", "3:33", "5:20", "12:44", "4:29",
						"19:58", "9:36" };
				return mawakit;
			} else if (day == 26) {
				String[] mawakit = { "3:14", "3:34", "5:21", "12:45", "4:30",
						"19:59", "9:36" };
				return mawakit;
			} else if (day == 27) {
				String[] mawakit = { "3:14", "3:34", "5:21", "12:45", "4:30",
						"19:59", "9:36" };
				return mawakit;
			} else if (day == 28) {
				String[] mawakit = { "3:15", "3:35", "5:21", "12:46", "4:30",
						"19:59", "9:36" };
				return mawakit;
			} else if (day == 29) {
				String[] mawakit = { "3:15", "3:35", "5:21", "12:46", "4:30",
						"19:59", "9:37" };
				return mawakit;
			} else if (day == 30) {
				String[] mawakit = { "3:16", "3:36", "5:22", "12:46", "4:30",
						"19:59", "9:37" };
				return mawakit;
			}
		} else if (month == 6) {
			//t.setText("Ø§Ù„Ø§Ù…Ø³Ø§Ùƒ\nØ§Ù„Ù�Ø¬Ø±\nØ§Ù„Ø´Ø±ÙˆÙ‚\nØ§Ù„Ø¸Ù‡Ø±\nØ§Ù„Ø¹ØµØ±\nØ§Ù„Ù…ØºØ±Ø¨\nØ§Ù„Ø¹Ø´Ø§Ø¡");
			if (day == 1) {
				String[] mawakit = { "3:17", "3:37", "5:23", "12:46", "4:31",
						"19:59", "9:36" };
				return mawakit;
			} else if (day == 2) {
				String[] mawakit = { "3:17", "3:37", "5:23", "12:46", "4:31",
						"19:59", "9:35" };
				return mawakit;
			} else if (day == 3) {
				String[] mawakit = { "3:18", "3:38", "5:24", "12:47", "4:31",
						"19:59", "9:35" };
				return mawakit;
			} else if (day == 4) {
				String[] mawakit = { "3:19", "3:39", "5:25", "12:47", "4:31",
						"19:59", "9:35" };
				return mawakit;
			} else if (day == 5) {
				String[] mawakit = { "3:20", "3:40", "5:25", "12:47", "4:32",
						"19:59", "9:35" };
				return mawakit;
			} else if (day == 6) {
				String[] mawakit = { "3:21", "3:41", "5:26", "12:47", "4:32",
						"19:59", "9:35" };
				return mawakit;
			} else if (day == 7) {
				String[] mawakit = { "3:22", "3:42", "5:27", "12:48", "4:33",
						"19:59", "9:35" };
				return mawakit;
			} else if (day == 8) {
				String[] mawakit = { "3:23", "3:43", "5:27", "12:48", "4:33",
						"19:59", "9:34" };
				return mawakit;
			} else if (day == 9) {
				String[] mawakit = { "3:24", "3:44", "5:28", "12:48", "4:33",
						"19:59", "9:34" };
				return mawakit;
			} else if (day == 10) {
				String[] mawakit = { "3:25", "3:45", "5:29", "12:49", "4:34",
						"19:59", "9:34" };
				return mawakit;
			} else if (day == 11) {
				String[] mawakit = { "3:25", "3:45", "5:29", "12:49", "4:34",
						"19:58", "9:33" };
				return mawakit;
			} else if (day == 12) {
				String[] mawakit = { "3:26", "3:46", "5:30", "12:49", "4:34",
						"19:58", "9:32" };
				return mawakit;
			} else if (day == 13) {
				String[] mawakit = { "3:26", "3:46", "5:30", "12:49", "4:34",
						"19:57", "9:31" };
				return mawakit;
			} else if (day == 14) {
				String[] mawakit = { "3:27", "3:47", "5:31", "12:49", "4:34",
						"19:57", "9:31" };
				return mawakit;
			} else if (day == 15) {
				String[] mawakit = { "3:28", "3:48", "5:32", "12:49", "4:34",
						"19:57", "9:31" };
				return mawakit;
			} else if (day == 16) {
				String[] mawakit = { "3:28", "3:48", "5:32", "12:49", "4:34",
						"19:56", "9:30" };
				return mawakit;
			}
		}
		return x;
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch (arg0.getId()) {
		case R.id.mtemp3:Calendar gc2 = Calendar.getInstance();
		int day2 = gc2.get(Calendar.DAY_OF_MONTH);
		int month2 = gc2.get(Calendar.MONTH);

		int dOf2 = gc2.get(Calendar.DAY_OF_WEEK);
		int dOr2 = Integer.parseInt(initRam(gc2.get(Calendar.MONTH),gc2.get(Calendar.DAY_OF_MONTH)));
		today.setText(dayO(dOf2,gc2.get(Calendar.MONTH),gc2.get(Calendar.DAY_OF_MONTH),dOr2));
		
		Mawakit = initBack(gc2.get(Calendar.MONTH),gc2.get(Calendar.DAY_OF_MONTH));
			if (Mawakit.length > 0) {
				emsak.setText(Mawakit[0]);
				fajer.setText(Mawakit[1]);
				shorook.setText(Mawakit[2]);
				Thohor.setText(Mawakit[3]);
				aser.setText(Mawakit[4]);
				maghreb.setText(Mawakit[5]);
				ishaa.setText(Mawakit[6]);
			}
			break;
		case R.id.mtemp4:
			Calendar gc = Calendar.getInstance();
			int day = gc.get(Calendar.DAY_OF_MONTH);
			int month = gc.get(Calendar.MONTH);
			gc.add(Calendar.DATE, 1);

			int dOf = gc.get(Calendar.DAY_OF_WEEK);
			int dOr = 0;
			try{
				dOr = Integer.parseInt(initRam(gc.get(Calendar.MONTH),gc.get(Calendar.DAY_OF_MONTH)));

				today.setText(dayO(dOf,gc.get(Calendar.MONTH),gc.get(Calendar.DAY_OF_MONTH),dOr));
				
				Mawakit = initBack(gc.get(Calendar.MONTH),gc.get(Calendar.DAY_OF_MONTH));
				if (Mawakit.length > 0) {
					emsak.setText(Mawakit[0]);
					fajer.setText(Mawakit[1]);
					shorook.setText(Mawakit[2]);
					Thohor.setText(Mawakit[3]);
					aser.setText(Mawakit[4]);
					maghreb.setText(Mawakit[5]);
					ishaa.setText(Mawakit[6]);
				}
			}catch(Exception e){
				e.printStackTrace();
				Toast.makeText(this, "Check the date", Toast.LENGTH_SHORT).show();
			}
			break;
		}
		/*
		 * switch (arg0.getId()) { case R.id.handl: Intent i = new
		 * Intent("com.example.ramadan.mad"); startActivity(i); break; case
		 * R.id.buttonSettings: Intent j = new
		 * Intent("com.example.ramadan.PREFERENCESCREEN"); startActivity(j);
		 * break; case R.id.BRules: try { Intent jj = new Intent(this,
		 * MainActivity2.class); startActivity(jj); } catch (Exception e) {
		 * e.printStackTrace(); } break; case R.id.BShare:
		 * 
		 * break; case R.id.BTreasures: Intent kun = new
		 * Intent("com.example.ramadan.Kunuz"); startActivity(kun); break; case
		 * R.id.BCalendar: SharedPreferences getPrefs = PreferenceManager
		 * .getDefaultSharedPreferences(getBaseContext()); String coin =
		 * getPrefs.getString("list", "2"); if (coin.equals("1")) { Intent s =
		 * new Intent("com.example.ramadan.linear"); startActivity(s); } else if
		 * (coin.equals("2")) { Intent dd = new
		 * Intent("com.example.ramadan.grid"); startActivity(dd); } break; }
		 */
	}

	class CustomPagerAdapter extends PagerAdapter {

		Context mContext;
		LayoutInflater mLayoutInflater;

		public CustomPagerAdapter(Context context) {
			mContext = context;
			mLayoutInflater = (LayoutInflater) mContext
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		}

		@Override
		public int getCount() {
			return mResources.length;
		}

		@Override
		public boolean isViewFromObject(View view, Object object) {
			return view == ((LinearLayout) object);
		}

		@Override
		public Object instantiateItem(ViewGroup container, int position) {
			View itemView = mLayoutInflater.inflate(R.layout.pager_item,
					container, false);

			ImageView imageView = (ImageView) itemView
					.findViewById(R.id.imageView);
			imageView.setImageResource(mResources[position]);

			container.addView(itemView);

			return itemView;
		}

		@Override
		public void destroyItem(ViewGroup container, int position, Object object) {
			container.removeView((LinearLayout) object);
		}
	}
/*
	@Override
	public boolean onDrag(View arg0, DragEvent arg1) {
		// TODO Auto-generated method stub

		return false;
	}
*/
	@Override
	public void onPageScrollStateChanged(int arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onPageScrolled(int arg0, float arg1, int arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onPageSelected(int arg0) {
		// TODO Auto-generated method stub
		String tex = "";
		// position = mViewPager.getCurrentItem();
		if (Mawakit.length > 0) {
			if (position == 0) {
				tex = "الفجر             " + Mawakit[0];
			} else if (position == 1) {
				tex = "الشروق            " + Mawakit[1];
			} else if (position == 2) {
				tex = "الظهر             " + Mawakit[2];
			} else if (position == 3) {
				tex = "العصر             " + Mawakit[3];
			} else if (position == 4) {
				tex = "المغرب             " + Mawakit[4];
			} else if (position == 5) {
				tex = "العشاء             " + Mawakit[5];
			}
			t.setText(tex);
		}
	}

	public String dayO(int day, int Mon,int Month, int ram) {
		String da= "";
		String Mont = "";
		String Ra = ram + " رمضان";
		switch (day) {
		case 1:
			da = "Sunday 2015 الاحد";
			break;
		case 2:
			da = "Monday 2015 الاثنين";
			break;
		case 3:
			da = "Tuesday 2015 الثلاثاء";
			break;
		case 4:
			da = "Wednesday 2015 الاربعاء";
			break;
		case 5:
			da = "Thursday 2015 الخميس";
			break;
		case 6:
			da = "Friday 2015 الجمعة";
			break;
		case 7:
			da = "Saturday 2015 السبت";
			break;
		}
		switch(Mon)
		{
		case 5:
			Mont = Month + " June حزيران";
			break;
		case 6:
			Mont = Month + " July تموز";
			break;
		}
		return da + "\n" + Mont + "\n" + Ra;
	}

	public String initRam(int month, int day) { // Sunday 1 Monday 2 Tuesday 3 Wednesday 4
		// Thursday 5 Friday 6 Saturday
		String x = "";

		if (month == 5) {
			// t.setText("Ø§Ù„Ø§Ù…Ø³Ø§Ùƒ\nØ§Ù„Ù�Ø¬Ø±\nØ§Ù„Ø´Ø±ÙˆÙ‚\nØ§Ù„Ø¸Ù‡Ø±\nØ§Ù„Ø¹ØµØ±\nØ§Ù„Ù…ØºØ±Ø¨\nØ§Ù„Ø¹Ø´Ø§Ø¡");
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
			//t.setText("Ø§Ù„Ø§Ù…Ø³Ø§Ùƒ\nØ§Ù„Ù�Ø¬Ø±\nØ§Ù„Ø´Ø±ÙˆÙ‚\nØ§Ù„Ø¸Ù‡Ø±\nØ§Ù„Ø¹ØµØ±\nØ§Ù„Ù…ØºØ±Ø¨\nØ§Ù„Ø¹Ø´Ø§Ø¡");
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
