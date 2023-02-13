package com.example.neighbour.ui.volunteer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.neighbour.R;
import com.google.android.material.appbar.MaterialToolbar;

public class TaskSecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_second);

        MaterialToolbar topTaskAppBar = findViewById(R.id.topTaskAppBar);
        topTaskAppBar.setNavigationOnClickListener(v -> onBackPressed());
    }

}