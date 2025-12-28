package ch.icoaching.wrio.data.source.local.db.migrations;

import android.database.sqlite.SQLiteDatabase;
import ch.icoaching.wrio.logging.Log;
import h2.q;
import kotlin.coroutines.c;
import kotlin.jvm.internal.o;

public final class l implements q {

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteDatabase f9569a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f9570b;

    public l(SQLiteDatabase sQLiteDatabase, Object obj) {
        o.e(sQLiteDatabase, "writableDatabase");
        o.e(obj, "writableDatabaseLock");
        this.f9569a = sQLiteDatabase;
        this.f9570b = obj;
    }

    public Object d(c cVar) {
        Log log = Log.f10572a;
        Log.d(log, "Migration43to44", "migrate() :: Start", (Throwable) null, 4, (Object) null);
        h.f9561c.a(this.f9569a, this.f9570b);
        Log.d(log, "Migration43to44", "migrate() :: End", (Throwable) null, 4, (Object) null);
        return l2.q.f14567a;
    }
}
