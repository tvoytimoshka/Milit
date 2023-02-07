package com.example.neighbour.ui.auth;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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

public class RegisterActivity extends AppCompatActivity {

    TextInputLayout textName;
    TextInputLayout textLustName;
    TextInputLayout textNumberPhone;
    TextInputLayout textEmail;
    TextInputLayout textPassword;
    TextInputLayout textPasswordConfirmation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        MaterialToolbar registerTopAppBar = findViewById(R.id.registerTopAppBar);
        TextInputLayout textInputCategory = findViewById(R.id.textInputCategory);
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
            //todo: добавить валидацию на пустоту

            String name = textName.getEditText().getText().toString();
            String lustName = textLustName.getEditText().getText().toString();
            String numberPhone = textNumberPhone.getEditText().getText().toString();
            String email = textEmail.getEditText().getText().toString();
            String password = textPassword.getEditText().getText().toString();
            String passwordConfirmation = textPasswordConfirmation.getEditText().getText().toString();

            String category = textInputCategory.getEditText().getText().toString();

            if (category.equals("Волонтер")) {
                startActivity(new Intent(this, MainVolunteerActivity.class));
            }

            if (category.equals("Клиент")) {
                startActivity(new Intent(this, MainUserActivity.class));
            }

            if (!validateFields(name, lustName, numberPhone,
                    email, password, passwordConfirmation)) {
                return;
            }

        });

    }

    private void initAutoText(MaterialAutoCompleteTextView autoTextViewCategory) {
        String[] categoryArray = new String[]{"Волонтер", "Клиент"};

        ArrayAdapter<String> categoryAdapter = new ArrayAdapter<>(this, R.layout.menu_dropdown, categoryArray);

        autoTextViewCategory.setAdapter(categoryAdapter);
    }

    private boolean validateFields(String name, String lustName, String numberPhone,
                                   String email, String password, String passwordConfirmation) {
        return TextValidator.validateText(name, textName) &
                TextValidator.validateText(lustName, textLustName) &
                TextValidator.validateText(numberPhone, textNumberPhone) &
                TextValidator.validateText(email, textEmail) &
                TextValidator.validateText(password, textPassword) &
                TextValidator.validateText(passwordConfirmation, textPasswordConfirmation);
    }

}