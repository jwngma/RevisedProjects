package com.practice.reviseproject.ContextualActionMode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.practice.reviseproject.R;

public class ContextualAtionModeActivity extends AppCompatActivity {
    private ImageView context_image;
    private ActionMode actionMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contextual_ation_mode);

        context_image = findViewById(R.id.context_image);
        context_image.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (actionMode != null) {
                    return false;
                } else {
                    actionMode = ContextualAtionModeActivity.this.startActionMode(callback);
                }
                return true;
            }
        });


    }


    private ActionMode.Callback callback = new ActionMode.Callback() {
        @Override
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            getMenuInflater().inflate(R.menu.floaqting_contextual_menu, menu);
            return true;
        }

        @Override
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            mode.setTitle("Item is Selected");
            return true;
        }

        @Override
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            switch (item.getItemId()) {
                case R.id.delete:
                    Toast.makeText(ContextualAtionModeActivity.this, "Delete is Clicked", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.settings:
                    Toast.makeText(ContextualAtionModeActivity.this, "Sett is Clicked", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.help:
                    Toast.makeText(ContextualAtionModeActivity.this, "BHelp is Clicked", Toast.LENGTH_SHORT).show();
                    break;
            }
            return false;
        }

        @Override
        public void onDestroyActionMode(ActionMode mode) {
            actionMode = null;

        }
    };
}
