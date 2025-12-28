package ch.icoaching.wrio.data.source.local.db.migrations;

import android.database.sqlite.SQLiteDatabase;
import ch.icoaching.wrio.logging.Log;
import h2.q;
import kotlin.coroutines.c;

public final class o implements q {

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteDatabase f9574a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f9575b;

    public o(SQLiteDatabase sQLiteDatabase, Object obj) {
        kotlin.jvm.internal.o.e(sQLiteDatabase, "writableDatabase");
        kotlin.jvm.internal.o.e(obj, "writableDatabaseLock");
        this.f9574a = sQLiteDatabase;
        this.f9575b = obj;
    }

    public Object d(c cVar) {
        l2.q qVar;
        Log log = Log.f10572a;
        Log.d(log, "Migration48to49", "migrate() :: Start", (Throwable) null, 4, (Object) null);
        synchronized (this.f9575b) {
            try {
                this.f9574a.beginTransactionNonExclusive();
                this.f9574a.execSQL("UPDATE main_dictionary SET timesTyped = 0  WHERE timesTyped < 0");
                this.f9574a.setTransactionSuccessful();
                this.f9574a.endTransaction();
                qVar = l2.q.f14567a;
            } catch (Throwable th) {
                this.f9574a.endTransaction();
                throw th;
            }
        }
        Log.d(log, "Migration48to49", "migrate() :: End", (Throwable) null, 4, (Object) null);
        return qVar;
    }
}
