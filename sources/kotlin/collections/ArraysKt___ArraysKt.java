package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.o;
import l2.g;
import u2.l;
import z2.d;

abstract class ArraysKt___ArraysKt extends C0716k {
    public static Object A(Object[] objArr) {
        o.e(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static int B(int[] iArr) {
        o.e(iArr, "<this>");
        return iArr.length - 1;
    }

    public static int C(long[] jArr) {
        o.e(jArr, "<this>");
        return jArr.length - 1;
    }

    public static int D(Object[] objArr) {
        o.e(objArr, "<this>");
        return objArr.length - 1;
    }

    public static Object E(Object[] objArr, int i4) {
        o.e(objArr, "<this>");
        if (i4 < 0 || i4 >= objArr.length) {
            return null;
        }
        return objArr[i4];
    }

    public static final int F(byte[] bArr, byte b4) {
        o.e(bArr, "<this>");
        int length = bArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (b4 == bArr[i4]) {
                return i4;
            }
        }
        return -1;
    }

    public static final int G(char[] cArr, char c4) {
        o.e(cArr, "<this>");
        int length = cArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (c4 == cArr[i4]) {
                return i4;
            }
        }
        return -1;
    }

    public static final int H(int[] iArr, int i4) {
        o.e(iArr, "<this>");
        int length = iArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (i4 == iArr[i5]) {
                return i5;
            }
        }
        return -1;
    }

    public static final int I(long[] jArr, long j4) {
        o.e(jArr, "<this>");
        int length = jArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (j4 == jArr[i4]) {
                return i4;
            }
        }
        return -1;
    }

    public static int J(Object[] objArr, Object obj) {
        o.e(objArr, "<this>");
        int i4 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i4 < length) {
                if (objArr[i4] == null) {
                    return i4;
                }
                i4++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i4 < length2) {
            if (o.a(obj, objArr[i4])) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    public static final int K(short[] sArr, short s4) {
        o.e(sArr, "<this>");
        int length = sArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (s4 == sArr[i4]) {
                return i4;
            }
        }
        return -1;
    }

    public static final Appendable L(byte[] bArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, l lVar) {
        o.e(bArr, "<this>");
        o.e(appendable, "buffer");
        o.e(charSequence, "separator");
        o.e(charSequence2, "prefix");
        o.e(charSequence3, "postfix");
        o.e(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i5 = 0;
        for (byte b4 : bArr) {
            i5++;
            if (i5 > 1) {
                appendable.append(charSequence);
            }
            if (i4 >= 0 && i5 > i4) {
                break;
            }
            if (lVar != null) {
                appendable.append((CharSequence) lVar.invoke(Byte.valueOf(b4)));
            } else {
                appendable.append(String.valueOf(b4));
            }
        }
        if (i4 >= 0 && i5 > i4) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static final Appendable M(int[] iArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, l lVar) {
        o.e(iArr, "<this>");
        o.e(appendable, "buffer");
        o.e(charSequence, "separator");
        o.e(charSequence2, "prefix");
        o.e(charSequence3, "postfix");
        o.e(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i5 = 0;
        for (int i6 : iArr) {
            i5++;
            if (i5 > 1) {
                appendable.append(charSequence);
            }
            if (i4 >= 0 && i5 > i4) {
                break;
            }
            if (lVar != null) {
                appendable.append((CharSequence) lVar.invoke(Integer.valueOf(i6)));
            } else {
                appendable.append(String.valueOf(i6));
            }
        }
        if (i4 >= 0 && i5 > i4) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static final Appendable N(Object[] objArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, l lVar) {
        o.e(objArr, "<this>");
        o.e(appendable, "buffer");
        o.e(charSequence, "separator");
        o.e(charSequence2, "prefix");
        o.e(charSequence3, "postfix");
        o.e(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i5 = 0;
        for (Object obj : objArr) {
            i5++;
            if (i5 > 1) {
                appendable.append(charSequence);
            }
            if (i4 >= 0 && i5 > i4) {
                break;
            }
            kotlin.text.o.a(appendable, obj, lVar);
        }
        if (i4 >= 0 && i5 > i4) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static final String O(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, l lVar) {
        o.e(bArr, "<this>");
        o.e(charSequence, "separator");
        o.e(charSequence2, "prefix");
        o.e(charSequence3, "postfix");
        o.e(charSequence4, "truncated");
        String sb = ((StringBuilder) L(bArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i4, charSequence4, lVar)).toString();
        o.d(sb, "toString(...)");
        return sb;
    }

    public static final String P(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, l lVar) {
        o.e(iArr, "<this>");
        o.e(charSequence, "separator");
        o.e(charSequence2, "prefix");
        o.e(charSequence3, "postfix");
        o.e(charSequence4, "truncated");
        String sb = ((StringBuilder) M(iArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i4, charSequence4, lVar)).toString();
        o.d(sb, "toString(...)");
        return sb;
    }

    public static final String Q(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, l lVar) {
        o.e(objArr, "<this>");
        o.e(charSequence, "separator");
        o.e(charSequence2, "prefix");
        o.e(charSequence3, "postfix");
        o.e(charSequence4, "truncated");
        String sb = ((StringBuilder) N(objArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i4, charSequence4, lVar)).toString();
        o.d(sb, "toString(...)");
        return sb;
    }

    public static /* synthetic */ String R(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, l lVar, int i5, Object obj) {
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
        return O(bArr, charSequence, charSequence5, charSequence6, i6, charSequence7, lVar);
    }

    public static /* synthetic */ String S(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, l lVar, int i5, Object obj) {
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
        return P(iArr, charSequence, charSequence5, charSequence6, i6, charSequence7, lVar);
    }

    public static /* synthetic */ String T(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, l lVar, int i5, Object obj) {
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
        return Q(objArr, charSequence, charSequence5, charSequence6, i6, charSequence7, lVar);
    }

    public static Object U(Object[] objArr) {
        o.e(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[C0713h.D(objArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static char V(char[] cArr) {
        o.e(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    public static Object W(Object[] objArr) {
        o.e(objArr, "<this>");
        if (objArr.length == 1) {
            return objArr[0];
        }
        return null;
    }

    public static final List X(Object[] objArr, int i4) {
        o.e(objArr, "<this>");
        if (i4 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
        } else if (i4 == 0) {
            return C0718m.j();
        } else {
            int length = objArr.length;
            if (i4 >= length) {
                return C0713h.a0(objArr);
            }
            if (i4 == 1) {
                return C0718m.e(objArr[length - 1]);
            }
            ArrayList arrayList = new ArrayList(i4);
            for (int i5 = length - i4; i5 < length; i5++) {
                arrayList.add(objArr[i5]);
            }
            return arrayList;
        }
    }

    public static final Collection Y(Object[] objArr, Collection collection) {
        o.e(objArr, "<this>");
        o.e(collection, "destination");
        for (Object add : objArr) {
            collection.add(add);
        }
        return collection;
    }

    public static List Z(int[] iArr) {
        o.e(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            return C0718m.j();
        }
        if (length != 1) {
            return c0(iArr);
        }
        return C0718m.e(Integer.valueOf(iArr[0]));
    }

    public static List a0(Object[] objArr) {
        o.e(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            return C0718m.j();
        }
        if (length != 1) {
            return C0713h.d0(objArr);
        }
        return C0718m.e(objArr[0]);
    }

    public static List b0(byte[] bArr) {
        o.e(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte valueOf : bArr) {
            arrayList.add(Byte.valueOf(valueOf));
        }
        return arrayList;
    }

    public static final List c0(int[] iArr) {
        o.e(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        return arrayList;
    }

    public static List d0(Object[] objArr) {
        o.e(objArr, "<this>");
        return new ArrayList(C0720o.g(objArr));
    }

    public static final Set e0(Object[] objArr) {
        o.e(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            return L.e();
        }
        if (length != 1) {
            return (Set) Y(objArr, new LinkedHashSet(D.e(objArr.length)));
        }
        return L.d(objArr[0]);
    }

    public static Iterable f0(Object[] objArr) {
        o.e(objArr, "<this>");
        return new z(new ArraysKt___ArraysKt$withIndex$1(objArr));
    }

    public static List g0(Object[] objArr, Object[] objArr2) {
        o.e(objArr, "<this>");
        o.e(objArr2, "other");
        int min = Math.min(objArr.length, objArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i4 = 0; i4 < min; i4++) {
            arrayList.add(g.a(objArr[i4], objArr2[i4]));
        }
        return arrayList;
    }

    public static boolean q(byte[] bArr, byte b4) {
        o.e(bArr, "<this>");
        if (F(bArr, b4) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean r(char[] cArr, char c4) {
        o.e(cArr, "<this>");
        if (G(cArr, c4) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean s(int[] iArr, int i4) {
        o.e(iArr, "<this>");
        if (H(iArr, i4) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean t(long[] jArr, long j4) {
        o.e(jArr, "<this>");
        if (I(jArr, j4) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean u(Object[] objArr, Object obj) {
        o.e(objArr, "<this>");
        if (C0713h.J(objArr, obj) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean v(short[] sArr, short s4) {
        o.e(sArr, "<this>");
        if (K(sArr, s4) >= 0) {
            return true;
        }
        return false;
    }

    public static List w(Object[] objArr, int i4) {
        o.e(objArr, "<this>");
        if (i4 >= 0) {
            return X(objArr, d.b(objArr.length - i4, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    public static List x(Object[] objArr) {
        o.e(objArr, "<this>");
        return (List) y(objArr, new ArrayList());
    }

    public static final Collection y(Object[] objArr, Collection collection) {
        o.e(objArr, "<this>");
        o.e(collection, "destination");
        for (Object obj : objArr) {
            if (obj != null) {
                collection.add(obj);
            }
        }
        return collection;
    }

    public static Object z(Object[] objArr) {
        o.e(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }
}
