package kotlinx.serialization.json.internal;

import kotlin.text.A;

/* renamed from: kotlinx.serialization.json.internal.p  reason: case insensitive filesystem */
public abstract /* synthetic */ class C0777p {
    public static /* synthetic */ String a(long j4, int i4) {
        long j5;
        int i5 = (j4 > 0 ? 1 : (j4 == 0 ? 0 : -1));
        if (i5 == 0) {
            return "0";
        }
        if (i5 > 0) {
            return Long.toString(j4, i4);
        }
        if (i4 < 2 || i4 > 36) {
            i4 = 10;
        }
        int i6 = 64;
        char[] cArr = new char[64];
        int i7 = i4 - 1;
        if ((i4 & i7) == 0) {
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i4);
            do {
                i6--;
                cArr[i6] = Character.forDigit(((int) j4) & i7, i4);
                j4 >>>= numberOfTrailingZeros;
            } while (j4 != 0);
        } else {
            if ((i4 & 1) == 0) {
                j5 = (j4 >>> 1) / ((long) (i4 >>> 1));
            } else {
                j5 = A.a(j4, (long) i4);
            }
            long j6 = (long) i4;
            cArr[63] = Character.forDigit((int) (j4 - (j5 * j6)), i4);
            i6 = 63;
            while (j5 > 0) {
                i6--;
                cArr[i6] = Character.forDigit((int) (j5 % j6), i4);
                j5 /= j6;
            }
        }
        return new String(cArr, i6, 64 - i6);
    }
}
