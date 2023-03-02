package com.example.myapplication.dashboard.profile.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.dashboard.contact.adapter.ContactRecyclerAdapter;
import com.example.myapplication.dashboard.contact.contactpojo.ContactPojo;
import com.example.myapplication.dashboard.profile.profilepojo.ProfilesPojo;

import java.util.ArrayList;

public class ProfileStoryRecyclerAdapter extends RecyclerView.Adapter<ProfileStoryRecyclerAdapter.ViewHolder> {
    ArrayList<ProfilesPojo> arrProfileStory;
    Context context;

    public ProfileStoryRecyclerAdapter(Context context,ArrayList<ProfilesPojo> arrProfileStory) {
        this.arrProfileStory = arrProfileStory;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.profile_row_story,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.profile.setImageResource(arrProfileStory.get(position).profile);
        holder.txtName.setText(arrProfileStory.get(position).fullName);
    }

    @Override
    public int getItemCount() {
        return arrProfileStory.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtName;
        ImageView profile;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.tvFullNameStory);
            profile = itemView.findViewById(R.id.cvProfilePhotoStory);
        }
    }
}
