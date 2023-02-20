package com.example.neighbour.ui.volunteer.main.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.neighbour.R;
import com.example.neighbour.ui.volunteer.TaskActivity;
import com.example.neighbour.ui.volunteer.TaskSecondActivity;

public class FragmentSearch extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search, container , false);

        View firstElement = view.findViewById(R.id.firstElementSearch);
        firstElement.setOnClickListener(v -> {
            Intent goToTask = new Intent(requireActivity(), TaskActivity.class);
            startActivity(goToTask);
        });

        View secondElement = view.findViewById(R.id.secondElementSearch);
        secondElement.setOnClickListener(v -> {
            Intent goToSecondTask = new Intent(requireActivity(), TaskSecondActivity.class);
            startActivity(goToSecondTask);
        });

        return view;
    }
}
