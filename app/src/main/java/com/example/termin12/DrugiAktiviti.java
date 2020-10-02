package com.example.termin12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;

public class DrugiAktiviti extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drugi_aktiviti);
    }
        //Zahtev da 'otvorimo' kameru
        static final int CAMERA_PIC_REQUEST = 0;
        public void btnOpenCameraClicked(View v) {
            Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(cameraIntent, CAMERA_PIC_REQUEST);
        }
        @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
            super.onActivityResult(requestCode, resultCode, data);
            if (requestCode == CAMERA_PIC_REQUEST) {
                Bitmap image = (Bitmap) data.getExtras().get("data");
                // do whatever you want with the image now
            }
        }
    }

