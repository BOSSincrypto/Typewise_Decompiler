package y;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: y.a  reason: case insensitive filesystem */
public class C0939a extends g implements Map {

    /* renamed from: h  reason: collision with root package name */
    f f16398h;

    /* renamed from: y.a$a  reason: collision with other inner class name */
    class C0250a extends f {
        C0250a() {
        }

        /* access modifiers changed from: protected */
        public void a() {
            C0939a.this.clear();
        }

        /* access modifiers changed from: protected */
        public Object b(int i4, int i5) {
            return C0939a.this.f16447b[(i4 << 1) + i5];
        }

        /* access modifiers changed from: protected */
        public Map c() {
            return C0939a.this;
        }

        /* access modifiers changed from: protected */
        public int d() {
            return C0939a.this.f16448c;
        }

        /* access modifiers changed from: protected */
        public int e(Object obj) {
            return C0939a.this.g(obj);
        }

        /* access modifiers changed from: protected */
        public int f(Object obj) {
            return C0939a.this.i(obj);
        }

        /* access modifiers changed from: protected */
        public void g(Object obj, Object obj2) {
            C0939a.this.put(obj, obj2);
        }

        /* access modifiers changed from: protected */
        public void h(int i4) {
            C0939a.this.l(i4);
        }

        /* access modifiers changed from: protected */
        public Object i(int i4, Object obj) {
            return C0939a.this.m(i4, obj);
        }
    }

    public C0939a() {
    }

    private f o() {
        if (this.f16398h == null) {
            this.f16398h = new C0250a();
        }
        return this.f16398h;
    }

    public Set entrySet() {
        return o().l();
    }

    public Set keySet() {
        return o().m();
    }

    public boolean p(Collection collection) {
        return f.p(this, collection);
    }

    public void putAll(Map map) {
        d(this.f16448c + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public Collection values() {
        return o().n();
    }

    public C0939a(int i4) {
        super(i4);
    }

    public C0939a(g gVar) {
        super(gVar);
    }
}
