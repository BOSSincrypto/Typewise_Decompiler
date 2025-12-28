package ch.icoaching.wrio.data.source.local.db.migrations;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabase;
import ch.icoaching.typewise.AILibrarySingletonProvider;
import ch.icoaching.wrio.logging.Log;
import h2.C0672k;
import h2.q;
import kotlin.Pair;
import kotlin.coroutines.c;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public class Migration25to26 implements q {

    /* renamed from: d  reason: collision with root package name */
    public static final a f9526d = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteDatabase f9527a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f9528b;

    /* renamed from: c  reason: collision with root package name */
    private final AILibrarySingletonProvider f9529c;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        private a() {
        }
    }

    public Migration25to26(SQLiteDatabase sQLiteDatabase, Object obj, AILibrarySingletonProvider aILibrarySingletonProvider) {
        o.e(sQLiteDatabase, "writableDatabase");
        o.e(obj, "writableDatabaseLock");
        o.e(aILibrarySingletonProvider, "aiLibrarySingletonProvider");
        this.f9527a = sQLiteDatabase;
        this.f9528b = obj;
        this.f9529c = aILibrarySingletonProvider;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object a(ch.icoaching.wrio.data.source.local.db.migrations.Migration25to26 r11, kotlin.coroutines.c r12) {
        /*
            boolean r0 = r12 instanceof ch.icoaching.wrio.data.source.local.db.migrations.Migration25to26$migrate$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            ch.icoaching.wrio.data.source.local.db.migrations.Migration25to26$migrate$1 r0 = (ch.icoaching.wrio.data.source.local.db.migrations.Migration25to26$migrate$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            ch.icoaching.wrio.data.source.local.db.migrations.Migration25to26$migrate$1 r0 = new ch.icoaching.wrio.data.source.local.db.migrations.Migration25to26$migrate$1
            r0.<init>(r11, r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            java.lang.Object r11 = r0.L$1
            ch.icoaching.wrio.data.source.local.db.migrations.Migration25to26 r11 = (ch.icoaching.wrio.data.source.local.db.migrations.Migration25to26) r11
            java.lang.Object r0 = r0.L$0
            ch.icoaching.wrio.data.source.local.db.migrations.Migration25to26 r0 = (ch.icoaching.wrio.data.source.local.db.migrations.Migration25to26) r0
            kotlin.f.b(r12)
            r10 = r12
            r12 = r11
            r11 = r0
            r0 = r10
            goto L_0x0060
        L_0x0035:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x003d:
            kotlin.f.b(r12)
            ch.icoaching.wrio.logging.Log r4 = ch.icoaching.wrio.logging.Log.f10572a
            r8 = 4
            r9 = 0
            java.lang.String r5 = "Migration25to26"
            java.lang.String r6 = "migrate() :: Start"
            r7 = 0
            ch.icoaching.wrio.logging.Log.d(r4, r5, r6, r7, r8, r9)
            r11.c()
            ch.icoaching.typewise.AILibrarySingletonProvider r12 = r11.f9529c
            r0.L$0 = r11
            r0.L$1 = r11
            r0.label = r3
            java.lang.Object r12 = r12.b(r0)
            if (r12 != r1) goto L_0x005e
            return r1
        L_0x005e:
            r0 = r12
            r12 = r11
        L_0x0060:
            ch.icoaching.typewise.AILibrary r0 = (ch.icoaching.typewise.AILibrary) r0
            ch.icoaching.typewise.file_handling.ConfigHolder r0 = r0.b()
            r12.f(r0)
            r11.h()
            ch.icoaching.wrio.logging.Log r1 = ch.icoaching.wrio.logging.Log.f10572a
            r5 = 4
            r6 = 0
            java.lang.String r2 = "Migration25to26"
            java.lang.String r3 = "migrate() :: Done"
            r4 = 0
            ch.icoaching.wrio.logging.Log.d(r1, r2, r3, r4, r5, r6)
            l2.q r11 = l2.q.f14567a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.data.source.local.db.migrations.Migration25to26.a(ch.icoaching.wrio.data.source.local.db.migrations.Migration25to26, kotlin.coroutines.c):java.lang.Object");
    }

    private final Pair b(Cursor cursor, int i4) {
        int i5;
        Integer num;
        Cursor cursor2 = cursor;
        int i6 = cursor2.getInt(0);
        String string = cursor2.getString(1);
        int i7 = cursor2.getInt(2);
        int i8 = cursor2.getInt(3);
        int i9 = cursor2.getInt(4);
        int i10 = cursor2.getInt(5);
        int i11 = cursor2.getInt(6);
        int i12 = cursor2.getInt(7);
        int i13 = cursor2.getInt(8);
        int i14 = cursor2.getInt(9);
        String string2 = cursor2.getString(10);
        int i15 = cursor2.getInt(11);
        C0672k.a aVar = C0672k.f13645b;
        o.b(string);
        Integer b4 = aVar.b(string, this.f9527a);
        if (b4 == null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("word", string);
            i5 = i6;
            contentValues.put("language_id", Integer.valueOf(i4));
            contentValues.put("language_code", "unknown");
            contentValues.put("wordlist", 0);
            contentValues.put("frequency", 0);
            contentValues.put("lastTyped", Integer.valueOf(i8));
            contentValues.put("timesTyped", 1);
            contentValues.put("timesCorrected", Integer.valueOf(i9));
            contentValues.put("timesSuggested", Integer.valueOf(i10));
            contentValues.put("timesUndone", Integer.valueOf(i11));
            contentValues.put("typedLowerCase", Integer.valueOf(i12));
            contentValues.put("typedTitleCase", Integer.valueOf(i13));
            contentValues.put("typedMixedCase", Integer.valueOf(i14));
            contentValues.put("wordMixedCase", string2);
            contentValues.put("wordlist", 0);
            contentValues.put("consider", Integer.valueOf(i15));
            contentValues.put("version", 0);
            e(contentValues);
            b4 = aVar.b(string, this.f9527a);
            o.b(b4);
            num = b4;
        } else {
            i5 = i6;
            String valueOf = String.valueOf(i8);
            String valueOf2 = String.valueOf(i7);
            String valueOf3 = String.valueOf(i9);
            String valueOf4 = String.valueOf(i10);
            String valueOf5 = String.valueOf(i11);
            String valueOf6 = String.valueOf(i12);
            String valueOf7 = String.valueOf(i13);
            String valueOf8 = String.valueOf(i14);
            if (string2 == null) {
                string2 = "";
            }
            i(new String[]{valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, string2, string});
            num = null;
        }
        g(new String[]{b4.toString(), String.valueOf(i5)});
        return new Pair(string, num);
    }

    private final void c() {
        Log log = Log.f10572a;
        Log.d(log, "Migration25to26", "migrate() :: Move BiGrams", (Throwable) null, 4, (Object) null);
        synchronized (this.f9528b) {
            try {
                this.f9527a.beginTransactionNonExclusive();
                this.f9527a.execSQL("CREATE TEMPORARY TABLE temp_bigrams(bg_first INTEGER(8) NOT NULL,bg_second INTEGER(8) NOT NULL,bg_timesTyped INTEGER DEFAULT 0 NOT NULL,bg_timesSuggested INTEGER DEFAULT 0 NOT NULL,bg_timesTapped INTEGER DEFAULT 0 NOT NULL,bg_lastTyped INTEGER(8) DEFAULT (cast(strftime('%s', 'now') as integer(8))) NOT NULL)");
                this.f9527a.execSQL("INSERT INTO temp_bigrams SELECT * FROM bigrams");
                Log.d(log, "Migration25to26", "migrate() :: Move BiGrams ... 1", (Throwable) null, 4, (Object) null);
                this.f9527a.execSQL("DROP TABLE IF EXISTS bigrams");
                Log.d(log, "Migration25to26", "migrate() :: Move BiGrams ... 2", (Throwable) null, 4, (Object) null);
                this.f9527a.execSQL("create table if not exists bigrams(bg_first integer(8) not null, bg_second integer(8) not null, bg_timesTyped integer default 0 not null, bg_timesSuggested integer default 0 not null, bg_timesTapped integer default 0 not null, bg_lastTyped integer(8) default (cast(strftime('%s', 'now') as integer(8))) not null, foreign key (bg_first) references main_dictionary(word_id) on delete cascade on update cascade, foreign key (bg_second) references main_dictionary(word_id) on delete cascade on update cascade, primary key (bg_first, bg_second))");
                Log.d(log, "Migration25to26", "migrate() :: Move BiGrams ... 3", (Throwable) null, 4, (Object) null);
                this.f9527a.setTransactionSuccessful();
                this.f9527a.endTransaction();
                l2.q qVar = l2.q.f14567a;
            } catch (Throwable th) {
                this.f9527a.endTransaction();
                throw th;
            }
        }
    }

    private final void e(ContentValues contentValues) {
        synchronized (this.f9528b) {
            try {
                this.f9527a.beginTransactionNonExclusive();
                this.f9527a.insert("main_dictionary", (String) null, contentValues);
                this.f9527a.setTransactionSuccessful();
                this.f9527a.endTransaction();
                l2.q qVar = l2.q.f14567a;
            } catch (Throwable th) {
                this.f9527a.endTransaction();
                throw th;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0092 A[SYNTHETIC, Splitter:B:26:0x0092] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void f(ch.icoaching.typewise.file_handling.ConfigHolder r12) {
        /*
            r11 = this;
            ch.icoaching.wrio.logging.Log r6 = ch.icoaching.wrio.logging.Log.f10572a
            java.lang.String r1 = "Migration25to26"
            java.lang.String r2 = "migrate() :: Migrate words"
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            ch.icoaching.wrio.logging.Log.d(r0, r1, r2, r3, r4, r5)
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.lang.Object r8 = r11.f9528b
            monitor-enter(r8)
            h2.i$a r0 = h2.C0670i.f13642b     // Catch:{ all -> 0x008d }
            java.lang.String r1 = "unknown"
            android.database.sqlite.SQLiteDatabase r2 = r11.f9527a     // Catch:{ all -> 0x008d }
            int r9 = r0.a(r1, r2)     // Catch:{ all -> 0x008d }
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r11.f9527a     // Catch:{ all -> 0x008f }
            java.lang.String r2 = "SELECT dict_id, word, timesTyped, lastTyped, timesCorrected, timesConsidered, timesUndone, typedLowerCase, typedTitleCase, typedMixedCase, mixedcaseWord, consider FROM dictionary"
            android.database.Cursor r10 = r1.rawQuery(r2, r0)     // Catch:{ all -> 0x008f }
            java.lang.String r1 = "Migration25to26"
            java.lang.String r2 = "migrate() :: Migrate words ... 1"
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            ch.icoaching.wrio.logging.Log.d(r0, r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0052 }
        L_0x0033:
            boolean r0 = r10.moveToNext()     // Catch:{ all -> 0x0052 }
            if (r0 == 0) goto L_0x0055
            kotlin.Pair r0 = r11.b(r10, r9)     // Catch:{ all -> 0x0052 }
            java.lang.Object r1 = r0.getSecond()     // Catch:{ all -> 0x0052 }
            if (r1 == 0) goto L_0x0033
            java.lang.Object r1 = r0.getFirst()     // Catch:{ all -> 0x0052 }
            java.lang.Object r0 = r0.getSecond()     // Catch:{ all -> 0x0052 }
            kotlin.jvm.internal.o.b(r0)     // Catch:{ all -> 0x0052 }
            r7.put(r1, r0)     // Catch:{ all -> 0x0052 }
            goto L_0x0033
        L_0x0052:
            r12 = move-exception
            r0 = r10
            goto L_0x0090
        L_0x0055:
            r10.close()     // Catch:{ all -> 0x008d }
            l2.q r0 = l2.q.f14567a     // Catch:{ all -> 0x008d }
            monitor-exit(r8)
            ch.icoaching.wrio.logging.Log r1 = ch.icoaching.wrio.logging.Log.f10572a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "migrate() :: Migrate words ... 2 | "
            r0.append(r2)
            int r2 = r7.size()
            r0.append(r2)
            java.lang.String r3 = r0.toString()
            java.lang.String r2 = "Migration25to26"
            r5 = 4
            r6 = 0
            r4 = 0
            ch.icoaching.wrio.logging.Log.d(r1, r2, r3, r4, r5, r6)
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x008c
            h2.c r0 = new h2.c
            android.database.sqlite.SQLiteDatabase r1 = r11.f9527a
            java.lang.Object r2 = r11.f9528b
            r0.<init>(r1, r2, r12)
            r0.a(r7)
        L_0x008c:
            return
        L_0x008d:
            r12 = move-exception
            goto L_0x0096
        L_0x008f:
            r12 = move-exception
        L_0x0090:
            if (r0 == 0) goto L_0x0095
            r0.close()     // Catch:{ all -> 0x008d }
        L_0x0095:
            throw r12     // Catch:{ all -> 0x008d }
        L_0x0096:
            monitor-exit(r8)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.data.source.local.db.migrations.Migration25to26.f(ch.icoaching.typewise.file_handling.ConfigHolder):void");
    }

    private final void g(String[] strArr) {
        synchronized (this.f9528b) {
            try {
                this.f9527a.beginTransactionNonExclusive();
                this.f9527a.execSQL("UPDATE temp_bigrams SET bg_first =? WHERE bg_first =?", strArr);
                this.f9527a.execSQL("UPDATE temp_bigrams SET bg_second =? WHERE bg_second =?", strArr);
                this.f9527a.setTransactionSuccessful();
                this.f9527a.endTransaction();
                l2.q qVar = l2.q.f14567a;
            } catch (Throwable th) {
                this.f9527a.endTransaction();
                throw th;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.String[], android.database.Cursor] */
    private final void h() {
        ? r9;
        SQLiteDatabase sQLiteDatabase;
        Log log = Log.f10572a;
        Log.d(log, "Migration25to26", "repopulateBiGrams()", (Throwable) null, 4, (Object) null);
        synchronized (this.f9528b) {
            try {
                String str = "SELECT " + "bg_first" + ", " + "bg_second" + ", " + "bg_timesTyped" + ", " + "bg_timesSuggested" + ", " + "bg_timesTapped" + ", " + "bg_lastTyped" + " FROM " + "temp_bigrams";
                o.d(str, "toString(...)");
                r9 = 0;
                try {
                    this.f9527a.beginTransactionNonExclusive();
                    Log.d(log, "Migration25to26", "repopulateBiGrams() :: Step ... 1", (Throwable) null, 4, (Object) null);
                    ContentValues contentValues = new ContentValues();
                    Cursor rawQuery = this.f9527a.rawQuery(str, r9);
                    while (rawQuery.moveToNext()) {
                        long j4 = rawQuery.getLong(0);
                        long j5 = rawQuery.getLong(1);
                        int i4 = rawQuery.getInt(2);
                        int i5 = rawQuery.getInt(3);
                        int i6 = rawQuery.getInt(4);
                        long j6 = rawQuery.getLong(5);
                        contentValues.clear();
                        contentValues.put("bg_first", Long.valueOf(j4));
                        contentValues.put("bg_second", Long.valueOf(j5));
                        contentValues.put("bg_timesTyped", Integer.valueOf(i4));
                        contentValues.put("bg_timesSuggested", Integer.valueOf(i5));
                        contentValues.put("bg_timesTapped", Integer.valueOf(i6));
                        contentValues.put("bg_lastTyped", Long.valueOf(j6));
                        this.f9527a.insertWithOnConflict("bigrams", "", contentValues, 4);
                    }
                    rawQuery.close();
                    Log.d(Log.f10572a, "Migration25to26", "repopulateBiGrams() :: Step ... 2", (Throwable) null, 4, (Object) null);
                    this.f9527a.execSQL("DROP TABLE IF EXISTS temp_bigrams");
                    this.f9527a.setTransactionSuccessful();
                    if (!rawQuery.isClosed()) {
                        rawQuery.close();
                    }
                    sQLiteDatabase = this.f9527a;
                } catch (SQLiteConstraintException e4) {
                    Log log2 = Log.f10572a;
                    String message = e4.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    log2.e("Migration25to26", message, e4);
                    if (r9 != 0) {
                        if (!r9.isClosed()) {
                            r9.close();
                        }
                    }
                    sQLiteDatabase = this.f9527a;
                }
                sQLiteDatabase.endTransaction();
                Log.d(Log.f10572a, "Migration25to26", "repopulateBiGrams() :: Done", (Throwable) null, 4, (Object) null);
                l2.q qVar = l2.q.f14567a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void i(String[] strArr) {
        synchronized (this.f9528b) {
            try {
                this.f9527a.beginTransactionNonExclusive();
                this.f9527a.execSQL("UPDATE main_dictionary SET lastTyped = ?,timesTyped = ?,timesCorrected = ?,timesSuggested = ?,timesUndone = ?,typedLowerCase = ?,typedTitleCase = ?,typedMixedCase = ?,wordMixedCase = ?  WHERE word = ?", strArr);
                this.f9527a.setTransactionSuccessful();
                this.f9527a.endTransaction();
                l2.q qVar = l2.q.f14567a;
            } catch (Throwable th) {
                this.f9527a.endTransaction();
                throw th;
            }
        }
    }

    public Object d(c cVar) {
        return a(this, cVar);
    }
}
