package com.example.ramadan;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.widget.CheckBox;

public class PreferenceScr extends PreferenceActivity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.preferencescreen);		
	}
}
