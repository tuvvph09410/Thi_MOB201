package com.example.androidncde3.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.androidncde3.Entity.HoaDonChiTiet;
import com.example.androidncde3.R;

import java.util.List;

public class AdapterListViewButton5 extends BaseAdapter {
    private List<HoaDonChiTiet> hoaDonChiTietList;
    private Context context;

    public AdapterListViewButton5(List<HoaDonChiTiet> hoaDonChiTietList, Context context) {
        this.hoaDonChiTietList = hoaDonChiTietList;
        this.context = context;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        if (this.hoaDonChiTietList == null) {
            return 0;
        }
        return this.hoaDonChiTietList.size();
    }

    @Override
    public Object getItem(int position) {
        if (this.hoaDonChiTietList == null) {
            return null;
        }
        return this.hoaDonChiTietList.get(position);
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
            ;
            view = layoutInflater.inflate(R.layout.item_listviewbutton5, null);
            viewHolder.tvTenSp = view.findViewById(R.id.tv_tensp);
            viewHolder.tvSlNhap = view.findViewById(R.id.tv_soluongnhap);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        HoaDonChiTiet hoaDonChiTiet = (HoaDonChiTiet) getItem(position);
        viewHolder.tvTenSp.setText("Mã sản phẩm: " + hoaDonChiTiet.getMaSP());
        viewHolder.tvSlNhap.setText("Số Lượng nhập: " + hoaDonChiTiet.getSlNhap());
        return view;
    }

    public class ViewHolder {
        TextView tvTenSp, tvSlNhap;
    }
}
