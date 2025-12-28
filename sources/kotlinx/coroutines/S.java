package kotlinx.coroutines;

import l2.q;

final class S extends C0740i {

    /* renamed from: a  reason: collision with root package name */
    private final Q f14006a;

    public S(Q q4) {
        this.f14006a = q4;
    }

    public void a(Throwable th) {
        this.f14006a.d();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return q.f14567a;
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f14006a + ']';
    }
}
