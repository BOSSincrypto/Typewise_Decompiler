package F2;

import A2.c;
import H2.d;
import H2.l;
import H2.m;
import J2.C0292b;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.C0713h;
import kotlin.collections.C0718m;
import kotlin.collections.D;
import kotlin.collections.x;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.u;
import l2.f;
import l2.q;

public final class k extends C0292b {

    /* renamed from: a  reason: collision with root package name */
    private final c f423a;

    /* renamed from: b  reason: collision with root package name */
    private List f424b;

    /* renamed from: c  reason: collision with root package name */
    private final f f425c;

    /* renamed from: d  reason: collision with root package name */
    private final Map f426d;

    /* renamed from: e  reason: collision with root package name */
    private final Map f427e;

    public static final class a implements x {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Iterable f428a;

        public a(Iterable iterable) {
            this.f428a = iterable;
        }

        public Object a(Object obj) {
            return ((b) ((Map.Entry) obj).getValue()).a().b();
        }

        public Iterator b() {
            return this.f428a.iterator();
        }
    }

    public k(String str, c cVar, c[] cVarArr, b[] bVarArr) {
        o.e(str, "serialName");
        o.e(cVar, "baseClass");
        o.e(cVarArr, "subclasses");
        o.e(bVarArr, "subclassSerializers");
        this.f423a = cVar;
        this.f424b = C0718m.j();
        this.f425c = kotlin.c.a(LazyThreadSafetyMode.PUBLICATION, new h(str, this));
        if (cVarArr.length == bVarArr.length) {
            Map o4 = D.o(C0713h.g0(cVarArr, bVarArr));
            this.f426d = o4;
            a aVar = new a(o4.entrySet());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator b4 = aVar.b();
            while (b4.hasNext()) {
                Object next = b4.next();
                Object a4 = aVar.a(next);
                Object obj = linkedHashMap.get(a4);
                if (obj == null) {
                    linkedHashMap.containsKey(a4);
                }
                Map.Entry entry = (Map.Entry) next;
                Map.Entry entry2 = (Map.Entry) obj;
                String str2 = (String) a4;
                if (entry2 == null) {
                    linkedHashMap.put(a4, entry);
                } else {
                    throw new IllegalStateException(("Multiple sealed subclasses of '" + j() + "' have the same serial name '" + str2 + "': '" + entry2.getKey() + "', '" + entry.getKey() + '\'').toString());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(D.e(linkedHashMap.size()));
            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                linkedHashMap2.put(entry3.getKey(), (b) ((Map.Entry) entry3.getValue()).getValue());
            }
            this.f427e = linkedHashMap2;
            return;
        }
        throw new IllegalArgumentException("All subclasses of sealed class " + j().b() + " should be marked @Serializable");
    }

    /* access modifiers changed from: private */
    public static final H2.f n(String str, k kVar) {
        return l.d(str, d.b.f543a, new H2.f[0], new i(kVar));
    }

    /* access modifiers changed from: private */
    public static final q o(k kVar, H2.a aVar) {
        o.e(aVar, "$this$buildSerialDescriptor");
        H2.a.b(aVar, "type", G2.a.E(u.f13912a).a(), (List) null, false, 12, (Object) null);
        H2.a.b(aVar, "value", l.d("kotlinx.serialization.Sealed<" + kVar.j().b() + '>', m.a.f573a, new H2.f[0], new j(kVar)), (List) null, false, 12, (Object) null);
        aVar.h(kVar.f424b);
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public static final q p(k kVar, H2.a aVar) {
        o.e(aVar, "$this$buildSerialDescriptor");
        for (Map.Entry entry : kVar.f427e.entrySet()) {
            H2.a.b(aVar, (String) entry.getKey(), ((b) entry.getValue()).a(), (List) null, false, 12, (Object) null);
        }
        return q.f14567a;
    }

    public H2.f a() {
        return (H2.f) this.f425c.getValue();
    }

    public a h(I2.c cVar, String str) {
        o.e(cVar, "decoder");
        b bVar = (b) this.f427e.get(str);
        if (bVar != null) {
            return bVar;
        }
        return super.h(cVar, str);
    }

    public n i(I2.f fVar, Object obj) {
        o.e(fVar, "encoder");
        o.e(obj, "value");
        n nVar = (b) this.f426d.get(r.b(obj.getClass()));
        if (nVar == null) {
            nVar = super.i(fVar, obj);
        }
        if (nVar != null) {
            return nVar;
        }
        return null;
    }

    public c j() {
        return this.f423a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public k(String str, c cVar, c[] cVarArr, b[] bVarArr, Annotation[] annotationArr) {
        this(str, cVar, cVarArr, bVarArr);
        o.e(str, "serialName");
        o.e(cVar, "baseClass");
        o.e(cVarArr, "subclasses");
        o.e(bVarArr, "subclassSerializers");
        o.e(annotationArr, "classAnnotations");
        this.f424b = C0713h.c(annotationArr);
    }
}
