package com.foxy.milit.ui.user.main;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import com.foxy.milit.R;
import com.foxy.milit.databinding.ActivityMainUserBinding;


public class MainUserActivity extends AppCompatActivity {

    ActivityMainUserBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainUserBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        NavController navController = Navigation.findNavController(this,
                R.id.nav_host_fragment_activity_main_user);
        NavigationUI.setupWithNavController(binding.navView, navController);
    }

}