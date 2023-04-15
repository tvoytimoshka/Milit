package com.foxy.milit.ui.auth;

import static com.foxy.milit.ui.utils.TextValidator.validateText;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import com.foxy.milit.databinding.ActivityLoginBinding;
import com.foxy.milit.ui.user.main.MainUserActivity;
import com.foxy.milit.ui.utils.TextValidator;

import java.util.Objects;


public class LoginActivity extends AppCompatActivity {

    ActivityLoginBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AppCompatDelegate.setDefaultNightMode(
                AppCompatDelegate.MODE_NIGHT_YES);

        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnLogin.setOnClickListener(v -> {

            String email = Objects.requireNonNull(binding.loginEditText.getEditText()).getText().toString();
            String password = Objects.requireNonNull(binding.passwordEditText.getEditText()).getText().toString();

            if (!validateFields(email, password)) {
                return;
            }

            Intent nameIntent = new Intent(this, MainUserActivity.class);
            startActivity(nameIntent);
        });

        binding.btnRegister.setOnClickListener(v -> startActivity(new Intent(this, RegisterActivity.class)));
    }

    private boolean validateFields(String email, String password) {
        return validateText(email, binding.loginEditText) & validateText(password, binding.passwordEditText);
    }

}