package com.practice.reviseproject.PopupMenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.practice.reviseproject.R;

public class PopupMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_menu);
    }

    public void PopupMenu(View view) {

        PopupMenu popupMenu = new PopupMenu(this, view);
       MenuInflater menuInflater = popupMenu.getMenuInflater();
       menuInflater.inflate(R.menu.floaqting_contextual_menu, popupMenu.getMenu());
       popupMenu.getMenuInflater().inflate(R.menu.floaqting_contextual_menu,popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
           public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.delete:
                        Toast.makeText(PopupMenuActivity.this, "Toatingg", Toast.LENGTH_SHORT).show();
                }
                return true;
            }
       });
        popupMenu.show();

    }
}
