package com.aherne.cath.stress_detect.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import com.aherne.cath.stress_detect.R;

public class MainActivity extends Activity {

    static String TAG = "___***___MainActivity";

    //Init Buttons
    private Button blescanButton;
    private Button collectButton;
    private Button trainButton;
    private Button classifyButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "App is running!");

        //Buttons
        blescanButton = (Button) findViewById(R.id.bleButton);
        collectButton = (Button) findViewById(R.id.cltButton);
        trainButton = (Button) findViewById(R.id.trnButton);
        classifyButton = (Button) findViewById(R.id.clsButton);



        //OnClickListeners
        blescanButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Log.i(TAG, "BLE button clicked");
                Intent myIntent = new Intent(MainActivity.this, BLEScanActivity.class);
                MainActivity.this.startActivity(myIntent);
            }
        });

        //OnClickListeners
        collectButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Log.i(TAG, "Collect button clicked");
//                Intent myIntent = new Intent(MainActivity.this, newActivity.class);
//                MainActivity.this.startActivity(myIntent);
            }
        });

        //OnClickListeners
        trainButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Log.i(TAG, "Train button clicked");
//                Intent myIntent = new Intent(MainActivity.this, newActivity.class);
//                MainActivity.this.startActivity(myIntent);
            }
        });

        //OnClickListeners
        classifyButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Log.i(TAG, "Classify button clicked");
//                Intent myIntent = new Intent(MainActivity.this, newActivity.class);
//                MainActivity.this.startActivity(myIntent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        Log.i(TAG, "Menu Creation");

        menu.findItem(R.id.menu_stop).setVisible(false);
        menu.findItem(R.id.menu_scan).setVisible(false);
        menu.findItem(R.id.menu_refresh).setVisible(false);

        return true;
    }


}
