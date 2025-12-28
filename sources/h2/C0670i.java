package h2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import c.C0489b;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import l2.q;
import s2.C0896b;

/* renamed from: h2.i  reason: case insensitive filesystem */
public final class C0670i implements C0667f {

    /* renamed from: b  reason: collision with root package name */
    public static final a f13642b = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final C0489b f13643a;

    /* renamed from: h2.i$a */
    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public final int a(String str, SQLiteDatabase sQLiteDatabase) {
            o.e(str, "languageCode");
            o.e(sQLiteDatabase, "database");
            String str2 = "SELECT " + "language_id" + " FROM " + "dictionary_languages" + " WHERE " + "language_code=?";
            o.d(str2, "toString(...)");
            Cursor cursor = null;
            try {
                cursor = sQLiteDatabase.rawQuery(str2, new String[]{str});
                if (cursor.moveToFirst()) {
                    int i4 = cursor.getInt(0);
                    cursor.close();
                    return i4;
                }
            } catch (SQLException e4) {
                e4.printStackTrace();
                if (cursor == null) {
                    return -1;
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
            cursor.close();
            return -1;
        }

        public final Map b(SQLiteDatabase sQLiteDatabase) {
            o.e(sQLiteDatabase, "database");
            HashMap hashMap = new HashMap();
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT language_id, language_code FROM dictionary_languages", new String[0]);
            try {
                if (rawQuery.moveToFirst()) {
                    do {
                        hashMap.put(rawQuery.getString(1), Integer.valueOf(rawQuery.getInt(0)));
                    } while (rawQuery.moveToNext());
                }
                q qVar = q.f14567a;
                C0896b.a(rawQuery, (Throwable) null);
                return hashMap;
            } catch (Throwable th) {
                C0896b.a(rawQuery, th);
                throw th;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0049, code lost:
            if (r3 == null) goto L_0x004e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.List c(android.database.sqlite.SQLiteDatabase r6) {
            /*
                r5 = this;
                java.lang.String r0 = "database"
                kotlin.jvm.internal.o.e(r6, r0)
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "SELECT "
                r1.<init>(r2)
                java.lang.String r2 = "language_id"
                r1.append(r2)
                java.lang.String r2 = " FROM "
                r1.append(r2)
                java.lang.String r2 = "dictionary_languages"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "toString(...)"
                kotlin.jvm.internal.o.d(r1, r2)
                r2 = 0
                r3 = 0
                java.lang.String[] r4 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x0045 }
                android.database.Cursor r3 = r6.rawQuery(r1, r4)     // Catch:{ SQLiteException -> 0x0045 }
            L_0x0031:
                boolean r6 = r3.moveToNext()     // Catch:{ SQLiteException -> 0x0045 }
                if (r6 == 0) goto L_0x004b
                int r6 = r3.getInt(r2)     // Catch:{ SQLiteException -> 0x0045 }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ SQLiteException -> 0x0045 }
                r0.add(r6)     // Catch:{ SQLiteException -> 0x0045 }
                goto L_0x0031
            L_0x0043:
                r6 = move-exception
                goto L_0x004f
            L_0x0045:
                r6 = move-exception
                r6.printStackTrace()     // Catch:{ all -> 0x0043 }
                if (r3 == 0) goto L_0x004e
            L_0x004b:
                r3.close()
            L_0x004e:
                return r0
            L_0x004f:
                if (r3 == 0) goto L_0x0054
                r3.close()
            L_0x0054:
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: h2.C0670i.a.c(android.database.sqlite.SQLiteDatabase):java.util.List");
        }

        private a() {
        }
    }

    public C0670i(C0489b bVar) {
        o.e(bVar, "databaseHandler");
        this.f13643a = bVar;
    }

    private final void b(SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("language_code", "unknown");
        sQLiteDatabase.insertWithOnConflict("dictionary_languages", "", contentValues, 4);
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("language_code", "user_specific");
        sQLiteDatabase.insertWithOnConflict("dictionary_languages", "", contentValues2, 4);
    }

    public Map a() {
        a aVar = f13642b;
        SQLiteDatabase sQLiteDatabase = this.f13643a.f7502l;
        o.d(sQLiteDatabase, "readableDatabaseConnection");
        return aVar.b(sQLiteDatabase);
    }

    public boolean c(String str) {
        o.e(str, "languageCode");
        String str2 = "SELECT * FROM " + "dictionary_languages" + " WHERE " + "language_code" + " =?";
        o.d(str2, "toString(...)");
        Cursor cursor = null;
        try {
            cursor = this.f13643a.f7502l.rawQuery(str2, new String[]{str});
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

    public void e(SQLiteDatabase sQLiteDatabase) {
        o.e(sQLiteDatabase, "db");
        sQLiteDatabase.execSQL("create table if not exists dictionary_languages(language_id integer, language_code text not null unique, enabled integer not null default 1, version integer not null default 0, primary key (language_id))");
        b(sQLiteDatabase);
    }

    public void f(SQLiteDatabase sQLiteDatabase) {
        o.e(sQLiteDatabase, "db");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS dictionary_languages");
    }

    public void g(String str, int i4) {
        o.e(str, "language");
        Object obj = this.f13643a.f7503m;
        o.d(obj, "databaseLock");
        synchronized (obj) {
            SQLiteDatabase sQLiteDatabase = this.f13643a.f7501k;
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("version", Integer.valueOf(i4));
                sQLiteDatabase.beginTransactionNonExclusive();
                sQLiteDatabase.update("dictionary_languages", contentValues, "language_code = ?", new String[]{str});
                sQLiteDatabase.setTransactionSuccessful();
            } catch (SQLException e4) {
                try {
                    e4.printStackTrace();
                } catch (Throwable th) {
                    sQLiteDatabase.endTransaction();
                    throw th;
                }
            }
            sQLiteDatabase.endTransaction();
            q qVar = q.f14567a;
        }
    }

    public long h(String str) {
        long j4;
        o.e(str, "languageCode");
        Object obj = this.f13643a.f7503m;
        o.d(obj, "databaseLock");
        synchronized (obj) {
            SQLiteDatabase sQLiteDatabase = this.f13643a.f7501k;
            ContentValues contentValues = new ContentValues();
            contentValues.put("language_code", str);
            try {
                sQLiteDatabase.beginTransactionNonExclusive();
                j4 = sQLiteDatabase.insertWithOnConflict("dictionary_languages", "", contentValues, 4);
                sQLiteDatabase.setTransactionSuccessful();
            } catch (SQLException e4) {
                try {
                    e4.printStackTrace();
                    j4 = -1;
                } catch (Throwable th) {
                    sQLiteDatabase.endTransaction();
                    throw th;
                }
            }
            sQLiteDatabase.endTransaction();
        }
        return j4;
    }

    public int i(String str) {
        o.e(str, "languageCode");
        a aVar = f13642b;
        SQLiteDatabase sQLiteDatabase = this.f13643a.f7502l;
        o.d(sQLiteDatabase, "readableDatabaseConnection");
        return aVar.a(str, sQLiteDatabase);
    }
}
