package com.capacitorjs.plugins.localnotifications;

import android.content.Context;
import android.content.SharedPreferences;
import com.getcapacitor.JSObject;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

public class NotificationStorage {
    private static final String ACTION_TYPES_ID = "ACTION_TYPE_STORE";
    private static final String ID_KEY = "notificationIds";
    private static final String NOTIFICATION_STORE_ID = "NOTIFICATION_STORE";
    private Context context;

    public NotificationStorage(Context context2) {
        this.context = context2;
    }

    private SharedPreferences getStorage(String str) {
        return this.context.getSharedPreferences(str, 0);
    }

    public void appendNotifications(List<LocalNotification> list) {
        SharedPreferences.Editor edit = getStorage(NOTIFICATION_STORE_ID).edit();
        for (LocalNotification next : list) {
            if (next.isScheduled()) {
                edit.putString(next.getId().toString(), next.getSource());
            }
        }
        edit.apply();
    }

    public void deleteNotification(String str) {
        SharedPreferences.Editor edit = getStorage(NOTIFICATION_STORE_ID).edit();
        edit.remove(str);
        edit.apply();
    }

    public NotificationAction[] getActionGroup(String str) {
        SharedPreferences storage = getStorage(ACTION_TYPES_ID + str);
        int i4 = storage.getInt("count", 0);
        NotificationAction[] notificationActionArr = new NotificationAction[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            String string = storage.getString("id" + i5, "");
            String string2 = storage.getString("title" + i5, "");
            notificationActionArr[i5] = new NotificationAction(string, string2, Boolean.valueOf(storage.getBoolean("input" + i5, false)));
        }
        return notificationActionArr;
    }

    public JSObject getNotificationFromJSONString(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new JSObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public LocalNotification getSavedNotification(String str) {
        JSObject savedNotificationAsJSObject = getSavedNotificationAsJSObject(str);
        if (savedNotificationAsJSObject == null) {
            return null;
        }
        try {
            return LocalNotification.buildNotificationFromJSObject(savedNotificationAsJSObject);
        } catch (ParseException unused) {
            return null;
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.getcapacitor.JSObject getSavedNotificationAsJSObject(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "NOTIFICATION_STORE"
            android.content.SharedPreferences r0 = r2.getStorage(r0)
            r1 = 0
            java.lang.String r3 = r0.getString(r3, r1)     // Catch:{ ClassCastException -> 0x0014 }
            if (r3 != 0) goto L_0x000e
            return r1
        L_0x000e:
            com.getcapacitor.JSObject r0 = new com.getcapacitor.JSObject     // Catch:{  }
            r0.<init>(r3)     // Catch:{  }
            return r0
        L_0x0014:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.capacitorjs.plugins.localnotifications.NotificationStorage.getSavedNotificationAsJSObject(java.lang.String):com.getcapacitor.JSObject");
    }

    public List<String> getSavedNotificationIds() {
        Map<String, ?> all = getStorage(NOTIFICATION_STORE_ID).getAll();
        if (all != null) {
            return new ArrayList(all.keySet());
        }
        return new ArrayList();
    }

    public List<LocalNotification> getSavedNotifications() {
        Map<String, ?> all = getStorage(NOTIFICATION_STORE_ID).getAll();
        if (all == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (String str : all.keySet()) {
            JSObject notificationFromJSONString = getNotificationFromJSONString((String) all.get(str));
            if (notificationFromJSONString != null) {
                try {
                    arrayList.add(LocalNotification.buildNotificationFromJSObject(notificationFromJSONString));
                } catch (ParseException unused) {
                }
            }
        }
        return arrayList;
    }

    public void writeActionGroup(Map<String, NotificationAction[]> map) {
        for (String next : map.keySet()) {
            SharedPreferences.Editor edit = getStorage(ACTION_TYPES_ID + next).edit();
            edit.clear();
            NotificationAction[] notificationActionArr = map.get(next);
            edit.putInt("count", notificationActionArr.length);
            for (int i4 = 0; i4 < notificationActionArr.length; i4++) {
                edit.putString("id" + i4, notificationActionArr[i4].getId());
                edit.putString("title" + i4, notificationActionArr[i4].getTitle());
                edit.putBoolean("input" + i4, notificationActionArr[i4].isInput());
            }
            edit.apply();
        }
    }
}
