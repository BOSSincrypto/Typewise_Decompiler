package androidx.room;

public final /* synthetic */ class x implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f6893a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ y f6894b;

    public /* synthetic */ x(Runnable runnable, y yVar) {
        this.f6893a = runnable;
        this.f6894b = yVar;
    }

    public final void run() {
        y.b(this.f6893a, this.f6894b);
    }
}
