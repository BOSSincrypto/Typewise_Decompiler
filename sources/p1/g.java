package p1;

import android.os.SystemClock;

public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    private static final double f15869a = (1.0d / Math.pow(10.0d, 6.0d));

    public static double a(long j4) {
        return ((double) (b() - j4)) * f15869a;
    }

    public static long b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
