package kotlin.text;

import kotlin.KotlinNothingValueException;
import kotlin.collections.C0707b;
import kotlin.jvm.internal.o;
import kotlin.text.h;
import z2.d;

public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f13945a;

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f13946b;

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f13947c;

    /* renamed from: d  reason: collision with root package name */
    private static final long[] f13948d;

    static {
        int[] iArr = new int[256];
        int i4 = 0;
        for (int i5 = 0; i5 < 256; i5++) {
            iArr[i5] = "0123456789abcdef".charAt(i5 & 15) | ("0123456789abcdef".charAt(i5 >> 4) << 8);
        }
        f13945a = iArr;
        int[] iArr2 = new int[256];
        for (int i6 = 0; i6 < 256; i6++) {
            iArr2[i6] = "0123456789ABCDEF".charAt(i6 & 15) | ("0123456789ABCDEF".charAt(i6 >> 4) << 8);
        }
        f13946b = iArr2;
        int[] iArr3 = new int[256];
        for (int i7 = 0; i7 < 256; i7++) {
            iArr3[i7] = -1;
        }
        int i8 = 0;
        int i9 = 0;
        while (i8 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i8)] = i9;
            i8++;
            i9++;
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i10)] = i11;
            i10++;
            i11++;
        }
        f13947c = iArr3;
        long[] jArr = new long[256];
        for (int i12 = 0; i12 < 256; i12++) {
            jArr[i12] = -1;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i13)] = (long) i14;
            i13++;
            i14++;
        }
        int i15 = 0;
        while (i4 < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i4)] = (long) i15;
            i4++;
            i15++;
        }
        f13948d = jArr;
    }

    private static final void a(String str, int i4, int i5, int i6) {
        int i7 = i5 - i4;
        if (i7 < 1) {
            j(str, i4, i5, "at least", 1);
        } else if (i7 > i6) {
            c(str, i4, (i7 + i4) - i6);
        }
    }

    private static final void b(String str, int i4, int i5, String str2, String str3, boolean z3, int i6) {
        if ((i5 - i4) - str2.length() <= str3.length()) {
            k(str, i4, i5, str2, str3);
        }
        if (str2.length() != 0) {
            int length = str2.length();
            for (int i7 = 0; i7 < length; i7++) {
                if (!C0723c.g(str2.charAt(i7), str.charAt(i4 + i7), z3)) {
                    l(str, i4, i5, str2, "prefix");
                }
            }
            i4 += str2.length();
        }
        int length2 = i5 - str3.length();
        if (str3.length() != 0) {
            int length3 = str3.length();
            for (int i8 = 0; i8 < length3; i8++) {
                if (!C0723c.g(str3.charAt(i8), str.charAt(length2 + i8), z3)) {
                    l(str, length2, i5, str3, "suffix");
                }
            }
        }
        a(str, i4, length2, i6);
    }

    private static final void c(String str, int i4, int i5) {
        while (i4 < i5) {
            if (str.charAt(i4) == '0') {
                i4++;
            } else {
                throw new NumberFormatException("Expected the hexadecimal digit '0' at index " + i4 + ", but was '" + str.charAt(i4) + "'.\nThe result won't fit the type being parsed.");
            }
        }
    }

    public static final int[] d() {
        return f13945a;
    }

    public static final long e(String str, int i4, int i5, h hVar) {
        o.e(str, "<this>");
        o.e(hVar, "format");
        return g(str, i4, i5, hVar, 16);
    }

    public static /* synthetic */ long f(String str, int i4, int i5, h hVar, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = str.length();
        }
        if ((i6 & 4) != 0) {
            hVar = h.f13949d.a();
        }
        return e(str, i4, i5, hVar);
    }

    private static final long g(String str, int i4, int i5, h hVar, int i6) {
        C0707b.Companion.a(i4, i5, str.length());
        h.c b4 = hVar.b();
        if (b4.f()) {
            a(str, i4, i5, i6);
            return h(str, i4, i5);
        }
        String d4 = b4.d();
        String e4 = b4.e();
        b(str, i4, i5, d4, e4, b4.c(), i6);
        return h(str, i4 + d4.length(), i5 - e4.length());
    }

    private static final long h(String str, int i4, int i5) {
        long j4 = 0;
        while (i4 < i5) {
            long j5 = j4 << 4;
            char charAt = str.charAt(i4);
            if ((charAt >>> 8) == 0) {
                long j6 = f13948d[charAt];
                if (j6 >= 0) {
                    j4 = j5 | j6;
                    i4++;
                }
            }
            i(str, i4);
            throw new KotlinNothingValueException();
        }
        return j4;
    }

    private static final Void i(String str, int i4) {
        throw new NumberFormatException("Expected a hexadecimal digit at index " + i4 + ", but was " + str.charAt(i4));
    }

    private static final void j(String str, int i4, int i5, String str2, int i6) {
        o.c(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(i4, i5);
        o.d(substring, "substring(...)");
        throw new NumberFormatException("Expected " + str2 + ' ' + i6 + " hexadecimal digits at index " + i4 + ", but was \"" + substring + "\" of length " + (i5 - i4));
    }

    private static final void k(String str, int i4, int i5, String str2, String str3) {
        o.c(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(i4, i5);
        o.d(substring, "substring(...)");
        throw new NumberFormatException("Expected a hexadecimal number with prefix \"" + str2 + "\" and suffix \"" + str3 + "\", but was " + substring);
    }

    private static final void l(String str, int i4, int i5, String str2, String str3) {
        int d4 = d.d(str2.length() + i4, i5);
        o.c(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(i4, d4);
        o.d(substring, "substring(...)");
        throw new NumberFormatException("Expected " + str3 + " \"" + str2 + "\" at index " + i4 + ", but was " + substring);
    }
}
