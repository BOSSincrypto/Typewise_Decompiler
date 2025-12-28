package kotlinx.coroutines;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.V;
import z2.d;

public final class G extends V implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: h  reason: collision with root package name */
    public static final G f13996h;

    /* renamed from: i  reason: collision with root package name */
    private static final long f13997i;

    static {
        Long l4;
        G g4 = new G();
        f13996h = g4;
        U.x0(g4, false, 1, (Object) null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l4 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l4 = 1000L;
        }
        f13997i = timeUnit.toNanos(l4.longValue());
    }

    private G() {
    }

    private final synchronized void T0() {
        if (W0()) {
            debugStatus = 3;
            N0();
            notifyAll();
        }
    }

    private final synchronized Thread U0() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final boolean V0() {
        if (debugStatus == 4) {
            return true;
        }
        return false;
    }

    private final boolean W0() {
        int i4 = debugStatus;
        if (i4 == 2 || i4 == 3) {
            return true;
        }
        return false;
    }

    private final synchronized boolean X0() {
        if (W0()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    private final void Y0() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    /* access modifiers changed from: protected */
    public Thread B0() {
        Thread thread = _thread;
        if (thread == null) {
            return U0();
        }
        return thread;
    }

    /* access modifiers changed from: protected */
    public void C0(long j4, V.c cVar) {
        Y0();
    }

    public void H0(Runnable runnable) {
        if (V0()) {
            Y0();
        }
        super.H0(runnable);
    }

    public void run() {
        B0.f13984a.c(this);
        C0730c.a();
        try {
            if (X0()) {
                long j4 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long L02 = L0();
                    if (L02 == Long.MAX_VALUE) {
                        C0730c.a();
                        long nanoTime = System.nanoTime();
                        if (j4 == Long.MAX_VALUE) {
                            j4 = f13997i + nanoTime;
                        }
                        long j5 = j4 - nanoTime;
                        if (j5 <= 0) {
                            _thread = null;
                            T0();
                            C0730c.a();
                            if (!K0()) {
                                B0();
                                return;
                            }
                            return;
                        }
                        L02 = d.e(L02, j5);
                    } else {
                        j4 = Long.MAX_VALUE;
                    }
                    if (L02 > 0) {
                        if (W0()) {
                            _thread = null;
                            T0();
                            C0730c.a();
                            if (!K0()) {
                                B0();
                                return;
                            }
                            return;
                        }
                        C0730c.a();
                        LockSupport.parkNanos(this, L02);
                    }
                }
            }
        } finally {
            _thread = null;
            T0();
            C0730c.a();
            if (!K0()) {
                B0();
            }
        }
    }

    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    public Q v(long j4, Runnable runnable, CoroutineContext coroutineContext) {
        return Q0(j4, runnable);
    }
}
