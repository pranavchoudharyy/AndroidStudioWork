package com.example.experiment3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    String msg="Android:";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(msg,"The onCreate() event");

    }
    //called when activity is about to become visible
    @Override
    protected void onStart(){
        super.onStart();
        Log.d(msg,"the onStart() event");

    }
    //called when activity becomes visible
    @Override
    protected void onResume(){
        super.onResume();
        Log.d(msg, "the onResume() event");

    }
    //called when another activity is taking place
    @Override
    protected void onPause(){
        super.onPause();
        Log.d(msg,"The onPause() event");
    }
    //called when acticity is no longer visible
    @Override
    protected void onStop(){
        super.onStop();
        Log.d(msg, "The onStop() event");
    }
    //called when activity is destroyed
    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d(msg, "The onDestroy() event");
    }
}
