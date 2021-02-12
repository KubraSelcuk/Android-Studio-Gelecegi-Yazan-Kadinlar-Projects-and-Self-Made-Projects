package com.example.myproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.MyProject.R;

public class MainActivity extends AppCompatActivity {
    EditText etEposta ;
    EditText etSifre;
    Button btnGiris;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

          etEposta = findViewById(R.id.etEposta);
         etSifre = findViewById(R.id.etSifre);
         btnGiris = findViewById(R.id.btnGiris);


        btnGiris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!TextUtils.isEmpty(etEposta.getText())
                        && !TextUtils.isEmpty(etSifre.getText())) {


                    if(etEposta.getText().toString().equals("a@b.com")
                            && etSifre.getText().toString().equals("123"))
                    {

                        Intent intent = new Intent(MainActivity.this, ListActivity.class);
                        intent.putExtra("eposta", etEposta.getText().toString());
                        startActivity(intent);
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Tüm alanların doldurulmasi gerekiyor", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
        btnGiris=findViewById(R.id.btnGiris);
    }
}

