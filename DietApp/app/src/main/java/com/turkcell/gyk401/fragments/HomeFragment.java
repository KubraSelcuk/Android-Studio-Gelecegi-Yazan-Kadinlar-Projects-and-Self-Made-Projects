package com.turkcell.gyk401.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.turkcell.gyk401.R;


public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    private EditText etLength, etWeight;
    private TextView tvResult;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        tvResult = view.findViewById(R.id.tvResult);
        etLength = view.findViewById(R.id.etLength);
        etWeight = view.findViewById(R.id.etWeight);
        Button btnHesapla = view.findViewById(R.id.btnHesapla);
        btnHesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hesapla(Float.parseFloat(etLength.getText().toString()),
                        Float.parseFloat(etWeight.getText().toString()));
            }
        });

        return view;
    }

    private void hesapla(float length, float weight) {

        length = length / 100;
        float sonuc = (float) (weight / Math.pow(length, 2));

        String result = "";

        if (sonuc <= 18.4f) {
            result = "Zayıf";
        } else if (sonuc >= 18.5f && sonuc < 24.9f) {
            result = "Normal";
        } else if (sonuc >= 25f && sonuc < 29.9f) {
            result = "Fazla Kilolu";
        } else if (sonuc > 30.0f && sonuc < 34.9f) {
            result = "Şişman 1. Sınıf";
        } else if (sonuc > 35.0f && sonuc < 44.9f) {
            result = "Şişman 2. Sınıf";
        } else {
            result = "Şişman 3. Sınıf";
        }

        tvResult.setText(result);

    }


}
