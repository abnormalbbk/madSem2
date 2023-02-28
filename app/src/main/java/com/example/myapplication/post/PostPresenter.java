package com.example.myapplication.post;

import androidx.annotation.NonNull;

import com.example.myapplication.post.helper.PostPojo;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PostPresenter implements PostContract.Presenter {
    private final PostContract.View view;
    private final PostModel model = new PostModel();

    public PostPresenter(PostContract.View view) {
        this.view = view;
    }

    @Override
    public void onCreate() {
        view.toggleProgressDialog(true);
        getPostsFromAPI();
    }

    @Override
    public void getPostsFromAPI() {
        model.getPostsFromAPI().enqueue(new Callback<List<PostPojo>>() {
            @Override
            public void onResponse(@NonNull Call<List<PostPojo>> call, @NonNull Response<List<PostPojo>> response) {
                view.toggleProgressDialog(false);
                if (response.isSuccessful()) {
                    view.setPosts(response.body());
                } else {
                    view.showErrorMessage("An error has occured");
                }
            }

            @Override
            public void onFailure(@NonNull Call<List<PostPojo>> call, @NonNull Throwable t) {
                view.toggleProgressDialog(false);
                view.showErrorMessage(t.getMessage());
            }
        });
    }
}
