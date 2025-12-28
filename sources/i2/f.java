package I2;

import F2.n;
import L2.b;
import kotlin.jvm.internal.o;

public interface f {

    public static final class a {
        public static d a(f fVar, H2.f fVar2, int i4) {
            o.e(fVar2, "descriptor");
            return fVar.d(fVar2);
        }

        public static void b(f fVar) {
        }

        public static void c(f fVar, n nVar, Object obj) {
            o.e(nVar, "serializer");
            if (nVar.a().g()) {
                fVar.k(nVar, obj);
            } else if (obj == null) {
                fVar.i();
            } else {
                fVar.E();
                fVar.k(nVar, obj);
            }
        }

        public static void d(f fVar, n nVar, Object obj) {
            o.e(nVar, "serializer");
            nVar.e(fVar, obj);
        }
    }

    void B(long j4);

    void C(char c4);

    void E();

    void F(String str);

    b a();

    d d(H2.f fVar);

    void e(H2.f fVar, int i4);

    void i();

    void k(n nVar, Object obj);

    void l(double d4);

    void m(short s4);

    void q(byte b4);

    void r(boolean z3);

    f s(H2.f fVar);

    void u(int i4);

    d x(H2.f fVar, int i4);

    void y(float f4);
}
