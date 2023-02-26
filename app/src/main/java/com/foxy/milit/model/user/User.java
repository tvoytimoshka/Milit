package com.foxy.milit.model.user;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class User {

    @SerializedName("id")
    private long id;

    private String name;
    private String lastName;
    private String email;
    private String username;
    private String location;
    private String about;
    private String password;
    private List<String> roles;

    public User(String name, String lastName, String email, String username, String location,
                String about, String password, List<String> roles) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        this.location = location;
        this.about = about;
        this.password = password;
        this.roles = roles;
    }


}
