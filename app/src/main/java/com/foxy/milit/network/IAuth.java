package com.foxy.milit.network;

import com.foxy.milit.model.user.User;
import com.foxy.milit.model.utils.Message;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface IAuth {

    @POST("/auth/register")
    Call<Message> register(@Body User user);

}
