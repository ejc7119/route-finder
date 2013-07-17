package com.example.routefinder;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	
	Button newRouteButton;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        addListenerOnNewRouteButton();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void addListenerOnNewRouteButton() {
    	 
		newRouteButton = (Button) findViewById(R.id.new_route);
 
		newRouteButton.setOnClickListener(new View.OnClickListener() {
 
			@Override
			public void onClick(View arg0) {
				return;
			}
 
		});
 
	}
    
}
