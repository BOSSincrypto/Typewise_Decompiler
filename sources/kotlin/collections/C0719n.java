package kotlin.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

/* renamed from: kotlin.collections.n  reason: case insensitive filesystem */
abstract class C0719n {
    public static List a(List list) {
        o.e(list, "builder");
        return ((ListBuilder) list).build();
    }

    public static final Object[] b(Object[] objArr, boolean z3) {
        o.e(objArr, "<this>");
        Class<Object[]> cls = Object[].class;
        if (z3 && o.a(objArr.getClass(), cls)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, cls);
        o.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static List c() {
        return new ListBuilder(0, 1, (i) null);
    }

    public static List d(int i4) {
        return new ListBuilder(i4);
    }

    public static List e(Object obj) {
        List singletonList = Collections.singletonList(obj);
        o.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static Object[] f(int i4, Object[] objArr) {
        o.e(objArr, "array");
        if (i4 < objArr.length) {
            objArr[i4] = null;
        }
        return objArr;
    }
}
