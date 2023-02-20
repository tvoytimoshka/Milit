package com.example.neighbour.ui.user.tasks.main.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.neighbour.R;
import com.example.neighbour.ui.user.SettingsUserActivity;

public class FragmentProfile extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

//        Button settingsBtn = view.findViewById(R.id.settingsBtn);
//        settingsBtn.setOnClickListener(e -> {
//            Intent goToSettings = new Intent(requireActivity(), SettingsUserActivity.class);
//            startActivity(goToSettings);
//        });



        return view;
    }
}
