package com.practice.reviseproject.BroadCastReceivers.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.practice.reviseproject.BroadCastReceivers.explicitBroadCastReceiver.ExplicitBroadcastReceiver;
import com.practice.reviseproject.R;

public class ExplicitBroadcastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_broadcast);
    }

    public void SendBroadCast(View view) {
        Intent intent= new Intent(this, ExplicitBroadcastReceiver.class);
        sendBroadcast(intent);
    }
}
