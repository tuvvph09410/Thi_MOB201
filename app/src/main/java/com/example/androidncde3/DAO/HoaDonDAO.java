package com.example.androidncde3.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.androidncde3.Entity.HoaDon;

import java.util.List;

@Dao
public interface HoaDonDAO {
    @Query("SELECT *  FROM HoaDon")
    List<HoaDon> getAllHoaDon();

    @Insert
    void insert(HoaDon... hoaDons);

    @Update
    void update(HoaDon... hoaDons);

    @Delete
    void delete(HoaDon hoaDon);
}
