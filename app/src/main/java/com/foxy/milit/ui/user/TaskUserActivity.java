package com.foxy.milit.ui.user;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.foxy.milit.R;
import com.foxy.milit.databinding.ActivityTaskBinding;
import com.google.android.material.appbar.MaterialToolbar;

public class TaskUserActivity extends AppCompatActivity {

    ActivityTaskBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTaskBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }

}