package kotlin.collections;

import B2.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.jvm.internal.o;
import l2.g;
import n2.C0830a;
import u2.l;
import z2.d;

abstract class CollectionsKt___CollectionsKt extends v {

    public static final class a implements e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Iterable f13818a;

        public a(Iterable iterable) {
            this.f13818a = iterable;
        }

        public Iterator iterator() {
            return this.f13818a.iterator();
        }
    }

    public static int[] A0(Collection collection) {
        o.e(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            iArr[i4] = ((Number) it.next()).intValue();
            i4++;
        }
        return iArr;
    }

    public static List B0(Iterable iterable) {
        Object obj;
        o.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return C0720o.p(C0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C0718m.j();
        }
        if (size != 1) {
            return C0718m.D0(collection);
        }
        if (iterable instanceof List) {
            obj = ((List) iterable).get(0);
        } else {
            obj = iterable.iterator().next();
        }
        return C0718m.e(obj);
    }

    public static final List C0(Iterable iterable) {
        o.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return C0718m.D0((Collection) iterable);
        }
        return (List) y0(iterable, new ArrayList());
    }

    public static List D0(Collection collection) {
        o.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static Set E0(Iterable iterable) {
        o.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        return (Set) y0(iterable, new LinkedHashSet());
    }

    public static Set F0(Iterable iterable) {
        Object obj;
        o.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return N.g((Set) y0(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return L.e();
        }
        if (size != 1) {
            return (Set) y0(iterable, new LinkedHashSet(D.e(collection.size())));
        }
        if (iterable instanceof List) {
            obj = ((List) iterable).get(0);
        } else {
            obj = iterable.iterator().next();
        }
        return L.d(obj);
    }

    public static Set G0(Iterable iterable, Iterable iterable2) {
        o.e(iterable, "<this>");
        o.e(iterable2, "other");
        Set E02 = C0718m.E0(iterable);
        C0718m.z(E02, iterable2);
        return E02;
    }

    public static final List H0(Iterable iterable, int i4, int i5, boolean z3, l lVar) {
        o.e(iterable, "<this>");
        o.e(lVar, "transform");
        SlidingWindowKt.a(i4, i5);
        int i6 = 1;
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator b4 = SlidingWindowKt.b(iterable.iterator(), i4, i5, z3, true);
            while (b4.hasNext()) {
                arrayList.add(lVar.invoke((List) b4.next()));
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        int i7 = size / i5;
        int i8 = 0;
        if (size % i5 == 0) {
            i6 = 0;
        }
        ArrayList arrayList2 = new ArrayList(i7 + i6);
        J j4 = new J(list);
        while (i8 >= 0 && i8 < size) {
            int d4 = d.d(i4, size - i8);
            if (!z3 && d4 < i4) {
                break;
            }
            j4.b(i8, d4 + i8);
            arrayList2.add(lVar.invoke(j4));
            i8 += i5;
        }
        return arrayList2;
    }

    public static Iterable I0(Iterable iterable) {
        o.e(iterable, "<this>");
        return new z(new CollectionsKt___CollectionsKt$withIndex$1(iterable));
    }

    public static e J(Iterable iterable) {
        o.e(iterable, "<this>");
        return new a(iterable);
    }

    public static List J0(Iterable iterable, Iterable iterable2) {
        o.e(iterable, "<this>");
        o.e(iterable2, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(C0718m.t(iterable, 10), C0718m.t(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(g.a(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static List K(Iterable iterable, int i4, l lVar) {
        o.e(iterable, "<this>");
        o.e(lVar, "transform");
        return H0(iterable, i4, i4, true, lVar);
    }

    public static boolean L(Iterable iterable, Object obj) {
        o.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (U(iterable, obj) >= 0) {
            return true;
        }
        return false;
    }

    public static List M(Iterable iterable, int i4) {
        ArrayList arrayList;
        o.e(iterable, "<this>");
        if (i4 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
        } else if (i4 == 0) {
            return C0718m.B0(iterable);
        } else {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                int size = collection.size() - i4;
                if (size <= 0) {
                    return C0718m.j();
                }
                if (size == 1) {
                    return C0718m.e(a0(iterable));
                }
                arrayList = new ArrayList(size);
                if (iterable instanceof List) {
                    if (iterable instanceof RandomAccess) {
                        int size2 = collection.size();
                        while (i4 < size2) {
                            arrayList.add(((List) iterable).get(i4));
                            i4++;
                        }
                    } else {
                        ListIterator listIterator = ((List) iterable).listIterator(i4);
                        while (listIterator.hasNext()) {
                            arrayList.add(listIterator.next());
                        }
                    }
                    return arrayList;
                }
            } else {
                arrayList = new ArrayList();
            }
            int i5 = 0;
            for (Object next : iterable) {
                if (i5 >= i4) {
                    arrayList.add(next);
                } else {
                    i5++;
                }
            }
            return C0720o.p(arrayList);
        }
    }

    public static List N(List list, int i4) {
        o.e(list, "<this>");
        if (i4 >= 0) {
            return C0718m.v0(list, d.b(list.size() - i4, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    public static List O(Iterable iterable) {
        o.e(iterable, "<this>");
        return (List) P(iterable, new ArrayList());
    }

    public static final Collection P(Iterable iterable, Collection collection) {
        o.e(iterable, "<this>");
        o.e(collection, "destination");
        for (Object next : iterable) {
            if (next != null) {
                collection.add(next);
            }
        }
        return collection;
    }

    public static Object Q(Iterable iterable) {
        o.e(iterable, "<this>");
        if (iterable instanceof List) {
            return C0718m.R((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object R(List list) {
        o.e(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Object S(List list) {
        o.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object T(List list, int i4) {
        o.e(list, "<this>");
        if (i4 < 0 || i4 >= list.size()) {
            return null;
        }
        return list.get(i4);
    }

    public static final int U(Iterable iterable, Object obj) {
        o.e(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i4 = 0;
        for (Object next : iterable) {
            if (i4 < 0) {
                C0718m.s();
            }
            if (o.a(obj, next)) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    public static Set V(Iterable iterable, Iterable iterable2) {
        o.e(iterable, "<this>");
        o.e(iterable2, "other");
        Set E02 = C0718m.E0(iterable);
        t.H(E02, iterable2);
        return E02;
    }

    public static final Appendable W(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, l lVar) {
        o.e(iterable, "<this>");
        o.e(appendable, "buffer");
        o.e(charSequence, "separator");
        o.e(charSequence2, "prefix");
        o.e(charSequence3, "postfix");
        o.e(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i5 = 0;
        for (Object next : iterable) {
            i5++;
            if (i5 > 1) {
                appendable.append(charSequence);
            }
            if (i4 >= 0 && i5 > i4) {
                break;
            }
            kotlin.text.o.a(appendable, next, lVar);
        }
        if (i4 >= 0 && i5 > i4) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static /* synthetic */ Appendable X(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, l lVar, int i5, Object obj) {
        CharSequence charSequence5;
        CharSequence charSequence6;
        int i6;
        CharSequence charSequence7;
        l lVar2;
        if ((i5 & 2) != 0) {
            charSequence5 = ", ";
        } else {
            charSequence5 = charSequence;
        }
        CharSequence charSequence8 = "";
        if ((i5 & 4) != 0) {
            charSequence6 = charSequence8;
        } else {
            charSequence6 = charSequence2;
        }
        if ((i5 & 8) == 0) {
            charSequence8 = charSequence3;
        }
        if ((i5 & 16) != 0) {
            i6 = -1;
        } else {
            i6 = i4;
        }
        if ((i5 & 32) != 0) {
            charSequence7 = "...";
        } else {
            charSequence7 = charSequence4;
        }
        if ((i5 & 64) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        return W(iterable, appendable, charSequence5, charSequence6, charSequence8, i6, charSequence7, lVar2);
    }

    public static final String Y(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, l lVar) {
        o.e(iterable, "<this>");
        o.e(charSequence, "separator");
        o.e(charSequence2, "prefix");
        o.e(charSequence3, "postfix");
        o.e(charSequence4, "truncated");
        String sb = ((StringBuilder) W(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i4, charSequence4, lVar)).toString();
        o.d(sb, "toString(...)");
        return sb;
    }

    public static /* synthetic */ String Z(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, l lVar, int i5, Object obj) {
        CharSequence charSequence5;
        if ((i5 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i5 & 2) != 0) {
            charSequence5 = charSequence6;
        } else {
            charSequence5 = charSequence2;
        }
        if ((i5 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i5 & 8) != 0) {
            i4 = -1;
        }
        int i6 = i4;
        if ((i5 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i5 & 32) != 0) {
            lVar = null;
        }
        return Y(iterable, charSequence, charSequence5, charSequence6, i6, charSequence7, lVar);
    }

    public static final Object a0(Iterable iterable) {
        o.e(iterable, "<this>");
        if (iterable instanceof List) {
            return C0718m.b0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object b0(List list) {
        o.e(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(C0718m.l(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Object c0(List list) {
        o.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable d0(Iterable iterable) {
        o.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Float e0(Iterable iterable) {
        o.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static Comparable f0(Iterable iterable) {
        o.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            Comparable comparable = (Comparable) it.next();
            while (it.hasNext()) {
                Comparable comparable2 = (Comparable) it.next();
                if (comparable.compareTo(comparable2) < 0) {
                    comparable = comparable2;
                }
            }
            return comparable;
        }
        throw new NoSuchElementException();
    }

    public static Comparable g0(Iterable iterable) {
        o.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static List h0(Iterable iterable, Iterable iterable2) {
        o.e(iterable, "<this>");
        o.e(iterable2, "elements");
        Collection B3 = t.B(iterable2);
        if (B3.isEmpty()) {
            return C0718m.B0(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if (!B3.contains(next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static List i0(Collection collection, Iterable iterable) {
        o.e(collection, "<this>");
        o.e(iterable, "elements");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        C0718m.z(arrayList2, iterable);
        return arrayList2;
    }

    public static List j0(Collection collection, Object obj) {
        o.e(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static List k0(Iterable iterable) {
        o.e(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return C0718m.B0(iterable);
        }
        List C02 = C0(iterable);
        C0718m.I(C02);
        return C02;
    }

    public static Object l0(Iterable iterable) {
        o.e(iterable, "<this>");
        if (iterable instanceof List) {
            return m0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final Object m0(List list) {
        o.e(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        } else if (size == 1) {
            return list.get(0);
        } else {
            throw new IllegalArgumentException("List has more than one element.");
        }
    }

    public static Object n0(List list) {
        o.e(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static void o0(List list) {
        o.e(list, "<this>");
        C0718m.x(list, C0830a.c());
    }

    public static List p0(Iterable iterable) {
        o.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return C0718m.B0(iterable);
            }
            Object[] array = collection.toArray(new Comparable[0]);
            C0716k.n((Comparable[]) array);
            return C0713h.c(array);
        }
        List C02 = C0(iterable);
        C0718m.w(C02);
        return C02;
    }

    public static List q0(Iterable iterable) {
        o.e(iterable, "<this>");
        return C0718m.r0(iterable, C0830a.c());
    }

    public static List r0(Iterable iterable, Comparator comparator) {
        o.e(iterable, "<this>");
        o.e(comparator, "comparator");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return C0718m.B0(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            C0716k.o(array, comparator);
            return C0713h.c(array);
        }
        List C02 = C0(iterable);
        C0718m.x(C02, comparator);
        return C02;
    }

    public static float s0(Iterable iterable) {
        o.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        float f4 = 0.0f;
        while (it.hasNext()) {
            f4 += ((Number) it.next()).floatValue();
        }
        return f4;
    }

    public static int t0(Iterable iterable) {
        o.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 += ((Number) it.next()).intValue();
        }
        return i4;
    }

    public static long u0(Iterable iterable) {
        o.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        long j4 = 0;
        while (it.hasNext()) {
            j4 += ((Number) it.next()).longValue();
        }
        return j4;
    }

    public static List v0(Iterable iterable, int i4) {
        o.e(iterable, "<this>");
        if (i4 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
        } else if (i4 == 0) {
            return C0718m.j();
        } else {
            if (iterable instanceof Collection) {
                if (i4 >= ((Collection) iterable).size()) {
                    return C0718m.B0(iterable);
                }
                if (i4 == 1) {
                    return C0718m.e(C0718m.Q(iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i4);
            int i5 = 0;
            for (Object add : iterable) {
                arrayList.add(add);
                i5++;
                if (i5 == i4) {
                    break;
                }
            }
            return C0720o.p(arrayList);
        }
    }

    public static boolean[] w0(Collection collection) {
        o.e(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        Iterator it = collection.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            zArr[i4] = ((Boolean) it.next()).booleanValue();
            i4++;
        }
        return zArr;
    }

    public static byte[] x0(Collection collection) {
        o.e(collection, "<this>");
        byte[] bArr = new byte[collection.size()];
        Iterator it = collection.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            bArr[i4] = ((Number) it.next()).byteValue();
            i4++;
        }
        return bArr;
    }

    public static final Collection y0(Iterable iterable, Collection collection) {
        o.e(iterable, "<this>");
        o.e(collection, "destination");
        for (Object add : iterable) {
            collection.add(add);
        }
        return collection;
    }

    public static HashSet z0(Iterable iterable) {
        o.e(iterable, "<this>");
        return (HashSet) y0(iterable, new HashSet(D.e(C0718m.t(iterable, 12))));
    }
}
