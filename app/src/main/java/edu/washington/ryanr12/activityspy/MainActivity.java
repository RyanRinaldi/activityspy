package edu.washington.ryanr12.activityspy;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;


public class MainActivity extends ActionBarActivity {

    public String TAG_NAME = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String bundleData = "";
        if(savedInstanceState != null) {
            bundleData += " " + savedInstanceState.toString();
        }
        Log.i(TAG_NAME, "onCreate event fired" + bundleData);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG_NAME, "onStart event fired");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG_NAME, "onResume event fired");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG_NAME, "onPause event fired");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG_NAME, "onStop event fired");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG_NAME, "We're going down, Captain!");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG_NAME, "onRestart event fired");
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
