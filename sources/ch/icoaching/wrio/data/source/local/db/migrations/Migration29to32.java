package ch.icoaching.wrio.data.source.local.db.migrations;

import android.database.sqlite.SQLiteDatabase;
import ch.icoaching.typewise.AILibrarySingletonProvider;
import h2.q;
import kotlin.jvm.internal.o;

public final class Migration29to32 implements q {

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteDatabase f9534a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f9535b;

    /* renamed from: c  reason: collision with root package name */
    private final AILibrarySingletonProvider f9536c;

    public Migration29to32(SQLiteDatabase sQLiteDatabase, Object obj, AILibrarySingletonProvider aILibrarySingletonProvider) {
        o.e(sQLiteDatabase, "writableDatabase");
        o.e(obj, "writableDatabaseLock");
        o.e(aILibrarySingletonProvider, "aiLibrarySingletonProvider");
        this.f9534a = sQLiteDatabase;
        this.f9535b = obj;
        this.f9536c = aILibrarySingletonProvider;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object d(kotlin.coroutines.c r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof ch.icoaching.wrio.data.source.local.db.migrations.Migration29to32$migrate$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            ch.icoaching.wrio.data.source.local.db.migrations.Migration29to32$migrate$1 r0 = (ch.icoaching.wrio.data.source.local.db.migrations.Migration29to32$migrate$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            ch.icoaching.wrio.data.source.local.db.migrations.Migration29to32$migrate$1 r0 = new ch.icoaching.wrio.data.source.local.db.migrations.Migration29to32$migrate$1
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
            goto L_0x0065
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
            java.lang.String r5 = "Migration29to32"
            java.lang.String r6 = "migrate() :: Start"
            r7 = 0
            ch.icoaching.wrio.logging.Log.d(r4, r5, r6, r7, r8, r9)
            ch.icoaching.wrio.data.source.local.db.migrations.Migration26to27$a r12 = ch.icoaching.wrio.data.source.local.db.migrations.Migration26to27.f9530d
            android.database.sqlite.SQLiteDatabase r2 = r11.f9534a
            java.lang.Object r4 = r11.f9535b
            ch.icoaching.typewise.AILibrarySingletonProvider r5 = r11.f9536c
            r0.L$0 = r12
            r0.L$1 = r2
            r0.L$2 = r4
            r0.label = r3
            java.lang.Object r0 = r5.b(r0)
            if (r0 != r1) goto L_0x0061
            return r1
        L_0x0061:
            r1 = r4
            r10 = r0
            r0 = r12
            r12 = r10
        L_0x0065:
            ch.icoaching.typewise.AILibrary r12 = (ch.icoaching.typewise.AILibrary) r12
            ch.icoaching.typewise.file_handling.ConfigHolder r12 = r12.b()
            r0.a(r2, r1, r12)
            ch.icoaching.wrio.logging.Log r3 = ch.icoaching.wrio.logging.Log.f10572a
            r7 = 4
            r8 = 0
            java.lang.String r4 = "Migration29to32"
            java.lang.String r5 = "migrate() :: Done"
            r6 = 0
            ch.icoaching.wrio.logging.Log.d(r3, r4, r5, r6, r7, r8)
            l2.q r12 = l2.q.f14567a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.data.source.local.db.migrations.Migration29to32.d(kotlin.coroutines.c):java.lang.Object");
    }
}
