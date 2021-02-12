package com.example.emelinar.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddNoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);

        final EditText etNot= findViewById(R.id.etNot);
        Button btnEkle = findViewById(R.id.btnEkle);
        btnEkle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!TextUtils.isEmpty(etNot.getText())){
                    notEkle(etNot.getText().toString());
                    etNot.setText("");
                }else{

                }
            }
        });

    }
    private void notEkle(String not){
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        DatabaseReference databaseReference = firebaseDatabase.getReference().child("notlar");
        databaseReference.push().setValue(not);

        Toast.makeText(this, "Eklendi", Toast.LENGTH_SHORT).show();
        finish();
    }

}
