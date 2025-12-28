package J2;

import java.util.Arrays;
import kotlin.jvm.internal.o;
import z2.d;

public final class C extends C0332v0 {

    /* renamed from: a  reason: collision with root package name */
    private float[] f611a;

    /* renamed from: b  reason: collision with root package name */
    private int f612b;

    public C(float[] fArr) {
        o.e(fArr, "bufferWithData");
        this.f611a = fArr;
        this.f612b = fArr.length;
        b(10);
    }

    public void b(int i4) {
        float[] fArr = this.f611a;
        if (fArr.length < i4) {
            float[] copyOf = Arrays.copyOf(fArr, d.b(i4, fArr.length * 2));
            o.d(copyOf, "copyOf(...)");
            this.f611a = copyOf;
        }
    }

    public int d() {
        return this.f612b;
    }

    public final void e(float f4) {
        C0332v0.c(this, 0, 1, (Object) null);
        float[] fArr = this.f611a;
        int d4 = d();
        this.f612b = d4 + 1;
        fArr[d4] = f4;
    }

    /* renamed from: f */
    public float[] a() {
        float[] copyOf = Arrays.copyOf(this.f611a, d());
        o.d(copyOf, "copyOf(...)");
        return copyOf;
    }
}
