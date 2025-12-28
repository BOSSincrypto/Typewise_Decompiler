package com.ibm.icu.impl;

import Z1.c;
import com.ibm.icu.text.UnicodeSet;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private static final UnicodeSet[] f12611a = new UnicodeSet[41];

    public static synchronized UnicodeSet a(int i4) {
        synchronized (b.class) {
            if (4096 > i4 || i4 >= 4121) {
                UnicodeSet b4 = b(s.f12970k.n(i4));
                return b4;
            }
            UnicodeSet c4 = c(i4);
            return c4;
        }
    }

    private static UnicodeSet b(int i4) {
        UnicodeSet[] unicodeSetArr = f12611a;
        if (unicodeSetArr[i4] == null) {
            UnicodeSet unicodeSet = new UnicodeSet();
            switch (i4) {
                case 1:
                    s.f12970k.e(unicodeSet);
                    break;
                case 2:
                    s.f12970k.v(unicodeSet);
                    break;
                case 4:
                    p.f12932g.b(unicodeSet);
                    break;
                case 5:
                    o.f12924f.a(unicodeSet);
                    break;
                case 6:
                    s sVar = s.f12970k;
                    sVar.e(unicodeSet);
                    sVar.v(unicodeSet);
                    break;
                case 7:
                    i.d().f12733a.b(unicodeSet);
                    p.f12932g.b(unicodeSet);
                    break;
                case 8:
                    i.d().f12733a.b(unicodeSet);
                    break;
                case 9:
                    i.e().f12733a.b(unicodeSet);
                    break;
                case 10:
                    i.f().f12733a.b(unicodeSet);
                    break;
                case 11:
                    i.d().f12733a.a(unicodeSet);
                    break;
                case 12:
                case 13:
                case 14:
                    s.u(i4, unicodeSet);
                    break;
                case 15:
                    c.f12671d.a(unicodeSet);
                    break;
                default:
                    throw new IllegalStateException("getInclusions(unknown src " + i4 + ")");
            }
            unicodeSetArr[i4] = unicodeSet.K();
        }
        return unicodeSetArr[i4];
    }

    private static UnicodeSet c(int i4) {
        int i5 = i4 - 4080;
        UnicodeSet unicodeSet = f12611a[i5];
        if (unicodeSet != null) {
            return unicodeSet;
        }
        UnicodeSet b4 = b(s.f12970k.n(i4));
        UnicodeSet unicodeSet2 = new UnicodeSet(0, 0);
        int X3 = b4.X();
        int i6 = 0;
        for (int i7 = 0; i7 < X3; i7++) {
            int Y3 = b4.Y(i7);
            for (int Z3 = b4.Z(i7); Z3 <= Y3; Z3++) {
                int h4 = c.h(Z3, i4);
                if (h4 != i6) {
                    unicodeSet2.l(Z3);
                    i6 = h4;
                }
            }
        }
        UnicodeSet[] unicodeSetArr = f12611a;
        UnicodeSet K3 = unicodeSet2.K();
        unicodeSetArr[i5] = K3;
        return K3;
    }
}
