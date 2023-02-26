package com.foxy.milit.repository;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;

import com.foxy.milit.model.user.User;
import com.foxy.milit.model.utils.Message;
import com.foxy.milit.network.IAuth;
import com.foxy.milit.network.MilitAuthClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AuthRepository {

    IAuth authInterface;

    private final String TAG = AuthRepository.class.getSimpleName();

    public AuthRepository() {
        authInterface = MilitAuthClient.getAuthClient().create(IAuth.class);
    }

    public MutableLiveData<Message> register(User user) {
        MutableLiveData<Message> message = new MutableLiveData<>();

        authInterface.register(user).enqueue(new Callback<Message>() {
            @Override
            public void onResponse(@NonNull Call<Message> call, @NonNull Response<Message> response) {
                if(response.isSuccessful()) {
                    message.setValue(response.body());
                }
            }

            @Override
            public void onFailure(@NonNull Call<Message> call, @NonNull Throwable t) {
                Log.e(TAG, "onFailure: auth: ", t);
            }
        });

        return message;
    }


}
