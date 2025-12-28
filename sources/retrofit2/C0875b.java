package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import l2.q;
import l3.w;
import okhttp3.B;
import okhttp3.z;
import retrofit2.C0884k;

/* renamed from: retrofit2.b  reason: case insensitive filesystem */
final class C0875b extends C0884k.a {

    /* renamed from: retrofit2.b$a */
    static final class a implements C0884k {

        /* renamed from: a  reason: collision with root package name */
        static final a f16197a = new a();

        a() {
        }

        /* renamed from: b */
        public B a(B b4) {
            try {
                return O.a(b4);
            } finally {
                b4.close();
            }
        }
    }

    /* renamed from: retrofit2.b$b  reason: collision with other inner class name */
    static final class C0229b implements C0884k {

        /* renamed from: a  reason: collision with root package name */
        static final C0229b f16198a = new C0229b();

        C0229b() {
        }

        /* renamed from: b */
        public z a(z zVar) {
            return zVar;
        }
    }

    /* renamed from: retrofit2.b$c */
    static final class c implements C0884k {

        /* renamed from: a  reason: collision with root package name */
        static final c f16199a = new c();

        c() {
        }

        /* renamed from: b */
        public B a(B b4) {
            return b4;
        }
    }

    /* renamed from: retrofit2.b$d */
    static final class d implements C0884k {

        /* renamed from: a  reason: collision with root package name */
        static final d f16200a = new d();

        d() {
        }

        /* renamed from: b */
        public String a(Object obj) {
            return obj.toString();
        }
    }

    /* renamed from: retrofit2.b$e */
    static final class e implements C0884k {

        /* renamed from: a  reason: collision with root package name */
        static final e f16201a = new e();

        e() {
        }

        /* renamed from: b */
        public q a(B b4) {
            b4.close();
            return q.f14567a;
        }
    }

    /* renamed from: retrofit2.b$f */
    static final class f implements C0884k {

        /* renamed from: a  reason: collision with root package name */
        static final f f16202a = new f();

        f() {
        }

        /* renamed from: b */
        public Void a(B b4) {
            b4.close();
            return null;
        }
    }

    C0875b() {
    }

    public C0884k c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, K k4) {
        if (z.class.isAssignableFrom(O.h(type))) {
            return C0229b.f16198a;
        }
        return null;
    }

    public C0884k d(Type type, Annotation[] annotationArr, K k4) {
        if (type == B.class) {
            if (O.l(annotationArr, w.class)) {
                return c.f16199a;
            }
            return a.f16197a;
        } else if (type == Void.class) {
            return f.f16202a;
        } else {
            if (O.m(type)) {
                return e.f16201a;
            }
            return null;
        }
    }
}
