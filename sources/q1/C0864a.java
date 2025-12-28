package q1;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: q1.a  reason: case insensitive filesystem */
public abstract class C0864a {

    /* renamed from: a  reason: collision with root package name */
    private static final g f15959a = new C0225a();

    /* renamed from: q1.a$a  reason: collision with other inner class name */
    class C0225a implements g {
        C0225a() {
        }

        public void a(Object obj) {
        }
    }

    /* renamed from: q1.a$b */
    class b implements d {
        b() {
        }

        /* renamed from: b */
        public List a() {
            return new ArrayList();
        }
    }

    /* renamed from: q1.a$c */
    class c implements g {
        c() {
        }

        /* renamed from: b */
        public void a(List list) {
            list.clear();
        }
    }

    /* renamed from: q1.a$d */
    public interface d {
        Object a();
    }

    /* renamed from: q1.a$e */
    private static final class e implements androidx.core.util.d {

        /* renamed from: a  reason: collision with root package name */
        private final d f15960a;

        /* renamed from: b  reason: collision with root package name */
        private final g f15961b;

        /* renamed from: c  reason: collision with root package name */
        private final androidx.core.util.d f15962c;

        e(androidx.core.util.d dVar, d dVar2, g gVar) {
            this.f15962c = dVar;
            this.f15960a = dVar2;
            this.f15961b = gVar;
        }

        public boolean a(Object obj) {
            if (obj instanceof f) {
                ((f) obj).b().b(true);
            }
            this.f15961b.a(obj);
            return this.f15962c.a(obj);
        }

        public Object b() {
            Object b4 = this.f15962c.b();
            if (b4 == null) {
                b4 = this.f15960a.a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Created new ");
                    sb.append(b4.getClass());
                }
            }
            if (b4 instanceof f) {
                ((f) b4).b().b(false);
            }
            return b4;
        }
    }

    /* renamed from: q1.a$f */
    public interface f {
        C0866c b();
    }

    /* renamed from: q1.a$g */
    public interface g {
        void a(Object obj);
    }

    private static androidx.core.util.d a(androidx.core.util.d dVar, d dVar2) {
        return b(dVar, dVar2, c());
    }

    private static androidx.core.util.d b(androidx.core.util.d dVar, d dVar2, g gVar) {
        return new e(dVar, dVar2, gVar);
    }

    private static g c() {
        return f15959a;
    }

    public static androidx.core.util.d d(int i4, d dVar) {
        return a(new androidx.core.util.f(i4), dVar);
    }

    public static androidx.core.util.d e() {
        return f(20);
    }

    public static androidx.core.util.d f(int i4) {
        return b(new androidx.core.util.f(i4), new b(), new c());
    }
}
