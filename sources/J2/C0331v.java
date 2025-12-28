package J2;

import C2.a;
import F2.b;
import H2.e;
import H2.f;
import kotlin.jvm.internal.o;

/* renamed from: J2.v  reason: case insensitive filesystem */
public final class C0331v implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final C0331v f748a = new C0331v();

    /* renamed from: b  reason: collision with root package name */
    private static final f f749b = new C0338y0("kotlin.time.Duration", e.i.f552a);

    private C0331v() {
    }

    public f a() {
        return f749b;
    }

    public /* bridge */ /* synthetic */ Object b(I2.e eVar) {
        return a.e(f(eVar));
    }

    public /* bridge */ /* synthetic */ void e(I2.f fVar, Object obj) {
        g(fVar, ((a) obj).F());
    }

    public long f(I2.e eVar) {
        o.e(eVar, "decoder");
        return a.f225b.c(eVar.C());
    }

    public void g(I2.f fVar, long j4) {
        o.e(fVar, "encoder");
        fVar.F(a.B(j4));
    }
}
