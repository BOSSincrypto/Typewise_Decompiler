package kotlinx.serialization.modules;

import A2.c;
import F2.n;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.v;
import kotlinx.serialization.modules.a;
import u2.l;

public final class b extends L2.b {

    /* renamed from: a  reason: collision with root package name */
    private final Map f14409a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f14410b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f14411c;

    /* renamed from: d  reason: collision with root package name */
    private final Map f14412d;

    /* renamed from: e  reason: collision with root package name */
    private final Map f14413e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f14414f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Map map, Map map2, Map map3, Map map4, Map map5, boolean z3) {
        super((i) null);
        o.e(map, "class2ContextualFactory");
        o.e(map2, "polyBase2Serializers");
        o.e(map3, "polyBase2DefaultSerializerProvider");
        o.e(map4, "polyBase2NamedSerializers");
        o.e(map5, "polyBase2DefaultDeserializerProvider");
        this.f14409a = map;
        this.f14410b = map2;
        this.f14411c = map3;
        this.f14412d = map4;
        this.f14413e = map5;
        this.f14414f = z3;
    }

    public void a(d dVar) {
        o.e(dVar, "collector");
        for (Map.Entry entry : this.f14409a.entrySet()) {
            c cVar = (c) entry.getKey();
            a aVar = (a) entry.getValue();
            if (aVar instanceof a.C0204a) {
                o.c(cVar, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                F2.b b4 = ((a.C0204a) aVar).b();
                o.c(b4, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                dVar.a(cVar, b4);
            } else if (aVar instanceof a.b) {
                dVar.b(cVar, ((a.b) aVar).b());
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        for (Map.Entry entry2 : this.f14410b.entrySet()) {
            c cVar2 = (c) entry2.getKey();
            for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                c cVar3 = (c) entry3.getKey();
                F2.b bVar = (F2.b) entry3.getValue();
                o.c(cVar2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                o.c(cVar3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                o.c(bVar, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                dVar.d(cVar2, cVar3, bVar);
            }
        }
        for (Map.Entry entry4 : this.f14411c.entrySet()) {
            c cVar4 = (c) entry4.getKey();
            l lVar = (l) entry4.getValue();
            o.c(cVar4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            o.c(lVar, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"value\")] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>");
            dVar.e(cVar4, (l) v.c(lVar, 1));
        }
        for (Map.Entry entry5 : this.f14413e.entrySet()) {
            c cVar5 = (c) entry5.getKey();
            l lVar2 = (l) entry5.getValue();
            o.c(cVar5, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            o.c(lVar2, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"className\")] kotlin.String?, kotlinx.serialization.DeserializationStrategy<kotlin.Any>?>");
            dVar.c(cVar5, (l) v.c(lVar2, 1));
        }
    }

    public F2.b b(c cVar, List list) {
        F2.b bVar;
        o.e(cVar, "kClass");
        o.e(list, "typeArgumentsSerializers");
        a aVar = (a) this.f14409a.get(cVar);
        if (aVar != null) {
            bVar = aVar.a(list);
        } else {
            bVar = null;
        }
        if (bVar instanceof F2.b) {
            return bVar;
        }
        return null;
    }

    public F2.a d(c cVar, String str) {
        F2.b bVar;
        l lVar;
        o.e(cVar, "baseClass");
        Map map = (Map) this.f14412d.get(cVar);
        if (map != null) {
            bVar = (F2.b) map.get(str);
        } else {
            bVar = null;
        }
        if (!(bVar instanceof F2.b)) {
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        Object obj = this.f14413e.get(cVar);
        if (v.g(obj, 1)) {
            lVar = (l) obj;
        } else {
            lVar = null;
        }
        if (lVar != null) {
            return (F2.a) lVar.invoke(str);
        }
        return null;
    }

    public n e(c cVar, Object obj) {
        F2.b bVar;
        l lVar;
        o.e(cVar, "baseClass");
        o.e(obj, "value");
        if (!cVar.a(obj)) {
            return null;
        }
        Map map = (Map) this.f14410b.get(cVar);
        if (map != null) {
            bVar = (F2.b) map.get(r.b(obj.getClass()));
        } else {
            bVar = null;
        }
        if (!(bVar instanceof n)) {
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        Object obj2 = this.f14411c.get(cVar);
        if (v.g(obj2, 1)) {
            lVar = (l) obj2;
        } else {
            lVar = null;
        }
        if (lVar != null) {
            return (n) lVar.invoke(obj);
        }
        return null;
    }
}
