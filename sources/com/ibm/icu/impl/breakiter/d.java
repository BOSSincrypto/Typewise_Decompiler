package com.ibm.icu.impl.breakiter;

import com.ibm.icu.text.UnicodeSet;
import com.ibm.icu.util.UResourceBundle;
import com.ibm.icu.util.g;
import java.text.CharacterIterator;
import java.util.HashSet;

public class d extends e {

    /* renamed from: b  reason: collision with root package name */
    private UnicodeSet f12641b;

    /* renamed from: c  reason: collision with root package name */
    private UnicodeSet f12642c;

    /* renamed from: d  reason: collision with root package name */
    private UnicodeSet f12643d;

    /* renamed from: e  reason: collision with root package name */
    private g f12644e = null;

    /* renamed from: f  reason: collision with root package name */
    private HashSet f12645f;

    public d(boolean z3) {
        UnicodeSet unicodeSet = new UnicodeSet("[\\uac00-\\ud7a3]");
        this.f12641b = unicodeSet;
        unicodeSet.W();
        UnicodeSet unicodeSet2 = new UnicodeSet("[[:Nd:][:Pi:][:Ps:][:Alphabetic:]]");
        this.f12642c = unicodeSet2;
        unicodeSet2.W();
        UnicodeSet unicodeSet3 = new UnicodeSet("[[:Pc:][:Pd:][:Pe:][:Pf:][:Po:]]");
        this.f12643d = unicodeSet3;
        unicodeSet3.W();
        this.f12645f = new HashSet();
        this.f12644e = f.a("Hira");
        if (z3) {
            d(this.f12641b);
            return;
        }
        d(new UnicodeSet("[[:Han:][:Hiragana:][:Katakana:]\\u30fc\\uff70\\uff9e\\uff9f]"));
        g();
    }

    private static int e(int i4) {
        int[] iArr = {8192, 984, 408, 240, 204, 252, 300, 372, 480};
        if (i4 > 8) {
            return 8192;
        }
        return iArr[i4];
    }

    private String f(CharacterIterator characterIterator, StringBuffer stringBuffer, int i4, int i5) {
        stringBuffer.setLength(0);
        if (i5 > 0) {
            characterIterator.setIndex(i4);
            stringBuffer.append(characterIterator.current());
            for (int i6 = 1; i6 < i5; i6++) {
                stringBuffer.append(characterIterator.next());
            }
        }
        return stringBuffer.toString();
    }

    private void g() {
        j();
        i();
    }

    private static boolean h(int i4) {
        return (i4 >= 12449 && i4 <= 12542 && i4 != 12539) || (i4 >= 65382 && i4 <= 65439);
    }

    private void i() {
        UnicodeSet unicodeSet = new UnicodeSet("[:Hiragana:]");
        unicodeSet.W();
        com.ibm.icu.text.d dVar = new com.ibm.icu.text.d(unicodeSet);
        while (dVar.c()) {
            this.f12645f.add(dVar.a());
        }
    }

    private void j() {
        g k4 = UResourceBundle.f("com/ibm/icu/impl/data/icudt71b/brkitr", "ja").c("extensions").k();
        while (k4.a()) {
            this.f12645f.add(k4.c());
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0277: MOVE  (r2v1 int) = (r28v0 int)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public int c(java.text.CharacterIterator r26, int r27, int r28, com.ibm.icu.impl.breakiter.e.a r29, boolean r30) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            r3 = r28
            r4 = 0
            if (r2 < r3) goto L_0x000c
            return r4
        L_0x000c:
            r26.setIndex(r27)
            int r5 = r3 - r2
            r6 = 1
            int r5 = r5 + r6
            int[] r5 = new int[r5]
            java.lang.StringBuffer r7 = new java.lang.StringBuffer
            java.lang.String r8 = ""
            r7.<init>(r8)
            r26.setIndex(r27)
        L_0x001f:
            int r8 = r26.getIndex()
            if (r8 >= r3) goto L_0x0030
            char r8 = r26.current()
            r7.append(r8)
            r26.next()
            goto L_0x001f
        L_0x0030:
            java.lang.String r8 = r7.toString()
            com.ibm.icu.text.b$e r9 = com.ibm.icu.text.b.f13098n
            com.ibm.icu.text.b$t r10 = com.ibm.icu.text.b.n(r8, r9)
            com.ibm.icu.text.b$t r11 = com.ibm.icu.text.b.f13106z
            if (r10 == r11) goto L_0x0047
            boolean r10 = com.ibm.icu.text.b.g(r8, r9, r4)
            if (r10 == 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r10 = r4
            goto L_0x0048
        L_0x0047:
            r10 = r6
        L_0x0048:
            if (r10 == 0) goto L_0x006a
            java.text.StringCharacterIterator r9 = new java.text.StringCharacterIterator
            r9.<init>(r8)
            r5[r4] = r4
            r10 = r4
            r11 = r10
        L_0x0053:
            int r12 = r8.length()
            if (r10 >= r12) goto L_0x0067
            int r12 = r8.codePointAt(r10)
            int r12 = java.lang.Character.charCount(r12)
            int r10 = r10 + r12
            int r11 = r11 + 1
            r5[r11] = r10
            goto L_0x0053
        L_0x0067:
            r15 = r9
            r14 = r11
            goto L_0x0097
        L_0x006a:
            java.lang.String r5 = com.ibm.icu.text.b.k(r8, r9)
            java.text.StringCharacterIterator r10 = new java.text.StringCharacterIterator
            r10.<init>(r5)
            int r5 = r5.length()
            int r5 = r5 + r6
            int[] r5 = new int[r5]
            com.ibm.icu.text.b r11 = new com.ibm.icu.text.b
            r11.<init>(r8, r9, r4)
            r5[r4] = r4
            r9 = r4
            r12 = r9
        L_0x0083:
            int r13 = r11.c()
            if (r12 >= r13) goto L_0x0095
            r11.i()
            int r9 = r9 + 1
            int r12 = r11.d()
            r5[r9] = r12
            goto L_0x0083
        L_0x0095:
            r14 = r9
            r15 = r10
        L_0x0097:
            int r13 = r14 + 1
            int[] r12 = new int[r13]
            r12[r4] = r4
            r9 = r6
        L_0x009e:
            r11 = 2147483647(0x7fffffff, float:NaN)
            if (r9 > r14) goto L_0x00a8
            r12[r9] = r11
            int r9 = r9 + 1
            goto L_0x009e
        L_0x00a8:
            int[] r10 = new int[r13]
            r9 = r4
        L_0x00ab:
            r16 = -1
            if (r9 > r14) goto L_0x00b4
            r10[r9] = r16
            int r9 = r9 + 1
            goto L_0x00ab
        L_0x00b4:
            int[] r9 = new int[r14]
            int[] r6 = new int[r14]
            r15.setIndex(r4)
            r17 = r4
        L_0x00bd:
            if (r4 >= r14) goto L_0x01a6
            int r3 = r15.getIndex()
            r18 = r9
            r9 = r12[r4]
            if (r9 != r11) goto L_0x00d5
            r21 = r5
            r20 = r10
            r22 = r12
            r23 = r13
            r11 = r14
            r5 = r15
            goto L_0x0189
        L_0x00d5:
            int r9 = r4 + 20
            if (r9 >= r14) goto L_0x00dd
            r9 = 1
            r19 = 20
            goto L_0x00e2
        L_0x00dd:
            int r9 = r14 - r4
            r19 = r9
            r9 = 1
        L_0x00e2:
            int[] r1 = new int[r9]
            com.ibm.icu.impl.breakiter.g r9 = r0.f12644e
            r20 = r10
            r10 = r15
            r21 = r5
            r5 = r11
            r11 = r19
            r22 = r12
            r12 = r6
            r23 = r13
            r13 = r1
            r24 = r14
            r14 = r19
            r5 = r15
            r15 = r18
            r9.b(r10, r11, r12, r13, r14, r15)
            r9 = 0
            r1 = r1[r9]
            r5.setIndex(r3)
            if (r1 == 0) goto L_0x010b
            r10 = r6[r9]
            r9 = 1
            if (r10 == r9) goto L_0x0129
        L_0x010b:
            int r9 = Y1.d.a(r5)
            r10 = 2147483647(0x7fffffff, float:NaN)
            if (r9 == r10) goto L_0x0129
            com.ibm.icu.text.UnicodeSet r9 = r0.f12641b
            int r10 = Y1.d.a(r5)
            boolean r9 = r9.S(r10)
            if (r9 != 0) goto L_0x0129
            r9 = 255(0xff, float:3.57E-43)
            r18[r1] = r9
            r9 = 1
            r6[r1] = r9
            int r1 = r1 + 1
        L_0x0129:
            r9 = 0
        L_0x012a:
            if (r9 >= r1) goto L_0x0144
            r10 = r22[r4]
            r11 = r18[r9]
            int r10 = r10 + r11
            r11 = r6[r9]
            int r12 = r11 + r4
            r12 = r22[r12]
            if (r10 >= r12) goto L_0x0141
            int r11 = r11 + r4
            r22[r11] = r10
            r10 = r6[r9]
            int r10 = r10 + r4
            r20[r10] = r4
        L_0x0141:
            int r9 = r9 + 1
            goto L_0x012a
        L_0x0144:
            int r1 = Y1.d.a(r5)
            boolean r1 = h(r1)
            if (r17 != 0) goto L_0x0185
            if (r1 == 0) goto L_0x0185
            int r9 = r4 + 1
            Y1.d.b(r5)
            r11 = r24
        L_0x0157:
            if (r9 >= r11) goto L_0x016f
            int r10 = r9 - r4
            r12 = 20
            if (r10 >= r12) goto L_0x016f
            int r10 = Y1.d.a(r5)
            boolean r10 = h(r10)
            if (r10 == 0) goto L_0x016f
            Y1.d.b(r5)
            int r9 = r9 + 1
            goto L_0x0157
        L_0x016f:
            int r10 = r9 - r4
            r12 = 20
            if (r10 >= r12) goto L_0x0187
            r12 = r22[r4]
            int r10 = e(r10)
            int r12 = r12 + r10
            r10 = r22[r9]
            if (r12 >= r10) goto L_0x0187
            r22[r9] = r12
            r20[r9] = r4
            goto L_0x0187
        L_0x0185:
            r11 = r24
        L_0x0187:
            r17 = r1
        L_0x0189:
            int r4 = r4 + 1
            r5.setIndex(r3)
            Y1.d.b(r5)
            r1 = r26
            r3 = r28
            r15 = r5
            r14 = r11
            r9 = r18
            r10 = r20
            r5 = r21
            r12 = r22
            r13 = r23
            r11 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x00bd
        L_0x01a6:
            r21 = r5
            r20 = r10
            r22 = r12
            r11 = r14
            r5 = r15
            r14 = r13
            int[] r1 = new int[r14]
            r3 = r22[r11]
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r3 != r4) goto L_0x01bd
            r3 = 0
            r1[r3] = r11
            r9 = 1
            goto L_0x0217
        L_0x01bd:
            r3 = 0
            if (r30 == 0) goto L_0x01fe
            r1[r3] = r11
            r4 = r20[r11]
            r14 = r4
            r9 = 1
        L_0x01c6:
            if (r14 <= 0) goto L_0x0217
            int r4 = r8.offsetByCodePoints(r3, r14)
            int r6 = r8.offsetByCodePoints(r3, r11)
            int r6 = r6 - r4
            java.lang.String r3 = r0.f(r5, r7, r4, r6)
            r5.setIndex(r4)
            java.util.HashSet r4 = r0.f12645f
            boolean r3 = r4.contains(r3)
            if (r3 != 0) goto L_0x01f8
            int r3 = Y1.d.a(r5)
            boolean r3 = h(r3)
            if (r3 == 0) goto L_0x01f4
            int r3 = Y1.d.d(r5)
            boolean r3 = h(r3)
            if (r3 != 0) goto L_0x01f8
        L_0x01f4:
            r1[r9] = r14
            int r9 = r9 + 1
        L_0x01f8:
            r3 = r20[r14]
            r11 = r14
            r14 = r3
            r3 = 0
            goto L_0x01c6
        L_0x01fe:
            r14 = r11
            r9 = 0
        L_0x0200:
            if (r14 <= 0) goto L_0x0209
            r1[r9] = r14
            int r9 = r9 + 1
            r14 = r20[r14]
            goto L_0x0200
        L_0x0209:
            int r3 = r9 + -1
            r3 = r1[r3]
            r3 = r20[r3]
            if (r3 != 0) goto L_0x0213
            r3 = 1
            goto L_0x0214
        L_0x0213:
            r3 = 0
        L_0x0214:
            Y1.a.a(r3)
        L_0x0217:
            int r3 = r29.n()
            if (r3 == 0) goto L_0x0227
            int r3 = r29.i()
            if (r3 >= r2) goto L_0x0224
            goto L_0x0227
        L_0x0224:
            r3 = 1
            r4 = 0
            goto L_0x022e
        L_0x0227:
            int r3 = r9 + 1
            r4 = 0
            r1[r9] = r4
            r9 = r3
            r3 = 1
        L_0x022e:
            int r9 = r9 - r3
            r3 = r16
        L_0x0231:
            if (r9 < 0) goto L_0x0269
            r5 = r1[r9]
            r5 = r21[r5]
            int r5 = r5 + r2
            if (r5 <= r3) goto L_0x0254
            if (r5 != r2) goto L_0x0257
            if (r30 == 0) goto L_0x0254
            if (r5 <= 0) goto L_0x0254
            com.ibm.icu.text.UnicodeSet r3 = r0.f12643d
            int r6 = r5 + -1
            r7 = r26
            char r6 = r7.setIndex(r6)
            boolean r3 = r3.S(r6)
            if (r3 == 0) goto L_0x0251
            goto L_0x0259
        L_0x0251:
            r6 = r29
            goto L_0x0265
        L_0x0254:
            r7 = r26
            goto L_0x0251
        L_0x0257:
            r7 = r26
        L_0x0259:
            r3 = r1[r9]
            r3 = r21[r3]
            int r3 = r3 + r2
            r6 = r29
            r6.k(r3)
            int r4 = r4 + 1
        L_0x0265:
            int r9 = r9 + -1
            r3 = r5
            goto L_0x0231
        L_0x0269:
            r7 = r26
            r6 = r29
            boolean r1 = r29.d()
            if (r1 != 0) goto L_0x0293
            int r1 = r29.i()
            r2 = r28
            if (r1 != r2) goto L_0x0293
            if (r30 == 0) goto L_0x028f
            com.ibm.icu.text.UnicodeSet r1 = r0.f12642c
            char r2 = r7.setIndex(r2)
            boolean r1 = r1.S(r2)
            if (r1 != 0) goto L_0x0293
            r29.j()
        L_0x028c:
            int r4 = r4 + -1
            goto L_0x0293
        L_0x028f:
            r29.j()
            goto L_0x028c
        L_0x0293:
            boolean r1 = r29.d()
            if (r1 != 0) goto L_0x02a0
            int r1 = r29.i()
            r7.setIndex(r1)
        L_0x02a0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.impl.breakiter.d.c(java.text.CharacterIterator, int, int, com.ibm.icu.impl.breakiter.e$a, boolean):int");
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f12646a.equals(((d) obj).f12646a);
        }
        return false;
    }

    public int hashCode() {
        return getClass().hashCode();
    }
}
