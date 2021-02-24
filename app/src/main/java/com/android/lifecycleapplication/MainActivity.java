package com.android.lifecycleapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.android.lifecycleapplication.Fragment.BlankFragmentOne;

public class MainActivity extends AppCompatActivity {

    private final int DISPLAY_LENGTH = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MainActivity","Create Activity.....");

        //lambda funtion to onclicklistener
        findViewById(R.id.btn).setOnClickListener(view -> Toast.makeText(this, "Button clicked", Toast.LENGTH_LONG).show());
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MainActivity","Start Activity.....");
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                FragmentManager manager = getSupportFragmentManager();
                int count = manager.getBackStackEntryCount();

                getSupportFragmentManager().popBackStack();

                FragmentTransaction ft = manager.beginTransaction();
                ft.replace(R.id.mainContener, new BlankFragmentOne());
                ft.commit();
            }
        }, DISPLAY_LENGTH);




    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MainActivity","Resume Activity.....");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("MainActivity","Restart Activity.....");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MainActivity","Pause Activity.....");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MainActivity","Stop Activity.....");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MainActivity","Destroy Activity.....");
    }

}