package com.practice.reviseproject.ConnectedNotwork;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.practice.reviseproject.R;

public class NetworkCheckingActivity extends AppCompatActivity {
    private TextView wifi_text, data_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_network_checking);
        wifi_text = findViewById(R.id.wifi);
        data_text = findViewById(R.id.data);

        if (CheckIfConnected()){
            wifi_text.setText("Wifi or data is connected");
            data_text.setText("Data or wifi is connected");

        }
        else {

            wifi_text.setText("Wifi or data is not connected");
            data_text.setText("Data or wifi is not connected");

        }


    }

    private boolean CheckIfConnected() {
        boolean have_wifi = false;
        boolean have_data = false;

        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(CONNECTIVITY_SERVICE);
        NetworkInfo[] networkInfos = connectivityManager.getAllNetworkInfo();

        for (NetworkInfo infos : networkInfos) {
            if (infos.getTypeName().equalsIgnoreCase("Wifi")){
                have_wifi=true;
            }
            if (infos.getTypeName().equalsIgnoreCase("Mobile")){
                have_data=true;
            }

        }

        return have_data|have_wifi;
    }
}
