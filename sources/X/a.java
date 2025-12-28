package X;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Build;
import kotlin.collections.C0713h;
import kotlin.jvm.internal.o;
import s2.C0896b;
import u2.l;

public abstract class a {
    public static final Cursor a(Cursor cursor) {
        o.e(cursor, "c");
        try {
            MatrixCursor matrixCursor = new MatrixCursor(cursor.getColumnNames(), cursor.getCount());
            while (cursor.moveToNext()) {
                Object[] objArr = new Object[cursor.getColumnCount()];
                int columnCount = cursor.getColumnCount();
                for (int i4 = 0; i4 < columnCount; i4++) {
                    int type = cursor.getType(i4);
                    if (type == 0) {
                        objArr[i4] = null;
                    } else if (type == 1) {
                        objArr[i4] = Long.valueOf(cursor.getLong(i4));
                    } else if (type == 2) {
                        objArr[i4] = Double.valueOf(cursor.getDouble(i4));
                    } else if (type == 3) {
                        objArr[i4] = cursor.getString(i4);
                    } else if (type == 4) {
                        objArr[i4] = cursor.getBlob(i4);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                matrixCursor.addRow(objArr);
            }
            C0896b.a(cursor, (Throwable) null);
            return matrixCursor;
        } catch (Throwable th) {
            C0896b.a(cursor, th);
            throw th;
        }
    }

    private static final int b(Cursor cursor, String str) {
        if (Build.VERSION.SDK_INT > 25 || str.length() == 0) {
            return -1;
        }
        String[] columnNames = cursor.getColumnNames();
        o.d(columnNames, "columnNames");
        return c(columnNames, str);
    }

    public static final int c(String[] strArr, String str) {
        o.e(strArr, "columnNames");
        o.e(str, "name");
        String str2 = '.' + str;
        String str3 = '.' + str + '`';
        int length = strArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            String str4 = strArr[i4];
            int i6 = i5 + 1;
            if (str4.length() >= str.length() + 2) {
                if (kotlin.text.o.u(str4, str2, false, 2, (Object) null)) {
                    return i5;
                }
                if (str4.charAt(0) == '`' && kotlin.text.o.u(str4, str3, false, 2, (Object) null)) {
                    return i5;
                }
            }
            i4++;
            i5 = i6;
        }
        return -1;
    }

    public static final int d(Cursor cursor, String str) {
        o.e(cursor, "c");
        o.e(str, "name");
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex('`' + str + '`');
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        return b(cursor, str);
    }

    public static final int e(Cursor cursor, String str) {
        String str2;
        o.e(cursor, "c");
        o.e(str, "name");
        int d4 = d(cursor, str);
        if (d4 >= 0) {
            return d4;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            o.d(columnNames, "c.columnNames");
            str2 = C0713h.T(columnNames, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 63, (Object) null);
        } catch (Exception unused) {
            str2 = "unknown";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + str2);
    }
}
