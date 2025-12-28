package kotlin.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: kotlin.collections.k  reason: case insensitive filesystem */
abstract class C0716k extends C0715j {
    public static List c(Object[] objArr) {
        o.e(objArr, "<this>");
        List a4 = C0717l.a(objArr);
        o.d(a4, "asList(...)");
        return a4;
    }

    public static byte[] d(byte[] bArr, byte[] bArr2, int i4, int i5, int i6) {
        o.e(bArr, "<this>");
        o.e(bArr2, "destination");
        System.arraycopy(bArr, i5, bArr2, i4, i6 - i5);
        return bArr2;
    }

    public static Object[] e(Object[] objArr, Object[] objArr2, int i4, int i5, int i6) {
        o.e(objArr, "<this>");
        o.e(objArr2, "destination");
        System.arraycopy(objArr, i5, objArr2, i4, i6 - i5);
        return objArr2;
    }

    public static /* synthetic */ byte[] f(byte[] bArr, byte[] bArr2, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i4 = 0;
        }
        if ((i7 & 4) != 0) {
            i5 = 0;
        }
        if ((i7 & 8) != 0) {
            i6 = bArr.length;
        }
        return C0713h.d(bArr, bArr2, i4, i5, i6);
    }

    public static /* synthetic */ Object[] g(Object[] objArr, Object[] objArr2, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i4 = 0;
        }
        if ((i7 & 4) != 0) {
            i5 = 0;
        }
        if ((i7 & 8) != 0) {
            i6 = objArr.length;
        }
        return C0713h.e(objArr, objArr2, i4, i5, i6);
    }

    public static byte[] h(byte[] bArr, int i4, int i5) {
        o.e(bArr, "<this>");
        C0714i.b(i5, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i4, i5);
        o.d(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static Object[] i(Object[] objArr, int i4, int i5) {
        o.e(objArr, "<this>");
        C0714i.b(i5, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i4, i5);
        o.d(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static void j(Object[] objArr, Object obj, int i4, int i5) {
        o.e(objArr, "<this>");
        Arrays.fill(objArr, i4, i5, obj);
    }

    public static /* synthetic */ void k(Object[] objArr, Object obj, int i4, int i5, int i6, Object obj2) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = objArr.length;
        }
        C0713h.j(objArr, obj, i4, i5);
    }

    public static byte[] l(byte[] bArr, byte[] bArr2) {
        o.e(bArr, "<this>");
        o.e(bArr2, "elements");
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] copyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, copyOf, length, length2);
        o.b(copyOf);
        return copyOf;
    }

    public static Object[] m(Object[] objArr, Object[] objArr2) {
        o.e(objArr, "<this>");
        o.e(objArr2, "elements");
        int length = objArr.length;
        int length2 = objArr2.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(objArr2, 0, copyOf, length, length2);
        o.b(copyOf);
        return copyOf;
    }

    public static final void n(Object[] objArr) {
        o.e(objArr, "<this>");
        if (objArr.length > 1) {
            Arrays.sort(objArr);
        }
    }

    public static final void o(Object[] objArr, Comparator comparator) {
        o.e(objArr, "<this>");
        o.e(comparator, "comparator");
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }

    public static Character[] p(char[] cArr) {
        o.e(cArr, "<this>");
        Character[] chArr = new Character[cArr.length];
        int length = cArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            chArr[i4] = Character.valueOf(cArr[i4]);
        }
        return chArr;
    }
}
