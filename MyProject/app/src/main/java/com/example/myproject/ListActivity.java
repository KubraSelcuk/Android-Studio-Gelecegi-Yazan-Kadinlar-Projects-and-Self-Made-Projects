package com.example.myproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.MyProject.R;
import com.example.myproject.adapters.HaberAdapter;
import com.example.myproject.models.Haber;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {
    private String[] ulkeler =
            {"Türkiye", "Almanya", "Avusturya", "Amerika","İngiltere",
                    "Macaristan", "Yunanistan", "Rusya", "Suriye", "İran", "Irak",
                    "Şili", "Brezilya", "Japonya", "Portekiz", "İspanya",
                    "Makedonya", "Ukrayna", "İsvicre"};

    List<Haber> haberler =  new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ListView listView=findViewById(R.id.listView);

        haberler.add(new Haber("Hürriyet",
                "http://www.hurriyet.com.tr",
                "http://s.hurriyet.com.tr/static/images/common/hurriyet/logo/hurriyet-logo2018.png"));

        haberler.add(new Haber("A haber",
                "http://www.ahaber.com.tr",
                "https://iahbr.tmgrup.com.tr/site/v2/i/ahaber-logo-2.png"));

        haberler.add(new Haber(" Son Haber",
                        "http://www.sonhaber.com.tr",
                        "https://icdn.ensonhaber.com/resimler/Assets/v2/images/ensonhaber-logo.png"));

        haberler.add(new Haber("Sabah",
                "http://www.sabah.com.tr",
                "https://isbh.tmgrup.com.tr/sbh/site/v3/i/sabah-logo-170x71.png"));

        HaberAdapter adapter =new HaberAdapter(this,haberler);
        listView.setAdapter(adapter);
/*
        ArrayAdapter<String> veriAdaptoru=new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, android.R.id.text1, ulkeler);

        listView.setAdapter(veriAdaptoru); */





    }
}
