package kotlinx.coroutines.scheduling;

import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.z;
import z2.d;

public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public static final long f14266a = B.e("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, (Object) null);

    /* renamed from: b  reason: collision with root package name */
    public static final int f14267b = B.d("kotlinx.coroutines.scheduler.core.pool.size", d.b(z.a(), 2), 1, 0, 8, (Object) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f14268c = B.d("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, (Object) null);

    /* renamed from: d  reason: collision with root package name */
    public static final long f14269d = TimeUnit.SECONDS.toNanos(B.e("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, (Object) null));

    /* renamed from: e  reason: collision with root package name */
    public static f f14270e = d.f14256a;

    /* renamed from: f  reason: collision with root package name */
    public static final h f14271f = new i(0);

    /* renamed from: g  reason: collision with root package name */
    public static final h f14272g = new i(1);
}
