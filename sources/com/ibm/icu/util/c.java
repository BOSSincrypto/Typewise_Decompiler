package com.ibm.icu.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class c implements Iterable {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final Double f13299b = Double.valueOf(1.0d);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f13300c = Pattern.compile("\\s*,\\s*");
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f13301d = Pattern.compile("\\s*(\\S*)\\s*;\\s*q\\s*=\\s*(\\S*)");
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static Comparator f13302e = new a();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Map f13303a;

    static class a implements Comparator {
        a() {
        }

        /* renamed from: a */
        public int compare(Double d4, Double d5) {
            int compareTo = d4.compareTo(d5);
            if (compareTo > 0) {
                return -1;
            }
            if (compareTo < 0) {
                return 1;
            }
            return 0;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private Map f13304a;

        /* renamed from: b  reason: collision with root package name */
        private c f13305b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f13306c;

        /* synthetic */ b(a aVar) {
            this();
        }

        public b a(ULocale uLocale) {
            return b(uLocale, 1.0d);
        }

        public b b(ULocale uLocale, double d4) {
            Double d5;
            if (this.f13304a == null) {
                this.f13304a = new LinkedHashMap(this.f13305b.f13303a);
                this.f13305b = null;
            }
            if (this.f13304a.containsKey(uLocale)) {
                this.f13304a.remove(uLocale);
            }
            if (d4 <= 0.0d) {
                return this;
            }
            if (d4 >= 1.0d) {
                d5 = c.f13299b;
            } else {
                d5 = Double.valueOf(d4);
                this.f13306c = true;
            }
            this.f13304a.put(uLocale, d5);
            return this;
        }

        public b c(String str) {
            String[] split = c.f13300c.split(str.trim());
            Matcher matcher = c.f13301d.matcher("");
            for (String str2 : split) {
                if (matcher.reset(str2).matches()) {
                    ULocale uLocale = new ULocale(matcher.group(1));
                    double parseDouble = Double.parseDouble(matcher.group(2));
                    if (0.0d > parseDouble || parseDouble > 1.0d) {
                        throw new IllegalArgumentException("Illegal weight, must be 0..1: " + parseDouble);
                    }
                    b(uLocale, parseDouble);
                } else if (str2.length() != 0) {
                    a(new ULocale(str2));
                }
            }
            return this;
        }

        public c d() {
            return e(false);
        }

        public c e(boolean z3) {
            Map map;
            Double d4;
            c cVar = this.f13305b;
            if (cVar != null) {
                return cVar;
            }
            if (this.f13306c) {
                TreeMap treeMap = new TreeMap(c.f13302e);
                for (Map.Entry entry : this.f13304a.entrySet()) {
                    ULocale uLocale = (ULocale) entry.getKey();
                    Double d5 = (Double) entry.getValue();
                    List list = (List) treeMap.get(d5);
                    if (list == null) {
                        list = new LinkedList();
                        treeMap.put(d5, list);
                    }
                    list.add(uLocale);
                }
                if (treeMap.size() <= 1) {
                    map = this.f13304a;
                    if (treeMap.isEmpty() || ((Double) treeMap.firstKey()).doubleValue() == 1.0d) {
                        this.f13306c = false;
                    }
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry2 : treeMap.entrySet()) {
                        if (z3) {
                            d4 = (Double) entry2.getKey();
                        } else {
                            d4 = c.f13299b;
                        }
                        for (ULocale put : (List) entry2.getValue()) {
                            linkedHashMap.put(put, d4);
                        }
                    }
                    map = linkedHashMap;
                }
            } else {
                map = this.f13304a;
            }
            this.f13304a = null;
            c cVar2 = new c(Collections.unmodifiableMap(map), (a) null);
            this.f13305b = cVar2;
            return cVar2;
        }

        private b() {
            this.f13306c = false;
            this.f13304a = new LinkedHashMap();
        }
    }

    /* synthetic */ c(Map map, a aVar) {
        this(map);
    }

    public static b f(String str) {
        return new b((a) null).c(str);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        try {
            return this.f13303a.equals(((c) obj).f13303a);
        } catch (RuntimeException unused) {
            return false;
        }
    }

    public int hashCode() {
        return this.f13303a.hashCode();
    }

    public Iterator iterator() {
        return this.f13303a.keySet().iterator();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : this.f13303a.entrySet()) {
            ULocale uLocale = (ULocale) entry.getKey();
            double doubleValue = ((Double) entry.getValue()).doubleValue();
            if (sb.length() != 0) {
                sb.append(", ");
            }
            sb.append(uLocale);
            if (doubleValue != 1.0d) {
                sb.append(";q=");
                sb.append(doubleValue);
            }
        }
        return sb.toString();
    }

    private c(Map map) {
        this.f13303a = map;
    }
}
