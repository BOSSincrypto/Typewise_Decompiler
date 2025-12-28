package com.ibm.icu.text;

import Y1.o;
import Y1.r;
import Y1.y;
import Y1.z;
import a2.C0359a;
import a2.C0366h;
import a2.j;
import a2.k;
import com.ibm.icu.impl.p;
import com.ibm.icu.impl.u;
import com.ibm.icu.lang.UScript;
import com.ibm.icu.util.ICUUncheckedIOException;
import com.ibm.icu.util.ULocale;
import com.ibm.icu.util.h;
import java.io.IOException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class UnicodeSet extends k implements Iterable, Comparable, Cloneable {

    /* renamed from: i  reason: collision with root package name */
    private static final SortedSet f13062i = Collections.unmodifiableSortedSet(new TreeSet());

    /* renamed from: j  reason: collision with root package name */
    public static final UnicodeSet f13063j = new UnicodeSet().W();

    /* renamed from: k  reason: collision with root package name */
    public static final UnicodeSet f13064k = new UnicodeSet(0, 1114111).W();
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final h f13065l = h.c(0, 0, 0, 0);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public int f13066a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public int[] f13067b;

    /* renamed from: c  reason: collision with root package name */
    private int[] f13068c;

    /* renamed from: d  reason: collision with root package name */
    private int[] f13069d;

    /* renamed from: e  reason: collision with root package name */
    SortedSet f13070e;

    /* renamed from: f  reason: collision with root package name */
    private String f13071f;

    /* renamed from: g  reason: collision with root package name */
    private volatile Y1.b f13072g;

    /* renamed from: h  reason: collision with root package name */
    private volatile y f13073h;

    public enum ComparisonStyle {
        SHORTER_FIRST,
        LEXICOGRAPHIC,
        LONGER_FIRST
    }

    public enum SpanCondition {
        NOT_CONTAINED,
        CONTAINED,
        SIMPLE,
        CONDITION_COUNT
    }

    private interface a {
        boolean a(int i4);
    }

    private static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        int f13076a;

        b(int i4) {
            this.f13076a = i4;
        }

        public boolean a(int i4) {
            if (((1 << Z1.c.m(i4)) & this.f13076a) != 0) {
                return true;
            }
            return false;
        }
    }

    private static final class c implements a {

        /* renamed from: a  reason: collision with root package name */
        int f13077a;

        /* renamed from: b  reason: collision with root package name */
        int f13078b;

        c(int i4, int i5) {
            this.f13077a = i4;
            this.f13078b = i5;
        }

        public boolean a(int i4) {
            if (Z1.c.h(i4, this.f13077a) == this.f13078b) {
                return true;
            }
            return false;
        }
    }

    private static final class d implements a {

        /* renamed from: a  reason: collision with root package name */
        double f13079a;

        d(double d4) {
            this.f13079a = d4;
        }

        public boolean a(int i4) {
            if (Z1.c.n(i4) == this.f13079a) {
                return true;
            }
            return false;
        }
    }

    private static final class e implements a {

        /* renamed from: a  reason: collision with root package name */
        int f13080a;

        e(int i4) {
            this.f13080a = i4;
        }

        public boolean a(int i4) {
            return UScript.d(i4, this.f13080a);
        }
    }

    private static class f implements Iterator {

        /* renamed from: a  reason: collision with root package name */
        private int[] f13081a;

        /* renamed from: b  reason: collision with root package name */
        private int f13082b;

        /* renamed from: c  reason: collision with root package name */
        private int f13083c;

        /* renamed from: d  reason: collision with root package name */
        private int f13084d;

        /* renamed from: e  reason: collision with root package name */
        private int f13085e;

        /* renamed from: f  reason: collision with root package name */
        private SortedSet f13086f;

        /* renamed from: g  reason: collision with root package name */
        private Iterator f13087g;

        /* renamed from: h  reason: collision with root package name */
        private char[] f13088h;

        f(UnicodeSet unicodeSet) {
            int j4 = unicodeSet.f13066a - 1;
            this.f13082b = j4;
            if (j4 > 0) {
                this.f13086f = unicodeSet.f13070e;
                int[] k4 = unicodeSet.f13067b;
                this.f13081a = k4;
                int i4 = this.f13083c;
                int i5 = i4 + 1;
                this.f13083c = i5;
                this.f13084d = k4[i4];
                this.f13083c = i4 + 2;
                this.f13085e = k4[i5];
                return;
            }
            this.f13087g = unicodeSet.f13070e.iterator();
            this.f13081a = null;
        }

        /* renamed from: a */
        public String next() {
            int[] iArr = this.f13081a;
            if (iArr == null) {
                return (String) this.f13087g.next();
            }
            int i4 = this.f13084d;
            int i5 = i4 + 1;
            this.f13084d = i5;
            if (i5 >= this.f13085e) {
                int i6 = this.f13083c;
                if (i6 >= this.f13082b) {
                    this.f13087g = this.f13086f.iterator();
                    this.f13081a = null;
                } else {
                    int i7 = i6 + 1;
                    this.f13083c = i7;
                    this.f13084d = iArr[i6];
                    this.f13083c = i6 + 2;
                    this.f13085e = iArr[i7];
                }
            }
            if (i4 <= 65535) {
                return String.valueOf((char) i4);
            }
            if (this.f13088h == null) {
                this.f13088h = new char[2];
            }
            int i8 = i4 - 65536;
            char[] cArr = this.f13088h;
            cArr[0] = (char) ((i8 >>> 10) + 55296);
            cArr[1] = (char) ((i8 & 1023) + 56320);
            return String.valueOf(cArr);
        }

        public boolean hasNext() {
            if (this.f13081a != null || this.f13087g.hasNext()) {
                return true;
            }
            return false;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private static final class g implements a {

        /* renamed from: a  reason: collision with root package name */
        h f13089a;

        g(h hVar) {
            this.f13089a = hVar;
        }

        public boolean a(int i4) {
            h c4 = Z1.c.c(i4);
            if (z.l(c4, UnicodeSet.f13065l) || c4.compareTo(this.f13089a) > 0) {
                return false;
            }
            return true;
        }
    }

    public UnicodeSet() {
        this.f13070e = f13062i;
        this.f13071f = null;
        int[] iArr = new int[25];
        this.f13067b = iArr;
        iArr[0] = 1114112;
        this.f13066a = 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:175:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0333  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void C(Y1.r r29, a2.C0366h r30, java.lang.Appendable r31, int r32, int r33) {
        /*
            r28 = this;
            r1 = r28
            r8 = r29
            r9 = r30
            r10 = r31
            r11 = r33
            r0 = 100
            if (r11 <= r0) goto L_0x0013
            java.lang.String r0 = "Pattern nested too deeply"
            u0(r8, r0)
        L_0x0013:
            r0 = r32 & 1
            if (r0 == 0) goto L_0x001a
            r0 = 7
            r13 = r0
            goto L_0x001b
        L_0x001a:
            r13 = 3
        L_0x001b:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r28.H()
            r0 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
        L_0x0030:
            r12 = 2
            if (r0 == r12) goto L_0x034c
            boolean r21 = r29.c()
            if (r21 != 0) goto L_0x034c
            boolean r21 = l0(r8, r13)
            if (r21 == 0) goto L_0x0049
            r12 = r0
            r25 = r2
            r0 = 0
            r2 = 0
            r7 = 2
            r23 = 0
            goto L_0x00c5
        L_0x0049:
            Y1.r$a r2 = r8.f(r2)
            int r12 = r8.j(r13)
            boolean r23 = r29.h()
            r7 = 91
            if (r12 != r7) goto L_0x00aa
            if (r23 != 0) goto L_0x00aa
            r7 = 1
            if (r0 != r7) goto L_0x0069
            r8.k(r2)
            r25 = r2
            r2 = r12
            r7 = 1
        L_0x0065:
            r12 = r0
        L_0x0066:
            r0 = 0
            goto L_0x00c5
        L_0x0069:
            r0 = 91
            r14.append(r0)
            Y1.r$a r0 = r8.f(r2)
            int r2 = r8.j(r13)
            boolean r7 = r29.h()
            r12 = 94
            if (r2 != r12) goto L_0x0098
            if (r7 != 0) goto L_0x0098
            r14.append(r12)
            Y1.r$a r0 = r8.f(r0)
            int r2 = r8.j(r13)
            r29.h()
            r7 = 45
            r17 = 1
        L_0x0092:
            r27 = r2
            r2 = r0
            r0 = r27
            goto L_0x009b
        L_0x0098:
            r7 = 45
            goto L_0x0092
        L_0x009b:
            if (r0 != r7) goto L_0x00a5
            r25 = r2
            r7 = 0
            r12 = 1
            r23 = 1
            r2 = r0
            goto L_0x0066
        L_0x00a5:
            r8.k(r2)
            r0 = 1
            goto L_0x0030
        L_0x00aa:
            if (r9 == 0) goto L_0x00c0
            a2.l r7 = r9.a(r12)
            if (r7 == 0) goto L_0x00c0
            com.ibm.icu.text.UnicodeSet r7 = (com.ibm.icu.text.UnicodeSet) r7     // Catch:{ ClassCastException -> 0x00bb }
            r25 = r2
            r2 = r12
            r12 = r0
            r0 = r7
            r7 = 3
            goto L_0x00c5
        L_0x00bb:
            java.lang.String r7 = "Syntax error"
            u0(r8, r7)
        L_0x00c0:
            r25 = r2
            r2 = r12
            r7 = 0
            goto L_0x0065
        L_0x00c5:
            if (r7 == 0) goto L_0x0164
            r10 = 1
            if (r3 != r10) goto L_0x00dc
            if (r4 == 0) goto L_0x00d1
            java.lang.String r2 = "Char expected after operator"
            u0(r8, r2)
        L_0x00d1:
            r1.u(r6, r6)
            r2 = 0
            c(r14, r6, r2)
            r2 = 45
            r10 = 0
            goto L_0x00df
        L_0x00dc:
            r10 = r4
            r2 = 45
        L_0x00df:
            if (r10 == r2) goto L_0x00e5
            r2 = 38
            if (r10 != r2) goto L_0x00e8
        L_0x00e5:
            r14.append(r10)
        L_0x00e8:
            if (r0 != 0) goto L_0x00f6
            if (r5 != 0) goto L_0x00f1
            com.ibm.icu.text.UnicodeSet r5 = new com.ibm.icu.text.UnicodeSet
            r5.<init>()
        L_0x00f1:
            r0 = r5
            r18 = r0
        L_0x00f4:
            r5 = 1
            goto L_0x00f9
        L_0x00f6:
            r18 = r5
            goto L_0x00f4
        L_0x00f9:
            if (r7 == r5) goto L_0x0116
            r2 = 2
            if (r7 == r2) goto L_0x010d
            r4 = 3
            if (r7 == r4) goto L_0x0108
        L_0x0101:
            r20 = r4
            r9 = r5
            r11 = r6
            r26 = r25
            goto L_0x0130
        L_0x0108:
            r7 = 0
            r0.g(r14, r7)
            goto L_0x0101
        L_0x010d:
            r4 = 3
            r7 = 0
            r8.l(r13)
            r0.F(r8, r14, r9)
            goto L_0x0101
        L_0x0116:
            r4 = 3
            r7 = 0
            int r19 = r11 + 1
            r2 = r0
            r3 = r29
            r20 = r4
            r4 = r30
            r22 = r5
            r5 = r14
            r11 = r6
            r6 = r32
            r9 = r22
            r26 = r25
            r7 = r19
            r2.C(r3, r4, r5, r6, r7)
        L_0x0130:
            if (r12 != 0) goto L_0x013c
            r1.p0(r0)
            r18 = r9
            r0 = 2
            r2 = 2
            r6 = 0
            goto L_0x034f
        L_0x013c:
            if (r10 == 0) goto L_0x014f
            r2 = 38
            if (r10 == r2) goto L_0x014b
            r2 = 45
            if (r10 == r2) goto L_0x0147
            goto L_0x0152
        L_0x0147:
            r1.j0(r0)
            goto L_0x0152
        L_0x014b:
            r1.n0(r0)
            goto L_0x0152
        L_0x014f:
            r1.q(r0)
        L_0x0152:
            r10 = r31
            r6 = r11
            r0 = r12
            r5 = r18
            r2 = r26
            r3 = 2
            r4 = 0
            r11 = r33
            r18 = r9
            r9 = r30
            goto L_0x0030
        L_0x0164:
            r11 = r6
            r26 = r25
            r9 = 1
            r20 = 3
            if (r12 != 0) goto L_0x0171
            java.lang.String r0 = "Missing '['"
            u0(r8, r0)
        L_0x0171:
            if (r23 != 0) goto L_0x018b
            r0 = 36
            r6 = 93
            if (r2 == r0) goto L_0x02a6
            r7 = 38
            if (r2 == r7) goto L_0x0294
            r0 = 45
            if (r2 == r0) goto L_0x0261
            r7 = 123(0x7b, float:1.72E-43)
            if (r2 == r7) goto L_0x01c4
            if (r2 == r6) goto L_0x0198
            r0 = 94
            if (r2 == r0) goto L_0x0192
        L_0x018b:
            r10 = r16
            r7 = r26
            r6 = 0
            goto L_0x02f9
        L_0x0192:
            java.lang.String r0 = "'^' not after '['"
            u0(r8, r0)
            goto L_0x018b
        L_0x0198:
            if (r3 != r9) goto L_0x01a1
            r1.u(r11, r11)
            r2 = 0
            c(r14, r11, r2)
        L_0x01a1:
            r0 = 45
            if (r4 != r0) goto L_0x01ac
            r1.u(r4, r4)
            r14.append(r4)
            goto L_0x01b5
        L_0x01ac:
            r0 = 38
            if (r4 != r0) goto L_0x01b5
            java.lang.String r0 = "Trailing '&'"
            u0(r8, r0)
        L_0x01b5:
            r14.append(r6)
            r9 = r30
            r10 = r31
            r6 = r11
            r2 = r26
            r0 = 2
        L_0x01c0:
            r11 = r33
            goto L_0x0030
        L_0x01c4:
            if (r4 == 0) goto L_0x01cf
            r0 = 45
            if (r4 == r0) goto L_0x01cf
            java.lang.String r0 = "Missing operand after operator"
            u0(r8, r0)
        L_0x01cf:
            if (r3 != r9) goto L_0x01db
            r1.u(r11, r11)
            r2 = 0
            c(r14, r11, r2)
        L_0x01d8:
            r10 = r16
            goto L_0x01dd
        L_0x01db:
            r2 = 0
            goto L_0x01d8
        L_0x01dd:
            if (r10 != 0) goto L_0x01e6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r10 = r0
            goto L_0x01e9
        L_0x01e6:
            r10.setLength(r2)
        L_0x01e9:
            boolean r0 = r29.c()
            r2 = 125(0x7d, float:1.75E-43)
            if (r0 != 0) goto L_0x0202
            int r0 = r8.j(r13)
            boolean r3 = r29.h()
            if (r0 != r2) goto L_0x01fe
            if (r3 != 0) goto L_0x01fe
            goto L_0x0207
        L_0x01fe:
            w(r10, r0)
            goto L_0x01e9
        L_0x0202:
            java.lang.String r0 = "Invalid multicharacter string"
            u0(r8, r0)
        L_0x0207:
            java.lang.String r3 = r10.toString()
            r0 = 45
            if (r4 != r0) goto L_0x0246
            if (r15 != 0) goto L_0x0214
            java.lang.String r0 = ""
            goto L_0x0215
        L_0x0214:
            r0 = r15
        L_0x0215:
            int r0 = Z1.a.c(r0)
            int r4 = Z1.a.c(r3)
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r6) goto L_0x0228
            if (r4 == r6) goto L_0x0228
            r1.n(r0, r4)
            goto L_0x0243
        L_0x0228:
            java.util.SortedSet r0 = r1.f13070e
            java.util.SortedSet r4 = f13062i
            if (r0 != r4) goto L_0x0235
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>()
            r1.f13070e = r0
        L_0x0235:
            java.util.SortedSet r0 = r1.f13070e     // Catch:{ Exception -> 0x023b }
            Y1.t.b(r15, r3, r9, r0)     // Catch:{ Exception -> 0x023b }
            goto L_0x0243
        L_0x023b:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            u0(r8, r0)
        L_0x0243:
            r4 = 0
            r15 = 0
            goto L_0x024a
        L_0x0246:
            r1.o(r3)
            r15 = r3
        L_0x024a:
            r14.append(r7)
            r7 = 0
            d(r14, r3, r7)
            r14.append(r2)
            r9 = r30
            r3 = r7
        L_0x0257:
            r16 = r10
            r6 = r11
            r0 = r12
            r2 = r26
        L_0x025d:
            r10 = r31
            goto L_0x01c0
        L_0x0261:
            r10 = r16
            r7 = 0
            if (r4 != 0) goto L_0x028c
            if (r3 == 0) goto L_0x026c
        L_0x0268:
            char r4 = (char) r2
            r9 = r30
            goto L_0x0257
        L_0x026c:
            if (r15 == 0) goto L_0x026f
            goto L_0x0268
        L_0x026f:
            r1.u(r2, r2)
            int r2 = r8.j(r13)
            boolean r0 = r29.h()
            if (r2 != r6) goto L_0x028c
            if (r0 != 0) goto L_0x028c
            java.lang.String r0 = "-]"
            r14.append(r0)
            r9 = r30
            r16 = r10
            r6 = r11
            r2 = r26
            r0 = 2
            goto L_0x025d
        L_0x028c:
            java.lang.String r0 = "'-' not after char, string, or set"
            u0(r8, r0)
            r6 = r7
            goto L_0x02fb
        L_0x0294:
            r10 = r16
            r0 = 2
            r7 = 0
            if (r3 != r0) goto L_0x029d
            if (r4 != 0) goto L_0x029d
            goto L_0x0268
        L_0x029d:
            java.lang.String r0 = "'&' not after set"
            u0(r8, r0)
            r6 = r7
            r7 = r26
            goto L_0x02f9
        L_0x02a6:
            r10 = r16
            r7 = r26
            Y1.r$a r2 = r8.f(r7)
            int r7 = r8.j(r13)
            boolean r16 = r29.h()
            if (r7 != r6) goto L_0x02be
            if (r16 != 0) goto L_0x02be
            r24 = r9
            r6 = 0
            goto L_0x02c1
        L_0x02be:
            r6 = 0
            r24 = 0
        L_0x02c1:
            if (r30 != 0) goto L_0x02cc
            if (r24 != 0) goto L_0x02cc
            r8.k(r2)
            r26 = r2
            r2 = r0
            goto L_0x02fb
        L_0x02cc:
            if (r24 == 0) goto L_0x02f0
            if (r4 != 0) goto L_0x02f0
            if (r3 != r9) goto L_0x02d8
            r1.u(r11, r11)
            c(r14, r11, r6)
        L_0x02d8:
            r7 = 65535(0xffff, float:9.1834E-41)
            r1.t(r7)
            r14.append(r0)
            r0 = 93
            r14.append(r0)
            r18 = r9
            r16 = r10
            r6 = r11
            r0 = 2
            r9 = r30
            goto L_0x025d
        L_0x02f0:
            java.lang.String r0 = "Unquoted '$'"
            u0(r8, r0)
            r26 = r2
            r2 = r7
            goto L_0x02fb
        L_0x02f9:
            r26 = r7
        L_0x02fb:
            java.lang.String r0 = "Invalid range"
            if (r3 == 0) goto L_0x0333
            if (r3 == r9) goto L_0x030f
            r7 = 2
            if (r3 == r7) goto L_0x0306
        L_0x0304:
            r2 = r11
            goto L_0x033e
        L_0x0306:
            if (r4 == 0) goto L_0x030d
            java.lang.String r0 = "Set expected after operator"
            u0(r8, r0)
        L_0x030d:
            r3 = r9
            goto L_0x033e
        L_0x030f:
            r7 = 45
            if (r4 != r7) goto L_0x032c
            if (r15 == 0) goto L_0x0318
            u0(r8, r0)
        L_0x0318:
            if (r11 < r2) goto L_0x031d
            u0(r8, r0)
        L_0x031d:
            r1.u(r11, r2)
            c(r14, r11, r6)
            r14.append(r4)
            c(r14, r2, r6)
            r3 = r6
            r4 = r3
            goto L_0x0304
        L_0x032c:
            r1.u(r11, r11)
            c(r14, r11, r6)
            goto L_0x033e
        L_0x0333:
            r3 = 45
            if (r4 != r3) goto L_0x033c
            if (r15 == 0) goto L_0x033c
            u0(r8, r0)
        L_0x033c:
            r3 = r9
            r15 = 0
        L_0x033e:
            r9 = r30
            r11 = r33
            r6 = r2
            r16 = r10
            r0 = r12
            r2 = r26
            r10 = r31
            goto L_0x0030
        L_0x034c:
            r6 = 0
            r9 = 1
            r2 = 2
        L_0x034f:
            if (r0 == r2) goto L_0x0356
            java.lang.String r0 = "Missing ']'"
            u0(r8, r0)
        L_0x0356:
            r8.l(r13)
            r0 = r32 & 2
            if (r0 == 0) goto L_0x0360
            r1.J(r2)
        L_0x0360:
            if (r17 == 0) goto L_0x0369
            com.ibm.icu.text.UnicodeSet r0 = r28.Q()
            r0.k0()
        L_0x0369:
            if (r18 == 0) goto L_0x0375
            java.lang.String r0 = r14.toString()
            r2 = r31
            v(r2, r0)
            goto L_0x037a
        L_0x0375:
            r2 = r31
            r1.x(r2, r6, r9)
        L_0x037a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.text.UnicodeSet.C(Y1.r, a2.h, java.lang.Appendable, int, int):void");
    }

    private UnicodeSet E(String str, ParsePosition parsePosition, C0366h hVar) {
        boolean z3;
        boolean z4;
        int i4;
        String str2;
        String str3;
        String str4;
        boolean z5;
        boolean z6;
        int index = parsePosition.getIndex();
        if (index + 5 > str.length()) {
            return null;
        }
        boolean z7 = false;
        int i5 = 2;
        if (str.regionMatches(index, "[:", 0, 2)) {
            i4 = o.b(str, index + 2);
            if (i4 >= str.length() || str.charAt(i4) != '^') {
                z4 = false;
                z3 = false;
                z7 = true;
            } else {
                i4++;
                z4 = false;
                z3 = true;
                z7 = true;
            }
        } else if (!str.regionMatches(true, index, "\\p", 0, 2) && !str.regionMatches(index, "\\N", 0, 2)) {
            return null;
        } else {
            char charAt = str.charAt(index + 1);
            if (charAt == 'P') {
                z5 = true;
            } else {
                z5 = false;
            }
            if (charAt == 'N') {
                z6 = true;
            } else {
                z6 = false;
            }
            int b4 = o.b(str, index + 2);
            if (b4 != str.length()) {
                int i6 = b4 + 1;
                if (str.charAt(b4) == '{') {
                    z3 = z5;
                    z4 = z6;
                    i4 = i6;
                }
            }
            return null;
        }
        if (z7) {
            str2 = ":]";
        } else {
            str2 = "}";
        }
        int indexOf = str.indexOf(str2, i4);
        if (indexOf < 0) {
            return null;
        }
        int indexOf2 = str.indexOf(61, i4);
        if (indexOf2 < 0 || indexOf2 >= indexOf || z4) {
            str4 = str.substring(i4, indexOf);
            if (z4) {
                String str5 = str4;
                str4 = "na";
                str3 = str5;
            } else {
                str3 = "";
            }
        } else {
            str4 = str.substring(i4, indexOf2);
            str3 = str.substring(indexOf2 + 1, indexOf);
        }
        D(str4, str3, hVar);
        if (z3) {
            Q().k0();
        }
        if (!z7) {
            i5 = 1;
        }
        parsePosition.setIndex(indexOf + i5);
        return this;
    }

    private void F(r rVar, Appendable appendable, C0366h hVar) {
        String d4 = rVar.d();
        int e4 = rVar.e();
        ParsePosition parsePosition = new ParsePosition(e4);
        E(d4, parsePosition, hVar);
        int index = parsePosition.getIndex() - e4;
        if (index == 0) {
            u0(rVar, "Invalid property pattern");
        }
        rVar.i(index);
        v(appendable, d4.substring(e4, parsePosition.getIndex()));
    }

    private void G() {
        if (c0()) {
            throw new UnsupportedOperationException("Attempt to modify frozen object");
        }
    }

    public static int L(CharSequence charSequence, int i4) {
        return Z1.a.b(charSequence, i4);
    }

    public static int M(Iterable iterable, Iterable iterable2) {
        return N(iterable.iterator(), iterable2.iterator());
    }

    public static int N(Iterator it, Iterator it2) {
        while (it.hasNext()) {
            if (!it2.hasNext()) {
                return 1;
            }
            int compareTo = ((Comparable) it.next()).compareTo((Comparable) it2.next());
            if (compareTo != 0) {
                return compareTo;
            }
        }
        if (it2.hasNext()) {
            return -1;
        }
        return 0;
    }

    private void T(int i4) {
        if (i4 > 1114113) {
            i4 = 1114113;
        }
        int[] iArr = this.f13069d;
        if (iArr == null || i4 > iArr.length) {
            this.f13069d = new int[f0(i4)];
        }
    }

    private void U(int i4) {
        if (i4 > 1114113) {
            i4 = 1114113;
        }
        if (i4 > this.f13067b.length) {
            int[] iArr = new int[f0(i4)];
            System.arraycopy(this.f13067b, 0, iArr, 0, this.f13066a);
            this.f13067b = iArr;
        }
    }

    private final int V(int i4) {
        int[] iArr = this.f13067b;
        int i5 = 0;
        if (i4 < iArr[0]) {
            return 0;
        }
        int i6 = this.f13066a;
        if (i6 >= 2 && i4 >= iArr[i6 - 2]) {
            return i6 - 1;
        }
        int i7 = i6 - 1;
        while (true) {
            int i8 = (i5 + i7) >>> 1;
            if (i8 == i5) {
                return i7;
            }
            if (i4 < this.f13067b[i8]) {
                i7 = i8;
            } else {
                i5 = i8;
            }
        }
    }

    private static int a0(CharSequence charSequence) {
        int codePointAt;
        if (charSequence.length() == 1) {
            return charSequence.charAt(0);
        }
        if (charSequence.length() != 2 || (codePointAt = Character.codePointAt(charSequence, 0)) <= 65535) {
            return -1;
        }
        return codePointAt;
    }

    private static Appendable b(Appendable appendable, int i4, int i5, boolean z3) {
        c(appendable, i4, z3);
        if (i4 != i5) {
            if (i4 + 1 != i5 || i4 == 56319) {
                try {
                    appendable.append('-');
                } catch (IOException e4) {
                    throw new ICUUncheckedIOException((Throwable) e4);
                }
            }
            c(appendable, i5, z3);
        }
        return appendable;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000f, code lost:
        if (Y1.z.m(r2) != false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Appendable c(java.lang.Appendable r1, int r2, boolean r3) {
        /*
            if (r3 == 0) goto L_0x000b
            boolean r3 = Y1.z.i(r2)     // Catch:{ IOException -> 0x0009 }
            if (r3 == 0) goto L_0x0016
            goto L_0x0011
        L_0x0009:
            r1 = move-exception
            goto L_0x0044
        L_0x000b:
            boolean r3 = Y1.z.m(r2)     // Catch:{ IOException -> 0x0009 }
            if (r3 == 0) goto L_0x0016
        L_0x0011:
            java.lang.Appendable r1 = Y1.z.f(r1, r2)     // Catch:{ IOException -> 0x0009 }
            return r1
        L_0x0016:
            r3 = 36
            r0 = 92
            if (r2 == r3) goto L_0x003d
            r3 = 38
            if (r2 == r3) goto L_0x003d
            r3 = 45
            if (r2 == r3) goto L_0x003d
            r3 = 58
            if (r2 == r3) goto L_0x003d
            r3 = 123(0x7b, float:1.72E-43)
            if (r2 == r3) goto L_0x003d
            r3 = 125(0x7d, float:1.75E-43)
            if (r2 == r3) goto L_0x003d
            switch(r2) {
                case 91: goto L_0x003d;
                case 92: goto L_0x003d;
                case 93: goto L_0x003d;
                case 94: goto L_0x003d;
                default: goto L_0x0033;
            }     // Catch:{ IOException -> 0x0009 }
        L_0x0033:
            boolean r3 = Y1.o.a(r2)     // Catch:{ IOException -> 0x0009 }
            if (r3 == 0) goto L_0x0040
            r1.append(r0)     // Catch:{ IOException -> 0x0009 }
            goto L_0x0040
        L_0x003d:
            r1.append(r0)     // Catch:{ IOException -> 0x0009 }
        L_0x0040:
            w(r1, r2)     // Catch:{ IOException -> 0x0009 }
            return r1
        L_0x0044:
            com.ibm.icu.util.ICUUncheckedIOException r2 = new com.ibm.icu.util.ICUUncheckedIOException
            r2.<init>((java.lang.Throwable) r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.text.UnicodeSet.c(java.lang.Appendable, int, boolean):java.lang.Appendable");
    }

    private static Appendable d(Appendable appendable, String str, boolean z3) {
        int i4 = 0;
        while (i4 < str.length()) {
            int codePointAt = str.codePointAt(i4);
            c(appendable, codePointAt, z3);
            i4 += Character.charCount(codePointAt);
        }
        return appendable;
    }

    private static final int d0(int i4, int i5) {
        return i4 > i5 ? i4 : i5;
    }

    private static String e0(String str) {
        String c4 = o.c(str);
        StringBuilder sb = null;
        for (int i4 = 0; i4 < c4.length(); i4++) {
            char charAt = c4.charAt(i4);
            if (o.a(charAt)) {
                charAt = ' ';
                if (sb == null) {
                    sb = new StringBuilder();
                    sb.append(c4, 0, i4);
                } else if (sb.charAt(sb.length() - 1) == ' ') {
                }
            }
            if (sb != null) {
                sb.append(charAt);
            }
        }
        if (sb == null) {
            return c4;
        }
        return sb.toString();
    }

    private int f0(int i4) {
        if (i4 < 25) {
            return i4 + 25;
        }
        if (i4 <= 2500) {
            return i4 * 5;
        }
        int i5 = i4 * 2;
        if (i5 > 1114113) {
            return 1114113;
        }
        return i5;
    }

    private Appendable g(Appendable appendable, boolean z3) {
        String str = this.f13071f;
        if (str == null) {
            return x(appendable, z3, true);
        }
        if (!z3) {
            try {
                appendable.append(str);
                return appendable;
            } catch (IOException e4) {
                throw new ICUUncheckedIOException((Throwable) e4);
            }
        } else {
            int i4 = 0;
            boolean z4 = false;
            while (i4 < this.f13071f.length()) {
                int codePointAt = this.f13071f.codePointAt(i4);
                i4 += Character.charCount(codePointAt);
                if (z.i(codePointAt)) {
                    z.f(appendable, codePointAt);
                } else if (z4 || codePointAt != 92) {
                    if (z4) {
                        appendable.append('\\');
                    }
                    w(appendable, codePointAt);
                } else {
                    z4 = true;
                }
                z4 = false;
            }
            if (z4) {
                appendable.append('\\');
            }
            return appendable;
        }
    }

    private int[] g0(int i4, int i5) {
        int[] iArr = this.f13068c;
        if (iArr == null) {
            this.f13068c = new int[]{i4, i5 + 1, 1114112};
        } else {
            iArr[0] = i4;
            iArr[1] = i5 + 1;
        }
        return this.f13068c;
    }

    private static boolean l0(r rVar, int i4) {
        r.a f4 = rVar.f((r.a) null);
        int j4 = rVar.j(i4 & -3);
        boolean z3 = false;
        if (j4 == 91 || j4 == 92) {
            int j5 = rVar.j(i4 & -7);
            if (j4 != 91 ? j5 == 78 || j5 == 112 || j5 == 80 : j5 == 58) {
                z3 = true;
            }
        }
        rVar.k(f4);
        return z3;
    }

    private UnicodeSet m0(int[] iArr, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        T(this.f13066a + i4);
        int i23 = 0;
        int i24 = this.f13067b[0];
        int i25 = iArr[0];
        int i26 = 1;
        int i27 = 1;
        while (true) {
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 != 3) {
                            continue;
                        } else if (i24 < i25) {
                            i21 = i23 + 1;
                            this.f13069d[i23] = i24;
                            i22 = i26 + 1;
                            i24 = this.f13067b[i26];
                        } else if (i25 < i24) {
                            i19 = i23 + 1;
                            this.f13069d[i23] = i25;
                            i20 = i27 + 1;
                            i25 = iArr[i27];
                            i5 ^= 2;
                            i27 = i20;
                        } else if (i24 == 1114112) {
                            break;
                        } else {
                            i6 = i23 + 1;
                            this.f13069d[i23] = i24;
                            i7 = i26 + 1;
                            i8 = this.f13067b[i26];
                            i9 = i27 + 1;
                            i10 = iArr[i27];
                        }
                    } else if (i25 < i24) {
                        i11 = i27 + 1;
                        i12 = iArr[i27];
                        i5 ^= 2;
                        int i28 = i12;
                        i27 = i11;
                        i25 = i28;
                    } else if (i24 < i25) {
                        i21 = i23 + 1;
                        this.f13069d[i23] = i24;
                        i22 = i26 + 1;
                        i24 = this.f13067b[i26];
                    } else if (i24 == 1114112) {
                        break;
                    } else {
                        i15 = i26 + 1;
                        i16 = this.f13067b[i26];
                        i17 = i27 + 1;
                        i18 = iArr[i27];
                        i5 ^= 3;
                        int i29 = i17;
                        i26 = i15;
                        i25 = i18;
                        i27 = i29;
                    }
                    i5 ^= 1;
                    i26 = i22;
                } else if (i24 < i25) {
                    i13 = i26 + 1;
                    i14 = this.f13067b[i26];
                    i5 ^= 1;
                    i26 = i13;
                } else if (i25 < i24) {
                    i19 = i23 + 1;
                    this.f13069d[i23] = i25;
                    i20 = i27 + 1;
                    i25 = iArr[i27];
                    i5 ^= 2;
                    i27 = i20;
                } else if (i24 == 1114112) {
                    break;
                } else {
                    i15 = i26 + 1;
                    i16 = this.f13067b[i26];
                    i17 = i27 + 1;
                    i18 = iArr[i27];
                    i5 ^= 3;
                    int i292 = i17;
                    i26 = i15;
                    i25 = i18;
                    i27 = i292;
                }
                i23 = i21;
            } else if (i24 < i25) {
                i13 = i26 + 1;
                i14 = this.f13067b[i26];
                i5 ^= 1;
                i26 = i13;
            } else if (i25 < i24) {
                i11 = i27 + 1;
                i12 = iArr[i27];
                i5 ^= 2;
                int i282 = i12;
                i27 = i11;
                i25 = i282;
            } else if (i24 == 1114112) {
                break;
            } else {
                i6 = i23 + 1;
                this.f13069d[i23] = i24;
                i7 = i26 + 1;
                i8 = this.f13067b[i26];
                i9 = i27 + 1;
                i10 = iArr[i27];
            }
            i5 ^= 3;
            i27 = i9;
            i25 = i10;
            i26 = i7;
            i23 = i6;
        }
        int[] iArr2 = this.f13069d;
        iArr2[i23] = 1114112;
        this.f13066a = i23 + 1;
        int[] iArr3 = this.f13067b;
        this.f13067b = iArr2;
        this.f13069d = iArr3;
        this.f13071f = null;
        return this;
    }

    private UnicodeSet p(int[] iArr, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        T(this.f13066a + i4);
        int i17 = 0;
        int i18 = this.f13067b[0];
        int i19 = iArr[0];
        int i20 = 1;
        int i21 = 1;
        while (true) {
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 == 3) {
                            if (i19 <= i18) {
                                if (i18 == 1114112) {
                                    break;
                                }
                                i16 = i17 + 1;
                                this.f13069d[i17] = i18;
                            } else if (i19 == 1114112) {
                                break;
                            } else {
                                i16 = i17 + 1;
                                this.f13069d[i17] = i19;
                            }
                            int i22 = i20 + 1;
                            i18 = this.f13067b[i20];
                            int i23 = iArr[i21];
                            i5 ^= 3;
                            i21++;
                            i19 = i23;
                            i20 = i22;
                            i17 = i16;
                        } else {
                            continue;
                        }
                    } else if (i19 < i18) {
                        i15 = i17 + 1;
                        this.f13069d[i17] = i19;
                        i19 = iArr[i21];
                        i5 ^= 2;
                        i21++;
                    } else if (i18 < i19) {
                        i18 = this.f13067b[i20];
                        i5 ^= 1;
                        i20++;
                    } else if (i18 == 1114112) {
                        break;
                    } else {
                        i12 = i20 + 1;
                        i18 = this.f13067b[i20];
                        i13 = i21 + 1;
                        i14 = iArr[i21];
                        i5 ^= 3;
                        int i24 = i13;
                        i20 = i12;
                        i19 = i14;
                        i21 = i24;
                    }
                } else if (i18 < i19) {
                    i15 = i17 + 1;
                    this.f13069d[i17] = i18;
                    i18 = this.f13067b[i20];
                    i5 ^= 1;
                    i20++;
                } else if (i19 < i18) {
                    i6 = i21 + 1;
                    i7 = iArr[i21];
                    r11 = i5 ^ 2;
                } else if (i18 == 1114112) {
                    break;
                } else {
                    i12 = i20 + 1;
                    i18 = this.f13067b[i20];
                    i13 = i21 + 1;
                    i14 = iArr[i21];
                    i5 ^= 3;
                    int i242 = i13;
                    i20 = i12;
                    i19 = i14;
                    i21 = i242;
                }
                i17 = i15;
            } else if (i18 < i19) {
                if (i17 > 0) {
                    int[] iArr2 = this.f13069d;
                    if (i18 <= iArr2[i17 - 1]) {
                        i17--;
                        i11 = d0(this.f13067b[i20], iArr2[i17]);
                        i20++;
                        i5 ^= 1;
                    }
                }
                this.f13069d[i17] = i18;
                i11 = this.f13067b[i20];
                i17++;
                i20++;
                i5 ^= 1;
            } else if (i19 < i18) {
                if (i17 > 0) {
                    int[] iArr3 = this.f13069d;
                    if (i19 <= iArr3[i17 - 1]) {
                        i10 = i17 - 1;
                        i19 = d0(iArr[i21], iArr3[i10]);
                        i21++;
                        i5 ^= 2;
                    }
                }
                this.f13069d[i17] = i19;
                i19 = iArr[i21];
                i10 = i17 + 1;
                i21++;
                i5 ^= 2;
            } else if (i18 == 1114112) {
                break;
            } else {
                if (i17 > 0) {
                    int[] iArr4 = this.f13069d;
                    if (i18 <= iArr4[i17 - 1]) {
                        i9 = i17 - 1;
                        i8 = d0(this.f13067b[i20], iArr4[i9]);
                        i20++;
                        i6 = i21 + 1;
                        i7 = iArr[i21];
                        r11 = i5 ^ 3;
                    }
                }
                this.f13069d[i17] = i18;
                i8 = this.f13067b[i20];
                i9 = i17 + 1;
                i20++;
                i6 = i21 + 1;
                i7 = iArr[i21];
                r11 = i5 ^ 3;
            }
            int i25 = i7;
            i21 = i6;
            i19 = i25;
        }
        int[] iArr5 = this.f13069d;
        iArr5[i17] = 1114112;
        this.f13066a = i17 + 1;
        int[] iArr6 = this.f13067b;
        this.f13067b = iArr5;
        this.f13069d = iArr6;
        this.f13071f = null;
        return this;
    }

    private static final void r(UnicodeSet unicodeSet, int i4, StringBuilder sb) {
        if (i4 < 0) {
            return;
        }
        if (i4 > 31) {
            unicodeSet.l(i4);
            return;
        }
        unicodeSet.o(sb.toString());
        sb.setLength(0);
    }

    private void s(CharSequence charSequence) {
        if (this.f13070e == f13062i) {
            this.f13070e = new TreeSet();
        }
        this.f13070e.add(charSequence.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        r0 = r1 - 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.ibm.icu.text.UnicodeSet t(int r6) {
        /*
            r5 = this;
            if (r6 < 0) goto L_0x0095
            r0 = 1114111(0x10ffff, float:1.561202E-39)
            if (r6 > r0) goto L_0x0095
            int r1 = r5.V(r6)
            r2 = r1 & 1
            if (r2 == 0) goto L_0x0010
            return r5
        L_0x0010:
            int[] r2 = r5.f13067b
            r3 = r2[r1]
            int r3 = r3 + -1
            if (r6 != r3) goto L_0x004a
            r2[r1] = r6
            if (r6 != r0) goto L_0x002f
            int r0 = r5.f13066a
            int r0 = r0 + 1
            r5.U(r0)
            int[] r0 = r5.f13067b
            int r2 = r5.f13066a
            int r3 = r2 + 1
            r5.f13066a = r3
            r3 = 1114112(0x110000, float:1.561203E-39)
            r0[r2] = r3
        L_0x002f:
            if (r1 <= 0) goto L_0x0091
            int[] r0 = r5.f13067b
            int r2 = r1 + -1
            r3 = r0[r2]
            if (r6 != r3) goto L_0x0091
            int r6 = r1 + 1
            int r3 = r5.f13066a
            int r3 = r3 - r1
            int r3 = r3 + -1
            java.lang.System.arraycopy(r0, r6, r0, r2, r3)
            int r6 = r5.f13066a
            int r6 = r6 + -2
            r5.f13066a = r6
            goto L_0x0091
        L_0x004a:
            if (r1 <= 0) goto L_0x0057
            int r0 = r1 + -1
            r3 = r2[r0]
            if (r6 != r3) goto L_0x0057
            int r3 = r3 + 1
            r2[r0] = r3
            goto L_0x0091
        L_0x0057:
            int r0 = r5.f13066a
            int r3 = r0 + 2
            int r4 = r2.length
            if (r3 <= r4) goto L_0x007b
            int r0 = r0 + 2
            int r0 = r5.f0(r0)
            int[] r0 = new int[r0]
            if (r1 == 0) goto L_0x006e
            int[] r2 = r5.f13067b
            r3 = 0
            java.lang.System.arraycopy(r2, r3, r0, r3, r1)
        L_0x006e:
            int[] r2 = r5.f13067b
            int r3 = r1 + 2
            int r4 = r5.f13066a
            int r4 = r4 - r1
            java.lang.System.arraycopy(r2, r1, r0, r3, r4)
            r5.f13067b = r0
            goto L_0x0081
        L_0x007b:
            int r3 = r1 + 2
            int r0 = r0 - r1
            java.lang.System.arraycopy(r2, r1, r2, r3, r0)
        L_0x0081:
            int[] r0 = r5.f13067b
            r0[r1] = r6
            int r1 = r1 + 1
            int r6 = r6 + 1
            r0[r1] = r6
            int r6 = r5.f13066a
            int r6 = r6 + 2
            r5.f13066a = r6
        L_0x0091:
            r6 = 0
            r5.f13071f = r6
            return r5
        L_0x0095:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid code point U+"
            r1.append(r2)
            long r2 = (long) r6
            r6 = 6
            java.lang.String r6 = Y1.z.h(r2, r6)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.text.UnicodeSet.t(int):com.ibm.icu.text.UnicodeSet");
    }

    private int t0(CharSequence charSequence, int i4, SpanCondition spanCondition, com.ibm.icu.util.f fVar) {
        boolean z3;
        int codePointAt;
        if (spanCondition != SpanCondition.NOT_CONTAINED) {
            z3 = true;
        } else {
            z3 = false;
        }
        int length = charSequence.length();
        do {
            codePointAt = Character.codePointAt(charSequence, i4);
            if (z3 != S(codePointAt) || (i4 = i4 + Character.charCount(codePointAt)) >= length) {
                return i4;
            }
            codePointAt = Character.codePointAt(charSequence, i4);
            break;
        } while ((i4 = i4 + Character.charCount(codePointAt)) >= length);
        return i4;
    }

    private UnicodeSet u(int i4, int i5) {
        int i6;
        if (i4 < 0 || i4 > 1114111) {
            throw new IllegalArgumentException("Invalid code point U+" + z.h((long) i4, 6));
        } else if (i5 < 0 || i5 > 1114111) {
            throw new IllegalArgumentException("Invalid code point U+" + z.h((long) i5, 6));
        } else {
            if (i4 < i5) {
                int i7 = i5 + 1;
                int i8 = this.f13066a;
                if ((i8 & 1) != 0) {
                    if (i8 == 1) {
                        i6 = -2;
                    } else {
                        i6 = this.f13067b[i8 - 2];
                    }
                    if (i6 <= i4) {
                        G();
                        if (i6 == i4) {
                            int[] iArr = this.f13067b;
                            int i9 = this.f13066a;
                            iArr[i9 - 2] = i7;
                            if (i7 == 1114112) {
                                this.f13066a = i9 - 1;
                            }
                        } else {
                            int[] iArr2 = this.f13067b;
                            int i10 = this.f13066a;
                            iArr2[i10 - 1] = i4;
                            if (i7 < 1114112) {
                                U(i10 + 2);
                                int[] iArr3 = this.f13067b;
                                int i11 = this.f13066a;
                                int i12 = i11 + 1;
                                this.f13066a = i12;
                                iArr3[i11] = i7;
                                this.f13066a = i11 + 2;
                                iArr3[i12] = 1114112;
                            } else {
                                U(i10 + 1);
                                int[] iArr4 = this.f13067b;
                                int i13 = this.f13066a;
                                this.f13066a = i13 + 1;
                                iArr4[i13] = 1114112;
                            }
                        }
                        this.f13071f = null;
                        return this;
                    }
                }
                p(g0(i4, i5), 2, 0);
            } else if (i4 == i5) {
                l(i4);
            }
            return this;
        }
    }

    private static void u0(r rVar, String str) {
        throw new IllegalArgumentException("Error: " + str + " at \"" + z.g(rVar.toString()) + '\"');
    }

    private static void v(Appendable appendable, CharSequence charSequence) {
        try {
            appendable.append(charSequence);
        } catch (IOException e4) {
            throw new ICUUncheckedIOException((Throwable) e4);
        }
    }

    private static void w(Appendable appendable, int i4) {
        if (i4 <= 65535) {
            try {
                appendable.append((char) i4);
            } catch (IOException e4) {
                throw new ICUUncheckedIOException((Throwable) e4);
            }
        } else {
            appendable.append(j.e(i4)).append(j.f(i4));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.ibm.icu.text.UnicodeSet w0(int[] r7, int r8, int r9) {
        /*
            r6 = this;
            int r0 = r6.f13066a
            int r0 = r0 + r8
            r6.T(r0)
            int[] r8 = r6.f13067b
            r0 = 0
            r8 = r8[r0]
            r1 = 1
            if (r9 == r1) goto L_0x0019
            r2 = 2
            if (r9 != r2) goto L_0x0012
            goto L_0x0019
        L_0x0012:
            r9 = r7[r0]
        L_0x0014:
            r2 = r1
            r5 = r0
            r0 = r9
            r9 = r5
            goto L_0x0023
        L_0x0019:
            r9 = r7[r0]
            if (r9 != 0) goto L_0x0020
            r9 = r7[r1]
            goto L_0x0014
        L_0x0020:
            r9 = r0
            r2 = r1
            r1 = r9
        L_0x0023:
            if (r8 >= r0) goto L_0x0034
            int[] r3 = r6.f13069d
            int r4 = r9 + 1
            r3[r9] = r8
            int[] r8 = r6.f13067b
            int r9 = r2 + 1
            r8 = r8[r2]
            r2 = r9
        L_0x0032:
            r9 = r4
            goto L_0x0023
        L_0x0034:
            if (r0 >= r8) goto L_0x0043
            int[] r3 = r6.f13069d
            int r4 = r9 + 1
            r3[r9] = r0
            int r0 = r1 + 1
            r9 = r7[r1]
            r1 = r0
            r0 = r9
            goto L_0x0032
        L_0x0043:
            r0 = 1114112(0x110000, float:1.561203E-39)
            if (r8 == r0) goto L_0x0056
            int[] r8 = r6.f13067b
            int r0 = r2 + 1
            r8 = r8[r2]
            int r2 = r1 + 1
            r1 = r7[r1]
            r5 = r2
            r2 = r0
            r0 = r1
            r1 = r5
            goto L_0x0023
        L_0x0056:
            int[] r7 = r6.f13069d
            int r8 = r9 + 1
            r7[r9] = r0
            r6.f13066a = r8
            int[] r8 = r6.f13067b
            r6.f13067b = r7
            r6.f13069d = r8
            r7 = 0
            r6.f13071f = r7
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.text.UnicodeSet.w0(int[], int, int):com.ibm.icu.text.UnicodeSet");
    }

    private Appendable x(Appendable appendable, boolean z3, boolean z4) {
        int i4;
        try {
            appendable.append('[');
            int i5 = this.f13066a;
            int i6 = i5 & -2;
            int i7 = 0;
            if (i5 >= 4 && this.f13067b[0] == 0 && i6 == i5 && !b0()) {
                appendable.append('^');
                i6--;
                i7 = 1;
            }
            while (i4 < i6) {
                int[] iArr = this.f13067b;
                int i8 = iArr[i4];
                int i9 = iArr[i4 + 1] - 1;
                if (55296 <= i9) {
                    if (i9 <= 56319) {
                        int i10 = i4;
                        while (true) {
                            i10 += 2;
                            if (i10 >= i6 || this.f13067b[i10] > 56319) {
                                int i11 = i10;
                            }
                        }
                        int i112 = i10;
                        while (i112 < i6) {
                            int[] iArr2 = this.f13067b;
                            int i12 = iArr2[i112];
                            if (i12 > 57343) {
                                break;
                            }
                            b(appendable, i12, iArr2[i112 + 1] - 1, z3);
                            i112 += 2;
                        }
                        while (i4 < i10) {
                            int[] iArr3 = this.f13067b;
                            b(appendable, iArr3[i4], iArr3[i4 + 1] - 1, z3);
                            i4 += 2;
                        }
                        i4 = i112;
                    }
                }
                b(appendable, i8, i9, z3);
                i4 += 2;
            }
            if (z4 && b0()) {
                for (String d4 : this.f13070e) {
                    appendable.append('{');
                    d(appendable, d4, z3);
                    appendable.append('}');
                }
            }
            appendable.append(']');
            return appendable;
        } catch (IOException e4) {
            throw new ICUUncheckedIOException((Throwable) e4);
        }
    }

    private void y(a aVar, UnicodeSet unicodeSet) {
        H();
        int X3 = unicodeSet.X();
        int i4 = -1;
        for (int i5 = 0; i5 < X3; i5++) {
            int Y3 = unicodeSet.Y(i5);
            for (int Z3 = unicodeSet.Z(i5); Z3 <= Y3; Z3++) {
                if (aVar.a(Z3)) {
                    if (i4 < 0) {
                        i4 = Z3;
                    }
                } else if (i4 >= 0) {
                    u(i4, Z3 - 1);
                    i4 = -1;
                }
            }
        }
        if (i4 >= 0) {
            u(i4, 1114111);
        }
    }

    public final UnicodeSet A(String str) {
        G();
        return B(str, (ParsePosition) null, (C0366h) null, 1);
    }

    public UnicodeSet B(String str, ParsePosition parsePosition, C0366h hVar, int i4) {
        boolean z3;
        if (parsePosition == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            parsePosition = new ParsePosition(0);
        }
        StringBuilder sb = new StringBuilder();
        r rVar = new r(str, hVar, parsePosition);
        C(rVar, hVar, sb, i4, 0);
        if (rVar.g()) {
            u0(rVar, "Extra chars in variable value");
        }
        this.f13071f = sb.toString();
        if (z3) {
            int index = parsePosition.getIndex();
            if ((i4 & 1) != 0) {
                index = o.b(str, index);
            }
            if (index != str.length()) {
                throw new IllegalArgumentException("Parse of \"" + str + "\" failed at " + index);
            }
        }
        return this;
    }

    public UnicodeSet D(String str, String str2, C0366h hVar) {
        int i4;
        int i5;
        G();
        int i6 = 4106;
        boolean z3 = false;
        if (str2.length() > 0) {
            int i7 = Z1.c.i(str);
            if (i7 == 4101) {
                i7 = 8192;
            }
            if ((i7 >= 0 && i7 < 72) || ((i7 >= 4096 && i7 < 4121) || (i7 >= 8192 && i7 < 8193))) {
                try {
                    i4 = Z1.c.j(i7, str2);
                } catch (IllegalArgumentException e4) {
                    if (i7 == 4098 || i7 == 4112 || i7 == 4113) {
                        i4 = Integer.parseInt(o.c(str2));
                        if (i4 < 0 || i4 > 255) {
                            throw e4;
                        }
                    } else {
                        throw e4;
                    }
                }
            } else if (i7 == 12288) {
                y(new d(Double.parseDouble(o.c(str2))), com.ibm.icu.impl.b.a(i7));
                return this;
            } else if (i7 == 16384) {
                y(new g(h.d(e0(str2))), com.ibm.icu.impl.b.a(i7));
                return this;
            } else if (i7 == 16389) {
                int e5 = Z1.c.e(e0(str2));
                if (e5 != -1) {
                    H();
                    t(e5);
                    return this;
                }
                throw new IllegalArgumentException("Invalid character name");
            } else if (i7 == 16395) {
                throw new IllegalArgumentException("Unicode_1_Name (na1) not supported");
            } else if (i7 == 28672) {
                i4 = Z1.c.j(4106, str2);
            } else {
                throw new IllegalArgumentException("Unsupported property");
            }
            i5 = i7;
        } else {
            u uVar = u.f13043e;
            int i8 = uVar.i(8192, str);
            if (i8 == -1) {
                i8 = uVar.i(4106, str);
                if (i8 == -1) {
                    int g4 = uVar.g(str);
                    if (g4 == -1) {
                        i5 = -1;
                    } else {
                        i5 = g4;
                    }
                    if (i5 >= 0 && i5 < 72) {
                        i4 = 1;
                    } else if (i5 != -1) {
                        throw new IllegalArgumentException("Missing property value");
                    } else if (u.b("ANY", str) == 0) {
                        o0(0, 1114111);
                        return this;
                    } else if (u.b("ASCII", str) == 0) {
                        o0(0, 127);
                        return this;
                    } else if (u.b("Assigned", str) == 0) {
                        i4 = 1;
                        z3 = true;
                        i5 = 8192;
                    } else {
                        throw new IllegalArgumentException("Invalid property alias: " + str + "=" + str2);
                    }
                }
            } else {
                i6 = 8192;
            }
            i4 = i8;
        }
        z(i5, i4);
        if (z3) {
            Q().k0();
        }
        return this;
    }

    public UnicodeSet H() {
        G();
        this.f13067b[0] = 1114112;
        this.f13066a = 1;
        this.f13071f = null;
        if (b0()) {
            this.f13070e.clear();
        }
        return this;
    }

    public UnicodeSet I() {
        return new UnicodeSet(this);
    }

    public UnicodeSet J(int i4) {
        G();
        if ((i4 & 6) != 0) {
            p pVar = p.f12932g;
            UnicodeSet unicodeSet = new UnicodeSet(this);
            ULocale uLocale = ULocale.ROOT;
            int i5 = i4 & 2;
            if (i5 != 0 && unicodeSet.b0()) {
                unicodeSet.f13070e.clear();
            }
            int X3 = X();
            StringBuilder sb = new StringBuilder();
            for (int i6 = 0; i6 < X3; i6++) {
                int Z3 = Z(i6);
                int Y3 = Y(i6);
                if (i5 != 0) {
                    while (Z3 <= Y3) {
                        pVar.a(Z3, unicodeSet);
                        Z3++;
                    }
                } else {
                    while (Z3 <= Y3) {
                        r(unicodeSet, pVar.E(Z3, (p.b) null, sb, 1), sb);
                        r(unicodeSet, pVar.F(Z3, (p.b) null, sb, 1), sb);
                        r(unicodeSet, pVar.G(Z3, (p.b) null, sb, 1), sb);
                        r(unicodeSet, pVar.D(Z3, sb, 0), sb);
                        Z3++;
                    }
                }
            }
            if (b0()) {
                if (i5 != 0) {
                    for (String a4 : this.f13070e) {
                        String a5 = Z1.c.a(a4, 0);
                        if (!pVar.c(a5, unicodeSet)) {
                            unicodeSet.o(a5);
                        }
                    }
                } else {
                    C0359a n4 = C0359a.n(uLocale);
                    for (String str : this.f13070e) {
                        unicodeSet.o(Z1.c.s(uLocale, str));
                        unicodeSet.o(Z1.c.t(uLocale, str, n4));
                        unicodeSet.o(Z1.c.v(uLocale, str));
                        unicodeSet.o(Z1.c.a(str, 0));
                    }
                }
            }
            p0(unicodeSet);
        }
        return this;
    }

    public UnicodeSet K() {
        G();
        int i4 = this.f13066a;
        int i5 = i4 + 7;
        int[] iArr = this.f13067b;
        if (i5 < iArr.length) {
            this.f13067b = Arrays.copyOf(iArr, i4);
        }
        this.f13068c = null;
        this.f13069d = null;
        SortedSet sortedSet = this.f13070e;
        SortedSet sortedSet2 = f13062i;
        if (sortedSet != sortedSet2 && sortedSet.isEmpty()) {
            this.f13070e = sortedSet2;
        }
        return this;
    }

    /* renamed from: O */
    public int compareTo(UnicodeSet unicodeSet) {
        return P(unicodeSet, ComparisonStyle.SHORTER_FIRST);
    }

    public int P(UnicodeSet unicodeSet, ComparisonStyle comparisonStyle) {
        int L3;
        int size;
        boolean z3;
        boolean z4 = false;
        if (comparisonStyle == ComparisonStyle.LEXICOGRAPHIC || (size = size() - unicodeSet.size()) == 0) {
            int i4 = 0;
            while (true) {
                int i5 = this.f13067b[i4];
                int i6 = unicodeSet.f13067b[i4];
                int i7 = i5 - i6;
                if (i7 != 0) {
                    if (i5 == 1114112) {
                        if (!b0()) {
                            return 1;
                        }
                        return L((String) this.f13070e.first(), unicodeSet.f13067b[i4]);
                    } else if (i6 == 1114112) {
                        if (!unicodeSet.b0() || (L3 = L((String) unicodeSet.f13070e.first(), this.f13067b[i4])) > 0) {
                            return -1;
                        }
                        if (L3 < 0) {
                            return 1;
                        }
                        return 0;
                    } else if ((i4 & 1) == 0) {
                        return i7;
                    } else {
                        return -i7;
                    }
                } else if (i5 == 1114112) {
                    return M(this.f13070e, unicodeSet.f13070e);
                } else {
                    i4++;
                }
            }
        } else {
            if (size < 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (comparisonStyle == ComparisonStyle.SHORTER_FIRST) {
                z4 = true;
            }
            if (z3 == z4) {
                return -1;
            }
            return 1;
        }
    }

    public UnicodeSet Q() {
        G();
        int[] iArr = this.f13067b;
        if (iArr[0] == 0) {
            System.arraycopy(iArr, 1, iArr, 0, this.f13066a - 1);
            this.f13066a--;
        } else {
            U(this.f13066a + 1);
            int[] iArr2 = this.f13067b;
            System.arraycopy(iArr2, 0, iArr2, 1, this.f13066a);
            this.f13067b[0] = 0;
            this.f13066a++;
        }
        this.f13071f = null;
        return this;
    }

    public UnicodeSet R(int i4, int i5) {
        G();
        if (i4 < 0 || i4 > 1114111) {
            throw new IllegalArgumentException("Invalid code point U+" + z.h((long) i4, 6));
        } else if (i5 < 0 || i5 > 1114111) {
            throw new IllegalArgumentException("Invalid code point U+" + z.h((long) i5, 6));
        } else {
            if (i4 <= i5) {
                w0(g0(i4, i5), 2, 0);
            }
            this.f13071f = null;
            return this;
        }
    }

    public boolean S(int i4) {
        if (i4 < 0 || i4 > 1114111) {
            throw new IllegalArgumentException("Invalid code point U+" + z.h((long) i4, 6));
        } else if (this.f13072g != null) {
            return this.f13072g.a(i4);
        } else {
            if (this.f13073h != null) {
                return this.f13073h.b(i4);
            }
            if ((V(i4) & 1) != 0) {
                return true;
            }
            return false;
        }
    }

    public UnicodeSet W() {
        if (!c0()) {
            K();
            if (b0()) {
                this.f13073h = new y(this, new ArrayList(this.f13070e), 127);
            }
            if (this.f13073h == null || !this.f13073h.f()) {
                this.f13072g = new Y1.b(this.f13067b, this.f13066a);
            }
        }
        return this;
    }

    public int X() {
        return this.f13066a / 2;
    }

    public int Y(int i4) {
        return this.f13067b[(i4 * 2) + 1] - 1;
    }

    public int Z(int i4) {
        return this.f13067b[i4 * 2];
    }

    public boolean b0() {
        return !this.f13070e.isEmpty();
    }

    public boolean c0() {
        if (this.f13072g == null && this.f13073h == null) {
            return false;
        }
        return true;
    }

    public Object clone() {
        if (c0()) {
            return this;
        }
        return new UnicodeSet(this);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        try {
            UnicodeSet unicodeSet = (UnicodeSet) obj;
            if (this.f13066a != unicodeSet.f13066a) {
                return false;
            }
            for (int i4 = 0; i4 < this.f13066a; i4++) {
                if (this.f13067b[i4] != unicodeSet.f13067b[i4]) {
                    return false;
                }
            }
            if (!this.f13070e.equals(unicodeSet.f13070e)) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final UnicodeSet h0(int i4) {
        return i0(i4, i4);
    }

    public int hashCode() {
        int i4 = this.f13066a;
        for (int i5 = 0; i5 < this.f13066a; i5++) {
            i4 = (i4 * 1000003) + this.f13067b[i5];
        }
        return i4;
    }

    public UnicodeSet i0(int i4, int i5) {
        G();
        if (i4 < 0 || i4 > 1114111) {
            throw new IllegalArgumentException("Invalid code point U+" + z.h((long) i4, 6));
        } else if (i5 < 0 || i5 > 1114111) {
            throw new IllegalArgumentException("Invalid code point U+" + z.h((long) i5, 6));
        } else {
            if (i4 <= i5) {
                m0(g0(i4, i5), 2, 2);
            }
            return this;
        }
    }

    public Iterator iterator() {
        return new f(this);
    }

    public UnicodeSet j0(UnicodeSet unicodeSet) {
        G();
        m0(unicodeSet.f13067b, unicodeSet.f13066a, 2);
        if (b0() && unicodeSet.b0()) {
            this.f13070e.removeAll(unicodeSet.f13070e);
        }
        return this;
    }

    public final UnicodeSet k0() {
        G();
        if (b0()) {
            this.f13070e.clear();
            this.f13071f = null;
        }
        return this;
    }

    public final UnicodeSet l(int i4) {
        G();
        return t(i4);
    }

    public UnicodeSet n(int i4, int i5) {
        G();
        return u(i4, i5);
    }

    public UnicodeSet n0(UnicodeSet unicodeSet) {
        G();
        m0(unicodeSet.f13067b, unicodeSet.f13066a, 0);
        if (b0()) {
            if (!unicodeSet.b0()) {
                this.f13070e.clear();
            } else {
                this.f13070e.retainAll(unicodeSet.f13070e);
            }
        }
        return this;
    }

    public final UnicodeSet o(CharSequence charSequence) {
        G();
        int a02 = a0(charSequence);
        if (a02 < 0) {
            String charSequence2 = charSequence.toString();
            if (!this.f13070e.contains(charSequence2)) {
                s(charSequence2);
                this.f13071f = null;
            }
        } else {
            u(a02, a02);
        }
        return this;
    }

    public UnicodeSet o0(int i4, int i5) {
        G();
        H();
        R(i4, i5);
        return this;
    }

    public UnicodeSet p0(UnicodeSet unicodeSet) {
        G();
        this.f13067b = Arrays.copyOf(unicodeSet.f13067b, unicodeSet.f13066a);
        this.f13066a = unicodeSet.f13066a;
        this.f13071f = unicodeSet.f13071f;
        if (unicodeSet.b0()) {
            this.f13070e = new TreeSet(unicodeSet.f13070e);
        } else {
            this.f13070e = f13062i;
        }
        return this;
    }

    public UnicodeSet q(UnicodeSet unicodeSet) {
        G();
        p(unicodeSet.f13067b, unicodeSet.f13066a, 0);
        if (unicodeSet.b0()) {
            SortedSet sortedSet = this.f13070e;
            if (sortedSet == f13062i) {
                this.f13070e = new TreeSet(unicodeSet.f13070e);
            } else {
                sortedSet.addAll(unicodeSet.f13070e);
            }
        }
        return this;
    }

    public int q0(CharSequence charSequence, int i4, SpanCondition spanCondition) {
        int i5;
        int length = charSequence.length();
        if (i4 < 0) {
            i4 = 0;
        } else if (i4 >= length) {
            return length;
        }
        if (this.f13072g != null) {
            return this.f13072g.f(charSequence, i4, spanCondition, (com.ibm.icu.util.f) null);
        }
        if (this.f13073h != null) {
            return this.f13073h.g(charSequence, i4, spanCondition);
        }
        if (b0()) {
            if (spanCondition == SpanCondition.NOT_CONTAINED) {
                i5 = 33;
            } else {
                i5 = 34;
            }
            y yVar = new y(this, new ArrayList(this.f13070e), i5);
            if (yVar.f()) {
                return yVar.g(charSequence, i4, spanCondition);
            }
        }
        return t0(charSequence, i4, spanCondition, (com.ibm.icu.util.f) null);
    }

    public int r0(CharSequence charSequence, SpanCondition spanCondition) {
        return q0(charSequence, 0, spanCondition);
    }

    public int s0(CharSequence charSequence, int i4, SpanCondition spanCondition) {
        int codePointBefore;
        int i5;
        boolean z3 = false;
        if (i4 <= 0) {
            return 0;
        }
        if (i4 > charSequence.length()) {
            i4 = charSequence.length();
        }
        if (this.f13072g != null) {
            return this.f13072g.g(charSequence, i4, spanCondition);
        }
        if (this.f13073h != null) {
            return this.f13073h.h(charSequence, i4, spanCondition);
        }
        if (b0()) {
            if (spanCondition == SpanCondition.NOT_CONTAINED) {
                i5 = 17;
            } else {
                i5 = 18;
            }
            y yVar = new y(this, new ArrayList(this.f13070e), i5);
            if (yVar.f()) {
                return yVar.h(charSequence, i4, spanCondition);
            }
        }
        if (spanCondition != SpanCondition.NOT_CONTAINED) {
            z3 = true;
        }
        do {
            codePointBefore = Character.codePointBefore(charSequence, i4);
            if (z3 != S(codePointBefore) || (i4 = i4 - Character.charCount(codePointBefore)) <= 0) {
                return i4;
            }
            codePointBefore = Character.codePointBefore(charSequence, i4);
            break;
        } while ((i4 = i4 - Character.charCount(codePointBefore)) <= 0);
        return i4;
    }

    public int size() {
        int X3 = X();
        int i4 = 0;
        for (int i5 = 0; i5 < X3; i5++) {
            i4 += (Y(i5) - Z(i5)) + 1;
        }
        return i4 + this.f13070e.size();
    }

    public String toString() {
        return v0(true);
    }

    public String v0(boolean z3) {
        String str = this.f13071f;
        if (str == null || z3) {
            return ((StringBuilder) g(new StringBuilder(), z3)).toString();
        }
        return str;
    }

    public UnicodeSet z(int i4, int i5) {
        if (i4 == 8192) {
            y(new b(i5), com.ibm.icu.impl.b.a(i4));
        } else if (i4 == 28672) {
            y(new e(i5), com.ibm.icu.impl.b.a(i4));
        } else if (i4 < 0 || i4 >= 72) {
            if (4096 > i4 || i4 >= 4121) {
                throw new IllegalArgumentException("unsupported property " + i4);
            }
            y(new c(i4, i5), com.ibm.icu.impl.b.a(i4));
        } else if (i5 == 0 || i5 == 1) {
            p0(Z1.b.a(i4));
            if (i5 == 0) {
                Q().k0();
            }
        } else {
            H();
        }
        return this;
    }

    public UnicodeSet(UnicodeSet unicodeSet) {
        this.f13070e = f13062i;
        this.f13071f = null;
        p0(unicodeSet);
    }

    public UnicodeSet(int i4, int i5) {
        this();
        n(i4, i5);
    }

    public UnicodeSet(int... iArr) {
        this.f13070e = f13062i;
        this.f13071f = null;
        if ((iArr.length & 1) == 0) {
            int[] iArr2 = new int[(iArr.length + 1)];
            this.f13067b = iArr2;
            this.f13066a = iArr2.length;
            int i4 = -1;
            int i5 = 0;
            while (i5 < iArr.length) {
                int i6 = iArr[i5];
                if (i4 < i6) {
                    int[] iArr3 = this.f13067b;
                    int i7 = i5 + 1;
                    iArr3[i5] = i6;
                    int i8 = iArr[i7] + 1;
                    if (i6 < i8) {
                        i5 += 2;
                        iArr3[i7] = i8;
                        i4 = i8;
                    } else {
                        throw new IllegalArgumentException("Must be monotonically increasing.");
                    }
                } else {
                    throw new IllegalArgumentException("Must be monotonically increasing.");
                }
            }
            this.f13067b[i5] = 1114112;
            return;
        }
        throw new IllegalArgumentException("Must have even number of integers");
    }

    public UnicodeSet(String str) {
        this();
        B(str, (ParsePosition) null, (C0366h) null, 1);
    }
}
