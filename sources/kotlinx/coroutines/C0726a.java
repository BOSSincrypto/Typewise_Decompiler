package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.c;
import u2.l;
import u2.p;

/* renamed from: kotlinx.coroutines.a  reason: case insensitive filesystem */
public abstract class C0726a extends m0 implements g0, c, D {

    /* renamed from: b  reason: collision with root package name */
    private final CoroutineContext f14021b;

    public C0726a(CoroutineContext coroutineContext, boolean z3, boolean z4) {
        super(z4);
        if (z3) {
            Z((g0) coroutineContext.get(g0.f14139t));
        }
        this.f14021b = coroutineContext.plus(this);
    }

    /* access modifiers changed from: protected */
    public void G0(Object obj) {
        z(obj);
    }

    /* access modifiers changed from: protected */
    public String H() {
        return F.a(this) + " was cancelled";
    }

    /* access modifiers changed from: protected */
    public void H0(Throwable th, boolean z3) {
    }

    /* access modifiers changed from: protected */
    public void I0(Object obj) {
    }

    public final void J0(CoroutineStart coroutineStart, Object obj, p pVar) {
        coroutineStart.invoke(pVar, obj, this);
    }

    public final void Y(Throwable th) {
        B.a(this.f14021b, th);
    }

    public boolean a() {
        return super.a();
    }

    public CoroutineContext g() {
        return this.f14021b;
    }

    public final CoroutineContext getContext() {
        return this.f14021b;
    }

    public String h0() {
        String b4 = CoroutineContextKt.b(this.f14021b);
        if (b4 == null) {
            return super.h0();
        }
        return '\"' + b4 + "\":" + super.h0();
    }

    /* access modifiers changed from: protected */
    public final void n0(Object obj) {
        if (obj instanceof C0757v) {
            C0757v vVar = (C0757v) obj;
            H0(vVar.f14316a, vVar.a());
            return;
        }
        I0(obj);
    }

    public final void resumeWith(Object obj) {
        Object f02 = f0(C0760y.d(obj, (l) null, 1, (Object) null));
        if (f02 != n0.f14219b) {
            G0(f02);
        }
    }
}
