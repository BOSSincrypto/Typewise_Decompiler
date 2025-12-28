package androidx.core.graphics;

import android.graphics.Insets;
import android.graphics.Rect;

public final class f {

    /* renamed from: e  reason: collision with root package name */
    public static final f f4969e = new f(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f4970a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4971b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4972c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4973d;

    static class a {
        static Insets a(int i4, int i5, int i6, int i7) {
            return Insets.of(i4, i5, i6, i7);
        }
    }

    private f(int i4, int i5, int i6, int i7) {
        this.f4970a = i4;
        this.f4971b = i5;
        this.f4972c = i6;
        this.f4973d = i7;
    }

    public static f a(f fVar, f fVar2) {
        return b(Math.max(fVar.f4970a, fVar2.f4970a), Math.max(fVar.f4971b, fVar2.f4971b), Math.max(fVar.f4972c, fVar2.f4972c), Math.max(fVar.f4973d, fVar2.f4973d));
    }

    public static f b(int i4, int i5, int i6, int i7) {
        if (i4 == 0 && i5 == 0 && i6 == 0 && i7 == 0) {
            return f4969e;
        }
        return new f(i4, i5, i6, i7);
    }

    public static f c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static f d(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets e() {
        return a.a(this.f4970a, this.f4971b, this.f4972c, this.f4973d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f4973d == fVar.f4973d && this.f4970a == fVar.f4970a && this.f4972c == fVar.f4972c && this.f4971b == fVar.f4971b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f4970a * 31) + this.f4971b) * 31) + this.f4972c) * 31) + this.f4973d;
    }

    public String toString() {
        return "Insets{left=" + this.f4970a + ", top=" + this.f4971b + ", right=" + this.f4972c + ", bottom=" + this.f4973d + '}';
    }
}
