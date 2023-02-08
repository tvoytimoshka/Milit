package com.example.neighbour.ui.auth;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.neighbour.R;
import com.example.neighbour.ui.user.main.MainUserActivity;
import com.example.neighbour.ui.utils.TextValidator;
import com.example.neighbour.ui.volunteer.main.MainVolunteerActivity;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;

import java.util.Objects;

public class RegisterActivity extends AppCompatActivity {

    private TextInputLayout textName, textLustName, textNumberPhone,
            textEmail, textPassword, textPasswordConfirmation, textInputCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        MaterialToolbar registerTopAppBar = findViewById(R.id.registerTopAppBar);
        textInputCategory = findViewById(R.id.textInputCategory);
        MaterialAutoCompleteTextView autoTextViewCategory = findViewById(R.id.autoTextViewCategory);
        Button btnLogin = findViewById(R.id.btnLogin);

        textName = findViewById(R.id.name);
        textLustName = findViewById(R.id.surname);
        textNumberPhone = findViewById(R.id.phone);
        textEmail = findViewById(R.id.loginEditText);
        textPassword = findViewById(R.id.passwordEditText);
        textPasswordConfirmation = findViewById(R.id.passwordRepeatEditText);

        initAutoText(autoTextViewCategory);

        registerTopAppBar.setNavigationOnClickListener(v -> onBackPressed());

        btnLogin.setOnClickListener(v -> {
            String name = Objects.requireNonNull(textName.getEditText()).getText().toString();
            String lustName = Objects.requireNonNull(textLustName.getEditText()).getText().toString();
            String numberPhone = Objects.requireNonNull(textNumberPhone.getEditText()).getText().toString();
            String email = Objects.requireNonNull(textEmail.getEditText()).getText().toString();
            String password = Objects.requireNonNull(textPassword.getEditText()).getText().toString();
            String passwordConfirmation = Objects.requireNonNull(textPasswordConfirmation.getEditText()).getText().toString();
            String category = Objects.requireNonNull(textInputCategory.getEditText()).getText().toString();

            if (!validateFields(name, lustName, numberPhone,
                    email, password, passwordConfirmation, category)) {
                return;
            }

            if (category.equals("Волонтер")) {
                startActivity(new Intent(this, MainVolunteerActivity.class));
            }

            if (category.equals("Клиент")) {
                startActivity(new Intent(this, MainUserActivity.class));
            }
        });

    }

    private void initAutoText(MaterialAutoCompleteTextView autoTextViewCategory) {
        String[] categoryArray = new String[]{"Волонтер", "Клиент"};

        ArrayAdapter<String> categoryAdapter = new ArrayAdapter<>(this, R.layout.menu_dropdown, categoryArray);

        autoTextViewCategory.setAdapter(categoryAdapter);
    }

    private boolean validateFields(String name, String lustName, String numberPhone,
                                   String email, String password, String passwordConfirmation,
                                   String category) {
        return TextValidator.validateText(name, textName) &
                TextValidator.validateText(lustName, textLustName) &
                TextValidator.validateText(numberPhone, textNumberPhone) &
                TextValidator.validateText(email, textEmail) &
                TextValidator.validateText(password, textPassword) &
                TextValidator.validateText(passwordConfirmation, textPasswordConfirmation) &
                TextValidator.validateText(category, textInputCategory);
    }

}