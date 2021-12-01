package com.example.md21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    final String TAG = "States";
    EditText info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "MainActivity: onCreate()");
        info = (EditText) findViewById(R.id.textinf);
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
                if (info.getText().toString().length() != 0 ) {
                    intent.putExtra("nameSend", info.getText().toString());
                }
                else {
                    String s = "Empty";
                    intent.putExtra("nameSend", s.toString());
                }
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
        Log.d(TAG, "MainActivity: onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "MainActivity: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "MainActivity: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "MainActivity: onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "MainActivity: onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "MainActivity: onRestart()");
    }

}
