package ch.icoaching.wrio.data.source.local;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.c;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.D;
import kotlinx.coroutines.g0;

public abstract class TempHelperKt {
    public static final void a(List list, D d4, CoroutineDispatcher coroutineDispatcher) {
        o.e(list, "migrations");
        o.e(d4, "coroutineScope");
        o.e(coroutineDispatcher, "dispatcher");
        g0 unused = C0739h.d(d4, (CoroutineContext) null, (CoroutineStart) null, new TempHelperKt$runMigrations$1(coroutineDispatcher, list, (c<? super TempHelperKt$runMigrations$1>) null), 3, (Object) null);
    }

    public static final boolean b(SQLiteDatabase sQLiteDatabase, String str) {
        o.e(sQLiteDatabase, "<this>");
        o.e(str, "tableName");
        Cursor cursor = null;
        try {
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT DISTINCT tbl_name FROM sqlite_master where tbl_name = ?", new String[]{str});
            if (rawQuery.getCount() > 0) {
                rawQuery.close();
                return true;
            }
            rawQuery.close();
            return false;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }
}
