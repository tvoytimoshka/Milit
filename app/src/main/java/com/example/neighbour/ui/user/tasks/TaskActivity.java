package com.example.neighbour.ui.user.tasks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.neighbour.R;
import com.google.android.material.appbar.MaterialToolbar;

public class TaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);

        MaterialToolbar taskToolbar = findViewById(R.id.taskToolbar);
        taskToolbar.setNavigationOnClickListener(v -> onBackPressed());

    }

}