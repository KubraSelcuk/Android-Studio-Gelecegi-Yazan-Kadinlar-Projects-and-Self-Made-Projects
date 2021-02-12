package com.turkcell.gyk401.adapters;

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
import com.turkcell.gyk401.R;
import com.turkcell.gyk401.models.Yemek;

import java.util.List;

public class YemekAdapter extends BaseAdapter {


    private LayoutInflater layoutInflater;
    private List<Yemek> yemekList;
    private Activity mActivity;

    public YemekAdapter(List<Yemek> yemekList, Activity mActivity) {
        this.yemekList = yemekList;
        this.mActivity = mActivity;
        layoutInflater = (LayoutInflater) mActivity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return yemekList.size();
    }

    @Override
    public Object getItem(int i) {
        return yemekList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View satirView = layoutInflater.inflate(R.layout.item_yemek, null);

        ImageView ivPhoto = satirView.findViewById(R.id.ivPhoto);
        TextView tvName = satirView.findViewById(R.id.tvName);
        TextView tvKcal = satirView.findViewById(R.id.tvKcal);

        Yemek yemek = yemekList.get(i);

        tvName.setText(yemek.getName());
        tvKcal.setText(yemek.getKcal()+" Kcal");
        Glide.with(mActivity)
                .load(yemek.getPhoto())
                .apply(RequestOptions.circleCropTransform())
                .into(ivPhoto);

        return satirView;
    }
}
