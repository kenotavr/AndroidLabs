package com.example.lab1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button goToDetailActivity;
    Button goToWeb;

    View.OnClickListener oclBtnGoToDetailActivity = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener oclBtnGoToWeb= new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://music.yandex.ru/home"));
            startActivity(intent);
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.w("Lab1", "Main Activity OnCreate");
        setContentView(R.layout.activity_main);

        goToDetailActivity = findViewById(R.id.button_go_to_detail_activity);
        goToWeb = findViewById(R.id.button_go_to_web);
        goToDetailActivity.setOnClickListener(oclBtnGoToDetailActivity);
        goToWeb.setOnClickListener(oclBtnGoToWeb);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.w("Lab1", "Main Activity onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.w("Lab1", "Main Activity onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.w("Lab1", "Main Activity onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w("Lab1", "Main Activity onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.w("Lab1", "Main Activity onResume");
    }


}
