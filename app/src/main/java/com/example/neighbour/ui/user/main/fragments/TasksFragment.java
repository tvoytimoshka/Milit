package com.example.neighbour.ui.user.main.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.neighbour.R;
import com.example.neighbour.ui.user.main.TaskActivity;
import com.google.android.material.appbar.MaterialToolbar;

public class TasksFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tasks, container, false);

        View firstElement = view.findViewById(R.id.firstElement);
        firstElement.setOnClickListener(v -> {
            Intent goToTask = new Intent(requireActivity(), TaskActivity.class);
            startActivity(goToTask);
        });


        return view;
    }
}
