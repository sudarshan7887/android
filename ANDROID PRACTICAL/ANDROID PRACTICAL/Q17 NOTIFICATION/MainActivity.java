package com.example.dypnotification;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showNotification(View view) {
        NotificationManager mNotimanager =
                (NotificationManager)
                        getSystemService(NOTIFICATION_SERVICE);
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
        {
            NotificationChannel mChannel = new NotificationChannel
                    ("default",
                            "MyNotification App Channel",
                            NotificationManager.IMPORTANCE_DEFAULT);
            mChannel.setDescription("This Channel Shows Default Notification");
            mNotimanager.createNotificationChannel(mChannel);

        }
        Intent intent = new Intent(this,
                MainActivity2.class);
        PendingIntent pd = PendingIntent.getActivity(this,
                1,intent,PendingIntent.FLAG_UPDATE_CURRENT);
        NotificationCompat.Builder mNotification =
                new NotificationCompat.Builder(this,"default");
        mNotification.setContentTitle("1 New Message");
        mNotification.setContentText("Hi, How are you?");
        mNotification.setSmallIcon(R.mipmap.ic_launcher);
        mNotification.setAutoCancel(true);
        mNotification.setContentIntent(pd);
        mNotimanager.notify(1,mNotification.build());


    }
}
