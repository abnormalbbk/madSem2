package com.example.myapplication.dashboard.contact.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.dashboard.contact.contactpojo.ContactPojo;

import java.util.ArrayList;

public class ContactRecyclerAdapter extends RecyclerView.Adapter<ContactRecyclerAdapter.ViewHolder> {
    ArrayList<ContactPojo> arrContact;
    Context context;
    public ContactRecyclerAdapter(Context context,ArrayList<ContactPojo> arrContact) {
        this.context = context;
        this.arrContact = arrContact;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.contact_column,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.profilePhoto.setImageResource(arrContact.get(position).profilePhoto);
        holder.txtName.setText(arrContact.get(position).fullName);
        holder.txtNumber.setText(arrContact.get(position).phoneNumber);
        holder.bin.setImageResource(arrContact.get(position).deleteImg);
    }

    @Override
    public int getItemCount() {
        return arrContact.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtName, txtNumber;
        ImageView profilePhoto, bin;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.tvFullName);
            txtNumber = itemView.findViewById(R.id.tvNumber);
            profilePhoto = itemView.findViewById(R.id.ivProfilePhoto);
            bin = itemView.findViewById(R.id.ivDelete);
        }
    }
}
