package com.example.gyklogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.gyklogin.adapters.HaberAdapter;
import com.example.gyklogin.models.Haber;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    private String[] ulkeler =
            {"Türkiye", "Almanya", "Avusturya", "Amerika","İngiltere",
                    "Macaristan", "Yunanistan", "Rusya", "Suriye", "İran", "Irak",
                    "Şili", "Brezilya", "Japonya", "Portekiz", "İspanya",
                    "Makedonya", "Ukrayna", "İsviçre"};

    List<Haber> haberler = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView listView = findViewById(R.id.listView);

        haberler.add(new Haber("Hürriyet",
                "http://www.hurriyet.com.tr",
                "http://s.hurriyet.com.tr/static/images/common/hurriyet/logo/hurriyet-logo2018.png"));

        HaberAdapter adapter = new HaberAdapter(this, haberler);
        listView.setAdapter(adapter);

        /*
        ArrayAdapter<String> veriAdaptoru=new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, android.R.id.text1, ulkeler);
        listView.setAdapter(veriAdaptoru);*/

    }

}
