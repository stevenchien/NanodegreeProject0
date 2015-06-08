package com.example.coursehero.centralhub;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupButtons();
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

    private void setupButtons() {
        Button spotifyStreamerBtn = (Button) findViewById(R.id.SPOTIFYSTREAMER);
        setupOrangeButton(spotifyStreamerBtn);
        setupToastOnButtonClick(spotifyStreamerBtn);

        Button scoresAppBtn = (Button) findViewById(R.id.SCORESAPP);
        setupOrangeButton(scoresAppBtn);
        setupToastOnButtonClick(scoresAppBtn);

        Button libraryAppBtn = (Button) findViewById(R.id.LIBRARYAPP);
        setupOrangeButton(libraryAppBtn);
        setupToastOnButtonClick(libraryAppBtn);

        Button buildItBiggerBtn = (Button) findViewById(R.id.BUILDITBIGGER);
        setupOrangeButton(buildItBiggerBtn);
        setupToastOnButtonClick(buildItBiggerBtn);

        Button xyzReaderBtn = (Button) findViewById(R.id.XYZREADER);
        setupOrangeButton(xyzReaderBtn);
        setupToastOnButtonClick(xyzReaderBtn);

        Button capstoneBtn = (Button) findViewById(R.id.CAPSTONE);
        setupRedButton(capstoneBtn);
        setupToastOnButtonClick(capstoneBtn);
    }

    private void setupOrangeButton(Button button) {
        button.setBackgroundColor(Color.rgb(255, 133, 0));
        button.setTextColor(Color.WHITE);
    }

    private void setupRedButton(Button button) {
        button.setBackgroundColor(Color.rgb(255, 20, 0));
        button.setTextColor(Color.WHITE);
    }

    private void setupToastOnButtonClick(final Button button) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        String.format("This button will launch the %s app", button.getText()), Toast.LENGTH_LONG).show();
            }
        });
    }
}
