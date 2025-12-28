package J2;

import F2.b;
import H2.f;
import I2.e;
import J2.F;
import kotlin.jvm.internal.o;

public abstract class H {

    public static final class a implements F {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f624a;

        a(b bVar) {
            this.f624a = bVar;
        }

        public f a() {
            throw new IllegalStateException("unsupported");
        }

        public Object b(e eVar) {
            o.e(eVar, "decoder");
            throw new IllegalStateException("unsupported");
        }

        public b[] c() {
            return new b[]{this.f624a};
        }

        public b[] d() {
            return F.a.a(this);
        }

        public void e(I2.f fVar, Object obj) {
            o.e(fVar, "encoder");
            throw new IllegalStateException("unsupported");
        }
    }

    public static final f a(String str, b bVar) {
        o.e(str, "name");
        o.e(bVar, "primitiveSerializer");
        return new G(str, new a(bVar));
    }
}
