package J2;

import java.util.Arrays;
import kotlin.jvm.internal.o;
import z2.d;

/* renamed from: J2.n  reason: case insensitive filesystem */
public final class C0316n extends C0332v0 {

    /* renamed from: a  reason: collision with root package name */
    private char[] f720a;

    /* renamed from: b  reason: collision with root package name */
    private int f721b;

    public C0316n(char[] cArr) {
        o.e(cArr, "bufferWithData");
        this.f720a = cArr;
        this.f721b = cArr.length;
        b(10);
    }

    public void b(int i4) {
        char[] cArr = this.f720a;
        if (cArr.length < i4) {
            char[] copyOf = Arrays.copyOf(cArr, d.b(i4, cArr.length * 2));
            o.d(copyOf, "copyOf(...)");
            this.f720a = copyOf;
        }
    }

    public int d() {
        return this.f721b;
    }

    public final void e(char c4) {
        C0332v0.c(this, 0, 1, (Object) null);
        char[] cArr = this.f720a;
        int d4 = d();
        this.f721b = d4 + 1;
        cArr[d4] = c4;
    }

    /* renamed from: f */
    public char[] a() {
        char[] copyOf = Arrays.copyOf(this.f720a, d());
        o.d(copyOf, "copyOf(...)");
        return copyOf;
    }
}
