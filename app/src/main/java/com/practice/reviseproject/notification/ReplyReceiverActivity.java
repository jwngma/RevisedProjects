package com.practice.reviseproject.notification;

import android.app.NotificationManager;
import android.app.RemoteInput;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.practice.reviseproject.R;

public class ReplyReceiverActivity extends AppCompatActivity {
    private TextView reply_received_text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reply_receiver);
        reply_received_text=findViewById(R.id.reply_received_text);

        Bundle replyBundle= RemoteInput.getResultsFromIntent(getIntent());
        if (replyBundle!=null){
            String message=replyBundle.getCharSequence(NotificationActivity.TEXT).toString();
            reply_received_text.setText(message);
        }


        NotificationManager notificationManager= (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        notificationManager.cancel(NotificationActivity.NOTIFICATION_ID);
    }
}
