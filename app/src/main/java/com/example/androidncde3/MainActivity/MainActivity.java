package com.example.androidncde3.MainActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import com.example.androidncde3.DAO.HoaDonChiTietDAO;
import com.example.androidncde3.DAO.HoaDonDAO;
import com.example.androidncde3.DAO.SanPhamDAO;
import com.example.androidncde3.DAO.TheLoaiDAO;
import com.example.androidncde3.Entity.HoaDon;
import com.example.androidncde3.Entity.HoaDonChiTiet;
import com.example.androidncde3.Entity.SanPham;
import com.example.androidncde3.Entity.TheLoai;
import com.example.androidncde3.R;
import com.example.androidncde3.RoomDatabase.DatabaseRoom;

import java.io.Serializable;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private EditText edMaLSP, edMaSP, edSlNhap, edSlXuat, edGiaNhap, edGiaXuat, edNgayNhap, edNgayXuat;
    private Button btnAdd, btnListView, btnCreateDatabase, btnTong, btntongSLHang, btntongSLSanPham;
    private DatabaseRoom INSTANCE;
    private List<TheLoai> theLoaiList;
    private List<HoaDonChiTiet> hoaDonChiTietList;
    private TheLoaiDAO theLoaiDAO;
    private SanPhamDAO sanPhamDAO;
    private HoaDonChiTietDAO hoaDonChiTietDAO;
    private HoaDonDAO hoaDonDAO;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.initViewById();

        this.initClickButton();
    }

    private void initDataList() {
        theLoaiDAO = INSTANCE.theLoaiDAO();
        sanPhamDAO = INSTANCE.sanPhamDAO();
        hoaDonDAO = INSTANCE.hoaDonDAO();
        hoaDonChiTietDAO = INSTANCE.hoaDonChiTietDAO();
        theLoaiList = theLoaiDAO.getAllTheLoai();
        hoaDonChiTietList = hoaDonChiTietDAO.getAllHoaDonChiTiet();
    }

    private void initDatabase() {
        INSTANCE = Room.databaseBuilder(this, DatabaseRoom.class, "name_database")
                .allowMainThreadQueries()
                .build();
        this.initDataList();
    }

    private void initClickButton() {
        this.btnCreateDatabase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initDatabase();
                if (INSTANCE == null) {
                    Toast.makeText(getApplicationContext(), "tao bang that bai", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "tao bang thanh cong va ket noi voi data thanh cong", Toast.LENGTH_LONG).show();
                }
            }
        });
        this.btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (INSTANCE == null) {
                    Toast.makeText(getApplicationContext(), "chua ket noi database", Toast.LENGTH_LONG).show();
                } else {
                    String maLSP = edMaLSP.getText().toString();
                    String maSP = edMaSP.getText().toString();
                    String slXuat = edSlXuat.getText().toString();
                    String slNhap = edSlNhap.getText().toString();
                    String giaXuat = edGiaXuat.getText().toString();
                    String giaNhap = edGiaNhap.getText().toString();
                    String ngayNhap = edNgayNhap.getText().toString();
                    String ngayXuat = edNgayXuat.getText().toString();
                    if (maLSP.length() != 0 &&
                            maSP.length() != 0 &&
                            slXuat.length() != 0 &&
                            slNhap.length() != 0 &&
                            giaNhap.length() != 0 &&
                            giaXuat.length() != 0 &&
                            ngayNhap.length() != 0 &&
                            ngayXuat.length() != 0) {
                        try {
                            int slNhapInt = Integer.parseInt(slNhap);
                            int slXuatInt = Integer.parseInt(slXuat);
                            int giaNhapInt = Integer.parseInt(giaNhap);
                            int giaXuatInt = Integer.parseInt(giaXuat);

                            TheLoai theLoai = new TheLoai(maLSP);
                            SanPham sanPham = new SanPham(maLSP, maSP);
                            HoaDon hoaDon = new HoaDon(maSP, slNhapInt, slXuatInt, giaNhapInt, giaXuatInt);
                            HoaDonChiTiet hoaDonChiTiet = new HoaDonChiTiet(maSP, slNhapInt, slXuatInt, giaNhapInt, giaXuatInt, ngayNhap, ngayXuat);
                            theLoaiDAO.insert(theLoai);
                            sanPhamDAO.insert(sanPham);
                            hoaDonDAO.insert(hoaDon);
                            hoaDonChiTietDAO.insert(hoaDonChiTiet);


                            Toast.makeText(getApplicationContext(), "Them Thanh Cong", Toast.LENGTH_LONG).show();
                        } catch (NumberFormatException e) {
                            e.printStackTrace();
                            Toast.makeText(getApplicationContext(), "Sai dinh dang", Toast.LENGTH_LONG).show();
                        }
                    } else {
                        Toast.makeText(getApplicationContext(), "Vui long nhap vao", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
        this.btnListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (INSTANCE == null) {
                    Toast.makeText(getApplicationContext(), "chua ket noi database", Toast.LENGTH_LONG).show();
                } else {
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    intent.putExtra("theloai", (Serializable) theLoaiList);
                    intent.putExtra("hoadonchitiet", (Serializable) hoaDonChiTietList);

                    startActivity(intent);
                }

            }
        });
        this.btnTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (INSTANCE == null) {
                    Toast.makeText(getApplicationContext(), "chua ket noi database", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), String.valueOf(hoaDonChiTietList.size()), Toast.LENGTH_LONG).show();
                }

            }
        });
        this.btntongSLHang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (INSTANCE == null) {
                    Toast.makeText(getApplicationContext(), "Chua ket noi database", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                    intent.putExtra("hoadonchitiet", (Serializable) hoaDonChiTietList);
                    startActivity(intent);
                }
            }
        });
        this.btntongSLSanPham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void initViewById() {
        this.edMaLSP = findViewById(R.id.editTextTextPersonName);
        this.edMaSP = findViewById(R.id.editTextTextPersonName2);
        this.edSlNhap = findViewById(R.id.editTextTextPersonName3);
        this.edSlXuat = findViewById(R.id.editTextTextPersonName4);
        this.edGiaNhap = findViewById(R.id.editTextTextPersonName5);
        this.edGiaXuat = findViewById(R.id.editTextTextPersonName6);
        this.edNgayNhap = findViewById(R.id.editTextTextPersonName7);
        this.edNgayXuat = findViewById(R.id.editTextTextPersonName8);
        this.btnCreateDatabase = findViewById(R.id.button);
        this.btnAdd = findViewById(R.id.button2);
        this.btnListView = findViewById(R.id.button3);
        this.btnTong = findViewById(R.id.button4);
        this.btntongSLHang = findViewById(R.id.button5);
        this.btntongSLSanPham = findViewById(R.id.button6);
    }
}