package com.example.myapplication.dashboard.contact;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.myapplication.R;
import com.example.myapplication.dashboard.contact.adapter.ContactRecyclerAdapter;
import com.example.myapplication.dashboard.contact.contactpojo.ContactPojo;

import java.util.ArrayList;


public class ContactFragment extends Fragment {
    RecyclerView recyclerView;
    Activity context;
ArrayList<ContactPojo> contactPojo = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        context = getActivity();
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contact, container, false);

    }

    @Override
    public void onStart() {
        super.onStart();

        recyclerView = context.findViewById(R.id.recyclerContact);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        contactPojo.add(new ContactPojo(R.mipmap.ic_six,R.drawable.ic_delete,"Paurakh Saud","9848848488"));
        contactPojo.add(new ContactPojo(R.mipmap.ic_six,R.drawable.ic_delete,"Yair Valencia","9848848488"));
        contactPojo.add(new ContactPojo(R.mipmap.ic_six,R.drawable.ic_delete,"Camden Khan","9848848488"));
        contactPojo.add(new ContactPojo(R.mipmap.ic_six,R.drawable.ic_delete,"Braylen Park","9848848488"));
        contactPojo.add(new ContactPojo(R.mipmap.ic_six,R.drawable.ic_delete,"Bernard Marks","9848848488"));
        contactPojo.add(new ContactPojo(R.mipmap.ic_six,R.drawable.ic_delete,"Francisco Boyle","9848848488"));
        contactPojo.add(new ContactPojo(R.mipmap.ic_six,R.drawable.ic_delete,"Jadiel Woodard","9848848488"));
        contactPojo.add(new ContactPojo(R.mipmap.ic_six,R.drawable.ic_delete,"Finley Davis","9848848488"));
        contactPojo.add(new ContactPojo(R.mipmap.ic_six,R.drawable.ic_delete,"Ross Shea","9848848488"));
        contactPojo.add(new ContactPojo(R.mipmap.ic_six,R.drawable.ic_delete,"Heidi Khan","9848848488"));
        contactPojo.add(new ContactPojo(R.mipmap.ic_six,R.drawable.ic_delete,"Juan Shea","9848848488"));
        contactPojo.add(new ContactPojo(R.mipmap.ic_six,R.drawable.ic_delete,"Alessandro Day","9848848488"));
        contactPojo.add(new ContactPojo(R.mipmap.ic_six,R.drawable.ic_delete,"Kassandra Mcgee","9848848488"));
        contactPojo.add(new ContactPojo(R.mipmap.ic_six,R.drawable.ic_delete,"Cindy Mack","9848848488"));
        contactPojo.add(new ContactPojo(R.mipmap.ic_six,R.drawable.ic_delete,"Troy Walker","9848848488"));
        contactPojo.add(new ContactPojo(R.mipmap.ic_six,R.drawable.ic_delete,"Moss Allen","9848848488"));
        ContactRecyclerAdapter adapter = new ContactRecyclerAdapter(context, contactPojo);
        recyclerView.setAdapter(adapter);

    }
}