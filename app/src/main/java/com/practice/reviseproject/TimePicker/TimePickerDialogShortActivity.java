package com.practice.reviseproject.TimePicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.practice.reviseproject.R;

public class TimePickerDialogShortActivity extends AppCompatActivity {

    private TextView time_text;
    private Button selectBtn;
    private TimePicker timePicker;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker_dialog_short);
        time_text = findViewById(R.id.time_text);
        timePicker = findViewById(R.id.timePicker);
        time_text.setText(getCurrentTime());
    }

    public void SelectTime(View view) {
        timePicker.setVisibility(View.VISIBLE);
        time_text.setText(getCurrentTime());
        Toast.makeText(this, getCurrentTime(), Toast.LENGTH_SHORT).show();

    }

    public String getCurrentTime() {
        String currentTime ="Time"+timePicker.getCurrentHour()+"Min:"+timePicker.getCurrentMinute();
        return currentTime;
    }
}
