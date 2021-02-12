package com.example.uygulama2;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;

import com.example.Uygulama2.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnvideo,btnGiris1,btnGiris2,btnGiris3,btnGiris4,btnGiris5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);


        btnvideo=findViewById(R.id.btnvideo);
        btnGiris1=findViewById(R.id.btnGiris1);
        btnGiris2=findViewById(R.id.btnGiris2);
        btnGiris3=findViewById(R.id.btnGiris3);
        btnGiris4=findViewById(R.id.btnGiris4);
        btnGiris5=findViewById(R.id.btnGiris5);

        btnvideo.setOnClickListener(this);
        btnGiris2.setOnClickListener(this);
        btnGiris3.setOnClickListener(this);
        btnGiris4.setOnClickListener(this);
        btnGiris5.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {

if(view == btnvideo){

    startActivity(new Intent(MainActivity.this, WebActivity.class));
} else if(view == btnGiris1) {

    startActivity(new Intent(MainActivity.this, SmsActivity.class));
}

    }
}
