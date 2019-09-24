package com.practice.reviseproject.CheckBox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.practice.reviseproject.R;

import java.util.ArrayList;

public class CheckBoxActivity extends AppCompatActivity {

    ArrayList<String> arrayList = new ArrayList<>();
    private TextView final_text;
    private CheckBox checkBox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        final_text=findViewById(R.id.final_text);
        final_text.setEnabled(false);
    }


    public void checkbox_selected(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.apple:
                if (checked) {
                    arrayList.add("Apple");

                } else {
                    arrayList.remove("Apple");

                }
                break;
            case R.id.mango:
                if (checked) {
                    arrayList.add("Mango");

                } else {
                    arrayList.remove("Mango");

                }
                break;
            case R.id.guava:
                if (checked) {
                    arrayList.add("Guava");

                } else {
                    arrayList.remove("Guava");

                }
                break;
            case R.id.lion:
                if (checked) {
                    arrayList.add("Lion");

                } else {
                    arrayList.remove("Lion");

                }
                break;


        }
    }

    public void AllSelected(View view) {
        String selected_list = "";

        for (String selection_list : arrayList) {
            selected_list = selected_list + selection_list + "\n";
        }
        final_text.setText(selected_list);
        final_text.setEnabled(true);
    }
}
