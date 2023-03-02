package com.example.myapplication.dashboard.contact.contactpojo;

public class ContactPojo {
    public  int profilePhoto,deleteImg;
    public String fullName, phoneNUmber;

    public ContactPojo(int profilePhoto, int deleteImg, String fullName, String phoneNUmber) {
        this.profilePhoto = profilePhoto;
        this.deleteImg = deleteImg;
        this.fullName = fullName;
        this.phoneNUmber = phoneNUmber;
    }
}
