package kotlinx.coroutines.internal;

import kotlin.jvm.internal.o;

/* renamed from: kotlinx.coroutines.internal.b  reason: case insensitive filesystem */
public abstract class C0742b {

    /* renamed from: a  reason: collision with root package name */
    public C0744d f14166a;

    public abstract void a(C0744d dVar, Object obj);

    public final C0744d b() {
        C0744d dVar = this.f14166a;
        if (dVar != null) {
            return dVar;
        }
        o.p("atomicOp");
        return null;
    }

    public abstract Object c(C0744d dVar);

    public final void d(C0744d dVar) {
        this.f14166a = dVar;
    }
}
