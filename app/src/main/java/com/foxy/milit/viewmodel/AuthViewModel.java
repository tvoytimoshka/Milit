package com.foxy.milit.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.foxy.milit.model.user.User;
import com.foxy.milit.model.utils.Message;
import com.foxy.milit.repository.AuthRepository;
import com.foxy.milit.ui.utils.CustomCallback;

public class AuthViewModel extends ViewModel {

    private final AuthRepository authRepository = new AuthRepository();

    public MutableLiveData<User> register(User user, CustomCallback<User> customCallback) {
        return authRepository.register(user, customCallback);
    }

}
