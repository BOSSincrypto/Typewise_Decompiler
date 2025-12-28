package com.ibm.icu.impl.breakiter;

import Z1.c;
import com.ibm.icu.text.UnicodeSet;

public class k extends e {

    /* renamed from: b  reason: collision with root package name */
    private g f12664b;

    /* renamed from: c  reason: collision with root package name */
    private UnicodeSet f12665c;

    /* renamed from: d  reason: collision with root package name */
    private UnicodeSet f12666d = new UnicodeSet(3585, 3630, 3648, 3652);

    /* renamed from: e  reason: collision with root package name */
    private UnicodeSet f12667e;

    /* renamed from: f  reason: collision with root package name */
    private UnicodeSet f12668f;

    public k() {
        UnicodeSet unicodeSet = new UnicodeSet("[[:Thai:]&[:LineBreak=SA:]]");
        UnicodeSet unicodeSet2 = new UnicodeSet("[[:Thai:]&[:LineBreak=SA:]&[:M:]]");
        this.f12668f = unicodeSet2;
        unicodeSet2.l(32);
        UnicodeSet unicodeSet3 = new UnicodeSet();
        this.f12667e = unicodeSet3;
        unicodeSet3.l(3631);
        this.f12667e.l(3654);
        unicodeSet.K();
        UnicodeSet unicodeSet4 = new UnicodeSet(unicodeSet);
        this.f12665c = unicodeSet4;
        unicodeSet4.h0(3633);
        this.f12665c.i0(3648, 3652);
        this.f12668f.K();
        this.f12665c.K();
        this.f12666d.K();
        this.f12667e.K();
        unicodeSet.W();
        this.f12668f.W();
        this.f12665c.W();
        this.f12666d.W();
        this.f12667e.W();
        d(unicodeSet);
        this.f12664b = f.a("Thai");
    }

    public boolean b(int i4) {
        if (c.h(i4, 4106) == 38) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x00fe A[LOOP:5: B:51:0x00ec->B:55:0x00fe, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0108 A[EDGE_INSN: B:96:0x0108->B:56:0x0108 ?: BREAK  
    EDGE_INSN: B:97:0x0108->B:56:0x0108 ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x016e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int c(java.text.CharacterIterator r17, int r18, int r19, com.ibm.icu.impl.breakiter.e.a r20, boolean r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r19
            int r3 = r2 - r18
            r4 = 4
            r5 = 0
            if (r3 >= r4) goto L_0x000d
            return r5
        L_0x000d:
            r3 = 3
            com.ibm.icu.impl.breakiter.e$b[] r4 = new com.ibm.icu.impl.breakiter.e.b[r3]
            r6 = r5
        L_0x0011:
            if (r6 >= r3) goto L_0x001d
            com.ibm.icu.impl.breakiter.e$b r7 = new com.ibm.icu.impl.breakiter.e$b
            r7.<init>()
            r4[r6] = r7
            int r6 = r6 + 1
            goto L_0x0011
        L_0x001d:
            r17.setIndex(r18)
            r6 = r5
        L_0x0021:
            int r7 = r17.getIndex()
            if (r7 >= r2) goto L_0x0172
            int r8 = r6 % 3
            r9 = r4[r8]
            com.ibm.icu.impl.breakiter.g r10 = r0.f12664b
            int r9 = r9.c(r1, r10, r2)
            r10 = 1
            if (r9 != r10) goto L_0x003d
            r8 = r4[r8]
            int r8 = r8.a(r1)
        L_0x003a:
            int r6 = r6 + 1
            goto L_0x0089
        L_0x003d:
            if (r9 <= r10) goto L_0x0088
            int r9 = r17.getIndex()
            if (r9 >= r2) goto L_0x0081
        L_0x0045:
            int r9 = r6 + 1
            int r9 = r9 % r3
            r11 = r4[r9]
            com.ibm.icu.impl.breakiter.g r12 = r0.f12664b
            int r11 = r11.c(r1, r12, r2)
            if (r11 <= 0) goto L_0x0079
            r11 = r4[r8]
            r11.e()
            int r11 = r17.getIndex()
            if (r11 < r2) goto L_0x005e
            goto L_0x0081
        L_0x005e:
            int r11 = r6 + 2
            int r11 = r11 % r3
            r11 = r4[r11]
            com.ibm.icu.impl.breakiter.g r12 = r0.f12664b
            int r11 = r11.c(r1, r12, r2)
            if (r11 <= 0) goto L_0x0071
            r9 = r4[r8]
            r9.e()
            goto L_0x0081
        L_0x0071:
            r11 = r4[r9]
            boolean r11 = r11.b(r1)
            if (r11 != 0) goto L_0x005e
        L_0x0079:
            r9 = r4[r8]
            boolean r9 = r9.b(r1)
            if (r9 != 0) goto L_0x0045
        L_0x0081:
            r8 = r4[r8]
            int r8 = r8.a(r1)
            goto L_0x003a
        L_0x0088:
            r8 = r5
        L_0x0089:
            int r9 = r17.getIndex()
            if (r9 >= r2) goto L_0x00ec
            if (r8 >= r3) goto L_0x00ec
            int r9 = r6 % 3
            r11 = r4[r9]
            com.ibm.icu.impl.breakiter.g r12 = r0.f12664b
            int r11 = r11.c(r1, r12, r2)
            if (r11 > 0) goto L_0x00e7
            if (r8 == 0) goto L_0x00a7
            r9 = r4[r9]
            int r9 = r9.d()
            if (r9 >= r3) goto L_0x00e7
        L_0x00a7:
            int r9 = r7 + r8
            int r11 = r2 - r9
            char r12 = r17.current()
            r13 = r5
        L_0x00b0:
            r17.next()
            char r14 = r17.current()
            int r13 = r13 + r10
            int r11 = r11 + -1
            if (r11 > 0) goto L_0x00bd
            goto L_0x00df
        L_0x00bd:
            com.ibm.icu.text.UnicodeSet r15 = r0.f12665c
            boolean r12 = r15.S(r12)
            if (r12 == 0) goto L_0x00e5
            com.ibm.icu.text.UnicodeSet r12 = r0.f12666d
            boolean r12 = r12.S(r14)
            if (r12 == 0) goto L_0x00e5
            int r12 = r6 + 1
            int r12 = r12 % r3
            r12 = r4[r12]
            com.ibm.icu.impl.breakiter.g r15 = r0.f12664b
            int r12 = r12.c(r1, r15, r2)
            int r15 = r9 + r13
            r1.setIndex(r15)
            if (r12 <= 0) goto L_0x00e5
        L_0x00df:
            if (r8 > 0) goto L_0x00e3
            int r6 = r6 + 1
        L_0x00e3:
            int r8 = r8 + r13
            goto L_0x00ec
        L_0x00e5:
            r12 = r14
            goto L_0x00b0
        L_0x00e7:
            int r9 = r7 + r8
            r1.setIndex(r9)
        L_0x00ec:
            int r9 = r17.getIndex()
            if (r9 >= r2) goto L_0x0108
            com.ibm.icu.text.UnicodeSet r10 = r0.f12668f
            char r11 = r17.current()
            boolean r10 = r10.S(r11)
            if (r10 == 0) goto L_0x0108
            r17.next()
            int r10 = r17.getIndex()
            int r10 = r10 - r9
            int r8 = r8 + r10
            goto L_0x00ec
        L_0x0108:
            int r9 = r17.getIndex()
            if (r9 >= r2) goto L_0x0164
            if (r8 <= 0) goto L_0x0164
            int r9 = r6 % 3
            r9 = r4[r9]
            com.ibm.icu.impl.breakiter.g r10 = r0.f12664b
            int r9 = r9.c(r1, r10, r2)
            if (r9 > 0) goto L_0x015f
            com.ibm.icu.text.UnicodeSet r9 = r0.f12667e
            char r10 = r17.current()
            boolean r9 = r9.S(r10)
            if (r9 == 0) goto L_0x015f
            r9 = 3631(0xe2f, float:5.088E-42)
            if (r10 != r9) goto L_0x0148
            com.ibm.icu.text.UnicodeSet r9 = r0.f12667e
            char r11 = r17.previous()
            boolean r9 = r9.S(r11)
            if (r9 != 0) goto L_0x0145
            r17.next()
            r17.next()
            int r8 = r8 + 1
            char r10 = r17.current()
            goto L_0x0148
        L_0x0145:
            r17.next()
        L_0x0148:
            r9 = 3654(0xe46, float:5.12E-42)
            if (r10 != r9) goto L_0x0164
            char r10 = r17.previous()
            if (r10 == r9) goto L_0x015b
            r17.next()
            r17.next()
            int r8 = r8 + 1
            goto L_0x0164
        L_0x015b:
            r17.next()
            goto L_0x0164
        L_0x015f:
            int r9 = r7 + r8
            r1.setIndex(r9)
        L_0x0164:
            if (r8 <= 0) goto L_0x016e
            int r7 = r7 + r8
            r8 = r20
            r8.k(r7)
            goto L_0x0021
        L_0x016e:
            r8 = r20
            goto L_0x0021
        L_0x0172:
            r8 = r20
            int r1 = r20.i()
            if (r1 < r2) goto L_0x017f
            r20.j()
            int r6 = r6 + -1
        L_0x017f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.impl.breakiter.k.c(java.text.CharacterIterator, int, int, com.ibm.icu.impl.breakiter.e$a, boolean):int");
    }

    public boolean equals(Object obj) {
        return obj instanceof k;
    }

    public int hashCode() {
        return getClass().hashCode();
    }
}
