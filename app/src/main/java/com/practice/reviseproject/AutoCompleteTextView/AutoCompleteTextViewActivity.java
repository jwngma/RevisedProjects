package com.practice.reviseproject.AutoCompleteTextView;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.practice.reviseproject.R;

public class AutoCompleteTextViewActivity extends AppCompatActivity {
    private AutoCompleteTextView autoCompleteTextView;
    private String[] country_names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_text_view);

        autoCompleteTextView = findViewById(R.id.autoComplete_textview);
        country_names = getResources().getStringArray(R.array.Contry_names);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, country_names);
        autoCompleteTextView.setAdapter(adapter);
    }
}
