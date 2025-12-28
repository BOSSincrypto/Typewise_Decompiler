package J2;

import java.util.Arrays;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import z2.d;

public final class N0 extends C0332v0 {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f646a;

    /* renamed from: b  reason: collision with root package name */
    private int f647b;

    public /* synthetic */ N0(byte[] bArr, i iVar) {
        this(bArr);
    }

    public /* bridge */ /* synthetic */ Object a() {
        return l2.i.b(f());
    }

    public void b(int i4) {
        if (l2.i.k(this.f646a) < i4) {
            byte[] bArr = this.f646a;
            byte[] copyOf = Arrays.copyOf(bArr, d.b(i4, l2.i.k(bArr) * 2));
            o.d(copyOf, "copyOf(...)");
            this.f646a = l2.i.d(copyOf);
        }
    }

    public int d() {
        return this.f647b;
    }

    public final void e(byte b4) {
        C0332v0.c(this, 0, 1, (Object) null);
        byte[] bArr = this.f646a;
        int d4 = d();
        this.f647b = d4 + 1;
        l2.i.o(bArr, d4, b4);
    }

    public byte[] f() {
        byte[] copyOf = Arrays.copyOf(this.f646a, d());
        o.d(copyOf, "copyOf(...)");
        return l2.i.d(copyOf);
    }

    private N0(byte[] bArr) {
        o.e(bArr, "bufferWithData");
        this.f646a = bArr;
        this.f647b = l2.i.k(bArr);
        b(10);
    }
}
