package J2;

import F2.b;
import H2.f;
import I2.c;
import I2.d;
import I2.e;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlinx.serialization.SerializationException;

public abstract class M implements b {

    /* renamed from: a  reason: collision with root package name */
    private final b f643a;

    /* renamed from: b  reason: collision with root package name */
    private final b f644b;

    public /* synthetic */ M(b bVar, b bVar2, i iVar) {
        this(bVar, bVar2);
    }

    public Object b(e eVar) {
        Object obj;
        o.e(eVar, "decoder");
        f a4 = a();
        c d4 = eVar.d(a4);
        if (d4.p()) {
            c cVar = d4;
            obj = j(c.a.c(cVar, a(), 0, g(), (Object) null, 8, (Object) null), c.a.c(cVar, a(), 1, i(), (Object) null, 8, (Object) null));
        } else {
            Object a5 = M0.f645a;
            Object a6 = M0.f645a;
            while (true) {
                int e4 = d4.e(a());
                if (e4 != -1) {
                    if (e4 == 0) {
                        a5 = c.a.c(d4, a(), 0, g(), (Object) null, 8, (Object) null);
                    } else if (e4 == 1) {
                        a6 = c.a.c(d4, a(), 1, i(), (Object) null, 8, (Object) null);
                    } else {
                        throw new SerializationException("Invalid index: " + e4);
                    }
                } else if (a5 == M0.f645a) {
                    throw new SerializationException("Element 'key' is missing");
                } else if (a6 != M0.f645a) {
                    obj = j(a5, a6);
                } else {
                    throw new SerializationException("Element 'value' is missing");
                }
            }
        }
        d4.c(a4);
        return obj;
    }

    public void e(I2.f fVar, Object obj) {
        o.e(fVar, "encoder");
        d d4 = fVar.d(a());
        d4.f(a(), 0, this.f643a, f(obj));
        d4.f(a(), 1, this.f644b, h(obj));
        d4.c(a());
    }

    /* access modifiers changed from: protected */
    public abstract Object f(Object obj);

    /* access modifiers changed from: protected */
    public final b g() {
        return this.f643a;
    }

    /* access modifiers changed from: protected */
    public abstract Object h(Object obj);

    /* access modifiers changed from: protected */
    public final b i() {
        return this.f644b;
    }

    /* access modifiers changed from: protected */
    public abstract Object j(Object obj, Object obj2);

    private M(b bVar, b bVar2) {
        this.f643a = bVar;
        this.f644b = bVar2;
    }
}
