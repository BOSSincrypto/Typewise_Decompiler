package kotlin.uuid;

import kotlin.text.g;

abstract class b extends a {
    /* access modifiers changed from: private */
    public static final void d(String str, int i4) {
        if (str.charAt(i4) != '-') {
            throw new IllegalArgumentException(("Expected '-' (hyphen) at index 8, but was " + str.charAt(i4)).toString());
        }
    }

    /* access modifiers changed from: private */
    public static final void e(long j4, byte[] bArr, int i4, int i5) {
        int i6 = i4 + (i5 * 2);
        for (int i7 = 0; i7 < i5; i7++) {
            int i8 = g.d()[(int) (255 & j4)];
            bArr[i6 - 1] = (byte) i8;
            i6 -= 2;
            bArr[i6] = (byte) (i8 >> 8);
            j4 >>= 8;
        }
    }

    /* access modifiers changed from: private */
    public static final void f(long j4, byte[] bArr, int i4) {
        for (int i5 = 0; i5 < 8; i5++) {
            bArr[i4 + i5] = (byte) ((int) (j4 >>> ((7 - i5) * 8)));
        }
    }
}
