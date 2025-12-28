package E0;

import kotlin.collections.C0713h;
import kotlin.jvm.internal.o;

public abstract class g {
    public static final int a(int[] iArr) {
        o.e(iArr, "<this>");
        if (iArr.length != 0) {
            int i4 = iArr[0];
            int B3 = C0713h.B(iArr);
            int i5 = 1;
            if (1 <= B3) {
                while (true) {
                    i4 *= iArr[i5];
                    if (i5 == B3) {
                        break;
                    }
                    i5++;
                }
            }
            return i4;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }
}
