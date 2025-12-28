package com.ibm.icu.impl.breakiter;

import Y1.a;
import com.ibm.icu.impl.ICUResourceBundle;
import com.ibm.icu.impl.d;
import com.ibm.icu.util.UResourceBundle;
import java.nio.ByteBuffer;

abstract class f {
    public static g a(String str) {
        boolean z3;
        ByteBuffer o4 = d.o("brkitr/" + ((ICUResourceBundle) UResourceBundle.e("com/ibm/icu/impl/data/icudt71b/brkitr")).p0("dictionaries/" + str));
        d.s(o4, 1147757428, (d.b) null);
        int[] iArr = new int[8];
        boolean z4 = false;
        for (int i4 = 0; i4 < 8; i4++) {
            iArr[i4] = o4.getInt();
        }
        int i5 = iArr[0];
        if (i5 >= 32) {
            z3 = true;
        } else {
            z3 = false;
        }
        a.a(z3);
        if (i5 > 32) {
            d.u(o4, i5 - 32);
        }
        int i6 = iArr[4] & 7;
        int i7 = iArr[3] - i5;
        if (i6 == 0) {
            int i8 = iArr[5];
            byte[] bArr = new byte[i7];
            o4.get(bArr);
            return new b(bArr, i8);
        } else if (i6 != 1) {
            return null;
        } else {
            if (i7 % 2 == 0) {
                z4 = true;
            }
            a.a(z4);
            return new c(d.p(o4, i7 / 2, i7 & 1));
        }
    }
}
