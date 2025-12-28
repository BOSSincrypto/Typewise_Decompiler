package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: retrofit2.e  reason: case insensitive filesystem */
public interface C0878e {

    /* renamed from: retrofit2.e$a */
    public static abstract class a {
        /* access modifiers changed from: protected */
        public static Type b(int i4, ParameterizedType parameterizedType) {
            return O.g(i4, parameterizedType);
        }

        protected static Class c(Type type) {
            return O.h(type);
        }

        public abstract C0878e a(Type type, Annotation[] annotationArr, K k4);
    }

    Type a();

    Object b(C0877d dVar);
}
