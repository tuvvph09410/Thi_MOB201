package com.example.androidncde3.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.androidncde3.Entity.HoaDonChiTiet;
import com.example.androidncde3.Entity.TheLoai;
import com.example.androidncde3.R;

import java.util.List;

public class AdapterListView extends BaseAdapter {
    private List<HoaDonChiTiet> hoaDonChiTietList;
    private Context context;
    private List<TheLoai> theLoaiList;

    public AdapterListView(List<HoaDonChiTiet> hoaDonChiTietList, Context context, List<TheLoai> theLoaiList) {
        this.hoaDonChiTietList = hoaDonChiTietList;
        this.context = context;
        this.theLoaiList = theLoaiList;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        if (hoaDonChiTietList == null) {
            return 0;
        }
        return this.hoaDonChiTietList.size();
    }

    @Override
    public Object getItem(int position) {
        if (hoaDonChiTietList == null) {
            return null;
        }
        return hoaDonChiTietList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        ViewHolder viewHolder = null;
        LayoutInflater layoutInflater;
        if (view == null) {
            viewHolder = new ViewHolder();
            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.list_view_item, null);
            viewHolder.textView = view.findViewById(R.id.text);
            viewHolder.textView1 = view.findViewById(R.id.text1);
            viewHolder.textView2 = view.findViewById(R.id.text2);
            viewHolder.textView3 = view.findViewById(R.id.text3);
            viewHolder.textView4 = view.findViewById(R.id.text4);
            viewHolder.textView5 = view.findViewById(R.id.text5);
            viewHolder.textView6 = view.findViewById(R.id.text6);
            viewHolder.textView7 = view.findViewById(R.id.text7);
            view.setTag(viewHolder);

        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        HoaDonChiTiet hoaDonChiTiet = (HoaDonChiTiet) getItem(position);
        TheLoai theLoai = theLoaiList.get(position);
        viewHolder.textView.setText(theLoai.getMaLSP());
        viewHolder.textView1.setText(hoaDonChiTiet.getMaSP());
        viewHolder.textView2.setText(String.valueOf(hoaDonChiTiet.getSlNhap()));
        viewHolder.textView3.setText(String.valueOf(hoaDonChiTiet.getSlXuat()));
        viewHolder.textView4.setText(String.valueOf(hoaDonChiTiet.getGiaNhap()));
        viewHolder.textView5.setText(String.valueOf(hoaDonChiTiet.getGiaXuat()));
        viewHolder.textView6.setText(hoaDonChiTiet.getNgayNhap());
        viewHolder.textView7.setText(hoaDonChiTiet.getNgayXuat());
        return view;
    }

    public class ViewHolder {
        TextView textView, textView1, textView2, textView3, textView4, textView5, textView6, textView7;
    }
}
