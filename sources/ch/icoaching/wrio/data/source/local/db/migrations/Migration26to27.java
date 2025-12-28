package ch.icoaching.wrio.data.source.local.db.migrations;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import ch.icoaching.typewise.AILibrarySingletonProvider;
import ch.icoaching.typewise.file_handling.ConfigHolder;
import ch.icoaching.wrio.logging.Log;
import h2.C0664c;
import h2.C0669h;
import h2.C0670i;
import h2.C0672k;
import h2.q;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public final class Migration26to27 implements q {

    /* renamed from: d  reason: collision with root package name */
    public static final a f9530d = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteDatabase f9531a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f9532b;

    /* renamed from: c  reason: collision with root package name */
    private final AILibrarySingletonProvider f9533c;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public final void a(SQLiteDatabase sQLiteDatabase, Object obj, ConfigHolder configHolder) {
            List<Number> c4;
            Map e4;
            o.e(sQLiteDatabase, "writableDatabase");
            o.e(obj, "writableDatabaseLock");
            o.e(configHolder, "configHolder");
            Log.d(Log.f10572a, "Migration26to27", "recreateDeletes() :: Remove current deletes", (Throwable) null, 4, (Object) null);
            C0669h.f13640b.a(sQLiteDatabase, obj);
            synchronized (obj) {
                c4 = C0670i.f13642b.c(sQLiteDatabase);
            }
            for (Number intValue : c4) {
                int intValue2 = intValue.intValue();
                Log log = Log.f10572a;
                Log.d(log, "Migration26to27", "recreateDeletes() :: Load words for language with ID " + intValue2, (Throwable) null, 4, (Object) null);
                synchronized (obj) {
                    e4 = C0672k.f13645b.e(intValue2, sQLiteDatabase);
                }
                Log.d(log, "Migration26to27", "recreateDeletes() :: Create deletes for language with ID " + intValue2, (Throwable) null, 4, (Object) null);
                new C0664c(sQLiteDatabase, obj, configHolder).a(e4);
            }
        }

        private a() {
        }
    }

    public Migration26to27(SQLiteDatabase sQLiteDatabase, Object obj, AILibrarySingletonProvider aILibrarySingletonProvider) {
        o.e(sQLiteDatabase, "writableDatabase");
        o.e(obj, "writableDatabaseLock");
        o.e(aILibrarySingletonProvider, "aiLibrarySingletonProvider");
        this.f9531a = sQLiteDatabase;
        this.f9532b = obj;
        this.f9533c = aILibrarySingletonProvider;
    }

    private final void a() {
        SQLiteDatabase sQLiteDatabase;
        synchronized (this.f9532b) {
            try {
                this.f9531a.beginTransactionNonExclusive();
                this.f9531a.execSQL("UPDATE main_dictionary SET consider = 1  WHERE wordlist = 1");
                this.f9531a.setTransactionSuccessful();
                sQLiteDatabase = this.f9531a;
            } catch (SQLException e4) {
                try {
                    Log.f10572a.e("Migration26to27", "Couldn't reset the consider flag", e4);
                    sQLiteDatabase = this.f9531a;
                } catch (Throwable th) {
                    this.f9531a.endTransaction();
                    throw th;
                }
            }
            sQLiteDatabase.endTransaction();
            l2.q qVar = l2.q.f14567a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object d(kotlin.coroutines.c r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof ch.icoaching.wrio.data.source.local.db.migrations.Migration26to27$migrate$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            ch.icoaching.wrio.data.source.local.db.migrations.Migration26to27$migrate$1 r0 = (ch.icoaching.wrio.data.source.local.db.migrations.Migration26to27$migrate$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            ch.icoaching.wrio.data.source.local.db.migrations.Migration26to27$migrate$1 r0 = new ch.icoaching.wrio.data.source.local.db.migrations.Migration26to27$migrate$1
            r0.<init>(r11, r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r1 = r0.L$2
            java.lang.Object r2 = r0.L$1
            android.database.sqlite.SQLiteDatabase r2 = (android.database.sqlite.SQLiteDatabase) r2
            java.lang.Object r0 = r0.L$0
            ch.icoaching.wrio.data.source.local.db.migrations.Migration26to27$a r0 = (ch.icoaching.wrio.data.source.local.db.migrations.Migration26to27.a) r0
            kotlin.f.b(r12)
            goto L_0x0068
        L_0x0033:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x003b:
            kotlin.f.b(r12)
            ch.icoaching.wrio.logging.Log r4 = ch.icoaching.wrio.logging.Log.f10572a
            r8 = 4
            r9 = 0
            java.lang.String r5 = "Migration26to27"
            java.lang.String r6 = "migrate() :: Start"
            r7 = 0
            ch.icoaching.wrio.logging.Log.d(r4, r5, r6, r7, r8, r9)
            r11.a()
            ch.icoaching.wrio.data.source.local.db.migrations.Migration26to27$a r12 = f9530d
            android.database.sqlite.SQLiteDatabase r2 = r11.f9531a
            java.lang.Object r4 = r11.f9532b
            ch.icoaching.typewise.AILibrarySingletonProvider r5 = r11.f9533c
            r0.L$0 = r12
            r0.L$1 = r2
            r0.L$2 = r4
            r0.label = r3
            java.lang.Object r0 = r5.b(r0)
            if (r0 != r1) goto L_0x0064
            return r1
        L_0x0064:
            r1 = r4
            r10 = r0
            r0 = r12
            r12 = r10
        L_0x0068:
            ch.icoaching.typewise.AILibrary r12 = (ch.icoaching.typewise.AILibrary) r12
            ch.icoaching.typewise.file_handling.ConfigHolder r12 = r12.b()
            r0.a(r2, r1, r12)
            ch.icoaching.wrio.logging.Log r3 = ch.icoaching.wrio.logging.Log.f10572a
            r7 = 4
            r8 = 0
            java.lang.String r4 = "Migration26to27"
            java.lang.String r5 = "migrate() :: Done"
            r6 = 0
            ch.icoaching.wrio.logging.Log.d(r3, r4, r5, r6, r7, r8)
            l2.q r12 = l2.q.f14567a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.data.source.local.db.migrations.Migration26to27.d(kotlin.coroutines.c):java.lang.Object");
    }
}
