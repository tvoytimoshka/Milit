package com.foxy.milit.ui.volunteer;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.foxy.milit.R;
import com.google.android.material.appbar.MaterialToolbar;

public class TaskVolunteerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        MaterialToolbar topTaskAppBar = findViewById(R.id.topTaskAppBar);
        topTaskAppBar.setNavigationOnClickListener(v -> onBackPressed());

    }

}