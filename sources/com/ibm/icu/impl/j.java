package com.ibm.icu.impl;

import com.ibm.icu.impl.d;
import com.ibm.icu.text.UnicodeSet;
import com.ibm.icu.util.CodePointMap;
import com.ibm.icu.util.CodePointTrie;
import com.ibm.icu.util.ICUUncheckedIOException;
import com.ibm.icu.util.h;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public final class j {

    /* renamed from: t  reason: collision with root package name */
    private static final c f12745t = new c((a) null);

    /* renamed from: u  reason: collision with root package name */
    private static final CodePointMap.d f12746u = new a();

    /* renamed from: a  reason: collision with root package name */
    private h f12747a;

    /* renamed from: b  reason: collision with root package name */
    private int f12748b;

    /* renamed from: c  reason: collision with root package name */
    private int f12749c;

    /* renamed from: d  reason: collision with root package name */
    private int f12750d;

    /* renamed from: e  reason: collision with root package name */
    private int f12751e;

    /* renamed from: f  reason: collision with root package name */
    private int f12752f;

    /* renamed from: g  reason: collision with root package name */
    private int f12753g;

    /* renamed from: h  reason: collision with root package name */
    private int f12754h;

    /* renamed from: i  reason: collision with root package name */
    private int f12755i;

    /* renamed from: j  reason: collision with root package name */
    private int f12756j;

    /* renamed from: k  reason: collision with root package name */
    private int f12757k;

    /* renamed from: l  reason: collision with root package name */
    private int f12758l;

    /* renamed from: m  reason: collision with root package name */
    private int f12759m;

    /* renamed from: n  reason: collision with root package name */
    private CodePointTrie.f f12760n;

    /* renamed from: o  reason: collision with root package name */
    private String f12761o;

    /* renamed from: p  reason: collision with root package name */
    private String f12762p;

    /* renamed from: q  reason: collision with root package name */
    private byte[] f12763q;

    /* renamed from: r  reason: collision with root package name */
    private CodePointTrie f12764r;

    /* renamed from: s  reason: collision with root package name */
    private ArrayList f12765s;

    static class a implements CodePointMap.d {
        a() {
        }

        public int a(int i4) {
            return i4 & Integer.MIN_VALUE;
        }
    }

    public static final class b {
        public static int a(int i4, Appendable appendable) {
            int i5 = i4 - 44032;
            try {
                int i6 = i5 % 28;
                int i7 = i5 / 28;
                appendable.append((char) ((i7 / 21) + 4352));
                appendable.append((char) ((i7 % 21) + 4449));
                if (i6 == 0) {
                    return 2;
                }
                appendable.append((char) (i6 + 4519));
                return 3;
            } catch (IOException e4) {
                throw new ICUUncheckedIOException((Throwable) e4);
            }
        }

        public static boolean b(int i4) {
            int i5 = i4 - 44032;
            if (i5 < 0 || i5 >= 11172 || i5 % 28 != 0) {
                return false;
            }
            return true;
        }
    }

    private static final class c implements d.b {
        private c() {
        }

        public boolean a(byte[] bArr) {
            if (bArr[0] == 4) {
                return true;
            }
            return false;
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    public static final class d implements Appendable {

        /* renamed from: a  reason: collision with root package name */
        private final j f12766a;

        /* renamed from: b  reason: collision with root package name */
        private final Appendable f12767b;

        /* renamed from: c  reason: collision with root package name */
        private final StringBuilder f12768c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f12769d;

        /* renamed from: e  reason: collision with root package name */
        private int f12770e;

        /* renamed from: f  reason: collision with root package name */
        private int f12771f;

        /* renamed from: g  reason: collision with root package name */
        private int f12772g;

        /* renamed from: h  reason: collision with root package name */
        private int f12773h;

        public d(j jVar, Appendable appendable, int i4) {
            this.f12766a = jVar;
            this.f12767b = appendable;
            if (appendable instanceof StringBuilder) {
                this.f12769d = true;
                StringBuilder sb = (StringBuilder) appendable;
                this.f12768c = sb;
                sb.ensureCapacity(i4);
                this.f12770e = 0;
                if (sb.length() == 0) {
                    this.f12771f = 0;
                    return;
                }
                q();
                int n4 = n();
                this.f12771f = n4;
                if (n4 > 1) {
                    do {
                    } while (n() > 1);
                }
                this.f12770e = this.f12773h;
                return;
            }
            this.f12769d = false;
            this.f12768c = new StringBuilder();
            this.f12770e = 0;
            this.f12771f = 0;
        }

        private void k(int i4, int i5) {
            q();
            r();
            do {
            } while (n() > i5);
            if (i4 <= 65535) {
                this.f12768c.insert(this.f12773h, (char) i4);
                if (i5 <= 1) {
                    this.f12770e = this.f12773h + 1;
                    return;
                }
                return;
            }
            this.f12768c.insert(this.f12773h, Character.toChars(i4));
            if (i5 <= 1) {
                this.f12770e = this.f12773h + 2;
            }
        }

        private int n() {
            int i4 = this.f12772g;
            this.f12773h = i4;
            if (this.f12770e >= i4) {
                return 0;
            }
            int codePointBefore = this.f12768c.codePointBefore(i4);
            this.f12772g -= Character.charCount(codePointBefore);
            return this.f12766a.u(codePointBefore);
        }

        private void q() {
            this.f12772g = this.f12768c.length();
        }

        private void r() {
            int i4 = this.f12772g;
            this.f12773h = i4;
            this.f12772g = this.f12768c.offsetByCodePoints(i4, -1);
        }

        /* renamed from: a */
        public d append(char c4) {
            this.f12768c.append(c4);
            this.f12771f = 0;
            this.f12770e = this.f12768c.length();
            return this;
        }

        /* renamed from: b */
        public d append(CharSequence charSequence) {
            if (charSequence.length() != 0) {
                this.f12768c.append(charSequence);
                this.f12771f = 0;
                this.f12770e = this.f12768c.length();
            }
            return this;
        }

        /* renamed from: c */
        public d append(CharSequence charSequence, int i4, int i5) {
            if (i4 != i5) {
                this.f12768c.append(charSequence, i4, i5);
                this.f12771f = 0;
                this.f12770e = this.f12768c.length();
            }
            return this;
        }

        public void d(int i4, int i5) {
            if (this.f12771f <= i5 || i5 == 0) {
                this.f12768c.appendCodePoint(i4);
                this.f12771f = i5;
                if (i5 <= 1) {
                    this.f12770e = this.f12768c.length();
                    return;
                }
                return;
            }
            k(i4, i5);
        }

        public void e(CharSequence charSequence, int i4, int i5, boolean z3, int i6, int i7) {
            int i8;
            if (i4 != i5) {
                if (this.f12771f <= i6 || i6 == 0) {
                    if (i7 <= 1) {
                        this.f12770e = this.f12768c.length() + (i5 - i4);
                    } else if (i6 <= 1) {
                        this.f12770e = this.f12768c.length() + 1;
                    }
                    this.f12768c.append(charSequence, i4, i5);
                    this.f12771f = i7;
                    return;
                }
                int codePointAt = Character.codePointAt(charSequence, i4);
                int charCount = i4 + Character.charCount(codePointAt);
                k(codePointAt, i6);
                while (charCount < i5) {
                    int codePointAt2 = Character.codePointAt(charSequence, charCount);
                    charCount += Character.charCount(codePointAt2);
                    if (charCount >= i5) {
                        i8 = i7;
                    } else if (z3) {
                        i8 = j.t(this.f12766a.B(codePointAt2));
                    } else {
                        j jVar = this.f12766a;
                        i8 = jVar.q(jVar.B(codePointAt2));
                    }
                    d(codePointAt2, i8);
                }
            }
        }

        public void f(int i4) {
            this.f12768c.appendCodePoint(i4);
            this.f12771f = 0;
            this.f12770e = this.f12768c.length();
        }

        public boolean g(CharSequence charSequence, int i4, int i5) {
            StringBuilder sb = this.f12768c;
            return e.a(sb, 0, sb.length(), charSequence, i4, i5);
        }

        public void h() {
            if (this.f12769d) {
                this.f12770e = this.f12768c.length();
            } else {
                try {
                    this.f12767b.append(this.f12768c);
                    this.f12768c.setLength(0);
                    this.f12770e = 0;
                } catch (IOException e4) {
                    throw new ICUUncheckedIOException((Throwable) e4);
                }
            }
            this.f12771f = 0;
        }

        public d i(CharSequence charSequence, int i4, int i5) {
            if (this.f12769d) {
                this.f12768c.append(charSequence, i4, i5);
                this.f12770e = this.f12768c.length();
            } else {
                try {
                    this.f12767b.append(this.f12768c).append(charSequence, i4, i5);
                    this.f12768c.setLength(0);
                    this.f12770e = 0;
                } catch (IOException e4) {
                    throw new ICUUncheckedIOException((Throwable) e4);
                }
            }
            this.f12771f = 0;
            return this;
        }

        public StringBuilder j() {
            return this.f12768c;
        }

        public boolean l() {
            if (this.f12768c.length() == 0) {
                return true;
            }
            return false;
        }

        public int m() {
            return this.f12768c.length();
        }

        public void o() {
            this.f12768c.setLength(0);
            this.f12771f = 0;
            this.f12770e = 0;
        }

        public void p(int i4) {
            int length = this.f12768c.length();
            this.f12768c.delete(length - i4, length);
            this.f12771f = 0;
            this.f12770e = this.f12768c.length();
        }
    }

    public static final class e {
        public static boolean a(CharSequence charSequence, int i4, int i5, CharSequence charSequence2, int i6, int i7) {
            if (i5 - i4 != i7 - i6) {
                return false;
            }
            if (charSequence == charSequence2 && i4 == i6) {
                return true;
            }
            while (i4 < i5) {
                int i8 = i4 + 1;
                int i9 = i6 + 1;
                if (charSequence.charAt(i4) != charSequence2.charAt(i6)) {
                    return false;
                }
                i4 = i8;
                i6 = i9;
            }
            return true;
        }

        public static boolean b(CharSequence charSequence, CharSequence charSequence2) {
            if (charSequence == charSequence2) {
                return true;
            }
            int length = charSequence.length();
            if (length != charSequence2.length()) {
                return false;
            }
            for (int i4 = 0; i4 < length; i4++) {
                if (charSequence.charAt(i4) != charSequence2.charAt(i4)) {
                    return false;
                }
            }
            return true;
        }

        public static boolean c(int i4) {
            return (i4 & -1024) == 55296;
        }
    }

    private int C(CharSequence charSequence, int i4, int i5) {
        if (i4 == i5) {
            return 0;
        }
        return z(Character.codePointBefore(charSequence, i5));
    }

    private int F() {
        return this.f12752f | 1;
    }

    private boolean H(CharSequence charSequence, int i4, int i5, boolean z3) {
        if (i4 == i5 || G(Character.codePointBefore(charSequence, i5), z3)) {
            return true;
        }
        return false;
    }

    private boolean J(int i4, int i5) {
        if (i4 < this.f12749c || l0(i5)) {
            return true;
        }
        return false;
    }

    private boolean K(CharSequence charSequence, int i4, int i5) {
        if (i4 == i5 || I(Character.codePointAt(charSequence, i4))) {
            return true;
        }
        return false;
    }

    private boolean R(int i4) {
        if (i4 < this.f12753g) {
            return true;
        }
        return false;
    }

    private boolean T(int i4) {
        if (i4 >= this.f12757k) {
            return true;
        }
        return false;
    }

    private boolean V(int i4) {
        if (i4 < this.f12751e || i4 == 65024 || (this.f12759m <= i4 && i4 <= 64512)) {
            return true;
        }
        return false;
    }

    private boolean X(int i4) {
        if (i4 == this.f12751e) {
            return true;
        }
        return false;
    }

    private boolean Y(int i4) {
        if (i4 == F()) {
            return true;
        }
        return false;
    }

    private static boolean Z(int i4) {
        return i4 == 1;
    }

    private static boolean a0(int i4) {
        return i4 == 65024;
    }

    private boolean b0(int i4) {
        if (this.f12759m > i4 || i4 > 65024) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: com.ibm.icu.text.UnicodeSet} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(com.ibm.icu.util.d r5, int r6, int r7) {
        /*
            r4 = this;
            int r0 = r5.B(r7)
            r1 = 4194303(0x3fffff, float:5.87747E-39)
            r1 = r1 & r0
            if (r1 != 0) goto L_0x0011
            if (r6 == 0) goto L_0x0011
            r6 = r6 | r0
            r5.K(r7, r6)
            goto L_0x0048
        L_0x0011:
            r1 = 2097152(0x200000, float:2.938736E-39)
            r2 = r0 & r1
            r3 = 2097151(0x1fffff, float:2.938734E-39)
            if (r2 != 0) goto L_0x003a
            r2 = r0 & r3
            r3 = -2097152(0xffffffffffe00000, float:NaN)
            r0 = r0 & r3
            r0 = r0 | r1
            java.util.ArrayList r1 = r4.f12765s
            int r1 = r1.size()
            r0 = r0 | r1
            r5.K(r7, r0)
            java.util.ArrayList r5 = r4.f12765s
            com.ibm.icu.text.UnicodeSet r7 = new com.ibm.icu.text.UnicodeSet
            r7.<init>()
            r5.add(r7)
            if (r2 == 0) goto L_0x0045
            r7.l(r2)
            goto L_0x0045
        L_0x003a:
            java.util.ArrayList r5 = r4.f12765s
            r7 = r0 & r3
            java.lang.Object r5 = r5.get(r7)
            r7 = r5
            com.ibm.icu.text.UnicodeSet r7 = (com.ibm.icu.text.UnicodeSet) r7
        L_0x0045:
            r7.l(r6)
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.impl.j.c(com.ibm.icu.util.d, int, int):void");
    }

    private boolean c0(int i4) {
        if (i4 >= this.f12759m) {
            return true;
        }
        return false;
    }

    private static int d(String str, int i4, int i5) {
        char charAt;
        if (i5 < 13312) {
            int i6 = i5 << 1;
            while (true) {
                charAt = str.charAt(i4);
                if (i6 <= charAt) {
                    break;
                }
                i4 += (charAt & 1) + 2;
            }
            if (i6 != (charAt & 32766)) {
                return -1;
            }
            if ((charAt & 1) == 0) {
                return str.charAt(i4 + 1);
            }
            return str.charAt(i4 + 2) | (str.charAt(i4 + 1) << 16);
        }
        int i7 = ((i5 >> 9) & -2) + 13312;
        char c4 = (i5 << 6) & 65535;
        while (true) {
            char charAt2 = str.charAt(i4);
            if (i7 > charAt2) {
                i4 += (charAt2 & 1) + 2;
            } else if (i7 != (charAt2 & 32766)) {
                return -1;
            } else {
                char charAt3 = str.charAt(i4 + 1);
                if (c4 > charAt3) {
                    if ((charAt2 & 32768) != 0) {
                        return -1;
                    }
                    i4 += 3;
                } else if (c4 != (65472 & charAt3)) {
                    return -1;
                } else {
                    return str.charAt(i4 + 2) | (('?' & charAt3) << 16);
                }
            }
        }
    }

    private boolean d0(int i4) {
        if (i4 < this.f12751e || i4 == 64512 || i4 == 65024) {
            return true;
        }
        return false;
    }

    private boolean e0(int i4) {
        if (Z(i4)) {
            return true;
        }
        if (T(i4)) {
            if ((i4 & 6) <= 2) {
                return true;
            }
        } else if (this.f12762p.charAt(i4 >> 1) <= 511) {
            return true;
        }
        return false;
    }

    private void i(int i4, int i5, d dVar) {
        if (i5 >= this.f12757k) {
            if (c0(i5)) {
                dVar.d(i4, t(i5));
                return;
            } else {
                i4 = j0(i4, i5);
                i5 = D(i4);
            }
        }
        int i6 = 0;
        if (i5 < this.f12751e) {
            dVar.d(i4, 0);
        } else if (X(i5) || Y(i5)) {
            b.a(i4, dVar);
        } else {
            int i7 = i5 >> 1;
            char charAt = this.f12762p.charAt(i7);
            char c4 = charAt & 31;
            int i8 = charAt >> 8;
            if ((charAt & 128) != 0) {
                i6 = this.f12762p.charAt(i7 - 1) >> 8;
            }
            int i9 = i7 + 1;
            d dVar2 = dVar;
            dVar2.e(this.f12762p, i9, i9 + c4, true, i6, i8);
        }
    }

    private int j0(int i4, int i5) {
        return (i4 + (i5 >> 3)) - this.f12758l;
    }

    private int k(CharSequence charSequence, int i4, int i5, boolean z3, boolean z4, d dVar) {
        while (i4 < i5) {
            int codePointAt = Character.codePointAt(charSequence, i4);
            if (z3 && codePointAt < this.f12749c) {
                return i4;
            }
            int B3 = B(codePointAt);
            if (!z3 || !l0(B3)) {
                i4 += Character.charCount(codePointAt);
                i(codePointAt, B3, dVar);
                if (z3 && k0(B3, z4)) {
                    break;
                }
            } else {
                return i4;
            }
        }
        return i4;
    }

    private boolean k0(int i4, boolean z3) {
        if ((i4 & 1) == 0 || (z3 && !e0(i4))) {
            return false;
        }
        return true;
    }

    private boolean l0(int i4) {
        if (i4 < this.f12755i || N(i4)) {
            return true;
        }
        return false;
    }

    private int m(CharSequence charSequence, int i4, int i5, boolean z3) {
        while (i4 < i5) {
            int codePointAt = Character.codePointAt(charSequence, i4);
            int j4 = this.f12760n.j(codePointAt);
            if (!J(codePointAt, j4)) {
                i4 += Character.charCount(codePointAt);
                if (k0(j4, z3)) {
                    break;
                }
            } else {
                break;
            }
        }
        return i4;
    }

    private int n(CharSequence charSequence, int i4, int i5) {
        while (i4 < i5) {
            int codePointAt = Character.codePointAt(charSequence, i4);
            if (codePointAt < this.f12750d) {
                break;
            }
            int B3 = B(codePointAt);
            if (!n0(B3)) {
                i4 += Character.charCount(codePointAt);
                if (m0(B3)) {
                    break;
                }
            } else {
                break;
            }
        }
        return i4;
    }

    private int o(CharSequence charSequence, int i4, boolean z3) {
        while (i4 > 0) {
            int codePointBefore = Character.codePointBefore(charSequence, i4);
            int B3 = B(codePointBefore);
            if (!k0(B3, z3)) {
                i4 -= Character.charCount(codePointBefore);
                if (J(codePointBefore, B3)) {
                    break;
                }
            } else {
                break;
            }
        }
        return i4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e9 A[EDGE_INSN: B:54:0x00e9->B:42:0x00e9 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void o0(com.ibm.icu.impl.j.d r16, int r17, boolean r18) {
        /*
            r15 = this;
            r0 = r15
            java.lang.StringBuilder r1 = r16.j()
            int r2 = r1.length()
            r3 = r17
            if (r3 != r2) goto L_0x000e
            return
        L_0x000e:
            r2 = 0
            r4 = -1
            r6 = r2
            r7 = r6
            r5 = r4
            r8 = r5
        L_0x0014:
            int r9 = r1.codePointAt(r3)
            int r10 = java.lang.Character.charCount(r9)
            int r3 = r3 + r10
            int r10 = r15.B(r9)
            int r11 = t(r10)
            boolean r12 = r15.b0(r10)
            r13 = 65535(0xffff, float:9.1834E-41)
            r14 = 1
            if (r12 == 0) goto L_0x00e3
            if (r5 < 0) goto L_0x00e3
            if (r6 < r11) goto L_0x0035
            if (r6 != 0) goto L_0x00e3
        L_0x0035:
            boolean r12 = a0(r10)
            if (r12 == 0) goto L_0x007c
            r5 = 4519(0x11a7, float:6.332E-42)
            if (r9 >= r5) goto L_0x0072
            char r10 = r1.charAt(r8)
            int r10 = r10 + -4352
            char r10 = (char) r10
            r11 = 19
            if (r10 >= r11) goto L_0x0072
            int r11 = r3 + -1
            int r10 = r10 * 21
            int r9 = r9 + -4449
            int r10 = r10 + r9
            r9 = 28
            int r10 = r10 * r9
            r12 = 44032(0xac00, float:6.1702E-41)
            int r10 = r10 + r12
            char r10 = (char) r10
            int r12 = r1.length()
            if (r3 == r12) goto L_0x006b
            char r12 = r1.charAt(r3)
            int r12 = r12 - r5
            char r5 = (char) r12
            if (r5 >= r9) goto L_0x006b
            int r3 = r3 + 1
            int r10 = r10 + r5
            char r10 = (char) r10
        L_0x006b:
            r1.setCharAt(r8, r10)
            r1.delete(r11, r3)
            r3 = r11
        L_0x0072:
            int r5 = r1.length()
            if (r3 != r5) goto L_0x007a
            goto L_0x00e9
        L_0x007a:
            r5 = r4
            goto L_0x0014
        L_0x007c:
            java.lang.String r12 = r0.f12761o
            int r12 = d(r12, r5, r9)
            if (r12 < 0) goto L_0x00e3
            int r5 = r12 >> 1
            int r10 = java.lang.Character.charCount(r9)
            int r10 = r3 - r10
            r1.delete(r10, r3)
            if (r7 == 0) goto L_0x00b2
            if (r5 <= r13) goto L_0x00a4
            char r3 = a2.j.e(r5)
            r1.setCharAt(r8, r3)
            int r3 = r8 + 1
            char r9 = a2.j.f(r5)
            r1.setCharAt(r3, r9)
            goto L_0x00b0
        L_0x00a4:
            char r3 = (char) r9
            r1.setCharAt(r8, r3)
            int r3 = r8 + 1
            r1.deleteCharAt(r3)
            int r10 = r10 + -1
            r7 = r2
        L_0x00b0:
            r3 = r10
            goto L_0x00ce
        L_0x00b2:
            if (r5 <= r13) goto L_0x00c9
            char r3 = a2.j.e(r5)
            r1.setCharAt(r8, r3)
            int r3 = r8 + 1
            char r7 = a2.j.f(r5)
            r1.insert(r3, r7)
            int r10 = r10 + 1
            r3 = r10
            r7 = r14
            goto L_0x00ce
        L_0x00c9:
            char r3 = (char) r5
            r1.setCharAt(r8, r3)
            goto L_0x00b0
        L_0x00ce:
            int r9 = r1.length()
            if (r3 != r9) goto L_0x00d5
            goto L_0x00e9
        L_0x00d5:
            r9 = r12 & 1
            if (r9 == 0) goto L_0x007a
            int r5 = r15.D(r5)
            int r5 = r15.w(r5)
            goto L_0x0014
        L_0x00e3:
            int r6 = r1.length()
            if (r3 != r6) goto L_0x00ed
        L_0x00e9:
            r16.h()
            return
        L_0x00ed:
            if (r11 != 0) goto L_0x0103
            int r5 = r15.x(r10)
            if (r5 < 0) goto L_0x00fa
            if (r9 > r13) goto L_0x00fd
            int r8 = r3 + -1
            r7 = r2
        L_0x00fa:
            r6 = r11
            goto L_0x0014
        L_0x00fd:
            int r8 = r3 + -2
            r6 = r11
            r7 = r14
            goto L_0x0014
        L_0x0103:
            if (r18 == 0) goto L_0x00fa
            r5 = r4
            goto L_0x00fa
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.impl.j.o0(com.ibm.icu.impl.j$d, int, boolean):void");
    }

    private int p(CharSequence charSequence, int i4) {
        while (i4 > 0) {
            int codePointBefore = Character.codePointBefore(charSequence, i4);
            if (codePointBefore < this.f12748b) {
                break;
            }
            int B3 = B(codePointBefore);
            if (!m0(B3)) {
                i4 -= Character.charCount(codePointBefore);
                if (n0(B3)) {
                    break;
                }
            } else {
                break;
            }
        }
        return i4;
    }

    private int r(int i4) {
        int i5 = i4 >> 1;
        if ((this.f12762p.charAt(i5) & 128) != 0) {
            return this.f12762p.charAt(i5 - 1) & 255;
        }
        return 0;
    }

    public static int s(int i4) {
        return (i4 >> 1) & 255;
    }

    public static int t(int i4) {
        if (i4 >= 64512) {
            return s(i4);
        }
        return 0;
    }

    private int w(int i4) {
        int i5 = ((64512 - this.f12759m) + i4) >> 1;
        return i5 + 1 + (this.f12761o.charAt(i5) & 31);
    }

    private int x(int i4) {
        if (i4 < 2 || 64512 <= i4) {
            return -1;
        }
        int i5 = i4 - this.f12759m;
        if (i5 < 0) {
            i5 += 64512;
        }
        return i5 >> 1;
    }

    public int A(int i4) {
        int B3 = B(i4);
        if (B3 >= this.f12757k) {
            if (B3 >= 64512) {
                int s4 = s(B3);
                return s4 | (s4 << 8);
            } else if (B3 >= this.f12759m) {
                return 0;
            } else {
                int i5 = B3 & 6;
                if (i5 <= 2) {
                    return i5 >> 1;
                }
                B3 = D(j0(i4, B3));
            }
        }
        if (B3 <= this.f12751e || Y(B3)) {
            return 0;
        }
        int i6 = B3 >> 1;
        char charAt = this.f12762p.charAt(i6);
        int i7 = charAt >> 8;
        if ((charAt & 128) != 0) {
            return i7 | (this.f12762p.charAt(i6 - 1) & 65280);
        }
        return i7;
    }

    public int B(int i4) {
        if (e.c(i4)) {
            return 1;
        }
        return this.f12760n.j(i4);
    }

    public int D(int i4) {
        return this.f12760n.j(i4);
    }

    /* access modifiers changed from: package-private */
    public int E(int i4) {
        if (i4 <= this.f12751e) {
            return 0;
        }
        return this.f12762p.charAt(i4 >> 1) >> 8;
    }

    public boolean G(int i4, boolean z3) {
        return k0(B(i4), z3);
    }

    public boolean I(int i4) {
        if (i4 < this.f12749c || l0(B(i4))) {
            return true;
        }
        return false;
    }

    public boolean L(int i4) {
        if (i4 < this.f12750d || ((i4 <= 65535 && !p0(i4)) || n0(B(i4)))) {
            return true;
        }
        return false;
    }

    public boolean M(int i4) {
        return L(i4);
    }

    public boolean N(int i4) {
        if (this.f12757k > i4 || i4 >= this.f12759m) {
            return false;
        }
        return true;
    }

    public boolean O(int i4) {
        if (this.f12764r.j(i4) >= 0) {
            return true;
        }
        return false;
    }

    public boolean P(int i4, boolean z3) {
        int B3 = B(i4);
        if (!R(B3) || (B3 & 1) == 0 || (z3 && !Z(B3) && this.f12762p.charAt(B3 >> 1) > 511)) {
            return false;
        }
        return true;
    }

    public boolean Q(int i4) {
        if (this.f12753g > i4 || i4 >= this.f12759m) {
            return false;
        }
        return true;
    }

    public boolean S(int i4) {
        return V(B(i4));
    }

    public boolean U(int i4) {
        if (i4 < this.f12751e || this.f12759m <= i4) {
            return true;
        }
        return false;
    }

    public boolean W(int i4) {
        if (z(i4) <= 1) {
            return true;
        }
        return false;
    }

    public void a(UnicodeSet unicodeSet) {
        l();
        CodePointMap.b bVar = new CodePointMap.b();
        for (int i4 = 0; this.f12764r.c(i4, f12746u, bVar); i4 = bVar.f() + 1) {
            unicodeSet.l(i4);
        }
    }

    public void b(UnicodeSet unicodeSet) {
        CodePointMap.b bVar = new CodePointMap.b();
        int i4 = 0;
        while (true) {
            if (!this.f12760n.b(i4, CodePointMap.RangeOption.FIXED_LEAD_SURROGATES, 1, (CodePointMap.d) null, bVar)) {
                break;
            }
            int f4 = bVar.f();
            int g4 = bVar.g();
            unicodeSet.l(i4);
            if (i4 != f4 && N(g4) && (g4 & 6) > 2) {
                int z3 = z(i4);
                while (true) {
                    i4++;
                    if (i4 > f4) {
                        break;
                    }
                    int z4 = z(i4);
                    if (z4 != z3) {
                        unicodeSet.l(i4);
                        z3 = z4;
                    }
                }
            }
            i4 = f4 + 1;
        }
        for (int i5 = 44032; i5 < 55204; i5 += 28) {
            unicodeSet.l(i5);
            unicodeSet.l(i5 + 1);
        }
        unicodeSet.l(55204);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        if (R(r4) == false) goto L_0x0056;
     */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e(java.lang.CharSequence r17, int r18, int r19, boolean r20, boolean r21, com.ibm.icu.impl.j.d r22) {
        /*
            r16 = this;
            r7 = r16
            r8 = r17
            r9 = r19
            r10 = r20
            r11 = r22
            int r12 = r7.f12749c
            r0 = r18
        L_0x000e:
            r1 = r0
        L_0x000f:
            r2 = 1
            if (r0 != r9) goto L_0x001a
            if (r1 == r9) goto L_0x0019
            if (r21 == 0) goto L_0x0019
            r11.append(r8, r1, r9)
        L_0x0019:
            return r2
        L_0x001a:
            char r3 = r8.charAt(r0)
            if (r3 < r12) goto L_0x01cb
            com.ibm.icu.util.CodePointTrie$f r4 = r7.f12760n
            int r4 = r4.p(r3)
            boolean r5 = r7.R(r4)
            if (r5 == 0) goto L_0x002e
            goto L_0x01cb
        L_0x002e:
            int r5 = r0 + 1
            boolean r6 = com.ibm.icu.impl.j.e.c(r3)
            if (r6 != 0) goto L_0x0037
            goto L_0x0056
        L_0x0037:
            if (r5 == r9) goto L_0x0175
            char r4 = r8.charAt(r5)
            boolean r6 = java.lang.Character.isLowSurrogate(r4)
            if (r6 == 0) goto L_0x0175
            int r5 = r0 + 2
            char r3 = (char) r3
            int r3 = java.lang.Character.toCodePoint(r3, r4)
            com.ibm.icu.util.CodePointTrie$f r4 = r7.f12760n
            int r4 = r4.r(r3)
            boolean r6 = r7.R(r4)
            if (r6 != 0) goto L_0x0175
        L_0x0056:
            boolean r6 = r7.c0(r4)
            r13 = 0
            if (r6 != 0) goto L_0x00be
            if (r21 != 0) goto L_0x0060
            return r13
        L_0x0060:
            boolean r2 = r7.T(r4)
            if (r2 == 0) goto L_0x0080
            boolean r2 = r7.k0(r4, r10)
            if (r2 != 0) goto L_0x0072
            boolean r2 = r7.K(r8, r5, r9)
            if (r2 == 0) goto L_0x0125
        L_0x0072:
            if (r1 == r0) goto L_0x0077
            r11.append(r8, r1, r0)
        L_0x0077:
            int r0 = r7.j0(r3, r4)
            r11.d(r0, r13)
            goto L_0x010b
        L_0x0080:
            int r2 = r7.f12754h
            if (r4 >= r2) goto L_0x00a8
            boolean r2 = r7.k0(r4, r10)
            if (r2 != 0) goto L_0x0090
            boolean r2 = r7.K(r8, r5, r9)
            if (r2 == 0) goto L_0x0125
        L_0x0090:
            if (r1 == r0) goto L_0x0095
            r11.append(r8, r1, r0)
        L_0x0095:
            int r0 = r4 >> 1
            java.lang.String r1 = r7.f12762p
            int r2 = r0 + 1
            char r0 = r1.charAt(r0)
            r0 = r0 & 31
            java.lang.String r1 = r7.f12762p
            int r0 = r0 + r2
            r11.append(r1, r2, r0)
            goto L_0x010b
        L_0x00a8:
            int r2 = r7.f12756j
            if (r4 < r2) goto L_0x0125
            boolean r2 = r7.K(r8, r5, r9)
            if (r2 != 0) goto L_0x00b8
            boolean r2 = r7.H(r8, r1, r0, r10)
            if (r2 == 0) goto L_0x0125
        L_0x00b8:
            if (r1 == r0) goto L_0x010b
            r11.append(r8, r1, r0)
            goto L_0x010b
        L_0x00be:
            boolean r6 = a0(r4)
            if (r6 == 0) goto L_0x0127
            if (r1 == r0) goto L_0x0127
            int r2 = r0 + -1
            char r2 = r8.charAt(r2)
            r6 = 4519(0x11a7, float:6.332E-42)
            if (r3 >= r6) goto L_0x010e
            int r2 = r2 + -4352
            char r2 = (char) r2
            r14 = 19
            if (r2 >= r14) goto L_0x0125
            if (r21 != 0) goto L_0x00da
            return r13
        L_0x00da:
            r14 = 28
            if (r5 == r9) goto L_0x00ea
            char r15 = r8.charAt(r5)
            int r15 = r15 - r6
            if (r15 <= 0) goto L_0x00ea
            if (r15 >= r14) goto L_0x00ea
            int r5 = r5 + 1
            goto L_0x00f3
        L_0x00ea:
            boolean r6 = r7.K(r8, r5, r9)
            if (r6 == 0) goto L_0x00f2
            r15 = r13
            goto L_0x00f3
        L_0x00f2:
            r15 = -1
        L_0x00f3:
            if (r15 < 0) goto L_0x0125
            int r2 = r2 * 21
            int r3 = r3 + -4449
            int r2 = r2 + r3
            int r2 = r2 * r14
            r3 = 44032(0xac00, float:6.1702E-41)
            int r2 = r2 + r3
            int r2 = r2 + r15
            int r0 = r0 + -1
            if (r1 == r0) goto L_0x0107
            r11.append(r8, r1, r0)
        L_0x0107:
            char r0 = (char) r2
            r11.append(r0)
        L_0x010b:
            r0 = r5
            goto L_0x000e
        L_0x010e:
            boolean r14 = com.ibm.icu.impl.j.b.b(r2)
            if (r14 == 0) goto L_0x0125
            if (r21 != 0) goto L_0x0117
            return r13
        L_0x0117:
            int r2 = r2 + r3
            int r2 = r2 - r6
            int r0 = r0 + -1
            if (r1 == r0) goto L_0x0120
            r11.append(r8, r1, r0)
        L_0x0120:
            char r0 = (char) r2
            r11.append(r0)
            goto L_0x010b
        L_0x0125:
            r14 = r5
            goto L_0x0178
        L_0x0127:
            r3 = 65024(0xfe00, float:9.1118E-41)
            if (r4 <= r3) goto L_0x0125
            int r3 = s(r4)
            if (r10 == 0) goto L_0x013b
            int r6 = r7.C(r8, r1, r0)
            if (r6 <= r3) goto L_0x013b
            if (r21 != 0) goto L_0x0125
            return r13
        L_0x013b:
            if (r5 != r9) goto L_0x0143
            if (r21 == 0) goto L_0x0142
            r11.append(r8, r1, r9)
        L_0x0142:
            return r2
        L_0x0143:
            int r6 = java.lang.Character.codePointAt(r8, r5)
            com.ibm.icu.util.CodePointTrie$f r14 = r7.f12760n
            int r14 = r14.j(r6)
            r15 = 65026(0xfe02, float:9.1121E-41)
            if (r14 < r15) goto L_0x0162
            int r15 = s(r14)
            if (r3 <= r15) goto L_0x015b
            if (r21 != 0) goto L_0x0162
            return r13
        L_0x015b:
            int r3 = java.lang.Character.charCount(r6)
            int r5 = r5 + r3
            r3 = r15
            goto L_0x013b
        L_0x0162:
            boolean r2 = r7.l0(r14)
            if (r2 == 0) goto L_0x0125
            boolean r0 = r7.R(r14)
            if (r0 == 0) goto L_0x0175
            int r0 = java.lang.Character.charCount(r6)
            int r0 = r0 + r5
            goto L_0x000f
        L_0x0175:
            r0 = r5
            goto L_0x000f
        L_0x0178:
            if (r1 == r0) goto L_0x0195
            boolean r2 = r7.l0(r4)
            if (r2 != 0) goto L_0x0195
            int r2 = java.lang.Character.codePointBefore(r8, r0)
            com.ibm.icu.util.CodePointTrie$f r3 = r7.f12760n
            int r3 = r3.j(r2)
            boolean r3 = r7.k0(r3, r10)
            if (r3 != 0) goto L_0x0195
            int r2 = java.lang.Character.charCount(r2)
            int r0 = r0 - r2
        L_0x0195:
            r15 = r0
            if (r21 == 0) goto L_0x019d
            if (r1 == r15) goto L_0x019d
            r11.append(r8, r1, r15)
        L_0x019d:
            int r6 = r22.m()
            r4 = 0
            r0 = r16
            r1 = r17
            r2 = r15
            r3 = r14
            r5 = r20
            r13 = r6
            r6 = r22
            r0.k(r1, r2, r3, r4, r5, r6)
            r4 = 1
            r2 = r14
            r3 = r19
            int r1 = r0.k(r1, r2, r3, r4, r5, r6)
            r7.o0(r11, r13, r10)
            if (r21 != 0) goto L_0x01c8
            boolean r0 = r11.g(r8, r15, r1)
            if (r0 != 0) goto L_0x01c5
            r0 = 0
            return r0
        L_0x01c5:
            r22.o()
        L_0x01c8:
            r0 = r1
            goto L_0x000f
        L_0x01cb:
            int r0 = r0 + 1
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.impl.j.e(java.lang.CharSequence, int, int, boolean, boolean, com.ibm.icu.impl.j$d):boolean");
    }

    public void f(CharSequence charSequence, boolean z3, boolean z4, d dVar) {
        int i4;
        int m4;
        int length = charSequence.length();
        if (dVar.l() || (m4 = m(charSequence, 0, length, z4)) == 0) {
            i4 = 0;
        } else {
            int o4 = o(dVar.j(), dVar.m(), z4);
            StringBuilder sb = new StringBuilder((dVar.m() - o4) + m4 + 16);
            sb.append(dVar.j(), o4, dVar.m());
            dVar.p(dVar.m() - o4);
            sb.append(charSequence, 0, m4);
            e(sb, 0, sb.length(), z4, true, dVar);
            i4 = m4;
        }
        if (z3) {
            e(charSequence, i4, length, z4, true, dVar);
        } else {
            dVar.append(charSequence, i4, length);
        }
    }

    public j f0(String str) {
        return g0(d.o(str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        if (R(r5) == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        return r9 | r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ba A[EDGE_INSN: B:57:0x00ba->B:49:0x00ba ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int g(java.lang.CharSequence r9, int r10, int r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.f12749c
            r1 = 0
            r2 = r1
            r1 = r10
        L_0x0005:
            r3 = 1
            if (r10 != r11) goto L_0x000c
            int r9 = r10 << 1
        L_0x000a:
            r9 = r9 | r2
            return r9
        L_0x000c:
            char r4 = r9.charAt(r10)
            if (r4 < r0) goto L_0x00c0
            com.ibm.icu.util.CodePointTrie$f r5 = r8.f12760n
            int r5 = r5.p(r4)
            boolean r6 = r8.R(r5)
            if (r6 == 0) goto L_0x0020
            goto L_0x00c0
        L_0x0020:
            int r6 = r10 + 1
            boolean r7 = com.ibm.icu.impl.j.e.c(r4)
            if (r7 != 0) goto L_0x0029
            goto L_0x0048
        L_0x0029:
            if (r6 == r11) goto L_0x00bd
            char r5 = r9.charAt(r6)
            boolean r7 = java.lang.Character.isLowSurrogate(r5)
            if (r7 == 0) goto L_0x00bd
            int r6 = r10 + 2
            char r4 = (char) r4
            int r4 = java.lang.Character.toCodePoint(r4, r5)
            com.ibm.icu.util.CodePointTrie$f r5 = r8.f12760n
            int r5 = r5.r(r4)
            boolean r4 = r8.R(r5)
            if (r4 != 0) goto L_0x00bd
        L_0x0048:
            if (r1 == r10) goto L_0x0066
            boolean r1 = r8.l0(r5)
            if (r1 != 0) goto L_0x0065
            int r1 = java.lang.Character.codePointBefore(r9, r10)
            int r4 = r8.B(r1)
            boolean r7 = r8.k0(r4, r12)
            if (r7 != 0) goto L_0x0065
            int r1 = java.lang.Character.charCount(r1)
            int r1 = r10 - r1
            goto L_0x0067
        L_0x0065:
            r1 = r10
        L_0x0066:
            r4 = r3
        L_0x0067:
            boolean r10 = r8.c0(r5)
            if (r10 == 0) goto L_0x00ba
            int r10 = t(r5)
            if (r12 == 0) goto L_0x007c
            if (r10 == 0) goto L_0x007c
            int r4 = r8.E(r4)
            if (r4 <= r10) goto L_0x007c
            goto L_0x00ba
        L_0x007c:
            r4 = 65026(0xfe02, float:9.1121E-41)
            if (r5 >= r4) goto L_0x0088
            if (r13 != 0) goto L_0x0085
            r2 = r3
            goto L_0x0088
        L_0x0085:
            int r9 = r1 << 1
            return r9
        L_0x0088:
            if (r6 != r11) goto L_0x008e
            int r9 = r6 << 1
            goto L_0x000a
        L_0x008e:
            int r4 = java.lang.Character.codePointAt(r9, r6)
            int r5 = r8.B(r4)
            boolean r7 = r8.c0(r5)
            if (r7 == 0) goto L_0x00ac
            int r7 = t(r5)
            if (r10 <= r7) goto L_0x00a5
            if (r7 == 0) goto L_0x00a5
            goto L_0x00ac
        L_0x00a5:
            int r10 = java.lang.Character.charCount(r4)
            int r6 = r6 + r10
            r10 = r7
            goto L_0x007c
        L_0x00ac:
            boolean r10 = r8.R(r5)
            if (r10 == 0) goto L_0x00ba
            int r10 = java.lang.Character.charCount(r4)
            int r10 = r10 + r6
            r1 = r6
            goto L_0x0005
        L_0x00ba:
            int r9 = r1 << 1
            return r9
        L_0x00bd:
            r10 = r6
            goto L_0x0005
        L_0x00c0:
            int r10 = r10 + 1
            goto L_0x0005
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.impl.j.g(java.lang.CharSequence, int, int, boolean, boolean):int");
    }

    public j g0(ByteBuffer byteBuffer) {
        try {
            this.f12747a = d.t(byteBuffer, 1316121906, f12745t);
            int i4 = byteBuffer.getInt() / 4;
            if (i4 > 18) {
                int[] iArr = new int[i4];
                iArr[0] = i4 * 4;
                for (int i5 = 1; i5 < i4; i5++) {
                    iArr[i5] = byteBuffer.getInt();
                }
                this.f12748b = iArr[8];
                this.f12749c = iArr[9];
                this.f12750d = iArr[18];
                this.f12751e = iArr[10];
                this.f12752f = iArr[14];
                this.f12753g = iArr[11];
                this.f12754h = iArr[15];
                this.f12755i = iArr[16];
                this.f12756j = iArr[17];
                this.f12757k = iArr[12];
                int i6 = iArr[13];
                this.f12759m = i6;
                this.f12758l = (i6 >> 3) - 65;
                int i7 = iArr[0];
                int i8 = iArr[1];
                int position = byteBuffer.position();
                this.f12760n = CodePointTrie.f.q(byteBuffer);
                int position2 = byteBuffer.position() - position;
                int i9 = i8 - i7;
                if (position2 <= i9) {
                    d.u(byteBuffer, i9 - position2);
                    int i10 = (iArr[2] - i8) / 2;
                    if (i10 != 0) {
                        String p4 = d.p(byteBuffer, i10, 0);
                        this.f12761o = p4;
                        this.f12762p = p4.substring((64512 - this.f12759m) >> 1);
                    }
                    byte[] bArr = new byte[256];
                    this.f12763q = bArr;
                    byteBuffer.get(bArr);
                    return this;
                }
                throw new ICUUncheckedIOException("Normalizer2 data: not enough bytes for normTrie");
            }
            throw new ICUUncheckedIOException("Normalizer2 data: not enough indexes");
        } catch (IOException e4) {
            throw new ICUUncheckedIOException((Throwable) e4);
        }
    }

    public int h(CharSequence charSequence, int i4, int i5, d dVar) {
        int t4;
        int i6 = this.f12748b;
        int i7 = i4;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int i11 = i4;
            while (i11 != i5) {
                i8 = charSequence.charAt(i11);
                if (i8 >= i6) {
                    i9 = this.f12760n.p(i8);
                    if (!d0(i9)) {
                        if (!e.c(i8)) {
                            break;
                        }
                        int i12 = i11 + 1;
                        if (i12 != i5) {
                            char charAt = charSequence.charAt(i12);
                            if (Character.isLowSurrogate(charAt)) {
                                i8 = Character.toCodePoint((char) i8, charAt);
                                i9 = this.f12760n.r(i8);
                                if (!d0(i9)) {
                                    break;
                                }
                                i11 += 2;
                            }
                        }
                        i11 = i12;
                    }
                }
                i11++;
            }
            if (i11 != i4) {
                if (dVar != null) {
                    dVar.i(charSequence, i4, i11);
                } else {
                    i10 = 0;
                    i7 = i11;
                }
            }
            if (i11 == i5) {
                return i11;
            }
            i4 = Character.charCount(i8) + i11;
            if (dVar != null) {
                i(i8, i9, dVar);
            } else if (!U(i9) || (i10 > (t4 = t(i9)) && t4 != 0)) {
                return i7;
            } else {
                if (t4 <= 1) {
                    i7 = i4;
                }
                i10 = t4;
            }
        }
        return i7;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int h0(java.lang.CharSequence r17, int r18, int r19, com.ibm.icu.impl.j.d r20) {
        /*
            r16 = this;
            r7 = r16
            r8 = r17
            r9 = r19
            r10 = r20
            r11 = 0
            r0 = r18
            r1 = r0
            r2 = r11
            r3 = r2
            r4 = r3
        L_0x000f:
            r5 = r0
        L_0x0010:
            r6 = 255(0xff, float:3.57E-43)
            if (r5 == r9) goto L_0x0050
            char r3 = r8.charAt(r5)
            int r12 = r7.f12750d
            if (r3 >= r12) goto L_0x0020
            int r2 = ~r3
            int r5 = r5 + 1
            goto L_0x0010
        L_0x0020:
            boolean r12 = r7.p0(r3)
            if (r12 != 0) goto L_0x002a
            int r5 = r5 + 1
            r2 = r11
            goto L_0x0010
        L_0x002a:
            boolean r4 = com.ibm.icu.impl.j.e.c(r3)
            if (r4 == 0) goto L_0x0043
            int r4 = r5 + 1
            if (r4 == r9) goto L_0x0043
            char r4 = r8.charAt(r4)
            boolean r12 = java.lang.Character.isLowSurrogate(r4)
            if (r12 == 0) goto L_0x0043
            char r3 = (char) r3
            int r3 = java.lang.Character.toCodePoint(r3, r4)
        L_0x0043:
            int r4 = r7.A(r3)
            if (r4 > r6) goto L_0x0050
            int r2 = java.lang.Character.charCount(r3)
            int r5 = r5 + r2
            r2 = r4
            goto L_0x0010
        L_0x0050:
            r12 = r3
            r13 = r4
            r3 = 1
            if (r5 == r0) goto L_0x00b2
            if (r5 != r9) goto L_0x005d
            if (r10 == 0) goto L_0x00b4
            r10.i(r8, r0, r5)
            goto L_0x00b4
        L_0x005d:
            if (r2 >= 0) goto L_0x0070
            int r1 = ~r2
            int r2 = r7.f12748b
            if (r1 >= r2) goto L_0x0067
            r2 = r5
            r1 = r11
            goto L_0x00a6
        L_0x0067:
            int r1 = r7.A(r1)
            if (r1 <= r3) goto L_0x00a5
            int r2 = r5 + -1
            goto L_0x00a6
        L_0x0070:
            int r1 = r5 + -1
            char r4 = r8.charAt(r1)
            boolean r4 = java.lang.Character.isLowSurrogate(r4)
            if (r4 == 0) goto L_0x009e
            if (r0 >= r1) goto L_0x009e
            int r4 = r5 + -2
            char r4 = r8.charAt(r4)
            boolean r4 = java.lang.Character.isHighSurrogate(r4)
            if (r4 == 0) goto L_0x009e
            int r1 = r5 + -2
            char r2 = r8.charAt(r1)
            int r4 = r5 + -1
            char r4 = r8.charAt(r4)
            int r2 = java.lang.Character.toCodePoint(r2, r4)
            int r2 = r7.A(r2)
        L_0x009e:
            if (r2 <= r3) goto L_0x00a4
            r15 = r2
            r2 = r1
            r1 = r15
            goto L_0x00a6
        L_0x00a4:
            r1 = r2
        L_0x00a5:
            r2 = r5
        L_0x00a6:
            if (r10 == 0) goto L_0x00ae
            r10.i(r8, r0, r2)
            r10.append(r8, r2, r5)
        L_0x00ae:
            r4 = r2
            r0 = r5
            r2 = r1
            goto L_0x00b6
        L_0x00b2:
            if (r5 != r9) goto L_0x00b5
        L_0x00b4:
            return r5
        L_0x00b5:
            r4 = r1
        L_0x00b6:
            int r1 = java.lang.Character.charCount(r12)
            int r1 = r1 + r5
            r2 = r2 & r6
            int r5 = r13 >> 8
            if (r2 > r5) goto L_0x00d1
            r0 = r13 & 255(0xff, float:3.57E-43)
            if (r0 > r3) goto L_0x00c5
            r4 = r1
        L_0x00c5:
            if (r10 == 0) goto L_0x00ca
            r10.f(r12)
        L_0x00ca:
            r0 = r1
            r1 = r4
            r3 = r12
            r2 = r13
            r4 = r2
            goto L_0x000f
        L_0x00d1:
            if (r10 != 0) goto L_0x00d4
            return r4
        L_0x00d4:
            int r0 = r0 - r4
            r10.p(r0)
            int r14 = r7.n(r8, r1, r9)
            r5 = 0
            r6 = 0
            r0 = r16
            r1 = r17
            r2 = r4
            r3 = r14
            r4 = r5
            r5 = r6
            r6 = r20
            r0.k(r1, r2, r3, r4, r5, r6)
            r2 = r11
            r3 = r12
            r4 = r13
            r0 = r14
            r1 = r0
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.impl.j.h0(java.lang.CharSequence, int, int, com.ibm.icu.impl.j$d):int");
    }

    public void i0(CharSequence charSequence, boolean z3, d dVar) {
        int n4;
        int length = charSequence.length();
        int i4 = 0;
        if (!dVar.l() && (n4 = n(charSequence, 0, length)) != 0) {
            int p4 = p(dVar.j(), dVar.m());
            StringBuilder sb = new StringBuilder((dVar.m() - p4) + n4 + 16);
            sb.append(dVar.j(), p4, dVar.m());
            dVar.p(dVar.m() - p4);
            sb.append(charSequence, 0, n4);
            h0(sb, 0, sb.length(), dVar);
            i4 = n4;
        }
        if (z3) {
            h0(charSequence, i4, length, dVar);
        } else {
            dVar.append(charSequence, i4, length);
        }
    }

    public void j(CharSequence charSequence, boolean z3, d dVar) {
        int i4;
        int length = charSequence.length();
        if (length != 0) {
            int i5 = 0;
            if (z3) {
                h(charSequence, 0, length, dVar);
                return;
            }
            int codePointAt = Character.codePointAt(charSequence, 0);
            int q4 = q(B(codePointAt));
            int i6 = q4;
            int i7 = i6;
            while (true) {
                if (i6 == 0) {
                    i4 = i7;
                    break;
                }
                i5 += Character.charCount(codePointAt);
                if (i5 >= length) {
                    i4 = i6;
                    break;
                }
                codePointAt = Character.codePointAt(charSequence, i5);
                i7 = i6;
                i6 = q(B(codePointAt));
            }
            dVar.e(charSequence, 0, i5, false, q4, i4);
            dVar.append(charSequence, i5, length);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c8 A[Catch:{ all -> 0x003d }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00cb A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.ibm.icu.impl.j l() {
        /*
            r13 = this;
            monitor-enter(r13)
            com.ibm.icu.util.CodePointTrie r0 = r13.f12764r     // Catch:{ all -> 0x003d }
            if (r0 != 0) goto L_0x00dd
            com.ibm.icu.util.d r0 = new com.ibm.icu.util.d     // Catch:{ all -> 0x003d }
            r1 = 0
            r0.<init>(r1, r1)     // Catch:{ all -> 0x003d }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x003d }
            r2.<init>()     // Catch:{ all -> 0x003d }
            r13.f12765s = r2     // Catch:{ all -> 0x003d }
            com.ibm.icu.util.CodePointMap$b r2 = new com.ibm.icu.util.CodePointMap$b     // Catch:{ all -> 0x003d }
            r2.<init>()     // Catch:{ all -> 0x003d }
        L_0x0017:
            com.ibm.icu.util.CodePointTrie$f r3 = r13.f12760n     // Catch:{ all -> 0x003d }
            com.ibm.icu.util.CodePointMap$RangeOption r5 = com.ibm.icu.util.CodePointMap.RangeOption.FIXED_LEAD_SURROGATES     // Catch:{ all -> 0x003d }
            r6 = 1
            r7 = 0
            r4 = r1
            r8 = r2
            boolean r3 = r3.b(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x003d }
            if (r3 == 0) goto L_0x00d3
            int r3 = r2.f()     // Catch:{ all -> 0x003d }
            int r4 = r2.g()     // Catch:{ all -> 0x003d }
            boolean r5 = Z(r4)     // Catch:{ all -> 0x003d }
            if (r5 != 0) goto L_0x00cf
            int r5 = r13.f12751e     // Catch:{ all -> 0x003d }
            if (r5 > r4) goto L_0x0040
            int r5 = r13.f12753g     // Catch:{ all -> 0x003d }
            if (r4 >= r5) goto L_0x0040
            goto L_0x00cf
        L_0x003d:
            r0 = move-exception
            goto L_0x00df
        L_0x0040:
            if (r1 > r3) goto L_0x00cf
            int r5 = r0.B(r1)     // Catch:{ all -> 0x003d }
            boolean r6 = r13.c0(r4)     // Catch:{ all -> 0x003d }
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 == 0) goto L_0x005a
            r6 = r5 | r7
            r7 = 64512(0xfc00, float:9.04E-41)
            if (r4 >= r7) goto L_0x00c6
            r6 = -1073741824(0xffffffffc0000000, float:-2.0)
        L_0x0057:
            r6 = r6 | r5
            goto L_0x00c6
        L_0x005a:
            int r6 = r13.f12751e     // Catch:{ all -> 0x003d }
            if (r4 >= r6) goto L_0x0061
            r6 = 1073741824(0x40000000, float:2.0)
            goto L_0x0057
        L_0x0061:
            boolean r6 = r13.T(r4)     // Catch:{ all -> 0x003d }
            if (r6 == 0) goto L_0x0070
            int r6 = r13.j0(r1, r4)     // Catch:{ all -> 0x003d }
            int r8 = r13.D(r6)     // Catch:{ all -> 0x003d }
            goto L_0x0072
        L_0x0070:
            r6 = r1
            r8 = r4
        L_0x0072:
            int r9 = r13.f12751e     // Catch:{ all -> 0x003d }
            if (r8 <= r9) goto L_0x00c2
            int r9 = r8 >> 1
            java.lang.String r10 = r13.f12762p     // Catch:{ all -> 0x003d }
            char r10 = r10.charAt(r9)     // Catch:{ all -> 0x003d }
            r11 = r10 & 31
            r10 = r10 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0095
            if (r1 != r6) goto L_0x0095
            java.lang.String r6 = r13.f12762p     // Catch:{ all -> 0x003d }
            int r10 = r9 + -1
            char r6 = r6.charAt(r10)     // Catch:{ all -> 0x003d }
            r6 = r6 & 255(0xff, float:3.57E-43)
            if (r6 == 0) goto L_0x0095
            r6 = r5 | r7
            goto L_0x0096
        L_0x0095:
            r6 = r5
        L_0x0096:
            if (r11 == 0) goto L_0x00c6
            int r9 = r9 + 1
            int r11 = r11 + r9
            java.lang.String r10 = r13.f12762p     // Catch:{ all -> 0x003d }
            int r10 = r10.codePointAt(r9)     // Catch:{ all -> 0x003d }
            r13.c(r0, r1, r10)     // Catch:{ all -> 0x003d }
            int r12 = r13.f12753g     // Catch:{ all -> 0x003d }
            if (r8 < r12) goto L_0x00c6
        L_0x00a8:
            int r8 = java.lang.Character.charCount(r10)     // Catch:{ all -> 0x003d }
            int r9 = r9 + r8
            if (r9 >= r11) goto L_0x00c6
            java.lang.String r8 = r13.f12762p     // Catch:{ all -> 0x003d }
            int r10 = r8.codePointAt(r9)     // Catch:{ all -> 0x003d }
            int r8 = r0.B(r10)     // Catch:{ all -> 0x003d }
            r12 = r8 & r7
            if (r12 != 0) goto L_0x00a8
            r8 = r8 | r7
            r0.K(r10, r8)     // Catch:{ all -> 0x003d }
            goto L_0x00a8
        L_0x00c2:
            r13.c(r0, r1, r6)     // Catch:{ all -> 0x003d }
            r6 = r5
        L_0x00c6:
            if (r6 == r5) goto L_0x00cb
            r0.K(r1, r6)     // Catch:{ all -> 0x003d }
        L_0x00cb:
            int r1 = r1 + 1
            goto L_0x0040
        L_0x00cf:
            int r1 = r3 + 1
            goto L_0x0017
        L_0x00d3:
            com.ibm.icu.util.CodePointTrie$Type r1 = com.ibm.icu.util.CodePointTrie.Type.SMALL     // Catch:{ all -> 0x003d }
            com.ibm.icu.util.CodePointTrie$ValueWidth r2 = com.ibm.icu.util.CodePointTrie.ValueWidth.BITS_32     // Catch:{ all -> 0x003d }
            com.ibm.icu.util.CodePointTrie r0 = r0.o(r1, r2)     // Catch:{ all -> 0x003d }
            r13.f12764r = r0     // Catch:{ all -> 0x003d }
        L_0x00dd:
            monitor-exit(r13)
            return r13
        L_0x00df:
            monitor-exit(r13)     // Catch:{ all -> 0x003d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.impl.j.l():com.ibm.icu.impl.j");
    }

    public boolean m0(int i4) {
        if (i4 <= this.f12751e || Y(i4)) {
            return true;
        }
        if (i4 < this.f12757k) {
            int i5 = i4 >> 1;
            char charAt = this.f12762p.charAt(i5);
            if (charAt > 511) {
                return false;
            }
            if (charAt <= 255 || (charAt & 128) == 0 || (this.f12762p.charAt(i5 - 1) & 65280) == 0) {
                return true;
            }
            return false;
        } else if (c0(i4)) {
            if (i4 <= 64512 || i4 == 65024) {
                return true;
            }
            return false;
        } else if ((i4 & 6) <= 2) {
            return true;
        } else {
            return false;
        }
    }

    public boolean n0(int i4) {
        if (i4 < this.f12755i) {
            return true;
        }
        if (i4 < this.f12757k) {
            int i5 = i4 >> 1;
            if ((this.f12762p.charAt(i5) & 128) == 0 || (this.f12762p.charAt(i5 - 1) & 65280) == 0) {
                return true;
            }
            return false;
        } else if (i4 <= 64512 || i4 == 65024) {
            return true;
        } else {
            return false;
        }
    }

    public boolean p0(int i4) {
        byte b4 = this.f12763q[i4 >> 8];
        if (b4 == 0 || ((b4 >> ((i4 >> 5) & 7)) & 1) == 0) {
            return false;
        }
        return true;
    }

    public int q(int i4) {
        if (i4 >= 64512) {
            return s(i4);
        }
        if (i4 < this.f12753g || this.f12757k <= i4) {
            return 0;
        }
        return r(i4);
    }

    public int u(int i4) {
        if (i4 < this.f12749c) {
            return 0;
        }
        return t(B(i4));
    }

    public int v(int i4) {
        if (i4 < this.f12753g || 65026 <= i4) {
            return 1;
        }
        if (this.f12759m <= i4) {
            return 2;
        }
        return 0;
    }

    public String y(int i4) {
        int i5;
        int i6;
        int i7;
        if (i4 >= this.f12748b) {
            int B3 = B(i4);
            if (!c0(B3)) {
                if (T(B3)) {
                    i5 = j0(i4, B3);
                    i6 = D(i5);
                    i7 = i5;
                } else {
                    int i8 = B3;
                    i7 = i4;
                    i5 = -1;
                    i6 = i8;
                }
                if (i6 < this.f12751e) {
                    if (i5 < 0) {
                        return null;
                    }
                    return a2.j.k(i5);
                } else if (X(i6) || Y(i6)) {
                    StringBuilder sb = new StringBuilder();
                    b.a(i7, sb);
                    return sb.toString();
                } else {
                    int i9 = i6 >> 1;
                    int i10 = i9 + 1;
                    return this.f12762p.substring(i10, (this.f12762p.charAt(i9) & 31) + i10);
                }
            }
        }
        return null;
    }

    public int z(int i4) {
        if (i4 < this.f12748b) {
            return 0;
        }
        if (i4 > 65535 || p0(i4)) {
            return A(i4);
        }
        return 0;
    }
}
