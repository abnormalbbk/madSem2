package com.example.myapplication.post;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.post.helper.PostAdapter;
import com.example.myapplication.post.helper.PostPojo;
import com.example.myapplication.student.StudentAdapter;

import java.util.List;

public class PostActivity extends AppCompatActivity implements PostContract.View {
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);

        PostContract.Presenter presenter = new PostPresenter(this);
        presenter.onCreate();
    }

    @Override
    public void toggleProgressDialog(boolean show) {
        if (show) {
            if (progressDialog != null && !progressDialog.isShowing()) {
                progressDialog = new ProgressDialog(this);
                progressDialog.setMessage("Loading ...");
                progressDialog.show();
            }
        } else {
            if (progressDialog != null) {
                progressDialog.dismiss();
                progressDialog = null;
            }
        }
    }

    @Override
    public void setPosts(List<PostPojo> posts) {
        RecyclerView rvStudents = findViewById(R.id.rvPosts);
        PostAdapter adapter = new PostAdapter(posts);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        rvStudents.setAdapter(adapter);
        rvStudents.setLayoutManager(layoutManager);
    }

    @Override
    public void showErrorMessage(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }
}
