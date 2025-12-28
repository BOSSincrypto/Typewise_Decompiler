package J2;

import java.util.Arrays;
import kotlin.jvm.internal.o;
import z2.d;

public final class I extends C0332v0 {

    /* renamed from: a  reason: collision with root package name */
    private int[] f628a;

    /* renamed from: b  reason: collision with root package name */
    private int f629b;

    public I(int[] iArr) {
        o.e(iArr, "bufferWithData");
        this.f628a = iArr;
        this.f629b = iArr.length;
        b(10);
    }

    public void b(int i4) {
        int[] iArr = this.f628a;
        if (iArr.length < i4) {
            int[] copyOf = Arrays.copyOf(iArr, d.b(i4, iArr.length * 2));
            o.d(copyOf, "copyOf(...)");
            this.f628a = copyOf;
        }
    }

    public int d() {
        return this.f629b;
    }

    public final void e(int i4) {
        C0332v0.c(this, 0, 1, (Object) null);
        int[] iArr = this.f628a;
        int d4 = d();
        this.f629b = d4 + 1;
        iArr[d4] = i4;
    }

    /* renamed from: f */
    public int[] a() {
        int[] copyOf = Arrays.copyOf(this.f628a, d());
        o.d(copyOf, "copyOf(...)");
        return copyOf;
    }
}
