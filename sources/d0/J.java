package D0;

import E0.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.o;
import u2.p;

public abstract class J {
    public static final E b(E e4) {
        List m4;
        o.e(e4, "<this>");
        int h4 = e4.h();
        if (h4 == 1) {
            m4 = C0718m.m(e4.i().get(0), 1);
        } else if (h4 == 2) {
            m4 = C0718m.m(e4.i().get(0), 1, e4.i().get(1));
        } else {
            throw new IllegalArgumentException("Tensor must be 1D or 2D Tensor.");
        }
        return C.p0(e4, m4);
    }

    public static final E c(E e4, int i4) {
        o.e(e4, "<this>");
        List i5 = e4.i();
        if (i4 < 0) {
            i4 += ((Number) i5.get(0)).intValue();
        }
        return e4.b(i4);
    }

    private static final E d(E e4, int i4, p pVar) {
        Object invoke;
        List i5 = e4.i();
        if (i4 <= ((Number) i5.get(0)).intValue()) {
            if (i4 == ((Number) i5.get(0)).intValue()) {
                invoke = pVar.invoke(C0718m.e(0), C0718m.j());
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Integer.valueOf(((Number) i5.get(0)).intValue() - i4));
                arrayList.addAll(i5.subList(1, i5.size()));
                ArrayList arrayList2 = new ArrayList();
                int intValue = ((Number) arrayList.get(0)).intValue();
                for (int i6 = 0; i6 < intValue; i6++) {
                    arrayList2.addAll(e4.b(i6).d());
                }
                invoke = pVar.invoke(arrayList, arrayList2);
            }
            return (E) invoke;
        }
        throw new IllegalArgumentException("Count must be less than or equal to the size of the Tensor.");
    }

    public static final E e(E e4, E e5) {
        o.e(e4, "<this>");
        o.e(e5, "other");
        if (e4.h() >= 4) {
            throw new IllegalArgumentException("Only 1D, 2D and 3D tensors are supported!");
        } else if (e5.h() < 4) {
            try {
                Pair i4 = i(e4, e5);
                E e6 = (E) i4.getFirst();
                E e7 = (E) i4.getSecond();
                List d4 = e6.d();
                List d5 = e7.d();
                ArrayList arrayList = new ArrayList();
                int size = d4.size();
                for (int i5 = 0; i5 < size; i5++) {
                    arrayList.add(Integer.valueOf(((Number) d4.get(i5)).intValue() & ((Number) d5.get(i5)).intValue()));
                }
                return E.f232d.d(e6.i(), arrayList);
            } catch (IllegalArgumentException e8) {
                List i6 = e4.i();
                List i7 = e5.i();
                throw new IllegalArgumentException("Shapes " + i6 + " and " + i7 + " are incompatible.", e8);
            }
        } else {
            throw new IllegalArgumentException("Only 1D, 2D and 3D tensors are supported!");
        }
    }

    /* access modifiers changed from: private */
    public static final E f(List list, List list2) {
        o.e(list, "shape");
        o.e(list2, "data");
        return E.f232d.d(list, list2);
    }

    public static final E g(E e4) {
        List m4;
        o.e(e4, "<this>");
        int h4 = e4.h();
        if (h4 == 1) {
            m4 = C0718m.m(e4.i().get(0), 1);
        } else if (h4 == 2) {
            m4 = C0718m.m(e4.i().get(0), 1, e4.i().get(1));
        } else {
            throw new IllegalArgumentException("Tensor must be 1D or 2D Tensor.");
        }
        return C.X(e4, m4);
    }

    public static final E h(E e4, int i4) {
        o.e(e4, "<this>");
        return d(e4, i4, new I());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0059, code lost:
        if (r2.d().size() < r3.d().size()) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlin.Pair i(D0.E r2, D0.E r3) {
        /*
            java.lang.String r0 = "tensor1"
            kotlin.jvm.internal.o.e(r2, r0)
            java.lang.String r0 = "tensor2"
            kotlin.jvm.internal.o.e(r3, r0)
            java.util.List r0 = r2.i()
            java.util.List r1 = r3.i()
            boolean r0 = E0.m.b(r0, r1)
            if (r0 != 0) goto L_0x0063
            int r0 = r2.h()
            int r1 = r3.h()
            if (r0 <= r1) goto L_0x0023
            goto L_0x0040
        L_0x0023:
            int r0 = r2.h()
            int r1 = r3.h()
            if (r0 >= r1) goto L_0x002e
            goto L_0x005b
        L_0x002e:
            java.util.List r0 = r2.d()
            int r0 = r0.size()
            java.util.List r1 = r3.d()
            int r1 = r1.size()
            if (r0 <= r1) goto L_0x0049
        L_0x0040:
            java.util.List r0 = r2.i()
            D0.E r3 = r3.c(r0)
            goto L_0x0063
        L_0x0049:
            java.util.List r0 = r2.d()
            int r0 = r0.size()
            java.util.List r1 = r3.d()
            int r1 = r1.size()
            if (r0 >= r1) goto L_0x0063
        L_0x005b:
            java.util.List r0 = r3.i()
            D0.E r2 = r2.c(r0)
        L_0x0063:
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.J.i(D0.E, D0.E):kotlin.Pair");
    }

    public static final E j(E e4) {
        o.e(e4, "<this>");
        if (e4.h() <= 2) {
            List o4 = C0718m.o(1);
            o4.addAll(e4.i());
            return E.f232d.b(o4, e4.d());
        }
        throw new IllegalArgumentException("Tensor must be 1D or 2D Tensor.");
    }

    public static final Pair k(E e4, E e5) {
        E e6;
        o.e(e4, "tensor1");
        o.e(e5, "tensor2");
        Pair q4 = q(e4, e5);
        E e7 = (E) q4.component1();
        E e8 = (E) q4.component2();
        try {
            e6 = e8.c(e7.i());
        } catch (IllegalArgumentException unused) {
            List i4 = e7.i();
            int size = i4.size() - e8.i().size();
            ArrayList arrayList = new ArrayList(size);
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                arrayList.add(1);
            }
            List i02 = C0718m.i0(arrayList, e8.i());
            int size2 = i02.size();
            while (i5 < size2) {
                if (((Number) i02.get(i5)).intValue() == ((Number) i4.get(i5)).intValue() || ((Number) i02.get(i5)).intValue() == 1 || ((Number) i4.get(i5)).intValue() == 1) {
                    i5++;
                } else {
                    throw new IllegalArgumentException("Unable to broadcast tensor of shape " + i4 + " to tensor of shape " + e8.i() + ".");
                }
            }
            Iterator it = i4.iterator();
            Iterator it2 = i02.iterator();
            ArrayList arrayList2 = new ArrayList(Math.min(C0718m.t(i4, 10), C0718m.t(i02, 10)));
            while (it.hasNext() && it2.hasNext()) {
                arrayList2.add(Integer.valueOf(((Number) it.next()).intValue() * ((Number) it2.next()).intValue()));
            }
            e7 = e7.c(arrayList2);
            e6 = e8.c(arrayList2);
        }
        return new Pair(e7, e6);
    }

    public static final E l(E e4) {
        o.e(e4, "<this>");
        if (e4.h() > 1) {
            List i4 = e4.i();
            ArrayList arrayList = new ArrayList();
            int intValue = ((Number) i4.get(0)).intValue();
            for (int i5 = 0; i5 < intValue; i5++) {
                E b4 = e4.b(i5);
                arrayList.addAll(b4.b(((Number) b4.i().get(0)).intValue() - 1).d());
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(i4.get(0));
            List D02 = C0718m.D0(e4.b(0).i());
            D02.set(0, 1);
            arrayList2.addAll(D02);
            return E.f232d.d(arrayList2, arrayList);
        }
        throw new IllegalArgumentException("Tensor must be at least 2D Tensor.");
    }

    public static final E m(E e4, E e5) {
        int i4;
        o.e(e4, "tensor1");
        o.e(e5, "tensor2");
        Pair i5 = i(e4, e5);
        E e6 = (E) i5.component1();
        List d4 = e6.d();
        List d5 = ((E) i5.component2()).d();
        ArrayList arrayList = new ArrayList();
        int size = d4.size();
        for (int i6 = 0; i6 < size; i6++) {
            if (((Number) d4.get(i6)).floatValue() > ((Number) d5.get(i6)).floatValue()) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            arrayList.add(i4);
        }
        return E.f232d.d(e6.i(), arrayList);
    }

    public static final E n(E e4) {
        o.e(e4, "<this>");
        int h4 = e4.h();
        if (2 > h4 || h4 >= 4) {
            throw new IllegalArgumentException("Tensor must be 2D or 3D Tensor.");
        }
        ArrayList arrayList = new ArrayList();
        int intValue = ((Number) e4.i().get(0)).intValue();
        for (int i4 = 0; i4 < intValue; i4++) {
            E b4 = e4.b(i4);
            arrayList.addAll(b4.b(((Number) C0718m.b0(b4.i())).intValue() - 1).d());
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(e4.i().get(0));
        if (h4 == 3) {
            arrayList2.addAll(e4.b(0).b(0).i());
        }
        return E.f232d.d(arrayList2, arrayList);
    }

    public static final E o(E e4, E e5) {
        o.e(e4, "<this>");
        o.e(e5, "other");
        Pair i4 = i(e4, e5);
        E e6 = (E) i4.component1();
        List d4 = e6.d();
        List d5 = ((E) i4.component2()).d();
        ArrayList arrayList = new ArrayList();
        int size = d4.size();
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.add(Integer.valueOf(((Number) d4.get(i5)).intValue() - ((Number) d5.get(i5)).intValue()));
        }
        return E.f232d.d(e6.i(), arrayList);
    }

    public static final E p(E e4) {
        o.e(e4, "<this>");
        List<Number> d4 = e4.d();
        ArrayList arrayList = new ArrayList(C0718m.t(d4, 10));
        for (Number intValue : d4) {
            arrayList.add(Float.valueOf((float) intValue.intValue()));
        }
        return E.f232d.b(e4.i(), arrayList);
    }

    private static final Pair q(E e4, E e5) {
        if (m.b(e4.i(), e5.i())) {
            return new Pair(e4, e5);
        }
        if (e4.h() > e5.h()) {
            return new Pair(e4, e5);
        }
        if (e4.h() < e5.h()) {
            return new Pair(e5, e4);
        }
        if (e4.d().size() >= e5.d().size()) {
            return new Pair(e4, e5);
        }
        return new Pair(e5, e4);
    }

    public static final E r(E e4, E e5) {
        o.e(e4, "<this>");
        o.e(e5, "other");
        Pair i4 = i(e4, e5);
        E e6 = (E) i4.component1();
        List d4 = e6.d();
        List d5 = ((E) i4.component2()).d();
        ArrayList arrayList = new ArrayList();
        int size = d4.size();
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.add(Float.valueOf(((Number) d4.get(i5)).floatValue() + ((Number) d5.get(i5)).floatValue()));
        }
        return E.f232d.b(e6.i(), arrayList);
    }

    public static final E s(E e4, E e5) {
        o.e(e4, "<this>");
        o.e(e5, "other");
        Pair i4 = i(e4, e5);
        E e6 = (E) i4.component1();
        List d4 = e6.d();
        List d5 = ((E) i4.component2()).d();
        ArrayList arrayList = new ArrayList();
        int size = d4.size();
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.add(Integer.valueOf(((Number) d4.get(i5)).intValue() + ((Number) d5.get(i5)).intValue()));
        }
        return E.f232d.d(e6.i(), arrayList);
    }

    public static final E t(E e4, E e5) {
        int i4;
        o.e(e4, "tensor1");
        o.e(e5, "tensor2");
        try {
            Pair k4 = k(e4, e5);
            E e6 = (E) k4.getFirst();
            E e7 = (E) k4.getSecond();
            List d4 = e6.d();
            List d5 = e7.d();
            ArrayList arrayList = new ArrayList();
            int size = d4.size();
            for (int i5 = 0; i5 < size; i5++) {
                if (((Number) d4.get(i5)).intValue() == ((Number) d5.get(i5)).intValue()) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                arrayList.add(i4);
            }
            return E.f232d.d(e6.i(), arrayList);
        } catch (IllegalArgumentException unused) {
            return E.f232d.d(C0718m.e(1), C0718m.e(0));
        }
    }

    public static final E u(E e4, E e5) {
        o.e(e4, "<this>");
        o.e(e5, "other");
        Pair i4 = i(e4, e5);
        E e6 = (E) i4.component1();
        List d4 = e6.d();
        List d5 = ((E) i4.component2()).d();
        ArrayList arrayList = new ArrayList();
        int size = d4.size();
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.add(Float.valueOf(((Number) d4.get(i5)).floatValue() * ((Number) d5.get(i5)).floatValue()));
        }
        return E.f232d.b(e6.i(), arrayList);
    }
}
