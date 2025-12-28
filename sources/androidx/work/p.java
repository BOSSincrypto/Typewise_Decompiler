package androidx.work;

import androidx.work.u;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public final class p extends u {

    /* renamed from: e  reason: collision with root package name */
    public static final b f7436e = new b((i) null);

    public static final class a extends u.a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Class cls, long j4, TimeUnit timeUnit, long j5, TimeUnit timeUnit2) {
            super(cls);
            o.e(cls, "workerClass");
            o.e(timeUnit, "repeatIntervalTimeUnit");
            o.e(timeUnit2, "flexIntervalTimeUnit");
            h().l(timeUnit.toMillis(j4), timeUnit2.toMillis(j5));
        }

        /* renamed from: m */
        public p c() {
            if (d() && h().f14479j.h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            } else if (!h().f14486q) {
                return new p(this);
            } else {
                throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
            }
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

        private b() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(a aVar) {
        super(aVar.e(), aVar.h(), aVar.f());
        o.e(aVar, "builder");
    }
}
