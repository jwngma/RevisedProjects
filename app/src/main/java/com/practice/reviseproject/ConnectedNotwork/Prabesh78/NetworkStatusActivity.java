package com.practice.reviseproject.ConnectedNotwork.Prabesh78;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.practice.reviseproject.R;

public class NetworkStatusActivity extends AppCompatActivity {

    private ConnectivityManager connectivityManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_network_status);

        connectivityManager=(ConnectivityManager)getSystemService(CONNECTIVITY_SERVICE);
    }

    public void NetworkStatus(View view) {
        NetworkInfo networkInfo=connectivityManager.getActiveNetworkInfo();
        if (networkInfo!=null && networkInfo.isConnected()){
            Toast.makeText(this, "Connected ", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Not Connected to anyting", Toast.LENGTH_SHORT).show();
        }


    }

    public void GetNetworkInfoType(View view) {

        NetworkInfo wifiInfo=connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        NetworkInfo dataInfo=connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);

        if (wifiInfo.isConnected()){
            Toast.makeText(this, "Wifi is conn", Toast.LENGTH_SHORT).show();
        }
        else if (dataInfo.isConnected()){
            Toast.makeText(this, "Mobile is conn", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Not Connected to any network", Toast.LENGTH_SHORT).show();
        }

    }
}
