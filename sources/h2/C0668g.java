package h2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import c.C0489b;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import l2.q;

/* renamed from: h2.g  reason: case insensitive filesystem */
public final class C0668g implements C0663b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f13638b = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final C0489b f13639a;

    /* renamed from: h2.g$a */
    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        private a() {
        }
    }

    public C0668g(C0489b bVar) {
        o.e(bVar, "databaseHandler");
        this.f13639a = bVar;
    }

    public void e(SQLiteDatabase sQLiteDatabase) {
        o.e(sQLiteDatabase, "db");
        sQLiteDatabase.execSQL("create table if not exists bigrams(bg_first integer(8) not null, bg_second integer(8) not null, bg_timesTyped integer default 0 not null, bg_timesSuggested integer default 0 not null, bg_timesTapped integer default 0 not null, bg_lastTyped integer(8) default (cast(strftime('%s', 'now') as integer(8))) not null, foreign key (bg_first) references main_dictionary(word_id) on delete cascade on update cascade, foreign key (bg_second) references main_dictionary(word_id) on delete cascade on update cascade, primary key (bg_first, bg_second))");
    }

    public void f(SQLiteDatabase sQLiteDatabase) {
        o.e(sQLiteDatabase, "db");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS bigrams");
    }

    public void g(long j4, long j5, int i4, long j6) {
        String str = "UPDATE bigrams SET bg_timesTyped = bg_timesTyped + " + i4 + ", bg_lastTyped = " + (j6 / 1000) + " WHERE bg_first = " + j4 + " AND bg_second = " + j5;
        Object obj = this.f13639a.f7503m;
        o.d(obj, "databaseLock");
        synchronized (obj) {
            SQLiteDatabase sQLiteDatabase = this.f13639a.f7501k;
            try {
                sQLiteDatabase.beginTransactionNonExclusive();
                sQLiteDatabase.execSQL(str);
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

    public boolean h(long j4, long j5) {
        Cursor cursor = null;
        try {
            cursor = this.f13639a.f7502l.query("bigrams", new String[]{"bg_timesTyped"}, "bg_first = ? AND bg_second = ?", new String[]{String.valueOf(j4), String.valueOf(j5)}, (String) null, (String) null, (String) null);
            if (cursor.moveToFirst()) {
                cursor.close();
                return true;
            }
        } catch (SQLException e4) {
            e4.printStackTrace();
            if (cursor == null) {
                return false;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        cursor.close();
        return false;
    }

    public long i(long j4, long j5, int i4, long j6) {
        long j7;
        Object obj = this.f13639a.f7503m;
        o.d(obj, "databaseLock");
        synchronized (obj) {
            SQLiteDatabase sQLiteDatabase = this.f13639a.f7501k;
            ContentValues contentValues = new ContentValues();
            contentValues.put("bg_first", Long.valueOf(j4));
            contentValues.put("bg_second", Long.valueOf(j5));
            contentValues.put("bg_timesTyped", Integer.valueOf(i4));
            contentValues.put("bg_lastTyped", Long.valueOf(j6 / 1000));
            try {
                sQLiteDatabase.beginTransactionNonExclusive();
                j7 = sQLiteDatabase.insert("bigrams", "", contentValues);
                sQLiteDatabase.setTransactionSuccessful();
            } catch (SQLException e4) {
                try {
                    e4.printStackTrace();
                    j7 = -1;
                } catch (Throwable th) {
                    sQLiteDatabase.endTransaction();
                    throw th;
                }
            }
            sQLiteDatabase.endTransaction();
        }
        return j7;
    }
}
