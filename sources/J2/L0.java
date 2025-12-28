package J2;

import F2.b;
import H2.a;
import H2.f;
import H2.l;
import I2.c;
import I2.d;
import I2.e;
import java.util.List;
import kotlin.Triple;
import kotlin.jvm.internal.o;
import kotlinx.serialization.SerializationException;
import l2.q;

public final class L0 implements b {

    /* renamed from: a  reason: collision with root package name */
    private final b f639a;

    /* renamed from: b  reason: collision with root package name */
    private final b f640b;

    /* renamed from: c  reason: collision with root package name */
    private final b f641c;

    /* renamed from: d  reason: collision with root package name */
    private final f f642d = l.c("kotlin.Triple", new f[0], new K0(this));

    public L0(b bVar, b bVar2, b bVar3) {
        o.e(bVar, "aSerializer");
        o.e(bVar2, "bSerializer");
        o.e(bVar3, "cSerializer");
        this.f639a = bVar;
        this.f640b = bVar2;
        this.f641c = bVar3;
    }

    private final Triple g(c cVar) {
        Object c4 = c.a.c(cVar, a(), 0, this.f639a, (Object) null, 8, (Object) null);
        Object c5 = c.a.c(cVar, a(), 1, this.f640b, (Object) null, 8, (Object) null);
        Object c6 = c.a.c(cVar, a(), 2, this.f641c, (Object) null, 8, (Object) null);
        cVar.c(a());
        return new Triple(c4, c5, c6);
    }

    private final Triple h(c cVar) {
        Object a4 = M0.f645a;
        Object a5 = M0.f645a;
        Object a6 = M0.f645a;
        while (true) {
            int e4 = cVar.e(a());
            if (e4 == -1) {
                cVar.c(a());
                if (a4 == M0.f645a) {
                    throw new SerializationException("Element 'first' is missing");
                } else if (a5 == M0.f645a) {
                    throw new SerializationException("Element 'second' is missing");
                } else if (a6 != M0.f645a) {
                    return new Triple(a4, a5, a6);
                } else {
                    throw new SerializationException("Element 'third' is missing");
                }
            } else if (e4 == 0) {
                a4 = c.a.c(cVar, a(), 0, this.f639a, (Object) null, 8, (Object) null);
            } else if (e4 == 1) {
                a5 = c.a.c(cVar, a(), 1, this.f640b, (Object) null, 8, (Object) null);
            } else if (e4 == 2) {
                a6 = c.a.c(cVar, a(), 2, this.f641c, (Object) null, 8, (Object) null);
            } else {
                throw new SerializationException("Unexpected index " + e4);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final q i(L0 l02, a aVar) {
        o.e(aVar, "$this$buildClassSerialDescriptor");
        a aVar2 = aVar;
        a.b(aVar2, "first", l02.f639a.a(), (List) null, false, 12, (Object) null);
        a.b(aVar2, "second", l02.f640b.a(), (List) null, false, 12, (Object) null);
        a.b(aVar, "third", l02.f641c.a(), (List) null, false, 12, (Object) null);
        return q.f14567a;
    }

    public f a() {
        return this.f642d;
    }

    /* renamed from: j */
    public Triple b(e eVar) {
        o.e(eVar, "decoder");
        c d4 = eVar.d(a());
        if (d4.p()) {
            return g(d4);
        }
        return h(d4);
    }

    /* renamed from: k */
    public void e(I2.f fVar, Triple triple) {
        o.e(fVar, "encoder");
        o.e(triple, "value");
        d d4 = fVar.d(a());
        d4.f(a(), 0, this.f639a, triple.getFirst());
        d4.f(a(), 1, this.f640b, triple.getSecond());
        d4.f(a(), 2, this.f641c, triple.getThird());
        d4.c(a());
    }
}
