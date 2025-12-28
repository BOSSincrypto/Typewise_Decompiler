package ch.icoaching.wrio.data.source.local.db.migrations;

import android.database.sqlite.SQLiteDatabase;
import ch.icoaching.wrio.logging.Log;
import h2.q;
import kotlin.coroutines.c;
import kotlin.jvm.internal.o;

public final class k implements q {

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteDatabase f9567a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f9568b;

    public k(SQLiteDatabase sQLiteDatabase, Object obj) {
        o.e(sQLiteDatabase, "writableDatabase");
        o.e(obj, "writableDatabaseLock");
        this.f9567a = sQLiteDatabase;
        this.f9568b = obj;
    }

    public Object d(c cVar) {
        l2.q qVar;
        Log log = Log.f10572a;
        Log.d(log, "Migration42to43", "migrate() :: Start", (Throwable) null, 4, (Object) null);
        synchronized (this.f9568b) {
            try {
                this.f9567a.beginTransactionNonExclusive();
                this.f9567a.execSQL("DELETE FROM main_dictionary WHERE (wordMixedCase IS NULL OR wordMixedCase = '') AND typedMixedCase > typedLowerCase AND typedMixedCase > typedTitleCase");
                this.f9567a.setTransactionSuccessful();
                this.f9567a.endTransaction();
                qVar = l2.q.f14567a;
            } catch (Throwable th) {
                this.f9567a.endTransaction();
                throw th;
            }
        }
        Log.d(log, "Migration42to43", "migrate() :: End", (Throwable) null, 4, (Object) null);
        return qVar;
    }
}
