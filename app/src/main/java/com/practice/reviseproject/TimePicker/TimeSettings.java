package com.practice.reviseproject.TimePicker;

import android.app.TimePickerDialog;
import android.content.Context;
import android.widget.TimePicker;
import android.widget.Toast;

public class TimeSettings implements TimePickerDialog.OnTimeSetListener {
    Context context;

    public TimeSettings(Context context) {
        this.context = context;
    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        Toast.makeText(context, "Selected time is hour"+hourOfDay+" Min is :"+minute, Toast.LENGTH_SHORT).show();

    }
}
