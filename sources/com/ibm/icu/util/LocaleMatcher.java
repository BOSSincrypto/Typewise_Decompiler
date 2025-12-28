package com.ibm.icu.util;

import com.ibm.icu.impl.locale.g;
import com.ibm.icu.impl.locale.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class LocaleMatcher {

    /* renamed from: m  reason: collision with root package name */
    private static final com.ibm.icu.impl.locale.e f13176m = new com.ibm.icu.impl.locale.e("und", "", "", 7);

    /* renamed from: n  reason: collision with root package name */
    private static final ULocale f13177n = new ULocale("und");

    /* renamed from: o  reason: collision with root package name */
    private static final Locale f13178o = new Locale("und");

    /* renamed from: p  reason: collision with root package name */
    private static final Locale f13179p = new Locale("");

    /* renamed from: a  reason: collision with root package name */
    private final int f13180a;

    /* renamed from: b  reason: collision with root package name */
    private final int f13181b;

    /* renamed from: c  reason: collision with root package name */
    private final FavorSubtag f13182c;

    /* renamed from: d  reason: collision with root package name */
    private final Direction f13183d;

    /* renamed from: e  reason: collision with root package name */
    private final ULocale[] f13184e;

    /* renamed from: f  reason: collision with root package name */
    private final Locale[] f13185f;

    /* renamed from: g  reason: collision with root package name */
    private final Map f13186g;

    /* renamed from: h  reason: collision with root package name */
    private final com.ibm.icu.impl.locale.e[] f13187h;

    /* renamed from: i  reason: collision with root package name */
    private final int[] f13188i;

    /* renamed from: j  reason: collision with root package name */
    private final int f13189j;

    /* renamed from: k  reason: collision with root package name */
    private final ULocale f13190k;

    /* renamed from: l  reason: collision with root package name */
    private final Locale f13191l;

    public enum Demotion {
        NONE,
        REGION
    }

    public enum Direction {
        WITH_ONE_WAY,
        ONLY_TWO_WAY
    }

    public enum FavorSubtag {
        LANGUAGE,
        SCRIPT
    }

    public static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public List f13195a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public int f13196b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public Demotion f13197c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public ULocale f13198d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public boolean f13199e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public FavorSubtag f13200f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public Direction f13201g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public ULocale f13202h;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public ULocale f13203i;

        public b j(ULocale uLocale) {
            if (this.f13195a == null) {
                this.f13195a = new ArrayList();
            }
            this.f13195a.add(uLocale);
            return this;
        }

        public LocaleMatcher k() {
            return new LocaleMatcher(this);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("{LocaleMatcher.Builder");
            List list = this.f13195a;
            if (list != null && !list.isEmpty()) {
                sb.append(" supported={");
                sb.append(this.f13195a);
                sb.append('}');
            }
            if (this.f13198d != null) {
                sb.append(" default=");
                sb.append(this.f13198d);
            }
            if (this.f13200f != null) {
                sb.append(" distance=");
                sb.append(this.f13200f);
            }
            int i4 = this.f13196b;
            if (i4 >= 0) {
                sb.append(String.format(" threshold=%d", new Object[]{Integer.valueOf(i4)}));
            }
            if (this.f13197c != null) {
                sb.append(" demotion=");
                sb.append(this.f13197c);
            }
            sb.append('}');
            return sb.toString();
        }

        private b() {
            this.f13196b = -1;
            this.f13199e = true;
        }
    }

    private static abstract class c implements Iterator {

        /* renamed from: a  reason: collision with root package name */
        int f13204a;

        private c() {
            this.f13204a = -1;
        }

        public abstract void a(int i4);

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final ULocale f13205a;

        /* renamed from: b  reason: collision with root package name */
        private final ULocale f13206b;

        /* renamed from: c  reason: collision with root package name */
        private final Locale f13207c;

        /* renamed from: d  reason: collision with root package name */
        private final Locale f13208d;

        /* renamed from: e  reason: collision with root package name */
        private final int f13209e;

        /* renamed from: f  reason: collision with root package name */
        private final int f13210f;

        public int a() {
            return this.f13209e;
        }

        public ULocale b() {
            Locale locale;
            ULocale uLocale = this.f13205a;
            if (uLocale != null || (locale = this.f13207c) == null) {
                return uLocale;
            }
            return ULocale.forLocale(locale);
        }

        public ULocale c() {
            return this.f13206b;
        }

        private d(ULocale uLocale, ULocale uLocale2, Locale locale, Locale locale2, int i4, int i5) {
            this.f13205a = uLocale;
            this.f13206b = uLocale2;
            this.f13207c = locale;
            this.f13208d = locale2;
            this.f13209e = i4;
            this.f13210f = i5;
        }
    }

    private static final class e extends c {

        /* renamed from: b  reason: collision with root package name */
        private Iterator f13211b;

        /* renamed from: c  reason: collision with root package name */
        private ULocale f13212c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public ULocale f13213d;

        e(Iterator it) {
            super();
            this.f13211b = it;
        }

        public void a(int i4) {
            this.f13204a = i4;
            this.f13213d = this.f13212c;
        }

        /* renamed from: c */
        public com.ibm.icu.impl.locale.e next() {
            ULocale uLocale = (ULocale) this.f13211b.next();
            this.f13212c = uLocale;
            return LocaleMatcher.g(uLocale);
        }

        public boolean hasNext() {
            return this.f13211b.hasNext();
        }
    }

    public static b b() {
        return new b();
    }

    private d c() {
        return new d((ULocale) null, this.f13190k, (Locale) null, this.f13191l, -1, -1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.ibm.icu.impl.locale.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int f(com.ibm.icu.impl.locale.e r11, com.ibm.icu.util.LocaleMatcher.c r12) {
        /*
            r10 = this;
            int r0 = r10.f13180a
            int r0 = com.ibm.icu.impl.locale.g.m(r0)
            r1 = 0
            r2 = -1
            r4 = r11
            r11 = r2
        L_0x000a:
            java.util.Map r3 = r10.f13186g
            java.lang.Object r3 = r3.get(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L_0x001e
            int r11 = r3.intValue()
            if (r12 == 0) goto L_0x001d
            r12.a(r1)
        L_0x001d:
            return r11
        L_0x001e:
            com.ibm.icu.impl.locale.g r3 = com.ibm.icu.impl.locale.g.f12871j
            com.ibm.icu.impl.locale.e[] r5 = r10.f13187h
            int r6 = r10.f13189j
            com.ibm.icu.util.LocaleMatcher$FavorSubtag r8 = r10.f13182c
            com.ibm.icu.util.LocaleMatcher$Direction r9 = r10.f13183d
            r7 = r0
            int r3 = r3.a(r4, r5, r6, r7, r8, r9)
            if (r3 < 0) goto L_0x003c
            int r0 = com.ibm.icu.impl.locale.g.i(r3)
            if (r12 == 0) goto L_0x0038
            r12.a(r1)
        L_0x0038:
            int r11 = com.ibm.icu.impl.locale.g.g(r3)
        L_0x003c:
            int r3 = r10.f13181b
            int r3 = com.ibm.icu.impl.locale.g.m(r3)
            int r0 = r0 - r3
            if (r0 > 0) goto L_0x0046
            goto L_0x0059
        L_0x0046:
            if (r12 == 0) goto L_0x0059
            boolean r3 = r12.hasNext()
            if (r3 != 0) goto L_0x004f
            goto L_0x0059
        L_0x004f:
            java.lang.Object r3 = r12.next()
            r4 = r3
            com.ibm.icu.impl.locale.e r4 = (com.ibm.icu.impl.locale.e) r4
            int r1 = r1 + 1
            goto L_0x000a
        L_0x0059:
            if (r11 >= 0) goto L_0x005c
            return r2
        L_0x005c:
            int[] r12 = r10.f13188i
            r11 = r12[r11]
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.util.LocaleMatcher.f(com.ibm.icu.impl.locale.e, com.ibm.icu.util.LocaleMatcher$c):int");
    }

    /* access modifiers changed from: private */
    public static final com.ibm.icu.impl.locale.e g(ULocale uLocale) {
        if (uLocale.equals(f13177n)) {
            return f13176m;
        }
        return m.f12910i.f(uLocale);
    }

    private d h(ULocale uLocale, e eVar, int i4) {
        if (i4 < 0) {
            return c();
        }
        if (uLocale == null) {
            return new d(eVar.f13213d, this.f13184e[i4], (Locale) null, this.f13185f[i4], eVar.f13204a, i4);
        }
        return new d(uLocale, this.f13184e[i4], (Locale) null, this.f13185f[i4], 0, i4);
    }

    private final int i(com.ibm.icu.impl.locale.e eVar, int i4, int i5) {
        if (this.f13186g.containsKey(eVar)) {
            return i5;
        }
        this.f13186g.put(eVar, Integer.valueOf(i4));
        this.f13187h[i5] = eVar;
        this.f13188i[i5] = i4;
        return i5 + 1;
    }

    public d d(ULocale uLocale) {
        return h(uLocale, (e) null, f(g(uLocale), (c) null));
    }

    public d e(Iterable iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return c();
        }
        e eVar = new e(it);
        return h((ULocale) null, eVar, f(eVar.next(), eVar));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{LocaleMatcher");
        if (this.f13189j > 0) {
            sb.append(" supportedLSRs={");
            sb.append(this.f13187h[0]);
            for (int i4 = 1; i4 < this.f13189j; i4++) {
                sb.append(", ");
                sb.append(this.f13187h[i4]);
            }
            sb.append('}');
        }
        sb.append(" default=");
        sb.append(this.f13190k);
        if (this.f13182c != null) {
            sb.append(" favor=");
            sb.append(this.f13182c);
        }
        if (this.f13183d != null) {
            sb.append(" direction=");
            sb.append(this.f13183d);
        }
        int i5 = this.f13180a;
        if (i5 >= 0) {
            sb.append(String.format(" threshold=%d", new Object[]{Integer.valueOf(i5)}));
        }
        sb.append(String.format(" demotion=%d", new Object[]{Integer.valueOf(this.f13181b)}));
        sb.append('}');
        return sb.toString();
    }

    private LocaleMatcher(b bVar) {
        com.ibm.icu.impl.locale.e eVar;
        Locale locale;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        ULocale b4 = bVar.f13198d;
        if (b4 != null) {
            locale = b4.toLocale();
            eVar = g(b4);
        } else {
            locale = null;
            eVar = null;
        }
        int size = bVar.f13195a != null ? bVar.f13195a.size() : 0;
        this.f13184e = new ULocale[size];
        this.f13185f = new Locale[size];
        com.ibm.icu.impl.locale.e[] eVarArr = new com.ibm.icu.impl.locale.e[size];
        if (size > 0) {
            int i8 = 0;
            for (ULocale uLocale : bVar.f13195a) {
                this.f13184e[i8] = uLocale;
                this.f13185f[i8] = uLocale.toLocale();
                eVarArr[i8] = g(uLocale);
                i8++;
            }
        }
        this.f13186g = new HashMap(size);
        this.f13187h = new com.ibm.icu.impl.locale.e[size];
        this.f13188i = new int[size];
        byte[] bArr = new byte[size];
        ULocale[] uLocaleArr = this.f13184e;
        int length = uLocaleArr.length;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i9 < length) {
            ULocale uLocale2 = uLocaleArr[i9];
            com.ibm.icu.impl.locale.e eVar2 = eVarArr[i12];
            if (eVar == null && bVar.f13199e) {
                Locale locale2 = this.f13185f[i7];
                i10 = i(eVar2, i7, i10);
                eVar = eVar2;
                locale = locale2;
                b4 = uLocale2;
            } else if (eVar == null || !eVar2.b(eVar)) {
                if (g.f12871j.k(eVar2)) {
                    bArr[i12] = 2;
                    i6 = 1;
                    i11++;
                } else {
                    i6 = 1;
                    bArr[i12] = 3;
                }
                i12 += i6;
                i9 += i6;
                int i13 = i6;
                i7 = 0;
            } else {
                i10 = i(eVar2, i12, i10);
            }
            i6 = 1;
            i12 += i6;
            i9 += i6;
            int i132 = i6;
            i7 = 0;
        }
        int i14 = i11 + i10;
        for (int i15 = 0; i15 < size && i10 < i14; i15++) {
            if (bArr[i15] == 2) {
                i10 = i(eVarArr[i15], i15, i10);
            }
        }
        for (int i16 = 0; i16 < size; i16++) {
            if (bArr[i16] == 3) {
                i10 = i(eVarArr[i16], i16, i10);
            }
        }
        this.f13189j = i10;
        this.f13190k = b4;
        this.f13191l = locale;
        if (bVar.f13197c == Demotion.NONE) {
            i4 = 0;
        } else {
            i4 = g.f12871j.b();
        }
        this.f13181b = i4;
        FavorSubtag f4 = bVar.f13200f;
        this.f13182c = f4;
        Direction g4 = bVar.f13201g;
        this.f13183d = g4;
        if (bVar.f13196b >= 0) {
            i5 = bVar.f13196b;
        } else if (bVar.f13202h != null) {
            i5 = g.e(g.f12871j.a(g(bVar.f13202h), new com.ibm.icu.impl.locale.e[]{g(bVar.f13203i)}, 1, g.m(100), f4, g4)) + 1;
        } else {
            i5 = g.f12871j.c();
        }
        this.f13180a = i5;
    }
}
