package com.practice.reviseproject.Recyclerview.Recyclerview_try1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.practice.reviseproject.R;

import java.util.ArrayList;
import java.util.List;

public class Recyclerview_try1Activity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private try_Adapter adapter;
    private List<Model> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview_try1);
        recyclerView = findViewById(R.id.try_recy);
        adapter = new try_Adapter(this, list);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);


        preparedata();
        recyclerView.setAdapter(adapter);
    }

    private void preparedata() {

        Model model = new Model("hgdfehgjrkt", ";jbfvkdfbgklf", "2018");
        list.add(model);

        model = new Model("hgdfehgjrkt", ";jbfvkdfbgklf", "2018");
        list.add(model);
        model = new Model("hgdfehgjrkt", ";jbfvkdfbgklf", "2018");
        list.add(model);
        model = new Model("hgdfehgjrkt", ";jbfvkdfbgklf", "2018");
        list.add(model);
        model = new Model("hgdfehgjrkt", ";jbfvkdfbgklf", "2018");
        list.add(model);
        model = new Model("hgdfehgjrkt", ";jbfvkdfbgklf", "2018");
        list.add(model);
        model = new Model("hgdfehgjrkt", ";jbfvkdfbgklf", "2018");
        list.add(model);
        model = new Model("hgdfehgjrkt", ";jbfvkdfbgklf", "2018");
        list.add(model);
        model = new Model("hgdfehgjrkt", ";jbfvkdfbgklf", "2018");
        list.add(model);
        model = new Model("hgdfehgjrkt", ";jbfvkdfbgklf", "2018");
        list.add(model);
        model = new Model("hgdfehgjrkt", ";jbfvkdfbgklf", "2018");
        list.add(model);
        model = new Model("hgdfehgjrkt", ";jbfvkdfbgklf", "2018");
        list.add(model);
        model = new Model("hgdfehgjrkt", ";jbfvkdfbgklf", "2018");
        list.add(model);
        model = new Model("hgdfehgjrkt", ";jbfvkdfbgklf", "2018");
        list.add(model);
        model = new Model("hgdfehgjrkt", ";jbfvkdfbgklf", "2018");
        list.add(model);
        model = new Model("hgdfehgjrkt", ";jbfvkdfbgklf", "2018");
        list.add(model);
        model = new Model("hgdfehgjrkt", ";jbfvkdfbgklf", "2018");
        list.add(model);
        model = new Model("hgdfehgjrkt", ";jbfvkdfbgklf", "2018");
        list.add(model);
        model = new Model("hgdfehgjrkt", ";jbfvkdfbgklf", "2018");
        list.add(model);
        model = new Model("hgdfehgjrkt", ";jbfvkdfbgklf", "2018");
        list.add(model);
        model = new Model("hgdfehgjrkt", ";jbfvkdfbgklf", "2018");
        list.add(model);
        model = new Model("hgdfehgjrkt", ";jbfvkdfbgklf", "2018");
        list.add(model);
        model = new Model("hgdfehgjrkt", ";jbfvkdfbgklf", "2018");
        list.add(model);
        model = new Model("hgdfehgjrkt", ";jbfvkdfbgklf", "2018");
        list.add(model);
        model = new Model("hgdfehgjrkt", ";jbfvkdfbgklf", "2018");
        list.add(model);
        model = new Model("hgdfehgjrkt", ";jbfvkdfbgklf", "2018");
        list.add(model);
        model = new Model("hgdfehgjrkt", ";jbfvkdfbgklf", "2018");
        list.add(model);
        model = new Model("hgdfehgjrkt", ";jbfvkdfbgklf", "2018");
        list.add(model);
        model = new Model("hgdfehgjrkt", ";jbfvkdfbgklf", "2018");
        list.add(model);
        model = new Model("hgdfehgjrkt", ";jbfvkdfbgklf", "2018");
        list.add(model);
        model = new Model("hgdfehgjrkt", ";jbfvkdfbgklf", "2018");
        list.add(model);
        model = new Model("hgdfehgjrkt", ";jbfvkdfbgklf", "2018");
        list.add(model);
        model = new Model("hgdfehgjrkt", ";jbfvkdfbgklf", "2018");
        list.add(model);
        model = new Model("hgdfehgjrkt", ";jbfvkdfbgklf", "2018");
        list.add(model);
        model = new Model("hgdfehgjrkt", ";jbfvkdfbgklf", "2018");
        list.add(model);
        model = new Model("hgdfehgjrkt", ";jbfvkdfbgklf", "2018");
        list.add(model);model = new Model("hgdfehgjrkt", ";jbfvkdfbgklf", "2018");
        list.add(model);
        model = new Model("hgdfehgjrkt", ";jbfvkdfbgklf", "2018");
        list.add(model);
        model = new Model("hgdfehgjrkt", ";jbfvkdfbgklf", "2018");
        list.add(model);
        model = new Model("hgdfehgjrkt", ";jbfvkdfbgklf", "2018");
        list.add(model);
        model = new Model("hgdfehgjrkt", ";jbfvkdfbgklf", "2018");
        list.add(model);model = new Model("hgdfehgjrkt", ";jbfvkdfbgklf", "2018");
        list.add(model);
        model = new Model("hgdfehgjrkt", ";jbfvkdfbgklf", "2018");
        list.add(model);
        model = new Model("hgdfehgjrkt", ";jbfvkdfbgklf", "2018");
        list.add(model);
        model = new Model("hgdfehgjrkt", ";jbfvkdfbgklf", "2018");
        list.add(model);
        model = new Model("hgdfehgjrkt", ";jbfvkdfbgklf", "2018");
        list.add(model);model = new Model("hgdfehgjrkt", ";jbfvkdfbgklf", "2018");
        list.add(model);
        model = new Model("hgdfehgjrkt", ";jbfvkdfbgklf", "2018");
        list.add(model);
        model = new Model("hgdfehgjrkt", ";jbfvkdfbgklf", "2018");
        list.add(model);
        model = new Model("hgdfehgjrkt", ";jbfvkdfbgklf", "2018");
        list.add(model);
        model = new Model("hgdfehgjrkt", ";jbfvkdfbgklf", "2018");
        list.add(model);




        adapter.notifyDataSetChanged();


    }
}
