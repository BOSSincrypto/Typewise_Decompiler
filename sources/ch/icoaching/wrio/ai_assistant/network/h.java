package ch.icoaching.wrio.ai_assistant.network;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.Result;
import kotlin.jvm.internal.o;
import retrofit2.C0877d;
import retrofit2.C0878e;
import retrofit2.K;

public final class h extends C0878e.a {

    public static final class a implements C0878e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Type f9192a;

        a(Type type) {
            this.f9192a = type;
        }

        public Type a() {
            Type d4 = C0878e.a.b(0, (ParameterizedType) this.f9192a);
            o.d(d4, "access$getParameterUpperBound$s572770538(...)");
            return d4;
        }

        /* renamed from: c */
        public C0877d b(C0877d dVar) {
            o.e(dVar, "call");
            return new g(dVar);
        }
    }

    public C0878e a(Type type, Annotation[] annotationArr, K k4) {
        o.e(type, "returnType");
        o.e(annotationArr, "annotations");
        o.e(k4, "retrofit");
        if (!o.a(C0878e.a.c(type), C0877d.class) || !(type instanceof ParameterizedType)) {
            return null;
        }
        Type b4 = C0878e.a.b(0, (ParameterizedType) type);
        if (!(b4 instanceof ParameterizedType) || !o.a(((ParameterizedType) b4).getRawType(), Result.class)) {
            return null;
        }
        return new a(b4);
    }
}
