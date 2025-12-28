package retrofit2;

import com.silkimen.http.HttpRequest;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import okhttp3.A;
import okhttp3.e;
import retrofit2.O;

abstract class u extends L {

    /* renamed from: a  reason: collision with root package name */
    private final I f16225a;

    /* renamed from: b  reason: collision with root package name */
    private final e.a f16226b;

    /* renamed from: c  reason: collision with root package name */
    private final C0884k f16227c;

    static final class a extends u {

        /* renamed from: d  reason: collision with root package name */
        private final C0878e f16228d;

        a(I i4, e.a aVar, C0884k kVar, C0878e eVar) {
            super(i4, aVar, kVar);
            this.f16228d = eVar;
        }

        /* access modifiers changed from: protected */
        public Object c(C0877d dVar, Object[] objArr) {
            return this.f16228d.b(dVar);
        }
    }

    static final class b extends u {

        /* renamed from: d  reason: collision with root package name */
        private final C0878e f16229d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f16230e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f16231f;

        b(I i4, e.a aVar, C0884k kVar, C0878e eVar, boolean z3, boolean z4) {
            super(i4, aVar, kVar);
            this.f16229d = eVar;
            this.f16230e = z3;
            this.f16231f = z4;
        }

        /* access modifiers changed from: protected */
        public Object c(C0877d dVar, Object[] objArr) {
            C0877d dVar2 = (C0877d) this.f16229d.b(dVar);
            kotlin.coroutines.c cVar = objArr[objArr.length - 1];
            try {
                if (this.f16231f) {
                    return KotlinExtensions.d(dVar2, cVar);
                }
                if (this.f16230e) {
                    return KotlinExtensions.b(dVar2, cVar);
                }
                return KotlinExtensions.a(dVar2, cVar);
            } catch (VirtualMachineError e4) {
                e = e4;
                throw e;
            } catch (ThreadDeath e5) {
                e = e5;
                throw e;
            } catch (LinkageError e6) {
                e = e6;
                throw e;
            } catch (Throwable th) {
                return KotlinExtensions.e(th, cVar);
            }
        }
    }

    static final class c extends u {

        /* renamed from: d  reason: collision with root package name */
        private final C0878e f16232d;

        c(I i4, e.a aVar, C0884k kVar, C0878e eVar) {
            super(i4, aVar, kVar);
            this.f16232d = eVar;
        }

        /* access modifiers changed from: protected */
        public Object c(C0877d dVar, Object[] objArr) {
            C0877d dVar2 = (C0877d) this.f16232d.b(dVar);
            kotlin.coroutines.c cVar = objArr[objArr.length - 1];
            try {
                return KotlinExtensions.c(dVar2, cVar);
            } catch (Exception e4) {
                return KotlinExtensions.e(e4, cVar);
            }
        }
    }

    u(I i4, e.a aVar, C0884k kVar) {
        this.f16225a = i4;
        this.f16226b = aVar;
        this.f16227c = kVar;
    }

    private static C0878e d(K k4, Method method, Type type, Annotation[] annotationArr) {
        try {
            return k4.a(type, annotationArr);
        } catch (RuntimeException e4) {
            throw O.o(method, e4, "Unable to create call adapter for %s", type);
        }
    }

    private static C0884k e(K k4, Method method, Type type) {
        try {
            return k4.h(type, method.getAnnotations());
        } catch (RuntimeException e4) {
            throw O.o(method, e4, "Unable to create converter for %s", type);
        }
    }

    static u f(K k4, Method method, I i4) {
        boolean z3;
        Type type;
        boolean z4;
        boolean z5;
        boolean z6 = i4.f16134l;
        Annotation[] annotations = method.getAnnotations();
        Class<J> cls = J.class;
        if (z6) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type f4 = O.f(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            Class<C0877d> cls2 = C0877d.class;
            if (O.h(f4) == cls && (f4 instanceof ParameterizedType)) {
                f4 = O.g(0, (ParameterizedType) f4);
                z4 = true;
                z5 = false;
            } else if (O.h(f4) != cls2) {
                z5 = O.m(f4);
                z4 = false;
            } else {
                throw O.n(method, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", O.g(0, (ParameterizedType) f4));
            }
            type = new O.b((Type) null, cls2, f4);
            annotations = N.a(annotations);
            z3 = z5;
        } else {
            type = method.getGenericReturnType();
            z4 = false;
            z3 = false;
        }
        C0878e d4 = d(k4, method, type, annotations);
        Type a4 = d4.a();
        if (a4 == A.class) {
            throw O.n(method, "'" + O.h(a4).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        } else if (a4 == cls) {
            throw O.n(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        } else if (!i4.f16126d.equals(HttpRequest.METHOD_HEAD) || Void.class.equals(a4) || O.m(a4)) {
            C0884k e4 = e(k4, method, a4);
            e.a aVar = k4.f16165b;
            if (!z6) {
                return new a(i4, aVar, e4, d4);
            }
            if (z4) {
                return new c(i4, aVar, e4, d4);
            }
            return new b(i4, aVar, e4, d4, false, z3);
        } else {
            throw O.n(method, "HEAD method must use Void or Unit as response type.", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    public final Object a(Object obj, Object[] objArr) {
        return c(new w(this.f16225a, obj, objArr, this.f16226b, this.f16227c), objArr);
    }

    /* access modifiers changed from: protected */
    public abstract Object c(C0877d dVar, Object[] objArr);
}
