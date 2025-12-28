package c3;

import kotlin.jvm.internal.o;

public abstract class f implements w {

    /* renamed from: a  reason: collision with root package name */
    private final w f7657a;

    public f(w wVar) {
        o.e(wVar, "delegate");
        this.f7657a = wVar;
    }

    public long N(C0500b bVar, long j4) {
        o.e(bVar, "sink");
        return this.f7657a.N(bVar, j4);
    }

    public final w a() {
        return this.f7657a;
    }

    public void close() {
        this.f7657a.close();
    }

    public x d() {
        return this.f7657a.d();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f7657a + ')';
    }
}
