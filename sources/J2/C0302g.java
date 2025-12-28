package J2;

import java.util.Arrays;
import kotlin.jvm.internal.o;
import z2.d;

/* renamed from: J2.g  reason: case insensitive filesystem */
public final class C0302g extends C0332v0 {

    /* renamed from: a  reason: collision with root package name */
    private boolean[] f700a;

    /* renamed from: b  reason: collision with root package name */
    private int f701b;

    public C0302g(boolean[] zArr) {
        o.e(zArr, "bufferWithData");
        this.f700a = zArr;
        this.f701b = zArr.length;
        b(10);
    }

    public void b(int i4) {
        boolean[] zArr = this.f700a;
        if (zArr.length < i4) {
            boolean[] copyOf = Arrays.copyOf(zArr, d.b(i4, zArr.length * 2));
            o.d(copyOf, "copyOf(...)");
            this.f700a = copyOf;
        }
    }

    public int d() {
        return this.f701b;
    }

    public final void e(boolean z3) {
        C0332v0.c(this, 0, 1, (Object) null);
        boolean[] zArr = this.f700a;
        int d4 = d();
        this.f701b = d4 + 1;
        zArr[d4] = z3;
    }

    /* renamed from: f */
    public boolean[] a() {
        boolean[] copyOf = Arrays.copyOf(this.f700a, d());
        o.d(copyOf, "copyOf(...)");
        return copyOf;
    }
}
