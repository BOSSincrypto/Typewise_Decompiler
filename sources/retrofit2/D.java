package retrofit2;

import android.os.Build;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

class D {

    static final class a extends D {
        a() {
        }

        /* access modifiers changed from: package-private */
        public Object b(Method method, Class cls, Object obj, Object[] objArr) {
            if (Build.VERSION.SDK_INT >= 26) {
                return t.a(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }

        /* access modifiers changed from: package-private */
        public boolean c(Method method) {
            return method.isDefault();
        }
    }

    static class b extends D {
        b() {
        }

        /* access modifiers changed from: package-private */
        public String a(Method method, int i4) {
            Parameter parameter = method.getParameters()[i4];
            if (!parameter.isNamePresent()) {
                return D.super.a(method, i4);
            }
            return "parameter '" + parameter.getName() + '\'';
        }

        /* access modifiers changed from: package-private */
        public Object b(Method method, Class cls, Object obj, Object[] objArr) {
            return t.a(method, cls, obj, objArr);
        }

        /* access modifiers changed from: package-private */
        public boolean c(Method method) {
            return method.isDefault();
        }
    }

    D() {
    }

    /* access modifiers changed from: package-private */
    public String a(Method method, int i4) {
        return "parameter #" + (i4 + 1);
    }

    /* access modifiers changed from: package-private */
    public Object b(Method method, Class cls, Object obj, Object[] objArr) {
        throw new AssertionError();
    }

    /* access modifiers changed from: package-private */
    public boolean c(Method method) {
        return false;
    }
}
