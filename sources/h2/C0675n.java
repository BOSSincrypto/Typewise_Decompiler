package h2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import c.C0489b;
import ch.icoaching.wrio.keyboard.model.config.Emoji;
import ch.icoaching.wrio.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import l2.q;
import u2.p;

/* renamed from: h2.n  reason: case insensitive filesystem */
public final class C0675n implements r {

    /* renamed from: b  reason: collision with root package name */
    public static final a f13648b = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final C0489b f13649a;

    /* renamed from: h2.n$a */
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
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS recentEmoji");
                    sQLiteDatabase.execSQL("create table if not exists recentEmoji(emojiString text not null, emojiSkintone integer default 0 not null, emojiWeight integer not null, lastFitzpatrick text default '' not null, lastTyped integer(8) not null, PRIMARY KEY (emojiString))");
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

    public C0675n(C0489b bVar) {
        o.e(bVar, "databaseHandler");
        this.f13649a = bVar;
    }

    /* access modifiers changed from: private */
    public static final int d(Pair pair, Pair pair2) {
        o.e(pair, "o1");
        o.e(pair2, "o2");
        int intValue = ((Number) pair2.second).intValue();
        S s4 = pair.second;
        o.d(s4, "second");
        return intValue - ((Number) s4).intValue();
    }

    /* access modifiers changed from: private */
    public static final int h(p pVar, Object obj, Object obj2) {
        return ((Number) pVar.invoke(obj, obj2)).intValue();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.String[], android.database.Cursor] */
    public List a() {
        SQLiteDatabase sQLiteDatabase = this.f13649a.f7502l;
        ArrayList arrayList = new ArrayList();
        ? r32 = 0;
        try {
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT emojiString, emojiSkintone, emojiWeight FROM recentEmoji ORDER BY lastTyped DESC, emojiWeight DESC LIMIT 16", r32);
            while (rawQuery.moveToNext()) {
                boolean z3 = false;
                String string = rawQuery.getString(0);
                int i4 = rawQuery.getInt(1);
                int i5 = rawQuery.getInt(2);
                o.b(string);
                if (i4 != 0) {
                    z3 = true;
                }
                arrayList.add(new Pair(new Emoji(string, z3), Integer.valueOf(i5)));
            }
            rawQuery.close();
            C0718m.x(arrayList, new C0674m(new C0673l()));
            return arrayList;
        } catch (Throwable th) {
            if (r32 != 0) {
                r32.close();
            }
            throw th;
        }
    }

    public void e(SQLiteDatabase sQLiteDatabase) {
        o.e(sQLiteDatabase, "db");
        sQLiteDatabase.execSQL("create table if not exists recentEmoji(emojiString text not null, emojiSkintone integer default 0 not null, emojiWeight integer not null, lastFitzpatrick text default '' not null, lastTyped integer(8) not null, PRIMARY KEY (emojiString))");
    }

    public void f(SQLiteDatabase sQLiteDatabase) {
        o.e(sQLiteDatabase, "db");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS recentEmoji");
    }

    public void g(List list) {
        o.e(list, "emojis");
        Object obj = this.f13649a.f7503m;
        o.d(obj, "databaseLock");
        synchronized (obj) {
            SQLiteDatabase sQLiteDatabase = this.f13649a.f7501k;
            try {
                long currentTimeMillis = System.currentTimeMillis() / ((long) 1000);
                sQLiteDatabase.beginTransactionNonExclusive();
                ContentValues contentValues = new ContentValues();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    sQLiteDatabase.execSQL("UPDATE recentEmoji SET lastTyped = ?, emojiSkintone = ?, emojiWeight = ?, lastFitzpatrick = ? WHERE emojiString = ?", new Object[]{Long.valueOf(currentTimeMillis), Boolean.valueOf(((Emoji) pair.first).getHasSkinTones()), pair.second, "", ((Emoji) pair.first).getIcon()});
                    contentValues.clear();
                    contentValues.put("emojiString", ((Emoji) pair.first).getIcon());
                    contentValues.put("emojiSkintone", Boolean.valueOf(((Emoji) pair.first).getHasSkinTones()));
                    contentValues.put("emojiWeight", (Integer) pair.second);
                    contentValues.put("lastFitzpatrick", "");
                    contentValues.put("lastTyped", Long.valueOf(currentTimeMillis));
                    sQLiteDatabase.insertWithOnConflict("recentEmoji", (String) null, contentValues, 4);
                }
                sQLiteDatabase.setTransactionSuccessful();
            } catch (SQLiteException e4) {
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
}
