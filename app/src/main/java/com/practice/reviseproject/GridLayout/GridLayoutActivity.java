package com.practice.reviseproject.GridLayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

import com.practice.reviseproject.R;

public class GridLayoutActivity extends AppCompatActivity {
    private GridLayout gridLayout;
    private CardView cardView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout);

        gridLayout = findViewById(R.id.grid_layout);
        setSingleClick(gridLayout);
    }

    private void setSingleClick(GridLayout gridLayout) {
        for (int i = 0; i < gridLayout.getChildCount(); i++) {

            cardView = (CardView) gridLayout.getChildAt(i);
            final  int position=i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(GridLayoutActivity.this, "cardview at Position "+position+" has been clicked", Toast.LENGTH_SHORT).show();
                }
            });

        }
    }
}
