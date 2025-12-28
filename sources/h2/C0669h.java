package h2;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import c.C0489b;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import l2.q;

/* renamed from: h2.h  reason: case insensitive filesystem */
public final class C0669h implements C0665d {

    /* renamed from: b  reason: collision with root package name */
    public static final a f13640b = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final C0489b f13641a;

    /* renamed from: h2.h$a */
    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public final void a(SQLiteDatabase sQLiteDatabase, Object obj) {
            o.e(sQLiteDatabase, "writableDatabase");
            o.e(obj, "writableDatabaseLock");
            synchronized (obj) {
                try {
                    sQLiteDatabase.beginTransactionNonExclusive();
                    sQLiteDatabase.execSQL("DELETE FROM deletes");
                    sQLiteDatabase.setTransactionSuccessful();
                    sQLiteDatabase.endTransaction();
                } catch (SQLException e4) {
                    try {
                        e4.printStackTrace();
                        sQLiteDatabase.endTransaction();
                    } catch (Throwable th) {
                        sQLiteDatabase.endTransaction();
                        throw th;
                    }
                }
                q qVar = q.f14567a;
            }
        }

        private a() {
        }
    }

    public C0669h(C0489b bVar) {
        o.e(bVar, "databaseHandler");
        this.f13641a = bVar;
    }

    public void a() {
        Object obj = this.f13641a.f7503m;
        o.d(obj, "databaseLock");
        synchronized (obj) {
            SQLiteDatabase sQLiteDatabase = this.f13641a.f7501k;
            try {
                sQLiteDatabase.beginTransactionNonExclusive();
                sQLiteDatabase.execSQL("DELETE FROM deletes WHERE deletes.delete_id NOT IN (SELECT deletes_dictionary.delete_id FROM deletes_dictionary)");
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
            } catch (SQLException e4) {
                try {
                    e4.printStackTrace();
                } finally {
                    sQLiteDatabase.endTransaction();
                }
            }
            q qVar = q.f14567a;
        }
    }

    public void e(SQLiteDatabase sQLiteDatabase) {
        o.e(sQLiteDatabase, "db");
        sQLiteDatabase.execSQL("create table if not exists deletes(delete_id integer, delete_string text not null unique, delete_values text, primary key (delete_id))");
    }

    public void f(SQLiteDatabase sQLiteDatabase) {
        o.e(sQLiteDatabase, "db");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS deletes");
    }
}
