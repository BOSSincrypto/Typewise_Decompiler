package Z1;

import com.ibm.icu.impl.c;
import com.ibm.icu.text.UnicodeSet;
import com.ibm.icu.util.CodePointMap;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private static final UnicodeSet[] f2187a = new UnicodeSet[72];

    /* renamed from: b  reason: collision with root package name */
    private static final CodePointMap[] f2188b = new CodePointMap[25];

    public static final UnicodeSet a(int i4) {
        UnicodeSet unicodeSet;
        if (i4 < 0 || 72 <= i4) {
            throw new IllegalArgumentException("" + i4 + " is not a constant for a UProperty binary property");
        }
        UnicodeSet[] unicodeSetArr = f2187a;
        synchronized (unicodeSetArr) {
            try {
                unicodeSet = unicodeSetArr[i4];
                if (unicodeSet == null) {
                    unicodeSet = b(i4);
                    unicodeSetArr[i4] = unicodeSet;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return unicodeSet;
    }

    private static UnicodeSet b(int i4) {
        UnicodeSet unicodeSet = new UnicodeSet();
        if (65 <= i4 && i4 <= 71) {
            c.f12671d.b(i4, unicodeSet);
            if (!(i4 == 65 || i4 == 71)) {
                return unicodeSet.W();
            }
        }
        UnicodeSet a4 = com.ibm.icu.impl.b.a(i4);
        int X3 = a4.X();
        int i5 = -1;
        for (int i6 = 0; i6 < X3; i6++) {
            int Y3 = a4.Y(i6);
            for (int Z3 = a4.Z(i6); Z3 <= Y3; Z3++) {
                if (c.o(Z3, i4)) {
                    if (i5 < 0) {
                        i5 = Z3;
                    }
                } else if (i5 >= 0) {
                    unicodeSet.n(i5, Z3 - 1);
                    i5 = -1;
                }
            }
        }
        if (i5 >= 0) {
            unicodeSet.n(i5, 1114111);
        }
        return unicodeSet.W();
    }
}
