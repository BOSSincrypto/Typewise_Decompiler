package F2;

import A2.c;
import H2.a;
import H2.b;
import H2.d;
import H2.l;
import H2.m;
import J2.C0292b;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.u;
import l2.q;

public final class f extends C0292b {

    /* renamed from: a  reason: collision with root package name */
    private final c f416a;

    /* renamed from: b  reason: collision with root package name */
    private List f417b = C0718m.j();

    /* renamed from: c  reason: collision with root package name */
    private final l2.f f418c = kotlin.c.a(LazyThreadSafetyMode.PUBLICATION, new d(this));

    public f(c cVar) {
        o.e(cVar, "baseClass");
        this.f416a = cVar;
    }

    /* access modifiers changed from: private */
    public static final H2.f m(f fVar) {
        return b.c(l.d("kotlinx.serialization.Polymorphic", d.a.f542a, new H2.f[0], new e(fVar)), fVar.j());
    }

    /* access modifiers changed from: private */
    public static final q n(f fVar, a aVar) {
        o.e(aVar, "$this$buildSerialDescriptor");
        a.b(aVar, "type", G2.a.E(u.f13912a).a(), (List) null, false, 12, (Object) null);
        a.b(aVar, "value", l.e("kotlinx.serialization.Polymorphic<" + fVar.j().b() + '>', m.a.f573a, new H2.f[0], (u2.l) null, 8, (Object) null), (List) null, false, 12, (Object) null);
        aVar.h(fVar.f417b);
        return q.f14567a;
    }

    public H2.f a() {
        return (H2.f) this.f418c.getValue();
    }

    public c j() {
        return this.f416a;
    }

    public String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + j() + ')';
    }
}
