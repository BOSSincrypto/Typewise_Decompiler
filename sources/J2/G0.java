package J2;

import F2.b;
import H2.e;
import H2.f;
import kotlin.jvm.internal.o;

public final class G0 implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final G0 f622a = new G0();

    /* renamed from: b  reason: collision with root package name */
    private static final f f623b = new C0338y0("kotlin.String", e.i.f552a);

    private G0() {
    }

    public f a() {
        return f623b;
    }

    /* renamed from: f */
    public String b(I2.e eVar) {
        o.e(eVar, "decoder");
        return eVar.C();
    }

    /* renamed from: g */
    public void e(I2.f fVar, String str) {
        o.e(fVar, "encoder");
        o.e(str, "value");
        fVar.F(str);
    }
}
