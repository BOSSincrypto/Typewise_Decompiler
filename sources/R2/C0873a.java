package r2;

import kotlin.random.Random;
import q2.C0867a;
import y2.C0965a;

/* renamed from: r2.a  reason: case insensitive filesystem */
public class C0873a extends C0867a {

    /* renamed from: r2.a$a  reason: collision with other inner class name */
    private static final class C0228a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0228a f16050a = new C0228a();

        /* renamed from: b  reason: collision with root package name */
        public static final Integer f16051b;

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
                    f16051b = num2;
                }
            } catch (Throwable unused) {
            }
            num = null;
            num2 = num;
            f16051b = num2;
        }

        private C0228a() {
        }
    }

    private final boolean c(int i4) {
        Integer num = C0228a.f16051b;
        if (num == null || num.intValue() >= i4) {
            return true;
        }
        return false;
    }

    public Random b() {
        if (c(34)) {
            return new C0965a();
        }
        return super.b();
    }
}
