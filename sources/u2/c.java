package U2;

import Q2.d;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.o;
import l2.q;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    private static final a f1510a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f1511b;

    /* renamed from: c  reason: collision with root package name */
    private static final DateFormat[] f1512c;

    public static final class a extends ThreadLocal {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(d.f1351f);
            return simpleDateFormat;
        }
    }

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f1511b = strArr;
        f1512c = new DateFormat[strArr.length];
    }

    public static final Date a(String str) {
        o.e(str, "<this>");
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = ((DateFormat) f1510a.get()).parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        String[] strArr = f1511b;
        synchronized (strArr) {
            try {
                int length = strArr.length;
                int i4 = 0;
                while (i4 < length) {
                    int i5 = i4 + 1;
                    DateFormat[] dateFormatArr = f1512c;
                    DateFormat dateFormat = dateFormatArr[i4];
                    if (dateFormat == null) {
                        dateFormat = new SimpleDateFormat(f1511b[i4], Locale.US);
                        dateFormat.setTimeZone(d.f1351f);
                        dateFormatArr[i4] = dateFormat;
                    }
                    parsePosition.setIndex(0);
                    Date parse2 = dateFormat.parse(str, parsePosition);
                    if (parsePosition.getIndex() != 0) {
                        return parse2;
                    }
                    i4 = i5;
                }
                q qVar = q.f14567a;
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final String b(Date date) {
        o.e(date, "<this>");
        String format = ((DateFormat) f1510a.get()).format(date);
        o.d(format, "STANDARD_DATE_FORMAT.get().format(this)");
        return format;
    }
}
