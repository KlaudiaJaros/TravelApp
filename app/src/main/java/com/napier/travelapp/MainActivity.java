package com.napier.travelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioButton rb0 = (RadioButton) findViewById(R.id.radioButton);
        rb0.setOnClickListener(radioGroupClick);

        RadioButton rb1 = (RadioButton) findViewById(R.id.radioButton2);
        rb1.setOnClickListener(radioGroupClick);

        RadioButton rb2 = (RadioButton) findViewById(R.id.radioButton3);
        rb2.setOnClickListener(radioGroupClick);

        Log.e(getResources().getString(R.string.app_name), "Error message test to be shown by LogCat");
        Log.d(getResources().getString(R.string.app_name), "Debug message test to be shown by LogCat");
        Log.i(getResources().getString(R.string.app_name), "Info message test to be shown by Logcat");
        Log.v(getResources().getString(R.string.app_name),"Verbose message test to be shown in LogCat");
        Log.w(getResources().getString(R.string.app_name), "Warning message test to be shown in LogCat");

    }
    private View.OnClickListener radioGroupClick = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            RadioButton rb = (RadioButton)v;
            Toast.makeText(MainActivity.this, rb.getText(), Toast.LENGTH_SHORT).show();

            ImageView iv = (ImageView) findViewById(R.id.imageView);

            if (rb.getText().equals("Hopewell Rocks")) {
                iv.setImageResource(R.drawable.hopewell_rocks);
            } else if (rb.getText().equals("Niagara Falls")) {
                iv.setImageResource(R.drawable.niagara_falls);
            } else if (rb.getText().equals("Parliament Hill")) {
                iv.setImageResource(R.drawable.parliament_hill);
            }

        }
    };
}