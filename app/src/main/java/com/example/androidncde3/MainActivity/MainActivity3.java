package com.example.androidncde3.MainActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidncde3.Adapter.AdapterListViewButton5;
import com.example.androidncde3.Entity.HoaDonChiTiet;
import com.example.androidncde3.R;

import java.util.List;

public class MainActivity3 extends AppCompatActivity {
    private List<HoaDonChiTiet> hoaDonChiTietList;
    private AdapterListViewButton5 adapterListViewButton5;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent intent = getIntent();
        hoaDonChiTietList = (List<HoaDonChiTiet>) intent.getSerializableExtra("hoadonchitiet");
        adapterListViewButton5 = new AdapterListViewButton5(hoaDonChiTietList, getApplicationContext());
        listView = findViewById(R.id.listViewButton5);
        listView.setAdapter(adapterListViewButton5);


    }
}