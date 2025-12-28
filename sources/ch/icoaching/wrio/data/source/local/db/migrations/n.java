package ch.icoaching.wrio.data.source.local.db.migrations;

import android.database.sqlite.SQLiteDatabase;
import ch.icoaching.wrio.logging.Log;
import h2.q;
import kotlin.coroutines.c;
import kotlin.jvm.internal.o;

public final class n implements q {

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteDatabase f9572a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f9573b;

    public n(SQLiteDatabase sQLiteDatabase, Object obj) {
        o.e(sQLiteDatabase, "writableDatabase");
        o.e(obj, "writableDatabaseLock");
        this.f9572a = sQLiteDatabase;
        this.f9573b = obj;
    }

    public Object d(c cVar) {
        l2.q qVar;
        Log log = Log.f10572a;
        Log.d(log, "Migration45to46", "migrate() :: Start", (Throwable) null, 4, (Object) null);
        synchronized (this.f9573b) {
            try {
                this.f9572a.beginTransactionNonExclusive();
                this.f9572a.execSQL("DELETE FROM main_dictionary WHERE (wordMixedCase IS NULL OR wordMixedCase = '') AND typedMixedCase > typedLowerCase AND typedMixedCase > typedTitleCase AND wordlist = 0");
                this.f9572a.setTransactionSuccessful();
                this.f9572a.endTransaction();
                qVar = l2.q.f14567a;
            } catch (Throwable th) {
                this.f9572a.endTransaction();
                throw th;
            }
        }
        Log.d(log, "Migration45to46", "migrate() :: End", (Throwable) null, 4, (Object) null);
        return qVar;
    }
}
