package com.example.myapplication.post.helper;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostViewHolder> {
    final List<PostPojo> posts;

    public PostAdapter(List<PostPojo> posts) {
        this.posts = posts;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_student, parent, false);
        return new PostViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        final PostPojo post = posts.get(position);

        Log.d("Post Title", post.title);
        Log.d("Post ID", post.id);
        holder.tvName.setText(post.title);
        holder.tvAge.setText("ID: " + post.id);
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }
}

class PostViewHolder extends RecyclerView.ViewHolder {
    final TextView tvName;
    final TextView tvAge;

    public PostViewHolder(@NonNull View itemView) {
        super(itemView);
        tvName = itemView.findViewById(R.id.tvName);
        tvAge = itemView.findViewById(R.id.tvAge);
    }
}
