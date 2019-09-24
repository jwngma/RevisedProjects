package com.practice.reviseproject.AndroidPermission.MultiplePermissionRequest;

import android.Manifest;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.practice.reviseproject.R;

import java.util.ArrayList;
import java.util.List;

public class MultiplePermissionActivity extends AppCompatActivity {
    private String[] appsPermissions = {Manifest.permission.CAMERA,
            Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.ACCESS_NETWORK_STATE};
    private static final int REQUEST_PERMISSION = 222;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_permission);
    }

    public void ReqMultiplePermission(View view) {
        initPermission();

    }

    private void initPermission() {
        if (checkAndRequsetPermissions()){
            initToast();
        }
    }

    private void initToast() {
        Toast.makeText(this, "All teh Permissions Are Granted Already", Toast.LENGTH_SHORT).show();
    }

    private boolean checkAndRequsetPermissions() {
        List<String> listOfPermissionsNeeded = new ArrayList<>();

        for (String perms : appsPermissions) {
            if (ContextCompat.checkSelfPermission(this, perms) != PackageManager.PERMISSION_GRANTED) {
                listOfPermissionsNeeded.add(perms);
            }
        }

        if (!listOfPermissionsNeeded.isEmpty()) {
            ActivityCompat.requestPermissions(this,
                    listOfPermissionsNeeded.toArray(new String[listOfPermissionsNeeded.size()]), REQUEST_PERMISSION);
            return  false;
        }
        return true;
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode==REQUEST_PERMISSION ){
            if (grantResults.length>0 && grantResults[0]==PackageManager.PERMISSION_GRANTED){

            }
        }
    }
}

