package com.foxy.milit.repository;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;

import com.foxy.milit.model.user.User;
import com.foxy.milit.model.utils.Message;
import com.foxy.milit.network.IAuth;
import com.foxy.milit.network.MilitAuthClient;
import com.foxy.milit.ui.utils.CustomCallback;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AuthRepository {

    IAuth authInterface;

    private final String TAG = AuthRepository.class.getSimpleName();

    public AuthRepository() {
        authInterface = MilitAuthClient.getAuthClient().create(IAuth.class);
    }

    public MutableLiveData<User> register(User user, CustomCallback<User> customCallback) {
        MutableLiveData<User> liveData = new MutableLiveData<>();

        authInterface.register(user).enqueue(new Callback<User>() {
            @Override
            public void onResponse(@NonNull Call<User> call, @NonNull Response<User> response) {
                Log.d(TAG, "onResponse: " + response.code());
                liveData.setValue(response.body());
                customCallback.onSuccess(response.body());
            }

            @Override
            public void onFailure(@NonNull Call<User> call, @NonNull Throwable t) {
                liveData.setValue(null);
                customCallback.onFailure(t);
            }
        });

        return liveData;
    }


}
