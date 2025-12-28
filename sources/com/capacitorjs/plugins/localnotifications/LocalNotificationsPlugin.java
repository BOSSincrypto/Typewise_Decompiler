package com.capacitorjs.plugins.localnotifications;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.service.notification.StatusBarNotification;
import com.getcapacitor.Bridge;
import com.getcapacitor.JSArray;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginHandle;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.getcapacitor.annotation.Permission;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@CapacitorPlugin(name = "LocalNotifications", permissions = {@Permission(alias = "display", strings = {})})
public class LocalNotificationsPlugin extends Plugin {
    private static Bridge staticBridge;
    private LocalNotificationManager manager;
    private NotificationChannelManager notificationChannelManager;
    public NotificationManager notificationManager;
    private NotificationStorage notificationStorage;

    public static void fireReceived(JSObject jSObject) {
        LocalNotificationsPlugin localNotificationsInstance = getLocalNotificationsInstance();
        if (localNotificationsInstance != null) {
            localNotificationsInstance.notifyListeners("localNotificationReceived", jSObject, true);
        }
    }

    public static LocalNotificationsPlugin getLocalNotificationsInstance() {
        PluginHandle plugin;
        Bridge bridge = staticBridge;
        if (bridge == null || bridge.getWebView() == null || (plugin = staticBridge.getPlugin("LocalNotifications")) == null) {
            return null;
        }
        return (LocalNotificationsPlugin) plugin.getInstance();
    }

    private String getNotificationPermissionText() {
        if (this.manager.areNotificationsEnabled()) {
            return "granted";
        }
        return "denied";
    }

    @PluginMethod
    public void areEnabled(PluginCall pluginCall) {
        JSObject jSObject = new JSObject();
        jSObject.put("value", this.manager.areNotificationsEnabled());
        pluginCall.resolve(jSObject);
    }

    @PluginMethod
    public void cancel(PluginCall pluginCall) {
        this.manager.cancel(pluginCall);
    }

    @PluginMethod
    public void checkPermissions(PluginCall pluginCall) {
        JSObject jSObject = new JSObject();
        jSObject.put("display", getNotificationPermissionText());
        pluginCall.resolve(jSObject);
    }

    @PluginMethod
    public void createChannel(PluginCall pluginCall) {
        this.notificationChannelManager.createChannel(pluginCall);
    }

    @PluginMethod
    public void deleteChannel(PluginCall pluginCall) {
        this.notificationChannelManager.deleteChannel(pluginCall);
    }

    @PluginMethod
    public void getDeliveredNotifications(PluginCall pluginCall) {
        boolean z3;
        JSArray jSArray = new JSArray();
        for (StatusBarNotification statusBarNotification : this.notificationManager.getActiveNotifications()) {
            JSObject jSObject = new JSObject();
            jSObject.put("id", statusBarNotification.getId());
            jSObject.put("tag", statusBarNotification.getTag());
            Notification notification = statusBarNotification.getNotification();
            if (notification != null) {
                jSObject.put("title", (Object) notification.extras.getCharSequence("android.title"));
                jSObject.put("body", (Object) notification.extras.getCharSequence("android.text"));
                jSObject.put("group", notification.getGroup());
                if ((notification.flags & 512) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                jSObject.put("groupSummary", z3);
                JSObject jSObject2 = new JSObject();
                for (String next : notification.extras.keySet()) {
                    jSObject2.put(next, notification.extras.get(next));
                }
                jSObject.put("data", (Object) jSObject2);
            }
            jSArray.put(jSObject);
        }
        JSObject jSObject3 = new JSObject();
        jSObject3.put("notifications", (Object) jSArray);
        pluginCall.resolve(jSObject3);
    }

    @PluginMethod
    public void getPending(PluginCall pluginCall) {
        pluginCall.resolve(LocalNotification.buildLocalNotificationPendingList(this.notificationStorage.getSavedNotifications()));
    }

    /* access modifiers changed from: protected */
    public void handleOnNewIntent(Intent intent) {
        JSObject handleNotificationActionPerformed;
        super.handleOnNewIntent(intent);
        if ("android.intent.action.MAIN".equals(intent.getAction()) && (handleNotificationActionPerformed = this.manager.handleNotificationActionPerformed(intent, this.notificationStorage)) != null) {
            notifyListeners("localNotificationActionPerformed", handleNotificationActionPerformed, true);
        }
    }

    @PluginMethod
    public void listChannels(PluginCall pluginCall) {
        this.notificationChannelManager.listChannels(pluginCall);
    }

    public void load() {
        super.load();
        this.notificationStorage = new NotificationStorage(getContext());
        LocalNotificationManager localNotificationManager = new LocalNotificationManager(this.notificationStorage, getActivity(), getContext(), this.bridge.getConfig());
        this.manager = localNotificationManager;
        localNotificationManager.createNotificationChannel();
        this.notificationChannelManager = new NotificationChannelManager(getActivity());
        this.notificationManager = (NotificationManager) getActivity().getSystemService("notification");
        staticBridge = this.bridge;
    }

    @PluginMethod
    public void registerActionTypes(PluginCall pluginCall) {
        this.notificationStorage.writeActionGroup(NotificationAction.buildTypes(pluginCall.getArray("types")));
        pluginCall.resolve();
    }

    @PluginMethod
    public void removeAllDeliveredNotifications(PluginCall pluginCall) {
        this.notificationManager.cancelAll();
        pluginCall.resolve();
    }

    @PluginMethod
    public void removeDeliveredNotifications(PluginCall pluginCall) {
        try {
            for (Object next : pluginCall.getArray("notifications").toList()) {
                if (next instanceof JSONObject) {
                    JSObject fromJSONObject = JSObject.fromJSONObject((JSONObject) next);
                    String string = fromJSONObject.getString("tag");
                    Integer integer = fromJSONObject.getInteger("id");
                    if (string == null) {
                        this.notificationManager.cancel(integer.intValue());
                    } else {
                        this.notificationManager.cancel(string, integer.intValue());
                    }
                } else {
                    pluginCall.reject("Expected notifications to be a list of notification objects");
                }
            }
        } catch (JSONException e4) {
            pluginCall.reject(e4.getMessage());
        }
        pluginCall.resolve();
    }

    @PluginMethod
    public void requestPermissions(PluginCall pluginCall) {
        JSObject jSObject = new JSObject();
        jSObject.put("display", getNotificationPermissionText());
        pluginCall.resolve(jSObject);
    }

    @PluginMethod
    public void schedule(PluginCall pluginCall) {
        JSONArray schedule;
        List<LocalNotification> buildNotificationList = LocalNotification.buildNotificationList(pluginCall);
        if (buildNotificationList != null && (schedule = this.manager.schedule(pluginCall, buildNotificationList)) != null) {
            this.notificationStorage.appendNotifications(buildNotificationList);
            JSObject jSObject = new JSObject();
            JSArray jSArray = new JSArray();
            for (int i4 = 0; i4 < schedule.length(); i4++) {
                try {
                    jSArray.put(new JSObject().put("id", schedule.getInt(i4)));
                } catch (Exception unused) {
                }
            }
            jSObject.put("notifications", (Object) jSArray);
            pluginCall.resolve(jSObject);
        }
    }
}
