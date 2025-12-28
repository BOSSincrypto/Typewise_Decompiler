package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

abstract class y {

    /* renamed from: a  reason: collision with root package name */
    static AtomicReference f12028a = new AtomicReference();

    static long a(long j4) {
        Calendar k4 = k();
        k4.setTimeInMillis(j4);
        return c(k4).getTimeInMillis();
    }

    private static DateFormat b(String str, Locale locale) {
        DateFormat a4 = DateFormat.getInstanceForSkeleton(str, locale);
        a4.setTimeZone(j());
        a4.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        return a4;
    }

    static Calendar c(Calendar calendar) {
        Calendar l4 = l(calendar);
        Calendar k4 = k();
        k4.set(l4.get(1), l4.get(2), l4.get(5));
        return k4;
    }

    private static java.text.DateFormat d(int i4, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i4, locale);
        dateInstance.setTimeZone(h());
        return dateInstance;
    }

    static java.text.DateFormat e(Locale locale) {
        return d(0, locale);
    }

    static DateFormat f(Locale locale) {
        return b("MMMMEEEEd", locale);
    }

    static s g() {
        s sVar = (s) f12028a.get();
        if (sVar == null) {
            return s.c();
        }
        return sVar;
    }

    private static TimeZone h() {
        return TimeZone.getTimeZone("UTC");
    }

    static Calendar i() {
        Calendar a4 = g().a();
        a4.set(11, 0);
        a4.set(12, 0);
        a4.set(13, 0);
        a4.set(14, 0);
        a4.setTimeZone(h());
        return a4;
    }

    private static android.icu.util.TimeZone j() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    static Calendar k() {
        return l((Calendar) null);
    }

    static Calendar l(Calendar calendar) {
        Calendar instance = Calendar.getInstance(h());
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }

    static DateFormat m(Locale locale) {
        return b("yMMMM", locale);
    }

    static DateFormat n(Locale locale) {
        return b("yMMMMEEEEd", locale);
    }
}
