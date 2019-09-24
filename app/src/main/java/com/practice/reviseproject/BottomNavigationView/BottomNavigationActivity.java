package com.practice.reviseproject.BottomNavigationView;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

import com.practice.reviseproject.R;

public class BottomNavigationActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;
    private Toolbar mtoolbar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);
        bottomNavigationView=findViewById(R.id.bottom_nav);
        mtoolbar=findViewById(R.id.bot_toolbar);
        setSupportActionBar(mtoolbar);
        getSupportActionBar().setTitle("Bottom Toolbar");

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.bot_home:
                        Toast.makeText(BottomNavigationActivity.this, "Home is Tapped", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.bot_account:
                        Toast.makeText(BottomNavigationActivity.this, "Accont Tapped", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.bot_setting:
                        Toast.makeText(BottomNavigationActivity.this, "Setting si Tapped", Toast.LENGTH_SHORT).show();
                        break;
                }

                return  true;
            }
        });
    }
}
