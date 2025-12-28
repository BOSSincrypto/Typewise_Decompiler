package J2;

import java.util.Arrays;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import l2.p;
import z2.d;

public final class W0 extends C0332v0 {

    /* renamed from: a  reason: collision with root package name */
    private short[] f672a;

    /* renamed from: b  reason: collision with root package name */
    private int f673b;

    public /* synthetic */ W0(short[] sArr, i iVar) {
        this(sArr);
    }

    public /* bridge */ /* synthetic */ Object a() {
        return p.b(f());
    }

    public void b(int i4) {
        if (p.k(this.f672a) < i4) {
            short[] sArr = this.f672a;
            short[] copyOf = Arrays.copyOf(sArr, d.b(i4, p.k(sArr) * 2));
            o.d(copyOf, "copyOf(...)");
            this.f672a = p.d(copyOf);
        }
    }

    public int d() {
        return this.f673b;
    }

    public final void e(short s4) {
        C0332v0.c(this, 0, 1, (Object) null);
        short[] sArr = this.f672a;
        int d4 = d();
        this.f673b = d4 + 1;
        p.o(sArr, d4, s4);
    }

    public short[] f() {
        short[] copyOf = Arrays.copyOf(this.f672a, d());
        o.d(copyOf, "copyOf(...)");
        return p.d(copyOf);
    }

    private W0(short[] sArr) {
        o.e(sArr, "bufferWithData");
        this.f672a = sArr;
        this.f673b = p.k(sArr);
        b(10);
    }
}
