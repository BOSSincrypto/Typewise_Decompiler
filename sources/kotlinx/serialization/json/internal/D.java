package kotlinx.serialization.json.internal;

import java.util.Arrays;
import kotlin.jvm.internal.o;
import z2.d;

public final class D implements v {

    /* renamed from: a  reason: collision with root package name */
    private char[] f14331a = C0766e.f14388c.d();

    /* renamed from: b  reason: collision with root package name */
    private int f14332b;

    private final void e(int i4, int i5, String str) {
        int i6;
        int length = str.length();
        while (i4 < length) {
            int g4 = g(i5, 2);
            char charAt = str.charAt(i4);
            if (charAt < P.a().length) {
                byte b4 = P.a()[charAt];
                if (b4 == 0) {
                    i6 = g4 + 1;
                    this.f14331a[g4] = (char) charAt;
                } else {
                    if (b4 == 1) {
                        String str2 = P.b()[charAt];
                        o.b(str2);
                        int g5 = g(g4, str2.length());
                        str2.getChars(0, str2.length(), this.f14331a, g5);
                        i5 = g5 + str2.length();
                        this.f14332b = i5;
                    } else {
                        char[] cArr = this.f14331a;
                        cArr[g4] = '\\';
                        cArr[g4 + 1] = (char) b4;
                        i5 = g4 + 2;
                        this.f14332b = i5;
                    }
                    i4++;
                }
            } else {
                i6 = g4 + 1;
                this.f14331a[g4] = (char) charAt;
            }
            i5 = i6;
            i4++;
        }
        int g6 = g(i5, 1);
        this.f14331a[g6] = '\"';
        this.f14332b = g6 + 1;
    }

    private final void f(int i4) {
        g(this.f14332b, i4);
    }

    private final int g(int i4, int i5) {
        int i6 = i5 + i4;
        char[] cArr = this.f14331a;
        if (cArr.length <= i6) {
            char[] copyOf = Arrays.copyOf(cArr, d.b(i6, i4 * 2));
            o.d(copyOf, "copyOf(...)");
            this.f14331a = copyOf;
        }
        return i4;
    }

    public void a(char c4) {
        f(1);
        char[] cArr = this.f14331a;
        int i4 = this.f14332b;
        this.f14332b = i4 + 1;
        cArr[i4] = c4;
    }

    public void b(String str) {
        o.e(str, "text");
        f(str.length() + 2);
        char[] cArr = this.f14331a;
        int i4 = this.f14332b;
        int i5 = i4 + 1;
        cArr[i4] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i5);
        int i6 = length + i5;
        int i7 = i5;
        while (i7 < i6) {
            char c4 = cArr[i7];
            if (c4 >= P.a().length || P.a()[c4] == 0) {
                i7++;
            } else {
                e(i7 - i5, i7, str);
                return;
            }
        }
        cArr[i6] = '\"';
        this.f14332b = i6 + 1;
    }

    public void c(long j4) {
        d(String.valueOf(j4));
    }

    public void d(String str) {
        o.e(str, "text");
        int length = str.length();
        if (length != 0) {
            f(length);
            str.getChars(0, str.length(), this.f14331a, this.f14332b);
            this.f14332b += length;
        }
    }

    public void h() {
        C0766e.f14388c.c(this.f14331a);
    }

    public String toString() {
        return new String(this.f14331a, 0, this.f14332b);
    }
}
