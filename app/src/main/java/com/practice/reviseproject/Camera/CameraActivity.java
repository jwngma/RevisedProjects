package com.practice.reviseproject.Camera;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.practice.reviseproject.R;

import java.io.File;
import java.net.URI;

public class CameraActivity extends AppCompatActivity {
    private ImageView camera_image;
    private static final int cameraRequest = 22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        camera_image = findViewById(R.id.camera_image);
    }

    public void Capture(View view) {
        Intent cameraintent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        File file = getFile();
        cameraintent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(file));
        startActivityForResult(cameraintent, cameraRequest);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode==cameraRequest && resultCode==RESULT_OK && data!=null){
            
        }
    }

    private File getFile() {

        File folder = new File("sdcard/camera_app");
        if (!folder.exists()) {
            folder.mkdir();
        }
        File image_file = new File(folder, "cam_image.jpg");
        return image_file;
    }
}
