package s;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: s.b  reason: case insensitive filesystem */
public class C0890b implements Iterable {

    /* renamed from: a  reason: collision with root package name */
    c f16256a;

    /* renamed from: b  reason: collision with root package name */
    private c f16257b;

    /* renamed from: c  reason: collision with root package name */
    private final WeakHashMap f16258c = new WeakHashMap();

    /* renamed from: d  reason: collision with root package name */
    private int f16259d = 0;

    /* renamed from: s.b$a */
    static class a extends e {
        a(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        public c b(c cVar) {
            return cVar.f16263d;
        }

        /* access modifiers changed from: package-private */
        public c c(c cVar) {
            return cVar.f16262c;
        }
    }

    /* renamed from: s.b$b  reason: collision with other inner class name */
    private static class C0231b extends e {
        C0231b(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        public c b(c cVar) {
            return cVar.f16262c;
        }

        /* access modifiers changed from: package-private */
        public c c(c cVar) {
            return cVar.f16263d;
        }
    }

    /* renamed from: s.b$c */
    static class c implements Map.Entry {

        /* renamed from: a  reason: collision with root package name */
        final Object f16260a;

        /* renamed from: b  reason: collision with root package name */
        final Object f16261b;

        /* renamed from: c  reason: collision with root package name */
        c f16262c;

        /* renamed from: d  reason: collision with root package name */
        c f16263d;

        c(Object obj, Object obj2) {
            this.f16260a = obj;
            this.f16261b = obj2;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!this.f16260a.equals(cVar.f16260a) || !this.f16261b.equals(cVar.f16261b)) {
                return false;
            }
            return true;
        }

        public Object getKey() {
            return this.f16260a;
        }

        public Object getValue() {
            return this.f16261b;
        }

        public int hashCode() {
            return this.f16260a.hashCode() ^ this.f16261b.hashCode();
        }

        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f16260a + "=" + this.f16261b;
        }
    }

    /* renamed from: s.b$d */
    public class d extends f implements Iterator {

        /* renamed from: a  reason: collision with root package name */
        private c f16264a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f16265b = true;

        d() {
        }

        /* access modifiers changed from: package-private */
        public void a(c cVar) {
            boolean z3;
            c cVar2 = this.f16264a;
            if (cVar == cVar2) {
                c cVar3 = cVar2.f16263d;
                this.f16264a = cVar3;
                if (cVar3 == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.f16265b = z3;
            }
        }

        /* renamed from: b */
        public Map.Entry next() {
            c cVar;
            if (this.f16265b) {
                this.f16265b = false;
                this.f16264a = C0890b.this.f16256a;
            } else {
                c cVar2 = this.f16264a;
                if (cVar2 != null) {
                    cVar = cVar2.f16262c;
                } else {
                    cVar = null;
                }
                this.f16264a = cVar;
            }
            return this.f16264a;
        }

        public boolean hasNext() {
            if (!this.f16265b) {
                c cVar = this.f16264a;
                if (cVar == null || cVar.f16262c == null) {
                    return false;
                }
                return true;
            } else if (C0890b.this.f16256a != null) {
                return true;
            } else {
                return false;
            }
        }
    }

    /* renamed from: s.b$e */
    private static abstract class e extends f implements Iterator {

        /* renamed from: a  reason: collision with root package name */
        c f16267a;

        /* renamed from: b  reason: collision with root package name */
        c f16268b;

        e(c cVar, c cVar2) {
            this.f16267a = cVar2;
            this.f16268b = cVar;
        }

        private c e() {
            c cVar = this.f16268b;
            c cVar2 = this.f16267a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        public void a(c cVar) {
            if (this.f16267a == cVar && cVar == this.f16268b) {
                this.f16268b = null;
                this.f16267a = null;
            }
            c cVar2 = this.f16267a;
            if (cVar2 == cVar) {
                this.f16267a = b(cVar2);
            }
            if (this.f16268b == cVar) {
                this.f16268b = e();
            }
        }

        /* access modifiers changed from: package-private */
        public abstract c b(c cVar);

        /* access modifiers changed from: package-private */
        public abstract c c(c cVar);

        /* renamed from: d */
        public Map.Entry next() {
            c cVar = this.f16268b;
            this.f16268b = e();
            return cVar;
        }

        public boolean hasNext() {
            if (this.f16268b != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: s.b$f */
    public static abstract class f {
        /* access modifiers changed from: package-private */
        public abstract void a(c cVar);
    }

    public Iterator a() {
        C0231b bVar = new C0231b(this.f16257b, this.f16256a);
        this.f16258c.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public Map.Entry b() {
        return this.f16256a;
    }

    /* access modifiers changed from: protected */
    public c c(Object obj) {
        c cVar = this.f16256a;
        while (cVar != null && !cVar.f16260a.equals(obj)) {
            cVar = cVar.f16262c;
        }
        return cVar;
    }

    public d d() {
        d dVar = new d();
        this.f16258c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry e() {
        return this.f16257b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0890b)) {
            return false;
        }
        C0890b bVar = (C0890b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        if (it.hasNext() || it2.hasNext()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public c f(Object obj, Object obj2) {
        c cVar = new c(obj, obj2);
        this.f16259d++;
        c cVar2 = this.f16257b;
        if (cVar2 == null) {
            this.f16256a = cVar;
            this.f16257b = cVar;
            return cVar;
        }
        cVar2.f16262c = cVar;
        cVar.f16263d = cVar2;
        this.f16257b = cVar;
        return cVar;
    }

    public Object g(Object obj, Object obj2) {
        c c4 = c(obj);
        if (c4 != null) {
            return c4.f16261b;
        }
        f(obj, obj2);
        return null;
    }

    public Object h(Object obj) {
        c c4 = c(obj);
        if (c4 == null) {
            return null;
        }
        this.f16259d--;
        if (!this.f16258c.isEmpty()) {
            for (f a4 : this.f16258c.keySet()) {
                a4.a(c4);
            }
        }
        c cVar = c4.f16263d;
        if (cVar != null) {
            cVar.f16262c = c4.f16262c;
        } else {
            this.f16256a = c4.f16262c;
        }
        c cVar2 = c4.f16262c;
        if (cVar2 != null) {
            cVar2.f16263d = cVar;
        } else {
            this.f16257b = cVar;
        }
        c4.f16262c = null;
        c4.f16263d = null;
        return c4.f16261b;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 += ((Map.Entry) it.next()).hashCode();
        }
        return i4;
    }

    public Iterator iterator() {
        a aVar = new a(this.f16256a, this.f16257b);
        this.f16258c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public int size() {
        return this.f16259d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
