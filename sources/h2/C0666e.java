package h2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import ch.icoaching.wrio.logging.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.o;
import l2.q;

/* renamed from: h2.e  reason: case insensitive filesystem */
public abstract class C0666e {
    public static final Map a(Set set, SQLiteDatabase sQLiteDatabase, Object obj) {
        Cursor cursor;
        o.e(set, "deletes");
        o.e(sQLiteDatabase, "writableDatabase");
        o.e(obj, "writableDatabaseLock");
        HashMap hashMap = new HashMap(set.size());
        HashSet<String> hashSet = new HashSet<>();
        Log.d(Log.f10572a, "DictionaryDatabase", "insertOrFetchDeletes() :: ... 1", (Throwable) null, 4, (Object) null);
        String str = "SELECT " + "delete_id" + " FROM " + "deletes" + " WHERE " + "delete_string" + " = ?";
        o.d(str, "toString(...)");
        synchronized (obj) {
            try {
                Iterator it = set.iterator();
                cursor = null;
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    try {
                        cursor = sQLiteDatabase.rawQuery(str, new String[]{str2});
                        if (cursor.moveToFirst()) {
                            hashMap.put(str2, Integer.valueOf(cursor.getInt(0)));
                        } else {
                            hashSet.add(str2);
                        }
                    } catch (SQLiteException e4) {
                        Log.f10572a.c("DictionaryDatabase", "insertOrFetchDeletes() :: ... 1", e4);
                        if (cursor == null) {
                        }
                    }
                    cursor.close();
                }
                Log.d(Log.f10572a, "DictionaryDatabase", "insertOrFetchDeletes() :: ... 2", (Throwable) null, 4, (Object) null);
                try {
                    ContentValues contentValues = new ContentValues();
                    sQLiteDatabase.beginTransactionNonExclusive();
                    for (String str3 : hashSet) {
                        contentValues.put("delete_string", str3);
                        hashMap.put(str3, Integer.valueOf((int) sQLiteDatabase.insert("deletes", "", contentValues)));
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                    sQLiteDatabase.endTransaction();
                } catch (Exception e5) {
                    e5.printStackTrace();
                    sQLiteDatabase.endTransaction();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hashMap;
    }

    public static final boolean b(List list, SQLiteDatabase sQLiteDatabase, Object obj) {
        o.e(list, "deletesDictionary");
        o.e(sQLiteDatabase, "writableDatabase");
        o.e(obj, "writableDatabaseLock");
        synchronized (obj) {
            try {
                ContentValues contentValues = new ContentValues();
                sQLiteDatabase.beginTransactionNonExclusive();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    contentValues.put("delete_id", (Integer) pair.getFirst());
                    contentValues.put("word_id", (Integer) pair.getSecond());
                    sQLiteDatabase.insertWithOnConflict("deletes_dictionary", "", contentValues, 4);
                }
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
                q qVar = q.f14567a;
            } catch (SQLiteConstraintException e4) {
                throw e4;
            } catch (SQLiteException e5) {
                Log.f10572a.e("DictionaryDatabase", "", e5);
                sQLiteDatabase.endTransaction();
                return false;
            } catch (Throwable th) {
                sQLiteDatabase.endTransaction();
                throw th;
            }
        }
        return true;
    }
}
