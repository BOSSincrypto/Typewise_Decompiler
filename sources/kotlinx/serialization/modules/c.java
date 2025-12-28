package kotlinx.serialization.modules;

import F2.b;
import J2.C0313l0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.D;
import kotlin.jvm.internal.o;
import kotlinx.serialization.modules.a;
import u2.l;

public final class c implements d {

    /* renamed from: a  reason: collision with root package name */
    private final Map f14415a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map f14416b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Map f14417c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map f14418d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final Map f14419e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private boolean f14420f;

    public static /* synthetic */ void j(c cVar, A2.c cVar2, A2.c cVar3, b bVar, boolean z3, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            z3 = false;
        }
        cVar.i(cVar2, cVar3, bVar, z3);
    }

    public static /* synthetic */ void l(c cVar, A2.c cVar2, a aVar, boolean z3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            z3 = false;
        }
        cVar.k(cVar2, aVar, z3);
    }

    public void a(A2.c cVar, b bVar) {
        o.e(cVar, "kClass");
        o.e(bVar, "serializer");
        l(this, cVar, new a.C0204a(bVar), false, 4, (Object) null);
    }

    public void b(A2.c cVar, l lVar) {
        o.e(cVar, "kClass");
        o.e(lVar, "provider");
        l(this, cVar, new a.b(lVar), false, 4, (Object) null);
    }

    public void c(A2.c cVar, l lVar) {
        o.e(cVar, "baseClass");
        o.e(lVar, "defaultDeserializerProvider");
        g(cVar, lVar, false);
    }

    public void d(A2.c cVar, A2.c cVar2, b bVar) {
        o.e(cVar, "baseClass");
        o.e(cVar2, "actualClass");
        o.e(bVar, "actualSerializer");
        j(this, cVar, cVar2, bVar, false, 8, (Object) null);
    }

    public void e(A2.c cVar, l lVar) {
        o.e(cVar, "baseClass");
        o.e(lVar, "defaultSerializerProvider");
        h(cVar, lVar, false);
    }

    public final L2.b f() {
        return new b(this.f14415a, this.f14416b, this.f14417c, this.f14418d, this.f14419e, this.f14420f);
    }

    public final void g(A2.c cVar, l lVar, boolean z3) {
        o.e(cVar, "baseClass");
        o.e(lVar, "defaultDeserializerProvider");
        l lVar2 = (l) this.f14419e.get(cVar);
        if (lVar2 == null || o.a(lVar2, lVar) || z3) {
            this.f14419e.put(cVar, lVar);
            return;
        }
        throw new IllegalArgumentException("Default deserializers provider for " + cVar + " is already registered: " + lVar2);
    }

    public final void h(A2.c cVar, l lVar, boolean z3) {
        o.e(cVar, "baseClass");
        o.e(lVar, "defaultSerializerProvider");
        l lVar2 = (l) this.f14417c.get(cVar);
        if (lVar2 == null || o.a(lVar2, lVar) || z3) {
            this.f14417c.put(cVar, lVar);
            return;
        }
        throw new IllegalArgumentException("Default serializers provider for " + cVar + " is already registered: " + lVar2);
    }

    public final void i(A2.c cVar, A2.c cVar2, b bVar, boolean z3) {
        Object obj;
        o.e(cVar, "baseClass");
        o.e(cVar2, "concreteClass");
        o.e(bVar, "concreteSerializer");
        String b4 = bVar.a().b();
        Map map = this.f14416b;
        Object obj2 = map.get(cVar);
        if (obj2 == null) {
            obj2 = new HashMap();
            map.put(cVar, obj2);
        }
        Map map2 = (Map) obj2;
        b bVar2 = (b) map2.get(cVar2);
        Map map3 = this.f14418d;
        Object obj3 = map3.get(cVar);
        if (obj3 == null) {
            obj3 = new HashMap();
            map3.put(cVar, obj3);
        }
        Map map4 = (Map) obj3;
        if (z3) {
            if (bVar2 != null) {
                map4.remove(bVar2.a().b());
            }
            map2.put(cVar2, bVar);
            map4.put(b4, bVar);
            return;
        }
        if (bVar2 != null) {
            if (o.a(bVar2, bVar)) {
                b bVar3 = (b) map4.remove(bVar2.a().b());
            } else {
                throw new SerializerAlreadyRegisteredException(cVar, cVar2);
            }
        }
        b bVar4 = (b) map4.get(b4);
        if (bVar4 != null) {
            Object obj4 = this.f14416b.get(cVar);
            o.b(obj4);
            Iterator it = D.t((Map) obj4).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((Map.Entry) obj).getValue() == bVar4) {
                    break;
                }
            }
            throw new IllegalArgumentException("Multiple polymorphic serializers for base class '" + cVar + "' have the same serial name '" + b4 + "': '" + cVar2 + "' and '" + ((Map.Entry) obj) + '\'');
        }
        map2.put(cVar2, bVar);
        map4.put(b4, bVar);
    }

    public final void k(A2.c cVar, a aVar, boolean z3) {
        a aVar2;
        o.e(cVar, "forClass");
        o.e(aVar, "provider");
        if (z3 || (aVar2 = (a) this.f14415a.get(cVar)) == null || o.a(aVar2, aVar)) {
            this.f14415a.put(cVar, aVar);
            if (C0313l0.j(cVar)) {
                this.f14420f = true;
                return;
            }
            return;
        }
        throw new SerializerAlreadyRegisteredException("Contextual serializer or serializer provider for " + cVar + " already registered in this module");
    }
}
