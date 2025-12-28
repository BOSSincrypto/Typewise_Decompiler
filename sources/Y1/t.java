package Y1;

import com.ibm.icu.util.ICUException;
import java.util.Collection;
import java.util.Comparator;

public abstract class t {

    /* renamed from: a  reason: collision with root package name */
    public static final Comparator f2078a = new a();

    static class a implements Comparator {
        a() {
        }

        /* renamed from: a */
        public int compare(int[] iArr, int[] iArr2) {
            int min = Math.min(iArr.length, iArr2.length);
            for (int i4 = 0; i4 < min; i4++) {
                int i5 = iArr[i4] - iArr2[i4];
                if (i5 != 0) {
                    return i5;
                }
            }
            return iArr.length - iArr2.length;
        }
    }

    private static void a(int i4, int i5, int[] iArr, int[] iArr2, StringBuilder sb, Collection collection) {
        boolean z3;
        int i6 = i4;
        int[] iArr3 = iArr2;
        StringBuilder sb2 = sb;
        int i7 = iArr[i6 + i5];
        int i8 = iArr3[i6];
        if (i7 <= i8) {
            if (i6 == iArr3.length - 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            int length = sb.length();
            for (int i9 = i7; i9 <= i8; i9++) {
                sb2.appendCodePoint(i9);
                if (z3) {
                    collection.add(sb.toString());
                } else {
                    Collection collection2 = collection;
                    a(i6 + 1, i5, iArr, iArr2, sb, collection);
                }
                sb2.setLength(length);
            }
            return;
        }
        throw new ICUException("Range must have xᵢ ≤ yᵢ for each index i");
    }

    public static Collection b(String str, String str2, boolean z3, Collection collection) {
        if (str == null || str2 == null) {
            throw new ICUException("Range must have 2 valid strings");
        }
        int[] a4 = Z1.a.a(str);
        int[] a5 = Z1.a.a(str2);
        int length = a4.length - a5.length;
        if (z3 && length != 0) {
            throw new ICUException("Range must have equal-length strings");
        } else if (length < 0) {
            throw new ICUException("Range must have start-length ≥ end-length");
        } else if (a5.length != 0) {
            StringBuilder sb = new StringBuilder();
            for (int i4 = 0; i4 < length; i4++) {
                sb.appendCodePoint(a4[i4]);
            }
            a(0, length, a4, a5, sb, collection);
            return collection;
        } else {
            throw new ICUException("Range must have end-length > 0");
        }
    }
}
