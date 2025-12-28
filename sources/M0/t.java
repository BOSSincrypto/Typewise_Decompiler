package m0;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import n0.C0825a;

public class t implements C0825a {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayDeque f14619a = new ArrayDeque();

    /* renamed from: b  reason: collision with root package name */
    private final Executor f14620b;

    /* renamed from: c  reason: collision with root package name */
    private Runnable f14621c;

    /* renamed from: d  reason: collision with root package name */
    final Object f14622d = new Object();

    static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final t f14623a;

        /* renamed from: b  reason: collision with root package name */
        final Runnable f14624b;

        a(t tVar, Runnable runnable) {
            this.f14623a = tVar;
            this.f14624b = runnable;
        }

        public void run() {
            try {
                this.f14624b.run();
                synchronized (this.f14623a.f14622d) {
                    this.f14623a.a();
                }
            } catch (Throwable th) {
                synchronized (this.f14623a.f14622d) {
                    this.f14623a.a();
                    throw th;
                }
            }
        }
    }

    public t(Executor executor) {
        this.f14620b = executor;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        Runnable runnable = (Runnable) this.f14619a.poll();
        this.f14621c = runnable;
        if (runnable != null) {
            this.f14620b.execute(runnable);
        }
    }

    public void execute(Runnable runnable) {
        synchronized (this.f14622d) {
            try {
                this.f14619a.add(new a(this, runnable));
                if (this.f14621c == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean g0() {
        boolean z3;
        synchronized (this.f14622d) {
            z3 = !this.f14619a.isEmpty();
        }
        return z3;
    }
}
