package D0;

import E0.h;
import E0.m;
import K2.C0341a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.o;
import t0.c;
import u2.l;
import u2.p;

public abstract class C {
    public static final E A(E e4) {
        o.e(e4, "x");
        List<Number> d4 = e4.d();
        ArrayList arrayList = new ArrayList(C0718m.t(d4, 10));
        for (Number floatValue : d4) {
            arrayList.add(Float.valueOf((float) Math.exp((double) floatValue.floatValue())));
        }
        return E.f232d.b(e4.i(), arrayList);
    }

    public static final E A0(E e4, E e5) {
        o.e(e4, "input");
        o.e(e5, "multiples");
        return Q(e4, e5, new C0273i());
    }

    public static final E B(E e4, int i4) {
        o.e(e4, "input");
        return E(e4, i4, new B());
    }

    public static final E B0(List list) {
        o.e(list, "values");
        if (list.isEmpty()) {
            return E.f232d.a();
        }
        List m4 = C0718m.m(Integer.valueOf(list.size()), Integer.valueOf(((List) C0718m.R(list)).size()));
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.addAll((List) it.next());
        }
        return E.f232d.b(m4, arrayList);
    }

    public static final E C(E e4, int i4, int i5, int i6, Integer num) {
        Integer valueOf;
        o.e(e4, "indices");
        if (e4.h() >= 3) {
            throw new IllegalArgumentException("oneHot() supports only 0D, 1D and 2D Tensors!");
        } else if (i4 <= 0) {
            throw new IllegalArgumentException(("Depth must be greater than 0. Actual value was " + i4 + ".").toString());
        } else if (num == null || num.intValue() == -1) {
            List D02 = C0718m.D0(e4.i());
            D02.add(Integer.valueOf(i4));
            ArrayList arrayList = new ArrayList();
            List d4 = e4.d();
            int size = d4.size();
            for (int i7 = 0; i7 < size; i7++) {
                for (int i8 = 0; i8 < i4; i8++) {
                    if (i8 == ((Number) d4.get(i7)).intValue()) {
                        valueOf = Integer.valueOf(i5);
                    } else {
                        valueOf = Integer.valueOf(i6);
                    }
                    arrayList.add(valueOf);
                }
            }
            return E.f232d.d(D02, arrayList);
        } else {
            throw new IllegalArgumentException(("Axis must either be: null or -1. Actual value is " + num + ".").toString());
        }
    }

    /* access modifiers changed from: private */
    public static final E C0(List list, List list2) {
        o.e(list, "shape");
        o.e(list2, "data");
        return E.f232d.d(list, list2);
    }

    public static /* synthetic */ E D(E e4, int i4, int i5, int i6, Integer num, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            i5 = 1;
        }
        if ((i7 & 8) != 0) {
            i6 = 0;
        }
        if ((i7 & 16) != 0) {
            num = null;
        }
        return C(e4, i4, i5, i6, num);
    }

    public static final E D0(List list) {
        o.e(list, "values");
        if (list.isEmpty()) {
            return E.f232d.c();
        }
        List m4 = C0718m.m(Integer.valueOf(list.size()), Integer.valueOf(((List) C0718m.R(list)).size()));
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.addAll((List) it.next());
        }
        return E.f232d.d(m4, arrayList);
    }

    private static final E E(E e4, int i4, p pVar) {
        if (e4.h() >= 3) {
            throw new IllegalArgumentException("Only 1D and 2D tensors are supported!");
        } else if (i4 < (-(e4.h() + 1)) || i4 > e4.h()) {
            int h4 = e4.h();
            throw new IllegalArgumentException(("Tried to expand dim index " + i4 + " for tensor with " + h4 + " dimensions.").toString());
        } else {
            if (i4 < 0) {
                i4 = i4 + e4.h() + 1;
            }
            List D02 = C0718m.D0(e4.i());
            m.f(D02, i4, 1);
            return (E) pVar.invoke(D02, e4.d());
        }
    }

    /* access modifiers changed from: private */
    public static final E E0(List list, List list2) {
        o.e(list, "shape");
        o.e(list2, "data");
        return E.f232d.b(list, list2);
    }

    public static final E F(E e4, E e5) {
        o.e(e4, "x");
        o.e(e5, "y");
        if (e4.h() >= 4) {
            throw new IllegalArgumentException("Only 1D, 2D and 3D tensors are supported!");
        } else if (e5.h() < 4) {
            try {
                Pair i4 = J.i(e4, e5);
                E e6 = (E) i4.getFirst();
                E e7 = (E) i4.getSecond();
                List d4 = e6.d();
                List d5 = e7.d();
                ArrayList arrayList = new ArrayList();
                int size = d4.size();
                for (int i5 = 0; i5 < size; i5++) {
                    arrayList.add(Integer.valueOf(o.a(d4.get(i5), d5.get(i5)) ? 1 : 0));
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

    public static final E F0(List list) {
        o.e(list, "values");
        if (list.isEmpty()) {
            return E.f232d.a();
        }
        if (((List) C0718m.R(list)).isEmpty()) {
            return E.f232d.b(C0718m.m(Integer.valueOf(list.size()), 0, 0), C0718m.j());
        }
        List m4 = C0718m.m(Integer.valueOf(list.size()), Integer.valueOf(((List) C0718m.R(list)).size()), Integer.valueOf(((List) C0718m.R((List) C0718m.R(list))).size()));
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (List addAll : (List) it.next()) {
                arrayList.addAll(addAll);
            }
        }
        return E.f232d.b(m4, arrayList);
    }

    public static final E G(E e4, E e5, int i4) {
        o.e(e4, "params");
        o.e(e5, "indices");
        return I(e4, e5, i4, new C0283t());
    }

    /* access modifiers changed from: private */
    public static final E G0(List list, List list2) {
        o.e(list, "shape");
        o.e(list2, "data");
        return E.f232d.d(list, list2);
    }

    public static /* synthetic */ E H(E e4, E e5, int i4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            i4 = 0;
        }
        return G(e4, e5, i4);
    }

    public static final E H0(List list) {
        o.e(list, "values");
        if (list.isEmpty()) {
            return E.f232d.c();
        }
        if (((List) C0718m.R(list)).isEmpty()) {
            return E.f232d.d(C0718m.m(Integer.valueOf(list.size()), 0, 0), C0718m.j());
        }
        List m4 = C0718m.m(Integer.valueOf(list.size()), Integer.valueOf(((List) C0718m.R(list)).size()), Integer.valueOf(((List) C0718m.R((List) C0718m.R(list))).size()));
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (List addAll : (List) it.next()) {
                arrayList.addAll(addAll);
            }
        }
        return E.f232d.d(m4, arrayList);
    }

    private static final E I(E e4, E e5, int i4, p pVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Object invoke;
        E e6 = e4;
        E e7 = e5;
        int i5 = i4;
        p pVar2 = pVar;
        if (e4.d().isEmpty()) {
            throw new IllegalArgumentException("Params cannot be an empty Tensor!");
        } else if (e5.d().isEmpty()) {
            throw new IllegalArgumentException("Indices cannot be an empty Tensor!");
        } else if (i5 != 0) {
            throw new IllegalArgumentException(("Behaviour for batchDims = " + i5 + ", not implemented!").toString());
        } else if (e4.h() >= e5.h()) {
            int i6 = 1;
            if (e4.h() == 1) {
                List d4 = e4.d();
                List<Number> d5 = e5.d();
                ArrayList arrayList3 = new ArrayList(C0718m.t(d5, 10));
                for (Number intValue : d5) {
                    arrayList3.add(d4.get(intValue.intValue()));
                }
                invoke = pVar2.invoke(C0718m.e(Integer.valueOf(arrayList3.size())), arrayList3);
            } else {
                int i7 = 0;
                if (e4.h() == 2) {
                    if (e5.h() == 1) {
                        E b4 = e6.b(((Number) e5.d().get(0)).intValue());
                        if (e5.d().size() == 2) {
                            return b4.b(((Number) e5.d().get(1)).intValue());
                        }
                        return b4;
                    } else if (e5.h() == 2) {
                        ArrayList arrayList4 = new ArrayList();
                        int intValue2 = ((Number) e5.i().get(0)).intValue();
                        for (int i8 = 0; i8 < intValue2; i8++) {
                            E b5 = e7.b(i8);
                            E b6 = e6.b(((Number) b5.d().get(0)).intValue());
                            if (((Number) b5.i().get(0)).intValue() == 1) {
                                arrayList4.add(b6);
                            } else {
                                arrayList4.add(b6.b(((Number) b5.d().get(1)).intValue()));
                            }
                        }
                        arrayList = new ArrayList();
                        arrayList.add(Integer.valueOf(arrayList4.size()));
                        if (((Number) ((E) C0718m.R(arrayList4)).i().get(0)).intValue() > 1) {
                            arrayList.add(((E) C0718m.R(arrayList4)).i().get(0));
                        }
                        arrayList2 = new ArrayList();
                        int size = arrayList4.size();
                        while (i7 < size) {
                            arrayList2.addAll(((E) arrayList4.get(i7)).d());
                            i7++;
                        }
                        invoke = pVar2.invoke(arrayList, arrayList2);
                    }
                }
                if (e4.h() == 3) {
                    if (e5.h() == 1) {
                        List d6 = e5.d();
                        int size2 = d6.size();
                        while (i7 < size2) {
                            e6 = e6.b(((Number) d6.get(i7)).intValue());
                            i7++;
                        }
                        return e6;
                    }
                    if (e5.h() == 2) {
                        List d7 = e5.d();
                        ArrayList arrayList5 = new ArrayList();
                        int intValue3 = ((Number) e5.i().get(0)).intValue();
                        for (int i9 = 0; i9 < intValue3; i9++) {
                            E b7 = e6.b(((Number) d7.get(((Number) e5.i().get(1)).intValue() * i9)).intValue());
                            if (((Number) e5.i().get(1)).intValue() != 1) {
                                b7 = b7.b(((Number) d7.get((((Number) e5.i().get(1)).intValue() * i9) + 1)).intValue());
                            }
                            arrayList5.add(b7);
                        }
                        arrayList = new ArrayList();
                        arrayList.add(Integer.valueOf(arrayList5.size()));
                        arrayList.addAll(((E) C0718m.R(arrayList5)).i());
                        arrayList2 = new ArrayList();
                        int size3 = arrayList5.size();
                        while (i7 < size3) {
                            arrayList2.addAll(((E) arrayList5.get(i7)).d());
                            i7++;
                        }
                    } else if (e5.h() == 3) {
                        ArrayList arrayList6 = new ArrayList();
                        int intValue4 = ((Number) e5.i().get(0)).intValue();
                        int i10 = 0;
                        while (i10 < intValue4) {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList6.add(arrayList7);
                            E b8 = e7.b(i10);
                            int intValue5 = ((Number) e5.i().get(i6)).intValue();
                            int i11 = 0;
                            while (i11 < intValue5) {
                                E b9 = b8.b(i11);
                                E b10 = e6.b(((Number) b9.d().get(0)).intValue());
                                int intValue6 = ((Number) b9.i().get(0)).intValue();
                                for (int i12 = i6; i12 < intValue6; i12++) {
                                    b10 = b10.b(((Number) b9.d().get(i12)).intValue());
                                }
                                arrayList7.add(b10);
                                i11++;
                                i6 = 1;
                            }
                            i10++;
                            i6 = 1;
                        }
                        arrayList = new ArrayList();
                        arrayList.add(Integer.valueOf(arrayList6.size()));
                        arrayList.add(Integer.valueOf(((List) C0718m.R(arrayList6)).size()));
                        if (((Number) ((E) C0718m.R((List) C0718m.R(arrayList6))).i().get(0)).intValue() > 1) {
                            arrayList.add(((E) C0718m.R((List) C0718m.R(arrayList6))).i().get(0));
                        }
                        arrayList2 = new ArrayList();
                        int size4 = arrayList6.size();
                        for (int i13 = 0; i13 < size4; i13++) {
                            List list = (List) arrayList6.get(i13);
                            int size5 = list.size();
                            for (int i14 = 0; i14 < size5; i14++) {
                                arrayList2.addAll(((E) list.get(i14)).d());
                            }
                        }
                    }
                    invoke = pVar2.invoke(arrayList, arrayList2);
                }
                throw new IllegalArgumentException("Cannot perform 'tf.gather_nd()' on a Tensor of rank " + e4.h() + "! Only 1D, 2D and 3D Tensors are supported.");
            }
            return (E) invoke;
        } else {
            throw new IllegalArgumentException("Params Tensor rank must be greater or equal to the indices Tensor rank!");
        }
    }

    /* access modifiers changed from: private */
    public static final E I0(List list, List list2) {
        o.e(list, "shape");
        o.e(list2, "data");
        return E.f232d.b(list, list2);
    }

    public static final E J(E e4, E e5, E e6) {
        Object obj;
        o.e(e4, "condition");
        o.e(e5, "x");
        o.e(e6, "y");
        if (e5.h() >= 4 || e6.h() >= 4) {
            throw new IllegalArgumentException("where() supports only 1D, 2D & 3D Tensors!");
        }
        Pair i4 = J.i(e5, e6);
        E e7 = (E) i4.component1();
        E e8 = (E) i4.component2();
        if (!m.b(e4.i(), e7.i())) {
            if (e4.h() <= e7.h() && (e4.h() < e7.h() || e4.d().size() <= e7.d().size())) {
                e4 = e4.c(e7.i());
            } else {
                e7 = e7.c(e4.i());
                e8 = e8.c(e4.i());
            }
        }
        List d4 = e4.d();
        List d5 = e7.d();
        List d6 = e8.d();
        ArrayList arrayList = new ArrayList();
        int size = d4.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (((Number) d4.get(i5)).intValue() == 1) {
                obj = d5.get(i5);
            } else {
                obj = d6.get(i5);
            }
            arrayList.add(obj);
        }
        return E.f232d.b(e7.i(), arrayList);
    }

    public static final E J0(List list) {
        o.e(list, "values");
        if (list.isEmpty()) {
            return E.f232d.e();
        }
        if (((List) C0718m.R(list)).isEmpty()) {
            return E.f232d.f(C0718m.m(Integer.valueOf(list.size()), 0, 0), C0718m.j());
        }
        List m4 = C0718m.m(Integer.valueOf(list.size()), Integer.valueOf(((List) C0718m.R(list)).size()), Integer.valueOf(((List) C0718m.R((List) C0718m.R(list))).size()));
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (List addAll : (List) it.next()) {
                arrayList.addAll(addAll);
            }
        }
        return E.f232d.f(m4, arrayList);
    }

    public static final E K(E e4, E e5, Boolean bool, Integer num) {
        o.e(e4, "params");
        o.e(e5, "indices");
        return M(e4, e5, bool, num, new C0271g());
    }

    /* access modifiers changed from: private */
    public static final E K0(List list, List list2) {
        o.e(list, "shape");
        o.e(list2, "data");
        return E.f232d.d(list, list2);
    }

    public static /* synthetic */ E L(E e4, E e5, Boolean bool, Integer num, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            bool = null;
        }
        if ((i4 & 8) != 0) {
            num = null;
        }
        return K(e4, e5, bool, num);
    }

    public static final E L0(List list) {
        o.e(list, "values");
        if (list.isEmpty()) {
            return E.f232d.e();
        }
        List m4 = C0718m.m(Integer.valueOf(list.size()), Integer.valueOf(((List) C0718m.R(list)).size()));
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.addAll((List) it.next());
        }
        return E.f232d.f(m4, arrayList);
    }

    private static final E M(E e4, E e5, Boolean bool, Integer num, p pVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Object invoke;
        if (e4.d().isEmpty()) {
            throw new IllegalArgumentException("Params cannot be an empty Tensor!");
        } else if (e5.d().isEmpty()) {
            throw new IllegalArgumentException("Indices cannot be an empty Tensor!");
        } else if (bool != null) {
            throw new IllegalArgumentException(("Behaviour for validateIndices = " + bool + ", not implemented!").toString());
        } else if (num != null) {
            throw new IllegalArgumentException(("Behaviour for axis = " + num + ", not implemented!").toString());
        } else if (e4.h() >= e5.h()) {
            if (e4.h() == 1) {
                List d4 = e4.d();
                List<Number> d5 = e5.d();
                ArrayList arrayList3 = new ArrayList(C0718m.t(d5, 10));
                for (Number intValue : d5) {
                    arrayList3.add(d4.get(intValue.intValue()));
                }
                invoke = pVar.invoke(C0718m.e(e5.i().get(0)), arrayList3);
            } else {
                if (e4.h() == 2) {
                    List d6 = e4.d();
                    arrayList = new ArrayList();
                    arrayList.addAll(e5.i());
                    arrayList.add(e4.i().get(1));
                    arrayList2 = new ArrayList();
                    if (e5.h() == 1) {
                        int intValue2 = ((Number) e5.i().get(0)).intValue();
                        for (int i4 = 0; i4 < intValue2; i4++) {
                            int intValue3 = ((Number) e5.d().get(i4)).intValue();
                            arrayList2.addAll(d6.subList(((Number) e4.i().get(1)).intValue() * intValue3, (intValue3 + 1) * ((Number) e4.i().get(1)).intValue()));
                        }
                    }
                    if (e5.h() == 2) {
                        int intValue4 = ((Number) e5.i().get(0)).intValue();
                        for (int i5 = 0; i5 < intValue4; i5++) {
                            int intValue5 = ((Number) e5.i().get(1)).intValue();
                            for (int i6 = 0; i6 < intValue5; i6++) {
                                int intValue6 = ((Number) e5.d().get((((Number) e5.i().get(1)).intValue() * i5) + i6)).intValue();
                                arrayList2.addAll(d6.subList(((Number) e4.i().get(1)).intValue() * intValue6, (intValue6 + 1) * ((Number) e4.i().get(1)).intValue()));
                            }
                        }
                    }
                } else if (e4.h() == 3) {
                    List d7 = e4.d();
                    arrayList = new ArrayList();
                    arrayList.addAll(e5.i());
                    arrayList.add(e4.i().get(1));
                    arrayList.add(e4.i().get(2));
                    arrayList2 = new ArrayList();
                    if (e5.h() == 1) {
                        int intValue7 = ((Number) e5.i().get(0)).intValue();
                        for (int i7 = 0; i7 < intValue7; i7++) {
                            int intValue8 = ((Number) e5.d().get(i7)).intValue();
                            arrayList2.addAll(d7.subList(((Number) e4.i().get(1)).intValue() * intValue8 * ((Number) e4.i().get(2)).intValue(), (intValue8 + 1) * ((Number) e4.i().get(1)).intValue() * ((Number) e4.i().get(2)).intValue()));
                        }
                    }
                    if (e5.h() > 1) {
                        throw new IllegalArgumentException("Cannot perform 'tf.gather()' on a 3D Tensor with indices of rank " + e5.h() + "! This operation would create a Tensor of rank higher than 3. Which is not supported by our API.");
                    }
                } else {
                    throw new IllegalArgumentException("Cannot perform 'tf.gather()' on a Tensor of rank " + e4.h() + "! Only 1D, 2D and 3D Tensors are supported.");
                }
                invoke = pVar.invoke(arrayList, arrayList2);
            }
            return (E) invoke;
        } else {
            throw new IllegalArgumentException("Params Tensor rank must be greater or equal to the indices Tensor rank!");
        }
    }

    /* access modifiers changed from: private */
    public static final E M0(List list, List list2) {
        o.e(list, "shape");
        o.e(list2, "data");
        return E.f232d.b(list, list2);
    }

    public static final E N(E e4, E e5, Integer num) {
        o.e(e4, "input");
        o.e(e5, "mask");
        return P(e4, e5, num, new C0287x());
    }

    public static final E N0(List list) {
        o.e(list, "values");
        return E.f232d.f(C0718m.e(Integer.valueOf(list.size())), list);
    }

    public static /* synthetic */ E O(E e4, E e5, Integer num, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            num = null;
        }
        return N(e4, e5, num);
    }

    /* access modifiers changed from: private */
    public static final E O0(List list, List list2) {
        o.e(list, "shape");
        o.e(list2, "data");
        return E.f232d.b(list, list2);
    }

    private static final E P(E e4, E e5, Integer num, p pVar) {
        ArrayList arrayList;
        Object invoke;
        List m4;
        int i4 = 0;
        if (!e4.d().isEmpty() || !e5.d().isEmpty()) {
            if (e4.d().isEmpty()) {
                throw new IllegalArgumentException("Input cannot be an empty Tensor if mask is not an empty Tensor!");
            } else if (e5.d().isEmpty()) {
                throw new IllegalArgumentException("Mask cannot be an empty Tensor if input is not an empty Tensor!");
            } else if (num != null) {
                throw new IllegalArgumentException(("Behaviour for axis = " + num + ", not implemented!").toString());
            } else if (e4.h() >= e5.h()) {
                if (e4.h() != 1) {
                    if (e4.h() == 2) {
                        if (e5.h() == 1) {
                            if (((Number) e4.i().get(0)).intValue() == ((Number) e5.i().get(0)).intValue()) {
                                List d4 = e5.d();
                                arrayList = new ArrayList();
                                int size = d4.size();
                                int i5 = 0;
                                for (int i6 = 0; i6 < size; i6++) {
                                    if (((Number) d4.get(i6)).intValue() == 1) {
                                        i5++;
                                        arrayList.addAll(e4.b(i6).d());
                                    }
                                }
                                if (i5 != 0) {
                                    m4 = C0718m.m(Integer.valueOf(i5), e4.i().get(1));
                                    invoke = pVar.invoke(m4, arrayList);
                                    return (E) invoke;
                                }
                            } else {
                                throw new IllegalArgumentException(("Shapes " + e4.i() + " and " + e5.i() + " are incompatible.").toString());
                            }
                        } else if (e5.h() == 2) {
                            if (m.b(e4.i(), e5.i())) {
                                List d5 = e5.d();
                                List d6 = e4.d();
                                arrayList = new ArrayList();
                                for (Object next : d6) {
                                    int i7 = i4 + 1;
                                    if (i4 < 0) {
                                        C0718m.s();
                                    }
                                    if (((Number) d5.get(i4)).intValue() == 1) {
                                        arrayList.add(next);
                                    }
                                    i4 = i7;
                                }
                            } else {
                                throw new IllegalArgumentException(("Shapes " + e4.i() + " and " + e5.i() + " are incompatible.").toString());
                            }
                        }
                    }
                    if (e4.h() == 3) {
                        if (e5.h() == 1) {
                            if (((Number) e4.i().get(0)).intValue() == ((Number) e5.i().get(0)).intValue()) {
                                List d7 = e5.d();
                                arrayList = new ArrayList();
                                int size2 = d7.size();
                                int i8 = 0;
                                for (int i9 = 0; i9 < size2; i9++) {
                                    if (((Number) d7.get(i9)).intValue() == 1) {
                                        i8++;
                                        arrayList.addAll(e4.b(i9).d());
                                    }
                                }
                                if (i8 != 0) {
                                    m4 = C0718m.m(Integer.valueOf(i8), e4.i().get(1), e4.i().get(2));
                                    invoke = pVar.invoke(m4, arrayList);
                                    return (E) invoke;
                                }
                            } else {
                                throw new IllegalArgumentException(("Shapes " + e4.i() + " and " + e5.i() + " are incompatible.").toString());
                            }
                        } else if (e5.h() == 2) {
                            List i10 = e5.i();
                            if (((Number) e4.i().get(0)).intValue() == ((Number) i10.get(0)).intValue() && ((Number) e4.i().get(1)).intValue() == ((Number) i10.get(1)).intValue()) {
                                ArrayList arrayList2 = new ArrayList();
                                int intValue = ((Number) i10.get(0)).intValue();
                                int i11 = 0;
                                for (int i12 = 0; i12 < intValue; i12++) {
                                    E b4 = e4.b(i12);
                                    List d8 = e5.b(i12).d();
                                    int size3 = d8.size();
                                    for (int i13 = 0; i13 < size3; i13++) {
                                        if (((Number) d8.get(i13)).intValue() == 1) {
                                            i11++;
                                            arrayList2.addAll(b4.b(i13).d());
                                        }
                                    }
                                }
                                if (arrayList2.size() != 0) {
                                    invoke = pVar.invoke(C0718m.m(Integer.valueOf(i11), e4.i().get(2)), arrayList2);
                                    return (E) invoke;
                                }
                            } else {
                                throw new IllegalArgumentException(("Shapes " + e4.i() + " and " + e5.i() + " are incompatible.").toString());
                            }
                        } else if (e5.h() == 3) {
                            if (m.b(e4.i(), e5.i())) {
                                List d9 = e5.d();
                                List d10 = e4.d();
                                arrayList = new ArrayList();
                                for (Object next2 : d10) {
                                    int i14 = i4 + 1;
                                    if (i4 < 0) {
                                        C0718m.s();
                                    }
                                    if (((Number) d9.get(i4)).intValue() == 1) {
                                        arrayList.add(next2);
                                    }
                                    i4 = i14;
                                }
                            } else {
                                throw new IllegalArgumentException(("Shapes " + e4.i() + " and " + e5.i() + " are incompatible.").toString());
                            }
                        }
                    }
                    throw new IllegalArgumentException("Cannot perform 'tf.boolean_mask()' on a Tensor of rank " + e4.h() + "! Only 1D, 2D and 3D Tensors are supported.");
                } else if (m.b(e4.i(), e5.i())) {
                    List d11 = e5.d();
                    List d12 = e4.d();
                    arrayList = new ArrayList();
                    for (Object next3 : d12) {
                        int i15 = i4 + 1;
                        if (i4 < 0) {
                            C0718m.s();
                        }
                        if (((Number) d11.get(i4)).intValue() == 1) {
                            arrayList.add(next3);
                        }
                        i4 = i15;
                    }
                } else {
                    throw new IllegalArgumentException(("Shapes " + e4.i() + " and " + e5.i() + " are incompatible.").toString());
                }
                m4 = C0718m.e(Integer.valueOf(arrayList.size()));
                invoke = pVar.invoke(m4, arrayList);
                return (E) invoke;
            } else {
                throw new IllegalArgumentException("Input Tensor rank must be greater or equal to the mask Tensor rank!");
            }
        }
        invoke = pVar.invoke(C0718m.e(0), C0718m.j());
        return (E) invoke;
    }

    /* access modifiers changed from: private */
    public static final float P0(List list) {
        o.e(list, "list");
        return C0718m.s0(list);
    }

    private static final E Q(E e4, E e5, p pVar) {
        Object invoke;
        if (e5.h() != 1) {
            throw new IllegalArgumentException(("Expected multiples to be a 1D Tensor, but got shape " + e5.i() + ".").toString());
        } else if (!e5.d().isEmpty()) {
            if (e4.h() == 1) {
                if (e5.d().size() == 1) {
                    int intValue = ((Number) C0718m.R(e5.d())).intValue();
                    ArrayList arrayList = new ArrayList(intValue);
                    for (int i4 = 0; i4 < intValue; i4++) {
                        arrayList.add(e4.d());
                    }
                    List v3 = C0718m.v(arrayList);
                    invoke = pVar.invoke(C0718m.e(Integer.valueOf(v3.size())), v3);
                } else {
                    throw new IllegalArgumentException(("Expected multiples to be a 1D Tensor of shape (1), but got shape " + e5.i() + ".").toString());
                }
            } else if (e4.h() == 2) {
                if (e5.d().size() == 2) {
                    List i5 = e4.i();
                    ArrayList arrayList2 = new ArrayList();
                    int intValue2 = ((Number) e5.d().get(0)).intValue();
                    for (int i6 = 0; i6 < intValue2; i6++) {
                        E z3 = z(((Number) e5.d().get(1)).intValue());
                        int intValue3 = ((Number) i5.get(0)).intValue();
                        for (int i7 = 0; i7 < intValue3; i7++) {
                            arrayList2.addAll(Q(e4.b(i7), z3, pVar).d());
                        }
                    }
                    invoke = pVar.invoke(C0718m.m(Integer.valueOf(((Number) e5.d().get(0)).intValue() * ((Number) i5.get(0)).intValue()), Integer.valueOf(((Number) e5.d().get(1)).intValue() * ((Number) i5.get(1)).intValue())), arrayList2);
                } else {
                    throw new IllegalArgumentException(("Expected multiples to be a 1D Tensor of shape (2), but got shape " + e5.i() + ".").toString());
                }
            } else if (e4.h() != 3) {
                throw new IllegalArgumentException("Cannot perform 'tf.boolean_mask()' on a Tensor of rank " + e4.h() + "! Only 1D, 2D and 3D Tensors are supported.");
            } else if (e5.d().size() == 3) {
                List i8 = e4.i();
                ArrayList arrayList3 = new ArrayList();
                int intValue4 = ((Number) e5.d().get(0)).intValue();
                for (int i9 = 0; i9 < intValue4; i9++) {
                    E x02 = x0(e5.d().subList(1, e5.d().size()));
                    int intValue5 = ((Number) i8.get(0)).intValue();
                    for (int i10 = 0; i10 < intValue5; i10++) {
                        arrayList3.addAll(Q(e4.b(i10), x02, pVar).d());
                    }
                }
                invoke = pVar.invoke(C0718m.m(Integer.valueOf(((Number) e5.d().get(0)).intValue() * ((Number) i8.get(0)).intValue()), Integer.valueOf(((Number) e5.d().get(1)).intValue() * ((Number) i8.get(1)).intValue()), Integer.valueOf(((Number) e5.d().get(2)).intValue() * ((Number) i8.get(2)).intValue())), arrayList3);
            } else {
                throw new IllegalArgumentException(("Expected multiples to be a 1D Tensor of shape (2), but got shape " + e5.i() + ".").toString());
            }
            return (E) invoke;
        } else {
            throw new IllegalArgumentException(("Expected multiples to be a 1D Tensor of shape (1), but got shape " + e5.i() + ".").toString());
        }
    }

    /* access modifiers changed from: private */
    public static final E Q0(List list, List list2) {
        o.e(list, "shape");
        o.e(list2, "data");
        return E.f232d.d(list, list2);
    }

    private static final E R(E e4, E e5, p pVar, p pVar2) {
        try {
            Pair k4 = J.k(e4, e5);
            E e6 = (E) k4.getFirst();
            E e7 = (E) k4.getSecond();
            ArrayList arrayList = new ArrayList();
            List d4 = e6.d();
            List d5 = e7.d();
            int size = d4.size();
            for (int i4 = 0; i4 < size; i4++) {
                arrayList.add(pVar.invoke(d4.get(i4), d5.get(i4)));
            }
            return (E) pVar2.invoke(e6.i(), arrayList);
        } catch (IllegalArgumentException e8) {
            List i5 = e4.i();
            List i6 = e5.i();
            throw new IllegalArgumentException("Shapes " + i5 + " and " + i6 + " are incompatible.", e8);
        }
    }

    /* access modifiers changed from: private */
    public static final int R0(List list) {
        o.e(list, "list");
        return C0718m.t0(list);
    }

    public static final E S(E e4, Integer num) {
        o.e(e4, "input");
        if (e4.i().isEmpty()) {
            throw new IllegalArgumentException("argmax doesn't work on scalar (0D) Tensors!");
        } else if (num == null || (num.intValue() >= (-e4.h()) && num.intValue() < e4.h())) {
            float f4 = Float.NEGATIVE_INFINITY;
            if (e4.h() == 1) {
                List d4 = e4.d();
                int size = d4.size();
                int i4 = 0;
                for (int i5 = 0; i5 < size; i5++) {
                    if (((Number) d4.get(i5)).floatValue() > f4) {
                        f4 = ((Number) d4.get(i5)).floatValue();
                        i4 = i5;
                    }
                }
                return E.f232d.d(C0718m.j(), C0718m.e(Integer.valueOf(i4)));
            } else if (e4.h() == 2) {
                if (num != null) {
                    int intValue = num.intValue();
                    int intValue2 = num.intValue();
                    if (intValue < 0) {
                        intValue2 += e4.h();
                    }
                    if (intValue2 != 0) {
                        List d5 = e4.d();
                        List i6 = e4.i();
                        ArrayList arrayList = new ArrayList();
                        int intValue3 = ((Number) i6.get(0)).intValue();
                        for (int i7 = 0; i7 < intValue3; i7++) {
                            int intValue4 = ((Number) i6.get(1)).intValue();
                            float f5 = Float.NEGATIVE_INFINITY;
                            int i8 = 0;
                            for (int i9 = 0; i9 < intValue4; i9++) {
                                if (((Number) d5.get((((Number) i6.get(1)).intValue() * i7) + i9)).floatValue() > f5) {
                                    f5 = ((Number) d5.get((((Number) i6.get(1)).intValue() * i7) + i9)).floatValue();
                                    i8 = i9;
                                }
                            }
                            arrayList.add(Integer.valueOf(i8));
                        }
                        return E.f232d.d(C0718m.e(i6.get(0)), arrayList);
                    }
                }
                List d6 = e4.d();
                List i10 = e4.i();
                ArrayList arrayList2 = new ArrayList();
                int intValue5 = ((Number) i10.get(1)).intValue();
                for (int i11 = 0; i11 < intValue5; i11++) {
                    int intValue6 = ((Number) i10.get(0)).intValue();
                    float f6 = Float.NEGATIVE_INFINITY;
                    int i12 = 0;
                    for (int i13 = 0; i13 < intValue6; i13++) {
                        if (((Number) d6.get((((Number) i10.get(1)).intValue() * i13) + i11)).floatValue() > f6) {
                            f6 = ((Number) d6.get((((Number) i10.get(1)).intValue() * i13) + i11)).floatValue();
                            i12 = i13;
                        }
                    }
                    arrayList2.add(Integer.valueOf(i12));
                }
                return E.f232d.d(C0718m.e(i10.get(1)), arrayList2);
            } else {
                throw new IllegalArgumentException("Only 1D and 2D tensors are supported! Got " + e4.h() + "D tensor.");
            }
        } else {
            throw new IllegalArgumentException(("Axis must either be: null or in range [-" + e4.h() + ", " + e4.h() + "). Actual value is " + num + ".").toString());
        }
    }

    /* access modifiers changed from: private */
    public static final E S0(List list, List list2) {
        o.e(list, "shape");
        o.e(list2, "data");
        return E.f232d.b(list, list2);
    }

    public static /* synthetic */ E T(E e4, Integer num, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            num = null;
        }
        return S(e4, num);
    }

    private static final E T0(List list) {
        E e4 = (E) list.get(0);
        List i4 = e4.i();
        int h4 = e4.h();
        if (h4 == 1) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.addAll(((E) it.next()).d());
            }
            return E.f232d.b(C0718m.m(Integer.valueOf(list.size()), i4.get(0)), arrayList);
        } else if (h4 == 2) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.addAll(((E) it2.next()).d());
            }
            return E.f232d.b(C0718m.m(Integer.valueOf(list.size()), i4.get(0), i4.get(1)), arrayList2);
        } else if (h4 != 3) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList3.addAll(((E) it3.next()).d());
            }
            return E.f232d.b(C0718m.m(Integer.valueOf(list.size()), ((E) list.get(0)).i().get(0)), arrayList3);
        } else {
            ArrayList arrayList4 = new ArrayList();
            Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                arrayList4.addAll(((E) it4.next()).d());
            }
            return E.f232d.b(C0718m.m(Integer.valueOf(list.size()), i4.get(0), i4.get(1), i4.get(2)), arrayList4);
        }
    }

    public static final E U(E e4, Integer num, boolean z3) {
        o.e(e4, "input");
        int h4 = e4.h();
        List d4 = e4.d();
        List i4 = e4.i();
        if (num != null && (num.intValue() < (-h4) || num.intValue() >= h4)) {
            throw new IllegalArgumentException(("Axis must be in the range [-" + h4 + ", " + h4 + ")! Supplied value is " + num + ".").toString());
        } else if (d4.isEmpty()) {
            return E.f232d.d(C0718m.e(1), C0718m.e(0));
        } else {
            if (h4 == 1) {
                boolean a4 = h.a(((Number) d4.get(0)).intValue());
                int size = d4.size();
                for (int i5 = 1; i5 < size; i5++) {
                    a4 = a4 || h.a(((Number) d4.get(i5)).intValue());
                }
                return E.f232d.d(C0718m.e(1), C0718m.e(Integer.valueOf(h.b(a4))));
            }
            if (h4 == 2) {
                if (num == null) {
                    boolean a5 = h.a(((Number) d4.get(0)).intValue());
                    int size2 = d4.size();
                    for (int i6 = 1; i6 < size2; i6++) {
                        a5 = a5 || h.a(((Number) d4.get(i6)).intValue());
                    }
                    return E.f232d.d(z3 ? C0718m.m(1, 1) : C0718m.e(1), C0718m.e(Integer.valueOf(h.b(a5))));
                }
                int intValue = num.intValue() < 0 ? num.intValue() + h4 : num.intValue();
                if (intValue == 0) {
                    List m4 = z3 ? C0718m.m(1, i4.get(1)) : C0718m.e(i4.get(1));
                    ArrayList arrayList = new ArrayList();
                    int intValue2 = ((Number) i4.get(1)).intValue();
                    for (int i7 = 0; i7 < intValue2; i7++) {
                        boolean a6 = h.a(((Number) d4.get(i7)).intValue());
                        int intValue3 = ((Number) i4.get(0)).intValue();
                        for (int i8 = 1; i8 < intValue3; i8++) {
                            a6 = a6 || h.a(((Number) d4.get((((Number) i4.get(1)).intValue() * i8) + i7)).intValue());
                        }
                        arrayList.add(Integer.valueOf(h.b(a6)));
                    }
                    return E.f232d.d(m4, arrayList);
                } else if (intValue == 1) {
                    List m5 = z3 ? C0718m.m(i4.get(0), 1) : C0718m.e(i4.get(0));
                    ArrayList arrayList2 = new ArrayList();
                    int intValue4 = ((Number) e4.i().get(0)).intValue();
                    for (int i9 = 0; i9 < intValue4; i9++) {
                        boolean a7 = h.a(((Number) d4.get(((Number) i4.get(1)).intValue() * i9)).intValue());
                        int intValue5 = ((Number) e4.i().get(1)).intValue();
                        for (int i10 = 1; i10 < intValue5; i10++) {
                            a7 = a7 || h.a(((Number) d4.get((((Number) i4.get(1)).intValue() * i9) + i10)).intValue());
                        }
                        arrayList2.add(Integer.valueOf(h.b(a7)));
                    }
                    return E.f232d.d(m5, arrayList2);
                }
            }
            if (h4 == 3) {
                if (num == null) {
                    boolean a8 = h.a(((Number) d4.get(0)).intValue());
                    int size3 = d4.size();
                    for (int i11 = 1; i11 < size3; i11++) {
                        a8 = a8 || h.a(((Number) d4.get(i11)).intValue());
                    }
                    return E.f232d.d(z3 ? C0718m.m(1, 1, 1) : C0718m.e(1), C0718m.e(Integer.valueOf(h.b(a8))));
                }
                int intValue6 = num.intValue();
                int intValue7 = num.intValue();
                if (intValue6 < 0) {
                    intValue7 += h4;
                }
                if (intValue7 == 0) {
                    List m6 = z3 ? C0718m.m(1, i4.get(1), i4.get(2)) : C0718m.m(i4.get(1), i4.get(2));
                    ArrayList arrayList3 = new ArrayList();
                    int intValue8 = ((Number) i4.get(1)).intValue();
                    for (int i12 = 0; i12 < intValue8; i12++) {
                        int intValue9 = ((Number) i4.get(2)).intValue();
                        for (int i13 = 0; i13 < intValue9; i13++) {
                            boolean a9 = h.a(((Number) d4.get((((Number) i4.get(2)).intValue() * i12) + i13)).intValue());
                            int intValue10 = ((Number) i4.get(0)).intValue();
                            for (int i14 = 1; i14 < intValue10; i14++) {
                                a9 = a9 || h.a(((Number) d4.get((((((Number) i4.get(1)).intValue() * i14) * ((Number) i4.get(2)).intValue()) + (((Number) i4.get(2)).intValue() * i12)) + i13)).intValue());
                            }
                            arrayList3.add(Integer.valueOf(h.b(a9)));
                        }
                    }
                    return E.f232d.d(m6, arrayList3);
                } else if (intValue7 == 1) {
                    List m7 = z3 ? C0718m.m(i4.get(0), 1, i4.get(2)) : C0718m.m(i4.get(0), i4.get(2));
                    ArrayList arrayList4 = new ArrayList();
                    int intValue11 = ((Number) i4.get(0)).intValue();
                    for (int i15 = 0; i15 < intValue11; i15++) {
                        int intValue12 = ((Number) i4.get(2)).intValue();
                        for (int i16 = 0; i16 < intValue12; i16++) {
                            boolean a10 = h.a(((Number) d4.get((((Number) i4.get(1)).intValue() * i15 * ((Number) i4.get(2)).intValue()) + i16)).intValue());
                            int intValue13 = ((Number) i4.get(1)).intValue();
                            for (int i17 = 1; i17 < intValue13; i17++) {
                                a10 = a10 || h.a(((Number) d4.get((((((Number) i4.get(1)).intValue() * i15) * ((Number) i4.get(2)).intValue()) + (((Number) i4.get(2)).intValue() * i17)) + i16)).intValue());
                            }
                            arrayList4.add(Integer.valueOf(h.b(a10)));
                        }
                    }
                    return E.f232d.d(m7, arrayList4);
                } else if (intValue7 == 2) {
                    List m8 = z3 ? C0718m.m(i4.get(0), i4.get(1), 1) : C0718m.m(i4.get(0), i4.get(1));
                    ArrayList arrayList5 = new ArrayList();
                    int intValue14 = ((Number) i4.get(0)).intValue();
                    for (int i18 = 0; i18 < intValue14; i18++) {
                        int intValue15 = ((Number) i4.get(1)).intValue();
                        for (int i19 = 0; i19 < intValue15; i19++) {
                            boolean a11 = h.a(((Number) d4.get((((Number) i4.get(1)).intValue() * i18 * ((Number) i4.get(2)).intValue()) + (((Number) i4.get(2)).intValue() * i19))).intValue());
                            int intValue16 = ((Number) i4.get(2)).intValue();
                            for (int i20 = 1; i20 < intValue16; i20++) {
                                a11 = a11 || h.a(((Number) d4.get((((((Number) i4.get(1)).intValue() * i18) * ((Number) i4.get(2)).intValue()) + (((Number) i4.get(2)).intValue() * i19)) + i20)).intValue());
                            }
                            arrayList5.add(Integer.valueOf(h.b(a11)));
                        }
                    }
                    return E.f232d.d(m8, arrayList5);
                }
            }
            throw new IllegalArgumentException("Cannot perform 'tf.reduce_any()' on a Tensor of rank " + e4.h() + "! Only 1D, 2D and 3D Tensors are supported.");
        }
    }

    /* access modifiers changed from: private */
    public static final E U0(List list, List list2) {
        o.e(list, "shape");
        o.e(list2, "data");
        return E.f232d.d(list, list2);
    }

    public static /* synthetic */ E V(E e4, Integer num, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            num = null;
        }
        if ((i4 & 4) != 0) {
            z3 = false;
        }
        return U(e4, num, z3);
    }

    private static final E V0(List list) {
        List list2 = list;
        E e4 = (E) list2.get(0);
        List i4 = e4.i();
        int h4 = e4.h();
        if (h4 == 1) {
            ArrayList arrayList = new ArrayList();
            int intValue = ((Number) i4.get(0)).intValue();
            for (int i5 = 0; i5 < intValue; i5++) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((E) it.next()).d().get(i5));
                }
            }
            return E.f232d.b(C0718m.m(i4.get(0), Integer.valueOf(list.size())), arrayList);
        } else if (h4 == 2) {
            ArrayList arrayList2 = new ArrayList();
            int intValue2 = ((Number) i4.get(0)).intValue();
            for (int i6 = 0; i6 < intValue2; i6++) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    E e5 = (E) it2.next();
                    int intValue3 = ((Number) i4.get(1)).intValue();
                    for (int i7 = 0; i7 < intValue3; i7++) {
                        arrayList2.add(e5.d().get((((Number) i4.get(1)).intValue() * i6) + i7));
                    }
                }
            }
            return E.f232d.b(C0718m.m(i4.get(0), Integer.valueOf(list.size()), i4.get(1)), arrayList2);
        } else if (h4 != 3) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList3.addAll(((E) it3.next()).d());
            }
            return E.f232d.b(C0718m.m(((E) list2.get(0)).i().get(0), Integer.valueOf(list.size())), arrayList3);
        } else {
            ArrayList arrayList4 = new ArrayList();
            int intValue4 = ((Number) i4.get(0)).intValue();
            for (int i8 = 0; i8 < intValue4; i8++) {
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    E e6 = (E) it4.next();
                    int intValue5 = ((Number) i4.get(1)).intValue();
                    for (int i9 = 0; i9 < intValue5; i9++) {
                        int intValue6 = ((Number) i4.get(2)).intValue();
                        for (int i10 = 0; i10 < intValue6; i10++) {
                            arrayList4.add(e6.d().get((((Number) i4.get(1)).intValue() * i8 * ((Number) i4.get(2)).intValue()) + (((Number) i4.get(2)).intValue() * i9) + i10));
                        }
                    }
                }
            }
            return E.f232d.b(C0718m.m(i4.get(0), i4.get(1), i4.get(2), Integer.valueOf(list.size())), arrayList4);
        }
    }

    private static final E W(E e4, Integer num, boolean z3, Object obj, p pVar, l lVar, p pVar2) {
        int i4;
        List list;
        ArrayList arrayList;
        List m4;
        int i5;
        List list2;
        ArrayList arrayList2;
        List m5;
        Object invoke;
        int i6;
        List e5;
        List e6;
        List e7;
        ArrayList arrayList3;
        Integer num2 = num;
        p pVar3 = pVar;
        l lVar2 = lVar;
        p pVar4 = pVar2;
        List d4 = e4.d();
        int h4 = e4.h();
        List i7 = e4.i();
        if (e4.h() >= 4) {
            throw new IllegalArgumentException("Only 1D, 2D and 3D tensors are supported!");
        } else if (num2 == null || (num.intValue() >= (-h4) && num.intValue() < h4)) {
            int i8 = 1;
            if (d4.isEmpty()) {
                e6 = C0718m.e(1);
                e7 = C0718m.e(obj);
            } else {
                if (num2 == null) {
                    if (z3) {
                        int size = i7.size();
                        ArrayList arrayList4 = new ArrayList(size);
                        for (int i9 = 0; i9 < size; i9++) {
                            arrayList4.add(1);
                        }
                        arrayList3 = arrayList4;
                    } else {
                        arrayList3 = C0718m.e(1);
                    }
                    invoke = pVar4.invoke(arrayList3, C0718m.e(lVar2.invoke(e4.d())));
                } else if (h4 == 1) {
                    e6 = C0718m.e(1);
                    e7 = C0718m.e(lVar2.invoke(e4.d()));
                } else {
                    int i10 = 2;
                    if (h4 == 2) {
                        if (num.intValue() < 0) {
                            i6 = num.intValue() + h4;
                        } else {
                            i6 = num.intValue();
                        }
                        if (i6 == 0) {
                            if (z3) {
                                list = C0718m.m(1, i7.get(1));
                            } else {
                                list = C0718m.e(i7.get(1));
                            }
                            arrayList = new ArrayList();
                            int intValue = ((Number) i7.get(1)).intValue();
                            for (int i11 = 0; i11 < intValue; i11++) {
                                int intValue2 = ((Number) i7.get(0)).intValue();
                                Object obj2 = obj;
                                for (int i12 = 0; i12 < intValue2; i12++) {
                                    obj2 = pVar3.invoke(obj2, d4.get((((Number) i7.get(1)).intValue() * i12) + i11));
                                }
                                arrayList.add(obj2);
                            }
                        } else if (i6 == 1) {
                            if (z3) {
                                e5 = C0718m.m(i7.get(0), 1);
                            } else {
                                e5 = C0718m.e(i7.get(0));
                            }
                            arrayList = new ArrayList();
                            int intValue3 = ((Number) i7.get(0)).intValue();
                            for (int i13 = 0; i13 < intValue3; i13++) {
                                int intValue4 = ((Number) i7.get(1)).intValue();
                                Object obj3 = obj;
                                for (int i14 = 0; i14 < intValue4; i14++) {
                                    obj3 = pVar3.invoke(obj3, d4.get((((Number) i7.get(1)).intValue() * i13) + i14));
                                }
                                arrayList.add(obj3);
                            }
                        }
                        invoke = pVar4.invoke(list, arrayList);
                    }
                    if (h4 == 3) {
                        int intValue5 = num.intValue();
                        int intValue6 = num.intValue();
                        if (intValue5 < 0) {
                            intValue6 += h4;
                        }
                        if (intValue6 == 0) {
                            if (z3) {
                                list2 = C0718m.m(1, i7.get(1), i7.get(2));
                            } else {
                                list2 = C0718m.m(i7.get(1), i7.get(2));
                            }
                            arrayList2 = new ArrayList();
                            int intValue7 = ((Number) i7.get(1)).intValue();
                            int i15 = 0;
                            while (i15 < intValue7) {
                                int intValue8 = ((Number) i7.get(i10)).intValue();
                                int i16 = 0;
                                while (i16 < intValue8) {
                                    int intValue9 = ((Number) i7.get(0)).intValue();
                                    Object obj4 = obj;
                                    int i17 = 0;
                                    while (i17 < intValue9) {
                                        obj4 = pVar3.invoke(obj4, d4.get((((Number) i7.get(1)).intValue() * i17 * ((Number) i7.get(i10)).intValue()) + (((Number) i7.get(i10)).intValue() * i15) + i16));
                                        i17++;
                                        i10 = 2;
                                    }
                                    arrayList2.add(obj4);
                                    i16++;
                                    i10 = 2;
                                }
                                i15++;
                                i10 = 2;
                            }
                        } else if (intValue6 == 1) {
                            if (z3) {
                                i5 = 2;
                                m5 = C0718m.m(i7.get(0), 1, i7.get(2));
                            } else {
                                i5 = 2;
                                m5 = C0718m.m(i7.get(0), i7.get(2));
                            }
                            arrayList2 = new ArrayList();
                            int intValue10 = ((Number) i7.get(0)).intValue();
                            int i18 = 0;
                            while (i18 < intValue10) {
                                int intValue11 = ((Number) i7.get(i5)).intValue();
                                int i19 = 0;
                                while (i19 < intValue11) {
                                    int intValue12 = ((Number) i7.get(i8)).intValue();
                                    Object obj5 = obj;
                                    int i20 = 0;
                                    while (i20 < intValue12) {
                                        obj5 = pVar3.invoke(obj5, d4.get((((Number) i7.get(i8)).intValue() * i18 * ((Number) i7.get(2)).intValue()) + (((Number) i7.get(2)).intValue() * i20) + i19));
                                        i20++;
                                        i8 = 1;
                                    }
                                    arrayList2.add(obj5);
                                    i19++;
                                    i8 = 1;
                                }
                                i18++;
                                i5 = 2;
                                i8 = 1;
                            }
                        } else if (intValue6 == 2) {
                            if (z3) {
                                i4 = 1;
                                m4 = C0718m.m(i7.get(0), i7.get(1), 1);
                            } else {
                                i4 = 1;
                                m4 = C0718m.m(i7.get(0), i7.get(1));
                            }
                            arrayList = new ArrayList();
                            int intValue13 = ((Number) i7.get(0)).intValue();
                            int i21 = 0;
                            while (i21 < intValue13) {
                                int intValue14 = ((Number) i7.get(i4)).intValue();
                                int i22 = 0;
                                while (i22 < intValue14) {
                                    int intValue15 = ((Number) i7.get(2)).intValue();
                                    Object obj6 = obj;
                                    int i23 = 0;
                                    while (i23 < intValue15) {
                                        obj6 = pVar3.invoke(obj6, d4.get((((Number) i7.get(i4)).intValue() * i21 * ((Number) i7.get(2)).intValue()) + (((Number) i7.get(2)).intValue() * i22) + i23));
                                        i23++;
                                        i4 = 1;
                                    }
                                    arrayList.add(obj6);
                                    i22++;
                                    i4 = 1;
                                }
                                i21++;
                                i4 = 1;
                            }
                            invoke = pVar4.invoke(list, arrayList);
                        }
                        invoke = pVar4.invoke(list2, arrayList2);
                    }
                    throw new IllegalArgumentException("Cannot perform 'tf.reduce_sum()' on a Tensor of rank " + e4.h() + "! Only 1D, 2D and 3D Tensors are supported.");
                }
                return (E) invoke;
            }
            invoke = pVar4.invoke(e6, e7);
            return (E) invoke;
        } else {
            throw new IllegalArgumentException(("Axis must be in the range [-" + h4 + ", " + h4 + " )! Supplied value is " + num2 + ".").toString());
        }
    }

    /* access modifiers changed from: private */
    public static final E W0(List list, List list2) {
        o.e(list, "newShape");
        o.e(list2, "newData");
        return E.f232d.b(list, list2);
    }

    public static final E X(E e4, List list) {
        o.e(e4, "tensor");
        o.e(list, "shape");
        return Y(e4, list, new A());
    }

    public static final E X0(List list) {
        o.e(list, "shape");
        if (list.size() >= 4) {
            throw new IllegalArgumentException("Only 1D, 2D and 3D tensors are supported!");
        } else if (list.isEmpty()) {
            return E.f232d.a();
        } else {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                while (it.hasNext()) {
                    next = Integer.valueOf(((Number) next).intValue() * ((Number) it.next()).intValue());
                }
                int intValue = ((Number) next).intValue();
                ArrayList arrayList = new ArrayList(intValue);
                for (int i4 = 0; i4 < intValue; i4++) {
                    arrayList.add(Float.valueOf(0.0f));
                }
                return E.f232d.b(list, arrayList);
            }
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
    }

    private static final E Y(E e4, List list, p pVar) {
        List d4;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Shape must not be empty!");
        } else if (list.size() < 4) {
            if (list.size() == 1 && ((Number) list.get(0)).intValue() == -1) {
                d4 = e4.d();
                list = C0718m.e(Integer.valueOf(d4.size()));
            } else {
                Iterator it = e4.i().iterator();
                if (it.hasNext()) {
                    Object next = it.next();
                    while (it.hasNext()) {
                        next = Integer.valueOf(((Number) next).intValue() * ((Number) it.next()).intValue());
                    }
                    int intValue = ((Number) next).intValue();
                    Iterator it2 = list.iterator();
                    if (it2.hasNext()) {
                        Object next2 = it2.next();
                        while (it2.hasNext()) {
                            next2 = Integer.valueOf(((Number) next2).intValue() * ((Number) it2.next()).intValue());
                        }
                        if (intValue == ((Number) next2).intValue()) {
                            d4 = e4.d();
                        } else {
                            throw new IllegalArgumentException("The new shape must have the same number of elements as the original tensor!");
                        }
                    } else {
                        throw new UnsupportedOperationException("Empty collection can't be reduced.");
                    }
                } else {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
            }
            return (E) pVar.invoke(list, d4);
        } else {
            throw new IllegalArgumentException("Only 1D, 2D and 3D tensors are supported!");
        }
    }

    /* access modifiers changed from: private */
    public static final E Y0(List list, List list2) {
        o.e(list, "newShape");
        o.e(list2, "newData");
        return E.f232d.d(list, list2);
    }

    public static final E Z(String str) {
        o.e(str, "serialized");
        C0341a c4 = c.f16361a.c();
        c4.a();
        C0267c cVar = (C0267c) c4.c(C0267c.f264c.serializer(), str);
        return E.f232d.b(cVar.d(), cVar.c());
    }

    public static final E Z0(List list) {
        o.e(list, "shape");
        if (list.size() >= 4) {
            throw new IllegalArgumentException("Only 1D, 2D and 3D tensors are supported!");
        } else if (list.isEmpty()) {
            return E.f232d.c();
        } else {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                while (it.hasNext()) {
                    next = Integer.valueOf(((Number) next).intValue() * ((Number) it.next()).intValue());
                }
                int intValue = ((Number) next).intValue();
                ArrayList arrayList = new ArrayList(intValue);
                for (int i4 = 0; i4 < intValue; i4++) {
                    arrayList.add(0);
                }
                return E.f232d.d(list, arrayList);
            }
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
    }

    public static final E a0(List list) {
        o.e(list, "values");
        if (list.isEmpty()) {
            return E.f232d.c();
        }
        ArrayList arrayList = new ArrayList(C0718m.t(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((Boolean) it.next()).booleanValue() ? 1 : 0));
        }
        return E.f232d.d(C0718m.e(Integer.valueOf(list.size())), arrayList);
    }

    /* access modifiers changed from: private */
    public static final E a1(List list, List list2) {
        o.e(list, "shape");
        o.e(list2, "data");
        return E.f232d.b(list, list2);
    }

    public static final E b0(List list, int i4) {
        o.e(list, "values");
        return d0(list, i4, new C0272h());
    }

    public static /* synthetic */ E c0(List list, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return y0(list, i4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final D0.E d0(java.util.List r17, int r18, u2.p r19) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r17.isEmpty()
            if (r3 != 0) goto L_0x05bf
            r3 = 0
            java.lang.Object r4 = r0.get(r3)
            D0.E r4 = (D0.E) r4
            int r4 = r4.h()
            r5 = 4
            if (r4 >= r5) goto L_0x05b7
            int r5 = -r4
            if (r1 < r5) goto L_0x0587
            if (r1 >= r4) goto L_0x0587
            if (r1 >= 0) goto L_0x0024
            int r5 = r1 + r4
            goto L_0x0025
        L_0x0024:
            r5 = r1
        L_0x0025:
            r6 = 1
            if (r4 == r6) goto L_0x055b
            java.lang.String r7 = " and axis "
            java.lang.String r8 = "Failed to concatenate tensors of rank "
            java.lang.String r9 = " vs shape[1] = "
            java.lang.String r10 = "Dimensions of inputs should match: shape[0] = "
            java.lang.String r11 = "!"
            r12 = 2
            if (r4 == r12) goto L_0x0392
            r13 = 3
            if (r4 != r13) goto L_0x0376
            java.lang.Object r14 = kotlin.collections.C0718m.R(r17)
            D0.E r14 = (D0.E) r14
            java.util.List r14 = r14.i()
            if (r5 == 0) goto L_0x02cc
            if (r5 == r6) goto L_0x01a9
            if (r5 != r12) goto L_0x0187
            java.lang.Object r1 = r0.get(r3)
            D0.E r1 = (D0.E) r1
            java.util.List r1 = r1.i()
            java.util.Iterator r4 = r17.iterator()
        L_0x0056:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00cd
            java.lang.Object r5 = r4.next()
            D0.E r5 = (D0.E) r5
            java.lang.Object r7 = r1.get(r3)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            java.util.List r8 = r5.i()
            java.lang.Object r8 = r8.get(r3)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r7 != r8) goto L_0x0097
            java.lang.Object r7 = r1.get(r6)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            java.util.List r5 = r5.i()
            java.lang.Object r5 = r5.get(r6)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r7 != r5) goto L_0x0097
            goto L_0x0056
        L_0x0097:
            java.lang.Object r1 = r0.get(r3)
            D0.E r1 = (D0.E) r1
            java.util.List r1 = r1.i()
            java.lang.Object r0 = r0.get(r6)
            D0.E r0 = (D0.E) r0
            java.util.List r0 = r0.i()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            r2.append(r1)
            r2.append(r9)
            r2.append(r0)
            r2.append(r11)
            java.lang.String r0 = r2.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x00cd:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.Object r4 = r14.get(r3)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r5 = r3
        L_0x00dd:
            if (r5 >= r4) goto L_0x0146
            java.lang.Object r7 = r14.get(r6)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r8 = r3
        L_0x00ea:
            if (r8 >= r7) goto L_0x0143
            java.util.Iterator r9 = r17.iterator()
        L_0x00f0:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0140
            java.lang.Object r10 = r9.next()
            D0.E r10 = (D0.E) r10
            java.util.List r11 = r10.i()
            java.util.List r10 = r10.d()
            java.lang.Object r15 = r11.get(r6)
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            int r15 = r15 * r5
            int r15 = r15 + r8
            java.lang.Object r16 = r11.get(r12)
            java.lang.Number r16 = (java.lang.Number) r16
            int r16 = r16.intValue()
            int r15 = r15 * r16
            java.lang.Object r16 = r11.get(r6)
            java.lang.Number r16 = (java.lang.Number) r16
            int r16 = r16.intValue()
            int r16 = r16 * r5
            int r16 = r16 + r8
            int r16 = r16 + 1
            java.lang.Object r11 = r11.get(r12)
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            int r11 = r11 * r16
            java.util.List r10 = r10.subList(r15, r11)
            r1.addAll(r10)
            goto L_0x00f0
        L_0x0140:
            int r8 = r8 + 1
            goto L_0x00ea
        L_0x0143:
            int r5 = r5 + 1
            goto L_0x00dd
        L_0x0146:
            java.util.Iterator r0 = r17.iterator()
            r4 = r3
        L_0x014b:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0167
            java.lang.Object r5 = r0.next()
            D0.E r5 = (D0.E) r5
            java.util.List r5 = r5.i()
            java.lang.Object r5 = r5.get(r12)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            int r4 = r4 + r5
            goto L_0x014b
        L_0x0167:
            java.lang.Integer[] r0 = new java.lang.Integer[r13]
            java.lang.Object r5 = r14.get(r3)
            r0[r3] = r5
            java.lang.Object r3 = r14.get(r6)
            r0[r6] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r0[r12] = r3
            java.util.List r0 = kotlin.collections.C0718m.m(r0)
        L_0x017f:
            java.lang.Object r0 = r2.invoke(r0, r1)
            D0.E r0 = (D0.E) r0
            goto L_0x0586
        L_0x0187:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r8)
            r2.append(r4)
            r2.append(r7)
            r2.append(r1)
            r2.append(r11)
            java.lang.String r1 = r2.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01a9:
            java.lang.Object r1 = r0.get(r3)
            D0.E r1 = (D0.E) r1
            java.util.List r1 = r1.i()
            java.util.Iterator r4 = r17.iterator()
        L_0x01b7:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x022e
            java.lang.Object r5 = r4.next()
            D0.E r5 = (D0.E) r5
            java.lang.Object r7 = r1.get(r3)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            java.util.List r8 = r5.i()
            java.lang.Object r8 = r8.get(r3)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r7 != r8) goto L_0x01f8
            java.lang.Object r7 = r1.get(r12)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            java.util.List r5 = r5.i()
            java.lang.Object r5 = r5.get(r12)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r7 != r5) goto L_0x01f8
            goto L_0x01b7
        L_0x01f8:
            java.lang.Object r1 = r0.get(r3)
            D0.E r1 = (D0.E) r1
            java.util.List r1 = r1.i()
            java.lang.Object r0 = r0.get(r6)
            D0.E r0 = (D0.E) r0
            java.util.List r0 = r0.i()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            r2.append(r1)
            r2.append(r9)
            r2.append(r0)
            r2.append(r11)
            java.lang.String r0 = r2.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x022e:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.Object r4 = r14.get(r3)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r5 = r3
        L_0x023e:
            if (r5 >= r4) goto L_0x0291
            java.util.Iterator r7 = r17.iterator()
        L_0x0244:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x028e
            java.lang.Object r8 = r7.next()
            D0.E r8 = (D0.E) r8
            java.util.List r9 = r8.i()
            java.util.List r8 = r8.d()
            java.lang.Object r10 = r9.get(r6)
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            int r10 = r10 * r5
            java.lang.Object r11 = r9.get(r12)
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            int r10 = r10 * r11
            int r11 = r5 + 1
            java.lang.Object r15 = r9.get(r6)
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            int r11 = r11 * r15
            java.lang.Object r9 = r9.get(r12)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            int r11 = r11 * r9
            java.util.List r8 = r8.subList(r10, r11)
            r1.addAll(r8)
            goto L_0x0244
        L_0x028e:
            int r5 = r5 + 1
            goto L_0x023e
        L_0x0291:
            java.util.Iterator r0 = r17.iterator()
            r4 = r3
        L_0x0296:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x02b2
            java.lang.Object r5 = r0.next()
            D0.E r5 = (D0.E) r5
            java.util.List r5 = r5.i()
            java.lang.Object r5 = r5.get(r6)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            int r4 = r4 + r5
            goto L_0x0296
        L_0x02b2:
            java.lang.Integer[] r0 = new java.lang.Integer[r13]
            java.lang.Object r5 = r14.get(r3)
            r0[r3] = r5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r0[r6] = r3
            java.lang.Object r3 = r14.get(r12)
            r0[r12] = r3
            java.util.List r0 = kotlin.collections.C0718m.m(r0)
            goto L_0x017f
        L_0x02cc:
            java.lang.Object r1 = r0.get(r3)
            D0.E r1 = (D0.E) r1
            D0.E r1 = r1.b(r3)
            java.util.List r1 = r1.i()
            java.util.Iterator r4 = r17.iterator()
        L_0x02de:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x032f
            java.lang.Object r5 = r4.next()
            D0.E r5 = (D0.E) r5
            D0.E r5 = r5.b(r3)
            java.util.List r5 = r5.i()
            boolean r5 = E0.m.b(r1, r5)
            if (r5 == 0) goto L_0x02f9
            goto L_0x02de
        L_0x02f9:
            java.lang.Object r1 = r0.get(r3)
            D0.E r1 = (D0.E) r1
            java.util.List r1 = r1.i()
            java.lang.Object r0 = r0.get(r6)
            D0.E r0 = (D0.E) r0
            java.util.List r0 = r0.i()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            r2.append(r1)
            r2.append(r9)
            r2.append(r0)
            r2.append(r11)
            java.lang.String r0 = r2.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x032f:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r17.iterator()
            r4 = r3
        L_0x0339:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x035c
            java.lang.Object r5 = r0.next()
            D0.E r5 = (D0.E) r5
            java.util.List r7 = r5.d()
            r1.addAll(r7)
            java.util.List r5 = r5.i()
            java.lang.Object r5 = r5.get(r3)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            int r4 = r4 + r5
            goto L_0x0339
        L_0x035c:
            java.lang.Integer[] r0 = new java.lang.Integer[r13]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0[r3] = r4
            java.lang.Object r3 = r14.get(r6)
            r0[r6] = r3
            java.lang.Object r3 = r14.get(r12)
            r0[r12] = r3
            java.util.List r0 = kotlin.collections.C0718m.m(r0)
            goto L_0x017f
        L_0x0376:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            r1.append(r4)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0392:
            java.lang.Object r13 = kotlin.collections.C0718m.R(r17)
            D0.E r13 = (D0.E) r13
            java.util.List r13 = r13.i()
            if (r5 == 0) goto L_0x04af
            if (r5 != r6) goto L_0x048d
            java.lang.Object r1 = r0.get(r3)
            D0.E r1 = (D0.E) r1
            java.util.List r1 = r1.i()
            java.lang.Object r1 = r1.get(r3)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.util.Iterator r4 = r17.iterator()
        L_0x03b8:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x040b
            java.lang.Object r5 = r4.next()
            D0.E r5 = (D0.E) r5
            java.util.List r5 = r5.i()
            java.lang.Object r5 = r5.get(r3)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r1 != r5) goto L_0x03d5
            goto L_0x03b8
        L_0x03d5:
            java.lang.Object r1 = r0.get(r3)
            D0.E r1 = (D0.E) r1
            java.util.List r1 = r1.i()
            java.lang.Object r0 = r0.get(r6)
            D0.E r0 = (D0.E) r0
            java.util.List r0 = r0.i()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            r2.append(r1)
            r2.append(r9)
            r2.append(r0)
            r2.append(r11)
            java.lang.String r0 = r2.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x040b:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.Object r4 = r13.get(r3)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r5 = r3
        L_0x041b:
            if (r5 >= r4) goto L_0x0458
            java.util.Iterator r7 = r17.iterator()
        L_0x0421:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0455
            java.lang.Object r8 = r7.next()
            D0.E r8 = (D0.E) r8
            java.util.List r9 = r8.i()
            java.util.List r8 = r8.d()
            java.lang.Object r10 = r9.get(r6)
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            int r10 = r10 * r5
            int r11 = r5 + 1
            java.lang.Object r9 = r9.get(r6)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            int r11 = r11 * r9
            java.util.List r8 = r8.subList(r10, r11)
            r1.addAll(r8)
            goto L_0x0421
        L_0x0455:
            int r5 = r5 + 1
            goto L_0x041b
        L_0x0458:
            java.util.Iterator r0 = r17.iterator()
            r4 = r3
        L_0x045d:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0479
            java.lang.Object r5 = r0.next()
            D0.E r5 = (D0.E) r5
            java.util.List r5 = r5.i()
            java.lang.Object r5 = r5.get(r6)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            int r4 = r4 + r5
            goto L_0x045d
        L_0x0479:
            java.lang.Integer[] r0 = new java.lang.Integer[r12]
            java.lang.Object r5 = r13.get(r3)
            r0[r3] = r5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r0[r6] = r3
            java.util.List r0 = kotlin.collections.C0718m.m(r0)
            goto L_0x017f
        L_0x048d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r8)
            r2.append(r4)
            r2.append(r7)
            r2.append(r1)
            r2.append(r11)
            java.lang.String r1 = r2.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x04af:
            java.lang.Object r1 = r0.get(r3)
            D0.E r1 = (D0.E) r1
            java.util.List r1 = r1.i()
            java.lang.Object r1 = r1.get(r6)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.util.Iterator r4 = r17.iterator()
        L_0x04c7:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x051a
            java.lang.Object r5 = r4.next()
            D0.E r5 = (D0.E) r5
            java.util.List r5 = r5.i()
            java.lang.Object r5 = r5.get(r6)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r1 != r5) goto L_0x04e4
            goto L_0x04c7
        L_0x04e4:
            java.lang.Object r1 = r0.get(r3)
            D0.E r1 = (D0.E) r1
            java.util.List r1 = r1.i()
            java.lang.Object r0 = r0.get(r6)
            D0.E r0 = (D0.E) r0
            java.util.List r0 = r0.i()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            r2.append(r1)
            r2.append(r9)
            r2.append(r0)
            r2.append(r11)
            java.lang.String r0 = r2.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x051a:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r17.iterator()
            r4 = r3
        L_0x0524:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0547
            java.lang.Object r5 = r0.next()
            D0.E r5 = (D0.E) r5
            java.util.List r7 = r5.d()
            r1.addAll(r7)
            java.util.List r5 = r5.i()
            java.lang.Object r5 = r5.get(r3)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            int r4 = r4 + r5
            goto L_0x0524
        L_0x0547:
            java.lang.Integer[] r0 = new java.lang.Integer[r12]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0[r3] = r4
            java.lang.Object r3 = r13.get(r6)
            r0[r6] = r3
            java.util.List r0 = kotlin.collections.C0718m.m(r0)
            goto L_0x017f
        L_0x055b:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r17.iterator()
        L_0x0564:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0578
            java.lang.Object r3 = r0.next()
            D0.E r3 = (D0.E) r3
            java.util.List r3 = r3.d()
            r1.addAll(r3)
            goto L_0x0564
        L_0x0578:
            int r0 = r1.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.List r0 = kotlin.collections.C0718m.e(r0)
            goto L_0x017f
        L_0x0586:
            return r0
        L_0x0587:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Expected concatenating dimensions in the range [-"
            r0.append(r2)
            r0.append(r4)
            java.lang.String r2 = ", "
            r0.append(r2)
            r0.append(r4)
            java.lang.String r2 = ") (inclusive, exclusive), but got "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = " for axis!"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x05b7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Only 1D, 2D and 3D tensors are supported!"
            r0.<init>(r1)
            throw r0
        L_0x05bf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Values must not be empty!"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.C.d0(java.util.List, int, u2.p):D0.E");
    }

    /* access modifiers changed from: private */
    public static final E e0(List list, List list2) {
        o.e(list, "shape");
        o.e(list2, "data");
        return E.f232d.b(list, list2);
    }

    /* access modifiers changed from: private */
    public static final float f0(float f4, float f5) {
        return f4 + f5;
    }

    /* access modifiers changed from: private */
    public static final int g0(int i4, int i5) {
        return i4 + i5;
    }

    public static final E h0(E e4, int i4) {
        o.e(e4, "input");
        return E(e4, i4, new C0285v());
    }

    public static final E i0(E e4, E e5) {
        o.e(e4, "x");
        o.e(e5, "y");
        return R(e4, e5, new C0274j(), new C0275k());
    }

    public static final E j0(E e4, E e5, Boolean bool, Integer num) {
        o.e(e4, "params");
        o.e(e5, "indices");
        return M(e4, e5, bool, num, new C0284u());
    }

    public static /* synthetic */ E k0(E e4, E e5, Boolean bool, Integer num, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            bool = null;
        }
        if ((i4 & 8) != 0) {
            num = null;
        }
        return j0(e4, e5, bool, num);
    }

    public static final E l0(E e4, E e5, Integer num) {
        o.e(e4, "input");
        o.e(e5, "mask");
        return P(e4, e5, num, new C0286w());
    }

    public static /* synthetic */ E m0(E e4, E e5, Integer num, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            num = null;
        }
        return l0(e4, e5, num);
    }

    public static final E n0(E e4, Integer num, boolean z3) {
        o.e(e4, "input");
        return W(e4, num, z3, Float.valueOf(0.0f), new C0276l(), new C0277m(), new C0278n());
    }

    public static /* synthetic */ E o0(E e4, Integer num, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            num = null;
        }
        if ((i4 & 4) != 0) {
            z3 = false;
        }
        return n0(e4, num, z3);
    }

    public static final E p0(E e4, List list) {
        o.e(e4, "tensor");
        o.e(list, "shape");
        return Y(e4, list, new r());
    }

    public static final E q0(List list) {
        o.e(list, "values");
        return E.f232d.b(C0718m.e(Integer.valueOf(list.size())), list);
    }

    public static final E r0(List list, int i4) {
        o.e(list, "values");
        return d0(list, i4, new C0279o());
    }

    /* access modifiers changed from: private */
    public static final E s0(List list, List list2) {
        o.e(list, "shape");
        o.e(list2, "data");
        return E.f232d.d(list, list2);
    }

    public static final String t0(E e4) {
        o.e(e4, "tensor");
        C0267c cVar = new C0267c(e4.i(), e4.d());
        C0341a c4 = c.f16361a.c();
        c4.a();
        return c4.b(C0267c.f264c.serializer(), cVar);
    }

    public static final E u0(E e4, E e5) {
        o.e(e4, "x");
        o.e(e5, "y");
        return R(e4, e5, new C0288y(), new C0289z());
    }

    public static final E v0(E e4, Integer num, boolean z3) {
        o.e(e4, "input");
        return W(e4, num, z3, 0, new C0280p(), new C0281q(), new C0282s());
    }

    /* access modifiers changed from: private */
    public static final float w(float f4, float f5) {
        return Math.max(f4, f5);
    }

    public static /* synthetic */ E w0(E e4, Integer num, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            num = null;
        }
        if ((i4 & 4) != 0) {
            z3 = false;
        }
        return v0(e4, num, z3);
    }

    /* access modifiers changed from: private */
    public static final int x(int i4, int i5) {
        return Math.min(i4, i5);
    }

    public static final E x0(List list) {
        o.e(list, "values");
        return E.f232d.d(C0718m.e(Integer.valueOf(list.size())), list);
    }

    public static final E y(float f4) {
        return E.f232d.b(C0718m.e(1), C0718m.e(Float.valueOf(f4)));
    }

    public static final E y0(List list, int i4) {
        o.e(list, "values");
        if (i4 != 0 && i4 != 1) {
            throw new IllegalArgumentException("Only axis 0 and 1 are supported!");
        } else if (!list.isEmpty()) {
            int h4 = ((E) list.get(0)).h();
            List i5 = ((E) list.get(0)).i();
            if (h4 < 3) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    E e4 = (E) it.next();
                    if (e4.h() != h4) {
                        throw new IllegalArgumentException("All tensors must have the same rank!");
                    } else if (!o.a(e4.i(), i5)) {
                        throw new IllegalArgumentException("Shapes of all inputs must match!");
                    }
                }
                if (i4 == 0) {
                    return T0(list);
                }
                return V0(list);
            }
            throw new IllegalArgumentException("Only 1D and 2D tensors are supported!");
        } else {
            throw new IllegalArgumentException("Values must not be empty!");
        }
    }

    public static final E z(int i4) {
        return E.f232d.d(C0718m.e(1), C0718m.e(Integer.valueOf(i4)));
    }

    /* access modifiers changed from: private */
    public static final E z0(List list, List list2) {
        o.e(list, "shape");
        o.e(list2, "data");
        return E.f232d.b(list, list2);
    }
}
