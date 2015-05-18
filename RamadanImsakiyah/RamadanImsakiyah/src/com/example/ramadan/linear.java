package com.example.ramadan;

import java.util.Calendar;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;

public class linear extends Activity implements OnClickListener {

	int day = 0, month = 0;
	Button s, info, mus, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12,
			b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25,
			b26, b27, b28, b29, b30;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);

		setContentView(R.layout.linear);

		Calendar calendar = Calendar.getInstance();
		day = calendar.get(Calendar.DAY_OF_MONTH);
		month = calendar.get(Calendar.MONTH);

		Init();
		initBack();
	}

	public void initBack() {
		// Sunday 1 Monday 2 Tuesday 3 Wednesday 4 Thursday 5 Friday 6 Saturday
		// 7
		if (month == 5) {
			if (day == 17) {
				b1.setBackgroundResource(R.drawable.bad);
			}
			if (day == 18) {
				b1.setBackgroundResource(R.drawable.bad);
				b2.setBackgroundResource(R.drawable.bad2);
			} else if (day == 19) {
				b1.setBackgroundResource(R.drawable.bad);
				b2.setBackgroundResource(R.drawable.bad2);
				b3.setBackgroundResource(R.drawable.bad3);

			} else if (day == 20) {
				b1.setBackgroundResource(R.drawable.bad);
				b2.setBackgroundResource(R.drawable.bad2);
				b3.setBackgroundResource(R.drawable.bad3);
				b4.setBackgroundResource(R.drawable.bad4);
			} else if (day == 21) {
				b1.setBackgroundResource(R.drawable.bad);
				b2.setBackgroundResource(R.drawable.bad2);
				b3.setBackgroundResource(R.drawable.bad3);
				b4.setBackgroundResource(R.drawable.bad4);
				b5.setBackgroundResource(R.drawable.bad5);// ////till heres
			} else if (day == 22) {
				b1.setBackgroundResource(R.drawable.bad);
				b2.setBackgroundResource(R.drawable.bad2);
				b3.setBackgroundResource(R.drawable.bad3);
				b4.setBackgroundResource(R.drawable.bad4);
				b5.setBackgroundResource(R.drawable.bad5);
				b6.setBackgroundResource(R.drawable.bad6);
			} else if (day == 23) {
				b1.setBackgroundResource(R.drawable.bad);
				b2.setBackgroundResource(R.drawable.bad2);
				b3.setBackgroundResource(R.drawable.bad3);
				b4.setBackgroundResource(R.drawable.bad4);
				b5.setBackgroundResource(R.drawable.bad5);
				b6.setBackgroundResource(R.drawable.bad6);
				b7.setBackgroundResource(R.drawable.bad7);
			} else if (day == 24) {
				b1.setBackgroundResource(R.drawable.bad);
				b2.setBackgroundResource(R.drawable.bad2);
				b3.setBackgroundResource(R.drawable.bad3);
				b4.setBackgroundResource(R.drawable.bad4);
				b5.setBackgroundResource(R.drawable.bad5);
				b6.setBackgroundResource(R.drawable.bad6);
				b7.setBackgroundResource(R.drawable.bad7);
				b8.setBackgroundResource(R.drawable.bad8);
			} else if (day == 25) {
				b1.setBackgroundResource(R.drawable.bad);
				b2.setBackgroundResource(R.drawable.bad2);
				b3.setBackgroundResource(R.drawable.bad3);
				b4.setBackgroundResource(R.drawable.bad4);
				b5.setBackgroundResource(R.drawable.bad5);
				b6.setBackgroundResource(R.drawable.bad6);
				b7.setBackgroundResource(R.drawable.bad7);
				b8.setBackgroundResource(R.drawable.bad8);
				b9.setBackgroundResource(R.drawable.bad9);
			} else if (day == 26) {
				b1.setBackgroundResource(R.drawable.bad);
				b2.setBackgroundResource(R.drawable.bad2);
				b3.setBackgroundResource(R.drawable.bad3);
				b4.setBackgroundResource(R.drawable.bad4);
				b5.setBackgroundResource(R.drawable.bad5);
				b6.setBackgroundResource(R.drawable.bad6);
				b7.setBackgroundResource(R.drawable.bad7);
				b8.setBackgroundResource(R.drawable.bad8);
				b9.setBackgroundResource(R.drawable.bad9);
				b10.setBackgroundResource(R.drawable.bad10);
			} else if (day == 27) {
				b1.setBackgroundResource(R.drawable.bad);
				b2.setBackgroundResource(R.drawable.bad2);
				b3.setBackgroundResource(R.drawable.bad3);
				b4.setBackgroundResource(R.drawable.bad4);
				b5.setBackgroundResource(R.drawable.bad5);
				b6.setBackgroundResource(R.drawable.bad6);
				b7.setBackgroundResource(R.drawable.bad7);
				b8.setBackgroundResource(R.drawable.bad8);
				b9.setBackgroundResource(R.drawable.bad9);
				b10.setBackgroundResource(R.drawable.bad10);
				b11.setBackgroundResource(R.drawable.bad11);
			} else if (day == 28) {
				b1.setBackgroundResource(R.drawable.bad);
				b2.setBackgroundResource(R.drawable.bad2);
				b3.setBackgroundResource(R.drawable.bad3);
				b4.setBackgroundResource(R.drawable.bad4);
				b5.setBackgroundResource(R.drawable.bad5);
				b6.setBackgroundResource(R.drawable.bad6);
				b7.setBackgroundResource(R.drawable.bad7);
				b8.setBackgroundResource(R.drawable.bad8);
				b9.setBackgroundResource(R.drawable.bad9);
				b10.setBackgroundResource(R.drawable.bad10);
				b11.setBackgroundResource(R.drawable.bad11);
				b12.setBackgroundResource(R.drawable.bad12);
			} else if (day == 29) {
				b1.setBackgroundResource(R.drawable.bad);
				b2.setBackgroundResource(R.drawable.bad2);
				b3.setBackgroundResource(R.drawable.bad3);
				b4.setBackgroundResource(R.drawable.bad4);
				b5.setBackgroundResource(R.drawable.bad5);
				b6.setBackgroundResource(R.drawable.bad6);
				b7.setBackgroundResource(R.drawable.bad7);
				b8.setBackgroundResource(R.drawable.bad8);
				b9.setBackgroundResource(R.drawable.bad9);
				b10.setBackgroundResource(R.drawable.bad10);
				b11.setBackgroundResource(R.drawable.bad11);
				b12.setBackgroundResource(R.drawable.bad12);
				b13.setBackgroundResource(R.drawable.bad13);
			} else if (day == 30) {
				b1.setBackgroundResource(R.drawable.bad);
				b2.setBackgroundResource(R.drawable.bad2);
				b3.setBackgroundResource(R.drawable.bad3);
				b4.setBackgroundResource(R.drawable.bad4);
				b5.setBackgroundResource(R.drawable.bad5);
				b6.setBackgroundResource(R.drawable.bad6);
				b7.setBackgroundResource(R.drawable.bad7);
				b8.setBackgroundResource(R.drawable.bad8);
				b9.setBackgroundResource(R.drawable.bad9);
				b10.setBackgroundResource(R.drawable.bad10);
				b11.setBackgroundResource(R.drawable.bad11);
				b12.setBackgroundResource(R.drawable.bad12);
				b13.setBackgroundResource(R.drawable.bad13);
				b14.setBackgroundResource(R.drawable.bad14);
			}
		} else if (month == 6) {
			if (day == 1) {
				b1.setBackgroundResource(R.drawable.bad);
				b2.setBackgroundResource(R.drawable.bad2);
				b3.setBackgroundResource(R.drawable.bad3);
				b4.setBackgroundResource(R.drawable.bad4);
				b5.setBackgroundResource(R.drawable.bad5);
				b6.setBackgroundResource(R.drawable.bad6);
				b7.setBackgroundResource(R.drawable.bad7);
				b8.setBackgroundResource(R.drawable.bad8);
				b9.setBackgroundResource(R.drawable.bad9);
				b10.setBackgroundResource(R.drawable.bad10);
				b11.setBackgroundResource(R.drawable.bad11);
				b12.setBackgroundResource(R.drawable.bad12);
				b13.setBackgroundResource(R.drawable.bad13);
				b14.setBackgroundResource(R.drawable.bad14);
				b15.setBackgroundResource(R.drawable.bad15);
			} else if (day == 2) {
				b1.setBackgroundResource(R.drawable.bad);
				b2.setBackgroundResource(R.drawable.bad2);
				b3.setBackgroundResource(R.drawable.bad3);
				b4.setBackgroundResource(R.drawable.bad4);
				b5.setBackgroundResource(R.drawable.bad5);
				b6.setBackgroundResource(R.drawable.bad6);
				b7.setBackgroundResource(R.drawable.bad7);
				b8.setBackgroundResource(R.drawable.bad8);
				b9.setBackgroundResource(R.drawable.bad9);
				b10.setBackgroundResource(R.drawable.bad10);
				b11.setBackgroundResource(R.drawable.bad11);
				b12.setBackgroundResource(R.drawable.bad12);
				b13.setBackgroundResource(R.drawable.bad13);
				b14.setBackgroundResource(R.drawable.bad14);
				b15.setBackgroundResource(R.drawable.bad15);
				b16.setBackgroundResource(R.drawable.bad16);
			} else if (day == 3) {
				b1.setBackgroundResource(R.drawable.bad);
				b2.setBackgroundResource(R.drawable.bad2);
				b3.setBackgroundResource(R.drawable.bad3);
				b4.setBackgroundResource(R.drawable.bad4);
				b5.setBackgroundResource(R.drawable.bad5);
				b6.setBackgroundResource(R.drawable.bad6);
				b7.setBackgroundResource(R.drawable.bad7);
				b8.setBackgroundResource(R.drawable.bad8);
				b9.setBackgroundResource(R.drawable.bad9);
				b10.setBackgroundResource(R.drawable.bad10);
				b11.setBackgroundResource(R.drawable.bad11);
				b12.setBackgroundResource(R.drawable.bad12);
				b13.setBackgroundResource(R.drawable.bad13);
				b14.setBackgroundResource(R.drawable.bad14);
				b15.setBackgroundResource(R.drawable.bad15);
				b16.setBackgroundResource(R.drawable.bad16);
				b17.setBackgroundResource(R.drawable.bad17);
			} else if (day == 4) {
				b1.setBackgroundResource(R.drawable.bad);
				b2.setBackgroundResource(R.drawable.bad2);
				b3.setBackgroundResource(R.drawable.bad3);
				b4.setBackgroundResource(R.drawable.bad4);
				b5.setBackgroundResource(R.drawable.bad5);
				b6.setBackgroundResource(R.drawable.bad6);
				b7.setBackgroundResource(R.drawable.bad7);
				b8.setBackgroundResource(R.drawable.bad8);
				b9.setBackgroundResource(R.drawable.bad9);
				b10.setBackgroundResource(R.drawable.bad10);
				b11.setBackgroundResource(R.drawable.bad11);
				b12.setBackgroundResource(R.drawable.bad12);
				b13.setBackgroundResource(R.drawable.bad13);
				b14.setBackgroundResource(R.drawable.bad14);
				b15.setBackgroundResource(R.drawable.bad15);
				b16.setBackgroundResource(R.drawable.bad16);
				b17.setBackgroundResource(R.drawable.bad17);
				b18.setBackgroundResource(R.drawable.bad18);
			} else if (day == 5) {
				b1.setBackgroundResource(R.drawable.bad);
				b2.setBackgroundResource(R.drawable.bad2);
				b3.setBackgroundResource(R.drawable.bad3);
				b4.setBackgroundResource(R.drawable.bad4);
				b5.setBackgroundResource(R.drawable.bad5);
				b6.setBackgroundResource(R.drawable.bad6);
				b7.setBackgroundResource(R.drawable.bad7);
				b8.setBackgroundResource(R.drawable.bad8);
				b9.setBackgroundResource(R.drawable.bad9);
				b10.setBackgroundResource(R.drawable.bad10);
				b11.setBackgroundResource(R.drawable.bad11);
				b12.setBackgroundResource(R.drawable.bad12);
				b13.setBackgroundResource(R.drawable.bad13);
				b14.setBackgroundResource(R.drawable.bad14);
				b15.setBackgroundResource(R.drawable.bad15);
				b16.setBackgroundResource(R.drawable.bad16);
				b17.setBackgroundResource(R.drawable.bad17);
				b18.setBackgroundResource(R.drawable.bad18);
				b19.setBackgroundResource(R.drawable.bad19);
			} else if (day == 6) {
				b1.setBackgroundResource(R.drawable.bad);
				b2.setBackgroundResource(R.drawable.bad2);
				b3.setBackgroundResource(R.drawable.bad3);
				b4.setBackgroundResource(R.drawable.bad4);
				b5.setBackgroundResource(R.drawable.bad5);
				b6.setBackgroundResource(R.drawable.bad6);
				b7.setBackgroundResource(R.drawable.bad7);
				b8.setBackgroundResource(R.drawable.bad8);
				b9.setBackgroundResource(R.drawable.bad9);
				b10.setBackgroundResource(R.drawable.bad10);
				b11.setBackgroundResource(R.drawable.bad11);
				b12.setBackgroundResource(R.drawable.bad12);
				b13.setBackgroundResource(R.drawable.bad13);
				b14.setBackgroundResource(R.drawable.bad14);
				b15.setBackgroundResource(R.drawable.bad15);
				b16.setBackgroundResource(R.drawable.bad16);
				b17.setBackgroundResource(R.drawable.bad17);
				b18.setBackgroundResource(R.drawable.bad18);
				b19.setBackgroundResource(R.drawable.bad19);
				b20.setBackgroundResource(R.drawable.bad20);
			} else if (day == 7) {
				b1.setBackgroundResource(R.drawable.bad);
				b2.setBackgroundResource(R.drawable.bad2);
				b3.setBackgroundResource(R.drawable.bad3);
				b4.setBackgroundResource(R.drawable.bad4);
				b5.setBackgroundResource(R.drawable.bad5);
				b6.setBackgroundResource(R.drawable.bad6);
				b7.setBackgroundResource(R.drawable.bad7);
				b8.setBackgroundResource(R.drawable.bad8);
				b9.setBackgroundResource(R.drawable.bad9);
				b10.setBackgroundResource(R.drawable.bad10);
				b11.setBackgroundResource(R.drawable.bad11);
				b12.setBackgroundResource(R.drawable.bad12);
				b13.setBackgroundResource(R.drawable.bad13);
				b14.setBackgroundResource(R.drawable.bad14);
				b15.setBackgroundResource(R.drawable.bad15);
				b16.setBackgroundResource(R.drawable.bad16);
				b17.setBackgroundResource(R.drawable.bad17);
				b18.setBackgroundResource(R.drawable.bad18);
				b19.setBackgroundResource(R.drawable.bad19);
				b20.setBackgroundResource(R.drawable.bad20);
				b21.setBackgroundResource(R.drawable.bad21);
			} else if (day == 8) {
				b1.setBackgroundResource(R.drawable.bad);
				b2.setBackgroundResource(R.drawable.bad2);
				b3.setBackgroundResource(R.drawable.bad3);
				b4.setBackgroundResource(R.drawable.bad4);
				b5.setBackgroundResource(R.drawable.bad5);
				b6.setBackgroundResource(R.drawable.bad6);
				b7.setBackgroundResource(R.drawable.bad7);
				b8.setBackgroundResource(R.drawable.bad8);
				b9.setBackgroundResource(R.drawable.bad9);
				b10.setBackgroundResource(R.drawable.bad10);
				b11.setBackgroundResource(R.drawable.bad11);
				b12.setBackgroundResource(R.drawable.bad12);
				b13.setBackgroundResource(R.drawable.bad13);
				b14.setBackgroundResource(R.drawable.bad14);
				b15.setBackgroundResource(R.drawable.bad15);
				b16.setBackgroundResource(R.drawable.bad16);
				b17.setBackgroundResource(R.drawable.bad17);
				b18.setBackgroundResource(R.drawable.bad18);
				b19.setBackgroundResource(R.drawable.bad19);
				b20.setBackgroundResource(R.drawable.bad20);
				b21.setBackgroundResource(R.drawable.bad21);
				b22.setBackgroundResource(R.drawable.bad22);
			} else if (day == 9) {
				b1.setBackgroundResource(R.drawable.bad);
				b2.setBackgroundResource(R.drawable.bad2);
				b3.setBackgroundResource(R.drawable.bad3);
				b4.setBackgroundResource(R.drawable.bad4);
				b5.setBackgroundResource(R.drawable.bad5);
				b6.setBackgroundResource(R.drawable.bad6);
				b7.setBackgroundResource(R.drawable.bad7);
				b8.setBackgroundResource(R.drawable.bad8);
				b9.setBackgroundResource(R.drawable.bad9);
				b10.setBackgroundResource(R.drawable.bad10);
				b11.setBackgroundResource(R.drawable.bad11);
				b12.setBackgroundResource(R.drawable.bad12);
				b13.setBackgroundResource(R.drawable.bad13);
				b14.setBackgroundResource(R.drawable.bad14);
				b15.setBackgroundResource(R.drawable.bad15);
				b16.setBackgroundResource(R.drawable.bad16);
				b17.setBackgroundResource(R.drawable.bad17);
				b18.setBackgroundResource(R.drawable.bad18);
				b19.setBackgroundResource(R.drawable.bad19);
				b20.setBackgroundResource(R.drawable.bad20);
				b21.setBackgroundResource(R.drawable.bad21);
				b22.setBackgroundResource(R.drawable.bad22);
				b23.setBackgroundResource(R.drawable.bad23);
			} else if (day == 10) {
				b1.setBackgroundResource(R.drawable.bad);
				b2.setBackgroundResource(R.drawable.bad2);
				b3.setBackgroundResource(R.drawable.bad3);
				b4.setBackgroundResource(R.drawable.bad4);
				b5.setBackgroundResource(R.drawable.bad5);
				b6.setBackgroundResource(R.drawable.bad6);
				b7.setBackgroundResource(R.drawable.bad7);
				b8.setBackgroundResource(R.drawable.bad8);
				b9.setBackgroundResource(R.drawable.bad9);
				b10.setBackgroundResource(R.drawable.bad10);
				b11.setBackgroundResource(R.drawable.bad11);
				b12.setBackgroundResource(R.drawable.bad12);
				b13.setBackgroundResource(R.drawable.bad13);
				b14.setBackgroundResource(R.drawable.bad14);
				b15.setBackgroundResource(R.drawable.bad15);
				b16.setBackgroundResource(R.drawable.bad16);
				b17.setBackgroundResource(R.drawable.bad17);
				b18.setBackgroundResource(R.drawable.bad18);
				b19.setBackgroundResource(R.drawable.bad19);
				b20.setBackgroundResource(R.drawable.bad20);
				b21.setBackgroundResource(R.drawable.bad21);
				b22.setBackgroundResource(R.drawable.bad22);
				b23.setBackgroundResource(R.drawable.bad23);
				b24.setBackgroundResource(R.drawable.bad24);
			} else if (day == 11) {
				b1.setBackgroundResource(R.drawable.bad);
				b2.setBackgroundResource(R.drawable.bad2);
				b3.setBackgroundResource(R.drawable.bad3);
				b4.setBackgroundResource(R.drawable.bad4);
				b5.setBackgroundResource(R.drawable.bad5);
				b6.setBackgroundResource(R.drawable.bad6);
				b7.setBackgroundResource(R.drawable.bad7);
				b8.setBackgroundResource(R.drawable.bad8);
				b9.setBackgroundResource(R.drawable.bad9);
				b10.setBackgroundResource(R.drawable.bad10);
				b11.setBackgroundResource(R.drawable.bad11);
				b12.setBackgroundResource(R.drawable.bad12);
				b13.setBackgroundResource(R.drawable.bad13);
				b14.setBackgroundResource(R.drawable.bad14);
				b15.setBackgroundResource(R.drawable.bad15);
				b16.setBackgroundResource(R.drawable.bad16);
				b17.setBackgroundResource(R.drawable.bad17);
				b18.setBackgroundResource(R.drawable.bad18);
				b19.setBackgroundResource(R.drawable.bad19);
				b20.setBackgroundResource(R.drawable.bad20);
				b21.setBackgroundResource(R.drawable.bad21);
				b22.setBackgroundResource(R.drawable.bad22);
				b23.setBackgroundResource(R.drawable.bad23);
				b24.setBackgroundResource(R.drawable.bad24);
				b25.setBackgroundResource(R.drawable.bad25);
			} else if (day == 12) {
				b1.setBackgroundResource(R.drawable.bad);
				b2.setBackgroundResource(R.drawable.bad2);
				b3.setBackgroundResource(R.drawable.bad3);
				b4.setBackgroundResource(R.drawable.bad4);
				b5.setBackgroundResource(R.drawable.bad5);
				b6.setBackgroundResource(R.drawable.bad6);
				b7.setBackgroundResource(R.drawable.bad7);
				b8.setBackgroundResource(R.drawable.bad8);
				b9.setBackgroundResource(R.drawable.bad9);
				b10.setBackgroundResource(R.drawable.bad10);
				b11.setBackgroundResource(R.drawable.bad11);
				b12.setBackgroundResource(R.drawable.bad12);
				b13.setBackgroundResource(R.drawable.bad13);
				b14.setBackgroundResource(R.drawable.bad14);
				b15.setBackgroundResource(R.drawable.bad15);
				b16.setBackgroundResource(R.drawable.bad16);
				b17.setBackgroundResource(R.drawable.bad17);
				b18.setBackgroundResource(R.drawable.bad18);
				b19.setBackgroundResource(R.drawable.bad19);
				b20.setBackgroundResource(R.drawable.bad20);
				b21.setBackgroundResource(R.drawable.bad21);
				b22.setBackgroundResource(R.drawable.bad22);
				b23.setBackgroundResource(R.drawable.bad23);
				b24.setBackgroundResource(R.drawable.bad24);
				b25.setBackgroundResource(R.drawable.bad25);
				b26.setBackgroundResource(R.drawable.bad26);
			} else if (day == 13) {
				b1.setBackgroundResource(R.drawable.bad);
				b2.setBackgroundResource(R.drawable.bad2);
				b3.setBackgroundResource(R.drawable.bad3);
				b4.setBackgroundResource(R.drawable.bad4);
				b5.setBackgroundResource(R.drawable.bad5);
				b6.setBackgroundResource(R.drawable.bad6);
				b7.setBackgroundResource(R.drawable.bad7);
				b8.setBackgroundResource(R.drawable.bad8);
				b9.setBackgroundResource(R.drawable.bad9);
				b10.setBackgroundResource(R.drawable.bad10);
				b11.setBackgroundResource(R.drawable.bad11);
				b12.setBackgroundResource(R.drawable.bad12);
				b13.setBackgroundResource(R.drawable.bad13);
				b14.setBackgroundResource(R.drawable.bad14);
				b15.setBackgroundResource(R.drawable.bad15);
				b16.setBackgroundResource(R.drawable.bad16);
				b17.setBackgroundResource(R.drawable.bad17);
				b18.setBackgroundResource(R.drawable.bad18);
				b19.setBackgroundResource(R.drawable.bad19);
				b20.setBackgroundResource(R.drawable.bad20);
				b21.setBackgroundResource(R.drawable.bad21);
				b22.setBackgroundResource(R.drawable.bad22);
				b23.setBackgroundResource(R.drawable.bad23);
				b24.setBackgroundResource(R.drawable.bad24);
				b25.setBackgroundResource(R.drawable.bad25);
				b26.setBackgroundResource(R.drawable.bad26);
				b27.setBackgroundResource(R.drawable.bad27);
			} else if (day == 14) {
				b1.setBackgroundResource(R.drawable.bad);
				b2.setBackgroundResource(R.drawable.bad2);
				b3.setBackgroundResource(R.drawable.bad3);
				b4.setBackgroundResource(R.drawable.bad4);
				b5.setBackgroundResource(R.drawable.bad5);
				b6.setBackgroundResource(R.drawable.bad6);
				b7.setBackgroundResource(R.drawable.bad7);
				b8.setBackgroundResource(R.drawable.bad8);
				b9.setBackgroundResource(R.drawable.bad9);
				b10.setBackgroundResource(R.drawable.bad10);
				b11.setBackgroundResource(R.drawable.bad11);
				b12.setBackgroundResource(R.drawable.bad12);
				b13.setBackgroundResource(R.drawable.bad13);
				b14.setBackgroundResource(R.drawable.bad14);
				b15.setBackgroundResource(R.drawable.bad15);
				b16.setBackgroundResource(R.drawable.bad16);
				b17.setBackgroundResource(R.drawable.bad17);
				b18.setBackgroundResource(R.drawable.bad18);
				b19.setBackgroundResource(R.drawable.bad19);
				b20.setBackgroundResource(R.drawable.bad20);
				b21.setBackgroundResource(R.drawable.bad21);
				b22.setBackgroundResource(R.drawable.bad22);
				b23.setBackgroundResource(R.drawable.bad23);
				b24.setBackgroundResource(R.drawable.bad24);
				b25.setBackgroundResource(R.drawable.bad25);
				b26.setBackgroundResource(R.drawable.bad26);
				b27.setBackgroundResource(R.drawable.bad27);
				b28.setBackgroundResource(R.drawable.bad28);
			} else if (day == 15) {
				b1.setBackgroundResource(R.drawable.bad);
				b2.setBackgroundResource(R.drawable.bad2);
				b3.setBackgroundResource(R.drawable.bad3);
				b4.setBackgroundResource(R.drawable.bad4);
				b5.setBackgroundResource(R.drawable.bad5);
				b6.setBackgroundResource(R.drawable.bad6);
				b7.setBackgroundResource(R.drawable.bad7);
				b8.setBackgroundResource(R.drawable.bad8);
				b9.setBackgroundResource(R.drawable.bad9);
				b10.setBackgroundResource(R.drawable.bad10);
				b11.setBackgroundResource(R.drawable.bad11);
				b12.setBackgroundResource(R.drawable.bad12);
				b13.setBackgroundResource(R.drawable.bad13);
				b14.setBackgroundResource(R.drawable.bad14);
				b15.setBackgroundResource(R.drawable.bad15);
				b16.setBackgroundResource(R.drawable.bad16);
				b17.setBackgroundResource(R.drawable.bad17);
				b18.setBackgroundResource(R.drawable.bad18);
				b19.setBackgroundResource(R.drawable.bad19);
				b20.setBackgroundResource(R.drawable.bad20);
				b21.setBackgroundResource(R.drawable.bad21);
				b22.setBackgroundResource(R.drawable.bad22);
				b23.setBackgroundResource(R.drawable.bad23);
				b24.setBackgroundResource(R.drawable.bad24);
				b25.setBackgroundResource(R.drawable.bad25);
				b26.setBackgroundResource(R.drawable.bad26);
				b27.setBackgroundResource(R.drawable.bad27);
				b28.setBackgroundResource(R.drawable.bad28);
				b29.setBackgroundResource(R.drawable.bad29);
			} else if (day == 16) {
				b1.setBackgroundResource(R.drawable.bad);
				b2.setBackgroundResource(R.drawable.bad2);
				b3.setBackgroundResource(R.drawable.bad3);
				b4.setBackgroundResource(R.drawable.bad4);
				b5.setBackgroundResource(R.drawable.bad5);
				b6.setBackgroundResource(R.drawable.bad6);
				b7.setBackgroundResource(R.drawable.bad7);
				b8.setBackgroundResource(R.drawable.bad8);
				b9.setBackgroundResource(R.drawable.bad9);
				b10.setBackgroundResource(R.drawable.bad10);
				b11.setBackgroundResource(R.drawable.bad11);
				b12.setBackgroundResource(R.drawable.bad12);
				b13.setBackgroundResource(R.drawable.bad13);
				b14.setBackgroundResource(R.drawable.bad14);
				b15.setBackgroundResource(R.drawable.bad15);
				b16.setBackgroundResource(R.drawable.bad16);
				b17.setBackgroundResource(R.drawable.bad17);
				b18.setBackgroundResource(R.drawable.bad18);
				b19.setBackgroundResource(R.drawable.bad19);
				b20.setBackgroundResource(R.drawable.bad20);
				b21.setBackgroundResource(R.drawable.bad21);
				b22.setBackgroundResource(R.drawable.bad22);
				b23.setBackgroundResource(R.drawable.bad23);
				b24.setBackgroundResource(R.drawable.bad24);
				b25.setBackgroundResource(R.drawable.bad25);
				b26.setBackgroundResource(R.drawable.bad26);
				b27.setBackgroundResource(R.drawable.bad27);
				b28.setBackgroundResource(R.drawable.bad28);
				b29.setBackgroundResource(R.drawable.bad29);
				b30.setBackgroundResource(R.drawable.bad30);
			}
		}
	}

	public void Init() {

		b1 = (Button) findViewById(R.id.button1);
		// b1.setText("Sun\n29");
		b2 = (Button) findViewById(R.id.button2);
		// b2.setText("Mon\n30");
		b3 = (Button) findViewById(R.id.button3);
		// b3.setText("Tues\n01");
		b4 = (Button) findViewById(R.id.button4);
		// b4.setText("Wed\n02");
		b5 = (Button) findViewById(R.id.button5);
		// b5.setText("Thurs\n03");
		b6 = (Button) findViewById(R.id.button6);
		// b6.setText("Fri\n04");
		b7 = (Button) findViewById(R.id.button7);
		// b7.setText("Sat\n05");
		b8 = (Button) findViewById(R.id.button8);
		// b8.setText("Sun\n06");
		b9 = (Button) findViewById(R.id.button9);
		// b9.setText("Mon\n07");
		b10 = (Button) findViewById(R.id.button10);
		// b10.setText("tues\n08");
		b11 = (Button) findViewById(R.id.button11);
		// b11.setText("Wed\n09");
		b12 = (Button) findViewById(R.id.button12);
		// b12.setText("Thurs\n10");
		b13 = (Button) findViewById(R.id.button13);
		// b13.setText("Fri\n11");
		b14 = (Button) findViewById(R.id.button14);
		// b14.setText("Sat\n12");
		b15 = (Button) findViewById(R.id.button15);
		// b15.setText("Sun\n13");
		b16 = (Button) findViewById(R.id.button16);
		// b16.setText("Mon\n14");
		b17 = (Button) findViewById(R.id.button17);
		// b17.setText("Tues\n15");
		b18 = (Button) findViewById(R.id.button18);
		// b18.setText("Wed\n16");
		b19 = (Button) findViewById(R.id.button19);
		// b19.setText("Thurs\n17");
		b20 = (Button) findViewById(R.id.button20);
		// b20.setText("Fri\n18");
		b21 = (Button) findViewById(R.id.button21);
		// b21.setText("Sat\n19");
		b22 = (Button) findViewById(R.id.button22);
		// b22.setText("Sun\n20");
		b23 = (Button) findViewById(R.id.button23);
		// b23.setText("Mon\n21");
		b24 = (Button) findViewById(R.id.button24);
		// b24.setText("Tues\n22");
		b25 = (Button) findViewById(R.id.button25);
		// b25.setText("Wed\n23");
		b26 = (Button) findViewById(R.id.button26);
		// b26.setText("Thurs\n24");
		b27 = (Button) findViewById(R.id.button27);
		// b27.setText("Fri\n25");
		b28 = (Button) findViewById(R.id.button28);
		// b28.setText("Sat\n26");
		b29 = (Button) findViewById(R.id.button29);
		// b29.setText("Sun\n27");
		b30 = (Button) findViewById(R.id.button30);
		// b30.setText("Mon\n28");

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

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		// return super.onOptionsItemSelected(item);
		return false;
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		SharedPreferences getPrefs = PreferenceManager
				.getDefaultSharedPreferences(getBaseContext());
		String coin = getPrefs.getString("list", "1");
		if (coin.equals("2")) {
			Intent i = new Intent("com.example.ramadan.grid");
			finish();
			startActivity(i);
		}
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
