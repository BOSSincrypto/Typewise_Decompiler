package kotlinx.coroutines;

import l2.q;
import u2.l;

/* renamed from: kotlinx.coroutines.d0  reason: case insensitive filesystem */
final class C0733d0 extends C0740i {

    /* renamed from: a  reason: collision with root package name */
    private final l f14077a;

    public C0733d0(l lVar) {
        this.f14077a = lVar;
    }

    public void a(Throwable th) {
        this.f14077a.invoke(th);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return q.f14567a;
    }

    public String toString() {
        return "InvokeOnCancel[" + F.a(this.f14077a) + '@' + F.b(this) + ']';
    }
}
