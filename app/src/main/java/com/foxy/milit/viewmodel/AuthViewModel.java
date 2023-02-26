package com.foxy.milit.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.foxy.milit.model.user.User;
import com.foxy.milit.model.utils.Message;
import com.foxy.milit.repository.AuthRepository;

public class AuthViewModel extends ViewModel {

    private final AuthRepository authRepository = new AuthRepository();

    public MutableLiveData<Message> register(User user) {
        return authRepository.register(user);
    }

}
