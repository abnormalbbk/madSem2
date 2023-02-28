package com.example.myapplication.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;

@SuppressWarnings("AndroidUnresolvedRoomSqlReference")
@Dao
public interface UserDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public Completable insertAll(List<User> users);

    @Query("SELECT * FROM user")
    public Single<List<User>> getAllUsers();

    @Query("SELECT * FROM user where id in (:ids)")
    public Single<List<User>> getAllUsersByIds(String[] ids);

    @Query("SELECT * FROM user where first_name LIKE :firstName AND last_name LIKE :lastName")
    public Single<User> getUserByName(String firstName, String lastName);

    @Delete
    public Completable deleteUser(User user);
}
