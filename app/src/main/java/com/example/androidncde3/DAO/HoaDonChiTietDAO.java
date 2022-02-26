package com.example.androidncde3.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.androidncde3.Entity.HoaDonChiTiet;

import java.util.List;

@Dao
public interface HoaDonChiTietDAO {
    @Query("SELECT *  FROM HoaDonChiTiet")
    List<HoaDonChiTiet> getAllHoaDonChiTiet();

    @Insert
    void insert(HoaDonChiTiet... hoaDonChiTiets);

    @Update
    void update(HoaDonChiTiet... hoaDonChiTiets);

    @Delete
    void delete(HoaDonChiTiet hoaDonChiTiet);
}
