package com.practice.reviseproject.BroadCastReceivers.prabeesh;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.practice.reviseproject.BroadCastReceivers.prabeesh.adapter.IncomingCallAdapter;
import com.practice.reviseproject.BroadCastReceivers.prabeesh.broadcastReceiver.NumberReceiver;
import com.practice.reviseproject.BroadCastReceivers.prabeesh.model.IncomingNumber;
import com.practice.reviseproject.BroadCastReceivers.prabeesh.sqlite.DbContract;
import com.practice.reviseproject.BroadCastReceivers.prabeesh.sqlite.DbHelper;
import com.practice.reviseproject.R;

import java.util.ArrayList;

public class PrabeeshActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private IncomingCallAdapter adapter;
    private ArrayList<IncomingNumber> numberArrayList = new ArrayList<>();
    private BroadcastReceiver broadcastReceiver;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prabeesh);
        recyclerView = findViewById(R.id.recy_incoming_calls);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new IncomingCallAdapter(numberArrayList, this);
        recyclerView.setAdapter(adapter);
        fetchdata();

        broadcastReceiver= new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                fetchdata();
            }
        };
    }

    private void fetchdata() {
        numberArrayList.clear();
        DbHelper dbHelper = new DbHelper(this);
        SQLiteDatabase database = dbHelper.getWritableDatabase();
        Cursor cursor = dbHelper.readNumbers(database);
        if (cursor.getCount() > 0) {
            while (cursor.moveToNext()) {
                String number;
                String id;
                number = cursor.getString(cursor.getColumnIndex(DbContract.INCOMING_NUMBER));
                id = cursor.getString(cursor.getColumnIndex("id"));
                numberArrayList.add(new IncomingNumber(id, number));
            }

            cursor.close();
            dbHelper.close();
            adapter.notifyDataSetChanged();
            recyclerView.setVisibility(View.VISIBLE);
        }


    }

    @Override
    protected void onResume() {
        super.onResume();
        registerReceiver(broadcastReceiver, new IntentFilter(DbContract.UPDATE_UI_FILTER));
    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(broadcastReceiver);
    }
}
