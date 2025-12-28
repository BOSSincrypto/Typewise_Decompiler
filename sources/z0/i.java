package Z0;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p1.k;

public final class i implements b {

    /* renamed from: a  reason: collision with root package name */
    private final g f2155a = new g();

    /* renamed from: b  reason: collision with root package name */
    private final b f2156b = new b();

    /* renamed from: c  reason: collision with root package name */
    private final Map f2157c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map f2158d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final int f2159e;

    /* renamed from: f  reason: collision with root package name */
    private int f2160f;

    private static final class a implements m {

        /* renamed from: a  reason: collision with root package name */
        private final b f2161a;

        /* renamed from: b  reason: collision with root package name */
        int f2162b;

        /* renamed from: c  reason: collision with root package name */
        private Class f2163c;

        a(b bVar) {
            this.f2161a = bVar;
        }

        public void a() {
            this.f2161a.c(this);
        }

        /* access modifiers changed from: package-private */
        public void b(int i4, Class cls) {
            this.f2162b = i4;
            this.f2163c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f2162b == aVar.f2162b && this.f2163c == aVar.f2163c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i4;
            int i5 = this.f2162b * 31;
            Class cls = this.f2163c;
            if (cls != null) {
                i4 = cls.hashCode();
            } else {
                i4 = 0;
            }
            return i5 + i4;
        }

        public String toString() {
            return "Key{size=" + this.f2162b + "array=" + this.f2163c + '}';
        }
    }

    private static final class b extends c {
        b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public a a() {
            return new a(this);
        }

        /* access modifiers changed from: package-private */
        public a e(int i4, Class cls) {
            a aVar = (a) b();
            aVar.b(i4, cls);
            return aVar;
        }
    }

    public i(int i4) {
        this.f2159e = i4;
    }

    private void f(int i4, Class cls) {
        NavigableMap m4 = m(cls);
        Integer num = (Integer) m4.get(Integer.valueOf(i4));
        if (num == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + i4 + ", this: " + this);
        } else if (num.intValue() == 1) {
            m4.remove(Integer.valueOf(i4));
        } else {
            m4.put(Integer.valueOf(i4), Integer.valueOf(num.intValue() - 1));
        }
    }

    private void g() {
        h(this.f2159e);
    }

    private void h(int i4) {
        while (this.f2160f > i4) {
            Object f4 = this.f2155a.f();
            k.d(f4);
            a i5 = i(f4);
            this.f2160f -= i5.b(f4) * i5.c();
            f(i5.b(f4), f4.getClass());
            if (Log.isLoggable(i5.a(), 2)) {
                i5.a();
                StringBuilder sb = new StringBuilder();
                sb.append("evicted: ");
                sb.append(i5.b(f4));
            }
        }
    }

    private a i(Object obj) {
        return j(obj.getClass());
    }

    private a j(Class cls) {
        a aVar = (a) this.f2158d.get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new h();
            } else if (cls.equals(byte[].class)) {
                aVar = new f();
            } else {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            this.f2158d.put(cls, aVar);
        }
        return aVar;
    }

    private Object k(a aVar) {
        return this.f2155a.a(aVar);
    }

    private Object l(a aVar, Class cls) {
        a j4 = j(cls);
        Object k4 = k(aVar);
        if (k4 != null) {
            this.f2160f -= j4.b(k4) * j4.c();
            f(j4.b(k4), cls);
        }
        if (k4 != null) {
            return k4;
        }
        if (Log.isLoggable(j4.a(), 2)) {
            j4.a();
            StringBuilder sb = new StringBuilder();
            sb.append("Allocated ");
            sb.append(aVar.f2162b);
            sb.append(" bytes");
        }
        return j4.newArray(aVar.f2162b);
    }

    private NavigableMap m(Class cls) {
        NavigableMap navigableMap = (NavigableMap) this.f2157c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f2157c.put(cls, treeMap);
        return treeMap;
    }

    private boolean n() {
        int i4 = this.f2160f;
        if (i4 == 0 || this.f2159e / i4 >= 2) {
            return true;
        }
        return false;
    }

    private boolean o(int i4) {
        if (i4 <= this.f2159e / 2) {
            return true;
        }
        return false;
    }

    private boolean p(int i4, Integer num) {
        if (num == null || (!n() && num.intValue() > i4 * 8)) {
            return false;
        }
        return true;
    }

    public synchronized void a(int i4) {
        if (i4 >= 40) {
            try {
                b();
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        } else if (i4 >= 20 || i4 == 15) {
            h(this.f2159e / 2);
        }
    }

    public synchronized void b() {
        h(0);
    }

    public synchronized Object c(int i4, Class cls) {
        return l(this.f2156b.e(i4, cls), cls);
    }

    public synchronized void d(Object obj) {
        Class<?> cls = obj.getClass();
        a j4 = j(cls);
        int b4 = j4.b(obj);
        int c4 = j4.c() * b4;
        if (o(c4)) {
            a e4 = this.f2156b.e(b4, cls);
            this.f2155a.d(e4, obj);
            NavigableMap m4 = m(cls);
            Integer num = (Integer) m4.get(Integer.valueOf(e4.f2162b));
            Integer valueOf = Integer.valueOf(e4.f2162b);
            int i4 = 1;
            if (num != null) {
                i4 = 1 + num.intValue();
            }
            m4.put(valueOf, Integer.valueOf(i4));
            this.f2160f += c4;
            g();
        }
    }

    public synchronized Object e(int i4, Class cls) {
        a aVar;
        try {
            Integer num = (Integer) m(cls).ceilingKey(Integer.valueOf(i4));
            if (p(i4, num)) {
                aVar = this.f2156b.e(num.intValue(), cls);
            } else {
                aVar = this.f2156b.e(i4, cls);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return l(aVar, cls);
    }
}
