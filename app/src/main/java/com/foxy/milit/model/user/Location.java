package com.foxy.milit.model.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Location implements Serializable {

    @SerializedName("id")
    @Expose
    int id;
    @SerializedName("region")
    @Expose
    private String region;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("street")
    @Expose
    private String street;
    @SerializedName("houseNumber")
    @Expose
    private String houseNumber;
    @SerializedName("additionalInfo")
    @Expose
    private String additionalInfo;

    public Location(String region, String city, String street, String houseNumber, String additionalInfo) {
        this.region = region;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.additionalInfo = additionalInfo;
    }


    public String getRegion() {
        return region;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }
}
