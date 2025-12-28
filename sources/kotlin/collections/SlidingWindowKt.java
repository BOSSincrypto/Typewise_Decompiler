package kotlin.collections;

import B2.h;
import java.util.Iterator;
import kotlin.coroutines.c;
import kotlin.jvm.internal.o;

public abstract class SlidingWindowKt {
    public static final void a(int i4, int i5) {
        String str;
        if (i4 <= 0 || i5 <= 0) {
            if (i4 != i5) {
                str = "Both size " + i4 + " and step " + i5 + " must be greater than zero.";
            } else {
                str = "size " + i4 + " must be greater than zero.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    public static final Iterator b(Iterator it, int i4, int i5, boolean z3, boolean z4) {
        o.e(it, "iterator");
        if (!it.hasNext()) {
            return w.f13866a;
        }
        return h.a(new SlidingWindowKt$windowedIterator$1(i4, i5, it, z4, z3, (c<? super SlidingWindowKt$windowedIterator$1>) null));
    }
}
