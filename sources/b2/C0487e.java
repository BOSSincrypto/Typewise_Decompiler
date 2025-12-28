package b2;

import F2.b;
import F2.l;
import F2.n;
import F2.q;
import java.lang.reflect.Type;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import okhttp3.B;
import okhttp3.v;
import okhttp3.z;

/* renamed from: b2.e  reason: case insensitive filesystem */
public abstract class C0487e {

    /* renamed from: b2.e$a */
    public static final class a extends C0487e {

        /* renamed from: a  reason: collision with root package name */
        private final q f7487a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(q qVar) {
            super((i) null);
            o.e(qVar, "format");
            this.f7487a = qVar;
        }

        public Object a(F2.a aVar, B b4) {
            o.e(aVar, "loader");
            o.e(b4, "body");
            String o4 = b4.o();
            o.d(o4, "body.string()");
            return b().c(aVar, o4);
        }

        public z d(v vVar, n nVar, Object obj) {
            o.e(vVar, "contentType");
            o.e(nVar, "saver");
            z c4 = z.c(vVar, b().b(nVar, obj));
            o.d(c4, "create(contentType, string)");
            return c4;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public q b() {
            return this.f7487a;
        }
    }

    public /* synthetic */ C0487e(i iVar) {
        this();
    }

    public abstract Object a(F2.a aVar, B b4);

    /* access modifiers changed from: protected */
    public abstract l b();

    public final b c(Type type) {
        o.e(type, "type");
        return F2.o.a(b().a(), type);
    }

    public abstract z d(v vVar, n nVar, Object obj);

    private C0487e() {
    }
}
