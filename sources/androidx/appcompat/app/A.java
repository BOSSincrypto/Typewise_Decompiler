package androidx.appcompat.app;

import androidx.appcompat.app.B;

public final /* synthetic */ class A implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ B.a f2422a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f2423b;

    public /* synthetic */ A(B.a aVar, Runnable runnable) {
        this.f2422a = aVar;
        this.f2423b = runnable;
    }

    public final void run() {
        this.f2422a.b(this.f2423b);
    }
}
