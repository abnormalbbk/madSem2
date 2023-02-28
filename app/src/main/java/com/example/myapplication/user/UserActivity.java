package com.example.myapplication.user;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.database.AppDatabase;
import com.example.myapplication.database.User;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class UserActivity extends AppCompatActivity {

    private AppDatabase appDatabase;
    private final CompositeDisposable compositeDisposable = new CompositeDisposable();
    private RecyclerView rvStudents;
    private LinearLayoutManager layoutManager;
    private UserRecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        appDatabase = AppDatabase.getInstance(this);

        rvStudents = findViewById(R.id.rvStudents);
        layoutManager = new LinearLayoutManager(this);
        insertUserData()
                .subscribeOn(Schedulers.io())
                .subscribe(new CompletableObserver() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {
                        compositeDisposable.add(d);
                    }

                    @Override
                    public void onComplete() {
                        setRecyclerView();
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {

                    }
                });
    }

    private void setRecyclerView() {
        final Disposable disposable = getUsers()
                .subscribeOn(Schedulers.io())
                .subscribe(users -> {
                    adapter = new UserRecyclerAdapter(users);
                    rvStudents.setAdapter(adapter);
                    rvStudents.setLayoutManager(layoutManager);
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) {
                        Log.e(this.getClass().getSimpleName(), throwable.toString());
                    }
                });
        compositeDisposable.add(disposable);
    }

    private Completable insertUserData() {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "Ram", "Dai"));
        users.add(new User(2, "Shyam", "Dai"));
        users.add(new User(3, "Sita", "Didi"));
        users.add(new User(4, "Gita", "Didi"));
        users.add(new User(5, "Rita", "Bahini"));
        users.add(new User(6, "Hari", "Dai"));
        users.add(new User(7, "Maya", "Bahini"));
        users.add(new User(8, "John", "Dai"));
        users.add(new User(9, "Sani", "Bahini"));
        users.add(new User(10, "Sano", "Dai"));
        users.add(new User(11, "Thuli", "Bahini"));

        return appDatabase.userDao().insertAll(users);
    }


    private Single<List<User>> getUsers() {
        return appDatabase.userDao().getAllUsers();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        compositeDisposable.dispose();
    }
}