package com.example.uygulama2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.Uygulama2.R;

public class CallActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);
        final EditText etTelNo;


        etTelNo = findViewById(R.id.etTelno);
        Button btnAra = findViewById(R.id.btnAra);

        btnAra.setOnClickListener(new View.OnClickListener()
        {

            @Override

            public void onClick(View view)
            {

                callNumber(etTelNo.getText().toString());


            }
        });


    }


    public void callNumber(String phoneNumber)
    {

        Intent intent = new Intent(Intent.ACTION_DIAL);

        intent.setData(Uri.parse("tel:" + phoneNumber));

        if (intent.resolveActivity(getPackageManager()) != null)
        {

            startActivity(intent);
        }
    }
}




