package Z1;

import a2.C0359a;
import com.ibm.icu.impl.IllegalIcuArgumentException;
import com.ibm.icu.impl.a;
import com.ibm.icu.impl.p;
import com.ibm.icu.impl.q;
import com.ibm.icu.impl.s;
import com.ibm.icu.impl.u;
import com.ibm.icu.util.ULocale;
import com.ibm.icu.util.h;

public abstract class c {
    public static final String a(String str, int i4) {
        return a.g(i4, str);
    }

    public static String b(String str, boolean z3) {
        return a(str, z3 ^ true ? 1 : 0);
    }

    public static h c(int i4) {
        if (i4 >= 0 && i4 <= 1114111) {
            return s.f12970k.g(i4);
        }
        throw new IllegalArgumentException("Codepoint out of bounds");
    }

    private static int d(ULocale uLocale) {
        if (uLocale == null) {
            uLocale = ULocale.getDefault();
        }
        return p.d(uLocale);
    }

    public static int e(String str) {
        return q.f12941n.a(2, str);
    }

    public static int f(int i4) {
        return s.f12970k.h(i4);
    }

    public static int g(int i4) {
        return 0;
    }

    public static int h(int i4, int i5) {
        return s.f12970k.i(i4, i5);
    }

    public static int i(CharSequence charSequence) {
        int g4 = u.f13043e.g(charSequence);
        if (g4 != -1) {
            return g4;
        }
        throw new IllegalIcuArgumentException("Invalid name: " + charSequence);
    }

    public static int j(int i4, CharSequence charSequence) {
        int i5 = u.f13043e.i(i4, charSequence);
        if (i5 != -1) {
            return i5;
        }
        throw new IllegalIcuArgumentException("Invalid name: " + charSequence);
    }

    public static int k(int i4, CharSequence charSequence) {
        return u.f13043e.j(i4, charSequence);
    }

    public static String l(int i4, int i5, int i6) {
        if ((i4 != 4098 && i4 != 4112 && i4 != 4113) || i5 < g(4098) || i5 > f(4098) || i6 < 0 || i6 >= 2) {
            return u.f13043e.k(i4, i5, i6);
        }
        try {
            return u.f13043e.k(i4, i5, i6);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static int m(int i4) {
        return s.f12970k.o(i4);
    }

    public static double n(int i4) {
        return s.f12970k.p(i4);
    }

    public static boolean o(int i4, int i5) {
        return s.f12970k.q(i4, i5);
    }

    public static boolean p(int i4) {
        if (m(i4) == 9) {
            return true;
        }
        return false;
    }

    public static boolean q(int i4) {
        return o(i4, 0);
    }

    public static final int r(int i4, int i5) {
        return ((i4 << 10) + i5) - 56613888;
    }

    public static String s(ULocale uLocale, String str) {
        return a.n(d(uLocale), 0, str);
    }

    public static String t(ULocale uLocale, String str, C0359a aVar) {
        return u(uLocale, str, aVar, 0);
    }

    public static String u(ULocale uLocale, String str, C0359a aVar, int i4) {
        if (aVar == null && uLocale == null) {
            uLocale = ULocale.getDefault();
        }
        C0359a h4 = a.h(uLocale, i4, aVar);
        h4.t(str);
        return a.p(d(uLocale), i4, h4, str);
    }

    public static String v(ULocale uLocale, String str) {
        return a.r(d(uLocale), 0, str);
    }
}
