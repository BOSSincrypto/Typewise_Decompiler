package org.apache.commons.lang3.time;

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class FastDateFormat extends Format {
    public static final int FULL = 0;
    public static final int LONG = 1;
    public static final int MEDIUM = 2;
    public static final int SHORT = 3;

    /* renamed from: a  reason: collision with root package name */
    private static final c f15617a = new a();
    private static final long serialVersionUID = 2;
    private final FastDateParser parser;
    private final FastDatePrinter printer;

    class a extends c {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public FastDateFormat a(String str, TimeZone timeZone, Locale locale) {
            return new FastDateFormat(str, timeZone, locale);
        }
    }

    protected FastDateFormat(String str, TimeZone timeZone, Locale locale) {
        this(str, timeZone, locale, (Date) null);
    }

    public static FastDateFormat getDateInstance(int i4) {
        return (FastDateFormat) f15617a.b(i4, (TimeZone) null, (Locale) null);
    }

    public static FastDateFormat getDateTimeInstance(int i4, int i5) {
        return (FastDateFormat) f15617a.c(i4, i5, (TimeZone) null, (Locale) null);
    }

    public static FastDateFormat getInstance() {
        return (FastDateFormat) f15617a.e();
    }

    public static FastDateFormat getTimeInstance(int i4) {
        return (FastDateFormat) f15617a.h(i4, (TimeZone) null, (Locale) null);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public StringBuffer applyRules(Calendar calendar, StringBuffer stringBuffer) {
        return this.printer.applyRules(calendar, stringBuffer);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FastDateFormat)) {
            return false;
        }
        return this.printer.equals(((FastDateFormat) obj).printer);
    }

    public StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        stringBuffer.append(this.printer.format(obj));
        return stringBuffer;
    }

    public Locale getLocale() {
        return this.printer.getLocale();
    }

    public int getMaxLengthEstimate() {
        return this.printer.getMaxLengthEstimate();
    }

    public String getPattern() {
        return this.printer.getPattern();
    }

    public TimeZone getTimeZone() {
        return this.printer.getTimeZone();
    }

    public int hashCode() {
        return this.printer.hashCode();
    }

    public Date parse(String str) {
        return this.parser.parse(str);
    }

    public Object parseObject(String str, ParsePosition parsePosition) {
        return this.parser.parseObject(str, parsePosition);
    }

    public String toString() {
        return "FastDateFormat[" + this.printer.getPattern() + "," + this.printer.getLocale() + "," + this.printer.getTimeZone().getID() + "]";
    }

    protected FastDateFormat(String str, TimeZone timeZone, Locale locale, Date date) {
        this.printer = new FastDatePrinter(str, timeZone, locale);
        this.parser = new FastDateParser(str, timeZone, locale, date);
    }

    public static FastDateFormat getDateInstance(int i4, Locale locale) {
        return (FastDateFormat) f15617a.b(i4, (TimeZone) null, locale);
    }

    public static FastDateFormat getDateTimeInstance(int i4, int i5, Locale locale) {
        return (FastDateFormat) f15617a.c(i4, i5, (TimeZone) null, locale);
    }

    public static FastDateFormat getInstance(String str) {
        return (FastDateFormat) f15617a.f(str, (TimeZone) null, (Locale) null);
    }

    public static FastDateFormat getTimeInstance(int i4, Locale locale) {
        return (FastDateFormat) f15617a.h(i4, (TimeZone) null, locale);
    }

    public String format(long j4) {
        return this.printer.format(j4);
    }

    public Date parse(String str, ParsePosition parsePosition) {
        return this.parser.parse(str, parsePosition);
    }

    public static FastDateFormat getDateInstance(int i4, TimeZone timeZone) {
        return (FastDateFormat) f15617a.b(i4, timeZone, (Locale) null);
    }

    public static FastDateFormat getDateTimeInstance(int i4, int i5, TimeZone timeZone) {
        return getDateTimeInstance(i4, i5, timeZone, (Locale) null);
    }

    public static FastDateFormat getInstance(String str, TimeZone timeZone) {
        return (FastDateFormat) f15617a.f(str, timeZone, (Locale) null);
    }

    public static FastDateFormat getTimeInstance(int i4, TimeZone timeZone) {
        return (FastDateFormat) f15617a.h(i4, timeZone, (Locale) null);
    }

    public String format(Date date) {
        return this.printer.format(date);
    }

    public boolean parse(String str, ParsePosition parsePosition, Calendar calendar) {
        return this.parser.parse(str, parsePosition, calendar);
    }

    public static FastDateFormat getDateInstance(int i4, TimeZone timeZone, Locale locale) {
        return (FastDateFormat) f15617a.b(i4, timeZone, locale);
    }

    public static FastDateFormat getDateTimeInstance(int i4, int i5, TimeZone timeZone, Locale locale) {
        return (FastDateFormat) f15617a.c(i4, i5, timeZone, locale);
    }

    public static FastDateFormat getInstance(String str, Locale locale) {
        return (FastDateFormat) f15617a.f(str, (TimeZone) null, locale);
    }

    public static FastDateFormat getTimeInstance(int i4, TimeZone timeZone, Locale locale) {
        return (FastDateFormat) f15617a.h(i4, timeZone, locale);
    }

    public String format(Calendar calendar) {
        return this.printer.format(calendar);
    }

    public static FastDateFormat getInstance(String str, TimeZone timeZone, Locale locale) {
        return (FastDateFormat) f15617a.f(str, timeZone, locale);
    }

    @Deprecated
    public StringBuffer format(long j4, StringBuffer stringBuffer) {
        return this.printer.format(j4, stringBuffer);
    }

    @Deprecated
    public StringBuffer format(Date date, StringBuffer stringBuffer) {
        return this.printer.format(date, stringBuffer);
    }

    @Deprecated
    public StringBuffer format(Calendar calendar, StringBuffer stringBuffer) {
        return this.printer.format(calendar, stringBuffer);
    }

    public <B extends Appendable> B format(long j4, B b4) {
        return this.printer.format(j4, b4);
    }

    public <B extends Appendable> B format(Date date, B b4) {
        return this.printer.format(date, b4);
    }

    public <B extends Appendable> B format(Calendar calendar, B b4) {
        return this.printer.format(calendar, b4);
    }
}
