package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

class s {

    /* renamed from: c  reason: collision with root package name */
    private static final s f12025c = new s((Long) null, (TimeZone) null);

    /* renamed from: a  reason: collision with root package name */
    private final Long f12026a;

    /* renamed from: b  reason: collision with root package name */
    private final TimeZone f12027b;

    private s(Long l4, TimeZone timeZone) {
        this.f12026a = l4;
        this.f12027b = timeZone;
    }

    static s c() {
        return f12025c;
    }

    /* access modifiers changed from: package-private */
    public Calendar a() {
        return b(this.f12027b);
    }

    /* access modifiers changed from: package-private */
    public Calendar b(TimeZone timeZone) {
        Calendar calendar;
        if (timeZone == null) {
            calendar = Calendar.getInstance();
        } else {
            calendar = Calendar.getInstance(timeZone);
        }
        Long l4 = this.f12026a;
        if (l4 != null) {
            calendar.setTimeInMillis(l4.longValue());
        }
        return calendar;
    }
}
