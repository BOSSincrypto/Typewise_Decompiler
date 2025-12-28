package ch.icoaching.wrio.data.source.local.db.migrations;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import ch.icoaching.wrio.F;
import ch.icoaching.wrio.logging.Log;
import h2.C0675n;
import h2.q;
import kotlin.coroutines.c;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public final class h implements q {

    /* renamed from: c  reason: collision with root package name */
    public static final a f9561c = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteDatabase f9562a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f9563b;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public final void a(SQLiteDatabase sQLiteDatabase, Object obj) {
            o.e(sQLiteDatabase, "writableDatabase");
            o.e(obj, "writableDatabaseLock");
            Log log = Log.f10572a;
            Log.d(log, "Migration39to40", "addHasSkinTonesColumnToRecentEmojisTable() :: Start", (Throwable) null, 4, (Object) null);
            if (F.a(sQLiteDatabase, "emojiSkintone", "recentEmoji")) {
                Log.d(log, "Migration39to40", "addHasSkinTonesColumnToRecentEmojisTable() :: End. 'emojiSkintone' column already exists.", (Throwable) null, 4, (Object) null);
                return;
            }
            Log.d(log, "Migration39to40", "addHasSkinTonesColumnToRecentEmojisTable() :: Creating column 'emojiSkintone'.", (Throwable) null, 4, (Object) null);
            synchronized (obj) {
                try {
                    sQLiteDatabase.beginTransactionNonExclusive();
                    sQLiteDatabase.execSQL("ALTER TABLE recentEmoji ADD COLUMN emojiSkintone INTEGER DEFAULT 0 NOT NULL");
                    sQLiteDatabase.setTransactionSuccessful();
                    sQLiteDatabase.endTransaction();
                } catch (SQLiteException e4) {
                    try {
                        Log.f10572a.e("Migration39to40", "Error migrating recent emojis.", e4);
                        sQLiteDatabase.endTransaction();
                        C0675n.f13648b.a(sQLiteDatabase, obj);
                    } catch (Throwable th) {
                        sQLiteDatabase.endTransaction();
                        throw th;
                    }
                }
                l2.q qVar = l2.q.f14567a;
            }
            Log.d(Log.f10572a, "Migration39to40", "migrateRecentEmojisTable() :: End", (Throwable) null, 4, (Object) null);
        }

        private a() {
        }
    }

    public h(SQLiteDatabase sQLiteDatabase, Object obj) {
        o.e(sQLiteDatabase, "writableDatabase");
        o.e(obj, "writableDatabaseLock");
        this.f9562a = sQLiteDatabase;
        this.f9563b = obj;
    }

    private final void a() {
        Log log = Log.f10572a;
        Log.d(log, "Migration39to40", "migrateRecentEmojisTable() :: Start", (Throwable) null, 4, (Object) null);
        f9561c.a(this.f9562a, this.f9563b);
        Log.d(log, "Migration39to40", "migrateRecentEmojisTable() :: End", (Throwable) null, 4, (Object) null);
    }

    private final void b() {
        Log log = Log.f10572a;
        Log.d(log, "Migration39to40", "migrateRecentSymbolsTable() :: Start", (Throwable) null, 4, (Object) null);
        synchronized (this.f9563b) {
            try {
                this.f9562a.beginTransactionNonExclusive();
                h2.o.f13650b.a(this.f9562a);
                this.f9562a.setTransactionSuccessful();
                this.f9562a.endTransaction();
                l2.q qVar = l2.q.f14567a;
            } catch (Throwable th) {
                this.f9562a.endTransaction();
                throw th;
            }
        }
        Log.d(log, "Migration39to40", "migrateRecentSymbolsTable() :: End", (Throwable) null, 4, (Object) null);
    }

    public Object d(c cVar) {
        Log log = Log.f10572a;
        Log.d(log, "Migration39to40", "migrate() :: Start", (Throwable) null, 4, (Object) null);
        a();
        b();
        Log.d(log, "Migration39to40", "migrate() :: End", (Throwable) null, 4, (Object) null);
        return l2.q.f14567a;
    }
}
