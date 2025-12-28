package J2;

import java.util.Arrays;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import l2.k;
import z2.d;

public final class Q0 extends C0332v0 {

    /* renamed from: a  reason: collision with root package name */
    private int[] f653a;

    /* renamed from: b  reason: collision with root package name */
    private int f654b;

    public /* synthetic */ Q0(int[] iArr, i iVar) {
        this(iArr);
    }

    public /* bridge */ /* synthetic */ Object a() {
        return k.b(f());
    }

    public void b(int i4) {
        if (k.k(this.f653a) < i4) {
            int[] iArr = this.f653a;
            int[] copyOf = Arrays.copyOf(iArr, d.b(i4, k.k(iArr) * 2));
            o.d(copyOf, "copyOf(...)");
            this.f653a = k.d(copyOf);
        }
    }

    public int d() {
        return this.f654b;
    }

    public final void e(int i4) {
        C0332v0.c(this, 0, 1, (Object) null);
        int[] iArr = this.f653a;
        int d4 = d();
        this.f654b = d4 + 1;
        k.o(iArr, d4, i4);
    }

    public int[] f() {
        int[] copyOf = Arrays.copyOf(this.f653a, d());
        o.d(copyOf, "copyOf(...)");
        return k.d(copyOf);
    }

    private Q0(int[] iArr) {
        o.e(iArr, "bufferWithData");
        this.f653a = iArr;
        this.f654b = k.k(iArr);
        b(10);
    }
}
