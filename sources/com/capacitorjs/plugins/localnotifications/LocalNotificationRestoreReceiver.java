package com.capacitorjs.plugins.localnotifications;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.UserManager;
import com.getcapacitor.CapConfig;
import com.getcapacitor.PluginCall;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LocalNotificationRestoreReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        Date at;
        UserManager userManager;
        if (Build.VERSION.SDK_INT < 24 || ((userManager = (UserManager) context.getSystemService(UserManager.class)) != null && userManager.isUserUnlocked())) {
            NotificationStorage notificationStorage = new NotificationStorage(context);
            List<String> savedNotificationIds = notificationStorage.getSavedNotificationIds();
            ArrayList arrayList = new ArrayList(savedNotificationIds.size());
            ArrayList arrayList2 = new ArrayList();
            for (String savedNotification : savedNotificationIds) {
                LocalNotification savedNotification2 = notificationStorage.getSavedNotification(savedNotification);
                if (savedNotification2 != null) {
                    LocalNotificationSchedule schedule = savedNotification2.getSchedule();
                    if (!(schedule == null || (at = schedule.getAt()) == null || !at.before(new Date()))) {
                        schedule.setAt(new Date(new Date().getTime() + 15000));
                        savedNotification2.setSchedule(schedule);
                        arrayList2.add(savedNotification2);
                    }
                    arrayList.add(savedNotification2);
                }
            }
            if (arrayList2.size() > 0) {
                notificationStorage.appendNotifications(arrayList2);
            }
            new LocalNotificationManager(notificationStorage, (Activity) null, context, CapConfig.loadDefault(context)).schedule((PluginCall) null, arrayList);
        }
    }
}
