package l0;

import java.util.List;
import kotlin.jvm.internal.o;

public interface j {

    public static final class a {
        public static i a(j jVar, m mVar) {
            o.e(mVar, "id");
            return jVar.f(mVar.b(), mVar.a());
        }

        public static void b(j jVar, m mVar) {
            o.e(mVar, "id");
            jVar.d(mVar.b(), mVar.a());
        }
    }

    void a(m mVar);

    List b();

    i c(m mVar);

    void d(String str, int i4);

    void e(String str);

    i f(String str, int i4);

    void g(i iVar);
}
