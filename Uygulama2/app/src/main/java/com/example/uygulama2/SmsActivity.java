package com.example.uygulama2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.Uygulama2.R;

public class SmsActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);


        final EditText etTelno, etMesaj;
        etTelno = findViewById(R.id.etTelno);
        etMesaj = findViewById(R.id.etMesaj);

        Button btnGonder = findViewById(R.id.btnGonder);
        btnGonder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendSms(etTelno.getText().toString(),etMesaj.getText().toString());
            }
        });
    }

    private void sendSms(String telefon, String mesaj) {


        Uri uri = Uri.parse("smsto:"+telefon);
        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
        intent.putExtra("sms_body", mesaj);
        startActivity(intent);
    }
}
