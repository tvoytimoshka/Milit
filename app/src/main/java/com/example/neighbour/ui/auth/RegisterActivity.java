package com.example.neighbour.ui.auth;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.neighbour.R;
import com.example.neighbour.ui.user.main.MainUserActivity;
import com.example.neighbour.ui.volunteer.main.MainVolunteerActivity;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        MaterialToolbar registerTopAppBar = findViewById(R.id.registerTopAppBar);
        TextInputLayout textInputCategory = findViewById(R.id.textInputCategory);
        MaterialAutoCompleteTextView autoTextViewCategory = findViewById(R.id.autoTextViewCategory);
        Button btnLogin = findViewById(R.id.btnLogin);

        initAutoText(autoTextViewCategory);

        registerTopAppBar.setNavigationOnClickListener(v -> onBackPressed());

        btnLogin.setOnClickListener(v -> {
            //todo: добавить валидацию на пустоту

            String category = textInputCategory.getEditText().getText().toString();

            if (category.equals("Волонтер")) {
                startActivity(new Intent(this, MainVolunteerActivity.class));
            }

            if(category.equals("Клиент")) {
                startActivity(new Intent(this, MainUserActivity.class));
            }

        });

    }

    private void initAutoText(MaterialAutoCompleteTextView autoTextViewCategory) {
        String[] categoryArray = new String[]{
                "Волонтер",
                "Клиент"
        };

        ArrayAdapter<String> categoryAdapter = new ArrayAdapter<>(
                this,
                R.layout.menu_dropdown,
                categoryArray
        );

        autoTextViewCategory.setAdapter(categoryAdapter);
    }
}