package c3;

import c3.C0500b;
import d3.b;
import kotlin.jvm.internal.o;
import okio.ByteString;

public abstract class B {

    /* renamed from: a  reason: collision with root package name */
    private static final C0500b.a f7635a = new C0500b.a();

    /* renamed from: b  reason: collision with root package name */
    private static final int f7636b = -1234567890;

    public static final boolean a(byte[] bArr, int i4, byte[] bArr2, int i5, int i6) {
        o.e(bArr, "a");
        o.e(bArr2, "b");
        for (int i7 = 0; i7 < i6; i7++) {
            if (bArr[i7 + i4] != bArr2[i7 + i5]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j4, long j5, long j6) {
        if ((j5 | j6) < 0 || j5 > j4 || j4 - j5 < j6) {
            throw new ArrayIndexOutOfBoundsException("size=" + j4 + " offset=" + j5 + " byteCount=" + j6);
        }
    }

    public static final int c() {
        return f7636b;
    }

    public static final int d(ByteString byteString, int i4) {
        o.e(byteString, "<this>");
        if (i4 == f7636b) {
            return byteString.size();
        }
        return i4;
    }

    public static final int e(byte[] bArr, int i4) {
        o.e(bArr, "<this>");
        if (i4 == f7636b) {
            return bArr.length;
        }
        return i4;
    }

    public static final int f(int i4) {
        return ((i4 & 255) << 24) | ((-16777216 & i4) >>> 24) | ((16711680 & i4) >>> 8) | ((65280 & i4) << 8);
    }

    public static final short g(short s4) {
        return (short) (((s4 & 255) << 8) | ((65280 & s4) >>> 8));
    }

    public static final String h(byte b4) {
        return kotlin.text.o.q(new char[]{b.f()[(b4 >> 4) & 15], b.f()[b4 & 15]});
    }

    public static final String i(int i4) {
        int i5 = 0;
        if (i4 == 0) {
            return "0";
        }
        char[] cArr = {b.f()[(i4 >> 28) & 15], b.f()[(i4 >> 24) & 15], b.f()[(i4 >> 20) & 15], b.f()[(i4 >> 16) & 15], b.f()[(i4 >> 12) & 15], b.f()[(i4 >> 8) & 15], b.f()[(i4 >> 4) & 15], b.f()[i4 & 15]};
        while (i5 < 8 && cArr[i5] == '0') {
            i5++;
        }
        return kotlin.text.o.r(cArr, i5, 8);
    }
}
