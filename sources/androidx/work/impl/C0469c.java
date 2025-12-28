package androidx.work.impl;

import Z.g;
import androidx.room.RoomDatabase;
import kotlin.jvm.internal.o;

/* renamed from: androidx.work.impl.c  reason: case insensitive filesystem */
public final class C0469c extends RoomDatabase.b {

    /* renamed from: a  reason: collision with root package name */
    public static final C0469c f7299a = new C0469c();

    private C0469c() {
    }

    private final String e() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + d() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    public void c(g gVar) {
        o.e(gVar, "db");
        super.c(gVar);
        gVar.j();
        try {
            gVar.p(e());
            gVar.V();
        } finally {
            gVar.i();
        }
    }

    public final long d() {
        return System.currentTimeMillis() - z.f7419a;
    }
}
