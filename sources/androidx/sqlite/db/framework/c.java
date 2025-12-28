package androidx.sqlite.db.framework;

import Z.h;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper;

public final /* synthetic */ class c implements DatabaseErrorHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h.a f6935a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FrameworkSQLiteOpenHelper.b f6936b;

    public /* synthetic */ c(h.a aVar, FrameworkSQLiteOpenHelper.b bVar) {
        this.f6935a = aVar;
        this.f6936b = bVar;
    }

    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        FrameworkSQLiteOpenHelper.OpenHelper.e(this.f6935a, this.f6936b, sQLiteDatabase);
    }
}
