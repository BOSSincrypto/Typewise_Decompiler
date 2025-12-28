package Z0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class g {

    /* renamed from: a  reason: collision with root package name */
    private final a f2149a = new a();

    /* renamed from: b  reason: collision with root package name */
    private final Map f2150b = new HashMap();

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        final Object f2151a;

        /* renamed from: b  reason: collision with root package name */
        private List f2152b;

        /* renamed from: c  reason: collision with root package name */
        a f2153c;

        /* renamed from: d  reason: collision with root package name */
        a f2154d;

        a() {
            this((Object) null);
        }

        public void a(Object obj) {
            if (this.f2152b == null) {
                this.f2152b = new ArrayList();
            }
            this.f2152b.add(obj);
        }

        public Object b() {
            int c4 = c();
            if (c4 > 0) {
                return this.f2152b.remove(c4 - 1);
            }
            return null;
        }

        public int c() {
            List list = this.f2152b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        a(Object obj) {
            this.f2154d = this;
            this.f2153c = this;
            this.f2151a = obj;
        }
    }

    g() {
    }

    private void b(a aVar) {
        e(aVar);
        a aVar2 = this.f2149a;
        aVar.f2154d = aVar2;
        aVar.f2153c = aVar2.f2153c;
        g(aVar);
    }

    private void c(a aVar) {
        e(aVar);
        a aVar2 = this.f2149a;
        aVar.f2154d = aVar2.f2154d;
        aVar.f2153c = aVar2;
        g(aVar);
    }

    private static void e(a aVar) {
        a aVar2 = aVar.f2154d;
        aVar2.f2153c = aVar.f2153c;
        aVar.f2153c.f2154d = aVar2;
    }

    private static void g(a aVar) {
        aVar.f2153c.f2154d = aVar;
        aVar.f2154d.f2153c = aVar;
    }

    public Object a(m mVar) {
        a aVar = (a) this.f2150b.get(mVar);
        if (aVar == null) {
            aVar = new a(mVar);
            this.f2150b.put(mVar, aVar);
        } else {
            mVar.a();
        }
        b(aVar);
        return aVar.b();
    }

    public void d(m mVar, Object obj) {
        a aVar = (a) this.f2150b.get(mVar);
        if (aVar == null) {
            aVar = new a(mVar);
            c(aVar);
            this.f2150b.put(mVar, aVar);
        } else {
            mVar.a();
        }
        aVar.a(obj);
    }

    public Object f() {
        for (a aVar = this.f2149a.f2154d; !aVar.equals(this.f2149a); aVar = aVar.f2154d) {
            Object b4 = aVar.b();
            if (b4 != null) {
                return b4;
            }
            e(aVar);
            this.f2150b.remove(aVar.f2151a);
            ((m) aVar.f2151a).a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        a aVar = this.f2149a.f2153c;
        boolean z3 = false;
        while (!aVar.equals(this.f2149a)) {
            sb.append('{');
            sb.append(aVar.f2151a);
            sb.append(':');
            sb.append(aVar.c());
            sb.append("}, ");
            aVar = aVar.f2153c;
            z3 = true;
        }
        if (z3) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
