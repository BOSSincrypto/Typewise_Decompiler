package retrofit2;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import okhttp3.s;
import okhttp3.w;
import okhttp3.z;

abstract class A {

    class a extends A {
        a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void a(H h4, Iterable iterable) {
            if (iterable != null) {
                for (Object a4 : iterable) {
                    A.this.a(h4, a4);
                }
            }
        }
    }

    class b extends A {
        b() {
        }

        /* access modifiers changed from: package-private */
        public void a(H h4, Object obj) {
            if (obj != null) {
                int length = Array.getLength(obj);
                for (int i4 = 0; i4 < length; i4++) {
                    A.this.a(h4, Array.get(obj, i4));
                }
            }
        }
    }

    static final class c extends A {

        /* renamed from: a  reason: collision with root package name */
        private final Method f16059a;

        /* renamed from: b  reason: collision with root package name */
        private final int f16060b;

        /* renamed from: c  reason: collision with root package name */
        private final C0884k f16061c;

        c(Method method, int i4, C0884k kVar) {
            this.f16059a = method;
            this.f16060b = i4;
            this.f16061c = kVar;
        }

        /* access modifiers changed from: package-private */
        public void a(H h4, Object obj) {
            if (obj != null) {
                try {
                    h4.l((z) this.f16061c.a(obj));
                } catch (IOException e4) {
                    Method method = this.f16059a;
                    int i4 = this.f16060b;
                    throw O.q(method, e4, i4, "Unable to convert " + obj + " to RequestBody", new Object[0]);
                }
            } else {
                throw O.p(this.f16059a, this.f16060b, "Body parameter value must not be null.", new Object[0]);
            }
        }
    }

    static final class d extends A {

        /* renamed from: a  reason: collision with root package name */
        private final String f16062a;

        /* renamed from: b  reason: collision with root package name */
        private final C0884k f16063b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f16064c;

        d(String str, C0884k kVar, boolean z3) {
            Objects.requireNonNull(str, "name == null");
            this.f16062a = str;
            this.f16063b = kVar;
            this.f16064c = z3;
        }

        /* access modifiers changed from: package-private */
        public void a(H h4, Object obj) {
            String str;
            if (obj != null && (str = (String) this.f16063b.a(obj)) != null) {
                h4.a(this.f16062a, str, this.f16064c);
            }
        }
    }

    static final class e extends A {

        /* renamed from: a  reason: collision with root package name */
        private final Method f16065a;

        /* renamed from: b  reason: collision with root package name */
        private final int f16066b;

        /* renamed from: c  reason: collision with root package name */
        private final C0884k f16067c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f16068d;

        e(Method method, int i4, C0884k kVar, boolean z3) {
            this.f16065a = method;
            this.f16066b = i4;
            this.f16067c = kVar;
            this.f16068d = z3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void a(H h4, Map map) {
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String str2 = (String) this.f16067c.a(value);
                            if (str2 != null) {
                                h4.a(str, str2, this.f16068d);
                            } else {
                                Method method = this.f16065a;
                                int i4 = this.f16066b;
                                throw O.p(method, i4, "Field map value '" + value + "' converted to null by " + this.f16067c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            Method method2 = this.f16065a;
                            int i5 = this.f16066b;
                            throw O.p(method2, i5, "Field map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw O.p(this.f16065a, this.f16066b, "Field map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw O.p(this.f16065a, this.f16066b, "Field map was null.", new Object[0]);
        }
    }

    static final class f extends A {

        /* renamed from: a  reason: collision with root package name */
        private final String f16069a;

        /* renamed from: b  reason: collision with root package name */
        private final C0884k f16070b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f16071c;

        f(String str, C0884k kVar, boolean z3) {
            Objects.requireNonNull(str, "name == null");
            this.f16069a = str;
            this.f16070b = kVar;
            this.f16071c = z3;
        }

        /* access modifiers changed from: package-private */
        public void a(H h4, Object obj) {
            String str;
            if (obj != null && (str = (String) this.f16070b.a(obj)) != null) {
                h4.b(this.f16069a, str, this.f16071c);
            }
        }
    }

    static final class g extends A {

        /* renamed from: a  reason: collision with root package name */
        private final Method f16072a;

        /* renamed from: b  reason: collision with root package name */
        private final int f16073b;

        /* renamed from: c  reason: collision with root package name */
        private final C0884k f16074c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f16075d;

        g(Method method, int i4, C0884k kVar, boolean z3) {
            this.f16072a = method;
            this.f16073b = i4;
            this.f16074c = kVar;
            this.f16075d = z3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void a(H h4, Map map) {
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            h4.b(str, (String) this.f16074c.a(value), this.f16075d);
                        } else {
                            Method method = this.f16072a;
                            int i4 = this.f16073b;
                            throw O.p(method, i4, "Header map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw O.p(this.f16072a, this.f16073b, "Header map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw O.p(this.f16072a, this.f16073b, "Header map was null.", new Object[0]);
        }
    }

    static final class h extends A {

        /* renamed from: a  reason: collision with root package name */
        private final Method f16076a;

        /* renamed from: b  reason: collision with root package name */
        private final int f16077b;

        h(Method method, int i4) {
            this.f16076a = method;
            this.f16077b = i4;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void a(H h4, s sVar) {
            if (sVar != null) {
                h4.c(sVar);
                return;
            }
            throw O.p(this.f16076a, this.f16077b, "Headers parameter must not be null.", new Object[0]);
        }
    }

    static final class i extends A {

        /* renamed from: a  reason: collision with root package name */
        private final Method f16078a;

        /* renamed from: b  reason: collision with root package name */
        private final int f16079b;

        /* renamed from: c  reason: collision with root package name */
        private final s f16080c;

        /* renamed from: d  reason: collision with root package name */
        private final C0884k f16081d;

        i(Method method, int i4, s sVar, C0884k kVar) {
            this.f16078a = method;
            this.f16079b = i4;
            this.f16080c = sVar;
            this.f16081d = kVar;
        }

        /* access modifiers changed from: package-private */
        public void a(H h4, Object obj) {
            if (obj != null) {
                try {
                    h4.d(this.f16080c, (z) this.f16081d.a(obj));
                } catch (IOException e4) {
                    Method method = this.f16078a;
                    int i4 = this.f16079b;
                    throw O.p(method, i4, "Unable to convert " + obj + " to RequestBody", e4);
                }
            }
        }
    }

    static final class j extends A {

        /* renamed from: a  reason: collision with root package name */
        private final Method f16082a;

        /* renamed from: b  reason: collision with root package name */
        private final int f16083b;

        /* renamed from: c  reason: collision with root package name */
        private final C0884k f16084c;

        /* renamed from: d  reason: collision with root package name */
        private final String f16085d;

        j(Method method, int i4, C0884k kVar, String str) {
            this.f16082a = method;
            this.f16083b = i4;
            this.f16084c = kVar;
            this.f16085d = str;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void a(H h4, Map map) {
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            h4.d(s.e("Content-Disposition", "form-data; name=\"" + str + "\"", "Content-Transfer-Encoding", this.f16085d), (z) this.f16084c.a(value));
                        } else {
                            Method method = this.f16082a;
                            int i4 = this.f16083b;
                            throw O.p(method, i4, "Part map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw O.p(this.f16082a, this.f16083b, "Part map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw O.p(this.f16082a, this.f16083b, "Part map was null.", new Object[0]);
        }
    }

    static final class k extends A {

        /* renamed from: a  reason: collision with root package name */
        private final Method f16086a;

        /* renamed from: b  reason: collision with root package name */
        private final int f16087b;

        /* renamed from: c  reason: collision with root package name */
        private final String f16088c;

        /* renamed from: d  reason: collision with root package name */
        private final C0884k f16089d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f16090e;

        k(Method method, int i4, String str, C0884k kVar, boolean z3) {
            this.f16086a = method;
            this.f16087b = i4;
            Objects.requireNonNull(str, "name == null");
            this.f16088c = str;
            this.f16089d = kVar;
            this.f16090e = z3;
        }

        /* access modifiers changed from: package-private */
        public void a(H h4, Object obj) {
            if (obj != null) {
                h4.f(this.f16088c, (String) this.f16089d.a(obj), this.f16090e);
                return;
            }
            Method method = this.f16086a;
            int i4 = this.f16087b;
            throw O.p(method, i4, "Path parameter \"" + this.f16088c + "\" value must not be null.", new Object[0]);
        }
    }

    static final class l extends A {

        /* renamed from: a  reason: collision with root package name */
        private final String f16091a;

        /* renamed from: b  reason: collision with root package name */
        private final C0884k f16092b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f16093c;

        l(String str, C0884k kVar, boolean z3) {
            Objects.requireNonNull(str, "name == null");
            this.f16091a = str;
            this.f16092b = kVar;
            this.f16093c = z3;
        }

        /* access modifiers changed from: package-private */
        public void a(H h4, Object obj) {
            String str;
            if (obj != null && (str = (String) this.f16092b.a(obj)) != null) {
                h4.g(this.f16091a, str, this.f16093c);
            }
        }
    }

    static final class m extends A {

        /* renamed from: a  reason: collision with root package name */
        private final Method f16094a;

        /* renamed from: b  reason: collision with root package name */
        private final int f16095b;

        /* renamed from: c  reason: collision with root package name */
        private final C0884k f16096c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f16097d;

        m(Method method, int i4, C0884k kVar, boolean z3) {
            this.f16094a = method;
            this.f16095b = i4;
            this.f16096c = kVar;
            this.f16097d = z3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void a(H h4, Map map) {
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String str2 = (String) this.f16096c.a(value);
                            if (str2 != null) {
                                h4.g(str, str2, this.f16097d);
                            } else {
                                Method method = this.f16094a;
                                int i4 = this.f16095b;
                                throw O.p(method, i4, "Query map value '" + value + "' converted to null by " + this.f16096c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            Method method2 = this.f16094a;
                            int i5 = this.f16095b;
                            throw O.p(method2, i5, "Query map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw O.p(this.f16094a, this.f16095b, "Query map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw O.p(this.f16094a, this.f16095b, "Query map was null", new Object[0]);
        }
    }

    static final class n extends A {

        /* renamed from: a  reason: collision with root package name */
        private final C0884k f16098a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f16099b;

        n(C0884k kVar, boolean z3) {
            this.f16098a = kVar;
            this.f16099b = z3;
        }

        /* access modifiers changed from: package-private */
        public void a(H h4, Object obj) {
            if (obj != null) {
                h4.g((String) this.f16098a.a(obj), (String) null, this.f16099b);
            }
        }
    }

    static final class o extends A {

        /* renamed from: a  reason: collision with root package name */
        static final o f16100a = new o();

        private o() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void a(H h4, w.c cVar) {
            if (cVar != null) {
                h4.e(cVar);
            }
        }
    }

    static final class p extends A {

        /* renamed from: a  reason: collision with root package name */
        private final Method f16101a;

        /* renamed from: b  reason: collision with root package name */
        private final int f16102b;

        p(Method method, int i4) {
            this.f16101a = method;
            this.f16102b = i4;
        }

        /* access modifiers changed from: package-private */
        public void a(H h4, Object obj) {
            if (obj != null) {
                h4.m(obj);
                return;
            }
            throw O.p(this.f16101a, this.f16102b, "@Url parameter is null.", new Object[0]);
        }
    }

    static final class q extends A {

        /* renamed from: a  reason: collision with root package name */
        final Class f16103a;

        q(Class cls) {
            this.f16103a = cls;
        }

        /* access modifiers changed from: package-private */
        public void a(H h4, Object obj) {
            h4.h(this.f16103a, obj);
        }
    }

    A() {
    }

    /* access modifiers changed from: package-private */
    public abstract void a(H h4, Object obj);

    /* access modifiers changed from: package-private */
    public final A b() {
        return new b();
    }

    /* access modifiers changed from: package-private */
    public final A c() {
        return new a();
    }
}
