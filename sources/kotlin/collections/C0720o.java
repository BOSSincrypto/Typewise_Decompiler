package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.o;
import n2.C0830a;
import z2.c;

/* renamed from: kotlin.collections.o  reason: case insensitive filesystem */
abstract class C0720o extends C0719n {
    public static final Collection g(Object[] objArr) {
        o.e(objArr, "<this>");
        return new C0711f(objArr, false);
    }

    public static final int h(List list, Comparable comparable, int i4, int i5) {
        o.e(list, "<this>");
        q(list.size(), i4, i5);
        int i6 = i5 - 1;
        while (i4 <= i6) {
            int i7 = (i4 + i6) >>> 1;
            int a4 = C0830a.a((Comparable) list.get(i7), comparable);
            if (a4 < 0) {
                i4 = i7 + 1;
            } else if (a4 <= 0) {
                return i7;
            } else {
                i6 = i7 - 1;
            }
        }
        return -(i4 + 1);
    }

    public static /* synthetic */ int i(List list, Comparable comparable, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = list.size();
        }
        return h(list, comparable, i4, i5);
    }

    public static List j() {
        return EmptyList.INSTANCE;
    }

    public static c k(Collection collection) {
        o.e(collection, "<this>");
        return new c(0, collection.size() - 1);
    }

    public static int l(List list) {
        o.e(list, "<this>");
        return list.size() - 1;
    }

    public static List m(Object... objArr) {
        o.e(objArr, "elements");
        if (objArr.length > 0) {
            return C0713h.c(objArr);
        }
        return C0718m.j();
    }

    public static List n(Object... objArr) {
        o.e(objArr, "elements");
        return C0713h.x(objArr);
    }

    public static List o(Object... objArr) {
        o.e(objArr, "elements");
        if (objArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new C0711f(objArr, true));
    }

    public static final List p(List list) {
        o.e(list, "<this>");
        int size = list.size();
        if (size == 0) {
            return C0718m.j();
        }
        if (size != 1) {
            return list;
        }
        return C0718m.e(list.get(0));
    }

    private static final void q(int i4, int i5, int i6) {
        if (i5 > i6) {
            throw new IllegalArgumentException("fromIndex (" + i5 + ") is greater than toIndex (" + i6 + ").");
        } else if (i5 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i5 + ") is less than zero.");
        } else if (i6 > i4) {
            throw new IndexOutOfBoundsException("toIndex (" + i6 + ") is greater than size (" + i4 + ").");
        }
    }

    public static void r() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void s() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
