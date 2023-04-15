package com.foxy.milit.ui.utils;

import retrofit2.Response;

public interface CustomCallback<T> {

    void onSuccess(T value);
    void onFailure(Throwable throwable);

}