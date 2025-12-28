package com.ibm.icu.impl;

import Y1.s;
import Y1.u;
import Y1.w;
import Y1.x;
import com.ibm.icu.impl.d;
import com.ibm.icu.util.ICUException;
import com.ibm.icu.util.ICUUncheckedIOException;
import com.ibm.icu.util.ULocale;
import com.ibm.icu.util.UResourceTypeMismatchException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;
import java.util.Arrays;

public final class g {

    /* renamed from: o  reason: collision with root package name */
    private static final f f12687o = new f();

    /* renamed from: p  reason: collision with root package name */
    private static final CharBuffer f12688p = CharBuffer.wrap("\u0000");

    /* renamed from: q  reason: collision with root package name */
    private static C0176g f12689q = new C0176g();
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public static final g f12690r = new g();

    /* renamed from: s  reason: collision with root package name */
    private static final byte[] f12691s = new byte[0];

    /* renamed from: t  reason: collision with root package name */
    private static final ByteBuffer f12692t = ByteBuffer.allocate(0).asReadOnlyBuffer();

    /* renamed from: u  reason: collision with root package name */
    private static final char[] f12693u = new char[0];

    /* renamed from: v  reason: collision with root package name */
    private static final int[] f12694v = new int[0];

    /* renamed from: w  reason: collision with root package name */
    private static final d f12695w = new d();

    /* renamed from: x  reason: collision with root package name */
    private static final n f12696x = new n();
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public static int[] f12697y = {0, 1, 2, 3, 2, 2, 0, 7, 8, 8, -1, -1, -1, -1, 14, -1};

    /* renamed from: a  reason: collision with root package name */
    private int f12698a;

    /* renamed from: b  reason: collision with root package name */
    private ByteBuffer f12699b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f12700c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public CharBuffer f12701d;

    /* renamed from: e  reason: collision with root package name */
    private g f12702e;

    /* renamed from: f  reason: collision with root package name */
    private int f12703f;

    /* renamed from: g  reason: collision with root package name */
    private int f12704g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public int f12705h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public int f12706i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f12707j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f12708k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f12709l;

    /* renamed from: m  reason: collision with root package name */
    private int f12710m;

    /* renamed from: n  reason: collision with root package name */
    private j f12711n;

    private static final class b extends d {
        b(g gVar, int i4) {
            this.f12712a = gVar.f12701d.charAt(i4);
            this.f12713b = i4 + 1;
        }

        /* access modifiers changed from: package-private */
        public int f(g gVar, int i4) {
            return d(gVar, i4);
        }
    }

    private static final class c extends d {
        c(g gVar, int i4) {
            int f4 = gVar.L(i4);
            this.f12712a = gVar.E(f4);
            this.f12713b = f4 + 4;
        }

        /* access modifiers changed from: package-private */
        public int f(g gVar, int i4) {
            return e(gVar, i4);
        }
    }

    static class d extends e {
        d() {
        }
    }

    static class e {

        /* renamed from: a  reason: collision with root package name */
        protected int f12712a;

        /* renamed from: b  reason: collision with root package name */
        protected int f12713b;

        e() {
        }

        public final int a() {
            return this.f12712a;
        }

        /* access modifiers changed from: protected */
        public int d(g gVar, int i4) {
            if (i4 < 0 || this.f12712a <= i4) {
                return -1;
            }
            int charAt = gVar.f12701d.charAt(this.f12713b + i4);
            if (charAt >= gVar.f12706i) {
                charAt = (charAt - gVar.f12706i) + gVar.f12705h;
            }
            return 1610612736 | charAt;
        }

        /* access modifiers changed from: protected */
        public int e(g gVar, int i4) {
            if (i4 < 0 || this.f12712a <= i4) {
                return -1;
            }
            return gVar.E(this.f12713b + (i4 * 4));
        }

        /* access modifiers changed from: package-private */
        public int f(g gVar, int i4) {
            return -1;
        }

        /* access modifiers changed from: package-private */
        public int g(g gVar, String str) {
            return f(gVar, Integer.parseInt(str));
        }
    }

    private static final class f implements d.b {
        private f() {
        }

        public boolean a(byte[] bArr) {
            byte b4 = bArr[0];
            if ((b4 != 1 || (bArr[1] & 255) < 1) && (2 > b4 || b4 > 3)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.ibm.icu.impl.g$g  reason: collision with other inner class name */
    private static class C0176g extends s {
        private C0176g() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public g a(h hVar, ClassLoader classLoader) {
            ByteBuffer g4;
            String C3 = g.C(hVar.f12714a, hVar.f12715b);
            try {
                String str = hVar.f12714a;
                if (str == null || !str.startsWith("com/ibm/icu/impl/data/icudt71b")) {
                    InputStream c4 = e.c(classLoader, C3);
                    if (c4 == null) {
                        return g.f12690r;
                    }
                    g4 = d.g(c4);
                } else {
                    g4 = d.j(classLoader, C3, C3.substring(31));
                    if (g4 == null) {
                        return g.f12690r;
                    }
                }
                return new g(g4, hVar.f12714a, hVar.f12715b, classLoader);
            } catch (IOException e4) {
                throw new ICUUncheckedIOException("Data file " + C3 + " is corrupt - " + e4.getMessage(), e4);
            }
        }
    }

    private static class h {

        /* renamed from: a  reason: collision with root package name */
        final String f12714a;

        /* renamed from: b  reason: collision with root package name */
        final String f12715b;

        h(String str, String str2) {
            this.f12714a = str == null ? "" : str;
            this.f12715b = str2 == null ? "" : str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            if (!this.f12714a.equals(hVar.f12714a) || !this.f12715b.equals(hVar.f12715b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f12714a.hashCode() ^ this.f12715b.hashCode();
        }
    }

    static class i extends x {

        /* renamed from: a  reason: collision with root package name */
        g f12716a;

        /* renamed from: b  reason: collision with root package name */
        int f12717b;

        i() {
        }

        private String[] h(d dVar) {
            String[] strArr = new String[dVar.f12712a];
            int i4 = 0;
            while (i4 < dVar.f12712a) {
                String N3 = this.f12716a.N(dVar.f(this.f12716a, i4));
                if (N3 != null) {
                    strArr[i4] = N3;
                    i4++;
                } else {
                    throw new UResourceTypeMismatchException("");
                }
            }
            return strArr;
        }

        public ByteBuffer a() {
            ByteBuffer A3 = this.f12716a.A(this.f12717b);
            if (A3 != null) {
                return A3;
            }
            throw new UResourceTypeMismatchException("");
        }

        public int b() {
            if (g.c(this.f12717b) == 7) {
                return g.a(this.f12717b);
            }
            throw new UResourceTypeMismatchException("");
        }

        public int[] c() {
            int[] F3 = this.f12716a.F(this.f12717b);
            if (F3 != null) {
                return F3;
            }
            throw new UResourceTypeMismatchException("");
        }

        public String d() {
            String N3 = this.f12716a.N(this.f12717b);
            if (N3 != null) {
                return N3;
            }
            throw new UResourceTypeMismatchException("");
        }

        public String[] e() {
            d z3 = this.f12716a.z(this.f12717b);
            if (z3 != null) {
                return h(z3);
            }
            throw new UResourceTypeMismatchException("");
        }

        public w f() {
            n P3 = this.f12716a.P(this.f12717b);
            if (P3 != null) {
                return P3;
            }
            throw new UResourceTypeMismatchException("");
        }

        public int g() {
            return g.f12697y[g.c(this.f12717b)];
        }
    }

    private static final class j {

        /* renamed from: a  reason: collision with root package name */
        private int[] f12718a = new int[32];

        /* renamed from: b  reason: collision with root package name */
        private Object[] f12719b = new Object[32];

        /* renamed from: c  reason: collision with root package name */
        private int f12720c;

        /* renamed from: d  reason: collision with root package name */
        private int f12721d = 28;

        /* renamed from: e  reason: collision with root package name */
        private int f12722e;

        /* renamed from: f  reason: collision with root package name */
        private a f12723f;

        private static final class a {

            /* renamed from: a  reason: collision with root package name */
            int f12724a;

            /* renamed from: b  reason: collision with root package name */
            int f12725b;

            /* renamed from: c  reason: collision with root package name */
            int f12726c;

            /* renamed from: d  reason: collision with root package name */
            int[] f12727d;

            /* renamed from: e  reason: collision with root package name */
            Object[] f12728e;

            a(int i4, int i5) {
                this.f12724a = i4;
                this.f12725b = i5;
                int i6 = 1 << (i4 & 15);
                this.f12726c = i6 - 1;
                this.f12727d = new int[i6];
                this.f12728e = new Object[i6];
            }

            /* access modifiers changed from: package-private */
            public Object a(int i4) {
                a aVar;
                int i5 = (i4 >> this.f12725b) & this.f12726c;
                int i6 = this.f12727d[i5];
                if (i6 == i4) {
                    return this.f12728e[i5];
                }
                if (i6 != 0 || (aVar = (a) this.f12728e[i5]) == null) {
                    return null;
                }
                return aVar.a(i4);
            }

            /* access modifiers changed from: package-private */
            public Object b(int i4, Object obj, int i5) {
                Object obj2;
                int i6 = this.f12725b;
                int i7 = (i4 >> i6) & this.f12726c;
                int[] iArr = this.f12727d;
                int i8 = iArr[i7];
                if (i8 == i4) {
                    return j.g(this.f12728e, i7, obj, i5);
                }
                if (i8 == 0) {
                    Object[] objArr = this.f12728e;
                    a aVar = (a) objArr[i7];
                    if (aVar != null) {
                        return aVar.b(i4, obj, i5);
                    }
                    iArr[i7] = i4;
                    if (j.h(i5)) {
                        obj2 = obj;
                    } else {
                        obj2 = new SoftReference(obj);
                    }
                    objArr[i7] = obj2;
                    return obj;
                }
                int i9 = this.f12724a;
                a aVar2 = new a(i9 >> 4, i6 + (i9 & 15));
                int i10 = (i8 >> aVar2.f12725b) & aVar2.f12726c;
                aVar2.f12727d[i10] = i8;
                Object[] objArr2 = aVar2.f12728e;
                Object[] objArr3 = this.f12728e;
                objArr2[i10] = objArr3[i7];
                this.f12727d[i7] = 0;
                objArr3[i7] = aVar2;
                return aVar2.b(i4, obj, i5);
            }
        }

        j(int i4) {
            while (i4 <= 134217727) {
                i4 <<= 1;
                this.f12721d--;
            }
            int i5 = this.f12721d;
            int i6 = i5 + 2;
            if (i6 <= 7) {
                this.f12722e = i6;
            } else if (i6 < 10) {
                this.f12722e = (i5 - 1) | 48;
            } else {
                this.f12722e = 7;
                int i7 = i5 - 5;
                int i8 = 4;
                while (i7 > 6) {
                    if (i7 < 9) {
                        this.f12722e = (((i7 - 3) | 48) << i8) | this.f12722e;
                        return;
                    }
                    this.f12722e = (6 << i8) | this.f12722e;
                    i7 -= 6;
                    i8 += 4;
                }
                this.f12722e = (i7 << i8) | this.f12722e;
            }
        }

        private int c(int i4) {
            return Arrays.binarySearch(this.f12718a, 0, this.f12720c, i4);
        }

        private int e(int i4) {
            int i5;
            int c4 = g.c(i4);
            if (c4 == 6) {
                i5 = 1;
            } else if (c4 == 5) {
                i5 = 3;
            } else if (c4 == 9) {
                i5 = 2;
            } else {
                i5 = 0;
            }
            return g.b(i4) | (i5 << this.f12721d);
        }

        /* access modifiers changed from: private */
        public static final Object g(Object[] objArr, int i4, Object obj, int i5) {
            Object obj2;
            SoftReference softReference = objArr[i4];
            if (!(softReference instanceof SoftReference)) {
                return softReference;
            }
            Object obj3 = softReference.get();
            if (obj3 != null) {
                return obj3;
            }
            if (CacheValue.a()) {
                obj2 = obj;
            } else {
                obj2 = new SoftReference(obj);
            }
            objArr[i4] = obj2;
            return obj;
        }

        /* access modifiers changed from: private */
        public static boolean h(int i4) {
            if (i4 < 24 || CacheValue.a()) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x002e, code lost:
            return r3;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized java.lang.Object d(int r3) {
            /*
                r2 = this;
                monitor-enter(r2)
                int r0 = r2.f12720c     // Catch:{ all -> 0x0011 }
                r1 = 0
                if (r0 < 0) goto L_0x0015
                int r3 = r2.c(r3)     // Catch:{ all -> 0x0011 }
                if (r3 < 0) goto L_0x0013
                java.lang.Object[] r0 = r2.f12719b     // Catch:{ all -> 0x0011 }
                r3 = r0[r3]     // Catch:{ all -> 0x0011 }
                goto L_0x0023
            L_0x0011:
                r3 = move-exception
                goto L_0x002f
            L_0x0013:
                monitor-exit(r2)
                return r1
            L_0x0015:
                com.ibm.icu.impl.g$j$a r0 = r2.f12723f     // Catch:{ all -> 0x0011 }
                int r3 = r2.e(r3)     // Catch:{ all -> 0x0011 }
                java.lang.Object r3 = r0.a(r3)     // Catch:{ all -> 0x0011 }
                if (r3 != 0) goto L_0x0023
                monitor-exit(r2)
                return r1
            L_0x0023:
                boolean r0 = r3 instanceof java.lang.ref.SoftReference     // Catch:{ all -> 0x0011 }
                if (r0 == 0) goto L_0x002d
                java.lang.ref.SoftReference r3 = (java.lang.ref.SoftReference) r3     // Catch:{ all -> 0x0011 }
                java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x0011 }
            L_0x002d:
                monitor-exit(r2)
                return r3
            L_0x002f:
                monitor-exit(r2)     // Catch:{ all -> 0x0011 }
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.impl.g.j.d(int):java.lang.Object");
        }

        /* access modifiers changed from: package-private */
        public synchronized Object f(int i4, Object obj, int i5) {
            Object obj2;
            if (this.f12720c >= 0) {
                int c4 = c(i4);
                if (c4 >= 0) {
                    return g(this.f12719b, c4, obj, i5);
                }
                int i6 = this.f12720c;
                if (i6 < 32) {
                    int i7 = ~c4;
                    if (i7 < i6) {
                        int[] iArr = this.f12718a;
                        int i8 = i7 + 1;
                        System.arraycopy(iArr, i7, iArr, i8, i6 - i7);
                        Object[] objArr = this.f12719b;
                        System.arraycopy(objArr, i7, objArr, i8, this.f12720c - i7);
                    }
                    this.f12720c++;
                    this.f12718a[i7] = i4;
                    Object[] objArr2 = this.f12719b;
                    if (h(i5)) {
                        obj2 = obj;
                    } else {
                        obj2 = new SoftReference(obj);
                    }
                    objArr2[i7] = obj2;
                    return obj;
                }
                this.f12723f = new a(this.f12722e, 0);
                for (int i9 = 0; i9 < 32; i9++) {
                    this.f12723f.b(e(this.f12718a[i9]), this.f12719b[i9], 0);
                }
                this.f12718a = null;
                this.f12719b = null;
                this.f12720c = -1;
            }
            return this.f12723f.b(e(i4), obj, i5);
        }
    }

    private static final class k extends n {
        k(g gVar, int i4) {
            int f4 = gVar.L(i4);
            char[] m4 = gVar.S(f4);
            this.f12729c = m4;
            int length = m4.length;
            this.f12712a = length;
            this.f12713b = f4 + (((length + 2) & -2) * 2);
        }

        /* access modifiers changed from: package-private */
        public int f(g gVar, int i4) {
            return e(gVar, i4);
        }
    }

    private static final class l extends n {
        l(g gVar, int i4) {
            char[] n4 = gVar.Q(i4);
            this.f12729c = n4;
            int length = n4.length;
            this.f12712a = length;
            this.f12713b = i4 + 1 + length;
        }

        /* access modifiers changed from: package-private */
        public int f(g gVar, int i4) {
            return d(gVar, i4);
        }
    }

    private static final class m extends n {
        m(g gVar, int i4) {
            int f4 = gVar.L(i4);
            int[] o4 = gVar.R(f4);
            this.f12730d = o4;
            int length = o4.length;
            this.f12712a = length;
            this.f12713b = f4 + ((length + 1) * 4);
        }

        /* access modifiers changed from: package-private */
        public int f(g gVar, int i4) {
            return e(gVar, i4);
        }
    }

    static class n extends e implements w {

        /* renamed from: c  reason: collision with root package name */
        protected char[] f12729c;

        /* renamed from: d  reason: collision with root package name */
        protected int[] f12730d;

        n() {
        }

        public boolean b(CharSequence charSequence, x xVar) {
            i iVar = (i) xVar;
            int h4 = h(iVar.f12716a, charSequence);
            if (h4 < 0) {
                return false;
            }
            iVar.f12717b = f(iVar.f12716a, h4);
            return true;
        }

        public boolean c(int i4, u uVar, x xVar) {
            if (i4 < 0 || i4 >= this.f12712a) {
                return false;
            }
            i iVar = (i) xVar;
            char[] cArr = this.f12729c;
            if (cArr != null) {
                iVar.f12716a.W(cArr[i4], uVar);
            } else {
                iVar.f12716a.X(this.f12730d[i4], uVar);
            }
            iVar.f12717b = f(iVar.f12716a, i4);
            return true;
        }

        /* access modifiers changed from: package-private */
        public int g(g gVar, String str) {
            return f(gVar, h(gVar, str));
        }

        /* access modifiers changed from: package-private */
        public int h(g gVar, CharSequence charSequence) {
            int i4;
            int i5 = this.f12712a;
            int i6 = 0;
            while (i6 < i5) {
                int i7 = (i6 + i5) >>> 1;
                char[] cArr = this.f12729c;
                if (cArr != null) {
                    i4 = gVar.w(charSequence, cArr[i7]);
                } else {
                    i4 = gVar.x(charSequence, this.f12730d[i7]);
                }
                if (i4 < 0) {
                    i5 = i7;
                } else if (i4 <= 0) {
                    return i7;
                } else {
                    i6 = i7 + 1;
                }
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        public String i(g gVar, int i4) {
            if (i4 < 0 || this.f12712a <= i4) {
                return null;
            }
            char[] cArr = this.f12729c;
            if (cArr != null) {
                return gVar.H(cArr[i4]);
            }
            return gVar.I(this.f12730d[i4]);
        }
    }

    private char[] B(int i4, int i5) {
        char[] cArr = new char[i5];
        if (i5 <= 16) {
            for (int i6 = 0; i6 < i5; i6++) {
                cArr[i6] = this.f12699b.getChar(i4);
                i4 += 2;
            }
        } else {
            CharBuffer asCharBuffer = this.f12699b.asCharBuffer();
            asCharBuffer.position(i4 / 2);
            asCharBuffer.get(cArr);
        }
        return cArr;
    }

    public static String C(String str, String str2) {
        if (str == null || str.length() == 0) {
            if (str2.length() == 0) {
                return ULocale.getDefault().toString();
            }
            return str2 + ".res";
        } else if (str.indexOf(46) != -1) {
            String replace = str.replace('.', '/');
            if (str2.length() == 0) {
                return replace + ".res";
            }
            return replace + "_" + str2 + ".res";
        } else if (str.charAt(str.length() - 1) != '/') {
            return str + "/" + str2 + ".res";
        } else {
            return str + str2 + ".res";
        }
    }

    private int D(int i4) {
        return this.f12699b.getInt((i4 + 1) << 2);
    }

    /* access modifiers changed from: private */
    public int E(int i4) {
        return this.f12699b.getInt(i4);
    }

    private int[] G(int i4, int i5) {
        int[] iArr = new int[i5];
        if (i5 <= 16) {
            for (int i6 = 0; i6 < i5; i6++) {
                iArr[i6] = this.f12699b.getInt(i4);
                i4 += 4;
            }
        } else {
            IntBuffer asIntBuffer = this.f12699b.asIntBuffer();
            asIntBuffer.position(i4 / 4);
            asIntBuffer.get(iArr);
        }
        return iArr;
    }

    /* access modifiers changed from: private */
    public String H(int i4) {
        int i5 = this.f12704g;
        if (i4 < i5) {
            return U(this.f12700c, i4);
        }
        return U(this.f12702e.f12700c, i4 - i5);
    }

    /* access modifiers changed from: private */
    public String I(int i4) {
        if (i4 >= 0) {
            return U(this.f12700c, i4);
        }
        return U(this.f12702e.f12700c, i4 & Integer.MAX_VALUE);
    }

    static g K(String str, String str2, ClassLoader classLoader) {
        g gVar = (g) f12689q.b(new h(str, str2), classLoader);
        if (gVar == f12690r) {
            return null;
        }
        return gVar;
    }

    /* access modifiers changed from: private */
    public int L(int i4) {
        return i4 << 2;
    }

    /* access modifiers changed from: private */
    public char[] Q(int i4) {
        int i5 = i4 + 1;
        int charAt = this.f12701d.charAt(i4);
        if (charAt <= 0) {
            return f12693u;
        }
        char[] cArr = new char[charAt];
        if (charAt <= 16) {
            int i6 = 0;
            while (i6 < charAt) {
                cArr[i6] = this.f12701d.charAt(i5);
                i6++;
                i5++;
            }
        } else {
            CharBuffer duplicate = this.f12701d.duplicate();
            duplicate.position(i5);
            duplicate.get(cArr);
        }
        return cArr;
    }

    /* access modifiers changed from: private */
    public int[] R(int i4) {
        int E3 = E(i4);
        if (E3 > 0) {
            return G(i4 + 4, E3);
        }
        return f12694v;
    }

    /* access modifiers changed from: private */
    public char[] S(int i4) {
        char c4 = this.f12699b.getChar(i4);
        if (c4 > 0) {
            return B(i4 + 2, c4);
        }
        return f12693u;
    }

    private void T(ByteBuffer byteBuffer) {
        boolean z3;
        boolean z4;
        boolean z5;
        this.f12698a = d.s(byteBuffer, 1382380354, f12687o);
        byte b4 = byteBuffer.get(16);
        ByteBuffer v3 = d.v(byteBuffer);
        this.f12699b = v3;
        int remaining = v3.remaining();
        this.f12703f = this.f12699b.getInt(0);
        int D3 = D(0);
        int i4 = D3 & 255;
        if (i4 > 4) {
            int i5 = i4 + 1;
            int i6 = i5 << 2;
            if (remaining >= i6) {
                int D4 = D(3);
                if (remaining >= (D4 << 2)) {
                    int i7 = D4 - 1;
                    if (b4 >= 3) {
                        this.f12705h = D3 >>> 8;
                    }
                    if (i4 > 5) {
                        int D5 = D(5);
                        if ((D5 & 1) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        this.f12707j = z3;
                        if ((D5 & 2) != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        this.f12708k = z4;
                        if ((D5 & 4) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        this.f12709l = z5;
                        this.f12705h |= (61440 & D5) << 12;
                        this.f12706i = D5 >>> 16;
                    }
                    int D6 = D(1);
                    if (D6 > i5) {
                        if (this.f12708k) {
                            this.f12700c = new byte[((D6 - i5) << 2)];
                            this.f12699b.position(i6);
                        } else {
                            int i8 = D6 << 2;
                            this.f12704g = i8;
                            this.f12700c = new byte[i8];
                        }
                        this.f12699b.get(this.f12700c);
                    }
                    if (i4 > 6) {
                        int D7 = D(6);
                        if (D7 > D6) {
                            int i9 = (D7 - D6) * 2;
                            this.f12699b.position(D6 << 2);
                            CharBuffer asCharBuffer = this.f12699b.asCharBuffer();
                            this.f12701d = asCharBuffer;
                            asCharBuffer.limit(i9);
                            i7 |= i9 - 1;
                        } else {
                            this.f12701d = f12688p;
                        }
                    } else {
                        this.f12701d = f12688p;
                    }
                    if (i4 > 7) {
                        this.f12710m = D(7);
                    }
                    if (!this.f12708k || this.f12701d.length() > 1) {
                        this.f12711n = new j(i7);
                    }
                    this.f12699b.position(0);
                    return;
                }
            }
            throw new ICUException("not enough bytes");
        }
        throw new ICUException("not enough indexes");
    }

    private static String U(byte[] bArr, int i4) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            byte b4 = bArr[i4];
            if (b4 == 0) {
                return sb.toString();
            }
            i4++;
            sb.append((char) b4);
        }
    }

    private String V(int i4, int i5) {
        if (i5 <= 16) {
            StringBuilder sb = new StringBuilder(i5);
            for (int i6 = 0; i6 < i5; i6++) {
                sb.append(this.f12699b.getChar(i4));
                i4 += 2;
            }
            return sb.toString();
        }
        int i7 = i4 / 2;
        return this.f12699b.asCharBuffer().subSequence(i7, i5 + i7).toString();
    }

    /* access modifiers changed from: private */
    public void W(int i4, u uVar) {
        int i5 = this.f12704g;
        if (i4 < i5) {
            uVar.l(this.f12700c, i4);
        } else {
            uVar.l(this.f12702e.f12700c, i4 - i5);
        }
    }

    /* access modifiers changed from: private */
    public void X(int i4, u uVar) {
        if (i4 >= 0) {
            uVar.l(this.f12700c, i4);
        } else {
            uVar.l(this.f12702e.f12700c, i4 & Integer.MAX_VALUE);
        }
    }

    static int a(int i4) {
        return (i4 << 4) >> 4;
    }

    /* access modifiers changed from: private */
    public static int b(int i4) {
        return i4 & 268435455;
    }

    static int c(int i4) {
        return i4 >>> 28;
    }

    static boolean d(int i4) {
        return i4 == 8 || i4 == 9;
    }

    static boolean e(int i4) {
        return i4 == 2 || i4 == 5 || i4 == 4;
    }

    /* access modifiers changed from: private */
    public int w(CharSequence charSequence, char c4) {
        int i4 = this.f12704g;
        if (c4 < i4) {
            return d.f(charSequence, this.f12700c, c4);
        }
        return d.f(charSequence, this.f12702e.f12700c, c4 - i4);
    }

    /* access modifiers changed from: private */
    public int x(CharSequence charSequence, int i4) {
        if (i4 >= 0) {
            return d.f(charSequence, this.f12700c, i4);
        }
        return d.f(charSequence, this.f12702e.f12700c, i4 & Integer.MAX_VALUE);
    }

    /* access modifiers changed from: package-private */
    public ByteBuffer A(int i4) {
        int b4 = b(i4);
        if (c(i4) != 1) {
            return null;
        }
        if (b4 == 0) {
            return f12692t.duplicate();
        }
        int L3 = L(b4);
        int E3 = E(L3);
        if (E3 == 0) {
            return f12692t.duplicate();
        }
        int i5 = L3 + 4;
        ByteBuffer duplicate = this.f12699b.duplicate();
        duplicate.position(i5).limit(i5 + E3);
        ByteBuffer v3 = d.v(duplicate);
        if (!v3.isReadOnly()) {
            return v3.asReadOnlyBuffer();
        }
        return v3;
    }

    /* access modifiers changed from: package-private */
    public int[] F(int i4) {
        int b4 = b(i4);
        if (c(i4) != 14) {
            return null;
        }
        if (b4 == 0) {
            return f12694v;
        }
        int L3 = L(b4);
        return G(L3 + 4, E(L3));
    }

    /* access modifiers changed from: package-private */
    public boolean J() {
        return this.f12707j;
    }

    /* access modifiers changed from: package-private */
    public int M() {
        return this.f12703f;
    }

    /* access modifiers changed from: package-private */
    public String N(int i4) {
        int b4 = b(i4);
        if (i4 != b4 && c(i4) != 6) {
            return null;
        }
        if (b4 == 0) {
            return "";
        }
        if (i4 != b4) {
            int i5 = this.f12705h;
            if (b4 < i5) {
                return this.f12702e.O(i4);
            }
            return O(i4 - i5);
        }
        Object d4 = this.f12711n.d(i4);
        if (d4 != null) {
            return (String) d4;
        }
        int L3 = L(b4);
        String V3 = V(L3 + 4, E(L3));
        return (String) this.f12711n.f(i4, V3, V3.length() * 2);
    }

    /* access modifiers changed from: package-private */
    public String O(int i4) {
        String str;
        char c4;
        int i5;
        int b4 = b(i4);
        Object d4 = this.f12711n.d(i4);
        if (d4 != null) {
            return (String) d4;
        }
        char charAt = this.f12701d.charAt(b4);
        if ((charAt & 64512) == 56320) {
            if (charAt < 57327) {
                c4 = charAt & 1023;
                i5 = b4 + 1;
            } else if (charAt < 57343) {
                c4 = ((charAt - 57327) << 16) | this.f12701d.charAt(b4 + 1);
                i5 = b4 + 2;
            } else {
                c4 = (this.f12701d.charAt(b4 + 1) << 16) | this.f12701d.charAt(b4 + 2);
                i5 = b4 + 3;
            }
            str = this.f12701d.subSequence(i5, c4 + i5).toString();
        } else if (charAt == 0) {
            return "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append((char) charAt);
            while (true) {
                b4++;
                char charAt2 = this.f12701d.charAt(b4);
                if (charAt2 == 0) {
                    break;
                }
                sb.append(charAt2);
            }
            str = sb.toString();
        }
        return (String) this.f12711n.f(i4, str, str.length() * 2);
    }

    /* access modifiers changed from: package-private */
    public n P(int i4) {
        int i5;
        n nVar;
        int a4;
        int c4 = c(i4);
        if (!e(c4)) {
            return null;
        }
        int b4 = b(i4);
        if (b4 == 0) {
            return f12696x;
        }
        Object d4 = this.f12711n.d(i4);
        if (d4 != null) {
            return (n) d4;
        }
        if (c4 == 2) {
            nVar = new k(this, b4);
            a4 = nVar.a();
        } else if (c4 == 5) {
            nVar = new l(this, b4);
            a4 = nVar.a();
        } else {
            nVar = new m(this, b4);
            i5 = nVar.a() * 4;
            return (n) this.f12711n.f(i4, nVar, i5);
        }
        i5 = a4 * 2;
        return (n) this.f12711n.f(i4, nVar, i5);
    }

    /* access modifiers changed from: package-private */
    public String y(int i4) {
        int b4 = b(i4);
        if (c(i4) != 3) {
            return null;
        }
        if (b4 == 0) {
            return "";
        }
        Object d4 = this.f12711n.d(i4);
        if (d4 != null) {
            return (String) d4;
        }
        int L3 = L(b4);
        int E3 = E(L3);
        return (String) this.f12711n.f(i4, V(L3 + 4, E3), E3 * 2);
    }

    /* access modifiers changed from: package-private */
    public d z(int i4) {
        Object obj;
        int c4 = c(i4);
        if (!d(c4)) {
            return null;
        }
        int b4 = b(i4);
        if (b4 == 0) {
            return f12695w;
        }
        Object d4 = this.f12711n.d(i4);
        if (d4 != null) {
            return (d) d4;
        }
        if (c4 == 8) {
            obj = new c(this, b4);
        } else {
            obj = new b(this, b4);
        }
        return (d) this.f12711n.f(i4, obj, 0);
    }

    private g() {
    }

    private g(ByteBuffer byteBuffer, String str, String str2, ClassLoader classLoader) {
        T(byteBuffer);
        if (this.f12709l) {
            g K3 = K(str, "pool", classLoader);
            this.f12702e = K3;
            if (K3 == null || !K3.f12708k) {
                throw new IllegalStateException("pool.res is not a pool bundle");
            } else if (K3.f12710m != this.f12710m) {
                throw new IllegalStateException("pool.res has a different checksum than this bundle");
            }
        }
    }
}
