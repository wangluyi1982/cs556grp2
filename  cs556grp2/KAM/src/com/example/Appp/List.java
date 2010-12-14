package com.example.Appp;
import android.app.Activity;
import android.app.AlertDialog;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;


import android.content.Intent;
//import android.content.SharedPreferences;
import android.os.Bundle;
//import android.preference.PreferenceManager;
import android.app.Activity;
import android.content.Intent;
//import android.content.SharedPreferences;
import android.os.Bundle;
//import android.preference.PreferenceManager;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class List extends Activity
	{
 private ListView lv1;
 private String lv_arr[]={"Research","Teaching","Administration","Advising"};
 Intent i;
 @Override
 public void onCreate(Bundle icicle)
 {
	 super.onCreate(icicle);	// setContentView(R.layout.list);
	 lv1=(ListView)findViewById(R.id.ListView01);
	 lv1.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1 , lv_arr));
	 lv1.setTextFilterEnabled(true);
	 lv1.setOnItemClickListener(new OnItemClickListener() {
	 @Override
	 public void onItemClick(AdapterView<?> a, View v, int position, long id) {
		 AlertDialog.Builder adb=new AlertDialog.Builder(List.this);
		 	 adb.setTitle("LVSelectedItemExample");
		 	 adb.setMessage("Selected Item is = "+lv1.getItemAtPosition(position));
			 adb.setPositiveButton("Ok", null);
		 	 adb.show();
	
	 }
	 });
	 }
	}