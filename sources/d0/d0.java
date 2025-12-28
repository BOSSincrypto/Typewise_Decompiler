package D0;

import E0.h;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C0718m;
import kotlin.collections.y;
import kotlin.jvm.internal.o;
import n2.C0830a;
import u2.l;
import u2.p;

public abstract class d0 {

    public static final class a implements Comparator {
        public final int compare(Object obj, Object obj2) {
            return C0830a.a((Comparable) ((y) obj2).b(), (Comparable) ((y) obj).b());
        }
    }

    /* access modifiers changed from: private */
    public static final float h(float f4) {
        return (float) Math.log((double) f4);
    }

    /* access modifiers changed from: private */
    public static final int i(int i4, int i5) {
        return i4 / i5;
    }

    public static final E j(E e4) {
        o.e(e4, "x");
        return m(e4, new W(), new X());
    }

    public static final E k(E e4, E e5) {
        o.e(e4, "x");
        o.e(e5, "y");
        return l(e4, e5, new a0(), new b0());
    }

    private static final E l(E e4, E e5, p pVar, p pVar2) {
        try {
            Pair i4 = J.i(e4, e5);
            E e6 = (E) i4.getFirst();
            E e7 = (E) i4.getSecond();
            List d4 = e6.d();
            List d5 = e7.d();
            ArrayList arrayList = new ArrayList();
            int size = d4.size();
            for (int i5 = 0; i5 < size; i5++) {
                arrayList.add(pVar.invoke(d4.get(i5), d5.get(i5)));
            }
            return (E) pVar2.invoke(e6.i(), arrayList);
        } catch (IllegalArgumentException e8) {
            List i6 = e4.i();
            List i7 = e5.i();
            throw new IllegalArgumentException("Shapes " + i6 + " and " + i7 + " are incompatible.", e8);
        }
    }

    private static final E m(E e4, l lVar, p pVar) {
        ArrayList arrayList = new ArrayList();
        List d4 = e4.d();
        int size = d4.size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.add(lVar.invoke(d4.get(i4)));
        }
        return (E) pVar.invoke(e4.i(), arrayList);
    }

    /* access modifiers changed from: private */
    public static final E n(List list, List list2) {
        o.e(list, "shape");
        o.e(list2, "data");
        return E.f232d.d(list, list2);
    }

    public static final Pair o(E e4, int i4, boolean z3) {
        o.e(e4, "input");
        return p(e4, i4, z3, new a(), new c0());
    }

    private static final Pair p(E e4, int i4, boolean z3, Comparator comparator, p pVar) {
        int i5 = i4;
        Comparator comparator2 = comparator;
        p pVar2 = pVar;
        if (e4.d().isEmpty()) {
            throw new IllegalArgumentException("Input cannot be an empty Tensor!");
        } else if (i5 < 0) {
            throw new IllegalArgumentException(("k must be greater or equal to 0, supplied value was " + i5 + ".").toString());
        } else if (((Number) C0718m.b0(e4.i())).intValue() >= i5) {
            int i6 = 0;
            if (i5 == 0) {
                return new Pair(pVar2.invoke(C0718m.e(0), C0718m.j()), E.f232d.c());
            }
            int i7 = 1;
            if (e4.h() == 1) {
                List<y> v02 = C0718m.v0(C0718m.r0(C0718m.I0(e4.d()), comparator2), i5);
                ArrayList arrayList = new ArrayList(C0718m.t(v02, 10));
                for (y a4 : v02) {
                    arrayList.add(Integer.valueOf(a4.a()));
                }
                ArrayList arrayList2 = new ArrayList(C0718m.t(v02, 10));
                for (y b4 : v02) {
                    arrayList2.add(b4.b());
                }
                return new Pair(pVar2.invoke(C0718m.e(Integer.valueOf(i4)), arrayList2), E.f232d.d(C0718m.e(Integer.valueOf(i4)), arrayList));
            }
            int i8 = 2;
            if (e4.h() == 2) {
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                List d4 = e4.d();
                List i9 = e4.i();
                int intValue = ((Number) i9.get(0)).intValue();
                int i10 = 0;
                while (i10 < intValue) {
                    int intValue2 = ((Number) i9.get(i7)).intValue() * i10;
                    i10++;
                    List<y> v03 = C0718m.v0(C0718m.r0(C0718m.I0(d4.subList(intValue2, ((Number) i9.get(i7)).intValue() * i10)), comparator2), i5);
                    ArrayList arrayList5 = new ArrayList(C0718m.t(v03, 10));
                    for (y a5 : v03) {
                        arrayList5.add(Integer.valueOf(a5.a()));
                    }
                    arrayList4.addAll(arrayList5);
                    ArrayList arrayList6 = new ArrayList(C0718m.t(v03, 10));
                    for (y b5 : v03) {
                        arrayList6.add(b5.b());
                    }
                    arrayList3.addAll(arrayList6);
                    i7 = 1;
                }
                List m4 = C0718m.m(i9.get(0), Integer.valueOf(i4));
                return new Pair(pVar2.invoke(m4, arrayList3), E.f232d.d(m4, arrayList4));
            }
            int i11 = 3;
            if (e4.h() == 3) {
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                List d5 = e4.d();
                List i12 = e4.i();
                int intValue3 = ((Number) i12.get(0)).intValue();
                int i13 = 0;
                while (i13 < intValue3) {
                    int i14 = 1;
                    int intValue4 = ((Number) i12.get(1)).intValue();
                    int i15 = i6;
                    while (i15 < intValue4) {
                        List<y> v04 = C0718m.v0(C0718m.r0(C0718m.I0(d5.subList(((((Number) i12.get(i14)).intValue() * i13) + i15) * ((Number) i12.get(i8)).intValue(), ((Number) i12.get(i8)).intValue() * ((((Number) i12.get(i14)).intValue() * i13) + i15 + 1))), comparator2), i5);
                        ArrayList arrayList9 = new ArrayList(C0718m.t(v04, 10));
                        for (y a6 : v04) {
                            arrayList9.add(Integer.valueOf(a6.a()));
                        }
                        arrayList8.addAll(arrayList9);
                        ArrayList arrayList10 = new ArrayList(C0718m.t(v04, 10));
                        for (y b6 : v04) {
                            arrayList10.add(b6.b());
                        }
                        arrayList7.addAll(arrayList10);
                        i15++;
                        i8 = 2;
                        i14 = 1;
                    }
                    i13++;
                    i6 = 0;
                    i11 = 3;
                    i8 = 2;
                }
                Object[] objArr = new Integer[i11];
                objArr[0] = i12.get(0);
                objArr[1] = i12.get(1);
                objArr[2] = Integer.valueOf(i4);
                List m5 = C0718m.m(objArr);
                return new Pair(pVar2.invoke(m5, arrayList7), E.f232d.d(m5, arrayList8));
            }
            throw new IllegalArgumentException("Cannot perform 'tf.math.top_k()' on a Tensor of rank " + e4.h() + "! Only 1D, 2D and 3D Tensors are supported.");
        } else {
            throw new IllegalArgumentException(("Input Tensor must have at least k columns. Had " + C0718m.b0(e4.i()) + ", needed " + i5 + ".").toString());
        }
    }

    /* access modifiers changed from: private */
    public static final int q(int i4, int i5) {
        int i6 = i4 % i5;
        return i6 + (i5 & (((i6 ^ i5) & ((-i6) | i6)) >> 31));
    }

    public static final E r(E e4) {
        o.e(e4, "x");
        ArrayList arrayList = new ArrayList();
        List d4 = e4.d();
        int size = d4.size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.add(Integer.valueOf(h.b(!h.a(((Number) d4.get(i4)).intValue()))));
        }
        return E.f232d.d(e4.i(), arrayList);
    }

    public static final E s(E e4, E e5) {
        o.e(e4, "x");
        o.e(e5, "y");
        return t(e4, e5, new Y(), new Z());
    }

    private static final E t(E e4, E e5, p pVar, p pVar2) {
        try {
            Pair i4 = J.i(e4, e5);
            E e6 = (E) i4.getFirst();
            E e7 = (E) i4.getSecond();
            List d4 = e6.d();
            List d5 = e7.d();
            ArrayList arrayList = new ArrayList();
            int size = d4.size();
            for (int i5 = 0; i5 < size; i5++) {
                arrayList.add(pVar.invoke(d4.get(i5), d5.get(i5)));
            }
            return (E) pVar2.invoke(e6.i(), arrayList);
        } catch (IllegalArgumentException e8) {
            List i6 = e4.i();
            List i7 = e5.i();
            throw new IllegalArgumentException("Shapes " + i6 + " and " + i7 + " are incompatible.", e8);
        }
    }

    /* access modifiers changed from: private */
    public static final E u(List list, List list2) {
        o.e(list, "shape");
        o.e(list2, "data");
        return E.f232d.b(list, list2);
    }

    /* access modifiers changed from: private */
    public static final E v(List list, List list2) {
        o.e(list, "shape");
        o.e(list2, "data");
        return E.f232d.d(list, list2);
    }

    /* access modifiers changed from: private */
    public static final E w(List list, List list2) {
        o.e(list, "shape");
        o.e(list2, "data");
        return E.f232d.b(list, list2);
    }
}
