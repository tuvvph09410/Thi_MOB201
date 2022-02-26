package com.example.androidncde3.MainActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidncde3.Adapter.AdapterListView;
import com.example.androidncde3.Entity.HoaDonChiTiet;
import com.example.androidncde3.Entity.TheLoai;
import com.example.androidncde3.R;

import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    ListView listView;
    AdapterListView adapterListView;
    List<HoaDonChiTiet> hoaDonChiTietList;
    List<TheLoai> theLoaiList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listView = findViewById(R.id.listView);
        Intent intent = getIntent();
        hoaDonChiTietList = (List<HoaDonChiTiet>) intent.getSerializableExtra("hoadonchitiet");
        theLoaiList = (List<TheLoai>) intent.getSerializableExtra("theloai");
        HoaDonChiTiet hoaDonChiTiet = hoaDonChiTietList.get(0);
        Log.d("hoaDonChiTiet", hoaDonChiTiet.getMaSP());
        adapterListView = new AdapterListView(hoaDonChiTietList, getApplicationContext(), theLoaiList);
        listView.setAdapter(adapterListView);
    }
}