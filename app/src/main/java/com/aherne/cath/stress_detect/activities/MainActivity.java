package com.aherne.cath.stress_detect.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.aherne.cath.stress_detect.R;

public class MainActivity extends AppCompatActivity {

    static String TAG = "___***___MainActivity";

    //Init Buttons
    private Button blescanButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "App is running!");

        //Buttons
        blescanButton = (Button) findViewById(R.id.bleButton);


        //OnClickListeners
        blescanButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent myIntent = new Intent(MainActivity.this, BLEScanActivity.class);
                MainActivity.this.startActivity(myIntent);
            }
        });
    }
}
