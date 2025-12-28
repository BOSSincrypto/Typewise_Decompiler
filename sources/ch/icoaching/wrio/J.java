package ch.icoaching.wrio;

import android.util.DisplayMetrics;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import w2.C0930a;

public final class J {

    /* renamed from: c  reason: collision with root package name */
    public static final a f9035c = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final double f9036a;

    /* renamed from: b  reason: collision with root package name */
    private final double f9037b;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public final J a() {
            return new J(((Number) K.a().get(1)).doubleValue(), ((Number) K.b().get(1)).doubleValue());
        }

        private a() {
        }
    }

    public J(double d4, double d5) {
        this.f9036a = d4;
        this.f9037b = d5;
    }

    public final double a() {
        return this.f9037b;
    }

    public final int[] b(DisplayMetrics displayMetrics) {
        o.e(displayMetrics, "displayMetrics");
        return new int[]{C0930a.a(((((double) displayMetrics.xdpi) / 1.2d) / 2.54d) * this.f9036a), C0930a.a(((((double) displayMetrics.ydpi) / 1.2d) / 2.54d) * this.f9037b)};
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j4 = (J) obj;
        return Double.compare(this.f9036a, j4.f9036a) == 0 && Double.compare(this.f9037b, j4.f9037b) == 0;
    }

    public int hashCode() {
        return (Double.doubleToLongBits(this.f9036a) * 31) + Double.doubleToLongBits(this.f9037b);
    }

    public String toString() {
        return "SwipeMetrics(minSwipeDistanceHorizontal=" + this.f9036a + ", minSwipeDistanceVertical=" + this.f9037b + ')';
    }
}
