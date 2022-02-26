package com.example.androidncde3.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.androidncde3.Entity.SanPham;

import java.util.List;

@Dao
public interface SanPhamDAO {
    @Query("SELECT *  FROM SanPham")
    List<SanPham> getAllSanPham();

    @Insert
    void insert(SanPham... sanPhams);

    @Update
    void update(SanPham... sanPhams);

    @Delete
    void delete(SanPham sanPham);
}
