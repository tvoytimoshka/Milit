package com.foxy.milit.ui.auth;

import static java.util.Objects.requireNonNull;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import androidx.appcompat.app.AppCompatActivity;

import com.foxy.milit.R;
import com.foxy.milit.databinding.ActivityRegisterBinding;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;

public class RegisterActivity extends AppCompatActivity {

    ActivityRegisterBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.registerTopAppBar.setNavigationOnClickListener(v -> onBackPressed());
        initAutoText(binding.autoTextViewCategory);

        binding.btnCreateNewAccount.setOnClickListener(v -> {
            String name = requireNonNull(binding.textInputName.getEditText()).getText().toString();
            String lastName = requireNonNull(binding.textInputLastName.getEditText()).getText().toString();
            String about = requireNonNull(binding.textInputAbout.getEditText()).getText().toString();
            String username = requireNonNull(binding.textInputUsername.getEditText()).getText().toString();
            String email = requireNonNull(binding.textInputEmail.getEditText()).getText().toString();
            String password = requireNonNull(binding.textInputPassword.getEditText()).getText().toString();
            String correctPassword = requireNonNull(binding.textInputCorrectPassword.getEditText()).getText().toString();
            String category = requireNonNull(binding.textInputCategory.getEditText()).getText().toString();


            //todo: add empty validation



        });


    }

    private void initAutoText(MaterialAutoCompleteTextView autoTextViewCategory) {
        String[] categoryArray = new String[]{"Волонтер", "Пользователь"};

        ArrayAdapter<String> categoryAdapter = new ArrayAdapter<>(this, R.layout.menu_dropdown, categoryArray);

        autoTextViewCategory.setAdapter(categoryAdapter);
    }


}