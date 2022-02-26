package com.example.androidncde3.Entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class TheLoai implements Serializable {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String maLSP;

    public TheLoai(String maLSP) {
        this.maLSP = maLSP;
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
}
