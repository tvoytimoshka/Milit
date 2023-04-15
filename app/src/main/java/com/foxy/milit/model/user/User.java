package com.foxy.milit.model.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable {

    @SerializedName("id")
    @Expose
    private long id;

    @SerializedName("name")
    @Expose
    private String name;

    private String lastName;
    private String email;
    private String username;
    @SerializedName("location")
    @Expose
    private List<Location> location;
    private String about;
    private String password;
    private List<String> roles;

    public User(String name, String lastName, String email, String username, List<Location> location,
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

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public List<Location> getLocation() {
        return location;
    }

    public String getAbout() {
        return about;
    }

    public String getPassword() {
        return password;
    }

    public List<String> getRoles() {
        return roles;
    }
}
