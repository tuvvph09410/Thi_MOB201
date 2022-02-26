package com.example.androidncde3.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.androidncde3.Entity.TheLoai;

import java.util.List;

@Dao
public interface TheLoaiDAO {
    @Query("SELECT *  FROM TheLoai")
    List<TheLoai> getAllTheLoai();

    @Insert
    void insert(TheLoai... theLoai);

    @Update
    void update(TheLoai... theLoai);

    @Delete
    void delete(TheLoai theLoai);
}
