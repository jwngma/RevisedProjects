package com.practice.reviseproject.Progressbar;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.practice.reviseproject.R;

public class AlertProgressActivity extends AppCompatActivity {
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_progress);
        progressDialog= new ProgressDialog(this);
    }

    public void AlertDialog(View view) {
        progressDialog.setTitle("mndb0");
        progressDialog.setMessage("dfjhjk");
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.show();

    }
}
