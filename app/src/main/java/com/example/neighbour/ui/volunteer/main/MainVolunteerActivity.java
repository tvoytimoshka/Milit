package com.example.neighbour.ui.volunteer.main;

import android.os.Bundle;

import com.example.neighbour.R;
import com.example.neighbour.databinding.ActivityMainVolunteerBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;


public class MainVolunteerActivity extends AppCompatActivity {

    private ActivityMainVolunteerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainVolunteerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        NavController navController = Navigation.findNavController(this,
                R.id.nav_host_fragment_activity_main_volunteer);
        NavigationUI.setupWithNavController(binding.navView, navController);
    }

}