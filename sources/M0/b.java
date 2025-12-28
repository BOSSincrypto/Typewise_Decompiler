package M0;

import android.graphics.PointF;
import kotlin.jvm.internal.o;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final char f892a;

    /* renamed from: b  reason: collision with root package name */
    private final int f893b;

    /* renamed from: c  reason: collision with root package name */
    private final PointF f894c;

    /* renamed from: d  reason: collision with root package name */
    private final int f895d;

    /* renamed from: e  reason: collision with root package name */
    private final float f896e;

    public b(char c4, int i4, PointF pointF, int i5, float f4) {
        o.e(pointF, "keyCentre");
        this.f892a = c4;
        this.f893b = i4;
        this.f894c = pointF;
        this.f895d = i5;
        this.f896e = f4;
    }

    public final char a() {
        return this.f892a;
    }

    public final PointF b() {
        return this.f894c;
    }

    public final int c() {
        return this.f893b;
    }

    public final int d() {
        return this.f895d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f892a == bVar.f892a && this.f893b == bVar.f893b && o.a(this.f894c, bVar.f894c) && this.f895d == bVar.f895d && Float.compare(this.f896e, bVar.f896e) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.f892a * 31) + this.f893b) * 31) + this.f894c.hashCode()) * 31) + this.f895d) * 31) + Float.floatToIntBits(this.f896e);
    }

    public String toString() {
        return "KeyCentre(char=" + this.f892a + ", keyCode=" + this.f893b + ", keyCentre=" + this.f894c + ", width=" + this.f895d + ", relativeWidth=" + this.f896e + ')';
    }
}
