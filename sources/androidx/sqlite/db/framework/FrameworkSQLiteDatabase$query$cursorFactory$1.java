package androidx.sqlite.db.framework;

import Z.j;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import u2.r;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\n¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "Landroid/database/sqlite/SQLiteCursor;", "<anonymous parameter 0>", "Landroid/database/sqlite/SQLiteDatabase;", "masterQuery", "Landroid/database/sqlite/SQLiteCursorDriver;", "editTable", "", "sqLiteQuery", "Landroid/database/sqlite/SQLiteQuery;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
final class FrameworkSQLiteDatabase$query$cursorFactory$1 extends Lambda implements r {
    final /* synthetic */ j $query;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FrameworkSQLiteDatabase$query$cursorFactory$1(j jVar) {
        super(4);
        this.$query = jVar;
    }

    public final SQLiteCursor invoke(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        j jVar = this.$query;
        o.b(sQLiteQuery);
        jVar.a(new e(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }
}
