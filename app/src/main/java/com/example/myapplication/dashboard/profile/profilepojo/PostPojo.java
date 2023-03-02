package com.example.myapplication.dashboard.profile.profilepojo;

public class PostPojo {
    public int postPhoto,postProfile;
   public String userName,locationSubs,userNameStatus,Status;

    public PostPojo(int postPhoto, int postProfile, String userName, String locationSubs, String userNameStatus, String status) {
        this.postPhoto = postPhoto;
        this.postProfile = postProfile;
        this.userName = userName;
        this.locationSubs = locationSubs;
        this.userNameStatus = userNameStatus;
        Status = status;
    }
}
