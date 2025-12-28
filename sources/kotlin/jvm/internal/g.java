package kotlin.jvm.internal;

import A2.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C0718m;
import kotlin.collections.D;
import t2.C0900a;
import u2.C0906a;
import u2.C0907b;
import u2.C0908c;
import u2.C0909d;
import u2.C0910e;
import u2.C0911f;
import u2.C0912g;
import u2.C0913h;
import u2.C0914i;
import u2.C0915j;
import u2.C0916k;
import u2.l;
import u2.m;
import u2.n;
import u2.o;
import u2.p;
import u2.q;
import u2.r;
import u2.s;
import u2.t;
import u2.u;
import u2.v;
import u2.w;

public final class g implements c, f {

    /* renamed from: b  reason: collision with root package name */
    public static final a f13895b = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final Map f13896c;

    /* renamed from: d  reason: collision with root package name */
    private static final HashMap f13897d;

    /* renamed from: e  reason: collision with root package name */
    private static final HashMap f13898e;

    /* renamed from: f  reason: collision with root package name */
    private static final HashMap f13899f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final Map f13900g;

    /* renamed from: a  reason: collision with root package name */
    private final Class f13901a;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x003b, code lost:
            if (r2 == null) goto L_0x0041;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String a(java.lang.Class r7) {
            /*
                r6 = this;
                java.lang.String r0 = "jClass"
                kotlin.jvm.internal.o.e(r7, r0)
                boolean r0 = r7.isAnonymousClass()
                r1 = 0
                if (r0 == 0) goto L_0x000e
                goto L_0x00b3
            L_0x000e:
                boolean r0 = r7.isLocalClass()
                if (r0 == 0) goto L_0x006a
                java.lang.String r0 = r7.getSimpleName()
                java.lang.reflect.Method r2 = r7.getEnclosingMethod()
                r3 = 2
                r4 = 36
                if (r2 == 0) goto L_0x0041
                kotlin.jvm.internal.o.b(r0)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r2 = r2.getName()
                r5.append(r2)
                r5.append(r4)
                java.lang.String r2 = r5.toString()
                java.lang.String r2 = kotlin.text.o.E0(r0, r2, r1, r3, r1)
                if (r2 != 0) goto L_0x003e
                goto L_0x0041
            L_0x003e:
                r1 = r2
                goto L_0x00b3
            L_0x0041:
                java.lang.reflect.Constructor r7 = r7.getEnclosingConstructor()
                if (r7 == 0) goto L_0x0062
                kotlin.jvm.internal.o.b(r0)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r7 = r7.getName()
                r2.append(r7)
                r2.append(r4)
                java.lang.String r7 = r2.toString()
                java.lang.String r1 = kotlin.text.o.E0(r0, r7, r1, r3, r1)
                goto L_0x00b3
            L_0x0062:
                kotlin.jvm.internal.o.b(r0)
                java.lang.String r1 = kotlin.text.o.D0(r0, r4, r1, r3, r1)
                goto L_0x00b3
            L_0x006a:
                boolean r0 = r7.isArray()
                if (r0 == 0) goto L_0x009e
                java.lang.Class r7 = r7.getComponentType()
                boolean r0 = r7.isPrimitive()
                java.lang.String r2 = "Array"
                if (r0 == 0) goto L_0x009b
                java.util.Map r0 = kotlin.jvm.internal.g.f13900g
                java.lang.String r7 = r7.getName()
                java.lang.Object r7 = r0.get(r7)
                java.lang.String r7 = (java.lang.String) r7
                if (r7 == 0) goto L_0x009b
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r7)
                r0.append(r2)
                java.lang.String r1 = r0.toString()
            L_0x009b:
                if (r1 != 0) goto L_0x00b3
                goto L_0x003e
            L_0x009e:
                java.util.Map r0 = kotlin.jvm.internal.g.f13900g
                java.lang.String r1 = r7.getName()
                java.lang.Object r0 = r0.get(r1)
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
                if (r1 != 0) goto L_0x00b3
                java.lang.String r1 = r7.getSimpleName()
            L_0x00b3:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.g.a.a(java.lang.Class):java.lang.String");
        }

        public final boolean b(Object obj, Class cls) {
            o.e(cls, "jClass");
            Map d4 = g.f13896c;
            o.c(d4, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) d4.get(cls);
            if (num != null) {
                return v.g(obj, num.intValue());
            }
            if (cls.isPrimitive()) {
                cls = C0900a.b(C0900a.c(cls));
            }
            return cls.isInstance(obj);
        }

        private a() {
        }
    }

    static {
        int i4 = 0;
        Iterable m4 = C0718m.m(C0906a.class, l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, C0907b.class, C0908c.class, C0909d.class, C0910e.class, C0911f.class, C0912g.class, C0913h.class, C0914i.class, C0915j.class, C0916k.class, m.class, n.class, o.class);
        ArrayList arrayList = new ArrayList(C0718m.t(m4, 10));
        for (Object next : m4) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                C0718m.s();
            }
            arrayList.add(l2.g.a((Class) next, Integer.valueOf(i4)));
            i4 = i5;
        }
        f13896c = D.o(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f13897d = hashMap;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f13898e = hashMap2;
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        o.d(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            o.b(str);
            sb.append(kotlin.text.o.G0(str, '.', (String) null, 2, (Object) null));
            sb.append("CompanionObject");
            String sb2 = sb.toString();
            Pair a4 = l2.g.a(sb2, str + ".Companion");
            hashMap3.put(a4.getFirst(), a4.getSecond());
        }
        for (Map.Entry entry : f13896c.entrySet()) {
            int intValue = ((Number) entry.getValue()).intValue();
            String name = ((Class) entry.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        f13899f = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(D.e(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), kotlin.text.o.G0((String) entry2.getValue(), '.', (String) null, 2, (Object) null));
        }
        f13900g = linkedHashMap;
    }

    public g(Class cls) {
        o.e(cls, "jClass");
        this.f13901a = cls;
    }

    public boolean a(Object obj) {
        return f13895b.b(obj, c());
    }

    public String b() {
        return f13895b.a(c());
    }

    public Class c() {
        return this.f13901a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g) || !o.a(C0900a.b(this), C0900a.b((c) obj))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C0900a.b(this).hashCode();
    }

    public String toString() {
        return c().toString() + " (Kotlin reflection is not available)";
    }
}
