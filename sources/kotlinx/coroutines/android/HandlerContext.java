package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.C0747k;
import kotlinx.coroutines.K;
import kotlinx.coroutines.P;
import kotlinx.coroutines.Q;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.s0;
import l2.q;
import z2.d;

public final class HandlerContext extends d implements K {
    private volatile HandlerContext _immediate;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Handler f14023c;

    /* renamed from: d  reason: collision with root package name */
    private final String f14024d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f14025e;

    /* renamed from: f  reason: collision with root package name */
    private final HandlerContext f14026f;

    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0747k f14027a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HandlerContext f14028b;

        public a(C0747k kVar, HandlerContext handlerContext) {
            this.f14027a = kVar;
            this.f14028b = handlerContext;
        }

        public final void run() {
            this.f14027a.f(this.f14028b, q.f14567a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private HandlerContext(Handler handler, String str, boolean z3) {
        super((i) null);
        HandlerContext handlerContext = null;
        this.f14023c = handler;
        this.f14024d = str;
        this.f14025e = z3;
        this._immediate = z3 ? this : handlerContext;
        HandlerContext handlerContext2 = this._immediate;
        if (handlerContext2 == null) {
            handlerContext2 = new HandlerContext(handler, str, true);
            this._immediate = handlerContext2;
        }
        this.f14026f = handlerContext2;
    }

    private final void w0(CoroutineContext coroutineContext, Runnable runnable) {
        j0.c(coroutineContext, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        P.b().p0(coroutineContext, runnable);
    }

    /* access modifiers changed from: private */
    public static final void y0(HandlerContext handlerContext, Runnable runnable) {
        handlerContext.f14023c.removeCallbacks(runnable);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof HandlerContext) || ((HandlerContext) obj).f14023c != this.f14023c) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return System.identityHashCode(this.f14023c);
    }

    public void p0(CoroutineContext coroutineContext, Runnable runnable) {
        if (!this.f14023c.post(runnable)) {
            w0(coroutineContext, runnable);
        }
    }

    public boolean q0(CoroutineContext coroutineContext) {
        if (!this.f14025e || !o.a(Looper.myLooper(), this.f14023c.getLooper())) {
            return true;
        }
        return false;
    }

    public String toString() {
        String t02 = t0();
        if (t02 != null) {
            return t02;
        }
        String str = this.f14024d;
        if (str == null) {
            str = this.f14023c.toString();
        }
        if (!this.f14025e) {
            return str;
        }
        return str + ".immediate";
    }

    public Q v(long j4, Runnable runnable, CoroutineContext coroutineContext) {
        if (this.f14023c.postDelayed(runnable, d.e(j4, 4611686018427387903L))) {
            return new c(this, runnable);
        }
        w0(coroutineContext, runnable);
        return s0.f14230a;
    }

    /* renamed from: x0 */
    public HandlerContext s0() {
        return this.f14026f;
    }

    public void y(long j4, C0747k kVar) {
        a aVar = new a(kVar, this);
        if (this.f14023c.postDelayed(aVar, d.e(j4, 4611686018427387903L))) {
            kVar.j(new HandlerContext$scheduleResumeAfterDelay$1(this, aVar));
        } else {
            w0(kVar.getContext(), aVar);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HandlerContext(Handler handler, String str, int i4, i iVar) {
        this(handler, (i4 & 2) != 0 ? null : str);
    }

    public HandlerContext(Handler handler, String str) {
        this(handler, str, false);
    }
}
