package com.capacitorjs.plugins.localnotifications;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.work.c;
import com.getcapacitor.JSArray;
import com.getcapacitor.JSObject;
import com.getcapacitor.Logger;
import com.getcapacitor.PluginCall;
import com.getcapacitor.plugin.util.AssetUtil;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class LocalNotification {
    private String actionTypeId;
    private List<LocalNotificationAttachment> attachments;
    private boolean autoCancel;
    private String body;
    private String channelId;
    private JSObject extra;
    private String group;
    private boolean groupSummary;
    private String iconColor;
    private Integer id;
    private List<String> inboxList;
    private String largeBody;
    private String largeIcon;
    private boolean ongoing;
    private LocalNotificationSchedule schedule;
    private String smallIcon;
    private String sound;
    private String source;
    private String summaryText;
    private String title;

    public static JSObject buildLocalNotificationPendingList(List<LocalNotification> list) {
        JSObject jSObject = new JSObject();
        JSArray jSArray = new JSArray();
        for (LocalNotification next : list) {
            JSObject jSObject2 = new JSObject();
            jSObject2.put("id", (Object) next.getId());
            jSObject2.put("title", next.getTitle());
            jSObject2.put("body", next.getBody());
            LocalNotificationSchedule schedule2 = next.getSchedule();
            if (schedule2 != null) {
                JSObject jSObject3 = new JSObject();
                jSObject3.put("at", (Object) schedule2.getAt());
                jSObject3.put("every", schedule2.getEvery());
                jSObject3.put("count", schedule2.getCount());
                jSObject3.put("on", (Object) schedule2.getOnObj());
                jSObject3.put("repeats", schedule2.isRepeating());
                jSObject2.put("schedule", (Object) jSObject3);
            }
            jSObject2.put("extra", (Object) next.getExtra());
            jSArray.put(jSObject2);
        }
        jSObject.put("notifications", (Object) jSArray);
        return jSObject;
    }

    public static LocalNotification buildNotificationFromJSObject(JSObject jSObject) {
        LocalNotification localNotification = new LocalNotification();
        localNotification.setSource(jSObject.toString());
        localNotification.setId(jSObject.getInteger("id"));
        localNotification.setBody(jSObject.getString("body"));
        localNotification.setLargeBody(jSObject.getString("largeBody"));
        localNotification.setSummaryText(jSObject.getString("summaryText"));
        localNotification.setActionTypeId(jSObject.getString("actionTypeId"));
        localNotification.setGroup(jSObject.getString("group"));
        localNotification.setSound(jSObject.getString("sound"));
        localNotification.setTitle(jSObject.getString("title"));
        localNotification.setSmallIcon(jSObject.getString("smallIcon"));
        localNotification.setLargeIcon(jSObject.getString("largeIcon"));
        localNotification.setIconColor(jSObject.getString("iconColor"));
        localNotification.setAttachments(LocalNotificationAttachment.getAttachments(jSObject));
        Boolean bool = Boolean.FALSE;
        localNotification.setGroupSummary(jSObject.getBoolean("groupSummary", bool).booleanValue());
        localNotification.setChannelId(jSObject.getString("channelId"));
        JSObject jSObject2 = jSObject.getJSObject("schedule");
        if (jSObject2 != null) {
            localNotification.setSchedule(new LocalNotificationSchedule(jSObject2));
        }
        localNotification.setExtra(jSObject.getJSObject("extra"));
        localNotification.setOngoing(jSObject.getBoolean("ongoing", bool).booleanValue());
        localNotification.setAutoCancel(jSObject.getBoolean("autoCancel", Boolean.TRUE).booleanValue());
        try {
            JSONArray jSONArray = jSObject.getJSONArray("inboxList");
            if (jSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                    arrayList.add(jSONArray.getString(i4));
                }
                localNotification.setInboxList(arrayList);
            }
        } catch (Exception unused) {
        }
        return localNotification;
    }

    public static List<LocalNotification> buildNotificationList(PluginCall pluginCall) {
        JSArray array = pluginCall.getArray("notifications");
        if (array == null) {
            pluginCall.reject("Must provide notifications array as notifications option");
            return null;
        }
        ArrayList arrayList = new ArrayList(array.length());
        try {
            for (JSONObject jSONObject : array.toList()) {
                try {
                    long j4 = jSONObject.getLong("id");
                    if (j4 <= 2147483647L) {
                        if (j4 >= -2147483648L) {
                            try {
                                arrayList.add(buildNotificationFromJSObject(JSObject.fromJSONObject(jSONObject)));
                            } catch (ParseException e4) {
                                pluginCall.reject("Invalid date format sent to Notification plugin", (Exception) e4);
                                return null;
                            }
                        }
                    }
                    pluginCall.reject("The identifier should be a Java int");
                    return null;
                } catch (JSONException e5) {
                    pluginCall.reject("Invalid JSON object sent to NotificationPlugin", (Exception) e5);
                    return null;
                }
            }
            return arrayList;
        } catch (JSONException unused) {
            pluginCall.reject("Provided notification format is invalid");
            return null;
        }
    }

    public static List<Integer> getLocalNotificationPendingList(PluginCall pluginCall) {
        List<JSONObject> list;
        try {
            list = pluginCall.getArray("notifications").toList();
        } catch (JSONException unused) {
            list = null;
        }
        if (list == null || list.size() == 0) {
            pluginCall.reject("Must provide notifications array as notifications option");
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (JSONObject jSONObject : list) {
            try {
                arrayList.add(Integer.valueOf(jSONObject.getInt("id")));
            } catch (JSONException unused2) {
            }
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LocalNotification localNotification = (LocalNotification) obj;
        String str = this.title;
        if (str == null ? localNotification.title != null : !str.equals(localNotification.title)) {
            return false;
        }
        String str2 = this.body;
        if (str2 == null ? localNotification.body != null : !str2.equals(localNotification.body)) {
            return false;
        }
        String str3 = this.largeBody;
        if (str3 == null ? localNotification.largeBody != null : !str3.equals(localNotification.largeBody)) {
            return false;
        }
        Integer num = this.id;
        if (num == null ? localNotification.id != null : !num.equals(localNotification.id)) {
            return false;
        }
        String str4 = this.sound;
        if (str4 == null ? localNotification.sound != null : !str4.equals(localNotification.sound)) {
            return false;
        }
        String str5 = this.smallIcon;
        if (str5 == null ? localNotification.smallIcon != null : !str5.equals(localNotification.smallIcon)) {
            return false;
        }
        String str6 = this.largeIcon;
        if (str6 == null ? localNotification.largeIcon != null : !str6.equals(localNotification.largeIcon)) {
            return false;
        }
        String str7 = this.iconColor;
        if (str7 == null ? localNotification.iconColor != null : !str7.equals(localNotification.iconColor)) {
            return false;
        }
        String str8 = this.actionTypeId;
        if (str8 == null ? localNotification.actionTypeId != null : !str8.equals(localNotification.actionTypeId)) {
            return false;
        }
        String str9 = this.group;
        if (str9 == null ? localNotification.group != null : !str9.equals(localNotification.group)) {
            return false;
        }
        JSObject jSObject = this.extra;
        if (jSObject == null ? localNotification.extra != null : !jSObject.equals(localNotification.extra)) {
            return false;
        }
        List<LocalNotificationAttachment> list = this.attachments;
        if (list == null ? localNotification.attachments != null : !list.equals(localNotification.attachments)) {
            return false;
        }
        List<String> list2 = this.inboxList;
        if (list2 == null ? localNotification.inboxList != null : !list2.equals(localNotification.inboxList)) {
            return false;
        }
        if (this.groupSummary != localNotification.groupSummary || this.ongoing != localNotification.ongoing || this.autoCancel != localNotification.autoCancel) {
            return false;
        }
        LocalNotificationSchedule localNotificationSchedule = this.schedule;
        LocalNotificationSchedule localNotificationSchedule2 = localNotification.schedule;
        if (localNotificationSchedule != null) {
            return localNotificationSchedule.equals(localNotificationSchedule2);
        }
        if (localNotificationSchedule2 == null) {
            return true;
        }
        return false;
    }

    public String getActionTypeId() {
        return this.actionTypeId;
    }

    public List<LocalNotificationAttachment> getAttachments() {
        return this.attachments;
    }

    public String getBody() {
        return this.body;
    }

    public String getChannelId() {
        return this.channelId;
    }

    public JSObject getExtra() {
        return this.extra;
    }

    public String getGroup() {
        return this.group;
    }

    public String getIconColor(String str) {
        String str2 = this.iconColor;
        if (str2 != null) {
            return str2;
        }
        return str;
    }

    public Integer getId() {
        return this.id;
    }

    public List<String> getInboxList() {
        return this.inboxList;
    }

    public String getLargeBody() {
        return this.largeBody;
    }

    public Bitmap getLargeIcon(Context context) {
        String str = this.largeIcon;
        if (str == null) {
            return null;
        }
        return BitmapFactory.decodeResource(context.getResources(), AssetUtil.getResourceID(context, str, "drawable"));
    }

    public LocalNotificationSchedule getSchedule() {
        return this.schedule;
    }

    public int getSmallIcon(Context context, int i4) {
        int i5;
        String str = this.smallIcon;
        if (str != null) {
            i5 = AssetUtil.getResourceID(context, str, "drawable");
        } else {
            i5 = 0;
        }
        if (i5 == 0) {
            return i4;
        }
        return i5;
    }

    public String getSound(Context context, int i4) {
        int i5;
        String resourceBaseName = AssetUtil.getResourceBaseName(this.sound);
        if (resourceBaseName != null) {
            i5 = AssetUtil.getResourceID(context, resourceBaseName, "raw");
        } else {
            i5 = 0;
        }
        if (i5 != 0) {
            i4 = i5;
        }
        if (i4 == 0) {
            return null;
        }
        return "android.resource://" + context.getPackageName() + "/" + i4;
    }

    public String getSource() {
        return this.source;
    }

    public String getSummaryText() {
        return this.summaryText;
    }

    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        String str = this.title;
        int i14 = 0;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        int i15 = i4 * 31;
        String str2 = this.body;
        if (str2 != null) {
            i5 = str2.hashCode();
        } else {
            i5 = 0;
        }
        int i16 = (i15 + i5) * 31;
        Integer num = this.id;
        if (num != null) {
            i6 = num.hashCode();
        } else {
            i6 = 0;
        }
        int i17 = (i16 + i6) * 31;
        String str3 = this.sound;
        if (str3 != null) {
            i7 = str3.hashCode();
        } else {
            i7 = 0;
        }
        int i18 = (i17 + i7) * 31;
        String str4 = this.smallIcon;
        if (str4 != null) {
            i8 = str4.hashCode();
        } else {
            i8 = 0;
        }
        int i19 = (i18 + i8) * 31;
        String str5 = this.iconColor;
        if (str5 != null) {
            i9 = str5.hashCode();
        } else {
            i9 = 0;
        }
        int i20 = (i19 + i9) * 31;
        String str6 = this.actionTypeId;
        if (str6 != null) {
            i10 = str6.hashCode();
        } else {
            i10 = 0;
        }
        int i21 = (i20 + i10) * 31;
        String str7 = this.group;
        if (str7 != null) {
            i11 = str7.hashCode();
        } else {
            i11 = 0;
        }
        int a4 = (((((((i21 + i11) * 31) + c.a(this.groupSummary)) * 31) + c.a(this.ongoing)) * 31) + c.a(this.autoCancel)) * 31;
        JSObject jSObject = this.extra;
        if (jSObject != null) {
            i12 = jSObject.hashCode();
        } else {
            i12 = 0;
        }
        int i22 = (a4 + i12) * 31;
        List<LocalNotificationAttachment> list = this.attachments;
        if (list != null) {
            i13 = list.hashCode();
        } else {
            i13 = 0;
        }
        int i23 = (i22 + i13) * 31;
        LocalNotificationSchedule localNotificationSchedule = this.schedule;
        if (localNotificationSchedule != null) {
            i14 = localNotificationSchedule.hashCode();
        }
        return i23 + i14;
    }

    public boolean isAutoCancel() {
        return this.autoCancel;
    }

    public boolean isGroupSummary() {
        return this.groupSummary;
    }

    public boolean isOngoing() {
        return this.ongoing;
    }

    public boolean isScheduled() {
        LocalNotificationSchedule localNotificationSchedule = this.schedule;
        if (localNotificationSchedule == null || (localNotificationSchedule.getOn() == null && this.schedule.getAt() == null && this.schedule.getEvery() == null)) {
            return false;
        }
        return true;
    }

    public void setActionTypeId(String str) {
        this.actionTypeId = str;
    }

    public void setAttachments(List<LocalNotificationAttachment> list) {
        this.attachments = list;
    }

    public void setAutoCancel(boolean z3) {
        this.autoCancel = z3;
    }

    public void setBody(String str) {
        this.body = str;
    }

    public void setChannelId(String str) {
        this.channelId = str;
    }

    public void setExtra(JSObject jSObject) {
        this.extra = jSObject;
    }

    public void setExtraFromString(String str) {
        try {
            this.extra = JSObject.fromJSONObject(new JSONObject(str));
        } catch (JSONException e4) {
            Logger.error(Logger.tags("LN"), "Cannot rebuild extra data", e4);
        }
    }

    public void setGroup(String str) {
        this.group = str;
    }

    public void setGroupSummary(boolean z3) {
        this.groupSummary = z3;
    }

    public void setIconColor(String str) {
        this.iconColor = str;
    }

    public void setId(Integer num) {
        this.id = num;
    }

    public void setInboxList(List<String> list) {
        this.inboxList = list;
    }

    public void setLargeBody(String str) {
        this.largeBody = str;
    }

    public void setLargeIcon(String str) {
        this.largeIcon = AssetUtil.getResourceBaseName(str);
    }

    public void setOngoing(boolean z3) {
        this.ongoing = z3;
    }

    public void setSchedule(LocalNotificationSchedule localNotificationSchedule) {
        this.schedule = localNotificationSchedule;
    }

    public void setSmallIcon(String str) {
        this.smallIcon = AssetUtil.getResourceBaseName(str);
    }

    public void setSound(String str) {
        this.sound = str;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setSummaryText(String str) {
        this.summaryText = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String toString() {
        return "LocalNotification{title='" + this.title + '\'' + ", body='" + this.body + '\'' + ", id=" + this.id + ", sound='" + this.sound + '\'' + ", smallIcon='" + this.smallIcon + '\'' + ", iconColor='" + this.iconColor + '\'' + ", actionTypeId='" + this.actionTypeId + '\'' + ", group='" + this.group + '\'' + ", extra=" + this.extra + ", attachments=" + this.attachments + ", schedule=" + this.schedule + ", groupSummary=" + this.groupSummary + ", ongoing=" + this.ongoing + ", autoCancel=" + this.autoCancel + '}';
    }
}
