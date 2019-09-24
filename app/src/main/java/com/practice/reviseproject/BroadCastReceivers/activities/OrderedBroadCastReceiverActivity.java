package com.practice.reviseproject.BroadCastReceivers.activities;

import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.practice.reviseproject.BroadCastReceivers.orderedBroadCastReceiver.OrderBroadcastReceiver1;
import com.practice.reviseproject.R;

public class OrderedBroadCastReceiverActivity extends AppCompatActivity {

    OrderBroadcastReceiver1 orderBroadcastReceiver1= new OrderBroadcastReceiver1();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ordered_broad_cast_receiver);

        IntentFilter intentFilter= new IntentFilter("com.practice.reviseproject.BroadCastReceivers.package.123");
        //intentFilter.addAction("com.practice.reviseproject.BroadCastReceivers.package.123");
        registerReceiver(orderBroadcastReceiver1, intentFilter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(orderBroadcastReceiver1);
    }
}
