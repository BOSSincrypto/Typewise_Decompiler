package K2;

import F2.b;
import H2.f;
import H2.m;
import I2.e;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.u;

public final class C implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final C f805a = new C();

    /* renamed from: b  reason: collision with root package name */
    private static final f f806b = a.f807b;

    private static final class a implements f {

        /* renamed from: b  reason: collision with root package name */
        public static final a f807b = new a();

        /* renamed from: c  reason: collision with root package name */
        private static final String f808c = "kotlinx.serialization.json.JsonObject";

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ f f809a = G2.a.k(G2.a.E(u.f13912a), p.f856a).a();

        private a() {
        }

        public int a(String str) {
            o.e(str, "name");
            return this.f809a.a(str);
        }

        public String b() {
            return f808c;
        }

        public m c() {
            return this.f809a.c();
        }

        public int d() {
            return this.f809a.d();
        }

        public String e(int i4) {
            return this.f809a.e(i4);
        }

        public boolean g() {
            return this.f809a.g();
        }

        public List getAnnotations() {
            return this.f809a.getAnnotations();
        }

        public List h(int i4) {
            return this.f809a.h(i4);
        }

        public f i(int i4) {
            return this.f809a.i(i4);
        }

        public boolean isInline() {
            return this.f809a.isInline();
        }

        public boolean j(int i4) {
            return this.f809a.j(i4);
        }
    }

    private C() {
    }

    public f a() {
        return f806b;
    }

    /* renamed from: f */
    public B b(e eVar) {
        o.e(eVar, "decoder");
        q.g(eVar);
        return new B((Map) G2.a.k(G2.a.E(u.f13912a), p.f856a).b(eVar));
    }

    /* renamed from: g */
    public void e(I2.f fVar, B b4) {
        o.e(fVar, "encoder");
        o.e(b4, "value");
        q.h(fVar);
        G2.a.k(G2.a.E(u.f13912a), p.f856a).e(fVar, b4);
    }
}
