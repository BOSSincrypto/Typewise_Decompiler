package com.ibm.icu.lang;

import Z1.c;
import com.ibm.icu.impl.s;

public abstract class UScript {

    /* renamed from: a  reason: collision with root package name */
    private static final ScriptUsage[] f13052a = ScriptUsage.values();

    public enum ScriptUsage {
        NOT_ENCODED,
        UNKNOWN,
        EXCLUDED,
        LIMITED_USE,
        ASPIRATIONAL,
        RECOMMENDED
    }

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private static final int[] f13054a = {10485824, 10486536, 27264552, 77595953, 10488213, 44052741, 73405380, 71304162, 77595695, 71369748, 10488069, 10490528, 10490067, 4260656, 77595561, 10488469, 10488341, 44063575, 10529792, 27264464, 44052555, 10488981, 44052651, 44046208, 44043941, 77594700, 10489109, 4200486, 44044288, 4200079, 4260608, 10488597, 4200096, 10489221, 23070480, 10488725, 10488853, 27264908, 44043799, 10489664, 6296768, 39887496, 4200195, 4200227, 4200259, 4200291, 2107406, 21039104, 6297856, 4259840, 4260992, 4260944, 39852368, 4260736, 0, 4200960, 71314432, 21039616, 6334464, 39852416, 6303024, 4260768, 6298373, 6298560, 0, 4263941, 6334976, 0, 0, 0, 0, 4272467, 0, 44063575, 44063575, 4287260, 88149153, 0, 6334852, 6334730, 0, 0, 6298624, 4261447, 23070784, 0, 21039488, 23070666, 21040128, 4260715, 4237376, 21039360, 6385408, 0, 0, 0, 0, 0, 0, 6333769, 0, 4268032, 0, 2162128, 4260512, 44052555, 39852576, 4260480, 21039392, 6298714, 4237616, 6334594, 4315216, 6298499, 0, 6335424, 21039168, 21039872, 6361347, 10529792, 4264067, 21039832, 21039968, 21040015, 0, 21039936, 20973568, 39889536, 0, 0, 6334112, 6333648, 0, 21039712, 4287206, 4308000, 4261120, 4264725, 0, 0, 21096450, 21039520, 21039765, 21039254, 21039219, 4264638, 71375028, 0, 0, 4287055, 37859780, 4264323, 4264144, 4265600, 37847593, 0, 4277248, 4264456, 4265092, 4261175, 4264274, 37820183, 21039348, 4265486, 4264591, 4266688, 4265358, 90302729, 4267022, 4267122, 6362130, 73467061, 44063575, 10490130, 0, 4267280, 4266588, 4266507, 4265995, 6364529, 4267749, 71396928, 23137554, 21040962, 21040921, 21041137, 6414600, 4266446, 6415073, 21041087, 4266252, 37850213, 21040776, 4272101, 21041020, 4287164, 4317840, 71370114};

        /* access modifiers changed from: private */
        public static final int b(int i4) {
            if (i4 < 0) {
                return 0;
            }
            int[] iArr = f13054a;
            if (i4 < iArr.length) {
                return iArr[i4];
            }
            return 0;
        }
    }

    public static final int a(String str) {
        int k4 = c.k(4106, str);
        if (k4 == -1) {
            return -1;
        }
        return k4;
    }

    public static final int b(int i4) {
        boolean z3;
        boolean z4;
        if (i4 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (i4 <= 1114111) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 && z4) {
            s sVar = s.f12970k;
            int f4 = sVar.f(i4, 0) & 15728895;
            int s4 = s.s(f4);
            if (f4 < 4194304) {
                return s4;
            }
            if (f4 < 8388608) {
                return 0;
            }
            if (f4 < 12582912) {
                return 1;
            }
            return sVar.f12988j[s4];
        }
        throw new IllegalArgumentException(Integer.toString(i4));
    }

    public static final String c(int i4) {
        return c.l(4106, i4, 0);
    }

    public static final boolean d(int i4, int i5) {
        char c4;
        s sVar = s.f12970k;
        int f4 = sVar.f(i4, 0) & 15728895;
        int s4 = s.s(f4);
        if (f4 >= 4194304) {
            char[] cArr = sVar.f12988j;
            if (f4 >= 12582912) {
                s4 = cArr[s4 + 1];
            }
            int i6 = s4;
            if (i5 > 32767) {
                return false;
            }
            while (true) {
                c4 = cArr[i6];
                if (i5 <= c4) {
                    break;
                }
                i6++;
            }
            if (i5 == (32767 & c4)) {
                return true;
            }
            return false;
        } else if (i5 == s4) {
            return true;
        } else {
            return false;
        }
    }

    public static final boolean e(int i4) {
        if ((a.b(i4) & 16777216) != 0) {
            return true;
        }
        return false;
    }
}
