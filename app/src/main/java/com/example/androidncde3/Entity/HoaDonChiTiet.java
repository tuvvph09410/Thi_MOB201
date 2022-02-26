package com.example.androidncde3.Entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class HoaDonChiTiet implements Serializable {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String maSP;
    private int slNhap;
    private int slXuat;
    private int giaNhap;
    private int giaXuat;
    private String ngayNhap;
    private String ngayXuat;

    public HoaDonChiTiet(String maSP, int slNhap, int slXuat, int giaNhap, int giaXuat, String ngayNhap, String ngayXuat) {
        this.maSP = maSP;
        this.slNhap = slNhap;
        this.slXuat = slXuat;
        this.giaNhap = giaNhap;
        this.giaXuat = giaXuat;
        this.ngayNhap = ngayNhap;
        this.ngayXuat = ngayXuat;
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

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public String getNgayXuat() {
        return ngayXuat;
    }

    public void setNgayXuat(String ngayXuat) {
        this.ngayXuat = ngayXuat;
    }
}
