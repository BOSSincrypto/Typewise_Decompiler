package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: retrofit2.k  reason: case insensitive filesystem */
public interface C0884k {

    /* renamed from: retrofit2.k$a */
    public static abstract class a {
        protected static Type a(int i4, ParameterizedType parameterizedType) {
            return O.g(i4, parameterizedType);
        }

        protected static Class b(Type type) {
            return O.h(type);
        }

        public C0884k c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, K k4) {
            return null;
        }

        public abstract C0884k d(Type type, Annotation[] annotationArr, K k4);

        public C0884k e(Type type, Annotation[] annotationArr, K k4) {
            return null;
        }
    }

    Object a(Object obj);
}
