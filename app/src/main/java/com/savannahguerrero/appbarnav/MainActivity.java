package com.savannahguerrero.appbarnav;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Adds the toolbar and sets it up
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    /**
     * Inflates the menu into the toolbar
     *
     * @param menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    /**
     * Sets up all switch cases for the options found in the toolbar
     *
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // In the case that add is selected
            case R.id.action_add:
                Toast.makeText(MainActivity.this, "This one adds something", Toast.LENGTH_SHORT).show();
                return true;
            // In the case that info is selected
            case R.id.action_info:
                Toast.makeText(MainActivity.this, "This will bring up an information screen", Toast.LENGTH_SHORT).show();
                return true;
            // In the case that settings is selected
            case R.id.action_settings:
                Toast.makeText(MainActivity.this, "This will allow users to change an app's settings", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
