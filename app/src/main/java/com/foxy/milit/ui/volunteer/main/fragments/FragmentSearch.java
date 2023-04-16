package com.foxy.milit.ui.volunteer.main.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.foxy.milit.R;
import com.foxy.milit.databinding.FragmentSearchBinding;
import com.foxy.milit.ui.volunteer.TaskVolunteerActivity;

public class FragmentSearch extends Fragment {

    FragmentSearchBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentSearchBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        binding.cardActive.setOnClickListener(v -> {
            startActivity(new Intent(requireActivity(), TaskVolunteerActivity.class));
        });

        return view;
    }
}
