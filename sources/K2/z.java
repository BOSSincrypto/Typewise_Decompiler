package K2;

import F2.b;
import H2.f;
import H2.l;
import H2.m;
import I2.e;
import kotlin.jvm.internal.o;
import kotlinx.serialization.json.internal.JsonDecodingException;

public final class z implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final z f865a = new z();

    /* renamed from: b  reason: collision with root package name */
    private static final f f866b = l.e("kotlinx.serialization.json.JsonNull", m.b.f574a, new f[0], (u2.l) null, 8, (Object) null);

    private z() {
    }

    public f a() {
        return f866b;
    }

    /* renamed from: f */
    public y b(e eVar) {
        o.e(eVar, "decoder");
        q.g(eVar);
        if (!eVar.j()) {
            eVar.A();
            return y.INSTANCE;
        }
        throw new JsonDecodingException("Expected 'null' literal");
    }

    /* renamed from: g */
    public void e(I2.f fVar, y yVar) {
        o.e(fVar, "encoder");
        o.e(yVar, "value");
        q.h(fVar);
        fVar.i();
    }
}
