package org.apache.commons.lang3.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.DateFormatSymbols;
import java.text.FieldPosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class FastDatePrinter implements Serializable {
    public static final int FULL = 0;
    public static final int LONG = 1;
    public static final int MEDIUM = 2;
    public static final int SHORT = 3;

    /* renamed from: c  reason: collision with root package name */
    private static final ConcurrentMap f15655c = new ConcurrentHashMap(7);
    private static final long serialVersionUID = 1;

    /* renamed from: a  reason: collision with root package name */
    private transient f[] f15656a;

    /* renamed from: b  reason: collision with root package name */
    private transient int f15657b;
    private final Locale mLocale;
    private final String mPattern;
    private final TimeZone mTimeZone;

    private static class a implements f {

        /* renamed from: a  reason: collision with root package name */
        private final char f15658a;

        a(char c4) {
            this.f15658a = c4;
        }

        public int a() {
            return 1;
        }

        public void c(Appendable appendable, Calendar calendar) {
            appendable.append(this.f15658a);
        }
    }

    private static class b implements d {

        /* renamed from: a  reason: collision with root package name */
        private final d f15659a;

        b(d dVar) {
            this.f15659a = dVar;
        }

        public int a() {
            return this.f15659a.a();
        }

        public void b(Appendable appendable, int i4) {
            this.f15659a.b(appendable, i4);
        }

        public void c(Appendable appendable, Calendar calendar) {
            int i4 = 7;
            int i5 = calendar.get(7);
            d dVar = this.f15659a;
            if (i5 != 1) {
                i4 = i5 - 1;
            }
            dVar.b(appendable, i4);
        }
    }

    private static class c implements f {

        /* renamed from: b  reason: collision with root package name */
        static final c f15660b = new c(3);

        /* renamed from: c  reason: collision with root package name */
        static final c f15661c = new c(5);

        /* renamed from: d  reason: collision with root package name */
        static final c f15662d = new c(6);

        /* renamed from: a  reason: collision with root package name */
        final int f15663a;

        c(int i4) {
            this.f15663a = i4;
        }

        static c d(int i4) {
            if (i4 == 1) {
                return f15660b;
            }
            if (i4 == 2) {
                return f15661c;
            }
            if (i4 == 3) {
                return f15662d;
            }
            throw new IllegalArgumentException("invalid number of X");
        }

        public int a() {
            return this.f15663a;
        }

        public void c(Appendable appendable, Calendar calendar) {
            int i4 = calendar.get(15) + calendar.get(16);
            if (i4 == 0) {
                appendable.append("Z");
                return;
            }
            if (i4 < 0) {
                appendable.append('-');
                i4 = -i4;
            } else {
                appendable.append('+');
            }
            int i5 = i4 / 3600000;
            FastDatePrinter.a(appendable, i5);
            int i6 = this.f15663a;
            if (i6 >= 5) {
                if (i6 == 6) {
                    appendable.append(':');
                }
                FastDatePrinter.a(appendable, (i4 / 60000) - (i5 * 60));
            }
        }
    }

    private interface d extends f {
        void b(Appendable appendable, int i4);
    }

    private static class e implements d {

        /* renamed from: a  reason: collision with root package name */
        private final int f15664a;

        /* renamed from: b  reason: collision with root package name */
        private final int f15665b;

        e(int i4, int i5) {
            if (i5 >= 3) {
                this.f15664a = i4;
                this.f15665b = i5;
                return;
            }
            throw new IllegalArgumentException();
        }

        public int a() {
            return this.f15665b;
        }

        public final void b(Appendable appendable, int i4) {
            FastDatePrinter.b(appendable, i4, this.f15665b);
        }

        public void c(Appendable appendable, Calendar calendar) {
            b(appendable, calendar.get(this.f15664a));
        }
    }

    private interface f {
        int a();

        void c(Appendable appendable, Calendar calendar);
    }

    private static class g implements f {

        /* renamed from: a  reason: collision with root package name */
        private final String f15666a;

        g(String str) {
            this.f15666a = str;
        }

        public int a() {
            return this.f15666a.length();
        }

        public void c(Appendable appendable, Calendar calendar) {
            appendable.append(this.f15666a);
        }
    }

    private static class h implements f {

        /* renamed from: a  reason: collision with root package name */
        private final int f15667a;

        /* renamed from: b  reason: collision with root package name */
        private final String[] f15668b;

        h(int i4, String[] strArr) {
            this.f15667a = i4;
            this.f15668b = strArr;
        }

        public int a() {
            int length = this.f15668b.length;
            int i4 = 0;
            while (true) {
                length--;
                if (length < 0) {
                    return i4;
                }
                int length2 = this.f15668b[length].length();
                if (length2 > i4) {
                    i4 = length2;
                }
            }
        }

        public void c(Appendable appendable, Calendar calendar) {
            appendable.append(this.f15668b[calendar.get(this.f15667a)]);
        }
    }

    private static class i {

        /* renamed from: a  reason: collision with root package name */
        private final TimeZone f15669a;

        /* renamed from: b  reason: collision with root package name */
        private final int f15670b;

        /* renamed from: c  reason: collision with root package name */
        private final Locale f15671c;

        i(TimeZone timeZone, boolean z3, int i4, Locale locale) {
            this.f15669a = timeZone;
            if (z3) {
                this.f15670b = Integer.MIN_VALUE | i4;
            } else {
                this.f15670b = i4;
            }
            this.f15671c = locale;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (!this.f15669a.equals(iVar.f15669a) || this.f15670b != iVar.f15670b || !this.f15671c.equals(iVar.f15671c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f15670b * 31) + this.f15671c.hashCode()) * 31) + this.f15669a.hashCode();
        }
    }

    private static class j implements f {

        /* renamed from: a  reason: collision with root package name */
        private final Locale f15672a;

        /* renamed from: b  reason: collision with root package name */
        private final int f15673b;

        /* renamed from: c  reason: collision with root package name */
        private final String f15674c;

        /* renamed from: d  reason: collision with root package name */
        private final String f15675d;

        j(TimeZone timeZone, Locale locale, int i4) {
            this.f15672a = locale;
            this.f15673b = i4;
            this.f15674c = FastDatePrinter.getTimeZoneDisplay(timeZone, false, i4, locale);
            this.f15675d = FastDatePrinter.getTimeZoneDisplay(timeZone, true, i4, locale);
        }

        public int a() {
            return Math.max(this.f15674c.length(), this.f15675d.length());
        }

        public void c(Appendable appendable, Calendar calendar) {
            TimeZone timeZone = calendar.getTimeZone();
            if (calendar.get(16) == 0) {
                appendable.append(FastDatePrinter.getTimeZoneDisplay(timeZone, false, this.f15673b, this.f15672a));
            } else {
                appendable.append(FastDatePrinter.getTimeZoneDisplay(timeZone, true, this.f15673b, this.f15672a));
            }
        }
    }

    private static class k implements f {

        /* renamed from: b  reason: collision with root package name */
        static final k f15676b = new k(true);

        /* renamed from: c  reason: collision with root package name */
        static final k f15677c = new k(false);

        /* renamed from: a  reason: collision with root package name */
        final boolean f15678a;

        k(boolean z3) {
            this.f15678a = z3;
        }

        public int a() {
            return 5;
        }

        public void c(Appendable appendable, Calendar calendar) {
            int i4 = calendar.get(15) + calendar.get(16);
            if (i4 < 0) {
                appendable.append('-');
                i4 = -i4;
            } else {
                appendable.append('+');
            }
            int i5 = i4 / 3600000;
            FastDatePrinter.a(appendable, i5);
            if (this.f15678a) {
                appendable.append(':');
            }
            FastDatePrinter.a(appendable, (i4 / 60000) - (i5 * 60));
        }
    }

    private static class l implements d {

        /* renamed from: a  reason: collision with root package name */
        private final d f15679a;

        l(d dVar) {
            this.f15679a = dVar;
        }

        public int a() {
            return this.f15679a.a();
        }

        public void b(Appendable appendable, int i4) {
            this.f15679a.b(appendable, i4);
        }

        public void c(Appendable appendable, Calendar calendar) {
            int i4 = calendar.get(10);
            if (i4 == 0) {
                i4 = calendar.getLeastMaximum(10) + 1;
            }
            this.f15679a.b(appendable, i4);
        }
    }

    private static class m implements d {

        /* renamed from: a  reason: collision with root package name */
        private final d f15680a;

        m(d dVar) {
            this.f15680a = dVar;
        }

        public int a() {
            return this.f15680a.a();
        }

        public void b(Appendable appendable, int i4) {
            this.f15680a.b(appendable, i4);
        }

        public void c(Appendable appendable, Calendar calendar) {
            int i4 = calendar.get(11);
            if (i4 == 0) {
                i4 = calendar.getMaximum(11) + 1;
            }
            this.f15680a.b(appendable, i4);
        }
    }

    private static class n implements d {

        /* renamed from: a  reason: collision with root package name */
        static final n f15681a = new n();

        n() {
        }

        public int a() {
            return 2;
        }

        public final void b(Appendable appendable, int i4) {
            FastDatePrinter.a(appendable, i4);
        }

        public void c(Appendable appendable, Calendar calendar) {
            b(appendable, calendar.get(2) + 1);
        }
    }

    private static class o implements d {

        /* renamed from: a  reason: collision with root package name */
        private final int f15682a;

        o(int i4) {
            this.f15682a = i4;
        }

        public int a() {
            return 2;
        }

        public final void b(Appendable appendable, int i4) {
            if (i4 < 100) {
                FastDatePrinter.a(appendable, i4);
            } else {
                FastDatePrinter.b(appendable, i4, 2);
            }
        }

        public void c(Appendable appendable, Calendar calendar) {
            b(appendable, calendar.get(this.f15682a));
        }
    }

    private static class p implements d {

        /* renamed from: a  reason: collision with root package name */
        static final p f15683a = new p();

        p() {
        }

        public int a() {
            return 2;
        }

        public final void b(Appendable appendable, int i4) {
            FastDatePrinter.a(appendable, i4);
        }

        public void c(Appendable appendable, Calendar calendar) {
            b(appendable, calendar.get(1) % 100);
        }
    }

    private static class q implements d {

        /* renamed from: a  reason: collision with root package name */
        static final q f15684a = new q();

        q() {
        }

        public int a() {
            return 2;
        }

        public final void b(Appendable appendable, int i4) {
            if (i4 < 10) {
                appendable.append((char) (i4 + 48));
            } else {
                FastDatePrinter.a(appendable, i4);
            }
        }

        public void c(Appendable appendable, Calendar calendar) {
            b(appendable, calendar.get(2) + 1);
        }
    }

    private static class r implements d {

        /* renamed from: a  reason: collision with root package name */
        private final int f15685a;

        r(int i4) {
            this.f15685a = i4;
        }

        public int a() {
            return 4;
        }

        public final void b(Appendable appendable, int i4) {
            if (i4 < 10) {
                appendable.append((char) (i4 + 48));
            } else if (i4 < 100) {
                FastDatePrinter.a(appendable, i4);
            } else {
                FastDatePrinter.b(appendable, i4, 1);
            }
        }

        public void c(Appendable appendable, Calendar calendar) {
            b(appendable, calendar.get(this.f15685a));
        }
    }

    private static class s implements d {

        /* renamed from: a  reason: collision with root package name */
        private final d f15686a;

        s(d dVar) {
            this.f15686a = dVar;
        }

        public int a() {
            return this.f15686a.a();
        }

        public void b(Appendable appendable, int i4) {
            this.f15686a.b(appendable, i4);
        }

        public void c(Appendable appendable, Calendar calendar) {
            this.f15686a.b(appendable, calendar.getWeekYear());
        }
    }

    protected FastDatePrinter(String str, TimeZone timeZone, Locale locale) {
        this.mPattern = str;
        this.mTimeZone = timeZone;
        this.mLocale = locale;
        e();
    }

    /* access modifiers changed from: private */
    public static void a(Appendable appendable, int i4) {
        appendable.append((char) ((i4 / 10) + 48));
        appendable.append((char) ((i4 % 10) + 48));
    }

    /* access modifiers changed from: private */
    public static void b(Appendable appendable, int i4, int i5) {
        int i6;
        if (i4 < 10000) {
            if (i4 >= 1000) {
                i6 = 4;
            } else if (i4 >= 100) {
                i6 = 3;
            } else if (i4 < 10) {
                i6 = 1;
            } else {
                i6 = 2;
            }
            for (int i7 = i5 - i6; i7 > 0; i7--) {
                appendable.append('0');
            }
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 == 4) {
                            appendable.append((char) ((i4 / 1000) + 48));
                            i4 %= 1000;
                        } else {
                            return;
                        }
                    }
                    if (i4 >= 100) {
                        appendable.append((char) ((i4 / 100) + 48));
                        i4 %= 100;
                    } else {
                        appendable.append('0');
                    }
                }
                if (i4 >= 10) {
                    appendable.append((char) ((i4 / 10) + 48));
                    i4 %= 10;
                } else {
                    appendable.append('0');
                }
            }
            appendable.append((char) (i4 + 48));
            return;
        }
        char[] cArr = new char[10];
        int i8 = 0;
        while (i4 != 0) {
            cArr[i8] = (char) ((i4 % 10) + 48);
            i4 /= 10;
            i8++;
        }
        while (i8 < i5) {
            appendable.append('0');
            i5--;
        }
        while (true) {
            i8--;
            if (i8 >= 0) {
                appendable.append(cArr[i8]);
            } else {
                return;
            }
        }
    }

    private Appendable c(Calendar calendar, Appendable appendable) {
        try {
            for (f c4 : this.f15656a) {
                c4.c(appendable, calendar);
            }
        } catch (IOException e4) {
            f3.a.a(e4);
        }
        return appendable;
    }

    private String d(Calendar calendar) {
        return ((StringBuilder) c(calendar, new StringBuilder(this.f15657b))).toString();
    }

    private void e() {
        List<f> parsePattern = parsePattern();
        f[] fVarArr = (f[]) parsePattern.toArray(new f[parsePattern.size()]);
        this.f15656a = fVarArr;
        int length = fVarArr.length;
        int i4 = 0;
        while (true) {
            length--;
            if (length >= 0) {
                i4 += this.f15656a[length].a();
            } else {
                this.f15657b = i4;
                return;
            }
        }
    }

    private Calendar f() {
        return Calendar.getInstance(this.mTimeZone, this.mLocale);
    }

    static String getTimeZoneDisplay(TimeZone timeZone, boolean z3, int i4, Locale locale) {
        i iVar = new i(timeZone, z3, i4, locale);
        ConcurrentMap concurrentMap = f15655c;
        String str = (String) concurrentMap.get(iVar);
        if (str != null) {
            return str;
        }
        String displayName = timeZone.getDisplayName(z3, i4, locale);
        String str2 = (String) concurrentMap.putIfAbsent(iVar, displayName);
        if (str2 != null) {
            return str2;
        }
        return displayName;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        e();
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public StringBuffer applyRules(Calendar calendar, StringBuffer stringBuffer) {
        return (StringBuffer) c(calendar, stringBuffer);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FastDatePrinter)) {
            return false;
        }
        FastDatePrinter fastDatePrinter = (FastDatePrinter) obj;
        if (!this.mPattern.equals(fastDatePrinter.mPattern) || !this.mTimeZone.equals(fastDatePrinter.mTimeZone) || !this.mLocale.equals(fastDatePrinter.mLocale)) {
            return false;
        }
        return true;
    }

    @Deprecated
    public StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        if (obj instanceof Date) {
            return format((Date) obj, stringBuffer);
        }
        if (obj instanceof Calendar) {
            return format((Calendar) obj, stringBuffer);
        }
        if (obj instanceof Long) {
            return format(((Long) obj).longValue(), stringBuffer);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown class: ");
        sb.append(obj == null ? "<null>" : obj.getClass().getName());
        throw new IllegalArgumentException(sb.toString());
    }

    public Locale getLocale() {
        return this.mLocale;
    }

    public int getMaxLengthEstimate() {
        return this.f15657b;
    }

    public String getPattern() {
        return this.mPattern;
    }

    public TimeZone getTimeZone() {
        return this.mTimeZone;
    }

    public int hashCode() {
        return this.mPattern.hashCode() + ((this.mTimeZone.hashCode() + (this.mLocale.hashCode() * 13)) * 13);
    }

    /* access modifiers changed from: protected */
    public List<f> parsePattern() {
        int i4;
        h hVar;
        int i5;
        p pVar;
        k kVar;
        Object gVar;
        String[] strArr;
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(this.mLocale);
        ArrayList arrayList = new ArrayList();
        String[] eras = dateFormatSymbols.getEras();
        String[] months = dateFormatSymbols.getMonths();
        String[] shortMonths = dateFormatSymbols.getShortMonths();
        String[] weekdays = dateFormatSymbols.getWeekdays();
        String[] shortWeekdays = dateFormatSymbols.getShortWeekdays();
        String[] amPmStrings = dateFormatSymbols.getAmPmStrings();
        int length = this.mPattern.length();
        int i6 = 0;
        int i7 = 0;
        while (i7 < length) {
            int[] iArr = {i7};
            String parseToken = parseToken(this.mPattern, iArr);
            int i8 = iArr[i6];
            int length2 = parseToken.length();
            if (length2 == 0) {
                return arrayList;
            }
            char charAt = parseToken.charAt(i6);
            if (charAt != 'y') {
                if (charAt != 'z') {
                    switch (charAt) {
                        case '\'':
                            String substring = parseToken.substring(1);
                            if (substring.length() == 1) {
                                gVar = new a(substring.charAt(0));
                            } else {
                                gVar = new g(substring);
                            }
                            kVar = gVar;
                            break;
                        case 'K':
                            kVar = selectNumberRule(10, length2);
                            break;
                        case 'M':
                            if (length2 < 4) {
                                if (length2 != 3) {
                                    if (length2 != 2) {
                                        kVar = q.f15684a;
                                        break;
                                    } else {
                                        kVar = n.f15681a;
                                        break;
                                    }
                                } else {
                                    kVar = new h(2, shortMonths);
                                    break;
                                }
                            } else {
                                kVar = new h(2, months);
                                break;
                            }
                        case 'S':
                            kVar = selectNumberRule(14, length2);
                            break;
                        case 'a':
                            kVar = new h(9, amPmStrings);
                            break;
                        case 'd':
                            kVar = selectNumberRule(5, length2);
                            break;
                        case 'h':
                            kVar = new l(selectNumberRule(10, length2));
                            break;
                        case 'k':
                            kVar = new m(selectNumberRule(11, length2));
                            break;
                        case 'm':
                            kVar = selectNumberRule(12, length2);
                            break;
                        case 's':
                            kVar = selectNumberRule(13, length2);
                            break;
                        case 'u':
                            kVar = new b(selectNumberRule(7, length2));
                            break;
                        case 'w':
                            kVar = selectNumberRule(3, length2);
                            break;
                        default:
                            switch (charAt) {
                                case 'D':
                                    kVar = selectNumberRule(6, length2);
                                    break;
                                case 'E':
                                    if (length2 < 4) {
                                        strArr = shortWeekdays;
                                    } else {
                                        strArr = weekdays;
                                    }
                                    kVar = new h(7, strArr);
                                    break;
                                case 'F':
                                    kVar = selectNumberRule(8, length2);
                                    break;
                                case 'G':
                                    i4 = 0;
                                    hVar = new h(0, eras);
                                    break;
                                case 'H':
                                    kVar = selectNumberRule(11, length2);
                                    break;
                                default:
                                    switch (charAt) {
                                        case 'W':
                                            kVar = selectNumberRule(4, length2);
                                            break;
                                        case 'X':
                                            kVar = c.d(length2);
                                            break;
                                        case 'Y':
                                            i5 = 2;
                                            i4 = 0;
                                            break;
                                        case 'Z':
                                            if (length2 != 1) {
                                                if (length2 != 2) {
                                                    kVar = k.f15676b;
                                                    break;
                                                } else {
                                                    kVar = c.f15662d;
                                                    break;
                                                }
                                            } else {
                                                kVar = k.f15677c;
                                                break;
                                            }
                                        default:
                                            throw new IllegalArgumentException("Illegal pattern component: " + parseToken);
                                    }
                            }
                    }
                } else if (length2 >= 4) {
                    kVar = new j(this.mTimeZone, this.mLocale, 1);
                } else {
                    i4 = 0;
                    hVar = new j(this.mTimeZone, this.mLocale, 0);
                    arrayList.add(hVar);
                    i7 = i8 + 1;
                    i6 = i4;
                }
                i4 = 0;
                hVar = kVar;
                arrayList.add(hVar);
                i7 = i8 + 1;
                i6 = i4;
            } else {
                i4 = 0;
                i5 = 2;
            }
            if (length2 == i5) {
                pVar = p.f15683a;
            } else {
                if (length2 < 4) {
                    length2 = 4;
                }
                pVar = selectNumberRule(1, length2);
            }
            hVar = charAt == 'Y' ? new s(pVar) : pVar;
            arrayList.add(hVar);
            i7 = i8 + 1;
            i6 = i4;
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public String parseToken(String str, int[] iArr) {
        StringBuilder sb = new StringBuilder();
        int i4 = iArr[0];
        int length = str.length();
        char charAt = str.charAt(i4);
        if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
            sb.append(charAt);
            while (true) {
                int i5 = i4 + 1;
                if (i5 >= length || str.charAt(i5) != charAt) {
                    break;
                }
                sb.append(charAt);
                i4 = i5;
            }
        } else {
            sb.append('\'');
            boolean z3 = false;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                char charAt2 = str.charAt(i4);
                if (charAt2 == '\'') {
                    int i6 = i4 + 1;
                    if (i6 >= length || str.charAt(i6) != '\'') {
                        z3 = !z3;
                    } else {
                        sb.append(charAt2);
                        i4 = i6;
                    }
                } else if (z3 || ((charAt2 < 'A' || charAt2 > 'Z') && (charAt2 < 'a' || charAt2 > 'z'))) {
                    sb.append(charAt2);
                }
                i4++;
            }
            i4--;
        }
        iArr[0] = i4;
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public d selectNumberRule(int i4, int i5) {
        if (i5 == 1) {
            return new r(i4);
        }
        if (i5 != 2) {
            return new e(i4, i5);
        }
        return new o(i4);
    }

    public String toString() {
        return "FastDatePrinter[" + this.mPattern + "," + this.mLocale + "," + this.mTimeZone.getID() + "]";
    }

    /* access modifiers changed from: package-private */
    public String format(Object obj) {
        if (obj instanceof Date) {
            return format((Date) obj);
        }
        if (obj instanceof Calendar) {
            return format((Calendar) obj);
        }
        if (obj instanceof Long) {
            return format(((Long) obj).longValue());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown class: ");
        sb.append(obj == null ? "<null>" : obj.getClass().getName());
        throw new IllegalArgumentException(sb.toString());
    }

    public String format(long j4) {
        Calendar f4 = f();
        f4.setTimeInMillis(j4);
        return d(f4);
    }

    public String format(Date date) {
        Calendar f4 = f();
        f4.setTime(date);
        return d(f4);
    }

    public String format(Calendar calendar) {
        return ((StringBuilder) format(calendar, new StringBuilder(this.f15657b))).toString();
    }

    public StringBuffer format(long j4, StringBuffer stringBuffer) {
        Calendar f4 = f();
        f4.setTimeInMillis(j4);
        return (StringBuffer) c(f4, stringBuffer);
    }

    public StringBuffer format(Date date, StringBuffer stringBuffer) {
        Calendar f4 = f();
        f4.setTime(date);
        return (StringBuffer) c(f4, stringBuffer);
    }

    public StringBuffer format(Calendar calendar, StringBuffer stringBuffer) {
        return format(calendar.getTime(), stringBuffer);
    }

    public <B extends Appendable> B format(long j4, B b4) {
        Calendar f4 = f();
        f4.setTimeInMillis(j4);
        return c(f4, b4);
    }

    public <B extends Appendable> B format(Date date, B b4) {
        Calendar f4 = f();
        f4.setTime(date);
        return c(f4, b4);
    }

    public <B extends Appendable> B format(Calendar calendar, B b4) {
        if (!calendar.getTimeZone().equals(this.mTimeZone)) {
            calendar = (Calendar) calendar.clone();
            calendar.setTimeZone(this.mTimeZone);
        }
        return c(calendar, b4);
    }
}
