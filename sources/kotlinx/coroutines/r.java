package kotlinx.coroutines;

import l2.q;

public final class r extends h0 implements C0753q {

    /* renamed from: e  reason: collision with root package name */
    public final C0754s f14229e;

    public r(C0754s sVar) {
        this.f14229e = sVar;
    }

    public void R(Throwable th) {
        this.f14229e.b0(S());
    }

    public g0 getParent() {
        return S();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        R((Throwable) obj);
        return q.f14567a;
    }

    public boolean r(Throwable th) {
        return S().I(th);
    }
}
