package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Field;
import kotlin.jvm.internal.o;

public abstract class e {
    private static final void a(int i4, int i5) {
        if (i5 > i4) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i4 + ", got " + i5 + ". Please update the Kotlin standard library.").toString());
        }
    }

    private static final d b(BaseContinuationImpl baseContinuationImpl) {
        return (d) baseContinuationImpl.getClass().getAnnotation(d.class);
    }

    private static final int c(BaseContinuationImpl baseContinuationImpl) {
        Integer num;
        int i4;
        try {
            Field declaredField = baseContinuationImpl.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(baseContinuationImpl);
            if (obj instanceof Integer) {
                num = (Integer) obj;
            } else {
                num = null;
            }
            if (num != null) {
                i4 = num.intValue();
            } else {
                i4 = 0;
            }
            return i4 - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static final StackTraceElement d(BaseContinuationImpl baseContinuationImpl) {
        int i4;
        String str;
        o.e(baseContinuationImpl, "<this>");
        d b4 = b(baseContinuationImpl);
        if (b4 == null) {
            return null;
        }
        a(1, b4.v());
        int c4 = c(baseContinuationImpl);
        if (c4 < 0) {
            i4 = -1;
        } else {
            i4 = b4.l()[c4];
        }
        String b5 = g.f13879a.b(baseContinuationImpl);
        if (b5 == null) {
            str = b4.c();
        } else {
            str = b5 + '/' + b4.c();
        }
        return new StackTraceElement(str, b4.m(), b4.f(), i4);
    }
}
