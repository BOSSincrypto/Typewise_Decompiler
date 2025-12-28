package q2;

import kotlin.jvm.internal.o;
import p2.C0852a;

/* renamed from: q2.a  reason: case insensitive filesystem */
public abstract class C0867a extends C0852a {

    /* renamed from: q2.a$a  reason: collision with other inner class name */
    private static final class C0226a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0226a f15964a = new C0226a();

        /* renamed from: b  reason: collision with root package name */
        public static final Integer f15965b;

        static {
            Integer num;
            Integer num2 = null;
            try {
                Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get((Object) null);
                if (obj instanceof Integer) {
                    num = (Integer) obj;
                    if (num != null && num.intValue() > 0) {
                        num2 = num;
                    }
                    f15965b = num2;
                }
            } catch (Throwable unused) {
            }
            num = null;
            num2 = num;
            f15965b = num2;
        }

        private C0226a() {
        }
    }

    private final boolean c(int i4) {
        Integer num = C0226a.f15965b;
        if (num == null || num.intValue() >= i4) {
            return true;
        }
        return false;
    }

    public void a(Throwable th, Throwable th2) {
        o.e(th, "cause");
        o.e(th2, "exception");
        if (c(19)) {
            th.addSuppressed(th2);
        } else {
            super.a(th, th2);
        }
    }
}
