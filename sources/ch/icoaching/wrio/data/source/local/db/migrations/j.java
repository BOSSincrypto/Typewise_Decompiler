package ch.icoaching.wrio.data.source.local.db.migrations;

import android.database.sqlite.SQLiteDatabase;
import ch.icoaching.wrio.logging.Log;
import h2.q;
import kotlin.coroutines.c;
import kotlin.jvm.internal.o;

public final class j implements q {

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteDatabase f9565a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f9566b;

    public j(SQLiteDatabase sQLiteDatabase, Object obj) {
        o.e(sQLiteDatabase, "writableDatabase");
        o.e(obj, "writableDatabaseLock");
        this.f9565a = sQLiteDatabase;
        this.f9566b = obj;
    }

    public Object d(c cVar) {
        l2.q qVar;
        Log log = Log.f10572a;
        Log.d(log, "Migration41to42", "migrate() :: Start", (Throwable) null, 4, (Object) null);
        synchronized (this.f9566b) {
            try {
                this.f9565a.beginTransactionNonExclusive();
                this.f9565a.execSQL("UPDATE main_dictionary SET typedMixedCase = 0 WHERE word LIKE \"%'%\" AND (wordMixedCase = '' OR wordMixedCase is NULL)");
                this.f9565a.setTransactionSuccessful();
                this.f9565a.endTransaction();
                qVar = l2.q.f14567a;
            } catch (Throwable th) {
                this.f9565a.endTransaction();
                throw th;
            }
        }
        Log.d(log, "Migration41to42", "migrate() :: End", (Throwable) null, 4, (Object) null);
        return qVar;
    }
}
