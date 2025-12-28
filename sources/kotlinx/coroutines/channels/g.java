package kotlinx.coroutines.channels;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public final class g {

    /* renamed from: b  reason: collision with root package name */
    public static final b f14066b = new b((i) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final c f14067c = new c();

    /* renamed from: a  reason: collision with root package name */
    private final Object f14068a;

    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f14069a;

        public a(Throwable th) {
            this.f14069a = th;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a) || !o.a(this.f14069a, ((a) obj).f14069a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            Throwable th = this.f14069a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Closed(" + this.f14069a + ')';
        }
    }

    public static final class b {
        public /* synthetic */ b(i iVar) {
            this();
        }

        public final Object a(Throwable th) {
            return g.c(new a(th));
        }

        public final Object b() {
            return g.c(g.f14067c);
        }

        public final Object c(Object obj) {
            return g.c(obj);
        }

        private b() {
        }
    }

    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    private /* synthetic */ g(Object obj) {
        this.f14068a = obj;
    }

    public static final /* synthetic */ g b(Object obj) {
        return new g(obj);
    }

    public static Object c(Object obj) {
        return obj;
    }

    public static boolean d(Object obj, Object obj2) {
        return (obj2 instanceof g) && o.a(obj, ((g) obj2).j());
    }

    public static final Throwable e(Object obj) {
        a aVar;
        if (obj instanceof a) {
            aVar = (a) obj;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            return aVar.f14069a;
        }
        return null;
    }

    public static final Object f(Object obj) {
        Throwable th;
        if (!(obj instanceof c)) {
            return obj;
        }
        if (!(obj instanceof a) || (th = ((a) obj).f14069a) == null) {
            throw new IllegalStateException(("Trying to call 'getOrThrow' on a failed channel result: " + obj).toString());
        }
        throw th;
    }

    public static int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean h(Object obj) {
        return obj instanceof a;
    }

    public static String i(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f14068a, obj);
    }

    public int hashCode() {
        return g(this.f14068a);
    }

    public final /* synthetic */ Object j() {
        return this.f14068a;
    }

    public String toString() {
        return i(this.f14068a);
    }
}
