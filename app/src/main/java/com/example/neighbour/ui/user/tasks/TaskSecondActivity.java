package com.example.neighbour.ui.user.tasks;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.neighbour.R;
import com.google.android.material.appbar.MaterialToolbar;

public class TaskSecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_second);

        MaterialToolbar taskToolbar = findViewById(R.id.topTaskAppBar);
        taskToolbar.setNavigationOnClickListener(v -> onBackPressed());

    }

}
