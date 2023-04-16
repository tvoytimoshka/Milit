package com.foxy.milit.ui.user.main.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.foxy.milit.databinding.FragmentHomeUserBinding;
import com.foxy.milit.ui.user.AddTaskUserActivity;

public class FragmentHomeUser extends Fragment {

    FragmentHomeUserBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = FragmentHomeUserBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        binding.createTask.setOnClickListener(v ->
                startActivity(new Intent(requireActivity(), AddTaskUserActivity.class)));


        return view;
    }
}
