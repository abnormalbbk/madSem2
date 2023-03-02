package com.example.myapplication.dashboard.contact.contactpojo;

public class ContactPojo {
    public  int profilePhoto,deleteImg;
    public String fullName, phoneNumber;

    public ContactPojo(int profilePhoto, int deleteImg, String fullName, String phoneNumber) {
        this.profilePhoto = profilePhoto;
        this.deleteImg = deleteImg;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
    }
}
