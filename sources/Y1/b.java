package Y1;

import com.ibm.icu.text.UnicodeSet;
import com.ibm.icu.util.f;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private boolean[] f1993a = new boolean[256];

    /* renamed from: b  reason: collision with root package name */
    private int[] f1994b = new int[64];

    /* renamed from: c  reason: collision with root package name */
    private int[] f1995c = new int[64];

    /* renamed from: d  reason: collision with root package name */
    private int[] f1996d;

    /* renamed from: e  reason: collision with root package name */
    private final int[] f1997e;

    /* renamed from: f  reason: collision with root package name */
    private final int f1998f;

    public b(int[] iArr, int i4) {
        this.f1997e = iArr;
        this.f1998f = i4;
        int[] iArr2 = new int[18];
        this.f1996d = iArr2;
        iArr2[0] = c(2048, 0, i4 - 1);
        for (int i5 = 1; i5 <= 16; i5++) {
            int[] iArr3 = this.f1996d;
            iArr3[i5] = c(i5 << 12, iArr3[i5 - 1], this.f1998f - 1);
        }
        this.f1996d[17] = this.f1998f - 1;
        d();
    }

    private final boolean b(int i4, int i5, int i6) {
        if ((c(i4, i5, i6) & 1) != 0) {
            return true;
        }
        return false;
    }

    private int c(int i4, int i5, int i6) {
        int[] iArr = this.f1997e;
        if (i4 < iArr[i5]) {
            return i5;
        }
        if (i5 >= i6 || i4 >= iArr[i6 - 1]) {
            return i6;
        }
        while (true) {
            int i7 = (i5 + i6) >>> 1;
            if (i7 == i5) {
                return i6;
            }
            if (i4 < this.f1997e[i7]) {
                i6 = i7;
            } else {
                i5 = i7;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x0029 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void d() {
        /*
            r11 = this;
            r0 = 0
        L_0x0001:
            int[] r1 = r11.f1997e
            int r2 = r0 + 1
            r3 = r1[r0]
            int r4 = r11.f1998f
            r5 = 1114112(0x110000, float:1.561203E-39)
            if (r2 >= r4) goto L_0x0012
            int r0 = r0 + 2
            r1 = r1[r2]
            goto L_0x0014
        L_0x0012:
            r0 = r2
            r1 = r5
        L_0x0014:
            r2 = 256(0x100, float:3.59E-43)
            r4 = 1
            if (r3 < r2) goto L_0x001a
            goto L_0x002a
        L_0x001a:
            boolean[] r6 = r11.f1993a
            int r7 = r3 + 1
            r6[r3] = r4
            if (r7 >= r1) goto L_0x0027
            if (r7 < r2) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r3 = r7
            goto L_0x001a
        L_0x0027:
            if (r1 <= r2) goto L_0x0001
            r3 = r7
        L_0x002a:
            r2 = 2048(0x800, float:2.87E-42)
            if (r3 >= r2) goto L_0x004e
            int[] r6 = r11.f1994b
            if (r1 > r2) goto L_0x0034
            r7 = r1
            goto L_0x0035
        L_0x0034:
            r7 = r2
        L_0x0035:
            e(r6, r3, r7)
            if (r1 <= r2) goto L_0x003c
            r3 = r2
            goto L_0x004e
        L_0x003c:
            int[] r1 = r11.f1997e
            int r2 = r0 + 1
            r3 = r1[r0]
            int r6 = r11.f1998f
            if (r2 >= r6) goto L_0x004b
            int r0 = r0 + 2
            r1 = r1[r2]
            goto L_0x002a
        L_0x004b:
            r0 = r2
            r1 = r5
            goto L_0x002a
        L_0x004e:
            r6 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r6) goto L_0x00b0
            if (r1 <= r6) goto L_0x0055
            r1 = r6
        L_0x0055:
            if (r3 >= r2) goto L_0x0058
            r3 = r2
        L_0x0058:
            if (r3 >= r1) goto L_0x009a
            r7 = r3 & 63
            r8 = 65537(0x10001, float:9.1837E-41)
            if (r7 == 0) goto L_0x0074
            int r2 = r3 >> 6
            int[] r7 = r11.f1995c
            r9 = r2 & 63
            r10 = r7[r9]
            int r3 = r3 >> 12
            int r3 = r8 << r3
            r3 = r3 | r10
            r7[r9] = r3
            int r2 = r2 + r4
            int r2 = r2 << 6
            r3 = r2
        L_0x0074:
            if (r3 >= r1) goto L_0x009a
            r7 = r1 & -64
            if (r3 >= r7) goto L_0x0083
            int[] r7 = r11.f1995c
            int r3 = r3 >> 6
            int r9 = r1 >> 6
            e(r7, r3, r9)
        L_0x0083:
            r3 = r1 & 63
            if (r3 == 0) goto L_0x009a
            int r2 = r1 >> 6
            int[] r3 = r11.f1995c
            r7 = r2 & 63
            r9 = r3[r7]
            int r1 = r1 >> 12
            int r1 = r8 << r1
            r1 = r1 | r9
            r3[r7] = r1
            int r2 = r2 + r4
            int r1 = r2 << 6
            r2 = r1
        L_0x009a:
            if (r1 != r6) goto L_0x009d
            goto L_0x00b0
        L_0x009d:
            int[] r1 = r11.f1997e
            int r3 = r0 + 1
            r6 = r1[r0]
            int r7 = r11.f1998f
            if (r3 >= r7) goto L_0x00ad
            int r0 = r0 + 2
            r1 = r1[r3]
        L_0x00ab:
            r3 = r6
            goto L_0x004e
        L_0x00ad:
            r0 = r3
            r1 = r5
            goto L_0x00ab
        L_0x00b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y1.b.d():void");
    }

    private static void e(int[] iArr, int i4, int i5) {
        int i6 = i4 >> 6;
        int i7 = i4 & 63;
        int i8 = 1 << i6;
        if (i4 + 1 == i5) {
            iArr[i7] = iArr[i7] | i8;
            return;
        }
        int i9 = i5 >> 6;
        int i10 = i5 & 63;
        if (i6 == i9) {
            while (i7 < i10) {
                iArr[i7] = iArr[i7] | i8;
                i7++;
            }
            return;
        }
        if (i7 > 0) {
            while (true) {
                int i11 = i7 + 1;
                iArr[i7] = iArr[i7] | i8;
                if (i11 >= 64) {
                    break;
                }
                i7 = i11;
            }
            i6++;
        }
        if (i6 < i9) {
            int i12 = ~((1 << i6) - 1);
            if (i9 < 32) {
                i12 &= (1 << i9) - 1;
            }
            for (int i13 = 0; i13 < 64; i13++) {
                iArr[i13] = iArr[i13] | i12;
            }
        }
        int i14 = 1 << i9;
        for (int i15 = 0; i15 < i10; i15++) {
            iArr[i15] = iArr[i15] | i14;
        }
    }

    public boolean a(int i4) {
        if (i4 <= 255) {
            return this.f1993a[i4];
        }
        if (i4 <= 2047) {
            if (((1 << (i4 >> 6)) & this.f1994b[i4 & 63]) != 0) {
                return true;
            }
            return false;
        } else if (i4 < 55296 || (i4 >= 57344 && i4 <= 65535)) {
            int i5 = i4 >> 12;
            int i6 = (this.f1995c[(i4 >> 6) & 63] >> i5) & 65537;
            if (i6 > 1) {
                int[] iArr = this.f1996d;
                return b(i4, iArr[i5], iArr[i5 + 1]);
            } else if (i6 != 0) {
                return true;
            } else {
                return false;
            }
        } else if (i4 > 1114111) {
            return false;
        } else {
            int[] iArr2 = this.f1996d;
            return b(i4, iArr2[13], iArr2[17]);
        }
    }

    public final int f(CharSequence charSequence, int i4, UnicodeSet.SpanCondition spanCondition, f fVar) {
        int i5;
        int i6;
        char charAt;
        int i7;
        char charAt2;
        CharSequence charSequence2 = charSequence;
        int length = charSequence.length();
        char c4 = 57344;
        char c5 = 55296;
        if (UnicodeSet.SpanCondition.NOT_CONTAINED != spanCondition) {
            i5 = i4;
            while (i5 < length) {
                char charAt3 = charSequence2.charAt(i5);
                if (charAt3 <= 255) {
                    if (!this.f1993a[charAt3]) {
                        break;
                    }
                } else if (charAt3 <= 2047) {
                    if (((1 << (charAt3 >> 6)) & this.f1994b[charAt3 & '?']) == 0) {
                        break;
                    }
                } else if (charAt3 < 55296 || charAt3 >= 56320 || (i7 = i5 + 1) == length || (charAt2 = charSequence2.charAt(i7)) < 56320 || charAt2 >= c4) {
                    int i8 = charAt3 >> 12;
                    int i9 = (this.f1995c[(charAt3 >> 6) & 63] >> i8) & 65537;
                    if (i9 > 1) {
                        int[] iArr = this.f1996d;
                        if (!b(charAt3, iArr[i8], iArr[i8 + 1])) {
                            break;
                        }
                    } else if (i9 == 0) {
                        break;
                    }
                } else {
                    int codePoint = Character.toCodePoint(charAt3, charAt2);
                    int[] iArr2 = this.f1996d;
                    if (!b(codePoint, iArr2[16], iArr2[17])) {
                        break;
                    }
                    i5 = i7;
                }
                i5++;
                c4 = 57344;
            }
        } else {
            int i10 = i4;
            while (i5 < length) {
                char charAt4 = charSequence2.charAt(i5);
                if (charAt4 <= 255) {
                    if (this.f1993a[charAt4]) {
                        break;
                    }
                } else if (charAt4 <= 2047) {
                    if (((1 << (charAt4 >> 6)) & this.f1994b[charAt4 & '?']) != 0) {
                        break;
                    }
                } else {
                    if (charAt4 >= c5 && charAt4 < 56320 && (i6 = i5 + 1) != length && (charAt = charSequence2.charAt(i6)) >= 56320) {
                        if (charAt < 57344) {
                            int codePoint2 = Character.toCodePoint(charAt4, charAt);
                            int[] iArr3 = this.f1996d;
                            if (b(codePoint2, iArr3[16], iArr3[17])) {
                                break;
                            }
                            i5 = i6;
                            i10 = i5 + 1;
                            c5 = 55296;
                        }
                    }
                    int i11 = charAt4 >> 12;
                    int i12 = (this.f1995c[(charAt4 >> 6) & 63] >> i11) & 65537;
                    if (i12 > 1) {
                        int[] iArr4 = this.f1996d;
                        if (b(charAt4, iArr4[i11], iArr4[i11 + 1])) {
                            break;
                        }
                        i10 = i5 + 1;
                        c5 = 55296;
                    } else if (i12 != 0) {
                        break;
                    } else {
                        i10 = i5 + 1;
                        c5 = 55296;
                    }
                }
                i10 = i5 + 1;
                c5 = 55296;
            }
        }
        return i5;
    }

    public final int g(CharSequence charSequence, int i4, UnicodeSet.SpanCondition spanCondition) {
        int i5;
        char charAt;
        char charAt2;
        if (UnicodeSet.SpanCondition.NOT_CONTAINED != spanCondition) {
            do {
                i5 = i4 - 1;
                char charAt3 = charSequence.charAt(i5);
                if (charAt3 <= 255) {
                    if (!this.f1993a[charAt3]) {
                    }
                } else if (charAt3 <= 2047) {
                    if ((this.f1994b[charAt3 & '?'] & (1 << (charAt3 >> 6))) == 0) {
                    }
                } else if (charAt3 < 55296 || charAt3 < 56320 || i5 == 0 || (charAt2 = charSequence.charAt(i4 - 2)) < 55296 || charAt2 >= 56320) {
                    int i6 = charAt3 >> 12;
                    int i7 = (this.f1995c[(charAt3 >> 6) & 63] >> i6) & 65537;
                    if (i7 > 1) {
                        int[] iArr = this.f1996d;
                        if (!b(charAt3, iArr[i6], iArr[i6 + 1])) {
                        }
                    } else if (i7 == 0) {
                    }
                } else {
                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                    int[] iArr2 = this.f1996d;
                    if (b(codePoint, iArr2[16], iArr2[17])) {
                        i4 -= 2;
                        continue;
                    }
                }
                i4 = i5;
                continue;
            } while (i4 != 0);
            return 0;
        }
        do {
            i5 = i4 - 1;
            char charAt4 = charSequence.charAt(i5);
            if (charAt4 <= 255) {
                if (this.f1993a[charAt4]) {
                }
            } else if (charAt4 <= 2047) {
                if ((this.f1994b[charAt4 & '?'] & (1 << (charAt4 >> 6))) != 0) {
                }
            } else if (charAt4 < 55296 || charAt4 < 56320 || i5 == 0 || (charAt = charSequence.charAt(i4 - 2)) < 55296 || charAt >= 56320) {
                int i8 = charAt4 >> 12;
                int i9 = (this.f1995c[(charAt4 >> 6) & 63] >> i8) & 65537;
                if (i9 > 1) {
                    int[] iArr3 = this.f1996d;
                    if (b(charAt4, iArr3[i8], iArr3[i8 + 1])) {
                    }
                } else if (i9 != 0) {
                }
            } else {
                int codePoint2 = Character.toCodePoint(charAt, charAt4);
                int[] iArr4 = this.f1996d;
                if (!b(codePoint2, iArr4[16], iArr4[17])) {
                    r14 = i4 - 2;
                    continue;
                }
            }
            r14 = i5;
            continue;
        } while (i4 != 0);
        return 0;
        return i5 + 1;
    }
}
