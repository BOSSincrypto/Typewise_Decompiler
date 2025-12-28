package K2;

import H2.f;
import H2.m;
import I2.e;
import java.util.List;
import kotlin.c;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.r;
import u2.C0906a;

public abstract class q {

    public static final class a implements f {

        /* renamed from: a  reason: collision with root package name */
        private final l2.f f858a;

        a(C0906a aVar) {
            this.f858a = c.b(aVar);
        }

        private final f f() {
            return (f) this.f858a.getValue();
        }

        public int a(String str) {
            o.e(str, "name");
            return f().a(str);
        }

        public String b() {
            return f().b();
        }

        public m c() {
            return f().c();
        }

        public int d() {
            return f().d();
        }

        public String e(int i4) {
            return f().e(i4);
        }

        public boolean g() {
            return f.a.c(this);
        }

        public List getAnnotations() {
            return f.a.a(this);
        }

        public List h(int i4) {
            return f().h(i4);
        }

        public f i(int i4) {
            return f().i(i4);
        }

        public boolean isInline() {
            return f.a.b(this);
        }

        public boolean j(int i4) {
            return f().j(i4);
        }
    }

    public static final g d(e eVar) {
        g gVar;
        o.e(eVar, "<this>");
        if (eVar instanceof g) {
            gVar = (g) eVar;
        } else {
            gVar = null;
        }
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + r.b(eVar.getClass()));
    }

    public static final r e(I2.f fVar) {
        r rVar;
        o.e(fVar, "<this>");
        if (fVar instanceof r) {
            rVar = (r) fVar;
        } else {
            rVar = null;
        }
        if (rVar != null) {
            return rVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + r.b(fVar.getClass()));
    }

    /* access modifiers changed from: private */
    public static final f f(C0906a aVar) {
        return new a(aVar);
    }

    /* access modifiers changed from: private */
    public static final void g(e eVar) {
        d(eVar);
    }

    /* access modifiers changed from: private */
    public static final void h(I2.f fVar) {
        e(fVar);
    }
}
