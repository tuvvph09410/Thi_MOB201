package com.example.androidncde3.Entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class SanPham {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String maLSP;
    private String maSP;

    public SanPham(String maLSP, String maSP) {
        this.maLSP = maLSP;
        this.maSP = maSP;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaLSP() {
        return maLSP;
    }

    public void setMaLSP(String maLSP) {
        this.maLSP = maLSP;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }
}
