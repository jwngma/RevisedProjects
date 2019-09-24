package com.practice.reviseproject.RadioButton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import com.practice.reviseproject.R;

public class RadioButtonActivity extends AppCompatActivity {
    private TextView final_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);
        final_text=findViewById(R.id.final_selected_text);
    }

    public void radioButton(View view) {

        boolean checked =((RadioButton)view).isChecked();

        switch (view.getId()){
            case R.id.applee:
                if (checked){
                    final_text.setText("You have Selected Apple");
                }
                else {
                    final_text.setEnabled(false);
                }
                break;
            case R.id.mangoo:
                if (checked){
                    final_text.setText("You have Selected mango");
                }
                else {
                    final_text.setEnabled(false);
                }
                break;
            case R.id.guavaa:
                if (checked){
                    final_text.setText("You have Selected guava");
                }
                else {
                    final_text.setEnabled(false);
                }
                break;
            case R.id.lionn:
                if (checked){
                    final_text.setText("You have Selected lion");
                }
                else {
                    final_text.setEnabled(false);
                }
                break;

        }
    }
}
