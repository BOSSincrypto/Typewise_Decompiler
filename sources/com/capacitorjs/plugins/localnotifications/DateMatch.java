package com.capacitorjs.plugins.localnotifications;

import java.util.Calendar;
import java.util.Date;

public class DateMatch {
    private static final String separator = " ";
    private Integer day;
    private Integer hour;
    private Integer minute;
    private Integer month;
    private Integer second;
    private Integer unit = -1;
    private Integer weekday;
    private Integer year;

    private Calendar buildCalendar(Date date) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        instance.set(14, 0);
        return instance;
    }

    private Calendar buildNextTriggerTime(Date date) {
        Calendar buildCalendar = buildCalendar(date);
        Integer num = this.year;
        if (num != null) {
            buildCalendar.set(1, num.intValue());
            if (this.unit.intValue() == -1) {
                this.unit = 1;
            }
        }
        Integer num2 = this.month;
        if (num2 != null) {
            buildCalendar.set(2, num2.intValue());
            if (this.unit.intValue() == -1) {
                this.unit = 2;
            }
        }
        Integer num3 = this.day;
        if (num3 != null) {
            buildCalendar.set(5, num3.intValue());
            if (this.unit.intValue() == -1) {
                this.unit = 5;
            }
        }
        Integer num4 = this.weekday;
        if (num4 != null) {
            buildCalendar.set(7, num4.intValue());
            if (this.unit.intValue() == -1) {
                this.unit = 7;
            }
        }
        Integer num5 = this.hour;
        if (num5 != null) {
            buildCalendar.set(11, num5.intValue());
            if (this.unit.intValue() == -1) {
                this.unit = 11;
            }
        }
        Integer num6 = this.minute;
        if (num6 != null) {
            buildCalendar.set(12, num6.intValue());
            if (this.unit.intValue() == -1) {
                this.unit = 12;
            }
        }
        Integer num7 = this.second;
        if (num7 != null) {
            buildCalendar.set(13, num7.intValue());
            if (this.unit.intValue() == -1) {
                this.unit = 13;
            }
        }
        return buildCalendar;
    }

    public static DateMatch fromMatchString(String str) {
        DateMatch dateMatch = new DateMatch();
        String[] split = str.split(separator);
        if (split != null && split.length == 7) {
            dateMatch.setYear(getValueFromCronElement(split[0]));
            dateMatch.setMonth(getValueFromCronElement(split[1]));
            dateMatch.setDay(getValueFromCronElement(split[2]));
            dateMatch.setWeekday(getValueFromCronElement(split[3]));
            dateMatch.setHour(getValueFromCronElement(split[4]));
            dateMatch.setMinute(getValueFromCronElement(split[5]));
            dateMatch.setUnit(getValueFromCronElement(split[6]));
        }
        if (split != null && split.length == 8) {
            dateMatch.setYear(getValueFromCronElement(split[0]));
            dateMatch.setMonth(getValueFromCronElement(split[1]));
            dateMatch.setDay(getValueFromCronElement(split[2]));
            dateMatch.setWeekday(getValueFromCronElement(split[3]));
            dateMatch.setHour(getValueFromCronElement(split[4]));
            dateMatch.setMinute(getValueFromCronElement(split[5]));
            dateMatch.setSecond(getValueFromCronElement(split[6]));
            dateMatch.setUnit(getValueFromCronElement(split[7]));
        }
        return dateMatch;
    }

    public static Integer getValueFromCronElement(String str) {
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private long postponeTriggerIfNeeded(Calendar calendar, Calendar calendar2) {
        if (calendar2.getTimeInMillis() <= calendar.getTimeInMillis() && this.unit.intValue() != -1) {
            Integer num = -1;
            if (this.unit.intValue() == 1 || this.unit.intValue() == 2) {
                num = 1;
            } else if (this.unit.intValue() == 5) {
                num = 2;
            } else if (this.unit.intValue() == 7) {
                num = 4;
            } else if (this.unit.intValue() == 11) {
                num = 5;
            } else if (this.unit.intValue() == 12) {
                num = 11;
            } else if (this.unit.intValue() == 13) {
                num = 12;
            }
            if (num.intValue() != -1) {
                calendar2.set(num.intValue(), calendar2.get(num.intValue()) + 1);
            }
        }
        return calendar2.getTimeInMillis();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DateMatch dateMatch = (DateMatch) obj;
        Integer num = this.year;
        if (num == null ? dateMatch.year != null : !num.equals(dateMatch.year)) {
            return false;
        }
        Integer num2 = this.month;
        if (num2 == null ? dateMatch.month != null : !num2.equals(dateMatch.month)) {
            return false;
        }
        Integer num3 = this.day;
        if (num3 == null ? dateMatch.day != null : !num3.equals(dateMatch.day)) {
            return false;
        }
        Integer num4 = this.weekday;
        if (num4 == null ? dateMatch.weekday != null : !num4.equals(dateMatch.weekday)) {
            return false;
        }
        Integer num5 = this.hour;
        if (num5 == null ? dateMatch.hour != null : !num5.equals(dateMatch.hour)) {
            return false;
        }
        Integer num6 = this.minute;
        if (num6 == null ? dateMatch.minute != null : !num6.equals(dateMatch.minute)) {
            return false;
        }
        Integer num7 = this.second;
        Integer num8 = dateMatch.second;
        if (num7 != null) {
            return num7.equals(num8);
        }
        if (num8 == null) {
            return true;
        }
        return false;
    }

    public Integer getDay() {
        return this.day;
    }

    public Integer getHour() {
        return this.hour;
    }

    public Integer getMinute() {
        return this.minute;
    }

    public Integer getMonth() {
        return this.month;
    }

    public Integer getSecond() {
        return this.second;
    }

    public Integer getUnit() {
        return this.unit;
    }

    public Integer getWeekday() {
        return this.weekday;
    }

    public Integer getYear() {
        return this.year;
    }

    public int hashCode() {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Integer num = this.year;
        int i10 = 0;
        if (num != null) {
            i4 = num.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = i4 * 31;
        Integer num2 = this.month;
        if (num2 != null) {
            i5 = num2.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (i11 + i5) * 31;
        Integer num3 = this.day;
        if (num3 != null) {
            i6 = num3.hashCode();
        } else {
            i6 = 0;
        }
        int i13 = (i12 + i6) * 31;
        Integer num4 = this.weekday;
        if (num4 != null) {
            i7 = num4.hashCode();
        } else {
            i7 = 0;
        }
        int i14 = (i13 + i7) * 31;
        Integer num5 = this.hour;
        if (num5 != null) {
            i8 = num5.hashCode();
        } else {
            i8 = 0;
        }
        int i15 = (i14 + i8) * 31;
        Integer num6 = this.minute;
        if (num6 != null) {
            i9 = num6.hashCode();
        } else {
            i9 = 0;
        }
        int i16 = i15 + i9 + 31;
        Integer num7 = this.second;
        if (num7 != null) {
            i10 = num7.hashCode();
        }
        return i16 + i10;
    }

    public long nextTrigger(Date date) {
        return postponeTriggerIfNeeded(buildCalendar(date), buildNextTriggerTime(date));
    }

    public void setDay(Integer num) {
        this.day = num;
    }

    public void setHour(Integer num) {
        this.hour = num;
    }

    public void setMinute(Integer num) {
        this.minute = num;
    }

    public void setMonth(Integer num) {
        this.month = num;
    }

    public void setSecond(Integer num) {
        this.second = num;
    }

    public void setUnit(Integer num) {
        this.unit = num;
    }

    public void setWeekday(Integer num) {
        this.weekday = num;
    }

    public void setYear(Integer num) {
        this.year = num;
    }

    public String toMatchString() {
        return (this.year + separator + this.month + separator + this.day + separator + this.weekday + separator + this.hour + separator + this.minute + separator + this.second + separator + this.unit).replace("null", "*");
    }

    public String toString() {
        return "DateMatch{year=" + this.year + ", month=" + this.month + ", day=" + this.day + ", weekday=" + this.weekday + ", hour=" + this.hour + ", minute=" + this.minute + ", second=" + this.second + '}';
    }
}
