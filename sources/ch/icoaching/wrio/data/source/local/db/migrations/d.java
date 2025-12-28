package ch.icoaching.wrio.data.source.local.db.migrations;

import android.database.sqlite.SQLiteDatabase;
import ch.icoaching.wrio.logging.Log;
import h2.q;
import kotlin.coroutines.c;
import kotlin.jvm.internal.o;

public final class d implements q {

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteDatabase f9553a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f9554b;

    public d(SQLiteDatabase sQLiteDatabase, Object obj) {
        o.e(sQLiteDatabase, "writableDatabase");
        o.e(obj, "writableDatabaseLock");
        this.f9553a = sQLiteDatabase;
        this.f9554b = obj;
    }

    public Object d(c cVar) {
        l2.q qVar;
        Log log = Log.f10572a;
        Log.d(log, "Migration34to35", "migrate() :: Start", (Throwable) null, 4, (Object) null);
        synchronized (this.f9554b) {
            this.f9553a.execSQL("DROP INDEX IF EXISTS idx_word_language_code");
            this.f9553a.execSQL("DROP INDEX IF EXISTS idx_language_code");
            qVar = l2.q.f14567a;
        }
        Log.d(log, "Migration34to35", "migrate() :: Done", (Throwable) null, 4, (Object) null);
        return qVar;
    }
}
