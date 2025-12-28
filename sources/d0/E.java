package D0;

import E0.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.v;
import v2.C0925a;

public final class E implements Comparable, Iterable, C0925a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f232d = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public List f233a;

    /* renamed from: b  reason: collision with root package name */
    private List f234b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f235c;

    public static final class a {
        private a() {
        }

        public final E a() {
            return new E(C0718m.e(0), C0718m.j(), r.b(Float.TYPE), (i) null);
        }

        public final E b(List list, List list2) {
            o.e(list, "shape");
            o.e(list2, "data");
            return new E(list, list2, r.b(Float.TYPE), (i) null);
        }

        public final E c() {
            return new E(C0718m.e(0), C0718m.j(), r.b(Integer.TYPE), (i) null);
        }

        public final E d(List list, List list2) {
            o.e(list, "shape");
            o.e(list2, "data");
            return new E(list, list2, r.b(Integer.TYPE), (i) null);
        }

        public final E e() {
            return new E(C0718m.e(0), C0718m.j(), r.b(Long.TYPE), (i) null);
        }

        public final E f(List list, List list2) {
            o.e(list, "shape");
            o.e(list2, "data");
            return new E(list, list2, r.b(Long.TYPE), (i) null);
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public static final class b implements Iterator, C0925a {

        /* renamed from: a  reason: collision with root package name */
        private int f236a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ E f237b;

        b(E e4) {
            this.f237b = e4;
        }

        /* renamed from: b */
        public E next() {
            E b4 = this.f237b.b(this.f236a);
            this.f236a++;
            return b4;
        }

        /* JADX WARNING: Removed duplicated region for block: B:6:0x0026 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean hasNext() {
            /*
                r3 = this;
                D0.E r0 = r3.f237b
                java.util.List r0 = r0.f233a
                boolean r0 = r0.isEmpty()
                r1 = 0
                if (r0 == 0) goto L_0x0012
                int r0 = r3.f236a
                if (r0 != 0) goto L_0x0027
                goto L_0x0026
            L_0x0012:
                int r0 = r3.f236a
                D0.E r2 = r3.f237b
                java.util.List r2 = r2.f233a
                java.lang.Object r2 = r2.get(r1)
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                if (r0 >= r2) goto L_0x0027
            L_0x0026:
                r1 = 1
            L_0x0027:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: D0.E.b.hasNext():boolean");
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private E(List list, List list2, Object obj) {
        this.f233a = list;
        this.f234b = list2;
        this.f235c = obj;
        if (list.size() >= 4) {
            throw new IllegalArgumentException("Only Scalars (0D), 1D, 2D and 3D tensors are supported!");
        } else if (this.f233a.isEmpty() && this.f234b.size() != 1) {
            throw new IllegalArgumentException("Scalar Tensor must have only one element!");
        } else if (!this.f233a.isEmpty() && this.f234b.size() != m.d(this.f233a)) {
            throw new IllegalArgumentException("The number of elements in the data must match the shape of the non-scalar Tensor!");
        } else if (!o.a(obj, r.b(Float.TYPE)) && !o.a(obj, r.b(Integer.TYPE)) && !o.a(obj, r.b(Long.TYPE))) {
            throw new IllegalArgumentException("Only Float, Int and Long data types are supported!");
        }
    }

    private final Object g() {
        int h4 = h();
        if (h4 == 1) {
            return C0718m.D0(this.f234b);
        }
        if (h4 == 2) {
            ArrayList arrayList = new ArrayList();
            int intValue = ((Number) this.f233a.get(0)).intValue();
            for (int i4 = 0; i4 < intValue; i4++) {
                ArrayList arrayList2 = new ArrayList();
                arrayList.add(arrayList2);
                int intValue2 = ((Number) this.f233a.get(1)).intValue();
                for (int i5 = 0; i5 < intValue2; i5++) {
                    arrayList2.add(this.f234b.get((((Number) this.f233a.get(1)).intValue() * i4) + i5));
                }
            }
            return arrayList;
        } else if (h4 == 3) {
            ArrayList arrayList3 = new ArrayList();
            int intValue3 = ((Number) this.f233a.get(0)).intValue();
            for (int i6 = 0; i6 < intValue3; i6++) {
                ArrayList arrayList4 = new ArrayList();
                arrayList3.add(arrayList4);
                int intValue4 = ((Number) this.f233a.get(1)).intValue();
                for (int i7 = 0; i7 < intValue4; i7++) {
                    ArrayList arrayList5 = new ArrayList();
                    arrayList4.add(arrayList5);
                    int intValue5 = ((Number) this.f233a.get(2)).intValue();
                    for (int i8 = 0; i8 < intValue5; i8++) {
                        arrayList5.add(this.f234b.get((((Number) this.f233a.get(1)).intValue() * i6 * ((Number) this.f233a.get(2)).intValue()) + (((Number) this.f233a.get(2)).intValue() * i7) + i8));
                    }
                }
            }
            return arrayList3;
        } else {
            throw new IllegalArgumentException("Only Scalars (0D), 1D, 2D and 3D tensors are supported!");
        }
    }

    public final E b(int i4) {
        if (this.f233a.isEmpty()) {
            if (i4 != 0) {
                throw new IndexOutOfBoundsException("For scalar Tensors (0D), only valid index is 0.");
            }
        } else if (i4 >= ((Number) this.f233a.get(0)).intValue()) {
            Object obj = this.f233a.get(0);
            throw new IndexOutOfBoundsException("Index: " + i4 + ", size: " + obj);
        }
        int h4 = h();
        if (h4 == 0) {
            return new E(C0718m.j(), C0718m.e(this.f234b.get(0)), this.f235c);
        }
        if (h4 == 1) {
            return new E(C0718m.e(1), C0718m.e(this.f234b.get(i4)), this.f235c);
        }
        if (h4 == 2) {
            return new E(C0718m.e(this.f233a.get(1)), this.f234b.subList(((Number) this.f233a.get(1)).intValue() * i4, (i4 + 1) * ((Number) this.f233a.get(1)).intValue()), this.f235c);
        }
        if (h4 == 3) {
            return new E(C0718m.m(this.f233a.get(1), this.f233a.get(2)), this.f234b.subList(((Number) this.f233a.get(1)).intValue() * i4 * ((Number) this.f233a.get(2)).intValue(), (i4 + 1) * ((Number) this.f233a.get(1)).intValue() * ((Number) this.f233a.get(2)).intValue()), this.f235c);
        }
        throw new IllegalArgumentException("Only Scalars (0D), 1D, 2D and 3D tensors are supported!");
    }

    public final E c(List list) {
        int i4;
        E N02;
        E L02;
        E J02;
        List list2 = list;
        o.e(list2, "shape");
        List i5 = i();
        if (m.b(i5, list2)) {
            return this;
        }
        if (i5.size() <= list.size()) {
            int i6 = 0;
            if (m.b(i5, C0718m.e(0))) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    Object next = it.next();
                    while (it.hasNext()) {
                        next = Integer.valueOf(((Number) next).intValue() * ((Number) it.next()).intValue());
                    }
                    int intValue = ((Number) next).intValue();
                    Object obj = this.f235c;
                    if (o.a(obj, r.b(Float.TYPE))) {
                        ArrayList arrayList = new ArrayList(intValue);
                        while (i6 < intValue) {
                            arrayList.add(Float.valueOf(0.0f));
                            i6++;
                        }
                        return new E(list2, arrayList, r.b(Float.TYPE));
                    } else if (o.a(obj, r.b(Integer.TYPE))) {
                        ArrayList arrayList2 = new ArrayList(intValue);
                        for (int i7 = 0; i7 < intValue; i7++) {
                            arrayList2.add(0);
                        }
                        return new E(list2, arrayList2, r.b(Integer.TYPE));
                    } else if (o.a(obj, r.b(Long.TYPE))) {
                        ArrayList arrayList3 = new ArrayList(intValue);
                        while (i6 < intValue) {
                            arrayList3.add(0L);
                            i6++;
                        }
                        return new E(list2, arrayList3, r.b(Long.TYPE));
                    } else {
                        throw new IllegalArgumentException("Only Float, Int and Long data types are supported!");
                    }
                } else {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
            } else if (i5.isEmpty()) {
                Iterator it2 = list.iterator();
                if (it2.hasNext()) {
                    Object next2 = it2.next();
                    while (it2.hasNext()) {
                        next2 = Integer.valueOf(((Number) next2).intValue() * ((Number) it2.next()).intValue());
                    }
                    int intValue2 = ((Number) next2).intValue();
                    Object obj2 = this.f235c;
                    if (o.a(obj2, r.b(Float.TYPE))) {
                        ArrayList arrayList4 = new ArrayList(intValue2);
                        for (int i8 = 0; i8 < intValue2; i8++) {
                            Object obj3 = this.f234b.get(0);
                            o.c(obj3, "null cannot be cast to non-null type kotlin.Float");
                            Float f4 = (Float) obj3;
                            f4.floatValue();
                            arrayList4.add(f4);
                        }
                        return new E(list2, arrayList4, r.b(Float.TYPE));
                    } else if (o.a(obj2, r.b(Integer.TYPE))) {
                        ArrayList arrayList5 = new ArrayList(intValue2);
                        for (int i9 = 0; i9 < intValue2; i9++) {
                            Object obj4 = this.f234b.get(0);
                            o.c(obj4, "null cannot be cast to non-null type kotlin.Int");
                            Integer num = (Integer) obj4;
                            num.intValue();
                            arrayList5.add(num);
                        }
                        return new E(list2, arrayList5, r.b(Integer.TYPE));
                    } else if (o.a(obj2, r.b(Long.TYPE))) {
                        ArrayList arrayList6 = new ArrayList(intValue2);
                        for (int i10 = 0; i10 < intValue2; i10++) {
                            Object obj5 = this.f234b.get(0);
                            o.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            Long l4 = (Long) obj5;
                            l4.longValue();
                            arrayList6.add(l4);
                        }
                        return new E(list2, arrayList6, r.b(Long.TYPE));
                    } else {
                        throw new IllegalArgumentException("Only Float, Int and Long data types are supported!");
                    }
                } else {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
            } else {
                int size = list.size() - i5.size();
                ArrayList arrayList7 = new ArrayList(size);
                int i11 = 0;
                while (true) {
                    i4 = 1;
                    if (i11 >= size) {
                        break;
                    }
                    arrayList7.add(1);
                    i11++;
                }
                List i02 = C0718m.i0(arrayList7, i5);
                int size2 = i02.size();
                int i12 = 0;
                while (i12 < size2) {
                    if (((Number) i02.get(i12)).intValue() == ((Number) list2.get(i12)).intValue() || ((Number) i02.get(i12)).intValue() == 1) {
                        i12++;
                    } else {
                        throw new IllegalArgumentException("Broadcasting the tensor to a shape of " + list2 + " is not possible because the lengths of the dimensions do not match and neither of them is 1.");
                    }
                }
                E e4 = new E(i02, d(), this.f235c);
                int h4 = e4.h();
                if (h4 != 1) {
                    int i13 = 2;
                    if (h4 == 2) {
                        Object g4 = e4.g();
                        o.c(g4, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.collections.MutableList<T of ch.icoaching.typewise.tf.Tensor>>");
                        List b4 = v.b(g4);
                        int i14 = 1;
                        if (((Number) i02.get(1)).intValue() == 1) {
                            int size3 = b4.size();
                            int i15 = 0;
                            while (i15 < size3) {
                                int intValue3 = ((Number) list2.get(i14)).intValue();
                                ArrayList arrayList8 = new ArrayList(intValue3);
                                for (int i16 = 0; i16 < intValue3; i16++) {
                                    arrayList8.add(((List) b4.get(i15)).get(0));
                                }
                                b4.set(i15, arrayList8);
                                i15++;
                                i14 = 1;
                            }
                        }
                        if (((Number) i02.get(0)).intValue() == 1) {
                            int intValue4 = ((Number) list2.get(0)).intValue();
                            for (int i17 = 1; i17 < intValue4; i17++) {
                                b4.add(b4.get(0));
                            }
                        }
                        Object obj6 = this.f235c;
                        if (o.a(obj6, r.b(Float.TYPE))) {
                            o.c(b4, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.collections.MutableList<kotlin.Float>>");
                            L02 = C.B0(v.b(b4));
                        } else if (o.a(obj6, r.b(Integer.TYPE))) {
                            o.c(b4, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.collections.MutableList<kotlin.Int>>");
                            L02 = C.D0(v.b(b4));
                        } else if (o.a(obj6, r.b(Long.TYPE))) {
                            o.c(b4, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.collections.MutableList<kotlin.Long>>");
                            L02 = C.L0(v.b(b4));
                        } else {
                            throw new IllegalArgumentException("Only Float, Int and Long data types are supported!");
                        }
                        o.c(L02, "null cannot be cast to non-null type ch.icoaching.typewise.tf.Tensor<T of ch.icoaching.typewise.tf.Tensor>");
                        return L02;
                    } else if (h4 == 3) {
                        Object g5 = e4.g();
                        o.c(g5, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.collections.MutableList<kotlin.collections.MutableList<T of ch.icoaching.typewise.tf.Tensor>>>");
                        List b5 = v.b(g5);
                        if (((Number) i02.get(2)).intValue() == 1) {
                            int size4 = b5.size();
                            int i18 = 0;
                            while (i18 < size4) {
                                List list3 = (List) b5.get(i18);
                                int size5 = list3.size();
                                int i19 = 0;
                                while (i19 < size5) {
                                    int intValue5 = ((Number) list2.get(i13)).intValue();
                                    ArrayList arrayList9 = new ArrayList(intValue5);
                                    for (int i20 = 0; i20 < intValue5; i20++) {
                                        arrayList9.add(((List) ((List) b5.get(i18)).get(i19)).get(0));
                                    }
                                    list3.set(i19, arrayList9);
                                    i19++;
                                    i13 = 2;
                                }
                                i18++;
                                i4 = 1;
                                i13 = 2;
                            }
                        }
                        int i21 = i4;
                        if (((Number) i02.get(i21)).intValue() == i21) {
                            int size6 = b5.size();
                            int i22 = 0;
                            while (i22 < size6) {
                                int intValue6 = ((Number) list2.get(i21)).intValue();
                                ArrayList arrayList10 = new ArrayList(intValue6);
                                for (int i23 = 0; i23 < intValue6; i23++) {
                                    arrayList10.add((List) ((List) b5.get(i22)).get(0));
                                }
                                b5.set(i22, arrayList10);
                                i22++;
                                i21 = 1;
                            }
                        }
                        if (((Number) i02.get(0)).intValue() == 1) {
                            int intValue7 = ((Number) list2.get(0)).intValue();
                            for (int i24 = 1; i24 < intValue7; i24++) {
                                b5.add(b5.get(0));
                            }
                        }
                        Object obj7 = this.f235c;
                        if (o.a(obj7, r.b(Float.TYPE))) {
                            o.c(b5, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.collections.MutableList<kotlin.collections.MutableList<kotlin.Float>>>");
                            J02 = C.F0(v.b(b5));
                        } else if (o.a(obj7, r.b(Integer.TYPE))) {
                            o.c(b5, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.collections.MutableList<kotlin.collections.MutableList<kotlin.Int>>>");
                            J02 = C.H0(v.b(b5));
                        } else if (o.a(obj7, r.b(Long.TYPE))) {
                            o.c(b5, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.collections.MutableList<kotlin.collections.MutableList<kotlin.Long>>>");
                            J02 = C.J0(v.b(b5));
                        } else {
                            throw new IllegalArgumentException("Only Float, Int and Long data types are supported!");
                        }
                        o.c(J02, "null cannot be cast to non-null type ch.icoaching.typewise.tf.Tensor<T of ch.icoaching.typewise.tf.Tensor>");
                        return J02;
                    } else {
                        throw new IllegalArgumentException("Only Scalars (0D), 1D, 2D and 3D tensors are supported!");
                    }
                } else {
                    Object g6 = e4.g();
                    o.c(g6, "null cannot be cast to non-null type kotlin.collections.MutableList<T of ch.icoaching.typewise.tf.Tensor>");
                    List b6 = v.b(g6);
                    if (((Number) i02.get(0)).intValue() == 1) {
                        int intValue8 = ((Number) list2.get(0)).intValue();
                        for (int i25 = 1; i25 < intValue8; i25++) {
                            b6.add(b6.get(0));
                        }
                    }
                    Object obj8 = this.f235c;
                    if (o.a(obj8, r.b(Float.TYPE))) {
                        o.c(b6, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Float>");
                        N02 = C.q0(v.b(b6));
                    } else if (o.a(obj8, r.b(Integer.TYPE))) {
                        o.c(b6, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Int>");
                        N02 = C.x0(v.b(b6));
                    } else if (o.a(obj8, r.b(Long.TYPE))) {
                        o.c(b6, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Long>");
                        N02 = C.N0(v.b(b6));
                    } else {
                        throw new IllegalArgumentException("Only Float, Int and Long data types are supported!");
                    }
                    o.c(N02, "null cannot be cast to non-null type ch.icoaching.typewise.tf.Tensor<T of ch.icoaching.typewise.tf.Tensor>");
                    return N02;
                }
            }
        } else {
            throw new IllegalArgumentException(("Can't broadcast a tensor with a higher rank (" + i5.size() + ") to a tensor with a lower rank (" + list.size() + ")!").toString());
        }
    }

    public final List d() {
        return this.f234b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || E.class != obj.getClass()) {
            return false;
        }
        E e4 = (E) obj;
        if (o.a(this.f235c, e4.f235c) && o.a(this.f233a, e4.f233a) && o.a(this.f234b, e4.f234b)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int compareTo(E e4) {
        o.e(e4, "other");
        if (!o.a(this.f235c, e4.f235c)) {
            throw new IllegalArgumentException("Can't compare Tensors whose data types don't match!");
        } else if (m.b(this.f233a, e4.f233a)) {
            Object obj = this.f235c;
            if (o.a(obj, r.b(Float.TYPE))) {
                List list = this.f234b;
                o.c(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                float s02 = C0718m.s0(list);
                List list2 = e4.f234b;
                o.c(list2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                return Float.compare(s02, C0718m.s0(list2));
            } else if (o.a(obj, r.b(Integer.TYPE))) {
                List list3 = this.f234b;
                o.c(list3, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Int>");
                int t02 = C0718m.t0(list3);
                List list4 = e4.f234b;
                o.c(list4, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Int>");
                return o.f(t02, C0718m.t0(list4));
            } else if (o.a(obj, r.b(Long.TYPE))) {
                List list5 = this.f234b;
                o.c(list5, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Long>");
                long u02 = C0718m.u0(list5);
                List list6 = e4.f234b;
                o.c(list6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Long>");
                return o.g(u02, C0718m.u0(list6));
            } else {
                throw new IllegalArgumentException("Only Float, Int and Long data types are supported!");
            }
        } else {
            throw new IllegalArgumentException("Can't compare Tensors whose shapes don't match!");
        }
    }

    public final int h() {
        return this.f233a.size();
    }

    public int hashCode() {
        return (((this.f233a.hashCode() * 31) + this.f234b.hashCode()) * 31) + this.f235c.hashCode();
    }

    public final List i() {
        return C0718m.B0(this.f233a);
    }

    public Iterator iterator() {
        return new b(this);
    }

    public final float j() {
        if (h() == 0 || (h() == 1 && ((Number) this.f233a.get(0)).intValue() == 1)) {
            Object obj = this.f235c;
            if (o.a(obj, r.b(Float.TYPE))) {
                Object obj2 = this.f234b.get(0);
                o.c(obj2, "null cannot be cast to non-null type kotlin.Float");
                return ((Float) obj2).floatValue();
            } else if (o.a(obj, r.b(Integer.TYPE))) {
                Object obj3 = this.f234b.get(0);
                o.c(obj3, "null cannot be cast to non-null type kotlin.Int");
                return (float) ((Integer) obj3).intValue();
            } else if (o.a(obj, r.b(Long.TYPE))) {
                Object obj4 = this.f234b.get(0);
                o.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                return (float) ((Long) obj4).longValue();
            } else {
                throw new IllegalArgumentException("Only Float, Int and Long data types are supported!");
            }
        } else {
            throw new IllegalStateException("Tensor must be a scalar (0D) Tensor, or 1D Tensor with a single element!");
        }
    }

    public final int k() {
        if (h() == 0 || (h() == 1 && ((Number) this.f233a.get(0)).intValue() == 1)) {
            Object obj = this.f235c;
            if (o.a(obj, r.b(Float.TYPE))) {
                Object obj2 = this.f234b.get(0);
                o.c(obj2, "null cannot be cast to non-null type kotlin.Float");
                return (int) ((Float) obj2).floatValue();
            } else if (o.a(obj, r.b(Integer.TYPE))) {
                Object obj3 = this.f234b.get(0);
                o.c(obj3, "null cannot be cast to non-null type kotlin.Int");
                return ((Integer) obj3).intValue();
            } else if (o.a(obj, r.b(Long.TYPE))) {
                Object obj4 = this.f234b.get(0);
                o.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                return (int) ((Long) obj4).longValue();
            } else {
                throw new IllegalArgumentException("Only Float, Int and Long data types are supported!");
            }
        } else {
            throw new IllegalStateException("Tensor must be a scalar (0D) Tensor, or 1D Tensor with a single element!");
        }
    }

    public String toString() {
        List list = this.f233a;
        int size = this.f234b.size();
        Object obj = this.f235c;
        return "Tensor(shape=" + list + ", data size=" + size + ", data type = " + obj + ")";
    }

    public /* synthetic */ E(List list, List list2, Object obj, i iVar) {
        this(list, list2, obj);
    }
}
