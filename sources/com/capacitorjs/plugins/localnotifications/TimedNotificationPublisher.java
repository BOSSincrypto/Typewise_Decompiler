package com.capacitorjs.plugins.localnotifications;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.getcapacitor.Logger;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimedNotificationPublisher extends BroadcastReceiver {
    public static String CRON_KEY = "NotificationPublisher.cron";
    public static String NOTIFICATION_KEY = "NotificationPublisher.notification";

    private boolean rescheduleNotificationIfNeeded(Context context, Intent intent, int i4) {
        int i5;
        String stringExtra = intent.getStringExtra(CRON_KEY);
        if (stringExtra == null) {
            return false;
        }
        DateMatch fromMatchString = DateMatch.fromMatchString(stringExtra);
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        long nextTrigger = fromMatchString.nextTrigger(new Date());
        Intent intent2 = (Intent) intent.clone();
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 31) {
            i5 = 301989888;
        } else {
            i5 = 268435456;
        }
        PendingIntent broadcast = PendingIntent.getBroadcast(context, i4, intent2, i5);
        if (i6 < 31 || alarmManager.canScheduleExactAlarms()) {
            alarmManager.setExact(1, nextTrigger, broadcast);
        } else {
            alarmManager.set(1, nextTrigger, broadcast);
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String tags = Logger.tags("LN");
        Logger.debug(tags, "notification " + i4 + " will next fire at " + simpleDateFormat.format(new Date(nextTrigger)));
        return true;
    }

    public void onReceive(Context context, Intent intent) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        Notification notification = (Notification) intent.getParcelableExtra(NOTIFICATION_KEY);
        notification.when = System.currentTimeMillis();
        int intExtra = intent.getIntExtra(LocalNotificationManager.NOTIFICATION_INTENT_KEY, Integer.MIN_VALUE);
        if (intExtra == Integer.MIN_VALUE) {
            Logger.error(Logger.tags("LN"), "No valid id supplied", (Throwable) null);
        }
        NotificationStorage notificationStorage = new NotificationStorage(context);
        LocalNotificationsPlugin.fireReceived(notificationStorage.getSavedNotificationAsJSObject(Integer.toString(intExtra)));
        notificationManager.notify(intExtra, notification);
        if (!rescheduleNotificationIfNeeded(context, intent, intExtra)) {
            notificationStorage.deleteNotification(Integer.toString(intExtra));
        }
    }
}
