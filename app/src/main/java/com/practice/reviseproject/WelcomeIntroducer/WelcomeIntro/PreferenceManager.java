package com.practice.reviseproject.WelcomeIntroducer.WelcomeIntro;

import android.content.Context;
import android.content.SharedPreferences;

import com.practice.reviseproject.R;

public class PreferenceManager {
    private Context context;
    private SharedPreferences sharedPreferences;

    public PreferenceManager(Context context) {
        this.context = context;
        getSharedPreference();
    }

    private void getSharedPreference() {
        sharedPreferences = context.getSharedPreferences(context.getString(R.string.my_preference), Context.MODE_PRIVATE);
    }


    public void WritePreference() {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(context.getString(R.string.my_preference_key), "INIT_OK");
        editor.commit();

    }

    public void ClearPreference() {
        sharedPreferences.edit().clear().commit();
    }

    public boolean checkPreference() {

        boolean status = false;

        if (sharedPreferences.getString(context.getString(R.string.my_preference_key), "null").equals("null")) {
            status = false;
        } else {
            status = true;
        }
        return status;

    }
}
