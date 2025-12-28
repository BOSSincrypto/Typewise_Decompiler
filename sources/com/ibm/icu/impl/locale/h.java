package com.ibm.icu.impl.locale;

import com.ibm.icu.impl.locale.d;
import com.ibm.icu.util.ULocale;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class h {

    /* renamed from: c  reason: collision with root package name */
    private static final SortedMap f12886c;

    /* renamed from: d  reason: collision with root package name */
    public static final h f12887d;

    /* renamed from: e  reason: collision with root package name */
    public static final h f12888e;

    /* renamed from: f  reason: collision with root package name */
    public static final h f12889f;

    /* renamed from: a  reason: collision with root package name */
    private SortedMap f12890a;

    /* renamed from: b  reason: collision with root package name */
    private String f12891b;

    static {
        SortedMap unmodifiableSortedMap = Collections.unmodifiableSortedMap(new TreeMap());
        f12886c = unmodifiableSortedMap;
        h hVar = new h();
        f12887d = hVar;
        hVar.f12891b = "";
        hVar.f12890a = unmodifiableSortedMap;
        h hVar2 = new h();
        f12888e = hVar2;
        hVar2.f12891b = "u-ca-japanese";
        TreeMap treeMap = new TreeMap();
        hVar2.f12890a = treeMap;
        treeMap.put(Character.valueOf(ULocale.UNICODE_LOCALE_EXTENSION), l.f12906g);
        h hVar3 = new h();
        f12889f = hVar3;
        hVar3.f12891b = "u-nu-thai";
        TreeMap treeMap2 = new TreeMap();
        hVar3.f12890a = treeMap2;
        treeMap2.put(Character.valueOf(ULocale.UNICODE_LOCALE_EXTENSION), l.f12907h);
    }

    private h() {
    }

    public static boolean g(char c4) {
        if (f.o(c4) || f.t(c4)) {
            return true;
        }
        return false;
    }

    public static boolean h(String str) {
        return l.g(str);
    }

    private static String i(SortedMap sortedMap) {
        StringBuilder sb = new StringBuilder();
        c cVar = null;
        for (Map.Entry entry : sortedMap.entrySet()) {
            char charValue = ((Character) entry.getKey()).charValue();
            c cVar2 = (c) entry.getValue();
            if (f.t(charValue)) {
                cVar = cVar2;
            } else {
                if (sb.length() > 0) {
                    sb.append("-");
                }
                sb.append(cVar2);
            }
        }
        if (cVar != null) {
            if (sb.length() > 0) {
                sb.append("-");
            }
            sb.append(cVar);
        }
        return sb.toString();
    }

    public c a(Character ch2) {
        return (c) this.f12890a.get(Character.valueOf(a.i(ch2.charValue())));
    }

    public String b(Character ch2) {
        c cVar = (c) this.f12890a.get(Character.valueOf(a.i(ch2.charValue())));
        if (cVar == null) {
            return null;
        }
        return cVar.b();
    }

    public Set c() {
        return Collections.unmodifiableSet(this.f12890a.keySet());
    }

    public Set d() {
        c cVar = (c) this.f12890a.get(Character.valueOf(ULocale.UNICODE_LOCALE_EXTENSION));
        if (cVar == null) {
            return Collections.emptySet();
        }
        return ((l) cVar).c();
    }

    public Set e() {
        c cVar = (c) this.f12890a.get(Character.valueOf(ULocale.UNICODE_LOCALE_EXTENSION));
        if (cVar == null) {
            return Collections.emptySet();
        }
        return ((l) cVar).d();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        return this.f12891b.equals(((h) obj).f12891b);
    }

    public String f(String str) {
        c cVar = (c) this.f12890a.get(Character.valueOf(ULocale.UNICODE_LOCALE_EXTENSION));
        if (cVar == null) {
            return null;
        }
        return ((l) cVar).e(a.j(str));
    }

    public int hashCode() {
        return this.f12891b.hashCode();
    }

    public String toString() {
        return this.f12891b;
    }

    h(Map map, Set set, Map map2) {
        TreeSet treeSet;
        boolean z3 = false;
        boolean z4 = map != null && map.size() > 0;
        boolean z5 = set != null && set.size() > 0;
        if (map2 != null && map2.size() > 0) {
            z3 = true;
        }
        if (z4 || z5 || z3) {
            this.f12890a = new TreeMap();
            if (z4) {
                for (Map.Entry entry : map.entrySet()) {
                    char i4 = a.i(((d.a) entry.getKey()).a());
                    String str = (String) entry.getValue();
                    if (!f.t(i4) || (str = d.g(str)) != null) {
                        this.f12890a.put(Character.valueOf(i4), new c(i4, a.j(str)));
                    }
                }
            }
            if (z5 || z3) {
                TreeMap treeMap = null;
                if (z5) {
                    treeSet = new TreeSet();
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        treeSet.add(a.j(((d.b) it.next()).a()));
                    }
                } else {
                    treeSet = null;
                }
                if (z3) {
                    treeMap = new TreeMap();
                    for (Map.Entry entry2 : map2.entrySet()) {
                        treeMap.put(a.j(((d.b) entry2.getKey()).a()), a.j((String) entry2.getValue()));
                    }
                }
                this.f12890a.put(Character.valueOf(ULocale.UNICODE_LOCALE_EXTENSION), new l(treeSet, treeMap));
            }
            if (this.f12890a.size() == 0) {
                this.f12890a = f12886c;
                this.f12891b = "";
                return;
            }
            this.f12891b = i(this.f12890a);
            return;
        }
        this.f12890a = f12886c;
        this.f12891b = "";
    }
}
