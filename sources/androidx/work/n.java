package androidx.work;

import androidx.work.u;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public final class n extends u {

    /* renamed from: e  reason: collision with root package name */
    public static final b f7432e = new b((i) null);

    public static final class a extends u.a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Class cls) {
            super(cls);
            o.e(cls, "workerClass");
            h().f14473d = OverwritingInputMerger.class.getName();
        }

        /* renamed from: m */
        public n c() {
            if (!d() || !h().f14479j.h()) {
                return new n(this);
            }
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }

        /* renamed from: n */
        public a g() {
            return this;
        }
    }

    public static final class b {
        public /* synthetic */ b(i iVar) {
            this();
        }

        public final n a(Class cls) {
            o.e(cls, "workerClass");
            return (n) new a(cls).b();
        }

        private b() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(a aVar) {
        super(aVar.e(), aVar.h(), aVar.f());
        o.e(aVar, "builder");
    }

    public static final n e(Class cls) {
        return f7432e.a(cls);
    }
}
