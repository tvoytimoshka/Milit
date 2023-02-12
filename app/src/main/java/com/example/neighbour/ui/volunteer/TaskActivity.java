package com.example.neighbour.ui.volunteer;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.neighbour.R;
import com.google.android.material.appbar.MaterialToolbar;

public class TaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);


        MaterialToolbar topTaskAppBar = findViewById(R.id.topTaskAppBar);
        topTaskAppBar.setNavigationOnClickListener(v -> onBackPressed());

    }

}