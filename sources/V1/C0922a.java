package v1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: v1.a  reason: case insensitive filesystem */
public abstract class C0922a {

    /* renamed from: v1.a$a  reason: collision with other inner class name */
    public static final class C0246a {

        /* renamed from: a  reason: collision with root package name */
        private final List f16390a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private final Object f16391b;

        /* synthetic */ C0246a(Object obj, C0924c cVar) {
            C0923b.a(obj);
            this.f16391b = obj;
        }

        public C0246a a(String str, Object obj) {
            List list = this.f16390a;
            C0923b.a(str);
            String valueOf = String.valueOf(obj);
            list.add(str + "=" + valueOf);
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f16391b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f16390a.size();
            for (int i4 = 0; i4 < size; i4++) {
                sb.append((String) this.f16390a.get(i4));
                if (i4 < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static C0246a c(Object obj) {
        return new C0246a(obj, (C0924c) null);
    }
}
