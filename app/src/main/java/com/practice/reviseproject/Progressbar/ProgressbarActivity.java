package com.practice.reviseproject.Progressbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.practice.reviseproject.R;

public class ProgressbarActivity extends AppCompatActivity {
    private ProgressBar progressBar;
    private TextView progress_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progressbar);
        progressBar = findViewById(R.id.progressbar);
        progress_text = findViewById(R.id.progress_text);


        for (int i = 0; i <= 1000; i++) {
            progressBar.setProgress(i);
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}
