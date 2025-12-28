package J2;

import java.util.Arrays;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import l2.m;
import z2.d;

public final class T0 extends C0332v0 {

    /* renamed from: a  reason: collision with root package name */
    private long[] f662a;

    /* renamed from: b  reason: collision with root package name */
    private int f663b;

    public /* synthetic */ T0(long[] jArr, i iVar) {
        this(jArr);
    }

    public /* bridge */ /* synthetic */ Object a() {
        return m.b(f());
    }

    public void b(int i4) {
        if (m.k(this.f662a) < i4) {
            long[] jArr = this.f662a;
            long[] copyOf = Arrays.copyOf(jArr, d.b(i4, m.k(jArr) * 2));
            o.d(copyOf, "copyOf(...)");
            this.f662a = m.d(copyOf);
        }
    }

    public int d() {
        return this.f663b;
    }

    public final void e(long j4) {
        C0332v0.c(this, 0, 1, (Object) null);
        long[] jArr = this.f662a;
        int d4 = d();
        this.f663b = d4 + 1;
        m.o(jArr, d4, j4);
    }

    public long[] f() {
        long[] copyOf = Arrays.copyOf(this.f662a, d());
        o.d(copyOf, "copyOf(...)");
        return m.d(copyOf);
    }

    private T0(long[] jArr) {
        o.e(jArr, "bufferWithData");
        this.f662a = jArr;
        this.f663b = m.k(jArr);
        b(10);
    }
}
