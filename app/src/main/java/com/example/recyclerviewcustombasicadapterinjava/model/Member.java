package com.example.recyclerviewcustombasicadapterinjava.model;

import com.example.recyclerviewcustombasicadapterinjava.R;

public class Member {
    private int image;
    private String name;
    private String phoneNumber;
    private int phoneImage;

    public Member(int image, String name, String phoneNumber) {
        this.image = image;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.phoneImage= R.drawable.phone;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneImage() {
        return phoneImage;
    }

    public void setPhoneImage(int phoneImage) {
        this.phoneImage = phoneImage;
    }
}
