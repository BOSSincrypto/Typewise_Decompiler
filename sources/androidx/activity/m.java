package androidx.activity;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.o;
import l2.q;
import u2.C0906a;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f2380a;

    /* renamed from: b  reason: collision with root package name */
    private final C0906a f2381b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f2382c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private int f2383d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f2384e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f2385f;

    /* renamed from: g  reason: collision with root package name */
    private final List f2386g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private final Runnable f2387h = new l(this);

    public m(Executor executor, C0906a aVar) {
        o.e(executor, "executor");
        o.e(aVar, "reportFullyDrawn");
        this.f2380a = executor;
        this.f2381b = aVar;
    }

    /* access modifiers changed from: private */
    public static final void d(m mVar) {
        o.e(mVar, "this$0");
        synchronized (mVar.f2382c) {
            try {
                mVar.f2384e = false;
                if (mVar.f2383d == 0 && !mVar.f2385f) {
                    mVar.f2381b.invoke();
                    mVar.b();
                }
                q qVar = q.f14567a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.f2382c) {
            try {
                this.f2385f = true;
                for (C0906a invoke : this.f2386g) {
                    invoke.invoke();
                }
                this.f2386g.clear();
                q qVar = q.f14567a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c() {
        boolean z3;
        synchronized (this.f2382c) {
            z3 = this.f2385f;
        }
        return z3;
    }
}
