package com.example.neighbour.ui.auth;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import androidx.appcompat.app.AppCompatActivity;

import com.example.neighbour.R;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        MaterialAutoCompleteTextView autoTextViewCategory = findViewById(R.id.autoTextViewCategory);

        // TODO: изменить название категориям
        String[] categoryArray = new String[] {
                "Волонтер",
                "Бабушка"
        };

        ArrayAdapter<String> categoryAdapter = new ArrayAdapter<>(
                this,
                R.layout.menu_dropdown,
                categoryArray
        );

        autoTextViewCategory.setAdapter(categoryAdapter);

    }
}