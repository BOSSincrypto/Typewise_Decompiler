package l0;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.o;

/* renamed from: l0.A  reason: case insensitive filesystem */
public interface C0782A {

    /* renamed from: l0.A$a */
    public static final class a {
        public static void a(C0782A a4, String str, Set set) {
            o.e(str, "id");
            o.e(set, "tags");
            Iterator it = set.iterator();
            while (it.hasNext()) {
                a4.a(new z((String) it.next(), str));
            }
        }
    }

    void a(z zVar);

    void b(String str, Set set);

    void c(String str);

    List d(String str);
}
