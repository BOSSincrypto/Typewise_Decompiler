package J2;

import java.util.Arrays;
import kotlin.jvm.internal.o;
import z2.d;

public final class T extends C0332v0 {

    /* renamed from: a  reason: collision with root package name */
    private long[] f660a;

    /* renamed from: b  reason: collision with root package name */
    private int f661b;

    public T(long[] jArr) {
        o.e(jArr, "bufferWithData");
        this.f660a = jArr;
        this.f661b = jArr.length;
        b(10);
    }

    public void b(int i4) {
        long[] jArr = this.f660a;
        if (jArr.length < i4) {
            long[] copyOf = Arrays.copyOf(jArr, d.b(i4, jArr.length * 2));
            o.d(copyOf, "copyOf(...)");
            this.f660a = copyOf;
        }
    }

    public int d() {
        return this.f661b;
    }

    public final void e(long j4) {
        C0332v0.c(this, 0, 1, (Object) null);
        long[] jArr = this.f660a;
        int d4 = d();
        this.f661b = d4 + 1;
        jArr[d4] = j4;
    }

    /* renamed from: f */
    public long[] a() {
        long[] copyOf = Arrays.copyOf(this.f660a, d());
        o.d(copyOf, "copyOf(...)");
        return copyOf;
    }
}
