package com.foxy.milit.ui.user.main.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.foxy.milit.databinding.FragmentProfileUserBinding;

public class FragmentProfileUser extends Fragment {

    FragmentProfileUserBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = FragmentProfileUserBinding.inflate(inflater, container, false);
        View view = binding.getRoot();



        return view;
    }
}
