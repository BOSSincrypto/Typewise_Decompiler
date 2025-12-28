package ch.icoaching.wrio.data.source.local.db.migrations;

import android.database.sqlite.SQLiteDatabase;
import ch.icoaching.wrio.logging.Log;
import kotlin.coroutines.c;
import kotlin.jvm.internal.o;

public final class q implements h2.q {

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteDatabase f9577a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f9578b;

    public q(SQLiteDatabase sQLiteDatabase, Object obj) {
        o.e(sQLiteDatabase, "writableDatabase");
        o.e(obj, "writableDatabaseLock");
        this.f9577a = sQLiteDatabase;
        this.f9578b = obj;
    }

    public Object d(c cVar) {
        l2.q qVar;
        Log log = Log.f10572a;
        Log.d(log, "Migration50to51", "migrate() :: Start", (Throwable) null, 4, (Object) null);
        synchronized (this.f9578b) {
            try {
                this.f9577a.beginTransactionNonExclusive();
                this.f9577a.execSQL("DROP VIEW IF EXISTS deletes_words");
                this.f9577a.setTransactionSuccessful();
                this.f9577a.endTransaction();
                qVar = l2.q.f14567a;
            } catch (Throwable th) {
                this.f9577a.endTransaction();
                throw th;
            }
        }
        Log.d(log, "Migration50to51", "migrate() :: End", (Throwable) null, 4, (Object) null);
        return qVar;
    }
}
