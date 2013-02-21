package com.example.babyplus;
// com.seroton.phonegap.statuslist;
 
import android.app.Activity;
import android.os.Bundle;
import org.apache.cordova.*;
 
public class MainActivity extends DroidGap
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
    }
}



//package com.example.babyplus;

//import org.apache.cordova.DroidGap;
//import android.os.Bundle;
//import com.phonegap.*;
//import android.view.Menu;

//public class MainActivity extends DroidGap {

//		@Override
//		public void onCreate(Bundle savedInstanceState) {
	//			super.onCreate(savedInstanceState);
	//			super.loadUrl("file:///android_asset/www/index.html");
	//		}

//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.activity_main, menu);
//		return true;
//	}

//}