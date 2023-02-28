package com.example.myapplication.post.helper;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class PostPojo implements Serializable {
    @SerializedName("id")
    final String id;
    @SerializedName("title")
    final String title;

    public PostPojo(String id, String title) {
        this.id = id;
        this.title = title;
    }
}
