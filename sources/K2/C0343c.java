package K2;

import F2.b;
import H2.f;
import H2.m;
import I2.e;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: K2.c  reason: case insensitive filesystem */
public final class C0343c implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final C0343c f817a = new C0343c();

    /* renamed from: b  reason: collision with root package name */
    private static final f f818b = a.f819b;

    /* renamed from: K2.c$a */
    private static final class a implements f {

        /* renamed from: b  reason: collision with root package name */
        public static final a f819b = new a();

        /* renamed from: c  reason: collision with root package name */
        private static final String f820c = "kotlinx.serialization.json.JsonArray";

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ f f821a = G2.a.h(p.f856a).a();

        private a() {
        }

        public int a(String str) {
            o.e(str, "name");
            return this.f821a.a(str);
        }

        public String b() {
            return f820c;
        }

        public m c() {
            return this.f821a.c();
        }

        public int d() {
            return this.f821a.d();
        }

        public String e(int i4) {
            return this.f821a.e(i4);
        }

        public boolean g() {
            return this.f821a.g();
        }

        public List getAnnotations() {
            return this.f821a.getAnnotations();
        }

        public List h(int i4) {
            return this.f821a.h(i4);
        }

        public f i(int i4) {
            return this.f821a.i(i4);
        }

        public boolean isInline() {
            return this.f821a.isInline();
        }

        public boolean j(int i4) {
            return this.f821a.j(i4);
        }
    }

    private C0343c() {
    }

    public f a() {
        return f818b;
    }

    /* renamed from: f */
    public C0342b b(e eVar) {
        o.e(eVar, "decoder");
        q.g(eVar);
        return new C0342b((List) G2.a.h(p.f856a).b(eVar));
    }

    /* renamed from: g */
    public void e(I2.f fVar, C0342b bVar) {
        o.e(fVar, "encoder");
        o.e(bVar, "value");
        q.h(fVar);
        G2.a.h(p.f856a).e(fVar, bVar);
    }
}
