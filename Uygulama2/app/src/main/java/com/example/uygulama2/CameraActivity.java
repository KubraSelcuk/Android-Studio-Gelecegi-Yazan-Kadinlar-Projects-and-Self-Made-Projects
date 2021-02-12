package com.example.uygulama2;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.Uygulama2.R;

public class CameraActivity extends AppCompatActivity {

    VideoView vwVideo;
    ImageView ivPhoto;
    Button btnFotograf, btnVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        vwVideo = findViewById(R.id.vwVideo);
        ivPhoto = findViewById(R.id.ivPhoto);

        btnFotograf = findViewById(R.id.btnFotograf);
        btnVideo = findViewById(R.id.btnVideo);


        btnFotograf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                takePhoto();
            }
        });

        btnVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                recordVideo();
            }
        });

    }

    private void takePhoto(){
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, 101);
    }

    private void recordVideo(){
        Intent intent = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
        startActivityForResult(intent, 102);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode != RESULT_OK) return;

        switch (requestCode){
            case 101:
                ivPhoto.setImageBitmap((Bitmap) data.getExtras().get("data"));
                break;
            case 102:
                vwVideo.setVideoURI(data.getData());
                vwVideo.setMediaController(new MediaController(this));
                vwVideo.requestFocus();
                vwVideo.start();
                break;
            default:
                break;
        }


    }

}
