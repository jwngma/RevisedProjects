package com.practice.reviseproject.TimePicker;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.text.format.DateFormat;

import java.util.Calendar;

public class DialogHandler extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        Calendar calendar= Calendar.getInstance();
        int hour= calendar.get(Calendar.HOUR);
        int min= calendar.get(Calendar.MINUTE);

        TimePickerDialog timePickerDialog;
        TimeSettings timeSettings= new TimeSettings(getActivity());

        timePickerDialog= new TimePickerDialog(getActivity(),timeSettings,hour, min, DateFormat.is24HourFormat(getActivity()));
        return  timePickerDialog;

    }
}
