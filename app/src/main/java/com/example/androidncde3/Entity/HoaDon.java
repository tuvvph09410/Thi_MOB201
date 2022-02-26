package com.example.androidncde3.Entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class HoaDon {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String maSP;
    private int slNhap;
    private int slXuat;
    private int giaNhap;
    private int giaXuat;

    public HoaDon(String maSP, int slNhap, int slXuat, int giaNhap, int giaXuat) {
        this.maSP = maSP;
        this.slNhap = slNhap;
        this.slXuat = slXuat;
        this.giaNhap = giaNhap;
        this.giaXuat = giaXuat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public int getSlNhap() {
        return slNhap;
    }

    public void setSlNhap(int slNhap) {
        this.slNhap = slNhap;
    }

    public int getSlXuat() {
        return slXuat;
    }

    public void setSlXuat(int slXuat) {
        this.slXuat = slXuat;
    }

    public int getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(int giaNhap) {
        this.giaNhap = giaNhap;
    }

    public int getGiaXuat() {
        return giaXuat;
    }

    public void setGiaXuat(int giaXuat) {
        this.giaXuat = giaXuat;
    }
}
