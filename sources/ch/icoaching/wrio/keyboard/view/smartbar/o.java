package ch.icoaching.wrio.keyboard.view.smartbar;

import androidx.work.c;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    private final int f10538a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f10539b;

    public o(int i4, boolean z3) {
        this.f10538a = i4;
        this.f10539b = z3;
    }

    public final int a() {
        return this.f10538a;
    }

    public final boolean b() {
        return this.f10539b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f10538a == oVar.f10538a && this.f10539b == oVar.f10539b;
    }

    public int hashCode() {
        return (this.f10538a * 31) + c.a(this.f10539b);
    }

    public String toString() {
        return "ItemDrawableData(drawable=" + this.f10538a + ", isStartDrawable=" + this.f10539b + ')';
    }
}
