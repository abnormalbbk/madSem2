package com.example.myapplication.student;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentViewHolder> {
    final List<StudentPojo> students;

    public StudentAdapter(List<StudentPojo> students) {
        this.students = students;
    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_student, parent, false);
        return new StudentViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        final StudentPojo student = students.get(position);

        holder.tvName.setText(student.name);
        holder.tvAge.setText(student.age + " years");
    }

    @Override
    public int getItemCount() {
        return students.size();
    }
}

class StudentViewHolder extends RecyclerView.ViewHolder {
    final TextView tvName;
    final TextView tvAge;

    public StudentViewHolder(@NonNull View itemView) {
        super(itemView);
        tvName = itemView.findViewById(R.id.tvName);
        tvAge = itemView.findViewById(R.id.tvAge);
    }
}
