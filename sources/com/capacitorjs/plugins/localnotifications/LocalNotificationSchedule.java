package com.capacitorjs.plugins.localnotifications;

import com.getcapacitor.JSObject;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class LocalNotificationSchedule {
    public static String JS_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
    private Date at;
    private Integer count;
    private String every;
    private DateMatch on;
    private Boolean repeats;
    private JSObject scheduleObj;
    private Boolean whileIdle;

    public LocalNotificationSchedule(JSObject jSObject) {
        this.scheduleObj = jSObject;
        buildEveryElement(jSObject);
        buildCountElement(jSObject);
        buildAtElement(jSObject);
        buildOnElement(jSObject);
        this.whileIdle = jSObject.getBoolean("allowWhileIdle", Boolean.FALSE);
    }

    private void buildAtElement(JSObject jSObject) {
        this.repeats = jSObject.getBool("repeats");
        String string = jSObject.getString("at");
        if (string != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(JS_DATE_FORMAT);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            this.at = simpleDateFormat.parse(string);
        }
    }

    private void buildCountElement(JSObject jSObject) {
        this.count = jSObject.getInteger("count", 1);
    }

    private void buildEveryElement(JSObject jSObject) {
        this.every = jSObject.getString("every");
    }

    private void buildOnElement(JSObject jSObject) {
        JSObject jSObject2 = jSObject.getJSObject("on");
        if (jSObject2 != null) {
            DateMatch dateMatch = new DateMatch();
            this.on = dateMatch;
            dateMatch.setYear(jSObject2.getInteger("year"));
            this.on.setMonth(jSObject2.getInteger("month"));
            this.on.setDay(jSObject2.getInteger("day"));
            this.on.setWeekday(jSObject2.getInteger("weekday"));
            this.on.setHour(jSObject2.getInteger("hour"));
            this.on.setMinute(jSObject2.getInteger("minute"));
            this.on.setSecond(jSObject2.getInteger("second"));
        }
    }

    public boolean allowWhileIdle() {
        return this.whileIdle.booleanValue();
    }

    public Date getAt() {
        return this.at;
    }

    public int getCount() {
        return this.count.intValue();
    }

    public String getEvery() {
        return this.every;
    }

    public Long getEveryInterval() {
        String str = this.every;
        str.hashCode();
        char c4 = 65535;
        switch (str.hashCode()) {
            case -1140306882:
                if (str.equals("two-weeks")) {
                    c4 = 0;
                    break;
                }
                break;
            case -1074026988:
                if (str.equals("minute")) {
                    c4 = 1;
                    break;
                }
                break;
            case -906279820:
                if (str.equals("second")) {
                    c4 = 2;
                    break;
                }
                break;
            case 99228:
                if (str.equals("day")) {
                    c4 = 3;
                    break;
                }
                break;
            case 3208676:
                if (str.equals("hour")) {
                    c4 = 4;
                    break;
                }
                break;
            case 3645428:
                if (str.equals("week")) {
                    c4 = 5;
                    break;
                }
                break;
            case 3704893:
                if (str.equals("year")) {
                    c4 = 6;
                    break;
                }
                break;
            case 104080000:
                if (str.equals("month")) {
                    c4 = 7;
                    break;
                }
                break;
        }
        switch (c4) {
            case 0:
                return Long.valueOf(((long) (this.count.intValue() * 2)) * 604800000);
            case 1:
                return Long.valueOf(((long) this.count.intValue()) * 60000);
            case 2:
                return Long.valueOf(((long) this.count.intValue()) * 1000);
            case 3:
                return Long.valueOf(((long) this.count.intValue()) * 86400000);
            case 4:
                return Long.valueOf(((long) this.count.intValue()) * 3600000);
            case 5:
                return Long.valueOf(((long) this.count.intValue()) * 604800000);
            case 6:
                return Long.valueOf(((long) this.count.intValue()) * 31449600000L);
            case 7:
                return Long.valueOf(((long) (this.count.intValue() * 30)) * 86400000);
            default:
                return null;
        }
    }

    public Long getNextOnSchedule(Date date) {
        return Long.valueOf(this.on.nextTrigger(date));
    }

    public DateMatch getOn() {
        return this.on;
    }

    public JSObject getOnObj() {
        return this.scheduleObj.getJSObject("on");
    }

    public Boolean getRepeats() {
        return this.repeats;
    }

    public boolean isRemovable() {
        if (this.every != null || this.on != null) {
            return false;
        }
        if (this.at != null) {
            return !isRepeating();
        }
        return true;
    }

    public boolean isRepeating() {
        return Boolean.TRUE.equals(this.repeats);
    }

    public void setAt(Date date) {
        this.at = date;
    }

    public void setCount(int i4) {
        this.count = Integer.valueOf(i4);
    }

    public void setEvery(String str) {
        this.every = str;
    }

    public void setOn(DateMatch dateMatch) {
        this.on = dateMatch;
    }

    public void setRepeats(Boolean bool) {
        this.repeats = bool;
    }

    public LocalNotificationSchedule() {
    }
}
