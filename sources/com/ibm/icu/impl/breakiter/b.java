package com.ibm.icu.impl.breakiter;

import Y1.a;
import a2.i;
import com.ibm.icu.util.BytesTrie;
import java.text.CharacterIterator;

class b extends g {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f12638a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12639b;

    public b(byte[] bArr, int i4) {
        boolean z3;
        this.f12638a = bArr;
        if ((2130706432 & i4) == 16777216) {
            z3 = true;
        } else {
            z3 = false;
        }
        a.a(z3);
        this.f12639b = i4;
    }

    private int c(int i4) {
        if (i4 == 8205) {
            return 255;
        }
        if (i4 == 8204) {
            return 254;
        }
        int i5 = i4 - (this.f12639b & 2097151);
        if (i5 < 0 || 253 < i5) {
            return -1;
        }
        return i5;
    }

    public int b(CharacterIterator characterIterator, int i4, int[] iArr, int[] iArr2, int i5, int[] iArr3) {
        int k4;
        i d4 = i.d(characterIterator);
        BytesTrie bytesTrie = new BytesTrie(this.f12638a, 0);
        int k5 = d4.k();
        if (k5 == -1) {
            return 0;
        }
        BytesTrie.Result j4 = bytesTrie.j(c(k5));
        int i6 = 1;
        int i7 = 0;
        while (true) {
            if (!j4.hasValue()) {
                if (j4 == BytesTrie.Result.NO_MATCH) {
                    break;
                }
            } else {
                if (i7 < i5) {
                    if (iArr3 != null) {
                        iArr3[i7] = bytesTrie.l();
                    }
                    iArr[i7] = i6;
                    i7++;
                }
                if (j4 == BytesTrie.Result.FINAL_VALUE) {
                    break;
                }
            }
            if (i6 >= i4 || (k4 = d4.k()) == -1) {
                break;
            }
            i6++;
            j4 = bytesTrie.p(c(k4));
        }
        iArr2[0] = i7;
        return i6;
    }
}
