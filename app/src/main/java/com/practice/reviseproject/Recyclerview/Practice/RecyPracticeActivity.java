package com.practice.reviseproject.Recyclerview.Practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.practice.reviseproject.R;

import java.util.ArrayList;
import java.util.List;

public class RecyPracticeActivity extends AppCompatActivity {

    private Button oddBtn, EvenBtn;
    private RecyclerView pracRecy;
    private List<String> pojoList = new ArrayList<>();
    private List<String> OddpojoList = new ArrayList<>();

    private PracAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recy_practice);

        oddBtn = findViewById(R.id.oddBtn);
        EvenBtn = findViewById(R.id.evenbtn);

        pracRecy = findViewById(R.id.prac_recy);
        layoutManager = new LinearLayoutManager(this);
        pracRecy.setHasFixedSize(true);
        pracRecy.setLayoutManager(layoutManager);


        oddBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < 100; i++) {
                    if ((i%2)!=0){
                        OddpojoList.add(i+"");
                    }
                }
                adapter = new PracAdapter(RecyPracticeActivity.this, OddpojoList);
                pracRecy.setAdapter(adapter);
            }
        });


        EvenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < 100; i++) {
                    if ((i%2)==0){
                        pojoList.add(i+"");
                    }
                }
                adapter = new PracAdapter(RecyPracticeActivity.this, pojoList);
                pracRecy.setAdapter(adapter);
            }
        });
    }
}
