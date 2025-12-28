package retrofit2;

import retrofit2.C0885l;

/* renamed from: retrofit2.n  reason: case insensitive filesystem */
public final /* synthetic */ class C0887n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0885l.b.a f16221a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0879f f16222b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Throwable f16223c;

    public /* synthetic */ C0887n(C0885l.b.a aVar, C0879f fVar, Throwable th) {
        this.f16221a = aVar;
        this.f16222b = fVar;
        this.f16223c = th;
    }

    public final void run() {
        this.f16221a.e(this.f16222b, this.f16223c);
    }
}
