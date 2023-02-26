package com.foxy.milit.ui.user;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import androidx.appcompat.app.AppCompatActivity;

import com.foxy.milit.R;
import com.foxy.milit.databinding.ActivityNewTaskUserBinding;
import com.google.android.material.appbar.MaterialToolbar;

public class AddTaskUserActivity extends AppCompatActivity {

    ActivityNewTaskUserBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNewTaskUserBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //TODO: изменить название категорий для помощи

        String[] categoryArray = new String[] {
                "Продукты",
                "Помощь"
        };

        ArrayAdapter<String> categoryAdapter = new ArrayAdapter<>(
                this,
                R.layout.menu_dropdown,
                categoryArray
        );

        binding.autoTextViewCategory.setAdapter(categoryAdapter);

        MaterialToolbar topNewTask = findViewById(R.id.topNewTask);
        topNewTask.setNavigationOnClickListener(v -> onBackPressed());

    }


}