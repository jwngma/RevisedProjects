package com.practice.reviseproject.BroadCastReceivers.customBroadcastReceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class CustomBroadCastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        if ("com.practice.reviseproject.BroadCastReceivers.package.123".equals(intent.getAction())){
            String received_text=intent.getStringExtra("key.123");
            Toast.makeText(context, received_text, Toast.LENGTH_SHORT).show();
        }

        
    }
}
