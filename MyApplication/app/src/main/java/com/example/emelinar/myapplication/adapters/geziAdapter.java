package com.example.emelinar.myapplication.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.emelinar.myapplication.R;
import com.example.emelinar.myapplication.models.gezi;
import com.example.emelinar.myapplication.models.gezi;

import java.util.List;

public class geziAdapter extends BaseAdapter {

    private LayoutInflater layoutInflater;
    private List<gezi> geziList;
    private Activity mActivity;


    public geziAdapter(List<gezi> geziList, Activity mActivity) {
        this.geziList = geziList;
        this.mActivity = mActivity;
        layoutInflater = (LayoutInflater) mActivity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return geziList.size();
    }

    @Override
    public Object getItem(int i) {
        return geziList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        View satirView = layoutInflater.inflate(R.layout.item_gezi, null);

        //burası değiştirilecek
        ImageView ivFoto = satirView.findViewById(R.id.ivFoto);
        TextView tvYazi = satirView.findViewById(R.id.tvYazi);
        TextView tvGezi = satirView.findViewById(R.id.tvGezi);

        gezi gezi = geziList.get(i);
        tvYazi.setText(gezi.getyazi());
        tvGezi.setText(gezi.getgezi());
        Glide.with(mActivity).load(gezi.getfoto()).apply(RequestOptions.circleCropTransform()).into(ivFoto);

        return satirView;
    }
}
