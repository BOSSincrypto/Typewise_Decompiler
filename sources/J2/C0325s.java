package J2;

import java.util.Arrays;
import kotlin.jvm.internal.o;
import z2.d;

/* renamed from: J2.s  reason: case insensitive filesystem */
public final class C0325s extends C0332v0 {

    /* renamed from: a  reason: collision with root package name */
    private double[] f730a;

    /* renamed from: b  reason: collision with root package name */
    private int f731b;

    public C0325s(double[] dArr) {
        o.e(dArr, "bufferWithData");
        this.f730a = dArr;
        this.f731b = dArr.length;
        b(10);
    }

    public void b(int i4) {
        double[] dArr = this.f730a;
        if (dArr.length < i4) {
            double[] copyOf = Arrays.copyOf(dArr, d.b(i4, dArr.length * 2));
            o.d(copyOf, "copyOf(...)");
            this.f730a = copyOf;
        }
    }

    public int d() {
        return this.f731b;
    }

    public final void e(double d4) {
        C0332v0.c(this, 0, 1, (Object) null);
        double[] dArr = this.f730a;
        int d5 = d();
        this.f731b = d5 + 1;
        dArr[d5] = d4;
    }

    /* renamed from: f */
    public double[] a() {
        double[] copyOf = Arrays.copyOf(this.f730a, d());
        o.d(copyOf, "copyOf(...)");
        return copyOf;
    }
}
