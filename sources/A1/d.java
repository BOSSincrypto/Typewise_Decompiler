package A1;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private long f12a;

    /* renamed from: b  reason: collision with root package name */
    private long f13b;

    /* renamed from: c  reason: collision with root package name */
    private TimeInterpolator f14c;

    /* renamed from: d  reason: collision with root package name */
    private int f15d;

    /* renamed from: e  reason: collision with root package name */
    private int f16e;

    public d(long j4, long j5) {
        this.f14c = null;
        this.f15d = 0;
        this.f16e = 1;
        this.f12a = j4;
        this.f13b = j5;
    }

    static d a(ValueAnimator valueAnimator) {
        d dVar = new d(valueAnimator.getStartDelay(), valueAnimator.getDuration(), e(valueAnimator));
        dVar.f15d = valueAnimator.getRepeatCount();
        dVar.f16e = valueAnimator.getRepeatMode();
        return dVar;
    }

    private static TimeInterpolator e(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return a.f6b;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return a.f7c;
        }
        if (interpolator instanceof DecelerateInterpolator) {
            return a.f8d;
        }
        return interpolator;
    }

    public long b() {
        return this.f12a;
    }

    public long c() {
        return this.f13b;
    }

    public TimeInterpolator d() {
        TimeInterpolator timeInterpolator = this.f14c;
        if (timeInterpolator != null) {
            return timeInterpolator;
        }
        return a.f6b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (b() == dVar.b() && c() == dVar.c() && f() == dVar.f() && g() == dVar.g()) {
            return d().getClass().equals(dVar.d().getClass());
        }
        return false;
    }

    public int f() {
        return this.f15d;
    }

    public int g() {
        return this.f16e;
    }

    public int hashCode() {
        return (((((((((int) (b() ^ (b() >>> 32))) * 31) + ((int) (c() ^ (c() >>> 32)))) * 31) + d().getClass().hashCode()) * 31) + f()) * 31) + g();
    }

    public String toString() {
        return 10 + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + b() + " duration: " + c() + " interpolator: " + d().getClass() + " repeatCount: " + f() + " repeatMode: " + g() + "}\n";
    }

    public d(long j4, long j5, TimeInterpolator timeInterpolator) {
        this.f15d = 0;
        this.f16e = 1;
        this.f12a = j4;
        this.f13b = j5;
        this.f14c = timeInterpolator;
    }
}
