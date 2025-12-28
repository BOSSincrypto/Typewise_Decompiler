package org.apache.commons.lang3.time;

import e3.d;
import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

abstract class c {

    /* renamed from: b  reason: collision with root package name */
    private static final ConcurrentMap f15689b = new ConcurrentHashMap(7);

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentMap f15690a = new ConcurrentHashMap(7);

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Object[] f15691a;

        /* renamed from: b  reason: collision with root package name */
        private int f15692b;

        a(Object... objArr) {
            this.f15691a = objArr;
        }

        public boolean equals(Object obj) {
            return Arrays.equals(this.f15691a, ((a) obj).f15691a);
        }

        public int hashCode() {
            if (this.f15692b == 0) {
                int i4 = 0;
                for (Object obj : this.f15691a) {
                    if (obj != null) {
                        i4 = (i4 * 7) + obj.hashCode();
                    }
                }
                this.f15692b = i4;
            }
            return this.f15692b;
        }
    }

    c() {
    }

    private Format d(Integer num, Integer num2, TimeZone timeZone, Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        return f(g(num, num2, locale), timeZone, locale);
    }

    static String g(Integer num, Integer num2, Locale locale) {
        DateFormat dateFormat;
        a aVar = new a(num, num2, locale);
        ConcurrentMap concurrentMap = f15689b;
        String str = (String) concurrentMap.get(aVar);
        if (str != null) {
            return str;
        }
        if (num == null) {
            try {
                dateFormat = DateFormat.getTimeInstance(num2.intValue(), locale);
            } catch (ClassCastException unused) {
                throw new IllegalArgumentException("No date time pattern for locale: " + locale);
            }
        } else if (num2 == null) {
            dateFormat = DateFormat.getDateInstance(num.intValue(), locale);
        } else {
            dateFormat = DateFormat.getDateTimeInstance(num.intValue(), num2.intValue(), locale);
        }
        String pattern = ((SimpleDateFormat) dateFormat).toPattern();
        String str2 = (String) concurrentMap.putIfAbsent(aVar, pattern);
        if (str2 != null) {
            return str2;
        }
        return pattern;
    }

    /* access modifiers changed from: protected */
    public abstract Format a(String str, TimeZone timeZone, Locale locale);

    /* access modifiers changed from: package-private */
    public Format b(int i4, TimeZone timeZone, Locale locale) {
        return d(Integer.valueOf(i4), (Integer) null, timeZone, locale);
    }

    /* access modifiers changed from: package-private */
    public Format c(int i4, int i5, TimeZone timeZone, Locale locale) {
        return d(Integer.valueOf(i4), Integer.valueOf(i5), timeZone, locale);
    }

    public Format e() {
        return c(3, 3, TimeZone.getDefault(), Locale.getDefault());
    }

    public Format f(String str, TimeZone timeZone, Locale locale) {
        d.a(str, "pattern must not be null", new Object[0]);
        if (timeZone == null) {
            timeZone = TimeZone.getDefault();
        }
        if (locale == null) {
            locale = Locale.getDefault();
        }
        a aVar = new a(str, timeZone, locale);
        Format format = (Format) this.f15690a.get(aVar);
        if (format != null) {
            return format;
        }
        Format a4 = a(str, timeZone, locale);
        Format format2 = (Format) this.f15690a.putIfAbsent(aVar, a4);
        if (format2 != null) {
            return format2;
        }
        return a4;
    }

    /* access modifiers changed from: package-private */
    public Format h(int i4, TimeZone timeZone, Locale locale) {
        return d((Integer) null, Integer.valueOf(i4), timeZone, locale);
    }
}
