package d3;

import kotlin.jvm.internal.o;
import okio.SegmentedByteString;

public abstract class c {
    public static final int a(int[] iArr, int i4, int i5, int i6) {
        o.e(iArr, "<this>");
        int i7 = i6 - 1;
        while (i5 <= i7) {
            int i8 = (i5 + i7) >>> 1;
            int i9 = iArr[i8];
            if (i9 < i4) {
                i5 = i8 + 1;
            } else if (i9 <= i4) {
                return i8;
            } else {
                i7 = i8 - 1;
            }
        }
        return (-i5) - 1;
    }

    public static final int b(SegmentedByteString segmentedByteString, int i4) {
        o.e(segmentedByteString, "<this>");
        int a4 = a(segmentedByteString.getDirectory$okio(), i4 + 1, 0, segmentedByteString.getSegments$okio().length);
        if (a4 >= 0) {
            return a4;
        }
        return ~a4;
    }
}
