package com.practice.reviseproject.TimePicker;

import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.practice.reviseproject.R;

public class TimePickerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker);
    }

    public void TimePicker(View view) {
        DialogHandler dialogHandler= new DialogHandler();
        dialogHandler.show(getSupportFragmentManager(),"Time Picker");
    }
}
