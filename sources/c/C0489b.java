package c;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.PointF;
import android.os.AsyncTask;
import ch.icoaching.typewise.AILibrarySingletonProvider;
import ch.icoaching.typewise.text.CapsMode;
import ch.icoaching.typewise.text.TypewiseInputType;
import ch.icoaching.wrio.data.c;
import ch.icoaching.wrio.data.source.local.TempHelperKt;
import ch.icoaching.wrio.data.source.local.db.migrations.Migration25to26;
import ch.icoaching.wrio.data.source.local.db.migrations.Migration26to27;
import ch.icoaching.wrio.data.source.local.db.migrations.Migration29to32;
import ch.icoaching.wrio.data.source.local.db.migrations.Migration32to33;
import ch.icoaching.wrio.data.source.local.db.migrations.Migration35to36;
import ch.icoaching.wrio.data.source.local.db.migrations.d;
import ch.icoaching.wrio.data.source.local.db.migrations.f;
import ch.icoaching.wrio.data.source.local.db.migrations.g;
import ch.icoaching.wrio.data.source.local.db.migrations.h;
import ch.icoaching.wrio.data.source.local.db.migrations.i;
import ch.icoaching.wrio.data.source.local.db.migrations.j;
import ch.icoaching.wrio.data.source.local.db.migrations.k;
import ch.icoaching.wrio.data.source.local.db.migrations.l;
import ch.icoaching.wrio.data.source.local.db.migrations.m;
import ch.icoaching.wrio.data.source.local.db.migrations.n;
import ch.icoaching.wrio.data.source.local.db.migrations.q;
import ch.icoaching.wrio.keyboard.KeyboardLayoutType;
import ch.icoaching.wrio.keyboard.t;
import ch.icoaching.wrio.logging.Log;
import d.C0593a;
import d2.C0640a;
import h2.C0663b;
import h2.C0665d;
import h2.C0666e;
import h2.C0667f;
import h2.C0668g;
import h2.C0669h;
import h2.C0670i;
import h2.C0672k;
import h2.C0675n;
import h2.o;
import h2.p;
import h2.r;
import h2.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.D;
import r0.e;
import r3.b;

/* renamed from: c.b  reason: case insensitive filesystem */
public class C0489b extends SQLiteOpenHelper {

    /* renamed from: o  reason: collision with root package name */
    public static final Object f7490o = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final Context f7491a;

    /* renamed from: b  reason: collision with root package name */
    private final c f7492b;

    /* renamed from: c  reason: collision with root package name */
    private final CoroutineDispatcher f7493c;

    /* renamed from: d  reason: collision with root package name */
    private final D f7494d;

    /* renamed from: e  reason: collision with root package name */
    public final C0667f f7495e;

    /* renamed from: f  reason: collision with root package name */
    public final p f7496f;

    /* renamed from: g  reason: collision with root package name */
    public final s f7497g;

    /* renamed from: h  reason: collision with root package name */
    public final r f7498h;

    /* renamed from: i  reason: collision with root package name */
    public final C0663b f7499i;

    /* renamed from: j  reason: collision with root package name */
    public final C0665d f7500j;

    /* renamed from: k  reason: collision with root package name */
    public final SQLiteDatabase f7501k;

    /* renamed from: l  reason: collision with root package name */
    public final SQLiteDatabase f7502l;

    /* renamed from: m  reason: collision with root package name */
    public final Object f7503m = f7490o;

    /* renamed from: n  reason: collision with root package name */
    private final AILibrarySingletonProvider f7504n;

    /* renamed from: c.b$a */
    private class a extends AsyncTask {

        /* renamed from: a  reason: collision with root package name */
        private KeyboardLayoutType f7505a;

        a(KeyboardLayoutType keyboardLayoutType) {
            this.f7505a = keyboardLayoutType;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Void doInBackground(List... listArr) {
            SQLiteDatabase sQLiteDatabase;
            List<t> list = listArr[0];
            synchronized (C0489b.f7490o) {
                try {
                    C0489b.this.f7501k.beginTransactionNonExclusive();
                    ContentValues contentValues = new ContentValues();
                    for (t tVar : list) {
                        PointF e4 = tVar.e();
                        contentValues.put("keyCode", Integer.valueOf(tVar.c()));
                        contentValues.put("landscape", Boolean.valueOf(tVar.d()));
                        contentValues.put("dynamicCenterWeight", Integer.valueOf(tVar.f()));
                        contentValues.put("dynamicCenterX", Float.valueOf(e4.x));
                        contentValues.put("dynamicCenterY", Float.valueOf(e4.y));
                        contentValues.put("keyboardMode", this.f7505a.toString());
                        C0489b.this.f7501k.insertWithOnConflict("dynamicLayout", (String) null, contentValues, 5);
                    }
                    C0489b.this.f7501k.setTransactionSuccessful();
                    sQLiteDatabase = C0489b.this.f7501k;
                } catch (SQLException e5) {
                    try {
                        e5.printStackTrace();
                        sQLiteDatabase = C0489b.this.f7501k;
                    } catch (Throwable th) {
                        C0489b.this.f7501k.endTransaction();
                        throw th;
                    }
                }
                sQLiteDatabase.endTransaction();
            }
            return null;
        }
    }

    public C0489b(Context context, c cVar, D d4, CoroutineDispatcher coroutineDispatcher, AILibrarySingletonProvider aILibrarySingletonProvider) {
        super(context, "wrio-dynamic-layout.db", (SQLiteDatabase.CursorFactory) null, 51);
        this.f7491a = context;
        this.f7492b = cVar;
        this.f7493c = coroutineDispatcher;
        this.f7494d = d4;
        this.f7504n = aILibrarySingletonProvider;
        this.f7496f = new C0672k(this);
        this.f7495e = new C0670i(this);
        this.f7497g = new o(this);
        this.f7498h = new C0675n(this);
        this.f7499i = new C0668g(this);
        this.f7500j = new C0669h(this);
        this.f7502l = getReadableDatabase();
        this.f7501k = getWritableDatabase();
    }

    private Pair A() {
        return new Pair(", " + "bg_timesTyped", " LEFT OUTER JOIN " + "bigrams" + " ON " + "bg_second" + " = " + "main_dictionary" + "." + "word_id" + " AND " + "bg_first" + " =?");
    }

    private b G(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        return this.f7496f.r(sQLiteDatabase, str, str2, this.f7495e.i(str2));
    }

    private void Q(SQLiteDatabase sQLiteDatabase) {
        boolean a4 = ch.icoaching.wrio.data.source.local.a.a(sQLiteDatabase, "version", "dictionary_languages");
        boolean a5 = ch.icoaching.wrio.data.source.local.a.a(sQLiteDatabase, "version", "main_dictionary");
        if (!a4 || !a5) {
            try {
                sQLiteDatabase.beginTransactionNonExclusive();
                if (!a4) {
                    sQLiteDatabase.execSQL("ALTER TABLE dictionary_languages ADD COLUMN version integer default 0 not null");
                }
                if (!a5) {
                    sQLiteDatabase.execSQL("ALTER TABLE main_dictionary ADD COLUMN version integer default 0 not null");
                }
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
            } catch (Throwable th) {
                sQLiteDatabase.endTransaction();
                throw th;
            }
        }
    }

    public static String e(List list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        sb.append("(");
        for (int i4 = 0; i4 < size; i4++) {
            sb.append("'");
            sb.append((String) list.get(i4));
            sb.append("'");
            if (i4 < size - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        return sb.toString();
    }

    private void g0(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.beginTransactionNonExclusive();
            this.f7495e.f(sQLiteDatabase);
            this.f7495e.e(sQLiteDatabase);
            this.f7496f.f(sQLiteDatabase);
            this.f7496f.e(sQLiteDatabase);
            this.f7500j.e(sQLiteDatabase);
            sQLiteDatabase.execSQL("create table if not exists deletes_dictionary(delete_id integer, word_id integer, primary key (delete_id, word_id),foreign key (delete_id) references deletes(delete_id) on delete cascade on update cascade deferrable initially deferred, foreign key (word_id) references main_dictionary(word_id) on delete cascade on update cascade deferrable initially deferred )  WITHOUT ROWID");
            sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS idx_word ON main_dictionary(word)");
            sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS idx_delete_string ON deletes(delete_string)");
            s0(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00bc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void q0(android.database.sqlite.SQLiteDatabase r10) {
        /*
            r9 = this;
            java.lang.String r0 = "="
            java.lang.String r1 = " WHERE "
            r2 = 0
            r10.beginTransactionNonExclusive()     // Catch:{ all -> 0x00b6 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b6 }
            r3.<init>()     // Catch:{ all -> 0x00b6 }
            java.lang.String r4 = "UPDATE dictionary SET mixedcaseWord="
            r3.append(r4)     // Catch:{ all -> 0x00b6 }
            r3.append(r2)     // Catch:{ all -> 0x00b6 }
            r3.append(r1)     // Catch:{ all -> 0x00b6 }
            java.lang.String r4 = "mixedcaseWord"
            r3.append(r4)     // Catch:{ all -> 0x00b6 }
            java.lang.String r4 = "='null' AND "
            r3.append(r4)     // Catch:{ all -> 0x00b6 }
            java.lang.String r4 = "word"
            r3.append(r4)     // Catch:{ all -> 0x00b6 }
            java.lang.String r4 = " NOT LIKE 'null'"
            r3.append(r4)     // Catch:{ all -> 0x00b6 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00b6 }
            r10.execSQL(r3)     // Catch:{ all -> 0x00b6 }
            java.lang.String r3 = "SELECT dict_id, mixedcaseWord, typedMixedCase FROM dictionary"
            android.database.Cursor r3 = r10.rawQuery(r3, r2)     // Catch:{ all -> 0x00b6 }
            boolean r4 = r3.moveToFirst()     // Catch:{ all -> 0x00a3 }
            if (r4 == 0) goto L_0x00ac
        L_0x003f:
            r4 = 0
            int r4 = r3.getInt(r4)     // Catch:{ all -> 0x00a3 }
            r5 = 1
            java.lang.String r5 = r3.getString(r5)     // Catch:{ all -> 0x00a3 }
            r6 = 2
            int r6 = r3.getInt(r6)     // Catch:{ all -> 0x00a3 }
            boolean r7 = e3.c.l(r5)     // Catch:{ all -> 0x00a3 }
            if (r7 == 0) goto L_0x00a6
            java.lang.String r5 = ch.icoaching.wrio.Z.d(r5)     // Catch:{ all -> 0x00a3 }
            java.lang.String r7 = "-"
            java.lang.String r8 = ""
            java.lang.String r5 = e3.c.o(r5, r7, r8)     // Catch:{ all -> 0x00a3 }
            boolean r5 = e3.c.h(r5)     // Catch:{ all -> 0x00a3 }
            if (r5 == 0) goto L_0x00a6
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a3 }
            r5.<init>()     // Catch:{ all -> 0x00a3 }
            java.lang.String r7 = "UPDATE dictionary SET mixedcaseWord = "
            r5.append(r7)     // Catch:{ all -> 0x00a3 }
            r5.append(r2)     // Catch:{ all -> 0x00a3 }
            java.lang.String r7 = ", "
            r5.append(r7)     // Catch:{ all -> 0x00a3 }
            java.lang.String r7 = "typedMixedCase"
            r5.append(r7)     // Catch:{ all -> 0x00a3 }
            java.lang.String r7 = "=0,  "
            r5.append(r7)     // Catch:{ all -> 0x00a3 }
            java.lang.String r7 = "typedLowerCase"
            r5.append(r7)     // Catch:{ all -> 0x00a3 }
            r5.append(r0)     // Catch:{ all -> 0x00a3 }
            r5.append(r6)     // Catch:{ all -> 0x00a3 }
            r5.append(r1)     // Catch:{ all -> 0x00a3 }
            java.lang.String r6 = "dict_id"
            r5.append(r6)     // Catch:{ all -> 0x00a3 }
            r5.append(r0)     // Catch:{ all -> 0x00a3 }
            r5.append(r4)     // Catch:{ all -> 0x00a3 }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x00a3 }
            r10.execSQL(r4)     // Catch:{ all -> 0x00a3 }
            goto L_0x00a6
        L_0x00a3:
            r0 = move-exception
            r2 = r3
            goto L_0x00b7
        L_0x00a6:
            boolean r4 = r3.moveToNext()     // Catch:{ all -> 0x00a3 }
            if (r4 != 0) goto L_0x003f
        L_0x00ac:
            r10.setTransactionSuccessful()     // Catch:{ all -> 0x00a3 }
            r10.endTransaction()
            r3.close()
            return
        L_0x00b6:
            r0 = move-exception
        L_0x00b7:
            r10.endTransaction()
            if (r2 == 0) goto L_0x00bf
            r2.close()
        L_0x00bf:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.C0489b.q0(android.database.sqlite.SQLiteDatabase):void");
    }

    private void s0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("INSERT INTO main_dictionary SELECT dict_id, word, 1, 'user', 0, 0, lastTyped, timesTyped, timesCorrected, timesConsidered, timesUndone, typedLowerCase, typedTitleCase, typedMixedCase, mixedcaseWord, 1, 0 FROM dictionary");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.String[], android.database.Cursor] */
    private void t0(SQLiteDatabase sQLiteDatabase) {
        ? r02 = 0;
        try {
            sQLiteDatabase.beginTransactionNonExclusive();
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT id, value FROM special_fields WHERE input_type='" + TypewiseInputType.EMAIL + "'", r02);
            while (rawQuery.moveToNext()) {
                int i4 = rawQuery.getInt(0);
                if (!new C0640a().b(rawQuery.getString(1))) {
                    sQLiteDatabase.execSQL("DELETE FROM special_fields WHERE id=" + i4);
                }
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            rawQuery.close();
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            if (r02 != 0) {
                r02.close();
            }
            throw th;
        }
    }

    private void u0(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.rawQuery("SELECT dict_id,word FROM dictionary WHERE word LIKE '%''''%'", (String[]) null);
            sQLiteDatabase.beginTransactionNonExclusive();
            while (cursor.moveToNext()) {
                int i4 = cursor.getInt(0);
                String b4 = d2.b.b(cursor.getString(1));
                String[] strArr = {b4, b4};
                sQLiteDatabase.execSQL("UPDATE dictionary SET word = ? WHERE dict_id=" + i4 + " AND " + "word" + " != ?", strArr);
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            cursor.close();
        } catch (SQLiteConstraintException e4) {
            e4.printStackTrace();
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public e D(r0.c cVar, String str, String str2) {
        boolean z3;
        String str3 = str2;
        e eVar = new e(cVar.b(), -2, 0, 0, cVar.e());
        if (str2.isEmpty()) {
            return eVar;
        }
        String lowerCase = str.toLowerCase(Locale.getDefault());
        if (lowerCase.equals("$NA$".toLowerCase(Locale.ROOT)) || e3.c.j(lowerCase)) {
            lowerCase = "";
        }
        try {
            int C3 = this.f7496f.C(this.f7502l, lowerCase, str3);
            ArrayList arrayList = new ArrayList();
            Pair pair = new Pair("", "");
            int i4 = 0;
            if (C3 != -100) {
                pair = A();
                arrayList.add(Integer.toString(C3));
                z3 = true;
            } else {
                z3 = false;
            }
            arrayList.add(str3);
            arrayList.add(cVar.b());
            Cursor rawQuery = this.f7502l.rawQuery("SELECT " + "frequency" + ", " + "timesTyped" + ((String) pair.getFirst()) + " FROM " + "main_dictionary" + ((String) pair.getSecond()) + " WHERE " + "language_code" + " = ?" + " AND " + "word" + " = ?" + " AND " + "consider" + " = 1 ", (String[]) arrayList.toArray(new String[arrayList.size()]));
            if (rawQuery.moveToFirst()) {
                String d4 = eVar.d();
                int i5 = rawQuery.getInt(0);
                int i6 = rawQuery.getInt(1);
                if (z3) {
                    i4 = rawQuery.getInt(2);
                }
                eVar = new e(d4, i5, i6, i4, eVar.e());
            }
            rawQuery.close();
        } catch (SQLException e4) {
            e4.printStackTrace();
        }
        return eVar;
    }

    public void R(TypewiseInputType typewiseInputType, String str) {
        synchronized (f7490o) {
            try {
                this.f7501k.beginTransactionNonExclusive();
                this.f7501k.execSQL("DELETE FROM special_fields WHERE value = ? AND input_type = ?", new String[]{str, typewiseInputType.toString()});
                this.f7501k.setTransactionSuccessful();
                this.f7501k.endTransaction();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int a(String str) {
        if (str == null) {
            return -1;
        }
        return this.f7496f.g(this.f7495e.i(str));
    }

    public void b0(List list, KeyboardLayoutType keyboardLayoutType) {
        new a(keyboardLayoutType).execute(new List[]{list});
    }

    public void e0() {
        SQLiteDatabase sQLiteDatabase;
        synchronized (f7490o) {
            try {
                sQLiteDatabase = this.f7501k;
                if (!sQLiteDatabase.inTransaction()) {
                    sQLiteDatabase.setForeignKeyConstraintsEnabled(false);
                }
                sQLiteDatabase.beginTransactionNonExclusive();
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS dynamicLayout");
                sQLiteDatabase.execSQL("create table if not exists dynamicLayout(keyCode integer not null, landscape integer default 0 not null, dynamicCenterWeight integer default 10 not null, dynamicCenterX float default 0.0 not null, dynamicCenterY float default 0.0 not null, keyboardMode text not null, PRIMARY KEY (keyCode,landscape) )");
                this.f7498h.f(sQLiteDatabase);
                this.f7498h.e(sQLiteDatabase);
                this.f7499i.f(sQLiteDatabase);
                this.f7499i.e(sQLiteDatabase);
                this.f7495e.f(sQLiteDatabase);
                this.f7495e.e(sQLiteDatabase);
                sQLiteDatabase.execSQL("DROP INDEX IF EXISTS idx_word");
                this.f7496f.f(sQLiteDatabase);
                this.f7496f.e(sQLiteDatabase);
                sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS idx_word ON main_dictionary(word)");
                this.f7497g.f(sQLiteDatabase);
                this.f7497g.e(sQLiteDatabase);
                sQLiteDatabase.execSQL("DROP INDEX IF EXISTS idx_delete_string");
                this.f7500j.f(sQLiteDatabase);
                this.f7500j.e(sQLiteDatabase);
                sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS idx_delete_string ON deletes(delete_string)");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS deletes_dictionary");
                sQLiteDatabase.execSQL("create table if not exists deletes_dictionary(delete_id integer, word_id integer, primary key (delete_id, word_id),foreign key (delete_id) references deletes(delete_id) on delete cascade on update cascade deferrable initially deferred, foreign key (word_id) references main_dictionary(word_id) on delete cascade on update cascade deferrable initially deferred )  WITHOUT ROWID");
                this.f7496f.t(sQLiteDatabase);
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
                if (!sQLiteDatabase.inTransaction()) {
                    sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007c, code lost:
        if (r2 == null) goto L_0x0081;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List f(ch.icoaching.wrio.keyboard.KeyboardLayoutType r8) {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "SELECT * FROM "
            r1.append(r2)
            java.lang.String r2 = "dynamicLayout"
            r1.append(r2)
            java.lang.String r2 = " WHERE "
            r1.append(r2)
            java.lang.String r2 = "keyboardMode"
            r1.append(r2)
            java.lang.String r2 = " = ?"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r7.f7502l     // Catch:{ SQLException -> 0x0071 }
            java.lang.String r8 = r8.toString()     // Catch:{ SQLException -> 0x0071 }
            java.lang.String[] r8 = new java.lang.String[]{r8}     // Catch:{ SQLException -> 0x0071 }
            android.database.Cursor r2 = r3.rawQuery(r1, r8)     // Catch:{ SQLException -> 0x0071 }
            if (r2 == 0) goto L_0x0073
            int r8 = r2.getCount()     // Catch:{ SQLException -> 0x0071 }
            if (r8 != 0) goto L_0x003f
            goto L_0x0073
        L_0x003f:
            boolean r8 = r2.moveToNext()     // Catch:{ SQLException -> 0x0071 }
            if (r8 == 0) goto L_0x007e
            r8 = 0
            int r1 = r2.getInt(r8)     // Catch:{ SQLException -> 0x0071 }
            r3 = 1
            int r4 = r2.getInt(r3)     // Catch:{ SQLException -> 0x0071 }
            if (r4 == 0) goto L_0x0052
            r8 = r3
        L_0x0052:
            r3 = 2
            int r3 = r2.getInt(r3)     // Catch:{ SQLException -> 0x0071 }
            r4 = 3
            float r4 = r2.getFloat(r4)     // Catch:{ SQLException -> 0x0071 }
            r5 = 4
            float r5 = r2.getFloat(r5)     // Catch:{ SQLException -> 0x0071 }
            android.graphics.PointF r6 = new android.graphics.PointF     // Catch:{ SQLException -> 0x0071 }
            r6.<init>(r4, r5)     // Catch:{ SQLException -> 0x0071 }
            ch.icoaching.wrio.keyboard.t r4 = new ch.icoaching.wrio.keyboard.t     // Catch:{ SQLException -> 0x0071 }
            r4.<init>(r1, r8, r3, r6)     // Catch:{ SQLException -> 0x0071 }
            r0.add(r4)     // Catch:{ SQLException -> 0x0071 }
            goto L_0x003f
        L_0x006f:
            r8 = move-exception
            goto L_0x0082
        L_0x0071:
            r8 = move-exception
            goto L_0x0079
        L_0x0073:
            if (r2 == 0) goto L_0x0078
            r2.close()
        L_0x0078:
            return r0
        L_0x0079:
            r8.printStackTrace()     // Catch:{ all -> 0x006f }
            if (r2 == 0) goto L_0x0081
        L_0x007e:
            r2.close()
        L_0x0081:
            return r0
        L_0x0082:
            if (r2 == 0) goto L_0x0087
            r2.close()
        L_0x0087:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: c.C0489b.f(ch.icoaching.wrio.keyboard.KeyboardLayoutType):java.util.List");
    }

    public List h(String str, TypewiseInputType typewiseInputType) {
        if (typewiseInputType == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Cursor query = this.f7502l.query("special_fields", new String[]{"value"}, "value" + " LIKE ? AND " + "input_type" + " = ? ORDER BY " + "times_typed" + " DESC", new String[]{str + "%", typewiseInputType.toString()}, (String) null, (String) null, (String) null);
        if (query.moveToFirst()) {
            do {
                arrayList.add(query.getString(0));
            } while (query.moveToNext());
        }
        query.close();
        return arrayList;
    }

    public void j0(TypewiseInputType typewiseInputType, String str) {
        int i4;
        synchronized (f7490o) {
            Cursor cursor = null;
            try {
                this.f7501k.beginTransactionNonExclusive();
                Cursor query = this.f7501k.query("special_fields", new String[]{"id"}, "value = ? AND input_type = ? ", new String[]{str, typewiseInputType.toString()}, (String) null, (String) null, (String) null);
                if (query.moveToFirst()) {
                    i4 = query.getInt(0);
                } else {
                    i4 = -1;
                }
                if (i4 > -1) {
                    this.f7501k.execSQL("UPDATE special_fields SET times_typed = times_typed + ? WHERE id = ?", new String[]{String.valueOf(1), String.valueOf(i4)});
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("times_typed", 1);
                    contentValues.put("value", str);
                    contentValues.put("input_type", typewiseInputType.toString());
                    this.f7501k.insert("special_fields", "", contentValues);
                }
                this.f7501k.setTransactionSuccessful();
                this.f7501k.endTransaction();
                query.close();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public List m(String str, String str2, int i4, int i5) {
        ArrayList arrayList = new ArrayList();
        try {
            try {
                String str3 = str;
                String str4 = str2;
                Cursor rawQuery = this.f7502l.rawQuery("SELECT d2." + "word" + ", " + " d2." + "wordMixedCase" + ", " + " d2." + "typedLowerCase" + ", " + " d2." + "typedTitleCase" + ", " + " d2." + "typedMixedCase" + " FROM " + "bigrams" + " JOIN " + "main_dictionary" + " AS d1" + " ON " + "bigrams" + "." + "bg_first" + " = d1." + "word_id" + " JOIN " + "main_dictionary" + " AS d2" + " ON " + "bigrams" + "." + "bg_second" + " = d2." + "word_id" + " WHERE d1." + "word" + " = ? AND d2." + "consider" + " = 1" + " AND d1." + "language_code" + " = ?" + " ORDER BY " + "bg_timesTyped" + " DESC, " + "bg_lastTyped" + " DESC " + " LIMIT ? " + " OFFSET ? ", new String[]{str.toLowerCase(Locale.getDefault()), str2, Integer.toString(i5), Integer.toString(i4)});
                if (rawQuery.moveToFirst()) {
                    do {
                        String string = rawQuery.getString(0);
                        String string2 = rawQuery.getString(1);
                        int i6 = rawQuery.getInt(2);
                        int i7 = rawQuery.getInt(3);
                        int i8 = rawQuery.getInt(4);
                        if (i6 >= i7 && i6 >= i8) {
                            arrayList.add(new Pair(string, CapsMode.LOWER));
                        } else if (i7 >= i8) {
                            arrayList.add(new Pair(string, CapsMode.TITLE));
                        } else if (string2 != null) {
                            arrayList.add(new Pair(string2, CapsMode.MIXED));
                        } else {
                            arrayList.add(new Pair(string, CapsMode.LOWER));
                        }
                    } while (rawQuery.moveToNext());
                }
                rawQuery.close();
            } catch (Exception e4) {
                e = e4;
                e.printStackTrace();
                return arrayList;
            }
        } catch (Exception e5) {
            e = e5;
            e.printStackTrace();
            return arrayList;
        }
        return arrayList;
    }

    public List o(String str, String str2, String str3, String str4, String str5) {
        ArrayList arrayList;
        Pair pair;
        boolean z3;
        String str6;
        String str7;
        int i4;
        String str8 = str3;
        ArrayList arrayList2 = new ArrayList();
        if (str3.isEmpty()) {
            return arrayList2;
        }
        String lowerCase = str2.toLowerCase(Locale.getDefault());
        ArrayList arrayList3 = arrayList2;
        if (lowerCase.equals("$NA$".toLowerCase(Locale.ROOT)) || e3.c.j(lowerCase)) {
            lowerCase = "";
        }
        try {
            String str9 = " AND ";
            int C3 = this.f7496f.C(this.f7502l, lowerCase, str8);
            ArrayList arrayList4 = new ArrayList();
            Pair pair2 = new Pair("", "");
            String str10 = "";
            if (C3 != -100) {
                pair = A();
                arrayList4.add(Integer.toString(C3));
                z3 = true;
            } else {
                pair = pair2;
                z3 = false;
            }
            StringBuilder sb = new StringBuilder();
            boolean z4 = z3;
            sb.append("SELECT ");
            sb.append("word");
            sb.append(", ");
            sb.append("frequency");
            sb.append(", ");
            sb.append("timesTyped");
            sb.append((String) pair.getFirst());
            sb.append(" FROM ");
            sb.append("deletes_dictionary");
            sb.append(" INNER JOIN ");
            sb.append("main_dictionary");
            sb.append(" ON ");
            sb.append("deletes_dictionary");
            sb.append(".");
            sb.append("word_id");
            sb.append(" = ");
            sb.append("main_dictionary");
            sb.append(".");
            sb.append("word_id");
            sb.append(" INNER JOIN ");
            sb.append("deletes");
            sb.append(" ON ");
            sb.append("deletes_dictionary");
            sb.append(".");
            sb.append("delete_id");
            sb.append(" = ");
            sb.append("deletes");
            sb.append(".");
            sb.append("delete_id");
            sb.append((String) pair.getSecond());
            sb.append(" WHERE ");
            sb.append("consider");
            sb.append(" = 1 ");
            String str11 = str9;
            sb.append(str11);
            sb.append("delete_string");
            sb.append(" = ?");
            sb.append(str11);
            sb.append("language_code");
            sb.append(" = ? ");
            arrayList4.add(str);
            arrayList4.add(str8);
            new ArrayList();
            Cursor rawQuery = this.f7502l.rawQuery(sb.toString(), (String[]) arrayList4.toArray(new String[arrayList4.size()]));
            while (rawQuery.moveToNext()) {
                String string = rawQuery.getString(0);
                StringBuilder sb2 = new StringBuilder();
                if (str4 == null) {
                    str6 = str10;
                } else {
                    str6 = str4;
                }
                sb2.append(str6);
                sb2.append(string);
                if (str5 == null) {
                    str7 = str10;
                } else {
                    str7 = str5;
                }
                sb2.append(str7);
                String sb3 = sb2.toString();
                int i5 = rawQuery.getInt(1);
                int i6 = rawQuery.getInt(2);
                if (z4) {
                    i4 = rawQuery.getInt(3);
                } else {
                    i4 = 0;
                }
                arrayList = arrayList3;
                try {
                    arrayList.add(new e(string, i5, i6, i4, sb3));
                    arrayList3 = arrayList;
                } catch (SQLException e4) {
                    e = e4;
                    e.printStackTrace();
                    return arrayList;
                }
            }
            ArrayList arrayList5 = arrayList3;
            rawQuery.close();
            return arrayList5;
        } catch (SQLException e5) {
            e = e5;
            arrayList = arrayList3;
            e.printStackTrace();
            return arrayList;
        }
    }

    public boolean o0(List list) {
        return C0666e.b(list, this.f7501k, this.f7503m);
    }

    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        super.onConfigure(sQLiteDatabase);
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        sQLiteDatabase.enableWriteAheadLogging();
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            if (!sQLiteDatabase.inTransaction()) {
                sQLiteDatabase.setForeignKeyConstraintsEnabled(false);
            }
            sQLiteDatabase.beginTransactionNonExclusive();
            sQLiteDatabase.execSQL("create table if not exists dynamicLayout(keyCode integer not null, landscape integer default 0 not null, dynamicCenterWeight integer default 10 not null, dynamicCenterX float default 0.0 not null, dynamicCenterY float default 0.0 not null, keyboardMode text not null, PRIMARY KEY (keyCode,landscape) )");
            this.f7498h.e(sQLiteDatabase);
            this.f7499i.e(sQLiteDatabase);
            this.f7495e.e(sQLiteDatabase);
            this.f7496f.e(sQLiteDatabase);
            this.f7497g.e(sQLiteDatabase);
            this.f7500j.e(sQLiteDatabase);
            sQLiteDatabase.execSQL("create table if not exists deletes_dictionary(delete_id integer, word_id integer, primary key (delete_id, word_id),foreign key (delete_id) references deletes(delete_id) on delete cascade on update cascade deferrable initially deferred, foreign key (word_id) references main_dictionary(word_id) on delete cascade on update cascade deferrable initially deferred )  WITHOUT ROWID");
            sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS idx_word ON main_dictionary(word)");
            sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS idx_delete_string ON deletes(delete_string)");
            sQLiteDatabase.execSQL("create table if not exists special_fields(id integer primary key, value text not null, input_type text not null, times_typed integer default 0 not null, times_shown integer default 0 not null, times_tapped integer default 0 not null )");
            this.f7496f.t(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            if (sQLiteDatabase.inTransaction()) {
                return;
            }
        } catch (Exception e4) {
            Log.f10572a.c("DatabaseHandler", "onCreate() ::", e4);
            sQLiteDatabase.endTransaction();
            if (sQLiteDatabase.inTransaction()) {
                return;
            }
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            if (!sQLiteDatabase.inTransaction()) {
                sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
            }
            throw th;
        }
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
        if (i4 < 2) {
            e0();
            return;
        }
        if (i4 < 3) {
            try {
                sQLiteDatabase.beginTransactionNonExclusive();
                sQLiteDatabase.execSQL("ALTER TABLE dynamicLayout ADD COLUMN landscape integer default 0 not null");
                sQLiteDatabase.setTransactionSuccessful();
            } finally {
                sQLiteDatabase.endTransaction();
            }
        }
        if (i4 < 4) {
            try {
                sQLiteDatabase.beginTransactionNonExclusive();
                sQLiteDatabase.execSQL("create table if not exists recentEmoji(emojiString text not null, emojiWeight integer not null, PRIMARY KEY (emojiString))");
                sQLiteDatabase.setTransactionSuccessful();
            } finally {
                sQLiteDatabase.endTransaction();
            }
        }
        if (i4 < 5) {
            try {
                sQLiteDatabase.beginTransactionNonExclusive();
                sQLiteDatabase.execSQL("create table if not exists dictionary (word text not null, length integer default 0 not null, timesTyped integer default 0 not null, lastTyped integer(8) default (cast(strftime('%s', 'now') as integer(8))) not null, PRIMARY KEY (word))");
                sQLiteDatabase.setTransactionSuccessful();
            } finally {
                sQLiteDatabase.endTransaction();
            }
        }
        if (i4 == 5) {
            try {
                sQLiteDatabase.beginTransactionNonExclusive();
                sQLiteDatabase.execSQL("alter table dictionary ADD COLUMN timesCorrected integer default 0 not null");
                sQLiteDatabase.execSQL("alter table dictionary ADD COLUMN timesConsidered integer default 0 not null");
                sQLiteDatabase.execSQL("alter table dictionary ADD COLUMN timesUndone integer default 0 not null");
                sQLiteDatabase.setTransactionSuccessful();
            } finally {
                sQLiteDatabase.endTransaction();
            }
        }
        if (i4 <= 6) {
            try {
                sQLiteDatabase.beginTransactionNonExclusive();
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS dictionary");
                sQLiteDatabase.execSQL("create table if not exists dictionary (word text not null, length integer default 0 not null, timesTyped integer default 0 not null, timesCorrected integer default 0 not null, timesConsidered integer default 0 not null, timesUndone integer default 0 not null, lastTyped integer(8) default (cast(strftime('%s', 'now') as integer(8))) not null, consider integer(8) default 0 not null, PRIMARY KEY (word))");
                sQLiteDatabase.setTransactionSuccessful();
            } finally {
                sQLiteDatabase.endTransaction();
            }
        }
        if (i4 == 7) {
            try {
                sQLiteDatabase.beginTransactionNonExclusive();
                sQLiteDatabase.execSQL("ALTER TABLE dictionary ADD COLUMN source TEXT DEFAULT 'user' NOT NULL");
                sQLiteDatabase.setTransactionSuccessful();
            } finally {
                sQLiteDatabase.endTransaction();
            }
        }
        if (i4 < 9) {
            try {
                sQLiteDatabase.beginTransactionNonExclusive();
                sQLiteDatabase.execSQL("DELETE FROM dictionary WHERE source <> 'user'");
                sQLiteDatabase.setTransactionSuccessful();
            } finally {
                sQLiteDatabase.endTransaction();
            }
        }
        if (i4 < 10) {
            try {
                sQLiteDatabase.beginTransactionNonExclusive();
                sQLiteDatabase.execSQL("ALTER TABLE recentEmoji ADD COLUMN lastFitzpatrick TEXT DEFAULT '' NOT NULL");
                sQLiteDatabase.execSQL("ALTER TABLE recentEmoji ADD COLUMN lastTyped INTEGER(8) DEFAULT 0 NOT NULL");
                sQLiteDatabase.execSQL("UPDATE recentEmoji SET lastTyped = " + (System.currentTimeMillis() / 1000));
                sQLiteDatabase.execSQL("UPDATE recentEmoji SET emojiWeight = 0 WHERE emojiWeight < 0");
                sQLiteDatabase.setTransactionSuccessful();
            } finally {
                sQLiteDatabase.endTransaction();
            }
        }
        if (i4 < 11) {
            try {
                sQLiteDatabase.beginTransactionNonExclusive();
                sQLiteDatabase.execSQL("UPDATE dictionary SET length = LENGTH(length)");
                sQLiteDatabase.setTransactionSuccessful();
            } finally {
                sQLiteDatabase.endTransaction();
            }
        }
        if (i4 < 13) {
            try {
                sQLiteDatabase.beginTransactionNonExclusive();
                sQLiteDatabase.execSQL("create temporary table if not exists temp_dictionary (dict_id integer primary key, word text unique not null, length integer default 0 not null, timesTyped integer default 0 not null, timesCorrected integer default 0 not null, timesConsidered integer default 0 not null, timesUndone integer default 0 not null, lastTyped integer(8) default (cast(strftime('%s', 'now') as integer(8))) not null, source text default 'user' not null, consider integer(8) default 0 not null)");
                sQLiteDatabase.execSQL("INSERT INTO temp_dictionary SELECT rowid, word, length, timesTyped, timesCorrected, timesConsidered, timesUndone, lastTyped, source, consider FROM dictionary");
            } catch (SQLException e4) {
                e4.printStackTrace();
            } catch (Throwable th) {
                sQLiteDatabase.endTransaction();
                throw th;
            }
            sQLiteDatabase.execSQL("DROP TABLE dictionary");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS dictionary (dict_id integer primary key, word text unique not null, length integer default 0 not null, timesTyped integer default 0 not null, timesCorrected integer default 0 not null, timesConsidered integer default 0 not null, timesUndone integer default 0 not null, lastTyped integer(8) default (cast(strftime('%s', 'now') as integer(8))) not null, source text default 'user' not null, consider integer(8) default 0 not null)");
            sQLiteDatabase.execSQL("INSERT INTO dictionary SELECT * FROM temp_dictionary");
            sQLiteDatabase.execSQL("DROP TABLE temp_dictionary");
            sQLiteDatabase.execSQL("create table if not exists bigrams(bg_first integer(8) not null, bg_second integer(8) not null, bg_timesTyped integer default 0 not null, bg_timesSuggested integer default 0 not null, bg_timesTapped integer default 0 not null, bg_lastTyped integer(8) default (cast(strftime('%s', 'now') as integer(8))) not null, foreign key (bg_first) references dictionary(dict_id) on delete cascade on update cascade, foreign key (bg_second) references dictionary(dict_id) on delete cascade on update cascade, primary key (bg_first, bg_second))");
            this.f7496f.t(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
        }
        if (i4 < 14) {
            try {
                sQLiteDatabase.beginTransactionNonExclusive();
                sQLiteDatabase.execSQL("ALTER TABLE dictionary ADD COLUMN typedLowerCase INTEGER DEFAULT 0 NOT NULL");
                sQLiteDatabase.execSQL("ALTER TABLE dictionary ADD COLUMN typedTitleCase INTEGER DEFAULT 0 NOT NULL");
                sQLiteDatabase.execSQL("ALTER TABLE dictionary ADD COLUMN typedMixedCase INTEGER DEFAULT 0 NOT NULL");
                sQLiteDatabase.execSQL("ALTER TABLE dictionary ADD COLUMN mixedcaseWord TEXT DEFAULT NULL");
                sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS dictionary_word_index ON dictionary(word COLLATE NOCASE)");
                sQLiteDatabase.setTransactionSuccessful();
            } finally {
                sQLiteDatabase.endTransaction();
            }
        }
        if (i4 < 15) {
            try {
                sQLiteDatabase.beginTransactionNonExclusive();
                sQLiteDatabase.execSQL("ALTER TABLE dynamicLayout ADD COLUMN keyboardMode TEXT DEFAULT 'HONEY_COMB' NOT NULL");
                sQLiteDatabase.setTransactionSuccessful();
            } finally {
                sQLiteDatabase.endTransaction();
            }
        }
        if (i4 < 16) {
            try {
                sQLiteDatabase.beginTransactionNonExclusive();
                sQLiteDatabase.execSQL("create table if not exists special_fields(id integer primary key, value text not null, input_type text not null, times_typed integer default 0 not null, times_shown integer default 0 not null, times_tapped integer default 0 not null )");
                sQLiteDatabase.setTransactionSuccessful();
            } finally {
                sQLiteDatabase.endTransaction();
            }
        }
        if (i4 < 17) {
            try {
                sQLiteDatabase.beginTransactionNonExclusive();
                sQLiteDatabase.execSQL("DELETE FROM special_fields WHERE input_type='PHONE'");
                sQLiteDatabase.setTransactionSuccessful();
            } finally {
                sQLiteDatabase.endTransaction();
            }
        }
        if (i4 < 18) {
            try {
                sQLiteDatabase.beginTransactionNonExclusive();
                new C0593a(sQLiteDatabase).b();
                sQLiteDatabase.setTransactionSuccessful();
            } finally {
                sQLiteDatabase.endTransaction();
            }
        }
        if (i4 < 19) {
            q0(sQLiteDatabase);
        }
        if (i4 < 20) {
            t0(sQLiteDatabase);
            u0(sQLiteDatabase);
        }
        if (i4 < 21) {
            g0(sQLiteDatabase);
        }
        if (i4 < 25) {
            Q(sQLiteDatabase);
        }
        ArrayList arrayList = new ArrayList();
        if (i4 < 26) {
            arrayList.add(new Migration25to26(sQLiteDatabase, f7490o, this.f7504n));
        }
        if (i4 < 27) {
            arrayList.add(new Migration26to27(sQLiteDatabase, f7490o, this.f7504n));
        }
        if (i4 < 28) {
            arrayList.add(new ch.icoaching.wrio.data.source.local.db.migrations.a(this.f7491a.getApplicationContext(), this.f7492b, sQLiteDatabase, f7490o));
        }
        if (i4 < 32) {
            arrayList.add(new Migration29to32(sQLiteDatabase, f7490o, this.f7504n));
        }
        if (i4 < 33) {
            if (TempHelperKt.b(sQLiteDatabase, "dictionary")) {
                arrayList.add(new Migration32to33(sQLiteDatabase, f7490o, this.f7504n));
            } else {
                Log.f10572a.c("DatabaseHandler", "Not scheduling migration from 32 to 33 because dictionary table doesn't exist.", (Throwable) null);
            }
        }
        if (i4 < 34) {
            arrayList.add(new ch.icoaching.wrio.data.source.local.db.migrations.c(sQLiteDatabase, f7490o));
        }
        if (i4 < 35) {
            arrayList.add(new d(sQLiteDatabase, f7490o));
        }
        if (i4 < 36) {
            arrayList.add(new Migration35to36(this.f7491a.getApplicationContext(), this.f7492b, sQLiteDatabase, f7490o, this.f7504n));
        }
        if (i4 < 37) {
            arrayList.add(new ch.icoaching.wrio.data.source.local.db.migrations.e(sQLiteDatabase, f7490o));
        }
        if (i4 < 38) {
            arrayList.add(new f(sQLiteDatabase, f7490o));
        }
        if (i4 < 39) {
            arrayList.add(new g(sQLiteDatabase, f7490o));
        }
        if (i4 < 40) {
            arrayList.add(new h(sQLiteDatabase, f7490o));
        }
        if (i4 < 41) {
            arrayList.add(new i(this.f7491a.getApplicationContext()));
        }
        if (i4 < 42) {
            arrayList.add(new j(sQLiteDatabase, f7490o));
        }
        if (i4 < 43) {
            arrayList.add(new k(sQLiteDatabase, f7490o));
        }
        if (i4 < 44) {
            arrayList.add(new l(sQLiteDatabase, f7490o));
        }
        if (i4 < 45) {
            arrayList.add(new m(this.f7491a.getApplicationContext()));
        }
        if (i4 < 46) {
            arrayList.add(new i(this.f7491a.getApplicationContext()));
        }
        if (i4 < 47) {
            arrayList.add(new n(sQLiteDatabase, this.f7503m));
        }
        if (i4 < 48) {
            arrayList.add(new i(this.f7491a.getApplicationContext()));
        }
        if (i4 < 49) {
            arrayList.add(new ch.icoaching.wrio.data.source.local.db.migrations.o(sQLiteDatabase, this.f7503m));
        }
        if (i4 < 50) {
            arrayList.add(new ch.icoaching.wrio.data.source.local.db.migrations.p(this.f7496f));
        }
        if (i4 < 51) {
            arrayList.add(new q(sQLiteDatabase, this.f7503m));
        }
        TempHelperKt.a(arrayList, this.f7494d, this.f7493c);
    }

    public void p0() {
        SQLiteDatabase sQLiteDatabase;
        synchronized (f7490o) {
            try {
                this.f7501k.beginTransactionNonExclusive();
                this.f7501k.execSQL("DELETE FROM dynamicLayout");
                this.f7501k.setTransactionSuccessful();
                sQLiteDatabase = this.f7501k;
            } catch (Exception e4) {
                try {
                    Log.f10572a.c("DatabaseHandler", "", e4);
                    sQLiteDatabase = this.f7501k;
                } catch (Throwable th) {
                    this.f7501k.endTransaction();
                    throw th;
                }
            }
            sQLiteDatabase.endTransaction();
        }
    }

    public void r0() {
        synchronized (f7490o) {
            try {
                this.f7501k.beginTransactionNonExclusive();
                this.f7496f.x(this.f7501k);
                this.f7496f.t(this.f7501k);
                this.f7501k.execSQL("DELETE FROM special_fields");
                this.f7501k.setTransactionSuccessful();
                this.f7501k.endTransaction();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public List v(String str, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            b G3 = G(this.f7502l, str, str2);
            if (G3 != null) {
                arrayList.add(G3);
            } else {
                arrayList.add(new b(str2, 0, 0));
            }
        }
        return arrayList;
    }

    public Map y(Set set) {
        return C0666e.a(set, this.f7501k, this.f7503m);
    }
}
