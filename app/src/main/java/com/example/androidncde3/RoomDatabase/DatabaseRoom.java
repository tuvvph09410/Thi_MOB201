package com.example.androidncde3.RoomDatabase;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.androidncde3.DAO.HoaDonChiTietDAO;
import com.example.androidncde3.DAO.HoaDonDAO;
import com.example.androidncde3.DAO.SanPhamDAO;
import com.example.androidncde3.DAO.TheLoaiDAO;
import com.example.androidncde3.Entity.HoaDon;
import com.example.androidncde3.Entity.HoaDonChiTiet;
import com.example.androidncde3.Entity.SanPham;
import com.example.androidncde3.Entity.TheLoai;

@Database(entities = {TheLoai.class, SanPham.class, HoaDon.class, HoaDonChiTiet.class}, version = 5)
public abstract class DatabaseRoom extends RoomDatabase {
    public abstract TheLoaiDAO theLoaiDAO();

    public abstract SanPhamDAO sanPhamDAO();

    public abstract HoaDonDAO hoaDonDAO();

    public abstract HoaDonChiTietDAO hoaDonChiTietDAO();

}
