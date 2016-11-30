package com.example.marija.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText mUsername;
    EditText mPassword;

    Button mRegister;

    String username = "ivan";
    String password = "passvord";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUsername=(EditText) findViewById(R.id.ed_username);
        mPassword=(EditText) findViewById(R.id.ed_password);
        mRegister = (Button)findViewById(R.id.btn_register);

        mRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
String username_from_input = mUsername.getText().toString();
                String password_from_input = mPassword.getText().toString();

                if(username_from_input.equals(username)&& password_from_input.equals(password)){
                    Intent intent = new Intent(MainActivity.this, Main.class);
                    intent.putExtra("USERNAME_KEY", username_from_input);
                    startActivity(intent);
                    finish();
                }
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
