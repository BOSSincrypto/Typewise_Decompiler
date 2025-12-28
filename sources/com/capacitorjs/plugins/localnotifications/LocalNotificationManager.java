package com.capacitorjs.plugins.localnotifications;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.j;
import androidx.core.app.m;
import androidx.core.app.o;
import com.getcapacitor.CapConfig;
import com.getcapacitor.JSObject;
import com.getcapacitor.Logger;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginConfig;
import com.getcapacitor.plugin.util.AssetUtil;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

public class LocalNotificationManager {
    public static final String ACTION_INTENT_KEY = "LocalNotificationUserAction";
    public static final String DEFAULT_NOTIFICATION_CHANNEL_ID = "default";
    private static final String DEFAULT_PRESS_ACTION = "tap";
    public static final String NOTIFICATION_INTENT_KEY = "LocalNotificationId";
    public static final String NOTIFICATION_IS_REMOVABLE_KEY = "LocalNotificationRepeating";
    public static final String NOTIFICATION_OBJ_INTENT_KEY = "LocalNotficationObject";
    public static final String REMOTE_INPUT_KEY = "LocalNotificationRemoteInput";
    private static int defaultSmallIconID;
    private static int defaultSoundID;
    private Activity activity;
    private PluginConfig config;
    private Context context;
    private NotificationStorage storage;

    public LocalNotificationManager(NotificationStorage notificationStorage, Activity activity2, Context context2, CapConfig capConfig) {
        this.storage = notificationStorage;
        this.activity = activity2;
        this.context = context2;
        this.config = capConfig.getPluginConfiguration("LocalNotifications");
    }

    private Intent buildIntent(LocalNotification localNotification, String str) {
        Intent intent;
        boolean z3;
        if (this.activity != null) {
            intent = new Intent(this.context, this.activity.getClass());
        } else {
            intent = this.context.getPackageManager().getLaunchIntentForPackage(this.context.getPackageName());
        }
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setFlags(603979776);
        intent.putExtra(NOTIFICATION_INTENT_KEY, localNotification.getId());
        intent.putExtra(ACTION_INTENT_KEY, str);
        intent.putExtra(NOTIFICATION_OBJ_INTENT_KEY, localNotification.getSource());
        LocalNotificationSchedule schedule = localNotification.getSchedule();
        if (schedule == null || schedule.isRemovable()) {
            z3 = true;
        } else {
            z3 = false;
        }
        intent.putExtra(NOTIFICATION_IS_REMOVABLE_KEY, z3);
        return intent;
    }

    private void buildNotification(m mVar, LocalNotification localNotification, PluginCall pluginCall) {
        String str;
        if (localNotification.getChannelId() != null) {
            str = localNotification.getChannelId();
        } else {
            str = DEFAULT_NOTIFICATION_CHANNEL_ID;
        }
        j.d n4 = new j.d(this.context, str).i(localNotification.getTitle()).h(localNotification.getBody()).e(localNotification.isAutoCancel()).p(localNotification.isOngoing()).r(0).n(localNotification.isGroupSummary());
        if (localNotification.getLargeBody() != null) {
            n4.u(new j.b().h(localNotification.getLargeBody()).i(localNotification.getSummaryText()));
        }
        if (localNotification.getInboxList() != null) {
            j.e eVar = new j.e();
            for (String h4 : localNotification.getInboxList()) {
                eVar.h(h4);
            }
            eVar.i(localNotification.getTitle());
            eVar.j(localNotification.getSummaryText());
            n4.u(eVar);
        }
        Context context2 = this.context;
        String sound = localNotification.getSound(context2, getDefaultSound(context2));
        if (sound != null) {
            Uri parse = Uri.parse(sound);
            this.context.grantUriPermission("com.android.systemui", parse, 1);
            n4.t(parse);
            n4.j(6);
        } else {
            n4.j(-1);
        }
        String group = localNotification.getGroup();
        if (group != null) {
            n4.m(group);
            if (localNotification.isGroupSummary()) {
                n4.v(localNotification.getSummaryText());
            }
        }
        n4.w(0);
        n4.q(true);
        Context context3 = this.context;
        n4.s(localNotification.getSmallIcon(context3, getDefaultSmallIcon(context3)));
        n4.o(localNotification.getLargeIcon(this.context));
        String iconColor = localNotification.getIconColor(this.config.getString("iconColor"));
        if (iconColor != null) {
            try {
                n4.f(Color.parseColor(iconColor));
            } catch (IllegalArgumentException unused) {
                if (pluginCall != null) {
                    pluginCall.reject("Invalid color provided. Must be a hex string (ex: #ff0000");
                    return;
                }
                return;
            }
        }
        createActionIntents(localNotification, n4);
        Notification b4 = n4.b();
        if (localNotification.isScheduled()) {
            triggerScheduledNotification(b4, localNotification);
            return;
        }
        try {
            LocalNotificationsPlugin.fireReceived(new JSObject(localNotification.getSource()));
        } catch (JSONException unused2) {
        }
        mVar.f(localNotification.getId().intValue(), b4);
    }

    private void cancelTimerForNotification(Integer num) {
        int i4;
        Intent intent = new Intent(this.context, TimedNotificationPublisher.class);
        if (Build.VERSION.SDK_INT >= 31) {
            i4 = 33554432;
        } else {
            i4 = 0;
        }
        PendingIntent broadcast = PendingIntent.getBroadcast(this.context, num.intValue(), intent, i4);
        if (broadcast != null) {
            ((AlarmManager) this.context.getSystemService("alarm")).cancel(broadcast);
        }
    }

    private void createActionIntents(LocalNotification localNotification, j.d dVar) {
        int i4;
        boolean z3;
        Intent buildIntent = buildIntent(localNotification, DEFAULT_PRESS_ACTION);
        if (Build.VERSION.SDK_INT >= 31) {
            i4 = 301989888;
        } else {
            i4 = 268435456;
        }
        dVar.g(PendingIntent.getActivity(this.context, localNotification.getId().intValue(), buildIntent, i4));
        String actionTypeId = localNotification.getActionTypeId();
        int i5 = 0;
        if (actionTypeId != null) {
            for (NotificationAction notificationAction : this.storage.getActionGroup(actionTypeId)) {
                j.a.C0067a aVar = new j.a.C0067a(R.drawable.ic_transparent, notificationAction.getTitle(), PendingIntent.getActivity(this.context, localNotification.getId().intValue() + notificationAction.getId().hashCode(), buildIntent(localNotification, notificationAction.getId()), i4));
                if (notificationAction.isInput()) {
                    aVar.a(new o.d(REMOTE_INPUT_KEY).b(notificationAction.getTitle()).a());
                }
                dVar.a(aVar.b());
            }
        }
        Intent intent = new Intent(this.context, NotificationDismissReceiver.class);
        intent.setFlags(268468224);
        intent.putExtra(NOTIFICATION_INTENT_KEY, localNotification.getId());
        intent.putExtra(ACTION_INTENT_KEY, "dismiss");
        LocalNotificationSchedule schedule = localNotification.getSchedule();
        if (schedule == null || schedule.isRemovable()) {
            z3 = true;
        } else {
            z3 = false;
        }
        intent.putExtra(NOTIFICATION_IS_REMOVABLE_KEY, z3);
        if (Build.VERSION.SDK_INT >= 31) {
            i5 = 33554432;
        }
        dVar.k(PendingIntent.getBroadcast(this.context, localNotification.getId().intValue(), intent, i5));
    }

    private void dismissVisibleNotification(int i4) {
        m.d(this.context).b(i4);
    }

    private int getDefaultSmallIcon(Context context2) {
        int i4;
        int i5 = defaultSmallIconID;
        if (i5 != 0) {
            return i5;
        }
        String resourceBaseName = AssetUtil.getResourceBaseName(this.config.getString("smallIcon"));
        if (resourceBaseName != null) {
            i4 = AssetUtil.getResourceID(context2, resourceBaseName, "drawable");
        } else {
            i4 = 0;
        }
        if (i4 == 0) {
            i4 = 17301659;
        }
        defaultSmallIconID = i4;
        return i4;
    }

    private int getDefaultSound(Context context2) {
        int i4;
        int i5 = defaultSoundID;
        if (i5 != 0) {
            return i5;
        }
        String resourceBaseName = AssetUtil.getResourceBaseName(this.config.getString("sound"));
        if (resourceBaseName != null) {
            i4 = AssetUtil.getResourceID(context2, resourceBaseName, "raw");
        } else {
            i4 = 0;
        }
        defaultSoundID = i4;
        return i4;
    }

    private void setExactIfPossible(AlarmManager alarmManager, LocalNotificationSchedule localNotificationSchedule, long j4, PendingIntent pendingIntent) {
        if (Build.VERSION.SDK_INT < 31 || alarmManager.canScheduleExactAlarms()) {
            if (localNotificationSchedule.allowWhileIdle()) {
                alarmManager.setExactAndAllowWhileIdle(0, j4, pendingIntent);
            } else {
                alarmManager.setExact(1, j4, pendingIntent);
            }
        } else if (localNotificationSchedule.allowWhileIdle()) {
            alarmManager.setAndAllowWhileIdle(0, j4, pendingIntent);
        } else {
            alarmManager.set(1, j4, pendingIntent);
        }
    }

    private void triggerScheduledNotification(Notification notification, LocalNotification localNotification) {
        int i4;
        AlarmManager alarmManager = (AlarmManager) this.context.getSystemService("alarm");
        LocalNotificationSchedule schedule = localNotification.getSchedule();
        Intent intent = new Intent(this.context, TimedNotificationPublisher.class);
        intent.putExtra(NOTIFICATION_INTENT_KEY, localNotification.getId());
        intent.putExtra(TimedNotificationPublisher.NOTIFICATION_KEY, notification);
        if (Build.VERSION.SDK_INT >= 31) {
            i4 = 301989888;
        } else {
            i4 = 268435456;
        }
        PendingIntent broadcast = PendingIntent.getBroadcast(this.context, localNotification.getId().intValue(), intent, i4);
        Date at = schedule.getAt();
        if (at != null) {
            if (at.getTime() < new Date().getTime()) {
                Logger.error(Logger.tags("LN"), "Scheduled time must be *after* current time", (Throwable) null);
            } else if (schedule.isRepeating()) {
                long time = at.getTime() - new Date().getTime();
                alarmManager.setRepeating(1, at.getTime(), time, broadcast);
            } else {
                setExactIfPossible(alarmManager, schedule, at.getTime(), broadcast);
            }
        } else if (schedule.getEvery() != null) {
            Long everyInterval = schedule.getEveryInterval();
            if (everyInterval != null) {
                AlarmManager alarmManager2 = alarmManager;
                alarmManager2.setRepeating(1, everyInterval.longValue() + new Date().getTime(), everyInterval.longValue(), broadcast);
            }
        } else {
            DateMatch on = schedule.getOn();
            if (on != null) {
                long nextTrigger = on.nextTrigger(new Date());
                intent.putExtra(TimedNotificationPublisher.CRON_KEY, on.toMatchString());
                setExactIfPossible(alarmManager, schedule, nextTrigger, PendingIntent.getBroadcast(this.context, localNotification.getId().intValue(), intent, i4));
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                String tags = Logger.tags("LN");
                Logger.debug(tags, "notification " + localNotification.getId() + " will next fire at " + simpleDateFormat.format(new Date(nextTrigger)));
            }
        }
    }

    public boolean areNotificationsEnabled() {
        return m.d(this.context).a();
    }

    public void cancel(PluginCall pluginCall) {
        List<Integer> localNotificationPendingList = LocalNotification.getLocalNotificationPendingList(pluginCall);
        if (localNotificationPendingList != null) {
            for (Integer next : localNotificationPendingList) {
                dismissVisibleNotification(next.intValue());
                cancelTimerForNotification(next);
                this.storage.deleteNotification(Integer.toString(next.intValue()));
            }
        }
        pluginCall.resolve();
    }

    public void createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel a4 = e.a(DEFAULT_NOTIFICATION_CHANNEL_ID, "Default", 3);
            a4.setDescription("Default");
            AudioAttributes build = new AudioAttributes.Builder().setContentType(4).setUsage(4).build();
            Uri defaultSoundUrl = getDefaultSoundUrl(this.context);
            if (defaultSoundUrl != null) {
                a4.setSound(defaultSoundUrl, build);
            }
            ((NotificationManager) this.context.getSystemService(NotificationManager.class)).createNotificationChannel(a4);
        }
    }

    public Uri getDefaultSoundUrl(Context context2) {
        int defaultSound = getDefaultSound(context2);
        if (defaultSound == 0) {
            return null;
        }
        return Uri.parse("android.resource://" + context2.getPackageName() + "/" + defaultSound);
    }

    public JSObject handleNotificationActionPerformed(Intent intent, NotificationStorage notificationStorage) {
        String tags = Logger.tags("LN");
        Logger.debug(tags, "LocalNotification received: " + intent.getDataString());
        int intExtra = intent.getIntExtra(NOTIFICATION_INTENT_KEY, Integer.MIN_VALUE);
        JSObject jSObject = null;
        if (intExtra == Integer.MIN_VALUE) {
            Logger.debug(Logger.tags("LN"), "Activity started without notification attached");
            return null;
        }
        if (intent.getBooleanExtra(NOTIFICATION_IS_REMOVABLE_KEY, true)) {
            notificationStorage.deleteNotification(Integer.toString(intExtra));
        }
        JSObject jSObject2 = new JSObject();
        Bundle j4 = o.j(intent);
        if (j4 != null) {
            jSObject2.put("inputValue", j4.getCharSequence(REMOTE_INPUT_KEY).toString());
        }
        String stringExtra = intent.getStringExtra(ACTION_INTENT_KEY);
        dismissVisibleNotification(intExtra);
        jSObject2.put("actionId", stringExtra);
        try {
            String stringExtra2 = intent.getStringExtra(NOTIFICATION_OBJ_INTENT_KEY);
            if (stringExtra2 != null) {
                jSObject = new JSObject(stringExtra2);
            }
        } catch (JSONException unused) {
        }
        jSObject2.put("notification", (Object) jSObject);
        return jSObject2;
    }

    public JSONArray schedule(PluginCall pluginCall, List<LocalNotification> list) {
        JSONArray jSONArray = new JSONArray();
        m d4 = m.d(this.context);
        if (!d4.a()) {
            if (pluginCall != null) {
                pluginCall.reject("Notifications not enabled on this device");
            }
            return null;
        }
        for (LocalNotification next : list) {
            Integer id = next.getId();
            if (next.getId() == null) {
                if (pluginCall != null) {
                    pluginCall.reject("LocalNotification missing identifier");
                }
                return null;
            }
            dismissVisibleNotification(id.intValue());
            cancelTimerForNotification(id);
            buildNotification(d4, next, pluginCall);
            jSONArray.put(id);
        }
        return jSONArray;
    }
}
