package J2;

import F2.b;
import H2.e;
import H2.f;
import kotlin.jvm.internal.o;

public final class E implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final E f616a = new E();

    /* renamed from: b  reason: collision with root package name */
    private static final f f617b = new C0338y0("kotlin.Float", e.C0004e.f548a);

    private E() {
    }

    public f a() {
        return f617b;
    }

    public /* bridge */ /* synthetic */ void e(I2.f fVar, Object obj) {
        g(fVar, ((Number) obj).floatValue());
    }

    /* renamed from: f */
    public Float b(I2.e eVar) {
        o.e(eVar, "decoder");
        return Float.valueOf(eVar.D());
    }

    public void g(I2.f fVar, float f4) {
        o.e(fVar, "encoder");
        fVar.y(f4);
    }
}
