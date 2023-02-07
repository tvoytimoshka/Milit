package com.example.neighbour.ui.auth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.neighbour.R;
import com.example.neighbour.ui.utils.TextValidator;
import com.example.neighbour.ui.volunteer.main.MainVolunteerActivity;
import com.google.android.material.textfield.TextInputLayout;


public class LoginActivity extends AppCompatActivity {

    TextInputLayout textEmail;
    TextInputLayout textPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AppCompatDelegate.setDefaultNightMode(
                AppCompatDelegate.MODE_NIGHT_YES);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btnLogin = findViewById(R.id.btnLogin);
        Button btnRegister = findViewById(R.id.btnRegister);
        textEmail = findViewById(R.id.loginEditText);
        textPassword = findViewById(R.id.passwordEditText);

        btnLogin.setOnClickListener(v -> {

            String email = textEmail.getEditText().getText().toString();
            String password = textPassword.getEditText().getText().toString();

            if (!validateFields(email, password)) {
                return;
            }

            Intent nameIntent = new Intent(this, MainVolunteerActivity.class);
            startActivity(nameIntent);
        });

        btnRegister.setOnClickListener(v -> startActivity(new Intent(this, RegisterActivity.class)));
    }

    private boolean validateFields(String email, String password) {
        return TextValidator.validateText(email, textEmail) & TextValidator.validateText(password, textPassword);
    }

}