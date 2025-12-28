package androidx.sqlite.db.framework;

import Z.j;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

public final /* synthetic */ class a implements SQLiteDatabase.CursorFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f6933a;

    public /* synthetic */ a(j jVar) {
        this.f6933a = jVar;
    }

    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        return FrameworkSQLiteDatabase.m(this.f6933a, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }
}
