package com.practice.reviseproject.notification;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Handler;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v4.app.RemoteInput;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.RemoteViews;

import com.practice.reviseproject.R;

public class NotificationActivity extends AppCompatActivity {

    private static final String CHANNEL_ID = "channel_id";
    public static final int NOTIFICATION_ID = 1;
    private Button notibtn;
    public static final String TEXT = "This is the text to reply";

    // craeting notification for below 7
    // creating nofication channel for abobe orio
    // adding onclick listener for notification
    //adding button along with onclick to the button
    // adding direct reply


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        notibtn = findViewById(R.id.noti_btn);


    }


    public void notification(View view) {
        switch (view.getId()) {
            case R.id.noti_btn:
                createNotifactionforbelowNaugat();
                break;
            case R.id.noti_btn_above_naugat:
                createNotifactionforaboveNaugat();
                break;
            case R.id.noti_btn_onclick:
                createNotifactionTabAction();
                break;
            case R.id.noti_btn_btn:
                createNotifactionwithButtons();
                break;
            case R.id.noti_btn_reply:
                createNotifactionWithReplyButton();
                break;
            case R.id.noti_btn_progress:
                createNotifactionWithProgress();
                break;
            case R.id.noti_btn_expandable:
                createNotifactionExpandable();
                break;
            case R.id.noti_btn_custom:
                createNotifactionCustom();
                break;

        }
    }

    private void createNotifactionCustom() {

        createChannel();
        RemoteViews remoteViews = new RemoteViews(getPackageName(), R.layout.item_layout_for_notification_small);
        RemoteViews remoteViews_big = new RemoteViews(getPackageName(), R.layout.item_layout_for_notification_big);


        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, CHANNEL_ID);

        builder.setPriority(NotificationCompat.PRIORITY_DEFAULT);
        builder.setSmallIcon(R.drawable.coffee);

        builder.setStyle(new NotificationCompat.DecoratedCustomViewStyle());
        builder.setCustomContentView(remoteViews);
        builder.setCustomBigContentView(remoteViews_big);
        NotificationManagerCompat compat = NotificationManagerCompat.from(this);
        compat.notify(NOTIFICATION_ID, builder.build());

    }

    private void createNotifactionExpandable() {


        createChannel();

        final NotificationCompat.Builder builder = new NotificationCompat.Builder(this, CHANNEL_ID);
        builder.setContentTitle(Html.fromHtml("<font color='#ff7f27'>Title of the Notification</font>"));
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.coffee);
        builder.setSmallIcon(R.drawable.coffee);
        builder.setContentText(Html.fromHtml("<font color='#FF7F27'>This is a test</font>"));
        builder.setPriority(NotificationCompat.PRIORITY_DEFAULT);
        builder.setAutoCancel(true);

        builder.setLargeIcon(bitmap);
        builder.setStyle(new NotificationCompat.BigPictureStyle().bigPicture(bitmap));
        builder.setStyle(new NotificationCompat.BigTextStyle().bigText(getString(R.string.dummy_text)));

        final NotificationManagerCompat compat = NotificationManagerCompat.from(this);
        compat.notify(NOTIFICATION_ID, builder.build());


    }


    private void notifyy() {

        /* check if the version id grater the 8 or verson code o*/
        createChannel();


        Intent intent = new Intent(this, LandingActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_ONE_SHOT);


        /* to No*/
        Intent noIntent = new Intent(this, NoActivity.class);
        noIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        PendingIntent pendingIntentNo = PendingIntent.getActivity(this, 0, noIntent, PendingIntent.FLAG_ONE_SHOT);

        /* to yes*/

        Intent yesintent = new Intent(this, YesActivity.class);
        yesintent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        PendingIntent pendingIntentYes = PendingIntent.getActivity(this, 0, yesintent, PendingIntent.FLAG_ONE_SHOT);


        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, CHANNEL_ID);
        builder.setContentTitle(" Title of the notification");
        builder.setSmallIcon(R.drawable.help_icon);
        builder.setContentText("This is the content of the notification");
        builder.setSubText("this is your sub text");
        builder.setPriority(NotificationCompat.PRIORITY_DEFAULT);


        /* adding onclick to the notification*/
        builder.setAutoCancel(true);
        builder.setContentIntent(pendingIntent);

        /* adding buttons to the notification along with intent to the activity*/
        builder.addAction(R.drawable.cloud, "Yes", pendingIntentYes);
        builder.addAction(R.drawable.share_icon, " No", pendingIntentNo);


        /* adding direct reply ooption to the notification*/
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.N) {

            RemoteInput remoteInput = new RemoteInput.Builder(TEXT).build();

            Intent reply_intent = new Intent(this, ReplyReceiverActivity.class);
            reply_intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);

            PendingIntent replyPendingintent = PendingIntent.getActivity(this, 00, reply_intent, PendingIntent.FLAG_ONE_SHOT);
            NotificationCompat.Action action = new NotificationCompat.Action.Builder(R.drawable.share_icon, "Reply", replyPendingintent).addRemoteInput(remoteInput).build();
            builder.addAction(action);

           /* builder.addAction(new NotificationCompat.Action.Builder(
                    R.drawable.share_icon,"hgdc",PendingIntent.getActivity(this,0,new Intent(this, YesActivity.class),PendingIntent.FLAG_ONE_SHOT))
                    .addRemoteInput(new RemoteInput.Builder(TEXT).build())
                    .build());*/
        }

        NotificationManagerCompat compat = NotificationManagerCompat.from(this);
        compat.notify(NOTIFICATION_ID, builder.build());

    }

    private void createChannel() {
        CharSequence name = " personal notificationa";
        String description = "this is the dummy desc";
        int importance = NotificationManager.IMPORTANCE_DEFAULT;

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID, name, importance);
            channel.setDescription(description);

            NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
            manager.createNotificationChannel(channel);
        }
    }

    private void createNotifactionforbelowNaugat() {

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, CHANNEL_ID);
        builder.setContentTitle(" Title of the notification");
        builder.setSmallIcon(R.drawable.help_icon);
        builder.setContentText("This is the content of the notification");
        builder.setPriority(NotificationCompat.PRIORITY_DEFAULT);

        NotificationManagerCompat compat = NotificationManagerCompat.from(this);
        compat.notify(NOTIFICATION_ID, builder.build());

    }

    private void createNotifactionforaboveNaugat() {

        createChannel();
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, CHANNEL_ID);
        builder.setContentTitle(" Title of the notification");
        builder.setSmallIcon(R.drawable.help_icon);
        builder.setContentText("This is the content of the notification");
        builder.setSubText("this is your sub text");
        builder.setPriority(NotificationCompat.PRIORITY_DEFAULT);
        builder.setAutoCancel(true);

        NotificationManagerCompat compat = NotificationManagerCompat.from(this);
        compat.notify(NOTIFICATION_ID, builder.build());


    }

    private void createNotifactionTabAction() {

        createChannel();


        Intent intent = new Intent(this, LandingActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_ONE_SHOT);


        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, CHANNEL_ID);
        builder.setContentTitle(" Title of the notification");
        builder.setSmallIcon(R.drawable.help_icon);
        builder.setContentText("This is the content of the notification");
        builder.setSubText("this is your sub text");
        builder.setPriority(NotificationCompat.PRIORITY_DEFAULT);


        /* adding onclick to the notification*/
        builder.setAutoCancel(true);
        builder.setContentIntent(pendingIntent);

        NotificationManagerCompat compat = NotificationManagerCompat.from(this);
        compat.notify(NOTIFICATION_ID, builder.build());

    }

    private void createNotifactionwithButtons() {

        createChannel();


        Intent intent = new Intent(this, LandingActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_ONE_SHOT);


        /* to No*/
        Intent noIntent = new Intent(this, NoActivity.class);
        noIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        PendingIntent pendingIntentNo = PendingIntent.getActivity(this, 0, noIntent, PendingIntent.FLAG_ONE_SHOT);

        /* to yes*/

        Intent yesintent = new Intent(this, YesActivity.class);
        yesintent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        PendingIntent pendingIntentYes = PendingIntent.getActivity(this, 0, yesintent, PendingIntent.FLAG_ONE_SHOT);


        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, CHANNEL_ID);
        builder.setContentTitle(" Title of the notification");
        builder.setSmallIcon(R.drawable.help_icon);
        builder.setContentText("This is the content of the notification");
        builder.setSubText("this is your sub text");
        builder.setPriority(NotificationCompat.PRIORITY_DEFAULT);


        /* adding onclick to the notification*/
        builder.setAutoCancel(true);
        builder.setContentIntent(pendingIntent);

        /* adding buttons to the notification along with intent to the activity*/
        builder.addAction(R.drawable.cloud, "Yes", pendingIntentYes);
        builder.addAction(R.drawable.share_icon, " No", pendingIntentNo);


        NotificationManagerCompat compat = NotificationManagerCompat.from(this);
        compat.notify(NOTIFICATION_ID, builder.build());

    }

    private void createNotifactionWithReplyButton() {

        createChannel();


        Intent intent = new Intent(this, LandingActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_ONE_SHOT);


        /* to No*/
        Intent noIntent = new Intent(this, NoActivity.class);
        noIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        PendingIntent pendingIntentNo = PendingIntent.getActivity(this, 0, noIntent, PendingIntent.FLAG_ONE_SHOT);

        /* to yes*/

        Intent yesintent = new Intent(this, YesActivity.class);
        yesintent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        PendingIntent pendingIntentYes = PendingIntent.getActivity(this, 0, yesintent, PendingIntent.FLAG_ONE_SHOT);


        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, CHANNEL_ID);
        builder.setContentTitle(" Title of the notification");
        builder.setSmallIcon(R.drawable.help_icon);
        builder.setContentText("This is the content of the notification");
        builder.setSubText("this is your sub text");
        builder.setPriority(NotificationCompat.PRIORITY_DEFAULT);


        /* adding onclick to the notification*/
        builder.setAutoCancel(true);
        builder.setContentIntent(pendingIntent);

        /* adding buttons to the notification along with intent to the activity*/
        builder.addAction(R.drawable.cloud, "Yes", pendingIntentYes);
        builder.addAction(R.drawable.share_icon, " No", pendingIntentNo);


        /* adding direct reply ooption to the notification*/
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.N) {

            RemoteInput remoteInput = new RemoteInput.Builder(TEXT).build();

            Intent reply_intent = new Intent(this, ReplyReceiverActivity.class);
            reply_intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);

            PendingIntent replyPendingintent = PendingIntent.getActivity(this, 00, reply_intent, PendingIntent.FLAG_ONE_SHOT);
            NotificationCompat.Action action = new NotificationCompat.Action.Builder(R.drawable.share_icon, "Reply", replyPendingintent).addRemoteInput(remoteInput).build();
            builder.addAction(action);

           /* builder.addAction(new NotificationCompat.Action.Builder(
                    R.drawable.share_icon,"hgdc",PendingIntent.getActivity(this,0,new Intent(this, YesActivity.class),PendingIntent.FLAG_ONE_SHOT))
                    .addRemoteInput(new RemoteInput.Builder(TEXT).build())
                    .build());*/
        }

        NotificationManagerCompat compat = NotificationManagerCompat.from(this);
        compat.notify(NOTIFICATION_ID, builder.build());

    }


    private void createNotifactionWithProgress() {

        createChannel();

        final NotificationCompat.Builder builder = new NotificationCompat.Builder(this, CHANNEL_ID);
        builder.setContentTitle(" Download");
        builder.setSmallIcon(R.drawable.help_icon);
        builder.setContentText("Downloading");
        builder.setPriority(NotificationCompat.PRIORITY_DEFAULT);
        builder.setAutoCancel(true);
        final int maxProgress = 100;
        int currentprogress = 0;
        builder.setProgress(maxProgress, currentprogress, false);
        final NotificationManagerCompat compat = NotificationManagerCompat.from(this);
        compat.notify(NOTIFICATION_ID, builder.build());

        Thread thread = new Thread() {
            @Override
            public void run() {
                int count = 0;

                try {
                    while (count < 100) {
                        count = count + 5;
                        sleep(1000);
                        builder.setProgress(maxProgress, count, false);
                        compat.notify(NOTIFICATION_ID, builder.build());
                    }

                    builder.setContentText("Downloaded");
                    builder.setProgress(0, 0, false);
                    compat.notify(NOTIFICATION_ID, builder.build());

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


        };
        thread.start();


    }


}
