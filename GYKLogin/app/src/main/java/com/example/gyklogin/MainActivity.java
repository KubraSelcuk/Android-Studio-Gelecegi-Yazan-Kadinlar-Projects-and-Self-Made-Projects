package com.example.gyklogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etEmail;
    EditText etPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!TextUtils.isEmpty(etEmail.getText())
                        && !TextUtils.isEmpty(etPassword.getText())){


                    if(etEmail.getText().toString().equals("a@b.com")
                    && etPassword.getText().toString().equals("123")){
                        startActivity(new Intent(MainActivity.this, ListActivity.class));
                    }else{
                        Toast.makeText(MainActivity.this, "E-posta adresi veya şifre yanlış", Toast.LENGTH_SHORT).show();
                    }

                }else{
                    Toast.makeText(MainActivity.this, "Lütfen tüm alanları doldurun", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
