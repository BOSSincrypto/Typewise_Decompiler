package androidx.sqlite.db.framework;

import Z.b;
import Z.g;
import Z.j;
import Z.k;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.text.TextUtils;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import u2.r;

public final class FrameworkSQLiteDatabase implements g {

    /* renamed from: c  reason: collision with root package name */
    public static final a f6909c = new a((i) null);

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f6910d = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: e  reason: collision with root package name */
    private static final String[] f6911e = new String[0];

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteDatabase f6912a;

    /* renamed from: b  reason: collision with root package name */
    private final List f6913b;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        private a() {
        }
    }

    public FrameworkSQLiteDatabase(SQLiteDatabase sQLiteDatabase) {
        o.e(sQLiteDatabase, "delegate");
        this.f6912a = sQLiteDatabase;
        this.f6913b = sQLiteDatabase.getAttachedDbs();
    }

    /* access modifiers changed from: private */
    public static final Cursor h(r rVar, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        o.e(rVar, "$tmp0");
        return (Cursor) rVar.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    /* access modifiers changed from: private */
    public static final Cursor m(j jVar, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        o.e(jVar, "$query");
        o.b(sQLiteQuery);
        jVar.a(new e(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    public Cursor J(j jVar) {
        o.e(jVar, "query");
        Cursor rawQueryWithFactory = this.f6912a.rawQueryWithFactory(new b(new FrameworkSQLiteDatabase$query$cursorFactory$1(jVar)), jVar.e(), f6911e, (String) null);
        o.d(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }

    public String K() {
        return this.f6912a.getPath();
    }

    public boolean M() {
        return this.f6912a.inTransaction();
    }

    public boolean S() {
        return b.b(this.f6912a);
    }

    public void V() {
        this.f6912a.setTransactionSuccessful();
    }

    public void X(String str, Object[] objArr) {
        o.e(str, "sql");
        o.e(objArr, "bindArgs");
        this.f6912a.execSQL(str, objArr);
    }

    public void Y() {
        this.f6912a.beginTransactionNonExclusive();
    }

    public int Z(String str, int i4, ContentValues contentValues, String str2, Object[] objArr) {
        int i5;
        String str3;
        o.e(str, "table");
        o.e(contentValues, "values");
        if (contentValues.size() != 0) {
            int size = contentValues.size();
            if (objArr == null) {
                i5 = size;
            } else {
                i5 = objArr.length + size;
            }
            Object[] objArr2 = new Object[i5];
            StringBuilder sb = new StringBuilder();
            sb.append("UPDATE ");
            sb.append(f6910d[i4]);
            sb.append(str);
            sb.append(" SET ");
            int i6 = 0;
            for (String next : contentValues.keySet()) {
                if (i6 > 0) {
                    str3 = ",";
                } else {
                    str3 = "";
                }
                sb.append(str3);
                sb.append(next);
                objArr2[i6] = contentValues.get(next);
                sb.append("=?");
                i6++;
            }
            if (objArr != null) {
                for (int i7 = size; i7 < i5; i7++) {
                    objArr2[i7] = objArr[i7 - size];
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                sb.append(" WHERE ");
                sb.append(str2);
            }
            String sb2 = sb.toString();
            o.d(sb2, "StringBuilder().apply(builderAction).toString()");
            k u3 = u(sb2);
            Z.a.f2127c.b(u3, objArr2);
            return u3.t();
        }
        throw new IllegalArgumentException("Empty values");
    }

    public void close() {
        this.f6912a.close();
    }

    public final boolean f(SQLiteDatabase sQLiteDatabase) {
        o.e(sQLiteDatabase, "sqLiteDatabase");
        return o.a(this.f6912a, sQLiteDatabase);
    }

    public void i() {
        this.f6912a.endTransaction();
    }

    public boolean isOpen() {
        return this.f6912a.isOpen();
    }

    public void j() {
        this.f6912a.beginTransaction();
    }

    public List l() {
        return this.f6913b;
    }

    public Cursor l0(String str) {
        o.e(str, "query");
        return J(new Z.a(str));
    }

    public void p(String str) {
        o.e(str, "sql");
        this.f6912a.execSQL(str);
    }

    public k u(String str) {
        o.e(str, "sql");
        SQLiteStatement compileStatement = this.f6912a.compileStatement(str);
        o.d(compileStatement, "delegate.compileStatement(sql)");
        return new f(compileStatement);
    }

    public Cursor x(j jVar, CancellationSignal cancellationSignal) {
        o.e(jVar, "query");
        SQLiteDatabase sQLiteDatabase = this.f6912a;
        String e4 = jVar.e();
        String[] strArr = f6911e;
        o.b(cancellationSignal);
        return b.c(sQLiteDatabase, e4, strArr, (String) null, cancellationSignal, new a(jVar));
    }
}
