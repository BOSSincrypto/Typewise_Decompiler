package ch.icoaching.wrio.data.source.local.db.migrations;

import android.database.sqlite.SQLiteDatabase;
import ch.icoaching.wrio.logging.Log;
import h2.q;
import kotlin.coroutines.c;
import kotlin.jvm.internal.o;

public final class f implements q {

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteDatabase f9557a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f9558b;

    public f(SQLiteDatabase sQLiteDatabase, Object obj) {
        o.e(sQLiteDatabase, "writableDatabase");
        o.e(obj, "writableDatabaseLock");
        this.f9557a = sQLiteDatabase;
        this.f9558b = obj;
    }

    public Object d(c cVar) {
        l2.q qVar;
        Log log = Log.f10572a;
        Log.d(log, "Migration37to38", "migrate() :: Start", (Throwable) null, 4, (Object) null);
        synchronized (this.f9558b) {
            try {
                this.f9557a.beginTransactionNonExclusive();
                h2.o.f13650b.a(this.f9557a);
                this.f9557a.setTransactionSuccessful();
                this.f9557a.endTransaction();
                qVar = l2.q.f14567a;
            } catch (Throwable th) {
                this.f9557a.endTransaction();
                throw th;
            }
        }
        Log.d(log, "Migration37to38", "migrate() :: End", (Throwable) null, 4, (Object) null);
        return qVar;
    }
}
