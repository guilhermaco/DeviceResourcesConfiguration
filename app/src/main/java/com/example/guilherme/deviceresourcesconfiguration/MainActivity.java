package com.example.guilherme.deviceresourcesconfiguration;

import android.content.res.Configuration;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.util.Locale;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Getting the device configuration data
        Configuration configuration = getResources().getConfiguration();
        int density = configuration.densityDpi;
        int orientation = configuration.orientation;
        int height = configuration.screenHeightDp;
        int width = configuration.screenWidthDp;
        int mdd = configuration.mcc;
        int mnc = configuration.mnc;

        Locale locale = configuration.locale;
        //Values of the Moto G(first generation) device configuration
        //320
        Log.d("GMC", "density: "+ density);
        //2
        Log.d("GMC", "orientation: "+orientation);
        //335
        Log.d("GMC", "height: "+height);
        //598
        Log.d("GMC", "width: "+width);
        //ptBR
        Log.d("GMC", "language: "+locale.getLanguage() + locale.getCountry());
        //724
        Log.d("GMC", "mdd: "+mdd);
        //5
        Log.d("GMC", "mnc: "+mnc);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
