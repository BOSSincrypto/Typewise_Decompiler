package K2;

import F2.b;
import H2.a;
import H2.d;
import H2.f;
import H2.l;
import I2.e;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.o;
import l2.q;

public final class p implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final p f856a = new p();

    /* renamed from: b  reason: collision with root package name */
    private static final f f857b = l.d("kotlinx.serialization.json.JsonElement", d.b.f543a, new f[0], new j());

    private p() {
    }

    /* access modifiers changed from: private */
    public static final q l(a aVar) {
        o.e(aVar, "$this$buildSerialDescriptor");
        a aVar2 = aVar;
        a.b(aVar2, "JsonPrimitive", q.f(new k()), (List) null, false, 12, (Object) null);
        a.b(aVar2, "JsonNull", q.f(new l()), (List) null, false, 12, (Object) null);
        a.b(aVar2, "JsonLiteral", q.f(new m()), (List) null, false, 12, (Object) null);
        a.b(aVar2, "JsonObject", q.f(new n()), (List) null, false, 12, (Object) null);
        a.b(aVar2, "JsonArray", q.f(new o()), (List) null, false, 12, (Object) null);
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public static final f m() {
        return E.f810a.a();
    }

    /* access modifiers changed from: private */
    public static final f n() {
        return z.f865a.a();
    }

    /* access modifiers changed from: private */
    public static final f o() {
        return v.f862a.a();
    }

    /* access modifiers changed from: private */
    public static final f p() {
        return C.f805a.a();
    }

    /* access modifiers changed from: private */
    public static final f q() {
        return C0343c.f817a.a();
    }

    public f a() {
        return f857b;
    }

    /* renamed from: r */
    public h b(e eVar) {
        o.e(eVar, "decoder");
        return q.d(eVar).s();
    }

    /* renamed from: s */
    public void e(I2.f fVar, h hVar) {
        o.e(fVar, "encoder");
        o.e(hVar, "value");
        q.h(fVar);
        if (hVar instanceof D) {
            fVar.k(E.f810a, hVar);
        } else if (hVar instanceof B) {
            fVar.k(C.f805a, hVar);
        } else if (hVar instanceof C0342b) {
            fVar.k(C0343c.f817a, hVar);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
