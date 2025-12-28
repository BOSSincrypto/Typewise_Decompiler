package ch.icoaching.wrio;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.internal.o;

public abstract class F {
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.String[], android.database.Cursor] */
    public static final boolean a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        boolean z3;
        o.e(sQLiteDatabase, "<this>");
        o.e(str, "columnName");
        o.e(str2, "tableName");
        ? r02 = 0;
        try {
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str2 + " LIMIT 0", r02);
            if (rawQuery.getColumnIndex(str) != -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            rawQuery.close();
            return z3;
        } catch (Throwable th) {
            if (r02 != 0) {
                r02.close();
            }
            throw th;
        }
    }
}
