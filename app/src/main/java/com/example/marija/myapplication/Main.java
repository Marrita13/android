package com.example.marija.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Main extends AppCompatActivity {

    String username;

    TextView mHelloWorld;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
mHelloWorld = (TextView) findViewById(R.id.lbl_hello_world);
username = getIntent().getStringExtra("USERNAME_KEY");
        mHelloWorld.setText("Hello" + username);

        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction();

        MyFirstFragment fragment = MyFirstFragment.newInstance();

        ft.replace(R.id.fragment_container, fragment);
        ft.addToBackStack(null);
        ft.commit();
    }

    @Override
    protected void onResume() {
        super.onResume();


    }

    @Override
    protected void onPause() {
        super.onPause();
        mHelloWorld.setText("Hello Paused");
    }
}
