package com.example.myapplication.api;

import com.example.myapplication.post.helper.PostPojo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("demo/posts")
    Call<List<PostPojo>> getPosts();
}
