package com.example.md21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    final String TAG = "States";
    String data;
    TextView nameinf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d(TAG, "MainActivity2: onCreate()");
        data = getIntent().getExtras().getString("nameSend");
        nameinf = (TextView) findViewById(R.id.infText);
        if (data.length() != 0) {
            nameinf.setText(data.toCharArray(), 0, data.length());
        }
    }

    public void onclick1(View v) {
        switch (v.getId()) {
            case R.id.btnActOne:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }

    public void onclick2(View v) {
        switch (v.getId()) {
            case R.id.btnActTwo:
                Intent  intent = new Intent(this, MainActivity2.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }

    public void onclick3(View v) {
        switch (v.getId()) {
            case R.id.btnActTree:
                Intent intent = new Intent(this, MainActivity3.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }

    public void onclick4(View v) {
        switch (v.getId()) {
            case R.id.btnActFour:
                Intent  intent = new Intent(this, MainActivity4.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "MainActivity2: onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "MainActivity2: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "MainActivity2: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "MainActivity2: onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "MainActivity2: onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "MainActivity2: onRestart()");
    }
}