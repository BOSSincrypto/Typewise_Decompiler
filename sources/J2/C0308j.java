package J2;

import java.util.Arrays;
import kotlin.jvm.internal.o;
import z2.d;

/* renamed from: J2.j  reason: case insensitive filesystem */
public final class C0308j extends C0332v0 {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f711a;

    /* renamed from: b  reason: collision with root package name */
    private int f712b;

    public C0308j(byte[] bArr) {
        o.e(bArr, "bufferWithData");
        this.f711a = bArr;
        this.f712b = bArr.length;
        b(10);
    }

    public void b(int i4) {
        byte[] bArr = this.f711a;
        if (bArr.length < i4) {
            byte[] copyOf = Arrays.copyOf(bArr, d.b(i4, bArr.length * 2));
            o.d(copyOf, "copyOf(...)");
            this.f711a = copyOf;
        }
    }

    public int d() {
        return this.f712b;
    }

    public final void e(byte b4) {
        C0332v0.c(this, 0, 1, (Object) null);
        byte[] bArr = this.f711a;
        int d4 = d();
        this.f712b = d4 + 1;
        bArr[d4] = b4;
    }

    /* renamed from: f */
    public byte[] a() {
        byte[] copyOf = Arrays.copyOf(this.f711a, d());
        o.d(copyOf, "copyOf(...)");
        return copyOf;
    }
}
