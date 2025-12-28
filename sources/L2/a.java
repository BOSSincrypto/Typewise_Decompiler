package L2;

import A2.c;
import F2.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.o;
import l2.g;
import u2.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final c f880a;

    /* renamed from: b  reason: collision with root package name */
    private final b f881b;

    /* renamed from: c  reason: collision with root package name */
    private final List f882c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private l f883d;

    /* renamed from: e  reason: collision with root package name */
    private l f884e;

    public a(c cVar, b bVar) {
        o.e(cVar, "baseClass");
        this.f880a = cVar;
        this.f881b = bVar;
    }

    public final void a(kotlinx.serialization.modules.c cVar) {
        o.e(cVar, "builder");
        b bVar = this.f881b;
        if (bVar != null) {
            c cVar2 = this.f880a;
            kotlinx.serialization.modules.c.j(cVar, cVar2, cVar2, bVar, false, 8, (Object) null);
        }
        for (Pair pair : this.f882c) {
            c cVar3 = (c) pair.component1();
            b bVar2 = (b) pair.component2();
            c cVar4 = this.f880a;
            o.c(cVar3, "null cannot be cast to non-null type kotlin.reflect.KClass<Base of kotlinx.serialization.modules.PolymorphicModuleBuilder>");
            o.c(bVar2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            kotlinx.serialization.modules.c.j(cVar, cVar4, cVar3, bVar2, false, 8, (Object) null);
        }
        l lVar = this.f883d;
        if (lVar != null) {
            cVar.h(this.f880a, lVar, false);
        }
        l lVar2 = this.f884e;
        if (lVar2 != null) {
            cVar.g(this.f880a, lVar2, false);
        }
    }

    public final void b(c cVar, b bVar) {
        o.e(cVar, "subclass");
        o.e(bVar, "serializer");
        this.f882c.add(g.a(cVar, bVar));
    }
}
