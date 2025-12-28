package com.ibm.icu.util;

import Y1.m;
import Y1.n;
import Y1.s;
import Y1.z;
import com.ibm.icu.impl.ICUResourceBundle;
import com.ibm.icu.impl.locale.KeyTypeData;
import com.ibm.icu.impl.locale.LocaleSyntaxException;
import com.ibm.icu.impl.locale.h;
import com.ibm.icu.impl.locale.j;
import com.ibm.icu.impl.locale.l;
import com.ibm.icu.lang.UScript;
import com.ibm.icu.text.LocaleDisplayNames;
import com.ibm.icu.util.LocaleMatcher;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public final class ULocale implements Serializable, Comparable<ULocale> {
    public static f ACTUAL_LOCALE = new f((a) null);
    public static final ULocale CANADA = new ULocale("en_CA", Locale.CANADA);
    public static final ULocale CANADA_FRENCH = new ULocale("fr_CA", Locale.CANADA_FRENCH);
    public static final ULocale CHINA;
    public static final ULocale CHINESE = new ULocale("zh", Locale.CHINESE);
    public static final ULocale ENGLISH = new ULocale("en", Locale.ENGLISH);
    public static final ULocale FRANCE = new ULocale("fr_FR", Locale.FRANCE);
    public static final ULocale FRENCH = new ULocale("fr", Locale.FRENCH);
    public static final ULocale GERMAN = new ULocale("de", Locale.GERMAN);
    public static final ULocale GERMANY = new ULocale("de_DE", Locale.GERMANY);
    public static final ULocale ITALIAN = new ULocale("it", Locale.ITALIAN);
    public static final ULocale ITALY = new ULocale("it_IT", Locale.ITALY);
    public static final ULocale JAPAN = new ULocale("ja_JP", Locale.JAPAN);
    public static final ULocale JAPANESE = new ULocale("ja", Locale.JAPANESE);
    public static final ULocale KOREA = new ULocale("ko_KR", Locale.KOREA);
    public static final ULocale KOREAN = new ULocale("ko", Locale.KOREAN);
    public static final ULocale PRC;
    public static final char PRIVATE_USE_EXTENSION = 'x';
    public static final ULocale ROOT;
    public static final ULocale SIMPLIFIED_CHINESE = new ULocale("zh_Hans");
    public static final ULocale TAIWAN = new ULocale("zh_Hant_TW");
    public static final ULocale TRADITIONAL_CHINESE = new ULocale("zh_Hant");
    public static final ULocale UK = new ULocale("en_GB", Locale.UK);
    public static final char UNICODE_LOCALE_EXTENSION = 'u';
    public static final ULocale US = new ULocale("en_US", Locale.US);
    public static f VALID_LOCALE = new f((a) null);

    /* renamed from: d  reason: collision with root package name */
    private static Y1.c f13244d = new a();

    /* renamed from: e  reason: collision with root package name */
    private static final Locale f13245e;

    /* renamed from: f  reason: collision with root package name */
    private static final s f13246f = new b();

    /* renamed from: g  reason: collision with root package name */
    private static String[][] f13247g = {new String[]{"art__LOJBAN", "jbo"}, new String[]{"cel__GAULISH", "cel__GAULISH"}, new String[]{"de__1901", "de__1901"}, new String[]{"de__1906", "de__1906"}, new String[]{"en__BOONT", "en__BOONT"}, new String[]{"en__SCOUSE", "en__SCOUSE"}, new String[]{"hy__AREVELA", "hy", null, null}, new String[]{"hy__AREVMDA", "hyw", null, null}, new String[]{"sl__ROZAJ", "sl__ROZAJ"}, new String[]{"zh__GUOYU", "zh"}, new String[]{"zh__HAKKA", "hak"}, new String[]{"zh__XIANG", "hsn"}, new String[]{"zh_GAN", "gan"}, new String[]{"zh_MIN", "zh__MIN"}, new String[]{"zh_MIN_NAN", "nan"}, new String[]{"zh_WUU", "wuu"}, new String[]{"zh_YUE", "yue"}};

    /* renamed from: h  reason: collision with root package name */
    private static Locale f13248h = Locale.getDefault();

    /* renamed from: i  reason: collision with root package name */
    private static ULocale f13249i = forLocale(f13248h);

    /* renamed from: j  reason: collision with root package name */
    private static Locale[] f13250j = new Locale[Category.values().length];

    /* renamed from: k  reason: collision with root package name */
    private static ULocale[] f13251k = new ULocale[Category.values().length];

    /* renamed from: l  reason: collision with root package name */
    private static Set f13252l = null;
    private static final long serialVersionUID = 3715177670352309217L;

    /* renamed from: a  reason: collision with root package name */
    private volatile transient Locale f13253a;

    /* renamed from: b  reason: collision with root package name */
    private volatile transient com.ibm.icu.impl.locale.b f13254b;

    /* renamed from: c  reason: collision with root package name */
    private volatile transient h f13255c;
    private String localeID;

    public enum AvailableType {
        DEFAULT,
        ONLY_LEGACY_ALIASES,
        WITH_LEGACY_ALIASES
    }

    public enum Category {
        DISPLAY,
        FORMAT
    }

    @Deprecated
    public enum Minimize {
        FAVOR_SCRIPT,
        FAVOR_REGION
    }

    static class a extends s {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public String a(String str, Void voidR) {
            return new m(str).m();
        }
    }

    static class b extends s {
        b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public ULocale a(Locale locale, Void voidR) {
            return e.e(locale);
        }
    }

    static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f13259a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ibm.icu.util.ULocale$Category[] r0 = com.ibm.icu.util.ULocale.Category.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13259a = r0
                com.ibm.icu.util.ULocale$Category r1 = com.ibm.icu.util.ULocale.Category.DISPLAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f13259a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ibm.icu.util.ULocale$Category r1 = com.ibm.icu.util.ULocale.Category.FORMAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.util.ULocale.c.<clinit>():void");
        }
    }

    private static class d {

        /* renamed from: f  reason: collision with root package name */
        private static boolean f13260f;

        /* renamed from: g  reason: collision with root package name */
        private static Map f13261g;

        /* renamed from: h  reason: collision with root package name */
        private static Map f13262h;

        /* renamed from: i  reason: collision with root package name */
        private static Map f13263i;

        /* renamed from: j  reason: collision with root package name */
        private static Map f13264j;

        /* renamed from: k  reason: collision with root package name */
        private static Map f13265k;

        /* renamed from: a  reason: collision with root package name */
        private String f13266a;

        /* renamed from: b  reason: collision with root package name */
        private String f13267b;

        /* renamed from: c  reason: collision with root package name */
        private String f13268c;

        /* renamed from: d  reason: collision with root package name */
        private List f13269d;

        /* renamed from: e  reason: collision with root package name */
        private String f13270e;

        public d(String str, String str2, String str3, String str4, String str5) {
            this.f13266a = str;
            this.f13267b = str2;
            this.f13268c = str3;
            if (!str4.isEmpty()) {
                this.f13269d = new ArrayList(Arrays.asList(str4.split("_")));
            }
            this.f13270e = str5;
        }

        private static String a(String str, String str2, String str3) {
            if (str3 == null || str3.isEmpty()) {
                if (str2 == null || str2.isEmpty()) {
                    return str;
                }
                return null;
            } else if (str == null || str.isEmpty()) {
                return str3;
            } else {
                return str;
            }
        }

        private static String b(String str, String str2, String str3) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            if (str2 != null && !str2.isEmpty()) {
                sb.append('_');
                sb.append(str2);
            }
            if (str3 != null && !str3.isEmpty()) {
                sb.append('_');
                sb.append(str3);
            }
            return sb.toString();
        }

        private static synchronized void c() {
            synchronized (d.class) {
                try {
                    if (!f13260f) {
                        f13261g = new HashMap();
                        f13262h = new HashMap();
                        f13263i = new HashMap();
                        f13264j = new HashMap();
                        f13265k = new HashMap();
                        UResourceBundle c4 = UResourceBundle.g("com/ibm/icu/impl/data/icudt71b", "metadata", ICUResourceBundle.f12538e).c("alias");
                        UResourceBundle c5 = c4.c("language");
                        UResourceBundle c6 = c4.c("script");
                        UResourceBundle c7 = c4.c("territory");
                        UResourceBundle c8 = c4.c("variant");
                        UResourceBundle c9 = c4.c("subdivision");
                        int i4 = 0;
                        while (i4 < c5.p()) {
                            UResourceBundle b4 = c5.b(i4);
                            String l4 = b4.l();
                            String q4 = b4.c("replacement").q();
                            Locale locale = new Locale(l4);
                            if (locale.getScript().isEmpty()) {
                                if (l4.startsWith("und")) {
                                    if (locale.getCountry().isEmpty()) {
                                    }
                                }
                                f13261g.put(l4, q4);
                                i4++;
                            }
                            throw new IllegalArgumentException("key [" + l4 + "] in alias:language contains unsupported fields combination.");
                        }
                        int i5 = 0;
                        while (i5 < c6.p()) {
                            UResourceBundle b5 = c6.b(i5);
                            String l5 = b5.l();
                            String q5 = b5.c("replacement").q();
                            if (l5.length() == 4) {
                                f13262h.put(l5, q5);
                                i5++;
                            } else {
                                throw new IllegalArgumentException("Incorrect key [" + l5 + "] in alias:script.");
                            }
                        }
                        for (int i6 = 0; i6 < c7.p(); i6++) {
                            UResourceBundle b6 = c7.b(i6);
                            String l6 = b6.l();
                            String q6 = b6.c("replacement").q();
                            if (l6.length() < 2 || l6.length() > 3) {
                                throw new IllegalArgumentException("Incorrect key [" + l6 + "] in alias:territory.");
                            }
                            f13263i.put(l6, new ArrayList(Arrays.asList(q6.split(" "))));
                        }
                        int i7 = 0;
                        while (i7 < c8.p()) {
                            UResourceBundle b7 = c8.b(i7);
                            String l7 = b7.l();
                            String q7 = b7.c("replacement").q();
                            if (l7.length() < 4 || l7.length() > 8 || (l7.length() == 4 && (l7.charAt(0) < '0' || l7.charAt(0) > '9'))) {
                                throw new IllegalArgumentException("Incorrect key [" + l7 + "] in alias:variant.");
                            } else if (q7.length() < 4 || q7.length() > 8 || (q7.length() == 4 && (q7.charAt(0) < '0' || q7.charAt(0) > '9'))) {
                                throw new IllegalArgumentException("Incorrect variant [" + q7 + "] for the key [" + l7 + "] in alias:variant.");
                            } else {
                                f13264j.put(l7, q7);
                                i7++;
                            }
                        }
                        for (int i8 = 0; i8 < c9.p(); i8++) {
                            UResourceBundle b8 = c9.b(i8);
                            String l8 = b8.l();
                            String str = b8.c("replacement").q().split(" ")[0];
                            if (l8.length() < 3 || l8.length() > 8) {
                                throw new IllegalArgumentException("Incorrect key [" + l8 + "] in alias:territory.");
                            }
                            if (str.length() == 2) {
                                str = str + "zzzz";
                            } else if (str.length() < 2 || str.length() > 8) {
                                throw new IllegalArgumentException("Incorrect value [" + str + "] in alias:territory.");
                            }
                            f13265k.put(l8, str);
                        }
                        f13260f = true;
                    }
                } finally {
                    while (true) {
                    }
                }
            }
        }

        /* JADX WARNING: type inference failed for: r1v0 */
        /* JADX WARNING: type inference failed for: r1v1, types: [boolean] */
        /* JADX WARNING: type inference failed for: r1v2 */
        private boolean e(boolean z3, boolean z4, boolean z5) {
            int i4;
            String str;
            String str2;
            int i5;
            String str3;
            String str4;
            String str5;
            String str6;
            int i6;
            String str7;
            ? r12 = 0;
            if ((z4 && ((str7 = this.f13268c) == null || str7.isEmpty())) || (z5 && this.f13269d == null)) {
                return false;
            }
            int i7 = 1;
            if (z5) {
                i4 = this.f13269d.size();
            } else {
                i4 = 1;
            }
            if (z3) {
                str = this.f13266a;
            } else {
                str = "und";
            }
            if (z4) {
                str2 = this.f13268c;
            } else {
                str2 = null;
            }
            int i8 = 0;
            String str8 = null;
            while (i8 < i4) {
                if (z5) {
                    str8 = (String) this.f13269d.get(i8);
                }
                int i9 = 4;
                if (str8 != null && str8.length() < 4) {
                    str8 = null;
                }
                String str9 = (String) f13261g.get(b(str, str2, str8));
                if (str9 == null) {
                    i5 = i4;
                } else {
                    if (str9.indexOf(95) >= 0) {
                        String[] split = str9.split("_");
                        String str10 = split[r12];
                        if (str10.equals("und")) {
                            str10 = this.f13266a;
                        }
                        int length = split[r12].length() + i7;
                        int i10 = i7;
                        String str11 = null;
                        String str12 = null;
                        String str13 = null;
                        while (true) {
                            if (split.length <= i10) {
                                i5 = i4;
                                str9 = str10;
                                str3 = str11;
                                str5 = str12;
                                str4 = str13;
                                str6 = null;
                                break;
                            }
                            String str14 = split[i10];
                            int length2 = str14.length();
                            if (i7 == length2) {
                                str6 = str9.substring(length);
                                i5 = i4;
                                str9 = str10;
                                str3 = str11;
                                str5 = str12;
                                str4 = str13;
                                break;
                            }
                            if (length2 < 2 || length2 > 3) {
                                if (length2 >= 5 && length2 <= 8) {
                                    i6 = i4;
                                } else if (length2 == i9) {
                                    i6 = i4;
                                    if (str14.charAt(0) < '0' || str14.charAt(0) > '9') {
                                        str11 = str14;
                                    }
                                } else {
                                    i6 = i4;
                                }
                                str13 = str14;
                            } else {
                                i6 = i4;
                                str12 = str14;
                            }
                            i10++;
                            length += length2 + 1;
                            i4 = i6;
                            i7 = 1;
                            i9 = 4;
                        }
                    } else {
                        if (str9.equals("und")) {
                            str9 = this.f13266a;
                        }
                        i5 = i4;
                        str6 = null;
                        str5 = null;
                        str4 = null;
                        str3 = null;
                    }
                    String a4 = a(this.f13267b, (String) null, str3);
                    String a5 = a(this.f13268c, str2, str5);
                    String a6 = a(str8, str8, str4);
                    if (!this.f13266a.equals(str9) || !this.f13267b.equals(a4) || !this.f13268c.equals(a5) || !Objects.equals(str8, a6) || str6 != null) {
                        this.f13266a = str9;
                        this.f13267b = a4;
                        this.f13268c = a5;
                        if (str8 != null && !str8.isEmpty()) {
                            if (a6 == null || a6.isEmpty()) {
                                this.f13269d.remove(i8);
                                if (this.f13269d.isEmpty()) {
                                    this.f13269d = null;
                                }
                            } else {
                                this.f13269d.set(i8, a6);
                            }
                        }
                        return true;
                    }
                }
                i8++;
                i4 = i5;
                r12 = 0;
                i7 = 1;
            }
            return r12;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.String} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean f() {
            /*
                r7 = this;
                java.lang.String r0 = r7.f13268c
                r1 = 0
                if (r0 == 0) goto L_0x004b
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L_0x000c
                goto L_0x004b
            L_0x000c:
                java.util.Map r0 = f13263i
                java.lang.String r2 = r7.f13268c
                java.lang.Object r0 = r0.get(r2)
                java.util.List r0 = (java.util.List) r0
                if (r0 != 0) goto L_0x0019
                return r1
            L_0x0019:
                int r2 = r0.size()
                r3 = 1
                if (r2 <= r3) goto L_0x0041
                com.ibm.icu.util.ULocale r2 = new com.ibm.icu.util.ULocale
                java.lang.String r4 = r7.f13266a
                java.lang.String r5 = r7.f13267b
                r6 = 0
                r2.<init>((java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r6)
                com.ibm.icu.util.ULocale r2 = com.ibm.icu.util.ULocale.addLikelySubtags(r2)
                java.lang.String r2 = r2.getCountry()
                boolean r4 = r0.contains(r2)
                if (r4 == 0) goto L_0x0039
                goto L_0x0048
            L_0x0039:
                java.lang.Object r0 = r0.get(r1)
                r2 = r0
                java.lang.String r2 = (java.lang.String) r2
                goto L_0x0048
            L_0x0041:
                java.lang.Object r0 = r0.get(r1)
                r2 = r0
                java.lang.String r2 = (java.lang.String) r2
            L_0x0048:
                r7.f13268c = r2
                return r3
            L_0x004b:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.util.ULocale.d.f():boolean");
        }

        private boolean g() {
            String str;
            String str2 = this.f13267b;
            if (str2 == null || str2.isEmpty() || (str = (String) f13262h.get(this.f13267b)) == null) {
                return false;
            }
            this.f13267b = str;
            return true;
        }

        private String h(String str) {
            return (String) f13265k.get(str);
        }

        private String i(String str) {
            StringBuilder sb = new StringBuilder();
            ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(str.split("-")));
            ArrayList arrayList2 = new ArrayList();
            String str2 = "";
            int i4 = 0;
            int i5 = 0;
            String str3 = str2;
            for (String str4 : arrayList) {
                if (com.ibm.icu.impl.locale.f.x(str4)) {
                    if (i4 == 0) {
                        i4 = i5 - 1;
                    }
                    if (sb.length() > 0) {
                        arrayList2.add(sb.toString());
                        sb.setLength(0);
                    }
                    sb.append(str4);
                    str3 = str4;
                } else if (i4 != 0) {
                    sb.append("-");
                    sb.append(ULocale.toUnicodeLocaleType(str3, str4));
                }
                i5 += str4.length() + 1;
            }
            if (sb.length() > 0) {
                arrayList2.add(sb.toString());
                sb.setLength(0);
            }
            if (i4 > 0) {
                str2 = str.substring(0, i4);
            } else if (arrayList2.size() == 0) {
                str2 = str;
            }
            if (str2.length() > 0) {
                sb.append(com.ibm.icu.impl.locale.a.j(ULocale.createCanonical(ULocale.forLanguageTag(str)).toLanguageTag()));
            }
            if (arrayList2.size() > 0) {
                if (sb.length() > 0) {
                    sb.append("-");
                }
                Collections.sort(arrayList2);
                sb.append(z.j("-", arrayList2));
            }
            return sb.toString();
        }

        private boolean j() {
            if (this.f13269d == null) {
                return false;
            }
            for (int i4 = 0; i4 < this.f13269d.size(); i4++) {
                String str = (String) this.f13269d.get(i4);
                String str2 = (String) f13264j.get(str);
                if (str2 != null && !str.equals(str2)) {
                    this.f13269d.set(i4, str2);
                    if (!str.equals("heploc")) {
                        return true;
                    }
                    this.f13269d.remove("hepburn");
                    if (!this.f13269d.isEmpty()) {
                        return true;
                    }
                    this.f13269d = null;
                    return true;
                }
            }
            return false;
        }

        public String d() {
            String str;
            c();
            boolean z3 = false;
            int i4 = 0;
            boolean z4 = false;
            while (true) {
                int i5 = i4 + 1;
                String str2 = "";
                if (i4 > 10) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Have problem to resolve locale alias of ");
                    String str3 = this.f13266a;
                    String str4 = this.f13267b;
                    String str5 = this.f13268c;
                    List list = this.f13269d;
                    if (list != null) {
                        str2 = z.j("_", list);
                    }
                    sb.append(ULocale.u(str3, str4, str5, str2));
                    sb.append(this.f13270e);
                    throw new IllegalArgumentException(sb.toString());
                } else if (e(true, true, true) || e(true, true, false) || e(true, false, true) || e(true, false, false) || e(false, false, true) || f() || g() || j()) {
                    z4 = true;
                    i4 = i5;
                } else if (this.f13270e == null && !z4) {
                    return null;
                } else {
                    String str6 = this.f13266a;
                    String str7 = this.f13267b;
                    String str8 = this.f13268c;
                    List list2 = this.f13269d;
                    if (list2 != null) {
                        str2 = z.j("_", list2);
                    }
                    String access$000 = ULocale.u(str6, str7, str8, str2);
                    if (this.f13270e != null) {
                        ULocale uLocale = new ULocale(access$000 + this.f13270e);
                        Iterator<String> keywords = uLocale.getKeywords();
                        while (keywords != null && keywords.hasNext()) {
                            String next = keywords.next();
                            if (next.equals("rg") || next.equals("sd") || next.equals("t")) {
                                String keywordValue = uLocale.getKeywordValue(next);
                                if (next.equals("t")) {
                                    str = i(keywordValue);
                                } else {
                                    str = h(keywordValue);
                                }
                                if (str != null) {
                                    uLocale = uLocale.setKeywordValue(next, str);
                                    z3 = true;
                                }
                            }
                        }
                        if (z3) {
                            this.f13270e = uLocale.getName().substring(uLocale.getBaseName().length());
                            z4 = true;
                        }
                        access$000 = access$000 + this.f13270e;
                    }
                    if (z4) {
                        return access$000;
                    }
                    return null;
                }
            }
        }
    }

    private static final class e {

        /* renamed from: a  reason: collision with root package name */
        private static boolean f13271a = true;

        /* renamed from: b  reason: collision with root package name */
        private static Method f13272b;

        /* renamed from: c  reason: collision with root package name */
        private static Method f13273c;

        /* renamed from: d  reason: collision with root package name */
        private static Object f13274d;

        /* renamed from: e  reason: collision with root package name */
        private static Object f13275e;

        static {
            Class cls;
            Class<Locale> cls2 = Locale.class;
            try {
                Class[] declaredClasses = cls2.getDeclaredClasses();
                int length = declaredClasses.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        cls = null;
                        break;
                    }
                    cls = declaredClasses[i4];
                    if (cls.getName().equals("java.util.Locale$Category")) {
                        break;
                    }
                    i4++;
                }
                if (cls != null) {
                    f13272b = cls2.getDeclaredMethod("getDefault", new Class[]{cls});
                    f13273c = cls2.getDeclaredMethod("setDefault", new Class[]{cls, cls2});
                    Method method = cls.getMethod("name", (Class[]) null);
                    for (Object obj : cls.getEnumConstants()) {
                        String str = (String) method.invoke(obj, (Object[]) null);
                        if (str.equals("DISPLAY")) {
                            f13274d = obj;
                        } else if (str.equals("FORMAT")) {
                            f13275e = obj;
                        }
                    }
                    if (f13274d == null) {
                        return;
                    }
                    if (f13275e != null) {
                    }
                }
            } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException | InvocationTargetException unused) {
            }
        }

        public static Locale a(Category category) {
            Object obj;
            if (f13271a) {
                int i4 = c.f13259a[category.ordinal()];
                if (i4 == 1) {
                    obj = f13274d;
                } else if (i4 != 2) {
                    obj = null;
                } else {
                    obj = f13275e;
                }
                if (obj != null) {
                    try {
                        return (Locale) f13272b.invoke((Object) null, new Object[]{obj});
                    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                    }
                }
            }
            return Locale.getDefault();
        }

        public static boolean b() {
            return f13271a;
        }

        public static void c(Category category, Locale locale) {
            Object obj;
            if (f13271a) {
                int i4 = c.f13259a[category.ordinal()];
                if (i4 == 1) {
                    obj = f13274d;
                } else if (i4 != 2) {
                    obj = null;
                } else {
                    obj = f13275e;
                }
                if (obj != null) {
                    try {
                        f13273c.invoke((Object) null, new Object[]{obj, locale});
                    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                    }
                }
            }
        }

        public static Locale d(ULocale uLocale) {
            Locale locale;
            String name = uLocale.getName();
            if (uLocale.getScript().length() > 0 || name.contains("@")) {
                locale = Locale.forLanguageTag(com.ibm.icu.impl.locale.a.m(uLocale.toLanguageTag()));
            } else {
                locale = null;
            }
            if (locale == null) {
                return new Locale(uLocale.getLanguage(), uLocale.getCountry(), uLocale.getVariant());
            }
            return locale;
        }

        public static ULocale e(Locale locale) {
            TreeSet<String> treeSet;
            TreeMap treeMap;
            String language = locale.getLanguage();
            String country = locale.getCountry();
            String variant = locale.getVariant();
            String script = locale.getScript();
            Set<Character> extensionKeys = locale.getExtensionKeys();
            if (!extensionKeys.isEmpty()) {
                treeMap = null;
                treeSet = null;
                for (Character next : extensionKeys) {
                    if (next.charValue() == 'u') {
                        Set<String> unicodeLocaleAttributes = locale.getUnicodeLocaleAttributes();
                        if (!unicodeLocaleAttributes.isEmpty()) {
                            treeSet = new TreeSet<>();
                            for (String add : unicodeLocaleAttributes) {
                                treeSet.add(add);
                            }
                        }
                        for (String next2 : locale.getUnicodeLocaleKeys()) {
                            String unicodeLocaleType = locale.getUnicodeLocaleType(next2);
                            if (unicodeLocaleType != null) {
                                if (next2.equals("va")) {
                                    if (variant.length() != 0) {
                                        unicodeLocaleType = unicodeLocaleType + "_" + variant;
                                    }
                                    variant = unicodeLocaleType;
                                } else {
                                    if (treeMap == null) {
                                        treeMap = new TreeMap();
                                    }
                                    treeMap.put(next2, unicodeLocaleType);
                                }
                            }
                        }
                    } else {
                        String extension = locale.getExtension(next.charValue());
                        if (extension != null) {
                            if (treeMap == null) {
                                treeMap = new TreeMap();
                            }
                            treeMap.put(String.valueOf(next), extension);
                        }
                    }
                }
            } else {
                treeMap = null;
                treeSet = null;
            }
            if (language.equals("no") && country.equals("NO") && variant.equals("NY")) {
                language = "nn";
                variant = "";
            }
            StringBuilder sb = new StringBuilder(language);
            if (script.length() > 0) {
                sb.append('_');
                sb.append(script);
            }
            if (country.length() > 0) {
                sb.append('_');
                sb.append(country);
            }
            if (variant.length() > 0) {
                if (country.length() == 0) {
                    sb.append('_');
                }
                sb.append('_');
                sb.append(variant);
            }
            if (treeSet != null) {
                StringBuilder sb2 = new StringBuilder();
                for (String str : treeSet) {
                    if (sb2.length() != 0) {
                        sb2.append('-');
                    }
                    sb2.append(str);
                }
                if (treeMap == null) {
                    treeMap = new TreeMap();
                }
                treeMap.put("attribute", sb2.toString());
            }
            if (treeMap != null) {
                sb.append('@');
                boolean z3 = false;
                for (Map.Entry entry : treeMap.entrySet()) {
                    String str2 = (String) entry.getKey();
                    String str3 = (String) entry.getValue();
                    if (str2.length() != 1) {
                        str2 = ULocale.toLegacyKey(str2);
                        if (str3.length() == 0) {
                            str3 = "yes";
                        }
                        str3 = ULocale.toLegacyType(str2, str3);
                    }
                    if (z3) {
                        sb.append(';');
                    } else {
                        z3 = true;
                    }
                    sb.append(str2);
                    sb.append('=');
                    sb.append(str3);
                }
            }
            return new ULocale(ULocale.getName(sb.toString()), locale, (a) null);
        }
    }

    public static final class f {
        /* synthetic */ f(a aVar) {
            this();
        }

        private f() {
        }
    }

    static {
        ULocale uLocale = new ULocale("zh_Hans_CN");
        CHINA = uLocale;
        PRC = uLocale;
        Locale locale = new Locale("", "");
        f13245e = locale;
        ROOT = new ULocale("", locale);
        int i4 = 0;
        if (e.b()) {
            Category[] values = Category.values();
            int length = values.length;
            while (i4 < length) {
                Category category = values[i4];
                int ordinal = category.ordinal();
                f13250j[ordinal] = e.a(category);
                f13251k[ordinal] = forLocale(f13250j[ordinal]);
                i4++;
            }
        } else {
            Category[] values2 = Category.values();
            int length2 = values2.length;
            while (i4 < length2) {
                int ordinal2 = values2[i4].ordinal();
                f13250j[ordinal2] = f13248h;
                f13251k[ordinal2] = f13249i;
                i4++;
            }
        }
    }

    /* synthetic */ ULocale(String str, Locale locale, a aVar) {
        this(str, locale);
    }

    private static void a(String str, StringBuilder sb) {
        if (sb.length() != 0) {
            sb.append('_');
        }
        sb.append(str);
    }

    public static ULocale acceptLanguage(String str, ULocale[] uLocaleArr, boolean[] zArr) {
        if (zArr != null) {
            zArr[0] = true;
        }
        try {
            c d4 = c.f(str).d();
            LocaleMatcher.b b4 = LocaleMatcher.b();
            for (ULocale j4 : uLocaleArr) {
                b4.j(j4);
            }
            LocaleMatcher.d e4 = b4.k().e(d4);
            if (e4.a() >= 0) {
                if (zArr != null && e4.b().equals(e4.c())) {
                    zArr[0] = false;
                }
                return e4.c();
            }
        } catch (IllegalArgumentException unused) {
        }
        return null;
    }

    public static ULocale addLikelySubtags(ULocale uLocale) {
        String str;
        String[] strArr = new String[3];
        int v3 = v(uLocale.localeID, strArr);
        if (v3 < uLocale.localeID.length()) {
            str = uLocale.localeID.substring(v3);
        } else {
            str = null;
        }
        String c4 = c(strArr[0], strArr[1], strArr[2], str);
        if (c4 == null) {
            return uLocale;
        }
        return new ULocale(c4);
    }

    /* access modifiers changed from: private */
    public com.ibm.icu.impl.locale.b b() {
        String str;
        String str2;
        String str3;
        String str4;
        if (this.f13254b == null) {
            if (!equals(ROOT)) {
                m mVar = new m(this.localeID);
                str3 = mVar.l();
                str2 = mVar.n();
                str = mVar.f();
                str4 = mVar.q();
            } else {
                str3 = "";
                str4 = str3;
                str2 = str4;
                str = str2;
            }
            this.f13254b = com.ibm.icu.impl.locale.b.a(str3, str2, str, str4);
        }
        return this.f13254b;
    }

    private static String c(String str, String str2, String str3, String str4) {
        String t4;
        String t5;
        String t6;
        if (!r(str2) && !r(str3) && (t6 = t(createTagString(str, str2, str3, (String) null))) != null) {
            return d((String) null, (String) null, (String) null, str4, t6);
        }
        if (!r(str2) && (t5 = t(createTagString(str, str2, (String) null, (String) null))) != null) {
            return d((String) null, (String) null, str3, str4, t5);
        }
        if (!r(str3) && (t4 = t(createTagString(str, (String) null, str3, (String) null))) != null) {
            return d((String) null, str2, (String) null, str4, t4);
        }
        String t7 = t(createTagString(str, (String) null, (String) null, (String) null));
        if (t7 != null) {
            return d((String) null, str2, str3, str4, t7);
        }
        return null;
    }

    public static String canonicalize(String str) {
        String d4;
        m mVar = new m(str, true);
        String e4 = mVar.e();
        if (str.equals("")) {
            return "";
        }
        int i4 = 0;
        while (true) {
            String[][] strArr = f13247g;
            if (i4 < strArr.length) {
                String[] strArr2 = strArr[i4];
                if (strArr2[0].equals(e4)) {
                    mVar.G(strArr2[1]);
                    break;
                }
                i4++;
            } else if (mVar.l().equals("nb") && mVar.q().equals("NY")) {
                mVar.G(u("nn", mVar.n(), mVar.f(), (String) null));
            }
        }
        if (!s(mVar.m()) && (d4 = new d(mVar.l(), mVar.n(), mVar.f(), com.ibm.icu.impl.locale.a.j(mVar.q()), mVar.m().substring(mVar.e().length())).d()) != null) {
            mVar = new m(d4);
        }
        return mVar.m();
    }

    public static ULocale createCanonical(String str) {
        return new ULocale(canonicalize(str), (Locale) null);
    }

    static String createTagString(String str, String str2, String str3, String str4) {
        return d(str, str2, str3, str4, (String) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String d(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = r(r4)
            if (r1 != 0) goto L_0x000f
            a(r4, r0)
            goto L_0x001a
        L_0x000f:
            boolean r4 = r(r8)
            java.lang.String r1 = "und"
            if (r4 == 0) goto L_0x001c
            a(r1, r0)
        L_0x001a:
            r4 = 0
            goto L_0x002f
        L_0x001c:
            Y1.m r4 = new Y1.m
            r4.<init>(r8)
            java.lang.String r2 = r4.l()
            boolean r3 = r(r2)
            if (r3 != 0) goto L_0x002c
            r1 = r2
        L_0x002c:
            a(r1, r0)
        L_0x002f:
            boolean r1 = r(r5)
            if (r1 != 0) goto L_0x0039
            a(r5, r0)
            goto L_0x0053
        L_0x0039:
            boolean r5 = r(r8)
            if (r5 != 0) goto L_0x0053
            if (r4 != 0) goto L_0x0046
            Y1.m r4 = new Y1.m
            r4.<init>(r8)
        L_0x0046:
            java.lang.String r5 = r4.n()
            boolean r1 = r(r5)
            if (r1 != 0) goto L_0x0053
            a(r5, r0)
        L_0x0053:
            boolean r5 = r(r6)
            r1 = 1
            r2 = 0
            if (r5 != 0) goto L_0x0060
            a(r6, r0)
        L_0x005e:
            r4 = r1
            goto L_0x007c
        L_0x0060:
            boolean r5 = r(r8)
            if (r5 != 0) goto L_0x007b
            if (r4 != 0) goto L_0x006d
            Y1.m r4 = new Y1.m
            r4.<init>(r8)
        L_0x006d:
            java.lang.String r4 = r4.f()
            boolean r5 = r(r4)
            if (r5 != 0) goto L_0x007b
            a(r4, r0)
            goto L_0x005e
        L_0x007b:
            r4 = r2
        L_0x007c:
            if (r7 == 0) goto L_0x00ae
            int r5 = r7.length()
            if (r5 <= r1) goto L_0x00ae
            char r5 = r7.charAt(r2)
            r6 = 2
            r8 = 95
            if (r5 != r8) goto L_0x0095
            char r5 = r7.charAt(r1)
            if (r5 != r8) goto L_0x0096
            r2 = r6
            goto L_0x0096
        L_0x0095:
            r2 = r1
        L_0x0096:
            if (r4 == 0) goto L_0x00a6
            if (r2 != r6) goto L_0x00a2
            java.lang.String r4 = r7.substring(r1)
            r0.append(r4)
            goto L_0x00ae
        L_0x00a2:
            r0.append(r7)
            goto L_0x00ae
        L_0x00a6:
            if (r2 != r1) goto L_0x00ab
            r0.append(r8)
        L_0x00ab:
            r0.append(r7)
        L_0x00ae:
            java.lang.String r4 = r0.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.util.ULocale.d(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    /* access modifiers changed from: private */
    public h e() {
        if (this.f13255c == null) {
            Iterator<String> keywords = getKeywords();
            if (keywords == null) {
                this.f13255c = h.f12887d;
            } else {
                com.ibm.icu.impl.locale.d dVar = new com.ibm.icu.impl.locale.d();
                while (keywords.hasNext()) {
                    String next = keywords.next();
                    if (next.equals("attribute")) {
                        for (String a4 : getKeywordValue(next).split("[-_]")) {
                            try {
                                dVar.a(a4);
                            } catch (LocaleSyntaxException unused) {
                            }
                        }
                    } else if (next.length() >= 2) {
                        String unicodeLocaleKey = toUnicodeLocaleKey(next);
                        String unicodeLocaleType = toUnicodeLocaleType(next, getKeywordValue(next));
                        if (!(unicodeLocaleKey == null || unicodeLocaleType == null)) {
                            try {
                                dVar.m(unicodeLocaleKey, unicodeLocaleType);
                            } catch (LocaleSyntaxException unused2) {
                            }
                        }
                    } else if (next.length() == 1 && next.charAt(0) != 'u') {
                        dVar.h(next.charAt(0), getKeywordValue(next).replace("_", "-"));
                    }
                }
                this.f13255c = dVar.f();
            }
        }
        return this.f13255c;
    }

    private static String f(ULocale uLocale, ULocale uLocale2) {
        return LocaleDisplayNames.a(uLocale2).g(uLocale.getCountry());
    }

    public static ULocale forLanguageTag(String str) {
        com.ibm.icu.impl.locale.f z3 = com.ibm.icu.impl.locale.f.z(str, (j) null);
        com.ibm.icu.impl.locale.d dVar = new com.ibm.icu.impl.locale.d();
        dVar.j(z3);
        return p(dVar.e(), dVar.f());
    }

    public static ULocale forLocale(Locale locale) {
        if (locale == null) {
            return null;
        }
        return (ULocale) f13246f.b(locale, (Object) null);
    }

    private static String g(String str, ULocale uLocale) {
        return LocaleDisplayNames.a(uLocale).c(str);
    }

    public static ULocale[] getAvailableLocales() {
        return (ULocale[]) ICUResourceBundle.c0().clone();
    }

    public static Collection<ULocale> getAvailableLocalesByType(AvailableType availableType) {
        List list;
        if (availableType != null) {
            if (availableType == AvailableType.WITH_LEGACY_ALIASES) {
                list = new ArrayList();
                Collections.addAll(list, ICUResourceBundle.d0(AvailableType.DEFAULT));
                Collections.addAll(list, ICUResourceBundle.d0(AvailableType.ONLY_LEGACY_ALIASES));
            } else {
                list = Arrays.asList(ICUResourceBundle.d0(availableType));
            }
            return Collections.unmodifiableList(list);
        }
        throw new IllegalArgumentException();
    }

    public static ULocale getDefault() {
        synchronized (ULocale.class) {
            try {
                if (f13249i == null) {
                    ULocale uLocale = ROOT;
                    return uLocale;
                }
                Locale locale = Locale.getDefault();
                if (!f13248h.equals(locale)) {
                    f13248h = locale;
                    f13249i = forLocale(locale);
                    if (!e.b()) {
                        for (Category ordinal : Category.values()) {
                            int ordinal2 = ordinal.ordinal();
                            f13250j[ordinal2] = locale;
                            f13251k[ordinal2] = forLocale(locale);
                        }
                    }
                }
                ULocale uLocale2 = f13249i;
                return uLocale2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String getDisplayKeyword(String str) {
        return g(str, getDefault(Category.DISPLAY));
    }

    public static String getFallback(String str) {
        return o(getName(str));
    }

    public static String[] getISOCountries() {
        return n.f();
    }

    public static String[] getISOLanguages() {
        return n.g();
    }

    @Deprecated
    public static String getRegionForSupplementalData(ULocale uLocale, boolean z3) {
        String keywordValue = uLocale.getKeywordValue("rg");
        if (keywordValue != null && keywordValue.length() == 6) {
            String m4 = com.ibm.icu.impl.locale.a.m(keywordValue);
            if (m4.endsWith("ZZZZ")) {
                return m4.substring(0, 2);
            }
        }
        String country = uLocale.getCountry();
        if (country.length() != 0 || !z3) {
            return country;
        }
        return addLikelySubtags(uLocale).getCountry();
    }

    private static String h(ULocale uLocale, String str, ULocale uLocale2) {
        String j4 = com.ibm.icu.impl.locale.a.j(str.trim());
        return LocaleDisplayNames.a(uLocale2).d(j4, uLocale.getKeywordValue(j4));
    }

    private static String i(ULocale uLocale, ULocale uLocale2, boolean z3) {
        String str;
        if (z3) {
            str = uLocale.getBaseName();
        } else {
            str = uLocale.getLanguage();
        }
        return LocaleDisplayNames.a(uLocale2).e(str);
    }

    private static String j(ULocale uLocale, ULocale uLocale2) {
        return LocaleDisplayNames.a(uLocale2).f(uLocale);
    }

    private static String k(ULocale uLocale, ULocale uLocale2) {
        return LocaleDisplayNames.b(uLocale2, LocaleDisplayNames.DialectHandling.DIALECT_NAMES).f(uLocale);
    }

    private static String l(ULocale uLocale, ULocale uLocale2) {
        return LocaleDisplayNames.a(uLocale2).i(uLocale.getScript());
    }

    private static String m(ULocale uLocale, ULocale uLocale2) {
        return LocaleDisplayNames.a(uLocale2).h(uLocale.getScript());
    }

    public static ULocale minimizeSubtags(ULocale uLocale) {
        return minimizeSubtags(uLocale, Minimize.FAVOR_REGION);
    }

    private static String n(ULocale uLocale, ULocale uLocale2) {
        return LocaleDisplayNames.a(uLocale2).j(uLocale.getVariant());
    }

    private static String o(String str) {
        int indexOf = str.indexOf(64);
        if (indexOf == -1) {
            indexOf = str.length();
        }
        int lastIndexOf = str.lastIndexOf(95, indexOf);
        if (lastIndexOf == -1) {
            lastIndexOf = 0;
        } else {
            while (lastIndexOf > 0 && str.charAt(lastIndexOf - 1) == '_') {
                lastIndexOf--;
            }
        }
        return str.substring(0, lastIndexOf) + str.substring(indexOf);
    }

    /* access modifiers changed from: private */
    public static ULocale p(com.ibm.icu.impl.locale.b bVar, h hVar) {
        String u3 = u(bVar.b(), bVar.d(), bVar.c(), bVar.e());
        Set<Character> c4 = hVar.c();
        if (!c4.isEmpty()) {
            TreeMap treeMap = new TreeMap();
            for (Character ch2 : c4) {
                com.ibm.icu.impl.locale.c a4 = hVar.a(ch2);
                if (a4 instanceof l) {
                    l lVar = (l) a4;
                    for (String str : lVar.d()) {
                        String e4 = lVar.e(str);
                        String legacyKey = toLegacyKey(str);
                        if (e4.length() == 0) {
                            e4 = "yes";
                        }
                        String legacyType = toLegacyType(str, e4);
                        if (!legacyKey.equals("va") || !legacyType.equals("posix") || bVar.e().length() != 0) {
                            treeMap.put(legacyKey, legacyType);
                        } else {
                            u3 = u3 + "_POSIX";
                        }
                    }
                    Set<String> c5 = lVar.c();
                    if (c5.size() > 0) {
                        StringBuilder sb = new StringBuilder();
                        for (String str2 : c5) {
                            if (sb.length() > 0) {
                                sb.append('-');
                            }
                            sb.append(str2);
                        }
                        treeMap.put("attribute", sb.toString());
                    }
                } else {
                    treeMap.put(String.valueOf(ch2), a4.b());
                }
            }
            if (!treeMap.isEmpty()) {
                StringBuilder sb2 = new StringBuilder(u3);
                sb2.append("@");
                boolean z3 = false;
                for (Map.Entry entry : treeMap.entrySet()) {
                    if (z3) {
                        sb2.append(";");
                    } else {
                        z3 = true;
                    }
                    sb2.append((String) entry.getKey());
                    sb2.append("=");
                    sb2.append((String) entry.getValue());
                }
                u3 = sb2.toString();
            }
        }
        return new ULocale(u3);
    }

    private static int q(String str) {
        int length = str.length();
        int i4 = length;
        boolean z3 = true;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            if (str.charAt(i6) == '_' || str.charAt(i6) == '-') {
                if (i5 != 0 && i5 < i4) {
                    i4 = i5;
                }
                z3 = true;
            } else {
                if (z3) {
                    i5 = 0;
                    z3 = false;
                }
                i5++;
            }
        }
        return i4;
    }

    private static boolean r(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x01a0, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized boolean s(java.lang.String r180) {
        /*
            r0 = r180
            java.lang.Class<com.ibm.icu.util.ULocale> r1 = com.ibm.icu.util.ULocale.class
            monitor-enter(r1)
            java.lang.String r2 = "c"
            boolean r2 = r0.equals(r2)     // Catch:{ all -> 0x0195 }
            if (r2 != 0) goto L_0x019f
            java.lang.String r2 = "en"
            boolean r2 = r0.equals(r2)     // Catch:{ all -> 0x0195 }
            if (r2 != 0) goto L_0x019f
            java.lang.String r2 = "en_US"
            boolean r2 = r0.equals(r2)     // Catch:{ all -> 0x0195 }
            if (r2 == 0) goto L_0x001f
            goto L_0x019f
        L_0x001f:
            java.util.Set r2 = f13252l     // Catch:{ all -> 0x0195 }
            if (r2 != 0) goto L_0x0197
            java.lang.String r3 = "af"
            java.lang.String r4 = "af_ZA"
            java.lang.String r5 = "am"
            java.lang.String r6 = "am_ET"
            java.lang.String r7 = "ar"
            java.lang.String r8 = "ar_001"
            java.lang.String r9 = "as"
            java.lang.String r10 = "as_IN"
            java.lang.String r11 = "az"
            java.lang.String r12 = "az_AZ"
            java.lang.String r13 = "be"
            java.lang.String r14 = "be_BY"
            java.lang.String r15 = "bg"
            java.lang.String r16 = "bg_BG"
            java.lang.String r17 = "bn"
            java.lang.String r18 = "bn_IN"
            java.lang.String r19 = "bs"
            java.lang.String r20 = "bs_BA"
            java.lang.String r21 = "ca"
            java.lang.String r22 = "ca_ES"
            java.lang.String r23 = "cs"
            java.lang.String r24 = "cs_CZ"
            java.lang.String r25 = "cy"
            java.lang.String r26 = "cy_GB"
            java.lang.String r27 = "da"
            java.lang.String r28 = "da_DK"
            java.lang.String r29 = "de"
            java.lang.String r30 = "de_DE"
            java.lang.String r31 = "el"
            java.lang.String r32 = "el_GR"
            java.lang.String r33 = "en"
            java.lang.String r34 = "en_GB"
            java.lang.String r35 = "en_US"
            java.lang.String r36 = "es"
            java.lang.String r37 = "es_419"
            java.lang.String r38 = "es_ES"
            java.lang.String r39 = "et"
            java.lang.String r40 = "et_EE"
            java.lang.String r41 = "eu"
            java.lang.String r42 = "eu_ES"
            java.lang.String r43 = "fa"
            java.lang.String r44 = "fa_IR"
            java.lang.String r45 = "fi"
            java.lang.String r46 = "fi_FI"
            java.lang.String r47 = "fil"
            java.lang.String r48 = "fil_PH"
            java.lang.String r49 = "fr"
            java.lang.String r50 = "fr_FR"
            java.lang.String r51 = "ga"
            java.lang.String r52 = "ga_IE"
            java.lang.String r53 = "gl"
            java.lang.String r54 = "gl_ES"
            java.lang.String r55 = "gu"
            java.lang.String r56 = "gu_IN"
            java.lang.String r57 = "he"
            java.lang.String r58 = "he_IL"
            java.lang.String r59 = "hi"
            java.lang.String r60 = "hi_IN"
            java.lang.String r61 = "hr"
            java.lang.String r62 = "hr_HR"
            java.lang.String r63 = "hu"
            java.lang.String r64 = "hu_HU"
            java.lang.String r65 = "hy"
            java.lang.String r66 = "hy_AM"
            java.lang.String r67 = "id"
            java.lang.String r68 = "id_ID"
            java.lang.String r69 = "is"
            java.lang.String r70 = "is_IS"
            java.lang.String r71 = "it"
            java.lang.String r72 = "it_IT"
            java.lang.String r73 = "ja"
            java.lang.String r74 = "ja_JP"
            java.lang.String r75 = "jv"
            java.lang.String r76 = "jv_ID"
            java.lang.String r77 = "ka"
            java.lang.String r78 = "ka_GE"
            java.lang.String r79 = "kk"
            java.lang.String r80 = "kk_KZ"
            java.lang.String r81 = "km"
            java.lang.String r82 = "km_KH"
            java.lang.String r83 = "kn"
            java.lang.String r84 = "kn_IN"
            java.lang.String r85 = "ko"
            java.lang.String r86 = "ko_KR"
            java.lang.String r87 = "ky"
            java.lang.String r88 = "ky_KG"
            java.lang.String r89 = "lo"
            java.lang.String r90 = "lo_LA"
            java.lang.String r91 = "lt"
            java.lang.String r92 = "lt_LT"
            java.lang.String r93 = "lv"
            java.lang.String r94 = "lv_LV"
            java.lang.String r95 = "mk"
            java.lang.String r96 = "mk_MK"
            java.lang.String r97 = "ml"
            java.lang.String r98 = "ml_IN"
            java.lang.String r99 = "mn"
            java.lang.String r100 = "mn_MN"
            java.lang.String r101 = "mr"
            java.lang.String r102 = "mr_IN"
            java.lang.String r103 = "ms"
            java.lang.String r104 = "ms_MY"
            java.lang.String r105 = "my"
            java.lang.String r106 = "my_MM"
            java.lang.String r107 = "nb"
            java.lang.String r108 = "nb_NO"
            java.lang.String r109 = "ne"
            java.lang.String r110 = "ne_NP"
            java.lang.String r111 = "nl"
            java.lang.String r112 = "nl_NL"
            java.lang.String r113 = "no"
            java.lang.String r114 = "or"
            java.lang.String r115 = "or_IN"
            java.lang.String r116 = "pa"
            java.lang.String r117 = "pa_IN"
            java.lang.String r118 = "pl"
            java.lang.String r119 = "pl_PL"
            java.lang.String r120 = "ps"
            java.lang.String r121 = "ps_AF"
            java.lang.String r122 = "pt"
            java.lang.String r123 = "pt_BR"
            java.lang.String r124 = "pt_PT"
            java.lang.String r125 = "ro"
            java.lang.String r126 = "ro_RO"
            java.lang.String r127 = "ru"
            java.lang.String r128 = "ru_RU"
            java.lang.String r129 = "sd"
            java.lang.String r130 = "sd_IN"
            java.lang.String r131 = "si"
            java.lang.String r132 = "si_LK"
            java.lang.String r133 = "sk"
            java.lang.String r134 = "sk_SK"
            java.lang.String r135 = "sl"
            java.lang.String r136 = "sl_SI"
            java.lang.String r137 = "so"
            java.lang.String r138 = "so_SO"
            java.lang.String r139 = "sq"
            java.lang.String r140 = "sq_AL"
            java.lang.String r141 = "sr"
            java.lang.String r142 = "sr_Cyrl_RS"
            java.lang.String r143 = "sr_Latn"
            java.lang.String r144 = "sr_RS"
            java.lang.String r145 = "sv"
            java.lang.String r146 = "sv_SE"
            java.lang.String r147 = "sw"
            java.lang.String r148 = "sw_TZ"
            java.lang.String r149 = "ta"
            java.lang.String r150 = "ta_IN"
            java.lang.String r151 = "te"
            java.lang.String r152 = "te_IN"
            java.lang.String r153 = "th"
            java.lang.String r154 = "th_TH"
            java.lang.String r155 = "tk"
            java.lang.String r156 = "tk_TM"
            java.lang.String r157 = "tr"
            java.lang.String r158 = "tr_TR"
            java.lang.String r159 = "uk"
            java.lang.String r160 = "uk_UA"
            java.lang.String r161 = "ur"
            java.lang.String r162 = "ur_PK"
            java.lang.String r163 = "uz"
            java.lang.String r164 = "uz_UZ"
            java.lang.String r165 = "vi"
            java.lang.String r166 = "vi_VN"
            java.lang.String r167 = "yue"
            java.lang.String r168 = "yue_Hant"
            java.lang.String r169 = "yue_Hant_HK"
            java.lang.String r170 = "yue_HK"
            java.lang.String r171 = "zh"
            java.lang.String r172 = "zh_CN"
            java.lang.String r173 = "zh_Hans"
            java.lang.String r174 = "zh_Hans_CN"
            java.lang.String r175 = "zh_Hant"
            java.lang.String r176 = "zh_Hant_TW"
            java.lang.String r177 = "zh_TW"
            java.lang.String r178 = "zu"
            java.lang.String r179 = "zu_ZA"
            java.lang.String[] r2 = new java.lang.String[]{r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111, r112, r113, r114, r115, r116, r117, r118, r119, r120, r121, r122, r123, r124, r125, r126, r127, r128, r129, r130, r131, r132, r133, r134, r135, r136, r137, r138, r139, r140, r141, r142, r143, r144, r145, r146, r147, r148, r149, r150, r151, r152, r153, r154, r155, r156, r157, r158, r159, r160, r161, r162, r163, r164, r165, r166, r167, r168, r169, r170, r171, r172, r173, r174, r175, r176, r177, r178, r179}     // Catch:{ all -> 0x0195 }
            java.util.List r2 = java.util.Arrays.asList(r2)     // Catch:{ all -> 0x0195 }
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x0195 }
            r3.<init>(r2)     // Catch:{ all -> 0x0195 }
            f13252l = r3     // Catch:{ all -> 0x0195 }
            goto L_0x0197
        L_0x0195:
            r0 = move-exception
            goto L_0x01a2
        L_0x0197:
            java.util.Set r2 = f13252l     // Catch:{ all -> 0x0195 }
            boolean r0 = r2.contains(r0)     // Catch:{ all -> 0x0195 }
            monitor-exit(r1)
            return r0
        L_0x019f:
            monitor-exit(r1)
            r0 = 1
            return r0
        L_0x01a2:
            monitor-exit(r1)     // Catch:{ all -> 0x0195 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.util.ULocale.s(java.lang.String):boolean");
    }

    public static synchronized void setDefault(ULocale uLocale) {
        synchronized (ULocale.class) {
            Locale locale = uLocale.toLocale();
            f13248h = locale;
            Locale.setDefault(locale);
            f13249i = uLocale;
            for (Category category : Category.values()) {
                setDefault(category, uLocale);
            }
        }
    }

    private static String t(String str) {
        try {
            return UResourceBundle.f("com/ibm/icu/impl/data/icudt71b", "likelySubtags").getString(str);
        } catch (MissingResourceException unused) {
            return null;
        }
    }

    public static String toLegacyKey(String str) {
        String f4 = KeyTypeData.f(str);
        if (f4 != null || !str.matches("[0-9a-zA-Z]+")) {
            return f4;
        }
        return com.ibm.icu.impl.locale.a.j(str);
    }

    public static String toLegacyType(String str, String str2) {
        String g4 = KeyTypeData.g(str, str2, (e) null, (e) null);
        if (g4 != null || !str2.matches("[0-9a-zA-Z]+([_/\\-][0-9a-zA-Z]+)*")) {
            return g4;
        }
        return com.ibm.icu.impl.locale.a.j(str2);
    }

    public static String toUnicodeLocaleKey(String str) {
        String d4 = KeyTypeData.d(str);
        if (d4 != null || !l.g(str)) {
            return d4;
        }
        return com.ibm.icu.impl.locale.a.j(str);
    }

    public static String toUnicodeLocaleType(String str, String str2) {
        String e4 = KeyTypeData.e(str, str2, (e) null, (e) null);
        if (e4 != null || !l.i(str2)) {
            return e4;
        }
        return com.ibm.icu.impl.locale.a.j(str2);
    }

    /* access modifiers changed from: private */
    public static String u(String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        if (str != null && str.length() > 0) {
            sb.append(str);
        }
        if (str2 != null && str2.length() > 0) {
            sb.append('_');
            sb.append(str2);
        }
        if (str3 != null && str3.length() > 0) {
            sb.append('_');
            sb.append(str3);
        }
        if (str4 != null && str4.length() > 0) {
            if (str3 == null || str3.length() == 0) {
                sb.append('_');
            }
            sb.append('_');
            sb.append(str4);
        }
        return sb.toString();
    }

    private static int v(String str, String[] strArr) {
        m mVar = new m(str);
        String l4 = mVar.l();
        String n4 = mVar.n();
        String f4 = mVar.f();
        if (r(l4)) {
            strArr[0] = "und";
        } else {
            strArr[0] = l4;
        }
        if (n4.equals("Zzzz")) {
            strArr[1] = "";
        } else {
            strArr[1] = n4;
        }
        if (f4.equals("ZZ")) {
            strArr[2] = "";
        } else {
            strArr[2] = f4;
        }
        String q4 = mVar.q();
        if (!r(q4)) {
            int indexOf = str.indexOf(q4);
            if (indexOf > 0) {
                return indexOf - 1;
            }
            return indexOf;
        }
        int indexOf2 = str.indexOf(64);
        if (indexOf2 == -1) {
            return str.length();
        }
        return indexOf2;
    }

    private static String w(String str) {
        int length = str.length();
        if (length < 3 || !str.regionMatches(true, 0, "und", 0, 3)) {
            return str;
        }
        if (length == 3) {
            return "";
        }
        char charAt = str.charAt(3);
        if (charAt == '-' || charAt == '_') {
            return str.substring(3);
        }
        return str;
    }

    public Object clone() {
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ULocale) {
            return this.localeID.equals(((ULocale) obj).localeID);
        }
        return false;
    }

    public String getBaseName() {
        return getBaseName(this.localeID);
    }

    public String getCharacterOrientation() {
        return com.ibm.icu.impl.h.b("com/ibm/icu/impl/data/icudt71b", this, "layout", "characters", "characters");
    }

    public String getCountry() {
        return b().c();
    }

    public String getDisplayCountry() {
        return f(this, getDefault(Category.DISPLAY));
    }

    public String getDisplayKeywordValue(String str) {
        return h(this, str, getDefault(Category.DISPLAY));
    }

    public String getDisplayLanguage() {
        return i(this, getDefault(Category.DISPLAY), false);
    }

    public String getDisplayLanguageWithDialect() {
        return i(this, getDefault(Category.DISPLAY), true);
    }

    public String getDisplayName() {
        return j(this, getDefault(Category.DISPLAY));
    }

    public String getDisplayNameWithDialect() {
        return k(this, getDefault(Category.DISPLAY));
    }

    public String getDisplayScript() {
        return m(this, getDefault(Category.DISPLAY));
    }

    @Deprecated
    public String getDisplayScriptInContext() {
        return l(this, getDefault(Category.DISPLAY));
    }

    public String getDisplayVariant() {
        return n(this, getDefault(Category.DISPLAY));
    }

    public String getExtension(char c4) {
        if (h.g(c4)) {
            return e().b(Character.valueOf(c4));
        }
        throw new IllegalArgumentException("Invalid extension key: " + c4);
    }

    public Set<Character> getExtensionKeys() {
        return e().c();
    }

    public String getISO3Country() {
        return getISO3Country(this.localeID);
    }

    public String getISO3Language() {
        return getISO3Language(this.localeID);
    }

    public String getKeywordValue(String str) {
        return getKeywordValue(this.localeID, str);
    }

    public Iterator<String> getKeywords() {
        return getKeywords(this.localeID);
    }

    public String getLanguage() {
        return b().b();
    }

    public String getLineOrientation() {
        return com.ibm.icu.impl.h.b("com/ibm/icu/impl/data/icudt71b", this, "layout", "lines", "lines");
    }

    public String getName() {
        return this.localeID;
    }

    public String getScript() {
        return b().d();
    }

    public Set<String> getUnicodeLocaleAttributes() {
        return e().d();
    }

    public Set<String> getUnicodeLocaleKeys() {
        return e().e();
    }

    public String getUnicodeLocaleType(String str) {
        if (h.h(str)) {
            return e().f(str);
        }
        throw new IllegalArgumentException("Invalid Unicode locale key: " + str);
    }

    public String getVariant() {
        return b().e();
    }

    public int hashCode() {
        return this.localeID.hashCode();
    }

    public boolean isRightToLeft() {
        int indexOf;
        String script = getScript();
        if (script.length() == 0) {
            String language = getLanguage();
            if (!language.isEmpty() && (indexOf = "root-en-es-pt-zh-ja-ko-de-fr-it-ar+he+fa+ru-nl-pl-th-tr-".indexOf(language)) >= 0) {
                char charAt = "root-en-es-pt-zh-ja-ko-de-fr-it-ar+he+fa+ru-nl-pl-th-tr-".charAt(indexOf + language.length());
                if (charAt == '+') {
                    return true;
                }
                if (charAt == '-') {
                    return false;
                }
            }
            script = addLikelySubtags(this).getScript();
            if (script.length() == 0) {
                return false;
            }
        }
        return UScript.e(UScript.a(script));
    }

    public ULocale setKeywordValue(String str, String str2) {
        return new ULocale(setKeywordValue(this.localeID, str, str2), (Locale) null);
    }

    public String toLanguageTag() {
        com.ibm.icu.impl.locale.b b4 = b();
        h e4 = e();
        if (b4.e().equalsIgnoreCase("POSIX")) {
            b4 = com.ibm.icu.impl.locale.b.a(b4.b(), b4.d(), b4.c(), "");
            if (e4.f("va") == null) {
                com.ibm.icu.impl.locale.d dVar = new com.ibm.icu.impl.locale.d();
                try {
                    dVar.k(com.ibm.icu.impl.locale.b.f12834g, e4);
                    dVar.m("va", "posix");
                    e4 = dVar.f();
                } catch (LocaleSyntaxException e5) {
                    throw new RuntimeException(e5);
                }
            }
        }
        com.ibm.icu.impl.locale.f D3 = com.ibm.icu.impl.locale.f.D(b4, e4);
        StringBuilder sb = new StringBuilder();
        String i4 = D3.i();
        if (i4.length() > 0) {
            sb.append(com.ibm.icu.impl.locale.f.b(i4));
        }
        String l4 = D3.l();
        if (l4.length() > 0) {
            sb.append("-");
            sb.append(com.ibm.icu.impl.locale.f.e(l4));
        }
        String k4 = D3.k();
        if (k4.length() > 0) {
            sb.append("-");
            sb.append(com.ibm.icu.impl.locale.f.d(k4));
        }
        ArrayList arrayList = new ArrayList(D3.m());
        Collections.sort(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append("-");
            sb.append(com.ibm.icu.impl.locale.f.f((String) it.next()));
        }
        for (String a4 : D3.g()) {
            sb.append("-");
            sb.append(com.ibm.icu.impl.locale.f.a(a4));
        }
        String j4 = D3.j();
        if (j4.length() > 0) {
            if (sb.length() == 0) {
                sb.append("und");
            }
            sb.append("-");
            sb.append("x");
            sb.append("-");
            sb.append(com.ibm.icu.impl.locale.f.c(j4));
        }
        return sb.toString();
    }

    public Locale toLocale() {
        if (this.f13253a == null) {
            this.f13253a = e.d(this);
        }
        return this.f13253a;
    }

    public String toString() {
        return this.localeID;
    }

    private ULocale(String str, Locale locale) {
        this.localeID = str;
        this.f13253a = locale;
    }

    public static ULocale createCanonical(ULocale uLocale) {
        return createCanonical(uLocale.getName());
    }

    public static String getBaseName(String str) {
        if (str.indexOf(64) == -1) {
            return str;
        }
        return new m(str).e();
    }

    public static String getCountry(String str) {
        return new m(str).f();
    }

    public static String getDisplayKeyword(String str, String str2) {
        return g(str, new ULocale(str2));
    }

    public static String getISO3Country(String str) {
        return n.d(getCountry(str));
    }

    public static String getISO3Language(String str) {
        return n.e(getLanguage(str));
    }

    public static String getKeywordValue(String str, String str2) {
        return new m(str).j(str2);
    }

    public static Iterator<String> getKeywords(String str) {
        return new m(str).k();
    }

    public static String getLanguage(String str) {
        return new m(str).l();
    }

    public static String getName(String str) {
        if (str != null && !str.contains("@") && q(str) == 1) {
            String name = forLanguageTag((str.indexOf(95) < 0 || str.charAt(1) == '_' || str.charAt(1) == '-') ? str : str.replace('_', '-')).getName();
            if (name.length() != 0) {
                str = name;
            }
        } else if ("root".equalsIgnoreCase(str)) {
            str = "";
        } else {
            str = w(str);
        }
        return (String) f13244d.b(str, (Object) null);
    }

    public static String getScript(String str) {
        return new m(str).n();
    }

    public static String getVariant(String str) {
        return new m(str).q();
    }

    @Deprecated
    public static ULocale minimizeSubtags(ULocale uLocale, Minimize minimize) {
        String[] strArr = new String[3];
        int v3 = v(uLocale.localeID, strArr);
        String str = strArr[0];
        String str2 = strArr[1];
        String str3 = strArr[2];
        String substring = v3 < uLocale.localeID.length() ? uLocale.localeID.substring(v3) : null;
        String c4 = c(str, str2, str3, (String) null);
        if (r(c4)) {
            return uLocale;
        }
        if (c(str, (String) null, (String) null, (String) null).equals(c4)) {
            return new ULocale(createTagString(str, (String) null, (String) null, substring));
        }
        if (minimize == Minimize.FAVOR_REGION) {
            if (str3.length() != 0 && c(str, (String) null, str3, (String) null).equals(c4)) {
                return new ULocale(createTagString(str, (String) null, str3, substring));
            }
            if (str2.length() != 0 && c(str, str2, (String) null, (String) null).equals(c4)) {
                return new ULocale(createTagString(str, str2, (String) null, substring));
            }
        } else if (str2.length() != 0 && c(str, str2, (String) null, (String) null).equals(c4)) {
            return new ULocale(createTagString(str, str2, (String) null, substring));
        } else {
            if (str3.length() != 0 && c(str, (String) null, str3, (String) null).equals(c4)) {
                return new ULocale(createTagString(str, (String) null, str3, substring));
            }
        }
        return uLocale;
    }

    public static String setKeywordValue(String str, String str2, String str3) {
        m mVar = new m(str);
        mVar.H(str2, str3);
        return mVar.m();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0093, code lost:
        if (r5.hasNext() != false) goto L_0x0095;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(com.ibm.icu.util.ULocale r9) {
        /*
            r8 = this;
            r0 = 0
            if (r8 != r9) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = r8.getLanguage()
            java.lang.String r2 = r9.getLanguage()
            int r1 = r1.compareTo(r2)
            r2 = 1
            r3 = -1
            if (r1 != 0) goto L_0x0096
            java.lang.String r1 = r8.getScript()
            java.lang.String r4 = r9.getScript()
            int r1 = r1.compareTo(r4)
            if (r1 != 0) goto L_0x0096
            java.lang.String r1 = r8.getCountry()
            java.lang.String r4 = r9.getCountry()
            int r1 = r1.compareTo(r4)
            if (r1 != 0) goto L_0x0096
            java.lang.String r1 = r8.getVariant()
            java.lang.String r4 = r9.getVariant()
            int r1 = r1.compareTo(r4)
            if (r1 != 0) goto L_0x0096
            java.util.Iterator r4 = r8.getKeywords()
            java.util.Iterator r5 = r9.getKeywords()
            if (r4 != 0) goto L_0x004c
            if (r5 != 0) goto L_0x0095
            r1 = r0
            goto L_0x0096
        L_0x004c:
            if (r5 != 0) goto L_0x0050
            r1 = r2
            goto L_0x0096
        L_0x0050:
            if (r1 != 0) goto L_0x008d
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x008d
            boolean r1 = r5.hasNext()
            if (r1 != 0) goto L_0x0060
            r1 = r2
            goto L_0x008d
        L_0x0060:
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            int r7 = r1.compareTo(r6)
            if (r7 != 0) goto L_0x008b
            java.lang.String r1 = r8.getKeywordValue(r1)
            java.lang.String r6 = r9.getKeywordValue(r6)
            if (r1 != 0) goto L_0x0082
            if (r6 != 0) goto L_0x0080
            r1 = r0
            goto L_0x0050
        L_0x0080:
            r1 = r3
            goto L_0x0050
        L_0x0082:
            if (r6 != 0) goto L_0x0086
            r1 = r2
            goto L_0x0050
        L_0x0086:
            int r1 = r1.compareTo(r6)
            goto L_0x0050
        L_0x008b:
            r1 = r7
            goto L_0x0050
        L_0x008d:
            if (r1 != 0) goto L_0x0096
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x0096
        L_0x0095:
            r1 = r3
        L_0x0096:
            if (r1 >= 0) goto L_0x009a
            r0 = r3
            goto L_0x009d
        L_0x009a:
            if (r1 <= 0) goto L_0x009d
            r0 = r2
        L_0x009d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.util.ULocale.compareTo(com.ibm.icu.util.ULocale):int");
    }

    public String getDisplayCountry(ULocale uLocale) {
        return f(this, uLocale);
    }

    public String getDisplayKeywordValue(String str, ULocale uLocale) {
        return h(this, str, uLocale);
    }

    public String getDisplayLanguage(ULocale uLocale) {
        return i(this, uLocale, false);
    }

    public String getDisplayLanguageWithDialect(ULocale uLocale) {
        return i(this, uLocale, true);
    }

    public String getDisplayName(ULocale uLocale) {
        return j(this, uLocale);
    }

    public String getDisplayNameWithDialect(ULocale uLocale) {
        return k(this, uLocale);
    }

    public String getDisplayScript(ULocale uLocale) {
        return m(this, uLocale);
    }

    @Deprecated
    public String getDisplayScriptInContext(ULocale uLocale) {
        return l(this, uLocale);
    }

    public String getDisplayVariant(ULocale uLocale) {
        return n(this, uLocale);
    }

    public ULocale getFallback() {
        if (this.localeID.length() == 0 || this.localeID.charAt(0) == '@') {
            return null;
        }
        return new ULocale(o(this.localeID), (Locale) null);
    }

    public static String getDisplayCountry(String str, String str2) {
        return f(new ULocale(str), new ULocale(str2));
    }

    public static String getDisplayKeyword(String str, ULocale uLocale) {
        return g(str, uLocale);
    }

    public static String getDisplayKeywordValue(String str, String str2, String str3) {
        return h(new ULocale(str), str2, new ULocale(str3));
    }

    public static String getDisplayLanguage(String str, String str2) {
        return i(new ULocale(str), new ULocale(str2), false);
    }

    public static String getDisplayLanguageWithDialect(String str, String str2) {
        return i(new ULocale(str), new ULocale(str2), true);
    }

    public static String getDisplayName(String str, String str2) {
        return j(new ULocale(str), new ULocale(str2));
    }

    public static String getDisplayNameWithDialect(String str, String str2) {
        return k(new ULocale(str), new ULocale(str2));
    }

    public static String getDisplayScript(String str, String str2) {
        return m(new ULocale(str), new ULocale(str2));
    }

    @Deprecated
    public static String getDisplayScriptInContext(String str, String str2) {
        return l(new ULocale(str), new ULocale(str2));
    }

    public static String getDisplayVariant(String str, String str2) {
        return n(new ULocale(str), new ULocale(str2));
    }

    public static String getDisplayCountry(String str, ULocale uLocale) {
        return f(new ULocale(str), uLocale);
    }

    public static String getDisplayKeywordValue(String str, String str2, ULocale uLocale) {
        return h(new ULocale(str), str2, uLocale);
    }

    public static String getDisplayLanguage(String str, ULocale uLocale) {
        return i(new ULocale(str), uLocale, false);
    }

    public static String getDisplayLanguageWithDialect(String str, ULocale uLocale) {
        return i(new ULocale(str), uLocale, true);
    }

    public static String getDisplayName(String str, ULocale uLocale) {
        return j(new ULocale(str), uLocale);
    }

    public static String getDisplayNameWithDialect(String str, ULocale uLocale) {
        return k(new ULocale(str), uLocale);
    }

    public static String getDisplayScript(String str, ULocale uLocale) {
        return m(new ULocale(str), uLocale);
    }

    @Deprecated
    public static String getDisplayScriptInContext(String str, ULocale uLocale) {
        return l(new ULocale(str), uLocale);
    }

    public static String getDisplayVariant(String str, ULocale uLocale) {
        return n(new ULocale(str), uLocale);
    }

    public ULocale(String str) {
        this.localeID = getName(str);
    }

    public ULocale(String str, String str2) {
        this(str, str2, (String) null);
    }

    public static synchronized void setDefault(Category category, ULocale uLocale) {
        synchronized (ULocale.class) {
            Locale locale = uLocale.toLocale();
            int ordinal = category.ordinal();
            f13251k[ordinal] = uLocale;
            f13250j[ordinal] = locale;
            e.c(category, locale);
        }
    }

    public ULocale(String str, String str2, String str3) {
        this.localeID = getName(u(str, str2, str3, ""));
    }

    public static ULocale acceptLanguage(ULocale[] uLocaleArr, ULocale[] uLocaleArr2, boolean[] zArr) {
        LocaleMatcher.d dVar;
        if (zArr != null) {
            zArr[0] = true;
        }
        LocaleMatcher.b b4 = LocaleMatcher.b();
        for (ULocale j4 : uLocaleArr2) {
            b4.j(j4);
        }
        LocaleMatcher k4 = b4.k();
        if (uLocaleArr.length == 1) {
            dVar = k4.d(uLocaleArr[0]);
        } else {
            dVar = k4.e(Arrays.asList(uLocaleArr));
        }
        if (dVar.a() < 0) {
            return null;
        }
        if (zArr != null && dVar.b().equals(dVar.c())) {
            zArr[0] = false;
        }
        return dVar.c();
    }

    public static ULocale getDefault(Category category) {
        synchronized (ULocale.class) {
            try {
                int ordinal = category.ordinal();
                if (f13251k[ordinal] == null) {
                    ULocale uLocale = ROOT;
                    return uLocale;
                }
                if (e.b()) {
                    Locale a4 = e.a(category);
                    if (!f13250j[ordinal].equals(a4)) {
                        f13250j[ordinal] = a4;
                        f13251k[ordinal] = forLocale(a4);
                    }
                } else {
                    Locale locale = Locale.getDefault();
                    if (!f13248h.equals(locale)) {
                        f13248h = locale;
                        f13249i = forLocale(locale);
                        for (Category ordinal2 : Category.values()) {
                            int ordinal3 = ordinal2.ordinal();
                            f13250j[ordinal3] = locale;
                            f13251k[ordinal3] = forLocale(locale);
                        }
                    }
                }
                ULocale uLocale2 = f13251k[ordinal];
                return uLocale2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ULocale acceptLanguage(String str, boolean[] zArr) {
        return acceptLanguage(str, getAvailableLocales(), zArr);
    }

    public static ULocale acceptLanguage(ULocale[] uLocaleArr, boolean[] zArr) {
        return acceptLanguage(uLocaleArr, getAvailableLocales(), zArr);
    }
}
