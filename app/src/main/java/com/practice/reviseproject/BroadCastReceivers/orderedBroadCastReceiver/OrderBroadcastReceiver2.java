package com.practice.reviseproject.BroadCastReceivers.orderedBroadCastReceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class OrderBroadcastReceiver2 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "ORDER BROADCAST RECEIVER 2 IS TRIGGERED", Toast.LENGTH_SHORT).show();
    }
}
