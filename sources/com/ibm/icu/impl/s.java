package com.ibm.icu.impl;

import Z1.c;
import a2.j;
import com.ibm.icu.impl.Trie2;
import com.ibm.icu.impl.d;
import com.ibm.icu.impl.j;
import com.ibm.icu.lang.UScript;
import com.ibm.icu.text.UnicodeSet;
import com.ibm.icu.util.CodePointMap;
import com.ibm.icu.util.CodePointTrie;
import com.ibm.icu.util.ICUException;
import com.ibm.icu.util.ICUUncheckedIOException;
import com.ibm.icu.util.h;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.MissingResourceException;
import kotlin.uuid.Uuid;

public final class s {

    /* renamed from: k  reason: collision with root package name */
    public static final s f12970k;

    /* renamed from: l  reason: collision with root package name */
    private static final int f12971l = j(0);

    /* renamed from: m  reason: collision with root package name */
    private static final int f12972m = j(15);

    /* renamed from: n  reason: collision with root package name */
    private static final int f12973n = j(18);

    /* renamed from: o  reason: collision with root package name */
    private static final int f12974o;

    /* renamed from: p  reason: collision with root package name */
    private static final int f12975p;

    /* renamed from: q  reason: collision with root package name */
    private static final int f12976q;

    /* renamed from: r  reason: collision with root package name */
    private static final int f12977r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public static final int[] f12978s = {0, 0, 0, 0, 1, 0, 4, 5, 3, 2};

    /* renamed from: a  reason: collision with root package name */
    public m f12979a;

    /* renamed from: b  reason: collision with root package name */
    public h f12980b;

    /* renamed from: c  reason: collision with root package name */
    C[] f12981c;

    /* renamed from: d  reason: collision with root package name */
    G[] f12982d;

    /* renamed from: e  reason: collision with root package name */
    m f12983e;

    /* renamed from: f  reason: collision with root package name */
    int[] f12984f;

    /* renamed from: g  reason: collision with root package name */
    int f12985g;

    /* renamed from: h  reason: collision with root package name */
    int f12986h;

    /* renamed from: i  reason: collision with root package name */
    int f12987i;

    /* renamed from: j  reason: collision with root package name */
    public char[] f12988j;

    class A extends C {
        A(int i4) {
            super(i4);
        }

        /* access modifiers changed from: package-private */
        public boolean a(int i4) {
            if (c.m(i4) == 12 || s.r(i4)) {
                return true;
            }
            return false;
        }
    }

    private class B extends G {
        B() {
            super(5);
        }

        /* access modifiers changed from: package-private */
        public int a(int i4) {
            return o.f12924f.g(i4);
        }
    }

    private class D extends C {

        /* renamed from: d  reason: collision with root package name */
        int f12994d;

        D(int i4) {
            super(4);
            this.f12994d = i4;
        }

        /* access modifiers changed from: package-private */
        public boolean a(int i4) {
            return p.f12932g.p(i4, this.f12994d);
        }
    }

    private class E extends G {
        E(int i4) {
            super(i4);
        }

        /* access modifiers changed from: package-private */
        public int a(int i4) {
            return 255;
        }
    }

    private class F extends C {

        /* renamed from: d  reason: collision with root package name */
        int f12997d;

        F(int i4) {
            super(15);
            this.f12997d = i4;
        }

        /* access modifiers changed from: package-private */
        public boolean a(int i4) {
            return c.f12671d.d(i4, this.f12997d);
        }
    }

    private static final class H implements d.b {
        private H() {
        }

        public boolean a(byte[] bArr) {
            if (bArr[0] == 7) {
                return true;
            }
            return false;
        }

        /* synthetic */ H(C0592k kVar) {
            this();
        }
    }

    private static final class I {

        /* renamed from: g  reason: collision with root package name */
        private static final a f13003g = new a((C0592k) null);

        /* renamed from: h  reason: collision with root package name */
        static final I f13004h = new I();

        /* renamed from: a  reason: collision with root package name */
        CodePointTrie f13005a = null;

        /* renamed from: b  reason: collision with root package name */
        CodePointTrie f13006b = null;

        /* renamed from: c  reason: collision with root package name */
        CodePointTrie f13007c = null;

        /* renamed from: d  reason: collision with root package name */
        int f13008d = 0;

        /* renamed from: e  reason: collision with root package name */
        int f13009e = 0;

        /* renamed from: f  reason: collision with root package name */
        int f13010f = 0;

        private static final class a implements d.b {
            private a() {
            }

            public boolean a(byte[] bArr) {
                if (bArr[0] == 1) {
                    return true;
                }
                return false;
            }

            /* synthetic */ a(C0592k kVar) {
                this();
            }
        }

        I() {
            ByteBuffer o4 = d.o("ulayout.icu");
            try {
                d.t(o4, 1281456495, f13003g);
                int position = o4.position();
                int i4 = o4.getInt();
                if (i4 >= 12) {
                    int[] iArr = new int[i4];
                    iArr[0] = i4;
                    for (int i5 = 1; i5 < i4; i5++) {
                        iArr[i5] = o4.getInt();
                    }
                    int i6 = iArr[1];
                    if (i6 - (i4 * 4) >= 16) {
                        this.f13005a = CodePointTrie.i((CodePointTrie.Type) null, (CodePointTrie.ValueWidth) null, o4);
                    }
                    d.u(o4, i6 - (o4.position() - position));
                    int i7 = iArr[2];
                    if (i7 - i6 >= 16) {
                        this.f13006b = CodePointTrie.i((CodePointTrie.Type) null, (CodePointTrie.ValueWidth) null, o4);
                    }
                    d.u(o4, i7 - (o4.position() - position));
                    int i8 = iArr[3];
                    if (i8 - i7 >= 16) {
                        this.f13007c = CodePointTrie.i((CodePointTrie.Type) null, (CodePointTrie.ValueWidth) null, o4);
                    }
                    d.u(o4, i8 - (o4.position() - position));
                    int i9 = iArr[9];
                    this.f13008d = i9 >>> 24;
                    this.f13009e = (i9 >> 16) & 255;
                    this.f13010f = (i9 >> 8) & 255;
                    return;
                }
                throw new ICUUncheckedIOException("Text layout properties data: not enough indexes");
            } catch (IOException e4) {
                throw new ICUUncheckedIOException((Throwable) e4);
            }
        }

        public UnicodeSet a(int i4, UnicodeSet unicodeSet) {
            CodePointTrie codePointTrie;
            switch (i4) {
                case 12:
                    codePointTrie = this.f13005a;
                    break;
                case 13:
                    codePointTrie = this.f13006b;
                    break;
                case 14:
                    codePointTrie = this.f13007c;
                    break;
                default:
                    throw new IllegalStateException();
            }
            if (codePointTrie != null) {
                CodePointMap.b bVar = new CodePointMap.b();
                for (int i5 = 0; codePointTrie.c(i5, (CodePointMap.d) null, bVar); i5 = bVar.f() + 1) {
                    unicodeSet.l(i5);
                }
                return unicodeSet;
            }
            throw new MissingResourceException("no data for one of the text layout properties; src=" + i4, "LayoutProps", "");
        }
    }

    private class J extends C {

        /* renamed from: d  reason: collision with root package name */
        int f13011d;

        J(int i4, int i5) {
            super(i4);
            this.f13011d = i5;
        }

        /* access modifiers changed from: package-private */
        public boolean a(int i4) {
            return i.c(this.f13011d - 37).h(i4);
        }
    }

    private class K extends G {

        /* renamed from: e  reason: collision with root package name */
        int f13013e;

        /* renamed from: f  reason: collision with root package name */
        int f13014f;

        K(int i4, int i5, int i6) {
            super(i4);
            this.f13013e = i5;
            this.f13014f = i6;
        }

        /* access modifiers changed from: package-private */
        public int a(int i4) {
            return this.f13014f;
        }

        /* access modifiers changed from: package-private */
        public int c(int i4) {
            return i.c(this.f13013e - 4108).o(i4);
        }
    }

    /* renamed from: com.ibm.icu.impl.s$a  reason: case insensitive filesystem */
    class C0582a extends C {
        C0582a(int i4) {
            super(i4);
        }

        /* access modifiers changed from: package-private */
        public boolean a(int i4) {
            if ((i4 > 102 || i4 < 65 || (i4 > 70 && i4 < 97)) && ((i4 < 65313 || i4 > 65350 || (i4 > 65318 && i4 < 65345)) && c.m(i4) != 9)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.ibm.icu.impl.s$b  reason: case insensitive filesystem */
    class C0583b extends C {
        C0583b(int i4) {
            super(i4);
        }

        /* access modifiers changed from: package-private */
        public boolean a(int i4) {
            String y3 = i.d().f12733a.y(i4);
            if (y3 != null) {
                i4 = y3.codePointAt(0);
                if (Character.charCount(i4) != y3.length()) {
                    i4 = -1;
                }
            } else if (i4 < 0) {
                return false;
            }
            if (i4 < 0) {
                return !c.b(y3, true).equals(y3);
            }
            p pVar = p.f12932g;
            StringBuilder sb = p.f12931f;
            sb.setLength(0);
            if (pVar.D(i4, sb, 0) >= 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ibm.icu.impl.s$c  reason: case insensitive filesystem */
    class C0584c extends C {
        C0584c(int i4) {
            super(i4);
        }

        /* access modifiers changed from: package-private */
        public boolean a(int i4) {
            j jVar = i.f().f12733a;
            String k4 = j.k(i4);
            StringBuilder sb = new StringBuilder();
            String str = k4;
            jVar.e(str, 0, k4.length(), false, true, new j.d(jVar, sb, 5));
            return !j.e.b(sb, k4);
        }
    }

    /* renamed from: com.ibm.icu.impl.s$d  reason: case insensitive filesystem */
    class C0585d extends C {
        C0585d(int i4) {
            super(i4);
        }

        /* access modifiers changed from: package-private */
        public boolean a(int i4) {
            return 127462 <= i4 && i4 <= 127487;
        }
    }

    /* renamed from: com.ibm.icu.impl.s$e  reason: case insensitive filesystem */
    class C0586e extends B {
        C0586e() {
            super();
        }

        /* access modifiers changed from: package-private */
        public int c(int i4) {
            return o.f12924f.b(i4);
        }
    }

    /* renamed from: com.ibm.icu.impl.s$f  reason: case insensitive filesystem */
    class C0587f extends E {
        C0587f(int i4) {
            super(i4);
        }

        /* access modifiers changed from: package-private */
        public int c(int i4) {
            return com.ibm.icu.text.c.d().b(i4);
        }
    }

    /* renamed from: com.ibm.icu.impl.s$g  reason: case insensitive filesystem */
    class C0588g extends G {
        C0588g(int i4) {
            super(i4);
        }

        /* access modifiers changed from: package-private */
        public int a(int i4) {
            return 29;
        }

        /* access modifiers changed from: package-private */
        public int c(int i4) {
            return s.this.o(i4);
        }
    }

    /* renamed from: com.ibm.icu.impl.s$h  reason: case insensitive filesystem */
    class C0589h extends B {
        C0589h() {
            super();
        }

        /* access modifiers changed from: package-private */
        public int c(int i4) {
            return o.f12924f.e(i4);
        }
    }

    /* renamed from: com.ibm.icu.impl.s$i  reason: case insensitive filesystem */
    class C0590i extends B {
        C0590i() {
            super();
        }

        /* access modifiers changed from: package-private */
        public int c(int i4) {
            return o.f12924f.f(i4);
        }
    }

    /* renamed from: com.ibm.icu.impl.s$j  reason: case insensitive filesystem */
    class C0591j extends G {
        C0591j(int i4) {
            super(i4);
        }

        /* access modifiers changed from: package-private */
        public int a(int i4) {
            return 3;
        }

        /* access modifiers changed from: package-private */
        public int c(int i4) {
            return s.t(s.l(s.this.m(i4)));
        }
    }

    /* renamed from: com.ibm.icu.impl.s$k  reason: case insensitive filesystem */
    class C0592k extends C {
        C0592k(int i4) {
            super(i4);
        }

        /* access modifiers changed from: package-private */
        public boolean a(int i4) {
            return o.f12924f.j(i4);
        }
    }

    class l extends G {
        l(int i4) {
            super(i4);
        }

        /* access modifiers changed from: package-private */
        public int a(int i4) {
            return s.s(s.this.k(0) & 15728895);
        }

        /* access modifiers changed from: package-private */
        public int c(int i4) {
            return UScript.b(i4);
        }
    }

    class m extends G {
        m(int i4) {
            super(i4);
        }

        /* access modifiers changed from: package-private */
        public int a(int i4) {
            return 5;
        }

        /* access modifiers changed from: package-private */
        public int c(int i4) {
            int f4 = (s.this.f(i4, 2) & 992) >>> 5;
            if (f4 < s.f12978s.length) {
                return s.f12978s[f4];
            }
            return 0;
        }
    }

    class n extends E {
        n(int i4) {
            super(i4);
        }

        /* access modifiers changed from: package-private */
        public int c(int i4) {
            return i.d().f12733a.z(i4) >> 8;
        }
    }

    class o extends E {
        o(int i4) {
            super(i4);
        }

        /* access modifiers changed from: package-private */
        public int c(int i4) {
            return i.d().f12733a.z(i4) & 255;
        }
    }

    class p extends B {
        p() {
            super();
        }

        /* access modifiers changed from: package-private */
        public int c(int i4) {
            return o.f12924f.i(i4);
        }
    }

    class q extends G {
        q(int i4) {
            super(i4);
        }

        /* access modifiers changed from: package-private */
        public int a(int i4) {
            return I.f13004h.f13008d;
        }

        /* access modifiers changed from: package-private */
        public int c(int i4) {
            CodePointTrie codePointTrie = I.f13004h.f13005a;
            if (codePointTrie != null) {
                return codePointTrie.j(i4);
            }
            return 0;
        }
    }

    class r extends G {
        r(int i4) {
            super(i4);
        }

        /* access modifiers changed from: package-private */
        public int a(int i4) {
            return I.f13004h.f13009e;
        }

        /* access modifiers changed from: package-private */
        public int c(int i4) {
            CodePointTrie codePointTrie = I.f13004h.f13006b;
            if (codePointTrie != null) {
                return codePointTrie.j(i4);
            }
            return 0;
        }
    }

    /* renamed from: com.ibm.icu.impl.s$s  reason: collision with other inner class name */
    class C0180s extends G {
        C0180s(int i4) {
            super(i4);
        }

        /* access modifiers changed from: package-private */
        public int a(int i4) {
            return I.f13004h.f13010f;
        }

        /* access modifiers changed from: package-private */
        public int c(int i4) {
            CodePointTrie codePointTrie = I.f13004h.f13007c;
            if (codePointTrie != null) {
                return codePointTrie.j(i4);
            }
            return 0;
        }
    }

    class t extends C {
        t(int i4) {
            super(i4);
        }

        /* access modifiers changed from: package-private */
        public boolean a(int i4) {
            return o.f12924f.l(i4);
        }
    }

    class u extends C {
        u(int i4) {
            super(i4);
        }

        /* access modifiers changed from: package-private */
        public boolean a(int i4) {
            j jVar = i.d().f12733a;
            return jVar.Q(jVar.B(i4));
        }
    }

    class v extends C {
        v(int i4) {
            super(i4);
        }

        /* access modifiers changed from: package-private */
        public boolean a(int i4) {
            return o.f12924f.k(i4);
        }
    }

    class w extends C {
        w(int i4) {
            super(i4);
        }

        /* access modifiers changed from: package-private */
        public boolean a(int i4) {
            return i.d().f12733a.l().O(i4);
        }
    }

    class x extends C {
        x(int i4) {
            super(i4);
        }

        /* access modifiers changed from: package-private */
        public boolean a(int i4) {
            if (c.q(i4) || c.p(i4)) {
                return true;
            }
            return false;
        }
    }

    class y extends C {
        y(int i4) {
            super(i4);
        }

        /* access modifiers changed from: package-private */
        public boolean a(int i4) {
            if (i4 <= 159) {
                if (i4 == 9 || i4 == 32) {
                    return true;
                }
                return false;
            } else if (c.m(i4) == 12) {
                return true;
            } else {
                return false;
            }
        }
    }

    class z extends C {
        z(int i4) {
            super(i4);
        }

        /* access modifiers changed from: package-private */
        public boolean a(int i4) {
            return s.r(i4);
        }
    }

    static {
        int j4 = j(12);
        f12974o = j4;
        int j5 = j(13);
        f12975p = j5;
        int j6 = j(14);
        f12976q = j6;
        f12977r = j4 | j5 | j6;
        try {
            f12970k = new s();
        } catch (IOException e4) {
            throw new MissingResourceException(e4.getMessage(), "", "");
        }
    }

    private s() {
        int i4;
        C c4 = new C(1, 256);
        C c5 = new C(1, Uuid.SIZE_BITS);
        C0592k kVar = new C0592k(5);
        t tVar = new t(5);
        C c6 = new C(1, 2);
        C c7 = new C(1, 524288);
        C c8 = new C(1, 1048576);
        C c9 = new C(1, 1024);
        C c10 = new C(1, 2048);
        u uVar = new u(8);
        C c11 = new C(1, 67108864);
        C c12 = new C(1, 8192);
        C c13 = new C(1, 16384);
        C c14 = new C(1, 64);
        C c15 = new C(1, 4);
        C c16 = new C(1, 33554432);
        C c17 = new C(1, 16777216);
        C c18 = new C(1, 512);
        C c19 = new C(1, 32768);
        C c20 = new C(1, 65536);
        v vVar = new v(5);
        C c21 = new C(1, 2097152);
        D d4 = new D(22);
        C c22 = new C(1, 32);
        C c23 = new C(1, 4096);
        C c24 = new C(1, 8);
        C c25 = new C(1, 131072);
        D d5 = new D(27);
        C c26 = new C(1, 16);
        C c27 = new C(1, 262144);
        D d6 = new D(30);
        C c28 = new C(1, 1);
        C c29 = c27;
        C c30 = new C(1, 8388608);
        C c31 = new C(1, 4194304);
        D d7 = new D(34);
        C c32 = new C(1, 134217728);
        C c33 = new C(1, 268435456);
        J j4 = new J(8, 37);
        J j5 = new J(9, 38);
        J j6 = new J(8, 39);
        J j7 = new J(9, 40);
        w wVar = new w(11);
        C c34 = new C(1, 536870912);
        C c35 = new C(1, 1073741824);
        C c36 = c35;
        C[] cArr = {c4, c5, kVar, tVar, c6, c7, c8, c9, c10, uVar, c11, c12, c13, c14, c15, c16, c17, c18, c19, c20, vVar, c21, d4, c22, c23, c24, c25, d5, c26, c29, d6, c28, c30, c31, d7, c32, c33, j4, j5, j6, j7, wVar, c34, c36, new x(6), new y(1), new z(1), new A(1), new C0582a(1), new D(49), new D(50), new D(51), new D(52), new D(53), new C0583b(7), new D(55), new C0584c(10), new F(57), new F(58), new F(59), new F(60), new F(61), new C0585d(2), new C(1, Integer.MIN_VALUE), new F(64), new F(65), new F(66), new F(67), new F(68), new F(69), new F(70), new F(71)};
        this.f12981c = cArr;
        C0586e eVar = new C0586e();
        G g4 = new G(0, 130816, 8);
        C0587f fVar = new C0587f(8);
        G g5 = new G(2, 31, 0);
        G g6 = new G(0, 917504, 17);
        C0588g gVar = new C0588g(1);
        C0589h hVar = new C0589h();
        C0590i iVar = new C0590i();
        G g7 = new G(2, 66060288, 20);
        C0591j jVar = new C0591j(1);
        l lVar = new l(2);
        m mVar = new m(2);
        K k4 = new K(8, 4108, 1);
        K k5 = new K(9, 4109, 1);
        K k6 = new K(8, 4110, 2);
        K k7 = new K(9, 4111, 2);
        n nVar = new n(8);
        n nVar2 = nVar;
        K k8 = k7;
        G[] gArr = {eVar, g4, fVar, g5, g6, gVar, hVar, iVar, g7, jVar, lVar, mVar, k4, k5, k6, k8, nVar2, new o(8), new G(2, 992, 5), new G(2, 1015808, 15), new G(2, 31744, 10), new p(), new q(12), new r(13), new C0180s(14)};
        this.f12982d = gArr;
        if (this.f12981c.length != 72) {
            throw new ICUException("binProps.length!=UProperty.BINARY_LIMIT");
        } else if (gArr.length == 25) {
            ByteBuffer o4 = d.o("uprops.icu");
            this.f12980b = d.t(o4, 1431335535, new H((C0592k) null));
            int i5 = o4.getInt();
            o4.getInt();
            o4.getInt();
            int i6 = o4.getInt();
            int i7 = o4.getInt();
            this.f12985g = o4.getInt();
            int i8 = o4.getInt();
            int i9 = o4.getInt();
            o4.getInt();
            o4.getInt();
            this.f12986h = o4.getInt();
            this.f12987i = o4.getInt();
            d.u(o4, 16);
            m n4 = m.n(o4);
            this.f12979a = n4;
            int i10 = (i5 - 16) * 4;
            int o5 = n4.o();
            if (o5 <= i10) {
                d.u(o4, i10 - o5);
                d.u(o4, (i6 - i5) * 4);
                if (this.f12985g > 0) {
                    m n5 = m.n(o4);
                    this.f12983e = n5;
                    int i11 = (i7 - i6) * 4;
                    int o6 = n5.o();
                    if (o6 <= i11) {
                        d.u(o4, i11 - o6);
                        i4 = 0;
                        this.f12984f = d.n(o4, i8 - i7, 0);
                    } else {
                        throw new IOException("uprops.icu: not enough bytes for additional-properties trie");
                    }
                } else {
                    i4 = 0;
                }
                int i12 = (i9 - i8) * 2;
                if (i12 > 0) {
                    this.f12988j = d.i(o4, i12, i4);
                    return;
                }
                return;
            }
            throw new IOException("uprops.icu: not enough bytes for main trie");
        } else {
            throw new ICUException("intProps.length!=(UProperty.INT_LIMIT-UProperty.INT_START)");
        }
    }

    public static final int j(int i4) {
        return 1 << i4;
    }

    /* access modifiers changed from: private */
    public static final int l(int i4) {
        return i4 >> 6;
    }

    /* access modifiers changed from: private */
    public static final boolean r(int i4) {
        if ((j(c.m(i4)) & (f12972m | f12973n | f12971l | f12977r)) == 0) {
            return true;
        }
        return false;
    }

    public static final int s(int i4) {
        return (i4 & 255) | ((3145728 & i4) >> 12);
    }

    /* access modifiers changed from: private */
    public static final int t(int i4) {
        if (i4 == 0) {
            return 0;
        }
        if (i4 < 11) {
            return 1;
        }
        return i4 < 21 ? 2 : 3;
    }

    static UnicodeSet u(int i4, UnicodeSet unicodeSet) {
        return I.f13004h.a(i4, unicodeSet);
    }

    public UnicodeSet e(UnicodeSet unicodeSet) {
        Iterator it = this.f12979a.iterator();
        while (it.hasNext()) {
            Trie2.c cVar = (Trie2.c) it.next();
            if (cVar.f12586d) {
                break;
            }
            unicodeSet.l(cVar.f12583a);
        }
        unicodeSet.l(9);
        unicodeSet.l(10);
        unicodeSet.l(14);
        unicodeSet.l(28);
        unicodeSet.l(32);
        unicodeSet.l(133);
        unicodeSet.l(134);
        unicodeSet.l(127);
        unicodeSet.l(8202);
        unicodeSet.l(8208);
        unicodeSet.l(8298);
        unicodeSet.l(8304);
        unicodeSet.l(65279);
        unicodeSet.l(65280);
        unicodeSet.l(160);
        unicodeSet.l(161);
        unicodeSet.l(8199);
        unicodeSet.l(8200);
        unicodeSet.l(8239);
        unicodeSet.l(8240);
        unicodeSet.l(12295);
        unicodeSet.l(12296);
        unicodeSet.l(19968);
        unicodeSet.l(19969);
        unicodeSet.l(20108);
        unicodeSet.l(20109);
        unicodeSet.l(19977);
        unicodeSet.l(19978);
        unicodeSet.l(22235);
        unicodeSet.l(22236);
        unicodeSet.l(20116);
        unicodeSet.l(20117);
        unicodeSet.l(20845);
        unicodeSet.l(20846);
        unicodeSet.l(19971);
        unicodeSet.l(19972);
        unicodeSet.l(20843);
        unicodeSet.l(20844);
        unicodeSet.l(20061);
        unicodeSet.l(20062);
        unicodeSet.l(97);
        unicodeSet.l(123);
        unicodeSet.l(65);
        unicodeSet.l(91);
        unicodeSet.l(65345);
        unicodeSet.l(65371);
        unicodeSet.l(65313);
        unicodeSet.l(65339);
        unicodeSet.l(103);
        unicodeSet.l(71);
        unicodeSet.l(65351);
        unicodeSet.l(65319);
        unicodeSet.l(8288);
        unicodeSet.l(65520);
        unicodeSet.l(65532);
        unicodeSet.l(917504);
        unicodeSet.l(921600);
        unicodeSet.l(847);
        unicodeSet.l(848);
        return unicodeSet;
    }

    public int f(int i4, int i5) {
        if (i5 >= this.f12985g) {
            return 0;
        }
        return this.f12984f[this.f12983e.f(i4) + i5];
    }

    public h g(int i4) {
        int f4 = f(i4, 0);
        return h.c((f4 >> 28) & 15, (f4 >> 24) & 15, 0, 0);
    }

    public int h(int i4) {
        if (i4 < 4096) {
            if (i4 < 0 || i4 >= 72) {
                return -1;
            }
            return 1;
        } else if (i4 < 4121) {
            return this.f12982d[i4 - 4096].a(i4);
        } else {
            return -1;
        }
    }

    public int i(int i4, int i5) {
        if (i5 < 4096) {
            if (i5 < 0 || i5 >= 72) {
                return 0;
            }
            return this.f12981c[i5].a(i4) ? 1 : 0;
        } else if (i5 < 4121) {
            return this.f12982d[i5 - 4096].c(i4);
        } else {
            if (i5 == 8192) {
                return j(o(i4));
            }
            return 0;
        }
    }

    public int k(int i4) {
        if (i4 == 0) {
            return this.f12986h;
        }
        if (i4 != 2) {
            return 0;
        }
        return this.f12987i;
    }

    public final int m(int i4) {
        return this.f12979a.f(i4);
    }

    /* access modifiers changed from: package-private */
    public final int n(int i4) {
        if (i4 < 0) {
            return 0;
        }
        if (i4 < 72) {
            return this.f12981c[i4].b();
        }
        if (i4 < 4096) {
            return 0;
        }
        if (i4 < 4121) {
            return this.f12982d[i4 - 4096].b();
        }
        if (i4 < 16384) {
            if (i4 == 8192 || i4 == 12288) {
                return 1;
            }
            return 0;
        } else if (i4 < 16398) {
            switch (i4) {
                case 16384:
                    return 2;
                case 16385:
                    return 5;
                case 16386:
                case 16388:
                case 16390:
                case 16391:
                case 16392:
                case 16393:
                case 16394:
                case 16396:
                    return 4;
                case 16387:
                case 16389:
                case 16395:
                    return 3;
                default:
                    return 0;
            }
        } else if (i4 != 28672) {
            return 0;
        } else {
            return 2;
        }
    }

    public int o(int i4) {
        return m(i4) & 31;
    }

    public double p(int i4) {
        int i5;
        double d4;
        int l4 = l(m(i4));
        if (l4 == 0) {
            return -1.23456789E8d;
        }
        if (l4 < 11) {
            return (double) (l4 - 1);
        }
        if (l4 < 21) {
            return (double) (l4 - 11);
        }
        if (l4 < 176) {
            return (double) (l4 - 21);
        }
        if (l4 < 480) {
            return ((double) ((l4 >> 4) - 12)) / ((double) ((l4 & 15) + 1));
        }
        if (l4 < 768) {
            int i6 = (l4 & 31) + 2;
            double d5 = (double) ((l4 >> 5) - 14);
            while (i6 >= 4) {
                d5 *= 10000.0d;
                i6 -= 4;
            }
            if (i6 == 1) {
                d4 = 10.0d;
            } else if (i6 == 2) {
                d4 = 100.0d;
            } else if (i6 != 3) {
                return d5;
            } else {
                d4 = 1000.0d;
            }
            return d5 * d4;
        } else if (l4 < 804) {
            int i7 = (l4 >> 2) - 191;
            int i8 = (l4 & 3) + 1;
            if (i8 == 1) {
                i7 *= 60;
            } else if (i8 != 2) {
                if (i8 == 3) {
                    i5 = 216000;
                } else if (i8 == 4) {
                    i5 = 12960000;
                }
                i7 *= i5;
            } else {
                i7 *= 3600;
            }
            return (double) i7;
        } else if (l4 < 828) {
            int i9 = l4 - 804;
            return ((double) (((i9 & 3) * 2) + 1)) / ((double) (20 << (i9 >> 2)));
        } else if (l4 >= 844) {
            return -1.23456789E8d;
        } else {
            int i10 = l4 - 828;
            return ((double) (((i10 & 3) * 2) + 1)) / ((double) (32 << (i10 >> 2)));
        }
    }

    public boolean q(int i4, int i5) {
        if (i5 < 0 || 72 <= i5) {
            return false;
        }
        return this.f12981c[i5].a(i4);
    }

    public void v(UnicodeSet unicodeSet) {
        if (this.f12985g > 0) {
            Iterator it = this.f12983e.iterator();
            while (it.hasNext()) {
                Trie2.c cVar = (Trie2.c) it.next();
                if (!cVar.f12586d) {
                    unicodeSet.l(cVar.f12583a);
                } else {
                    return;
                }
            }
        }
    }

    private class C {

        /* renamed from: a  reason: collision with root package name */
        int f12991a;

        /* renamed from: b  reason: collision with root package name */
        int f12992b;

        C(int i4, int i5) {
            this.f12991a = i4;
            this.f12992b = i5;
        }

        /* access modifiers changed from: package-private */
        public boolean a(int i4) {
            if ((s.this.f(i4, this.f12991a) & this.f12992b) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public final int b() {
            if (this.f12992b == 0) {
                return this.f12991a;
            }
            return 2;
        }

        C(int i4) {
            this.f12991a = i4;
            this.f12992b = 0;
        }
    }

    private class G {

        /* renamed from: a  reason: collision with root package name */
        int f12999a;

        /* renamed from: b  reason: collision with root package name */
        int f13000b;

        /* renamed from: c  reason: collision with root package name */
        int f13001c;

        G(int i4, int i5, int i6) {
            this.f12999a = i4;
            this.f13000b = i5;
            this.f13001c = i6;
        }

        /* access modifiers changed from: package-private */
        public int a(int i4) {
            return (s.this.k(this.f12999a) & this.f13000b) >>> this.f13001c;
        }

        /* access modifiers changed from: package-private */
        public final int b() {
            if (this.f13000b == 0) {
                return this.f12999a;
            }
            return 2;
        }

        /* access modifiers changed from: package-private */
        public int c(int i4) {
            return (s.this.f(i4, this.f12999a) & this.f13000b) >>> this.f13001c;
        }

        G(int i4) {
            this.f12999a = i4;
            this.f13000b = 0;
        }
    }
}
