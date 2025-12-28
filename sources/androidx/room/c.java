package androidx.room;

import Z.g;
import Z.h;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import l2.q;
import u2.l;

public final class c {

    /* renamed from: m  reason: collision with root package name */
    public static final a f6774m = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    public h f6775a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f6776b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    private Runnable f6777c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f6778d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private long f6779e;

    /* renamed from: f  reason: collision with root package name */
    private final Executor f6780f;

    /* renamed from: g  reason: collision with root package name */
    private int f6781g;

    /* renamed from: h  reason: collision with root package name */
    private long f6782h;

    /* renamed from: i  reason: collision with root package name */
    private g f6783i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f6784j;

    /* renamed from: k  reason: collision with root package name */
    private final Runnable f6785k;

    /* renamed from: l  reason: collision with root package name */
    private final Runnable f6786l;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        private a() {
        }
    }

    public c(long j4, TimeUnit timeUnit, Executor executor) {
        o.e(timeUnit, "autoCloseTimeUnit");
        o.e(executor, "autoCloseExecutor");
        this.f6779e = timeUnit.toMillis(j4);
        this.f6780f = executor;
        this.f6782h = SystemClock.uptimeMillis();
        this.f6785k = new a(this);
        this.f6786l = new b(this);
    }

    /* access modifiers changed from: private */
    public static final void c(c cVar) {
        q qVar;
        o.e(cVar, "this$0");
        synchronized (cVar.f6778d) {
            try {
                if (SystemClock.uptimeMillis() - cVar.f6782h >= cVar.f6779e) {
                    if (cVar.f6781g == 0) {
                        Runnable runnable = cVar.f6777c;
                        if (runnable != null) {
                            runnable.run();
                            qVar = q.f14567a;
                        } else {
                            qVar = null;
                        }
                        if (qVar != null) {
                            g gVar = cVar.f6783i;
                            if (gVar != null && gVar.isOpen()) {
                                gVar.close();
                            }
                            cVar.f6783i = null;
                            q qVar2 = q.f14567a;
                            return;
                        }
                        throw new IllegalStateException("onAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void f(c cVar) {
        o.e(cVar, "this$0");
        cVar.f6780f.execute(cVar.f6786l);
    }

    public final void d() {
        synchronized (this.f6778d) {
            try {
                this.f6784j = true;
                g gVar = this.f6783i;
                if (gVar != null) {
                    gVar.close();
                }
                this.f6783i = null;
                q qVar = q.f14567a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        synchronized (this.f6778d) {
            try {
                int i4 = this.f6781g;
                if (i4 > 0) {
                    int i5 = i4 - 1;
                    this.f6781g = i5;
                    if (i5 == 0) {
                        if (this.f6783i != null) {
                            this.f6776b.postDelayed(this.f6785k, this.f6779e);
                        } else {
                            return;
                        }
                    }
                    q qVar = q.f14567a;
                    return;
                }
                throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object g(l lVar) {
        o.e(lVar, "block");
        try {
            return lVar.invoke(j());
        } finally {
            e();
        }
    }

    public final g h() {
        return this.f6783i;
    }

    public final h i() {
        h hVar = this.f6775a;
        if (hVar != null) {
            return hVar;
        }
        o.p("delegateOpenHelper");
        return null;
    }

    public final g j() {
        synchronized (this.f6778d) {
            this.f6776b.removeCallbacks(this.f6785k);
            this.f6781g++;
            if (!this.f6784j) {
                g gVar = this.f6783i;
                if (gVar != null && gVar.isOpen()) {
                    return gVar;
                }
                g i02 = i().i0();
                this.f6783i = i02;
                return i02;
            }
            throw new IllegalStateException("Attempting to open already closed database.");
        }
    }

    public final void k(h hVar) {
        o.e(hVar, "delegateOpenHelper");
        n(hVar);
    }

    public final boolean l() {
        return !this.f6784j;
    }

    public final void m(Runnable runnable) {
        o.e(runnable, "onAutoClose");
        this.f6777c = runnable;
    }

    public final void n(h hVar) {
        o.e(hVar, "<set-?>");
        this.f6775a = hVar;
    }
}
