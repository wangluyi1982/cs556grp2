package com.example.Professor;
import android.os.Bundle;
import android.preference.PreferenceActivity;
public class Addnode extends PreferenceActivity{
	  @Override
	    public void onCreate(Bundle savedInstanceState) {
		  super.onCreate(savedInstanceState);
		  addPreferencesFromResource(R.xml.prefs);
		  
}
}
