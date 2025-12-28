package h2;

import android.database.sqlite.SQLiteDatabase;
import c.C0489b;
import kotlin.jvm.internal.i;

public final class o implements s {

    /* renamed from: b  reason: collision with root package name */
    public static final a f13650b = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final C0489b f13651a;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public final void a(SQLiteDatabase sQLiteDatabase) {
            kotlin.jvm.internal.o.e(sQLiteDatabase, "db");
            sQLiteDatabase.execSQL("create table if not exists recent_symbols(symbol text not null unique, times_typed integer, last_typed integer(8) not null, primary key (symbol))");
        }

        private a() {
        }
    }

    public o(C0489b bVar) {
        kotlin.jvm.internal.o.e(bVar, "databaseHandler");
        this.f13651a = bVar;
    }

    public void e(SQLiteDatabase sQLiteDatabase) {
        kotlin.jvm.internal.o.e(sQLiteDatabase, "db");
        f13650b.a(sQLiteDatabase);
    }

    public void f(SQLiteDatabase sQLiteDatabase) {
        kotlin.jvm.internal.o.e(sQLiteDatabase, "db");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS dictionary_languages");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f7, code lost:
        r14 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f8, code lost:
        r0 = r8;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ed A[SYNTHETIC, Splitter:B:28:0x00ed] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00f2 A[Catch:{ all -> 0x00f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00fb A[Catch:{ all -> 0x00f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0100 A[Catch:{ all -> 0x00f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x004a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(java.util.List r14) {
        /*
            r13 = this;
            r0 = 1
            r1 = 0
            java.lang.String r2 = "symbols"
            kotlin.jvm.internal.o.e(r14, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "SELECT "
            r2.append(r3)
            java.lang.String r3 = "symbol"
            r2.append(r3)
            java.lang.String r3 = " FROM "
            r2.append(r3)
            java.lang.String r3 = "recent_symbols"
            r2.append(r3)
            java.lang.String r3 = " WHERE "
            r2.append(r3)
            java.lang.String r3 = "symbol"
            r2.append(r3)
            java.lang.String r3 = " = ?"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "toString(...)"
            kotlin.jvm.internal.o.d(r2, r3)
            c.b r3 = r13.f13651a
            android.database.sqlite.SQLiteDatabase r4 = r3.f7501k
            java.lang.Object r3 = r3.f7503m
            java.lang.String r5 = "databaseLock"
            kotlin.jvm.internal.o.d(r3, r5)
            monitor-enter(r3)
            java.util.Iterator r14 = r14.iterator()     // Catch:{ all -> 0x00db }
            r5 = 0
            r6 = r5
        L_0x004a:
            boolean r7 = r14.hasNext()     // Catch:{ all -> 0x00db }
            if (r7 == 0) goto L_0x0104
            java.lang.Object r7 = r14.next()     // Catch:{ all -> 0x00db }
            g2.a r7 = (g2.C0657a) r7     // Catch:{ all -> 0x00db }
            char r8 = r7.a()     // Catch:{ SQLiteException -> 0x00e0, all -> 0x00dd }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ SQLiteException -> 0x00e0, all -> 0x00dd }
            java.lang.String[] r8 = new java.lang.String[]{r8}     // Catch:{ SQLiteException -> 0x00e0, all -> 0x00dd }
            android.database.Cursor r6 = r4.rawQuery(r2, r8)     // Catch:{ SQLiteException -> 0x00e0, all -> 0x00dd }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ SQLiteException -> 0x00e0, all -> 0x00dd }
            r10 = 1000(0x3e8, float:1.401E-42)
            long r10 = (long) r10     // Catch:{ SQLiteException -> 0x00e0, all -> 0x00dd }
            long r8 = r8 / r10
            r4.beginTransactionNonExclusive()     // Catch:{ SQLiteException -> 0x00e0, all -> 0x00dd }
            boolean r10 = r6.moveToFirst()     // Catch:{ SQLiteException -> 0x00a0, all -> 0x009e }
            if (r10 == 0) goto L_0x00a3
            java.lang.String r10 = "UPDATE recent_symbols SET times_typed = times_typed + ?, last_typed = ? WHERE symbol = ?"
            int r11 = r7.c()     // Catch:{ SQLiteException -> 0x00a0, all -> 0x009e }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ SQLiteException -> 0x00a0, all -> 0x009e }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ SQLiteException -> 0x00a0, all -> 0x009e }
            char r7 = r7.a()     // Catch:{ SQLiteException -> 0x00a0, all -> 0x009e }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ SQLiteException -> 0x00a0, all -> 0x009e }
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ SQLiteException -> 0x00a0, all -> 0x009e }
            r9[r1] = r11     // Catch:{ SQLiteException -> 0x00a0, all -> 0x009e }
            r9[r0] = r8     // Catch:{ SQLiteException -> 0x00a0, all -> 0x009e }
            r8 = 2
            r9[r8] = r7     // Catch:{ SQLiteException -> 0x00a0, all -> 0x009e }
            r4.execSQL(r10, r9)     // Catch:{ SQLiteException -> 0x00a0, all -> 0x009e }
            r4.setTransactionSuccessful()     // Catch:{ SQLiteException -> 0x00a0, all -> 0x009e }
            goto L_0x00d3
        L_0x009e:
            r14 = move-exception
            goto L_0x00f9
        L_0x00a0:
            r7 = move-exception
            r8 = r0
            goto L_0x00e2
        L_0x00a3:
            android.content.ContentValues r10 = new android.content.ContentValues     // Catch:{ SQLiteException -> 0x00a0, all -> 0x009e }
            r10.<init>()     // Catch:{ SQLiteException -> 0x00a0, all -> 0x009e }
            java.lang.String r11 = "symbol"
            char r12 = r7.a()     // Catch:{ SQLiteException -> 0x00a0, all -> 0x009e }
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ SQLiteException -> 0x00a0, all -> 0x009e }
            r10.put(r11, r12)     // Catch:{ SQLiteException -> 0x00a0, all -> 0x009e }
            java.lang.String r11 = "times_typed"
            int r7 = r7.c()     // Catch:{ SQLiteException -> 0x00a0, all -> 0x009e }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ SQLiteException -> 0x00a0, all -> 0x009e }
            r10.put(r11, r7)     // Catch:{ SQLiteException -> 0x00a0, all -> 0x009e }
            java.lang.String r7 = "last_typed"
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ SQLiteException -> 0x00a0, all -> 0x009e }
            r10.put(r7, r8)     // Catch:{ SQLiteException -> 0x00a0, all -> 0x009e }
            java.lang.String r7 = "recent_symbols"
            r4.insert(r7, r5, r10)     // Catch:{ SQLiteException -> 0x00a0, all -> 0x009e }
            r4.setTransactionSuccessful()     // Catch:{ SQLiteException -> 0x00a0, all -> 0x009e }
        L_0x00d3:
            r6.close()     // Catch:{ all -> 0x00db }
            r4.endTransaction()     // Catch:{ all -> 0x00db }
            goto L_0x004a
        L_0x00db:
            r14 = move-exception
            goto L_0x0108
        L_0x00dd:
            r14 = move-exception
            r0 = r1
            goto L_0x00f9
        L_0x00e0:
            r7 = move-exception
            r8 = r1
        L_0x00e2:
            ch.icoaching.wrio.logging.Log r9 = ch.icoaching.wrio.logging.Log.f10572a     // Catch:{ all -> 0x00f7 }
            java.lang.String r10 = "ImplRecentSymbolsDao"
            java.lang.String r11 = "insertOrUpdateExisting() :: ... 1"
            r9.e(r10, r11, r7)     // Catch:{ all -> 0x00f7 }
            if (r6 == 0) goto L_0x00f0
            r6.close()     // Catch:{ all -> 0x00db }
        L_0x00f0:
            if (r8 == 0) goto L_0x004a
            r4.endTransaction()     // Catch:{ all -> 0x00db }
            goto L_0x004a
        L_0x00f7:
            r14 = move-exception
            r0 = r8
        L_0x00f9:
            if (r6 == 0) goto L_0x00fe
            r6.close()     // Catch:{ all -> 0x00db }
        L_0x00fe:
            if (r0 == 0) goto L_0x0103
            r4.endTransaction()     // Catch:{ all -> 0x00db }
        L_0x0103:
            throw r14     // Catch:{ all -> 0x00db }
        L_0x0104:
            l2.q r14 = l2.q.f14567a     // Catch:{ all -> 0x00db }
            monitor-exit(r3)
            return
        L_0x0108:
            monitor-exit(r3)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.o.g(java.util.List):void");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.String[], android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r3v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r3 == 0) goto L_0x0030;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isEmpty() {
        /*
            r6 = this;
            java.lang.String r0 = "SELECT EXISTS(SELECT * FROM recent_symbols LIMIT 1)"
            c.b r1 = r6.f13651a
            android.database.sqlite.SQLiteDatabase r1 = r1.f7502l
            r2 = 1
            r3 = 0
            android.database.Cursor r3 = r1.rawQuery(r0, r3)     // Catch:{ SQLException -> 0x0021 }
            boolean r0 = r3.moveToFirst()     // Catch:{ SQLException -> 0x0021 }
            if (r0 == 0) goto L_0x002d
            r0 = 0
            int r1 = r3.getInt(r0)     // Catch:{ SQLException -> 0x0021 }
            if (r1 != 0) goto L_0x001a
            goto L_0x001b
        L_0x001a:
            r2 = r0
        L_0x001b:
            r3.close()
            return r2
        L_0x001f:
            r0 = move-exception
            goto L_0x0031
        L_0x0021:
            r0 = move-exception
            ch.icoaching.wrio.logging.Log r1 = ch.icoaching.wrio.logging.Log.f10572a     // Catch:{ all -> 0x001f }
            java.lang.String r4 = "ImplRecentSymbolsDao"
            java.lang.String r5 = "isEmpty()"
            r1.e(r4, r5, r0)     // Catch:{ all -> 0x001f }
            if (r3 == 0) goto L_0x0030
        L_0x002d:
            r3.close()
        L_0x0030:
            return r2
        L_0x0031:
            if (r3 == 0) goto L_0x0036
            r3.close()
        L_0x0036:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.o.isEmpty():boolean");
    }
}
