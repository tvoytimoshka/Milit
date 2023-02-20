package com.example.neighbour.ui.user.tasks.main;

import android.os.Bundle;

import com.example.neighbour.R;
import com.example.neighbour.databinding.ActivityMainUserBinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;


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