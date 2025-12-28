package J2;

import java.util.Arrays;
import kotlin.jvm.internal.o;
import z2.d;

public final class D0 extends C0332v0 {

    /* renamed from: a  reason: collision with root package name */
    private short[] f614a;

    /* renamed from: b  reason: collision with root package name */
    private int f615b;

    public D0(short[] sArr) {
        o.e(sArr, "bufferWithData");
        this.f614a = sArr;
        this.f615b = sArr.length;
        b(10);
    }

    public void b(int i4) {
        short[] sArr = this.f614a;
        if (sArr.length < i4) {
            short[] copyOf = Arrays.copyOf(sArr, d.b(i4, sArr.length * 2));
            o.d(copyOf, "copyOf(...)");
            this.f614a = copyOf;
        }
    }

    public int d() {
        return this.f615b;
    }

    public final void e(short s4) {
        C0332v0.c(this, 0, 1, (Object) null);
        short[] sArr = this.f614a;
        int d4 = d();
        this.f615b = d4 + 1;
        sArr[d4] = s4;
    }

    /* renamed from: f */
    public short[] a() {
        short[] copyOf = Arrays.copyOf(this.f614a, d());
        o.d(copyOf, "copyOf(...)");
        return copyOf;
    }
}
