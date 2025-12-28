package com.capacitorjs.plugins.localnotifications;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Color;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import com.getcapacitor.JSArray;
import com.getcapacitor.JSObject;
import com.getcapacitor.Logger;
import com.getcapacitor.PluginCall;
import java.util.List;

public class NotificationChannelManager {
    private static String CHANNEL_DESCRIPTION = "description";
    private static String CHANNEL_ID = "id";
    private static String CHANNEL_IMPORTANCE = "importance";
    private static String CHANNEL_LIGHT_COLOR = "lightColor";
    private static String CHANNEL_NAME = "name";
    private static String CHANNEL_SOUND = "sound";
    private static String CHANNEL_USE_LIGHTS = "lights";
    private static String CHANNEL_VIBRATE = "vibration";
    private static String CHANNEL_VISIBILITY = "visibility";
    private Context context;
    private NotificationManager notificationManager;

    public NotificationChannelManager(Context context2) {
        this.context = context2;
        this.notificationManager = (NotificationManager) context2.getSystemService("notification");
    }

    public void createChannel(PluginCall pluginCall) {
        if (Build.VERSION.SDK_INT >= 26) {
            JSObject jSObject = new JSObject();
            if (pluginCall.getString(CHANNEL_ID) != null) {
                String str = CHANNEL_ID;
                jSObject.put(str, pluginCall.getString(str));
                if (pluginCall.getString(CHANNEL_NAME) != null) {
                    String str2 = CHANNEL_NAME;
                    jSObject.put(str2, pluginCall.getString(str2));
                    String str3 = CHANNEL_IMPORTANCE;
                    jSObject.put(str3, (Object) pluginCall.getInt(str3, 3));
                    String str4 = CHANNEL_DESCRIPTION;
                    jSObject.put(str4, pluginCall.getString(str4, ""));
                    String str5 = CHANNEL_VISIBILITY;
                    jSObject.put(str5, (Object) pluginCall.getInt(str5, 1));
                    String str6 = CHANNEL_SOUND;
                    jSObject.put(str6, pluginCall.getString(str6, (String) null));
                    String str7 = CHANNEL_VIBRATE;
                    Boolean bool = Boolean.FALSE;
                    jSObject.put(str7, (Object) pluginCall.getBoolean(str7, bool));
                    String str8 = CHANNEL_USE_LIGHTS;
                    jSObject.put(str8, (Object) pluginCall.getBoolean(str8, bool));
                    String str9 = CHANNEL_LIGHT_COLOR;
                    jSObject.put(str9, pluginCall.getString(str9, (String) null));
                    createChannel(jSObject);
                    pluginCall.resolve();
                    return;
                }
                pluginCall.reject("Channel missing name");
                return;
            }
            pluginCall.reject("Channel missing identifier");
            return;
        }
        pluginCall.unavailable();
    }

    public void deleteChannel(PluginCall pluginCall) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.notificationManager.deleteNotificationChannel(pluginCall.getString("id"));
            pluginCall.resolve();
            return;
        }
        pluginCall.unavailable();
    }

    public void listChannels(PluginCall pluginCall) {
        if (Build.VERSION.SDK_INT >= 26) {
            List<Object> a4 = this.notificationManager.getNotificationChannels();
            JSArray jSArray = new JSArray();
            for (Object a5 : a4) {
                NotificationChannel a6 = C0569r.a(a5);
                JSObject jSObject = new JSObject();
                jSObject.put(CHANNEL_ID, a6.getId());
                jSObject.put(CHANNEL_NAME, (Object) a6.getName());
                jSObject.put(CHANNEL_DESCRIPTION, a6.getDescription());
                jSObject.put(CHANNEL_IMPORTANCE, a6.getImportance());
                jSObject.put(CHANNEL_VISIBILITY, a6.getLockscreenVisibility());
                jSObject.put(CHANNEL_SOUND, (Object) a6.getSound());
                jSObject.put(CHANNEL_VIBRATE, a6.shouldVibrate());
                jSObject.put(CHANNEL_USE_LIGHTS, a6.shouldShowLights());
                jSObject.put(CHANNEL_LIGHT_COLOR, String.format("#%06X", new Object[]{Integer.valueOf(16777215 & a6.getLightColor())}));
                String tags = Logger.tags("NotificationChannel");
                Logger.debug(tags, "visibility " + a6.getLockscreenVisibility());
                String tags2 = Logger.tags("NotificationChannel");
                Logger.debug(tags2, "importance " + a6.getImportance());
                jSArray.put(jSObject);
            }
            JSObject jSObject2 = new JSObject();
            jSObject2.put("channels", (Object) jSArray);
            pluginCall.resolve(jSObject2);
            return;
        }
        pluginCall.unavailable();
    }

    public NotificationChannelManager(Context context2, NotificationManager notificationManager2) {
        this.context = context2;
        this.notificationManager = notificationManager2;
    }

    public void createChannel(JSObject jSObject) {
        if (Build.VERSION.SDK_INT >= 26) {
            n.a();
            NotificationChannel a4 = e.a(jSObject.getString(CHANNEL_ID), jSObject.getString(CHANNEL_NAME), jSObject.getInteger(CHANNEL_IMPORTANCE).intValue());
            a4.setDescription(jSObject.getString(CHANNEL_DESCRIPTION));
            a4.setLockscreenVisibility(jSObject.getInteger(CHANNEL_VISIBILITY).intValue());
            a4.enableVibration(jSObject.getBool(CHANNEL_VIBRATE).booleanValue());
            a4.enableLights(jSObject.getBool(CHANNEL_USE_LIGHTS).booleanValue());
            String string = jSObject.getString(CHANNEL_LIGHT_COLOR);
            if (string != null) {
                try {
                    a4.setLightColor(Color.parseColor(string));
                } catch (IllegalArgumentException unused) {
                    Logger.error(Logger.tags("NotificationChannel"), "Invalid color provided for light color.", (Throwable) null);
                }
            }
            String string2 = jSObject.getString(CHANNEL_SOUND, (String) null);
            if (string2 != null && !string2.isEmpty()) {
                if (string2.contains(".")) {
                    string2 = string2.substring(0, string2.lastIndexOf(46));
                }
                AudioAttributes build = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
                a4.setSound(Uri.parse("android.resource://" + this.context.getPackageName() + "/raw/" + string2), build);
            }
            this.notificationManager.createNotificationChannel(a4);
        }
    }
}
