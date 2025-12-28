package com.ibm.icu.impl.locale;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class d {

    /* renamed from: h  reason: collision with root package name */
    private static final a f12847h = new a("x".charAt(0));

    /* renamed from: a  reason: collision with root package name */
    private String f12848a = "";

    /* renamed from: b  reason: collision with root package name */
    private String f12849b = "";

    /* renamed from: c  reason: collision with root package name */
    private String f12850c = "";

    /* renamed from: d  reason: collision with root package name */
    private String f12851d = "";

    /* renamed from: e  reason: collision with root package name */
    private HashMap f12852e;

    /* renamed from: f  reason: collision with root package name */
    private HashSet f12853f;

    /* renamed from: g  reason: collision with root package name */
    private HashMap f12854g;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        private char f12855a;

        a(char c4) {
            this.f12855a = c4;
        }

        public char a() {
            return this.f12855a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            if (this.f12855a == a.i(((a) obj).a())) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return a.i(this.f12855a);
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        private String f12856a;

        b(String str) {
            this.f12856a = str;
        }

        public String a() {
            return this.f12856a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return a.b(this.f12856a, ((b) obj).a());
        }

        public int hashCode() {
            return a.j(this.f12856a).hashCode();
        }
    }

    private int b(String str, String str2) {
        k kVar = new k(str, str2);
        while (!kVar.e()) {
            if (!f.y(kVar.a())) {
                return kVar.c();
            }
            kVar.f();
        }
        return -1;
    }

    static String g(String str) {
        k kVar = new k(str, "-");
        int i4 = -1;
        while (!kVar.e()) {
            if (i4 == -1) {
                if (a.b(kVar.a(), "lvariant")) {
                    i4 = kVar.c();
                }
                kVar.f();
            } else if (i4 == 0) {
                return null;
            } else {
                return str.substring(0, i4 - 1);
            }
        }
        return str;
    }

    private d i(List list, String str) {
        d();
        if (list != null && list.size() > 0) {
            HashSet hashSet = new HashSet(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                a aVar = new a(str2.charAt(0));
                if (!hashSet.contains(aVar)) {
                    if (l.h(aVar.a())) {
                        l(str2.substring(2));
                    } else {
                        if (this.f12852e == null) {
                            this.f12852e = new HashMap(4);
                        }
                        this.f12852e.put(aVar, str2.substring(2));
                    }
                }
            }
        }
        if (str != null && str.length() > 0) {
            if (this.f12852e == null) {
                this.f12852e = new HashMap(1);
            }
            this.f12852e.put(new a(str.charAt(0)), str.substring(2));
        }
        return this;
    }

    private void l(String str) {
        String str2;
        HashSet hashSet = this.f12853f;
        if (hashSet != null) {
            hashSet.clear();
        }
        HashMap hashMap = this.f12854g;
        if (hashMap != null) {
            hashMap.clear();
        }
        k kVar = new k(str, "-");
        while (!kVar.e() && l.f(kVar.a())) {
            if (this.f12853f == null) {
                this.f12853f = new HashSet(4);
            }
            this.f12853f.add(new b(kVar.a()));
            kVar.f();
        }
        b bVar = null;
        int i4 = -1;
        int i5 = -1;
        while (!kVar.e()) {
            String str3 = "";
            if (bVar != null) {
                if (l.g(kVar.a())) {
                    if (i4 == -1) {
                        str2 = str3;
                    } else {
                        str2 = str.substring(i4, i5);
                    }
                    if (this.f12854g == null) {
                        this.f12854g = new HashMap(4);
                    }
                    this.f12854g.put(bVar, str2);
                    bVar = new b(kVar.a());
                    if (this.f12854g.containsKey(bVar)) {
                        bVar = null;
                    }
                    i4 = -1;
                    i5 = -1;
                } else {
                    if (i4 == -1) {
                        i4 = kVar.c();
                    }
                    i5 = kVar.b();
                }
            } else if (l.g(kVar.a())) {
                bVar = new b(kVar.a());
                HashMap hashMap2 = this.f12854g;
                if (hashMap2 != null && hashMap2.containsKey(bVar)) {
                    bVar = null;
                }
            }
            if (kVar.d()) {
                kVar.f();
            } else if (bVar != null) {
                if (i4 != -1) {
                    str3 = str.substring(i4, i5);
                }
                if (this.f12854g == null) {
                    this.f12854g = new HashMap(4);
                }
                this.f12854g.put(bVar, str3);
                return;
            } else {
                return;
            }
        }
    }

    public d a(String str) {
        if (str == null || !l.f(str)) {
            throw new LocaleSyntaxException("Ill-formed Unicode locale attribute: " + str);
        }
        if (this.f12853f == null) {
            this.f12853f = new HashSet(4);
        }
        this.f12853f.add(new b(str));
        return this;
    }

    public d c() {
        this.f12848a = "";
        this.f12849b = "";
        this.f12850c = "";
        this.f12851d = "";
        d();
        return this;
    }

    public d d() {
        HashMap hashMap = this.f12852e;
        if (hashMap != null) {
            hashMap.clear();
        }
        HashSet hashSet = this.f12853f;
        if (hashSet != null) {
            hashSet.clear();
        }
        HashMap hashMap2 = this.f12854g;
        if (hashMap2 != null) {
            hashMap2.clear();
        }
        return this;
    }

    public b e() {
        String str;
        int i4;
        String str2 = this.f12848a;
        String str3 = this.f12849b;
        String str4 = this.f12850c;
        String str5 = this.f12851d;
        HashMap hashMap = this.f12852e;
        if (!(hashMap == null || (str = (String) hashMap.get(f12847h)) == null)) {
            k kVar = new k(str, "-");
            boolean z3 = false;
            while (true) {
                if (kVar.e()) {
                    i4 = -1;
                    break;
                } else if (z3) {
                    i4 = kVar.c();
                    break;
                } else {
                    if (a.b(kVar.a(), "lvariant")) {
                        z3 = true;
                    }
                    kVar.f();
                }
            }
            if (i4 != -1) {
                StringBuilder sb = new StringBuilder(str5);
                if (sb.length() != 0) {
                    sb.append("_");
                }
                sb.append(str.substring(i4).replaceAll("-", "_"));
                str5 = sb.toString();
            }
        }
        return b.a(str2, str3, str4, str5);
    }

    public h f() {
        HashSet hashSet;
        HashMap hashMap;
        HashMap hashMap2 = this.f12852e;
        if ((hashMap2 == null || hashMap2.size() == 0) && (((hashSet = this.f12853f) == null || hashSet.size() == 0) && ((hashMap = this.f12854g) == null || hashMap.size() == 0))) {
            return h.f12887d;
        }
        return new h(this.f12852e, this.f12853f, this.f12854g);
    }

    public d h(char c4, String str) {
        boolean z3;
        boolean z4;
        boolean t4 = f.t(c4);
        if (t4 || f.o(c4)) {
            if (str == null || str.length() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            a aVar = new a(c4);
            if (!z3) {
                String replaceAll = str.replaceAll("_", "-");
                k kVar = new k(replaceAll, "-");
                while (!kVar.e()) {
                    String a4 = kVar.a();
                    if (t4) {
                        z4 = f.u(a4);
                    } else {
                        z4 = f.p(a4);
                    }
                    if (z4) {
                        kVar.f();
                    } else {
                        throw new LocaleSyntaxException("Ill-formed extension value: " + a4, kVar.c());
                    }
                }
                if (l.h(aVar.a())) {
                    l(replaceAll);
                } else {
                    if (this.f12852e == null) {
                        this.f12852e = new HashMap(4);
                    }
                    this.f12852e.put(aVar, replaceAll);
                }
            } else if (l.h(aVar.a())) {
                HashSet hashSet = this.f12853f;
                if (hashSet != null) {
                    hashSet.clear();
                }
                HashMap hashMap = this.f12854g;
                if (hashMap != null) {
                    hashMap.clear();
                }
            } else {
                HashMap hashMap2 = this.f12852e;
                if (hashMap2 != null && hashMap2.containsKey(aVar)) {
                    this.f12852e.remove(aVar);
                }
            }
            return this;
        }
        throw new LocaleSyntaxException("Ill-formed extension key: " + c4);
    }

    public d j(f fVar) {
        c();
        if (fVar.h().size() > 0) {
            this.f12848a = (String) fVar.h().get(0);
        } else {
            String i4 = fVar.i();
            if (!i4.equals(f.f12862h)) {
                this.f12848a = i4;
            }
        }
        this.f12849b = fVar.l();
        this.f12850c = fVar.k();
        ArrayList arrayList = new ArrayList(fVar.m());
        Collections.sort(arrayList);
        if (arrayList.size() > 0) {
            StringBuilder sb = new StringBuilder((String) arrayList.get(0));
            for (int i5 = 1; i5 < arrayList.size(); i5++) {
                sb.append("_");
                sb.append((String) arrayList.get(i5));
            }
            this.f12851d = sb.toString();
        }
        i(fVar.g(), fVar.j());
        return this;
    }

    public d k(b bVar, h hVar) {
        Set<Character> set;
        int b4;
        String b5 = bVar.b();
        String d4 = bVar.d();
        String c4 = bVar.c();
        String e4 = bVar.e();
        if (b5.length() > 0 && !f.r(b5)) {
            throw new LocaleSyntaxException("Ill-formed language: " + b5);
        } else if (d4.length() > 0 && !f.w(d4)) {
            throw new LocaleSyntaxException("Ill-formed script: " + d4);
        } else if (c4.length() > 0 && !f.v(c4)) {
            throw new LocaleSyntaxException("Ill-formed region: " + c4);
        } else if (e4.length() <= 0 || (b4 = b(e4, "_")) == -1) {
            this.f12848a = b5;
            this.f12849b = d4;
            this.f12850c = c4;
            this.f12851d = e4;
            d();
            if (hVar == null) {
                set = null;
            } else {
                set = hVar.c();
            }
            if (set != null) {
                for (Character ch2 : set) {
                    c a4 = hVar.a(ch2);
                    if (a4 instanceof l) {
                        l lVar = (l) a4;
                        for (String str : lVar.c()) {
                            if (this.f12853f == null) {
                                this.f12853f = new HashSet(4);
                            }
                            this.f12853f.add(new b(str));
                        }
                        for (String str2 : lVar.d()) {
                            if (this.f12854g == null) {
                                this.f12854g = new HashMap(4);
                            }
                            this.f12854g.put(new b(str2), lVar.e(str2));
                        }
                    } else {
                        if (this.f12852e == null) {
                            this.f12852e = new HashMap(4);
                        }
                        this.f12852e.put(new a(ch2.charValue()), a4.b());
                    }
                }
            }
            return this;
        } else {
            throw new LocaleSyntaxException("Ill-formed variant: " + e4, b4);
        }
    }

    public d m(String str, String str2) {
        if (l.g(str)) {
            b bVar = new b(str);
            if (str2 == null) {
                HashMap hashMap = this.f12854g;
                if (hashMap != null) {
                    hashMap.remove(bVar);
                }
            } else {
                if (str2.length() != 0) {
                    k kVar = new k(str2.replaceAll("_", "-"), "-");
                    while (!kVar.e()) {
                        if (l.j(kVar.a())) {
                            kVar.f();
                        } else {
                            throw new LocaleSyntaxException("Ill-formed Unicode locale keyword type: " + str2, kVar.c());
                        }
                    }
                }
                if (this.f12854g == null) {
                    this.f12854g = new HashMap(4);
                }
                this.f12854g.put(bVar, str2);
            }
            return this;
        }
        throw new LocaleSyntaxException("Ill-formed Unicode locale keyword key: " + str);
    }
}
