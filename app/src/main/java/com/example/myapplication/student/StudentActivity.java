package com.example.myapplication.student;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class StudentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        RecyclerView rvStudents = findViewById(R.id.rvStudents);
        StudentAdapter adapter = new StudentAdapter(getStudents());
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        rvStudents.setAdapter(adapter);
        rvStudents.setLayoutManager(layoutManager);
    }

    public List<StudentPojo> getStudents() {
        List<StudentPojo> students = new ArrayList<>();
        students.add(new StudentPojo("Ram Dai", 23));
        students.add(new StudentPojo("Shyam Dai", 24));
        students.add(new StudentPojo("Sita Didi", 26));
        students.add(new StudentPojo("Gita Didi", 24));
        students.add(new StudentPojo("Rita Bahini", 16));
        students.add(new StudentPojo("Hari Dai", 24));
        students.add(new StudentPojo("Maya Bahini", 18));
        students.add(new StudentPojo("John Dai", 22));
        students.add(new StudentPojo("Sani Bahini", 16));
        students.add(new StudentPojo("Sano Dai", 18));
        students.add(new StudentPojo("Thuli Bahini", 26));
        return students;
    }
}