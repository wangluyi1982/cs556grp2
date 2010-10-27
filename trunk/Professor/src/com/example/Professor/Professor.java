package com.example.Professor;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Professor extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
	Button buttonAdd,buttonView,buttonAbout;
	TextView text;
	SharedPreferences prefs;
	Intent i;
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        buttonAdd=(Button)findViewById(R.id.buttonAdd);
        buttonView=(Button)findViewById(R.id.buttonView);
        buttonAbout=(Button)findViewById(R.id.buttonAbout);
        
        buttonAdd.setOnClickListener(this);
        buttonView.setOnClickListener(this);
        buttonAbout.setOnClickListener(this);
        prefs=PreferenceManager.getDefaultSharedPreferences(this);
        
    }
    @Override
    public void onClick(View src)
    {
    	switch(src.getId())
    	{
    	case R.id.buttonAbout:
    		 i = new Intent(this,About.class);
    		 startActivity(i);
    		  break;
    	case R.id.buttonView:
    		 i = new Intent(this,List.class);
    		 startActivity(i);
    		  break;
    	case R.id.buttonAdd:
    		 i = new Intent(this,List.class);
    		 startActivity(i);
        	break;
    	
    	}
    	
    	
    	
}
}