package com.example.neighbour.ui.auth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.neighbour.R;
import com.example.neighbour.ui.utils.TextValidator;
import com.example.neighbour.ui.volunteer.OrdersNearbyVolunteerActivity;
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

        textEmail = findViewById(R.id.loginEditText);
        textPassword = findViewById(R.id.passwordEditText);
        
        btnLogin.setOnClickListener(v -> {
            
            String email = textEmail.getEditText().getText().toString();
            String password = textPassword.getEditText().getText().toString();



            if(!validateFields(email, password)){

                return;
            }

            Intent nameIntent = new Intent(this, OrdersNearbyVolunteerActivity.class);
            startActivity(nameIntent);

            
        });

    }

    private boolean validateFields(String email, String password){
        TextValidator textValidator = new TextValidator();

        return textValidator.validateText(email, textEmail) & textValidator.validateText(password, textPassword);
    }

}