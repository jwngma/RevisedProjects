package com.practice.reviseproject.Navigation_Drawer;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.practice.reviseproject.R;

public class NavigationDrawerActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private Toolbar nav_toolbar;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer);
        nav_toolbar = findViewById(R.id.nav_toolbar);
        drawerLayout = findViewById(R.id.drawer);
        navigationView = findViewById(R.id.navigation);

        setupToolbar();
        setupNavigation();
    }

    private void setupToolbar() {
        setSupportActionBar(nav_toolbar);

    }

    private void setupNavigation() {
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, nav_toolbar, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        View nav_header=navigationView.inflateHeaderView(R.layout.header_layout);
        navigationView.setNavigationItemSelectedListener(this);
        addFragment(new FirstFragment());
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        String nav_title= (String) menuItem.getTitle();
        switch (menuItem.getItemId()) {
            case R.id.nav_home:
               addFragment(new FirstFragment());
                closeDrawer();
                break;
            case R.id.nav_home1:

                addFragment(new SecondFragment());
                closeDrawer();
                break;
            case R.id.nav_home5:
                Toast.makeText(this, nav_title+"Home has been clicked", Toast.LENGTH_SHORT).show();
                closeDrawer();
                break;
            case R.id.nav_home3:
                Toast.makeText(this, nav_title+"Home has been clicked", Toast.LENGTH_SHORT).show();
                closeDrawer();
                break;
            case R.id.nav_home4:
                Toast.makeText(this, nav_title+"Home has been clicked", Toast.LENGTH_SHORT).show();
                closeDrawer();
                break;

        }
        return false;
    }

    private void closeDrawer() {
        drawerLayout.closeDrawer(GravityCompat.START);
    }
    private void openDrawer() {
        drawerLayout.openDrawer(GravityCompat.START);
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            closeDrawer();
        }
        else {
            super.onBackPressed();
        }
    }

    private void addFragment(Fragment fragment){
        FragmentManager fragmentManager= getSupportFragmentManager();
        FragmentTransaction transaction= fragmentManager.beginTransaction();
        transaction.replace(R.id.framelayout,fragment);
        transaction.commit();

    }
}
