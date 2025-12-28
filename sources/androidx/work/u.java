package androidx.work;

import android.os.Build;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.collections.L;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import l0.v;

public abstract class u {

    /* renamed from: d  reason: collision with root package name */
    public static final b f7437d = new b((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final UUID f7438a;

    /* renamed from: b  reason: collision with root package name */
    private final v f7439b;

    /* renamed from: c  reason: collision with root package name */
    private final Set f7440c;

    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        private final Class f7441a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f7442b;

        /* renamed from: c  reason: collision with root package name */
        private UUID f7443c;

        /* renamed from: d  reason: collision with root package name */
        private v f7444d;

        /* renamed from: e  reason: collision with root package name */
        private final Set f7445e;

        public a(Class cls) {
            o.e(cls, "workerClass");
            this.f7441a = cls;
            UUID randomUUID = UUID.randomUUID();
            o.d(randomUUID, "randomUUID()");
            this.f7443c = randomUUID;
            String uuid = this.f7443c.toString();
            o.d(uuid, "id.toString()");
            String name = cls.getName();
            o.d(name, "workerClass.name");
            this.f7444d = new v(uuid, name);
            String name2 = cls.getName();
            o.d(name2, "workerClass.name");
            this.f7445e = L.f(name2);
        }

        public final a a(String str) {
            o.e(str, "tag");
            this.f7445e.add(str);
            return g();
        }

        public final u b() {
            boolean z3;
            u c4 = c();
            b bVar = this.f7444d.f14479j;
            if ((Build.VERSION.SDK_INT < 24 || !bVar.e()) && !bVar.f() && !bVar.g() && !bVar.h()) {
                z3 = false;
            } else {
                z3 = true;
            }
            v vVar = this.f7444d;
            if (vVar.f14486q) {
                if (z3) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                } else if (vVar.f14476g > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            UUID randomUUID = UUID.randomUUID();
            o.d(randomUUID, "randomUUID()");
            k(randomUUID);
            return c4;
        }

        public abstract u c();

        public final boolean d() {
            return this.f7442b;
        }

        public final UUID e() {
            return this.f7443c;
        }

        public final Set f() {
            return this.f7445e;
        }

        public abstract a g();

        public final v h() {
            return this.f7444d;
        }

        public final a i(BackoffPolicy backoffPolicy, long j4, TimeUnit timeUnit) {
            o.e(backoffPolicy, "backoffPolicy");
            o.e(timeUnit, "timeUnit");
            this.f7442b = true;
            v vVar = this.f7444d;
            vVar.f14481l = backoffPolicy;
            vVar.k(timeUnit.toMillis(j4));
            return g();
        }

        public final a j(b bVar) {
            o.e(bVar, "constraints");
            this.f7444d.f14479j = bVar;
            return g();
        }

        public final a k(UUID uuid) {
            o.e(uuid, "id");
            this.f7443c = uuid;
            String uuid2 = uuid.toString();
            o.d(uuid2, "id.toString()");
            this.f7444d = new v(uuid2, this.f7444d);
            return g();
        }

        public a l(long j4, TimeUnit timeUnit) {
            o.e(timeUnit, "timeUnit");
            this.f7444d.f14476g = timeUnit.toMillis(j4);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.f7444d.f14476g) {
                return g();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }
    }

    public static final class b {
        public /* synthetic */ b(i iVar) {
            this();
        }

        private b() {
        }
    }

    public u(UUID uuid, v vVar, Set set) {
        o.e(uuid, "id");
        o.e(vVar, "workSpec");
        o.e(set, "tags");
        this.f7438a = uuid;
        this.f7439b = vVar;
        this.f7440c = set;
    }

    public UUID a() {
        return this.f7438a;
    }

    public final String b() {
        String uuid = a().toString();
        o.d(uuid, "id.toString()");
        return uuid;
    }

    public final Set c() {
        return this.f7440c;
    }

    public final v d() {
        return this.f7439b;
    }
}
