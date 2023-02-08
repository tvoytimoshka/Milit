package com.example.neighbour.ui.user.tasks;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import androidx.appcompat.app.AppCompatActivity;

import com.example.neighbour.R;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;

import java.util.ArrayList;

public class NewTaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_task);

        MaterialAutoCompleteTextView autoTextViewCategory = findViewById(R.id.autoTextViewCategory);

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

        autoTextViewCategory.setAdapter(categoryAdapter);

        MaterialToolbar topNewTask = findViewById(R.id.topNewTask);
        topNewTask.setNavigationOnClickListener(v -> onBackPressed());

    }


}