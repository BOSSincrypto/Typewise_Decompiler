package org.apache.commons.lang3.time;

import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FastDateParser implements Serializable {
    static final Locale JAPANESE_IMPERIAL = new Locale("ja", "JP", "JP");
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final Comparator f15618b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final ConcurrentMap[] f15619c = new ConcurrentMap[17];

    /* renamed from: d  reason: collision with root package name */
    private static final l f15620d = new b(1);

    /* renamed from: e  reason: collision with root package name */
    private static final l f15621e = new c(2);

    /* renamed from: f  reason: collision with root package name */
    private static final l f15622f = new j(1);

    /* renamed from: g  reason: collision with root package name */
    private static final l f15623g = new j(3);

    /* renamed from: h  reason: collision with root package name */
    private static final l f15624h = new j(4);

    /* renamed from: i  reason: collision with root package name */
    private static final l f15625i = new j(6);

    /* renamed from: j  reason: collision with root package name */
    private static final l f15626j = new j(5);

    /* renamed from: k  reason: collision with root package name */
    private static final l f15627k = new d(7);

    /* renamed from: l  reason: collision with root package name */
    private static final l f15628l = new j(8);

    /* renamed from: m  reason: collision with root package name */
    private static final l f15629m = new j(11);

    /* renamed from: n  reason: collision with root package name */
    private static final l f15630n = new e(11);

    /* renamed from: o  reason: collision with root package name */
    private static final l f15631o = new f(10);

    /* renamed from: p  reason: collision with root package name */
    private static final l f15632p = new j(10);

    /* renamed from: q  reason: collision with root package name */
    private static final l f15633q = new j(12);
    private static final long serialVersionUID = 3;

    /* renamed from: v  reason: collision with root package name */
    private static final l f15634v = new j(13);

    /* renamed from: w  reason: collision with root package name */
    private static final l f15635w = new j(14);

    /* renamed from: a  reason: collision with root package name */
    private transient List f15636a;
    private final int century;
    private final Locale locale;
    /* access modifiers changed from: private */
    public final String pattern;
    private final int startYear;
    private final TimeZone timeZone;

    class a implements Comparator {
        a() {
        }

        /* renamed from: a */
        public int compare(String str, String str2) {
            return str2.compareTo(str);
        }
    }

    class b extends j {
        b(int i4) {
            super(i4);
        }

        /* access modifiers changed from: package-private */
        public int c(FastDateParser fastDateParser, int i4) {
            if (i4 < 100) {
                return fastDateParser.a(i4);
            }
            return i4;
        }
    }

    class c extends j {
        c(int i4) {
            super(i4);
        }

        /* access modifiers changed from: package-private */
        public int c(FastDateParser fastDateParser, int i4) {
            return i4 - 1;
        }
    }

    class d extends j {
        d(int i4) {
            super(i4);
        }

        /* access modifiers changed from: package-private */
        public int c(FastDateParser fastDateParser, int i4) {
            if (i4 == 7) {
                return 1;
            }
            return 1 + i4;
        }
    }

    class e extends j {
        e(int i4) {
            super(i4);
        }

        /* access modifiers changed from: package-private */
        public int c(FastDateParser fastDateParser, int i4) {
            if (i4 == 24) {
                return 0;
            }
            return i4;
        }
    }

    class f extends j {
        f(int i4) {
            super(i4);
        }

        /* access modifiers changed from: package-private */
        public int c(FastDateParser fastDateParser, int i4) {
            if (i4 == 12) {
                return 0;
            }
            return i4;
        }
    }

    private static class g extends k {

        /* renamed from: b  reason: collision with root package name */
        private final int f15637b;

        /* renamed from: c  reason: collision with root package name */
        final Locale f15638c;

        /* renamed from: d  reason: collision with root package name */
        private final Map f15639d;

        g(int i4, Calendar calendar, Locale locale) {
            super((a) null);
            this.f15637b = i4;
            this.f15638c = locale;
            StringBuilder sb = new StringBuilder();
            sb.append("((?iu)");
            this.f15639d = FastDateParser.b(calendar, locale, i4, sb);
            sb.setLength(sb.length() - 1);
            sb.append(")");
            d(sb);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.Integer} */
        /* access modifiers changed from: package-private */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void e(org.apache.commons.lang3.time.FastDateParser r2, java.util.Calendar r3, java.lang.String r4) {
            /*
                r1 = this;
                java.util.Locale r2 = r1.f15638c
                java.lang.String r2 = r4.toLowerCase(r2)
                java.util.Map r4 = r1.f15639d
                java.lang.Object r4 = r4.get(r2)
                java.lang.Integer r4 = (java.lang.Integer) r4
                if (r4 != 0) goto L_0x002a
                java.util.Map r4 = r1.f15639d
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r2)
                r2 = 46
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                java.lang.Object r2 = r4.get(r2)
                r4 = r2
                java.lang.Integer r4 = (java.lang.Integer) r4
            L_0x002a:
                int r2 = r1.f15637b
                int r4 = r4.intValue()
                r3.set(r2, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.lang3.time.FastDateParser.g.e(org.apache.commons.lang3.time.FastDateParser, java.util.Calendar, java.lang.String):void");
        }
    }

    private static class h extends l {

        /* renamed from: a  reason: collision with root package name */
        private final String f15640a;

        h(String str) {
            super((a) null);
            this.f15640a = str;
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean b(FastDateParser fastDateParser, Calendar calendar, String str, ParsePosition parsePosition, int i4) {
            int i5 = 0;
            while (i5 < this.f15640a.length()) {
                int index = parsePosition.getIndex() + i5;
                if (index == str.length()) {
                    parsePosition.setErrorIndex(index);
                    return false;
                } else if (this.f15640a.charAt(i5) != str.charAt(index)) {
                    parsePosition.setErrorIndex(index);
                    return false;
                } else {
                    i5++;
                }
            }
            parsePosition.setIndex(this.f15640a.length() + parsePosition.getIndex());
            return true;
        }
    }

    private static class i extends k {

        /* renamed from: b  reason: collision with root package name */
        private static final l f15641b = new i("(Z|(?:[+-]\\d{2}))");

        /* renamed from: c  reason: collision with root package name */
        private static final l f15642c = new i("(Z|(?:[+-]\\d{2}\\d{2}))");
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public static final l f15643d = new i("(Z|(?:[+-]\\d{2}(?::)\\d{2}))");

        i(String str) {
            super((a) null);
            c(str);
        }

        static l g(int i4) {
            if (i4 == 1) {
                return f15641b;
            }
            if (i4 == 2) {
                return f15642c;
            }
            if (i4 == 3) {
                return f15643d;
            }
            throw new IllegalArgumentException("invalid number of X");
        }

        /* access modifiers changed from: package-private */
        public void e(FastDateParser fastDateParser, Calendar calendar, String str) {
            calendar.setTimeZone(b.a(str));
        }
    }

    private static class j extends l {

        /* renamed from: a  reason: collision with root package name */
        private final int f15644a;

        j(int i4) {
            super((a) null);
            this.f15644a = i4;
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            return true;
        }

        /* access modifiers changed from: package-private */
        public boolean b(FastDateParser fastDateParser, Calendar calendar, String str, ParsePosition parsePosition, int i4) {
            int index = parsePosition.getIndex();
            int length = str.length();
            if (i4 == 0) {
                while (index < length && Character.isWhitespace(str.charAt(index))) {
                    index++;
                }
                parsePosition.setIndex(index);
            } else {
                int i5 = i4 + index;
                if (length > i5) {
                    length = i5;
                }
            }
            while (index < length && Character.isDigit(str.charAt(index))) {
                index++;
            }
            if (parsePosition.getIndex() == index) {
                parsePosition.setErrorIndex(index);
                return false;
            }
            int parseInt = Integer.parseInt(str.substring(parsePosition.getIndex(), index));
            parsePosition.setIndex(index);
            calendar.set(this.f15644a, c(fastDateParser, parseInt));
            return true;
        }

        /* access modifiers changed from: package-private */
        public int c(FastDateParser fastDateParser, int i4) {
            return i4;
        }
    }

    private static abstract class k extends l {

        /* renamed from: a  reason: collision with root package name */
        private Pattern f15645a;

        private k() {
            super((a) null);
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean b(FastDateParser fastDateParser, Calendar calendar, String str, ParsePosition parsePosition, int i4) {
            Matcher matcher = this.f15645a.matcher(str.substring(parsePosition.getIndex()));
            if (!matcher.lookingAt()) {
                parsePosition.setErrorIndex(parsePosition.getIndex());
                return false;
            }
            parsePosition.setIndex(parsePosition.getIndex() + matcher.end(1));
            e(fastDateParser, calendar, matcher.group(1));
            return true;
        }

        /* access modifiers changed from: package-private */
        public void c(String str) {
            this.f15645a = Pattern.compile(str);
        }

        /* access modifiers changed from: package-private */
        public void d(StringBuilder sb) {
            c(sb.toString());
        }

        /* access modifiers changed from: package-private */
        public abstract void e(FastDateParser fastDateParser, Calendar calendar, String str);

        /* synthetic */ k(a aVar) {
            this();
        }
    }

    private static abstract class l {
        private l() {
        }

        /* access modifiers changed from: package-private */
        public abstract boolean a();

        /* access modifiers changed from: package-private */
        public abstract boolean b(FastDateParser fastDateParser, Calendar calendar, String str, ParsePosition parsePosition, int i4);

        /* synthetic */ l(a aVar) {
            this();
        }
    }

    private static class m {

        /* renamed from: a  reason: collision with root package name */
        final l f15646a;

        /* renamed from: b  reason: collision with root package name */
        final int f15647b;

        m(l lVar, int i4) {
            this.f15646a = lVar;
            this.f15647b = i4;
        }

        /* access modifiers changed from: package-private */
        public int a(ListIterator listIterator) {
            if (!this.f15646a.a() || !listIterator.hasNext()) {
                return 0;
            }
            l lVar = ((m) listIterator.next()).f15646a;
            listIterator.previous();
            if (lVar.a()) {
                return this.f15647b;
            }
            return 0;
        }
    }

    private class n {

        /* renamed from: a  reason: collision with root package name */
        private final Calendar f15648a;

        /* renamed from: b  reason: collision with root package name */
        private int f15649b;

        n(Calendar calendar) {
            this.f15648a = calendar;
        }

        private m b(char c4) {
            int i4 = this.f15649b;
            do {
                int i5 = this.f15649b + 1;
                this.f15649b = i5;
                if (i5 >= FastDateParser.this.pattern.length() || FastDateParser.this.pattern.charAt(this.f15649b) != c4) {
                    int i6 = this.f15649b - i4;
                }
                int i52 = this.f15649b + 1;
                this.f15649b = i52;
                break;
            } while (FastDateParser.this.pattern.charAt(this.f15649b) != c4);
            int i62 = this.f15649b - i4;
            return new m(FastDateParser.this.e(c4, i62, this.f15648a), i62);
        }

        private m c() {
            StringBuilder sb = new StringBuilder();
            boolean z3 = false;
            while (this.f15649b < FastDateParser.this.pattern.length()) {
                char charAt = FastDateParser.this.pattern.charAt(this.f15649b);
                if (!z3 && FastDateParser.g(charAt)) {
                    break;
                }
                if (charAt == '\'') {
                    int i4 = this.f15649b + 1;
                    this.f15649b = i4;
                    if (i4 == FastDateParser.this.pattern.length() || FastDateParser.this.pattern.charAt(this.f15649b) != '\'') {
                        z3 = !z3;
                    }
                }
                this.f15649b++;
                sb.append(charAt);
            }
            if (!z3) {
                String sb2 = sb.toString();
                return new m(new h(sb2), sb2.length());
            }
            throw new IllegalArgumentException("Unterminated quote");
        }

        /* access modifiers changed from: package-private */
        public m a() {
            if (this.f15649b >= FastDateParser.this.pattern.length()) {
                return null;
            }
            char charAt = FastDateParser.this.pattern.charAt(this.f15649b);
            if (FastDateParser.g(charAt)) {
                return b(charAt);
            }
            return c();
        }
    }

    static class o extends k {

        /* renamed from: b  reason: collision with root package name */
        private final Locale f15651b;

        /* renamed from: c  reason: collision with root package name */
        private final Map f15652c = new HashMap();

        private static class a {

            /* renamed from: a  reason: collision with root package name */
            TimeZone f15653a;

            /* renamed from: b  reason: collision with root package name */
            int f15654b;

            a(TimeZone timeZone, boolean z3) {
                int i4;
                this.f15653a = timeZone;
                if (z3) {
                    i4 = timeZone.getDSTSavings();
                } else {
                    i4 = 0;
                }
                this.f15654b = i4;
            }
        }

        o(Locale locale) {
            super((a) null);
            this.f15651b = locale;
            StringBuilder sb = new StringBuilder();
            sb.append("((?iu)[+-]\\d{4}|GMT[+-]\\d{1,2}:\\d{2}");
            TreeSet<String> treeSet = new TreeSet<>(FastDateParser.f15618b);
            for (String[] strArr : DateFormatSymbols.getInstance(locale).getZoneStrings()) {
                String str = strArr[0];
                if (!str.equalsIgnoreCase("GMT")) {
                    TimeZone timeZone = TimeZone.getTimeZone(str);
                    a aVar = new a(timeZone, false);
                    a aVar2 = aVar;
                    for (int i4 = 1; i4 < strArr.length; i4++) {
                        if (i4 == 3) {
                            aVar2 = new a(timeZone, true);
                        } else if (i4 == 5) {
                            aVar2 = aVar;
                        }
                        String str2 = strArr[i4];
                        if (str2 != null) {
                            String lowerCase = str2.toLowerCase(locale);
                            if (treeSet.add(lowerCase)) {
                                this.f15652c.put(lowerCase, aVar2);
                            }
                        }
                    }
                }
            }
            for (String access$900 : treeSet) {
                sb.append('|');
                StringBuilder unused = FastDateParser.h(sb, access$900);
            }
            sb.append(")");
            d(sb);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: org.apache.commons.lang3.time.FastDateParser$o$a} */
        /* access modifiers changed from: package-private */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void e(org.apache.commons.lang3.time.FastDateParser r2, java.util.Calendar r3, java.lang.String r4) {
            /*
                r1 = this;
                java.util.TimeZone r2 = org.apache.commons.lang3.time.b.a(r4)
                if (r2 == 0) goto L_0x000a
                r3.setTimeZone(r2)
                goto L_0x0046
            L_0x000a:
                java.util.Locale r2 = r1.f15651b
                java.lang.String r2 = r4.toLowerCase(r2)
                java.util.Map r4 = r1.f15652c
                java.lang.Object r4 = r4.get(r2)
                org.apache.commons.lang3.time.FastDateParser$o$a r4 = (org.apache.commons.lang3.time.FastDateParser.o.a) r4
                if (r4 != 0) goto L_0x0034
                java.util.Map r4 = r1.f15652c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r2)
                r2 = 46
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                java.lang.Object r2 = r4.get(r2)
                r4 = r2
                org.apache.commons.lang3.time.FastDateParser$o$a r4 = (org.apache.commons.lang3.time.FastDateParser.o.a) r4
            L_0x0034:
                int r2 = r4.f15654b
                r0 = 16
                r3.set(r0, r2)
                java.util.TimeZone r2 = r4.f15653a
                int r2 = r2.getRawOffset()
                r4 = 15
                r3.set(r4, r2)
            L_0x0046:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.lang3.time.FastDateParser.o.e(org.apache.commons.lang3.time.FastDateParser, java.util.Calendar, java.lang.String):void");
        }
    }

    protected FastDateParser(String str, TimeZone timeZone2, Locale locale2) {
        this(str, timeZone2, locale2, (Date) null);
    }

    /* access modifiers changed from: private */
    public int a(int i4) {
        int i5 = this.century + i4;
        if (i4 >= this.startYear) {
            return i5;
        }
        return i5 + 100;
    }

    /* access modifiers changed from: private */
    public static Map b(Calendar calendar, Locale locale2, int i4, StringBuilder sb) {
        HashMap hashMap = new HashMap();
        Map<String, Integer> displayNames = calendar.getDisplayNames(i4, 0, locale2);
        TreeSet treeSet = new TreeSet(f15618b);
        for (Map.Entry next : displayNames.entrySet()) {
            String lowerCase = ((String) next.getKey()).toLowerCase(locale2);
            if (treeSet.add(lowerCase)) {
                hashMap.put(lowerCase, (Integer) next.getValue());
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            h(sb, (String) it.next()).append('|');
        }
        return hashMap;
    }

    private static ConcurrentMap c(int i4) {
        ConcurrentMap concurrentMap;
        ConcurrentMap[] concurrentMapArr = f15619c;
        synchronized (concurrentMapArr) {
            try {
                if (concurrentMapArr[i4] == null) {
                    concurrentMapArr[i4] = new ConcurrentHashMap(3);
                }
                concurrentMap = concurrentMapArr[i4];
            } catch (Throwable th) {
                throw th;
            }
        }
        return concurrentMap;
    }

    private l d(int i4, Calendar calendar) {
        ConcurrentMap c4 = c(i4);
        l lVar = (l) c4.get(this.locale);
        if (lVar == null) {
            if (i4 == 15) {
                lVar = new o(this.locale);
            } else {
                lVar = new g(i4, calendar, this.locale);
            }
            l lVar2 = (l) c4.putIfAbsent(this.locale, lVar);
            if (lVar2 != null) {
                return lVar2;
            }
        }
        return lVar;
    }

    /* access modifiers changed from: private */
    public l e(char c4, int i4, Calendar calendar) {
        if (c4 != 'y') {
            if (c4 != 'z') {
                switch (c4) {
                    case 'D':
                        return f15625i;
                    case 'E':
                        return d(7, calendar);
                    case 'F':
                        return f15628l;
                    case 'G':
                        return d(0, calendar);
                    case 'H':
                        return f15629m;
                    default:
                        switch (c4) {
                            case 'K':
                                return f15632p;
                            case 'M':
                                if (i4 >= 3) {
                                    return d(2, calendar);
                                }
                                return f15621e;
                            case 'S':
                                return f15635w;
                            case 'a':
                                return d(9, calendar);
                            case 'd':
                                return f15626j;
                            case 'h':
                                return f15631o;
                            case 'k':
                                return f15630n;
                            case 'm':
                                return f15633q;
                            case 's':
                                return f15634v;
                            case 'u':
                                return f15627k;
                            case 'w':
                                return f15623g;
                            default:
                                switch (c4) {
                                    case 'W':
                                        return f15624h;
                                    case 'X':
                                        return i.g(i4);
                                    case 'Y':
                                        break;
                                    case 'Z':
                                        if (i4 == 2) {
                                            return i.f15643d;
                                        }
                                        break;
                                    default:
                                        throw new IllegalArgumentException("Format '" + c4 + "' not supported");
                                }
                        }
                }
            }
            return d(15, calendar);
        }
        if (i4 > 2) {
            return f15622f;
        }
        return f15620d;
    }

    private void f(Calendar calendar) {
        this.f15636a = new ArrayList();
        n nVar = new n(calendar);
        while (true) {
            m a4 = nVar.a();
            if (a4 != null) {
                this.f15636a.add(a4);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public static boolean g(char c4) {
        return (c4 >= 'A' && c4 <= 'Z') || (c4 >= 'a' && c4 <= 'z');
    }

    /* access modifiers changed from: private */
    public static StringBuilder h(StringBuilder sb, String str) {
        for (int i4 = 0; i4 < str.length(); i4++) {
            char charAt = str.charAt(i4);
            if (!(charAt == '$' || charAt == '.' || charAt == '?' || charAt == '^' || charAt == '[' || charAt == '\\' || charAt == '{' || charAt == '|')) {
                switch (charAt) {
                    case '(':
                    case ')':
                    case '*':
                    case '+':
                        break;
                }
            }
            sb.append('\\');
            sb.append(charAt);
        }
        if (sb.charAt(sb.length() - 1) == '.') {
            sb.append('?');
        }
        return sb;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        f(Calendar.getInstance(this.timeZone, this.locale));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FastDateParser)) {
            return false;
        }
        FastDateParser fastDateParser = (FastDateParser) obj;
        if (!this.pattern.equals(fastDateParser.pattern) || !this.timeZone.equals(fastDateParser.timeZone) || !this.locale.equals(fastDateParser.locale)) {
            return false;
        }
        return true;
    }

    public Locale getLocale() {
        return this.locale;
    }

    public String getPattern() {
        return this.pattern;
    }

    public TimeZone getTimeZone() {
        return this.timeZone;
    }

    public int hashCode() {
        return this.pattern.hashCode() + ((this.timeZone.hashCode() + (this.locale.hashCode() * 13)) * 13);
    }

    public Date parse(String str) {
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = parse(str, parsePosition);
        if (parse != null) {
            return parse;
        }
        if (this.locale.equals(JAPANESE_IMPERIAL)) {
            throw new ParseException("(The " + this.locale + " locale does not support dates before 1868 AD)\nUnparseable date: \"" + str, parsePosition.getErrorIndex());
        }
        throw new ParseException("Unparseable date: " + str, parsePosition.getErrorIndex());
    }

    public Object parseObject(String str) {
        return parse(str);
    }

    public String toString() {
        return "FastDateParser[" + this.pattern + "," + this.locale + "," + this.timeZone.getID() + "]";
    }

    protected FastDateParser(String str, TimeZone timeZone2, Locale locale2, Date date) {
        int i4;
        this.pattern = str;
        this.timeZone = timeZone2;
        this.locale = locale2;
        Calendar instance = Calendar.getInstance(timeZone2, locale2);
        if (date != null) {
            instance.setTime(date);
            i4 = instance.get(1);
        } else if (locale2.equals(JAPANESE_IMPERIAL)) {
            i4 = 0;
        } else {
            instance.setTime(new Date());
            i4 = instance.get(1) - 80;
        }
        int i5 = (i4 / 100) * 100;
        this.century = i5;
        this.startYear = i4 - i5;
        f(instance);
    }

    public Object parseObject(String str, ParsePosition parsePosition) {
        return parse(str, parsePosition);
    }

    public Date parse(String str, ParsePosition parsePosition) {
        Calendar instance = Calendar.getInstance(this.timeZone, this.locale);
        instance.clear();
        if (parse(str, parsePosition, instance)) {
            return instance.getTime();
        }
        return null;
    }

    public boolean parse(String str, ParsePosition parsePosition, Calendar calendar) {
        ListIterator listIterator = this.f15636a.listIterator();
        while (listIterator.hasNext()) {
            m mVar = (m) listIterator.next();
            if (!mVar.f15646a.b(this, calendar, str, parsePosition, mVar.a(listIterator))) {
                return false;
            }
        }
        return true;
    }
}
