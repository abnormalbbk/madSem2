package com.example.myapplication.post;

import com.example.myapplication.api.ApiICallInstance;
import com.example.myapplication.api.ApiService;
import com.example.myapplication.post.PostContract;
import com.example.myapplication.post.helper.PostPojo;

import java.util.List;

import retrofit2.Call;

public class PostModel implements PostContract.Model {
    @Override
    public Call<List<PostPojo>> getPostsFromAPI() {
        ApiService service = ApiICallInstance.getRetrofitInstance().create(ApiService.class);
        return service.getPosts();
    }
}
