package com.example.lab1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class DetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.w("Lab1", "Detail Activity OnCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.w("Lab1", "Detail Activity onStart");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.w("Lab1", "Detail Activity onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.w("Lab1", "Detail Activity onDestroy");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w("Lab1", "Detail Activity onPause");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.w("Lab1", "Detail Activity onResume");

    }
}
