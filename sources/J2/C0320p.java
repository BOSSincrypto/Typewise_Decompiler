package J2;

import F2.b;
import H2.e;
import H2.f;
import kotlin.jvm.internal.o;

/* renamed from: J2.p  reason: case insensitive filesystem */
public final class C0320p implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final C0320p f724a = new C0320p();

    /* renamed from: b  reason: collision with root package name */
    private static final f f725b = new C0338y0("kotlin.Char", e.c.f546a);

    private C0320p() {
    }

    public f a() {
        return f725b;
    }

    public /* bridge */ /* synthetic */ void e(I2.f fVar, Object obj) {
        g(fVar, ((Character) obj).charValue());
    }

    /* renamed from: f */
    public Character b(I2.e eVar) {
        o.e(eVar, "decoder");
        return Character.valueOf(eVar.l());
    }

    public void g(I2.f fVar, char c4) {
        o.e(fVar, "encoder");
        fVar.C(c4);
    }
}
