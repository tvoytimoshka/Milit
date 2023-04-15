package com.foxy.milit.ui.auth;

import static com.foxy.milit.ui.utils.TextValidator.validateText;
import static java.util.Objects.requireNonNull;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.foxy.milit.R;
import com.foxy.milit.databinding.ActivityRegisterBinding;
import com.foxy.milit.model.user.Location;
import com.foxy.milit.model.user.User;
import com.foxy.milit.ui.utils.CustomCallback;
import com.foxy.milit.ui.utils.TextValidator;
import com.foxy.milit.viewmodel.AuthViewModel;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Response;

public class RegisterActivity extends AppCompatActivity {

    private ActivityRegisterBinding binding;

    public static final String TAG = RegisterActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        AuthViewModel authViewModel = new ViewModelProvider(this).get(AuthViewModel.class);

        binding.registerTopAppBar.setNavigationOnClickListener(v -> onBackPressed());
        initAutoText(binding.autoTextViewCategory);

        binding.btnNextPage.setOnClickListener(v -> {
            String name = requireNonNull(binding.textInputName.getEditText()).getText().toString();
            String lastName = requireNonNull(binding.textInputLastName.getEditText()).getText().toString();
            String about = requireNonNull(binding.textInputAbout.getEditText()).getText().toString();
            String username = requireNonNull(binding.textInputUsername.getEditText()).getText().toString();
            String email = requireNonNull(binding.textInputEmail.getEditText()).getText().toString();
            String password = requireNonNull(binding.textInputPassword.getEditText()).getText().toString();
            String correctPassword = requireNonNull(binding.textInputCorrectPassword.getEditText()).getText().toString();
            String category = requireNonNull(binding.textInputCategory.getEditText()).getText().toString();
            List<String> role = new ArrayList<>();
            List<Location> locations = new ArrayList<>();
            locations.add(new Location("region", "city", "strrt", "1", "ddd"));
            role.add("ROLE_VOLUNTEER");
            if(!validateFields(name, lastName, about, username, email, password, correctPassword, category)) {
                return;
            }

            if(!password.equals(correctPassword)) {
                return;
            }


            User user = new User(name, lastName, email, username, locations, about,
                    password, role);
            authViewModel.register(user, new CustomCallback<User>() {
                @Override
                public void onSuccess(User value) {

                }

                @Override
                public void onFailure(Throwable throwable) {
                    Log.e(TAG, "onFailure: ", throwable);
                }
            });

        });


    }

    private void initAutoText(MaterialAutoCompleteTextView autoTextViewCategory) {
        String[] categoryArray = new String[]{"Волонтер", "Пользователь"};

        ArrayAdapter<String> categoryAdapter = new ArrayAdapter<>(this, R.layout.menu_dropdown, categoryArray);

        autoTextViewCategory.setAdapter(categoryAdapter);
    }

    private boolean validateFields(String name, String lastName, String about,
                                   String username, String email, String password,
                                   String correctPassword, String category) {
        return validateText(name, binding.textInputName) & validateText(lastName, binding.textInputLastName)
                & validateText(about, binding.textInputAbout) & validateText(username, binding.textInputUsername)
                & validateText(email, binding.textInputEmail) & validateText(password, binding.textInputPassword)
                & validateText(correctPassword, binding.textInputCorrectPassword) & validateText(category, binding.textInputCategory);
    }

}