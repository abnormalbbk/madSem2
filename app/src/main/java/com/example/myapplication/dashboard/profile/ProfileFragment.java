package com.example.myapplication.dashboard.profile;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.myapplication.R;
import com.example.myapplication.dashboard.contact.adapter.ContactRecyclerAdapter;
import com.example.myapplication.dashboard.contact.contactpojo.ContactPojo;
import com.example.myapplication.dashboard.profile.adapter.ProfileStoryRecyclerAdapter;
import com.example.myapplication.dashboard.profile.profilepojo.ProfilesPojo;

import java.util.ArrayList;


public class ProfileFragment extends Fragment {
    Activity context;
    ArrayList<ProfilesPojo> storyProfiles = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        context = getActivity();
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        RecyclerView recyclerView = context.findViewById(R.id.recyclerProfileStories);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayout.HORIZONTAL,false));
        storyProfiles.add(new ProfilesPojo(R.mipmap.ic_five,"Paurakh Saud "));
        storyProfiles.add(new ProfilesPojo(R.mipmap.ic_seven,"Yair Valencia "));
        storyProfiles.add(new ProfilesPojo(R.mipmap.ic_six,"Yair Valencia"));
        storyProfiles.add(new ProfilesPojo(R.mipmap.ic_eight,"Camden Khan"));
        storyProfiles.add(new ProfilesPojo(R.mipmap.ic_six,"Braylen Park"));
        storyProfiles.add(new ProfilesPojo(R.mipmap.ic_five,"Bernard Marks"));
        storyProfiles.add(new ProfilesPojo(R.mipmap.ic_six,"Francisco Boyle"));
        storyProfiles.add(new ProfilesPojo(R.mipmap.ic_seven,"Jadiel Woodard"));
        storyProfiles.add(new ProfilesPojo(R.mipmap.ic_six,"Finley Davis"));
        storyProfiles.add(new ProfilesPojo(R.mipmap.ic_six,"Ross Shea"));
        storyProfiles.add(new ProfilesPojo(R.mipmap.ic_seven,"Heidi Khan"));
        storyProfiles.add(new ProfilesPojo(R.mipmap.ic_six,"Yair Valencia "));

        ProfileStoryRecyclerAdapter adapter = new ProfileStoryRecyclerAdapter(context,storyProfiles);
        recyclerView.setAdapter(adapter);

    }
}