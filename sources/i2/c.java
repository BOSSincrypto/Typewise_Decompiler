package I2;

import H2.f;
import L2.b;
import kotlin.jvm.internal.o;

public interface c {

    public static final class a {
        public static int a(c cVar, f fVar) {
            o.e(fVar, "descriptor");
            return -1;
        }

        public static boolean b(c cVar) {
            return false;
        }

        public static /* synthetic */ Object c(c cVar, f fVar, int i4, F2.a aVar, Object obj, int i5, Object obj2) {
            if (obj2 == null) {
                if ((i5 & 8) != 0) {
                    obj = null;
                }
                return cVar.E(fVar, i4, aVar, obj);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableElement");
        }
    }

    Object E(f fVar, int i4, F2.a aVar, Object obj);

    float H(f fVar, int i4);

    b a();

    void c(f fVar);

    int e(f fVar);

    short i(f fVar, int i4);

    byte k(f fVar, int i4);

    Object m(f fVar, int i4, F2.a aVar, Object obj);

    boolean n(f fVar, int i4);

    int o(f fVar);

    boolean p();

    char q(f fVar, int i4);

    long r(f fVar, int i4);

    double u(f fVar, int i4);

    int v(f fVar, int i4);

    e x(f fVar, int i4);

    String z(f fVar, int i4);
}
