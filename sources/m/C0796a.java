package m;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.o;

/* renamed from: m.a  reason: case insensitive filesystem */
public abstract class C0796a {

    /* renamed from: m.a$a  reason: collision with other inner class name */
    public static final class C0206a {

        /* renamed from: a  reason: collision with root package name */
        private final Object f14568a;

        public C0206a(Object obj) {
            this.f14568a = obj;
        }

        public final Object a() {
            return this.f14568a;
        }
    }

    public abstract Intent a(Context context, Object obj);

    public C0206a b(Context context, Object obj) {
        o.e(context, "context");
        return null;
    }

    public abstract Object c(int i4, Intent intent);
}
