package J2;

import F2.a;
import F2.b;
import F2.g;
import F2.n;
import H2.f;
import I2.c;
import I2.d;
import I2.e;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.o;
import kotlinx.serialization.SerializationException;

/* renamed from: J2.b  reason: case insensitive filesystem */
public abstract class C0292b implements b {
    /* access modifiers changed from: private */
    public final Object g(c cVar) {
        return c.a.c(cVar, a(), 1, g.a(this, cVar, cVar.z(a(), 0)), (Object) null, 8, (Object) null);
    }

    public final Object b(e eVar) {
        Object obj;
        o.e(eVar, "decoder");
        f a4 = a();
        c d4 = eVar.d(a4);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        if (d4.p()) {
            obj = g(d4);
        } else {
            obj = null;
            while (true) {
                int e4 = d4.e(a());
                if (e4 != -1) {
                    if (e4 == 0) {
                        ref$ObjectRef.element = d4.z(a(), e4);
                    } else if (e4 != 1) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Invalid index in polymorphic deserialization of ");
                        String str = (String) ref$ObjectRef.element;
                        if (str == null) {
                            str = "unknown class";
                        }
                        sb.append(str);
                        sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                        sb.append(e4);
                        throw new SerializationException(sb.toString());
                    } else {
                        T t4 = ref$ObjectRef.element;
                        if (t4 != null) {
                            ref$ObjectRef.element = t4;
                            a a5 = g.a(this, d4, (String) t4);
                            obj = c.a.c(d4, a(), e4, a5, (Object) null, 8, (Object) null);
                        } else {
                            throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                        }
                    }
                } else if (obj != null) {
                    o.c(obj, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer");
                } else {
                    throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) ref$ObjectRef.element)).toString());
                }
            }
        }
        d4.c(a4);
        return obj;
    }

    public final void e(I2.f fVar, Object obj) {
        o.e(fVar, "encoder");
        o.e(obj, "value");
        n b4 = g.b(this, fVar, obj);
        f a4 = a();
        d d4 = fVar.d(a4);
        d4.p(a(), 0, b4.a().b());
        f a5 = a();
        o.c(b4, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        d4.f(a5, 1, b4, obj);
        d4.c(a4);
    }

    public a h(c cVar, String str) {
        o.e(cVar, "decoder");
        return cVar.a().d(j(), str);
    }

    public n i(I2.f fVar, Object obj) {
        o.e(fVar, "encoder");
        o.e(obj, "value");
        return fVar.a().e(j(), obj);
    }

    public abstract A2.c j();
}
