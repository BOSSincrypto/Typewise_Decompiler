package J2;

import F2.b;
import H2.a;
import H2.l;
import H2.n;
import I2.e;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.c;
import kotlin.collections.C0713h;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.o;
import kotlinx.serialization.SerializationException;
import l2.f;
import l2.q;

/* renamed from: J2.i0  reason: case insensitive filesystem */
public final class C0307i0 implements b {

    /* renamed from: a  reason: collision with root package name */
    private final Object f708a;

    /* renamed from: b  reason: collision with root package name */
    private List f709b;

    /* renamed from: c  reason: collision with root package name */
    private final f f710c;

    public C0307i0(String str, Object obj) {
        o.e(str, "serialName");
        o.e(obj, "objectInstance");
        this.f708a = obj;
        this.f709b = C0718m.j();
        this.f710c = c.a(LazyThreadSafetyMode.PUBLICATION, new C0303g0(str, this));
    }

    /* access modifiers changed from: private */
    public static final H2.f h(String str, C0307i0 i0Var) {
        return l.d(str, n.d.f578a, new H2.f[0], new C0305h0(i0Var));
    }

    /* access modifiers changed from: private */
    public static final q i(C0307i0 i0Var, a aVar) {
        o.e(aVar, "$this$buildSerialDescriptor");
        aVar.h(i0Var.f709b);
        return q.f14567a;
    }

    public H2.f a() {
        return (H2.f) this.f710c.getValue();
    }

    public Object b(e eVar) {
        int e4;
        o.e(eVar, "decoder");
        H2.f a4 = a();
        I2.c d4 = eVar.d(a4);
        if (!d4.p() && (e4 = d4.e(a())) != -1) {
            throw new SerializationException("Unexpected index " + e4);
        }
        q qVar = q.f14567a;
        d4.c(a4);
        return this.f708a;
    }

    public void e(I2.f fVar, Object obj) {
        o.e(fVar, "encoder");
        o.e(obj, "value");
        fVar.d(a()).c(a());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0307i0(String str, Object obj, Annotation[] annotationArr) {
        this(str, obj);
        o.e(str, "serialName");
        o.e(obj, "objectInstance");
        o.e(annotationArr, "classAnnotations");
        this.f709b = C0713h.c(annotationArr);
    }
}
