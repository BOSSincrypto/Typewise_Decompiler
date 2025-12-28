package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import okhttp3.B;
import retrofit2.C0884k;

public final class z extends C0884k.a {

    static final class a implements C0884k {

        /* renamed from: a  reason: collision with root package name */
        private final C0884k f16254a;

        a(C0884k kVar) {
            this.f16254a = kVar;
        }

        /* renamed from: b */
        public Optional a(B b4) {
            return Optional.ofNullable(this.f16254a.a(b4));
        }
    }

    z() {
    }

    public C0884k d(Type type, Annotation[] annotationArr, K k4) {
        if (C0884k.a.b(type) != x.a()) {
            return null;
        }
        return new a(k4.h(C0884k.a.a(0, (ParameterizedType) type), annotationArr));
    }
}
