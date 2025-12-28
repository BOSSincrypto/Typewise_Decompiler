package androidx.work.impl;

import Z.h;
import android.content.Context;
import androidx.room.RoomDatabase;
import androidx.room.r;
import androidx.sqlite.db.framework.d;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import l0.C0782A;
import l0.C0785b;
import l0.e;
import l0.j;
import l0.w;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Landroidx/work/impl/WorkDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "Ll0/w;", "J", "()Ll0/w;", "Ll0/b;", "E", "()Ll0/b;", "Ll0/A;", "K", "()Ll0/A;", "Ll0/j;", "G", "()Ll0/j;", "Ll0/o;", "H", "()Ll0/o;", "Ll0/r;", "I", "()Ll0/r;", "Ll0/e;", "F", "()Ll0/e;", "p", "a", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class WorkDatabase extends RoomDatabase {

    /* renamed from: p  reason: collision with root package name */
    public static final a f7225p = new a((i) null);

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        public static final h c(Context context, h.b bVar) {
            o.e(context, "$context");
            o.e(bVar, "configuration");
            h.b.a a4 = h.b.f2137f.a(context);
            a4.d(bVar.f2139b).c(bVar.f2140c).e(true).a(true);
            return new d().a(a4.b());
        }

        public final WorkDatabase b(Context context, Executor executor, boolean z3) {
            RoomDatabase.a aVar;
            o.e(context, "context");
            o.e(executor, "queryExecutor");
            Class<WorkDatabase> cls = WorkDatabase.class;
            if (z3) {
                aVar = r.c(context, cls).c();
            } else {
                aVar = r.a(context, cls, "androidx.work.workdb").f(new y(context));
            }
            return (WorkDatabase) aVar.g(executor).a(C0469c.f7299a).b(C0475i.f7333c).b(new s(context, 2, 3)).b(C0476j.f7334c).b(C0477k.f7335c).b(new s(context, 5, 6)).b(l.f7336c).b(m.f7337c).b(n.f7338c).b(new G(context)).b(new s(context, 10, 11)).b(C0472f.f7302c).b(C0473g.f7331c).b(C0474h.f7332c).e().d();
        }

        private a() {
        }
    }

    public static final WorkDatabase D(Context context, Executor executor, boolean z3) {
        return f7225p.b(context, executor, z3);
    }

    public abstract C0785b E();

    public abstract e F();

    public abstract j G();

    public abstract l0.o H();

    public abstract l0.r I();

    public abstract w J();

    public abstract C0782A K();
}
