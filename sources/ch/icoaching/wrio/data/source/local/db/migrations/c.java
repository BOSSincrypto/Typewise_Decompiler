package ch.icoaching.wrio.data.source.local.db.migrations;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import ch.icoaching.wrio.logging.Log;
import h2.q;
import kotlin.coroutines.jvm.internal.a;
import kotlin.jvm.internal.o;

public final class c implements q {

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteDatabase f9551a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f9552b;

    public c(SQLiteDatabase sQLiteDatabase, Object obj) {
        o.e(sQLiteDatabase, "writableDatabase");
        o.e(obj, "writableDatabaseLock");
        this.f9551a = sQLiteDatabase;
        this.f9552b = obj;
    }

    public Object d(kotlin.coroutines.c cVar) {
        l2.q qVar;
        Log log = Log.f10572a;
        Log.d(log, "Migration33to34", "migrate() :: Start", (Throwable) null, 4, (Object) null);
        String str = "DELETE FROM " + "main_dictionary" + " WHERE " + "word" + " = ''";
        o.d(str, "toString(...)");
        synchronized (this.f9552b) {
            Log.d(log, "Migration33to34", "migrate() ... 1", (Throwable) null, 4, (Object) null);
            try {
                this.f9551a.beginTransactionNonExclusive();
                this.f9551a.execSQL(str);
                this.f9551a.setTransactionSuccessful();
                this.f9551a.endTransaction();
                Log.d(log, "Migration33to34", "migrate() ... 2", (Throwable) null, 4, (Object) null);
                ContentValues contentValues = new ContentValues();
                contentValues.put("word_id", a.d(-1));
                contentValues.put("word", "");
                contentValues.put("wordlist", a.d(0));
                this.f9551a.beginTransactionNonExclusive();
                this.f9551a.insert("main_dictionary", "", contentValues);
                this.f9551a.setTransactionSuccessful();
                this.f9551a.endTransaction();
                Log.d(log, "Migration33to34", "migrate() ... 3", (Throwable) null, 4, (Object) null);
                this.f9551a.execSQL("VACUUM");
                qVar = l2.q.f14567a;
            } catch (Throwable th) {
                this.f9551a.endTransaction();
                throw th;
            }
        }
        Log.d(log, "Migration33to34", "migrate() :: Done", (Throwable) null, 4, (Object) null);
        return qVar;
    }
}
