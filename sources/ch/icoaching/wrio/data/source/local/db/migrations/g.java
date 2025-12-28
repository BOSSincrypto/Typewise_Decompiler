package ch.icoaching.wrio.data.source.local.db.migrations;

import android.database.sqlite.SQLiteDatabase;
import ch.icoaching.wrio.logging.Log;
import h2.q;
import kotlin.coroutines.c;
import kotlin.jvm.internal.o;

public final class g implements q {

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteDatabase f9559a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f9560b;

    public g(SQLiteDatabase sQLiteDatabase, Object obj) {
        o.e(sQLiteDatabase, "writableDatabase");
        o.e(obj, "writableDatabaseLock");
        this.f9559a = sQLiteDatabase;
        this.f9560b = obj;
    }

    public Object d(c cVar) {
        l2.q qVar;
        Log log = Log.f10572a;
        Log.d(log, "Migration38to39", "migrate() :: Start", (Throwable) null, 4, (Object) null);
        synchronized (this.f9560b) {
            try {
                this.f9559a.beginTransactionNonExclusive();
                this.f9559a.execSQL("DROP TABLE IF EXISTS dynamicLayout");
                this.f9559a.execSQL("create table if not exists dynamicLayout(keyCode integer not null, landscape integer default 0 not null, dynamicCenterWeight integer default 10 not null, dynamicCenterX float default 0.0 not null, dynamicCenterY float default 0.0 not null, keyboardMode text not null, PRIMARY KEY (keyCode,landscape) )");
                this.f9559a.setTransactionSuccessful();
                this.f9559a.endTransaction();
                qVar = l2.q.f14567a;
            } catch (Throwable th) {
                this.f9559a.endTransaction();
                throw th;
            }
        }
        Log.d(log, "Migration38to39", "migrate() :: End", (Throwable) null, 4, (Object) null);
        return qVar;
    }
}
