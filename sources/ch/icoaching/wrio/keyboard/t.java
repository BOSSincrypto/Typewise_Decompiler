package ch.icoaching.wrio.keyboard;

import android.graphics.PointF;
import androidx.work.c;
import kotlin.jvm.internal.o;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    private final int f10111a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f10112b;

    /* renamed from: c  reason: collision with root package name */
    private final int f10113c;

    /* renamed from: d  reason: collision with root package name */
    private final PointF f10114d;

    public t(int i4, boolean z3, int i5, PointF pointF) {
        o.e(pointF, "offset");
        this.f10111a = i4;
        this.f10112b = z3;
        this.f10113c = i5;
        this.f10114d = pointF;
    }

    public static /* synthetic */ t b(t tVar, int i4, boolean z3, int i5, PointF pointF, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = tVar.f10111a;
        }
        if ((i6 & 2) != 0) {
            z3 = tVar.f10112b;
        }
        if ((i6 & 4) != 0) {
            i5 = tVar.f10113c;
        }
        if ((i6 & 8) != 0) {
            pointF = tVar.f10114d;
        }
        return tVar.a(i4, z3, i5, pointF);
    }

    public final t a(int i4, boolean z3, int i5, PointF pointF) {
        o.e(pointF, "offset");
        return new t(i4, z3, i5, pointF);
    }

    public final int c() {
        return this.f10111a;
    }

    public final boolean d() {
        return this.f10112b;
    }

    public final PointF e() {
        return this.f10114d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f10111a == tVar.f10111a && this.f10112b == tVar.f10112b && this.f10113c == tVar.f10113c && o.a(this.f10114d, tVar.f10114d);
    }

    public final int f() {
        return this.f10113c;
    }

    public int hashCode() {
        return (((((this.f10111a * 31) + c.a(this.f10112b)) * 31) + this.f10113c) * 31) + this.f10114d.hashCode();
    }

    public String toString() {
        return "DynamicOffset(keyCode=" + this.f10111a + ", landscape=" + this.f10112b + ", offsetWeight=" + this.f10113c + ", offset=" + this.f10114d + ')';
    }
}
