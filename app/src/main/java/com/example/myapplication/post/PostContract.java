package com.example.myapplication.post;

import com.example.myapplication.post.helper.PostPojo;

import java.util.List;

import retrofit2.Call;

public interface PostContract {
    interface View {
        void toggleProgressDialog(boolean show);

        void setPosts(List<PostPojo> posts);

        void showErrorMessage(String error);
    }

    interface Presenter {
        void onCreate();

        void getPostsFromAPI();
    }

    interface Model {
        Call<List<PostPojo>> getPostsFromAPI();
    }
}
