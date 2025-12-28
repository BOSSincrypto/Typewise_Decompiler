package com.ibm.icu.impl.locale;

import com.ibm.icu.util.ULocale;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class l extends c {

    /* renamed from: e  reason: collision with root package name */
    private static final SortedSet f12904e = new TreeSet();

    /* renamed from: f  reason: collision with root package name */
    private static final SortedMap f12905f = new TreeMap();

    /* renamed from: g  reason: collision with root package name */
    public static final l f12906g;

    /* renamed from: h  reason: collision with root package name */
    public static final l f12907h;

    /* renamed from: c  reason: collision with root package name */
    private SortedSet f12908c;

    /* renamed from: d  reason: collision with root package name */
    private SortedMap f12909d;

    static {
        l lVar = new l();
        f12906g = lVar;
        TreeMap treeMap = new TreeMap();
        lVar.f12909d = treeMap;
        treeMap.put("ca", "japanese");
        lVar.f12846b = "ca-japanese";
        l lVar2 = new l();
        f12907h = lVar2;
        TreeMap treeMap2 = new TreeMap();
        lVar2.f12909d = treeMap2;
        treeMap2.put("nu", "thai");
        lVar2.f12846b = "nu-thai";
    }

    private l() {
        super(ULocale.UNICODE_LOCALE_EXTENSION);
        this.f12908c = f12904e;
        this.f12909d = f12905f;
    }

    public static boolean f(String str) {
        if (str.length() < 3 || str.length() > 8 || !a.e(str)) {
            return false;
        }
        return true;
    }

    public static boolean g(String str) {
        if (str.length() != 2 || !a.d(str.charAt(0)) || !a.c(str.charAt(1))) {
            return false;
        }
        return true;
    }

    public static boolean h(char c4) {
        if ('u' == a.i(c4)) {
            return true;
        }
        return false;
    }

    public static boolean i(String str) {
        String str2;
        int i4 = 0;
        while (true) {
            int indexOf = str.indexOf("-", i4);
            if (indexOf < 0) {
                str2 = str.substring(i4);
            } else {
                str2 = str.substring(i4, indexOf);
            }
            if (!j(str2)) {
                return false;
            }
            if (indexOf >= 0) {
                i4 = indexOf + 1;
            } else if (i4 < str.length()) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static boolean j(String str) {
        if (str.length() < 3 || str.length() > 8 || !a.e(str)) {
            return false;
        }
        return true;
    }

    public Set c() {
        return Collections.unmodifiableSet(this.f12908c);
    }

    public Set d() {
        return Collections.unmodifiableSet(this.f12909d.keySet());
    }

    public String e(String str) {
        return (String) this.f12909d.get(str);
    }

    l(SortedSet sortedSet, SortedMap sortedMap) {
        this();
        if (sortedSet != null && sortedSet.size() > 0) {
            this.f12908c = sortedSet;
        }
        if (sortedMap != null && sortedMap.size() > 0) {
            this.f12909d = sortedMap;
        }
        if (this.f12908c.size() > 0 || this.f12909d.size() > 0) {
            StringBuilder sb = new StringBuilder();
            for (String append : this.f12908c) {
                sb.append("-");
                sb.append(append);
            }
            for (Map.Entry entry : this.f12909d.entrySet()) {
                String str = (String) entry.getValue();
                sb.append("-");
                sb.append((String) entry.getKey());
                if (str.length() > 0) {
                    sb.append("-");
                    sb.append(str);
                }
            }
            this.f12846b = sb.substring(1);
        }
    }
}
