package com.practice.reviseproject.CollapsingToolbar;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.practice.reviseproject.R;

public class CollapsingToolbarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collapsing_toolbar);

        CollapsingToolbarLayout collapsingToolbarLayout= findViewById(R.id.collapsingToolbarr);
        collapsingToolbarLayout.setTitle("Collapsing Toolbar");

        Toolbar toolbar= findViewById(R.id.toolbarr);
        toolbar.setTitle("Toolbar title");
    }
}
