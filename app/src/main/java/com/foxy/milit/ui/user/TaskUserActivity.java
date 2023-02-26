package com.foxy.milit.ui.user;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.foxy.milit.R;
import com.foxy.milit.databinding.ActivityTaskUserBinding;
import com.google.android.material.appbar.MaterialToolbar;

public class TaskUserActivity extends AppCompatActivity {

    ActivityTaskUserBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTaskUserBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        MaterialToolbar taskToolbar = findViewById(R.id.toolTaskAppBar);
        taskToolbar.setNavigationOnClickListener(v -> onBackPressed());

    }

}