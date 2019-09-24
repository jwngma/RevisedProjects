package com.practice.reviseproject.AlertDialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.practice.reviseproject.R;

public class AlertDialogActivity extends AppCompatActivity {
    private static final String TAG = "AlertDialogActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog);
    }

    public void AlertDialog(View view) {
    /*    AlertDialog.Builder builder= new AlertDialog.Builder(this);
        builder.setTitle("Alert Title");
        builder.setMessage("This is the message");
        builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(AlertDialogActivity.this, "Yes has been Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(AlertDialogActivity.this, "No has been Clicked", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });
        builder.create();
        builder.show();*/
    
    
    
    
    ///////////////

        AlertDialog.Builder builder1 = new AlertDialog.Builder(AlertDialogActivity.this);
        builder1.setTitle(Html.fromHtml("<font color='#FF7F27'>This is a test</font>"));
        builder1.setMessage(Html.fromHtml("<font color='#FF7F27'> This is the message from the alert dialog </font>"));
        builder1.setPositiveButton(Html.fromHtml("<font color='#FF7F27'>Yes</font>"), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int arg1) {
                Log.e(TAG, "Yes");
            }
        });
        builder1.setNegativeButton(Html.fromHtml("<font color='#FF7F27'>No</font>"), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int arg1) {
                Log.e(TAG, "No");
            }
        });
        builder1.create();
        builder1.show();
    }
}
