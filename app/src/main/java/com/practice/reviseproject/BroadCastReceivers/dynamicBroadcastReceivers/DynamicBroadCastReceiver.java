package com.practice.reviseproject.BroadCastReceivers.dynamicBroadcastReceivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.widget.Toast;

public class DynamicBroadCastReceiver  extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        if (ConnectivityManager.CONNECTIVITY_ACTION.equals(intent.getAction())){

            boolean NoConnectivity= intent.getBooleanExtra(ConnectivityManager.EXTRA_NO_CONNECTIVITY, false);
            
            if (NoConnectivity){
                Toast.makeText(context, " No Connectivity", Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(context, "Connected", Toast.LENGTH_SHORT).show();
            }
        }
        

    }
}
