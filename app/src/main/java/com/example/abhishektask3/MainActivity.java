package com.example.abhishektask3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("info", "OnCreate function");
        calc_distance();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("info", "OnStart function");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("info", "OnResume function");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("info", "OnPause function");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("info", "OnStop function");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("info", "OnDestroy function");
    }

    public void calc_distance(){
        String MyName = "Abhishek";
        int hoursTravelled = 2;
        int speed = 60;
        String total;

        float abc = hoursTravelled * speed;
        String a = Float.toString(abc);

        Toast.makeText(this, MyName + " And " + a, Toast.LENGTH_LONG).show();
    }
}
