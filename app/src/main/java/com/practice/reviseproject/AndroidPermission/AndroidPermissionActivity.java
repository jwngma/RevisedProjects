package com.practice.reviseproject.AndroidPermission;

import android.Manifest;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.practice.reviseproject.R;

public class AndroidPermissionActivity extends AppCompatActivity {
    private Button reqBtn;
    private static final int ReqPermission = 222;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_permission);
        reqBtn = findViewById(R.id.req_btn);
        reqBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= 23) {
                    if (ContextCompat.checkSelfPermission(AndroidPermissionActivity.this,
                            Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(AndroidPermissionActivity.this, "The Permission is already Granterd", Toast.LENGTH_SHORT).show();

                    } else {
                        requestPermission();

                    }
                }
            }
        });
    }

    private void requestPermission() {

        if (ActivityCompat.shouldShowRequestPermissionRationale(AndroidPermissionActivity.this, Manifest.permission.WRITE_EXTERNAL_STORAGE)) {

            new AlertDialog.Builder(this)
                    .setTitle("Permission Requset")
                    .setMessage("Your need to grant the permission to use this feature")
                    .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            ActivityCompat.requestPermissions(AndroidPermissionActivity.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}
                                    , ReqPermission);
                        }
                    })
                    .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    }).create().show();

        } else {
            ActivityCompat.requestPermissions(AndroidPermissionActivity.this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, ReqPermission);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode == ReqPermission && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

            Toast.makeText(this, "Permission Granted", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Denied", Toast.LENGTH_SHORT).show();
        }
    }
}