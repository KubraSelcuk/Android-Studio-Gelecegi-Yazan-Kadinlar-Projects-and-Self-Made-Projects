package com.example.gyklogin.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.bumptech.glide.Glide;
import com.example.gyklogin.R;
import com.example.gyklogin.models.Haber;

import java.util.List;


public class HaberAdapter extends BaseAdapter {

    private LayoutInflater layoutInflater;
    private List<Haber> haberler;
    Activity mActivity;

    public HaberAdapter(Activity activity, List<Haber> haberler){

        layoutInflater = (LayoutInflater) activity
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE); // standart olarak çağırmamız gereken kalıp, globale tanımlıyoruz
        this.haberler = haberler; // MainActivity'de oluşturduğumuz haberler listesini burada globale tanımlıyoruz
        mActivity = activity;
    }

    @Override
    public int getCount() {
        return haberler.size();
    } // adaptörde kaç satır olacağını belirtiyoruz. haberler listesine kaç tane öğe eklediysek o kadar satır olmalı. List genişliğini, kaç adet öğe barındırdığını size() metodu ile çağırıyoruz. Yani haberler.size()

    @Override
    public Object getItem(int i) {
        return haberler.get(i);
    } // İlgili adaptör sırasına karşılık gelen haberler listesindeki sırayı yazarak, gerekli haber nesnesini buluyoruz. Örnek; haberler.get(2) 2. sıradaki haber nesnesini getir demek.

    @Override
    public long getItemId(int i) {
        return i;
    } // Adaptör sırasına bir ID yani kimlik no tanımlamak için. Mevcut sıra numarasını kimlik numarası olarak tanımlamamız yeterli

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View satirView = layoutInflater.inflate(R.layout.item_haber, null); // item_haber layout dosyamızın tanımlamasını yaptık
        Haber haber = haberler.get(i); // haberler listesindeki bu satırda olan haber nesnesini çağırdık.

        ImageView ivLogo = satirView.findViewById(R.id.ivLogo);
        TextView tvTitle = satirView.findViewById(R.id.tvTitle);

        tvTitle.setText(haber.getAdi());
        Glide.with(mActivity).load(haber.getLogo()).into(ivLogo);



        return satirView; // son olarak return komutu ile tanımladığımız satır görünümü ve yazıyı ekranda görüntülenmek üzere gönderiyoruz
    }
}