package com.practice.reviseproject.BroadCastReceivers.orderedBroadCastReceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class OrderBroadcastReceiver3 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "ORDER BROADCAST RECEIVER 3 IS TRIGGERED", Toast.LENGTH_SHORT).show();
    }
}
