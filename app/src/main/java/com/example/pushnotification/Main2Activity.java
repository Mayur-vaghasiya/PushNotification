package com.example.pushnotification;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    private static final String TAG = "Main2Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.e(TAG, "2OnCreate is called");
        Toast.makeText(this, "2 onCreate is called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "2onStart is called");
        //Toast.makeText(this, "onStart is called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "2onResume is called");
        //Toast.makeText(this, "onResume is called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "2onPause is called");
        //Toast.makeText(this, "onPause is called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "2onStop is called");
        //Toast.makeText(this, "onStop is called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "2onRestart is called");
        Toast.makeText(this, "onRestart is called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "2onDestroy is called");
        //Toast.makeText(this, "onDestroy is called", Toast.LENGTH_SHORT).show();
    }
}
