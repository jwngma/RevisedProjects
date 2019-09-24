package com.practice.reviseproject.BroadCastReceivers.activities;

import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.practice.reviseproject.BroadCastReceivers.customBroadcastReceiver.CustomBroadCastReceiver;
import com.practice.reviseproject.R;

public class CustomBroadCastReceiverActivity extends AppCompatActivity {


    CustomBroadCastReceiver customBroadCastReceiver= new CustomBroadCastReceiver();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_broad_cast_receiver);

        IntentFilter intentFilter= new IntentFilter();
        intentFilter.addAction("com.practice.reviseproject.BroadCastReceivers.package.123");
        registerReceiver(customBroadCastReceiver, intentFilter);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(customBroadCastReceiver);
    }
}
