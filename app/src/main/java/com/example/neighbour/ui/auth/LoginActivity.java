package com.example.neighbour.ui.auth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.widget.Button;

import com.example.neighbour.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;



public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AppCompatDelegate.setDefaultNightMode(
                AppCompatDelegate.MODE_NIGHT_YES);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }
}