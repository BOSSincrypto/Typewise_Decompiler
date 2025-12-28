package U;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private final Map f1483a = new LinkedHashMap();

    /* renamed from: U.a$a  reason: collision with other inner class name */
    public static final class C0027a extends a {

        /* renamed from: b  reason: collision with root package name */
        public static final C0027a f1484b = new C0027a();

        private C0027a() {
        }

        public Object a(b bVar) {
            o.e(bVar, "key");
            return null;
        }
    }

    public interface b {
    }

    public abstract Object a(b bVar);

    public final Map b() {
        return this.f1483a;
    }
}
