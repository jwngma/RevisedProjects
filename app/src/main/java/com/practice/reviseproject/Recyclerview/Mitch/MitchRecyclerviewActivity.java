package com.practice.reviseproject.Recyclerview.Mitch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.practice.reviseproject.R;

public class MitchRecyclerviewActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MitchAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mitch_recyclerview);


        recyclerView=findViewById(R.id.mitch_recy);
        adapter=new MitchAdapter(this, MitchModel.getObjectlist());
        recyclerView.setAdapter(adapter);


        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }
}
