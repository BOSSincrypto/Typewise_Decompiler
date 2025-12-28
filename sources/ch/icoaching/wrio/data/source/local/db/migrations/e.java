package ch.icoaching.wrio.data.source.local.db.migrations;

import android.database.sqlite.SQLiteDatabase;
import ch.icoaching.wrio.logging.Log;
import h2.q;
import kotlin.coroutines.c;
import kotlin.jvm.internal.o;

public final class e implements q {

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteDatabase f9555a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f9556b;

    public e(SQLiteDatabase sQLiteDatabase, Object obj) {
        o.e(sQLiteDatabase, "writableDatabase");
        o.e(obj, "writableDatabaseLock");
        this.f9555a = sQLiteDatabase;
        this.f9556b = obj;
    }

    public Object d(c cVar) {
        l2.q qVar;
        Log log = Log.f10572a;
        Log.d(log, "Migration36to37", "migrate() :: Start", (Throwable) null, 4, (Object) null);
        synchronized (this.f9556b) {
            try {
                this.f9555a.beginTransactionNonExclusive();
                this.f9555a.execSQL("ALTER TABLE recentEmoji ADD COLUMN emojiSkintone INTEGER DEFAULT 0 NOT NULL");
                this.f9555a.setTransactionSuccessful();
                this.f9555a.endTransaction();
                qVar = l2.q.f14567a;
            } catch (Throwable th) {
                this.f9555a.endTransaction();
                throw th;
            }
        }
        Log.d(log, "Migration36to37", "migrate() :: Done", (Throwable) null, 4, (Object) null);
        return qVar;
    }
}
