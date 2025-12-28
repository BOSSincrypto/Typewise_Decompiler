package c3;

import kotlin.jvm.internal.o;

public abstract class e implements u {

    /* renamed from: a  reason: collision with root package name */
    private final u f7656a;

    public e(u uVar) {
        o.e(uVar, "delegate");
        this.f7656a = uVar;
    }

    public void close() {
        this.f7656a.close();
    }

    public x d() {
        return this.f7656a.d();
    }

    public void flush() {
        this.f7656a.flush();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f7656a + ')';
    }

    public void z(C0500b bVar, long j4) {
        o.e(bVar, "source");
        this.f7656a.z(bVar, j4);
    }
}
