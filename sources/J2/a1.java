package J2;

import F2.b;
import H2.e;
import H2.f;
import kotlin.jvm.internal.o;
import kotlin.uuid.Uuid;

public final class a1 implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final a1 f688a = new a1();

    /* renamed from: b  reason: collision with root package name */
    private static final f f689b = new C0338y0("kotlin.uuid.Uuid", e.i.f552a);

    private a1() {
    }

    public f a() {
        return f689b;
    }

    /* renamed from: f */
    public Uuid b(I2.e eVar) {
        o.e(eVar, "decoder");
        return Uuid.Companion.c(eVar.C());
    }

    /* renamed from: g */
    public void e(I2.f fVar, Uuid uuid) {
        o.e(fVar, "encoder");
        o.e(uuid, "value");
        fVar.F(uuid.toString());
    }
}
