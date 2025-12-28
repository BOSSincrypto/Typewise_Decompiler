package kotlinx.serialization.json.internal;

import kotlin.Result;
import kotlin.f;
import kotlin.jvm.internal.o;

/* renamed from: kotlinx.serialization.json.internal.d  reason: case insensitive filesystem */
public abstract class C0765d {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final int f14387a;

    static {
        Object obj;
        int i4;
        try {
            Result.a aVar = Result.Companion;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            o.d(property, "getProperty(...)");
            obj = Result.m1constructorimpl(kotlin.text.o.m(property));
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            obj = Result.m1constructorimpl(f.a(th));
        }
        if (Result.m7isFailureimpl(obj)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            i4 = num.intValue();
        } else {
            i4 = 2097152;
        }
        f14387a = i4;
    }
}
