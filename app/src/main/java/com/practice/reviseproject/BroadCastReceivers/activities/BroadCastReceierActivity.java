package com.practice.reviseproject.BroadCastReceivers.activities;

import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.practice.reviseproject.BroadCastReceivers.dynamicBroadcastReceivers.DynamicBroadCastReceiver;
import com.practice.reviseproject.R;

public class BroadCastReceierActivity extends AppCompatActivity {

    DynamicBroadCastReceiver dynamicBroadCastReceiver = new DynamicBroadCastReceiver();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broad_cast_receier);
    }

    @Override
    protected void onStart() {
        super.onStart();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);
        registerReceiver(dynamicBroadCastReceiver, intentFilter);
    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(dynamicBroadCastReceiver);
    }
}
