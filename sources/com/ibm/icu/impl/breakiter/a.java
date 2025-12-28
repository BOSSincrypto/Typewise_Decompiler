package com.ibm.icu.impl.breakiter;

import Z1.c;
import com.ibm.icu.text.UnicodeSet;

public class a extends e {

    /* renamed from: b  reason: collision with root package name */
    private g f12634b;

    /* renamed from: c  reason: collision with root package name */
    private UnicodeSet f12635c = new UnicodeSet("[[:Mymr:]&[:LineBreak=SA:]]");

    /* renamed from: d  reason: collision with root package name */
    private UnicodeSet f12636d = new UnicodeSet(4096, 4138);

    /* renamed from: e  reason: collision with root package name */
    private UnicodeSet f12637e;

    public a() {
        UnicodeSet unicodeSet = new UnicodeSet("[[:Mymr:]&[:LineBreak=SA:]&[:M:]]");
        this.f12637e = unicodeSet;
        unicodeSet.l(32);
        this.f12637e.K();
        this.f12635c.K();
        this.f12636d.K();
        this.f12637e.W();
        this.f12635c.W();
        this.f12636d.W();
        d(this.f12635c);
        this.f12634b = f.a("Mymr");
    }

    public boolean b(int i4) {
        if (c.h(i4, 4106) == 28) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x0102 A[LOOP:5: B:53:0x00f0->B:57:0x0102, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x010c A[EDGE_INSN: B:79:0x010c->B:58:0x010c ?: BREAK  
    EDGE_INSN: B:80:0x010c->B:58:0x010c ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0116  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int c(java.text.CharacterIterator r17, int r18, int r19, com.ibm.icu.impl.breakiter.e.a r20, boolean r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r19
            int r3 = r2 - r18
            r4 = 2
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
            if (r7 >= r2) goto L_0x011a
            int r8 = r6 % 3
            r9 = r4[r8]
            com.ibm.icu.impl.breakiter.g r10 = r0.f12634b
            int r9 = r9.c(r1, r10, r2)
            r10 = 1
            if (r9 != r10) goto L_0x003d
            r8 = r4[r8]
            int r8 = r8.a(r1)
        L_0x003a:
            int r6 = r6 + 1
            goto L_0x008d
        L_0x003d:
            if (r9 <= r10) goto L_0x008c
            int r9 = r17.getIndex()
            if (r9 >= r2) goto L_0x0085
            r9 = r5
        L_0x0046:
            int r11 = r6 + 1
            int r11 = r11 % r3
            r12 = r4[r11]
            com.ibm.icu.impl.breakiter.g r13 = r0.f12634b
            int r12 = r12.c(r1, r13, r2)
            if (r12 <= 0) goto L_0x007b
            r12 = r4[r8]
            r12.e()
            int r12 = r17.getIndex()
            if (r12 < r2) goto L_0x005f
            goto L_0x0085
        L_0x005f:
            int r12 = r6 + 2
            int r12 = r12 % r3
            r12 = r4[r12]
            com.ibm.icu.impl.breakiter.g r13 = r0.f12634b
            int r12 = r12.c(r1, r13, r2)
            if (r12 <= 0) goto L_0x0073
            r9 = r4[r8]
            r9.e()
            r9 = r10
            goto L_0x007b
        L_0x0073:
            r12 = r4[r11]
            boolean r12 = r12.b(r1)
            if (r12 != 0) goto L_0x005f
        L_0x007b:
            r11 = r4[r8]
            boolean r11 = r11.b(r1)
            if (r11 == 0) goto L_0x0085
            if (r9 == 0) goto L_0x0046
        L_0x0085:
            r8 = r4[r8]
            int r8 = r8.a(r1)
            goto L_0x003a
        L_0x008c:
            r8 = r5
        L_0x008d:
            int r9 = r17.getIndex()
            if (r9 >= r2) goto L_0x00f0
            if (r8 >= r3) goto L_0x00f0
            int r9 = r6 % 3
            r11 = r4[r9]
            com.ibm.icu.impl.breakiter.g r12 = r0.f12634b
            int r11 = r11.c(r1, r12, r2)
            if (r11 > 0) goto L_0x00eb
            if (r8 == 0) goto L_0x00ab
            r9 = r4[r9]
            int r9 = r9.d()
            if (r9 >= r3) goto L_0x00eb
        L_0x00ab:
            int r9 = r7 + r8
            int r11 = r2 - r9
            char r12 = r17.current()
            r13 = r5
        L_0x00b4:
            r17.next()
            char r14 = r17.current()
            int r13 = r13 + r10
            int r11 = r11 + -1
            if (r11 > 0) goto L_0x00c1
            goto L_0x00e3
        L_0x00c1:
            com.ibm.icu.text.UnicodeSet r15 = r0.f12635c
            boolean r12 = r15.S(r12)
            if (r12 == 0) goto L_0x00e9
            com.ibm.icu.text.UnicodeSet r12 = r0.f12636d
            boolean r12 = r12.S(r14)
            if (r12 == 0) goto L_0x00e9
            int r12 = r6 + 1
            int r12 = r12 % r3
            r12 = r4[r12]
            com.ibm.icu.impl.breakiter.g r15 = r0.f12634b
            int r12 = r12.c(r1, r15, r2)
            int r15 = r9 + r13
            r1.setIndex(r15)
            if (r12 <= 0) goto L_0x00e9
        L_0x00e3:
            if (r8 > 0) goto L_0x00e7
            int r6 = r6 + 1
        L_0x00e7:
            int r8 = r8 + r13
            goto L_0x00f0
        L_0x00e9:
            r12 = r14
            goto L_0x00b4
        L_0x00eb:
            int r9 = r7 + r8
            r1.setIndex(r9)
        L_0x00f0:
            int r9 = r17.getIndex()
            if (r9 >= r2) goto L_0x010c
            com.ibm.icu.text.UnicodeSet r10 = r0.f12637e
            char r11 = r17.current()
            boolean r10 = r10.S(r11)
            if (r10 == 0) goto L_0x010c
            r17.next()
            int r10 = r17.getIndex()
            int r10 = r10 - r9
            int r8 = r8 + r10
            goto L_0x00f0
        L_0x010c:
            if (r8 <= 0) goto L_0x0116
            int r7 = r7 + r8
            r8 = r20
            r8.k(r7)
            goto L_0x0021
        L_0x0116:
            r8 = r20
            goto L_0x0021
        L_0x011a:
            r8 = r20
            int r1 = r20.i()
            if (r1 < r2) goto L_0x0127
            r20.j()
            int r6 = r6 + -1
        L_0x0127:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.impl.breakiter.a.c(java.text.CharacterIterator, int, int, com.ibm.icu.impl.breakiter.e$a, boolean):int");
    }

    public boolean equals(Object obj) {
        return obj instanceof a;
    }

    public int hashCode() {
        return getClass().hashCode();
    }
}
