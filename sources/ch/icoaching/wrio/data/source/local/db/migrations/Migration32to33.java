package ch.icoaching.wrio.data.source.local.db.migrations;

import android.database.sqlite.SQLiteDatabase;
import ch.icoaching.typewise.AILibrarySingletonProvider;
import kotlin.jvm.internal.o;

public final class Migration32to33 extends Migration25to26 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Migration32to33(SQLiteDatabase sQLiteDatabase, Object obj, AILibrarySingletonProvider aILibrarySingletonProvider) {
        super(sQLiteDatabase, obj, aILibrarySingletonProvider);
        o.e(sQLiteDatabase, "writableDatabase");
        o.e(obj, "writableDatabaseLock");
        o.e(aILibrarySingletonProvider, "aiLibrarySingletonProvider");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object d(kotlin.coroutines.c r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof ch.icoaching.wrio.data.source.local.db.migrations.Migration32to33$migrate$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            ch.icoaching.wrio.data.source.local.db.migrations.Migration32to33$migrate$1 r0 = (ch.icoaching.wrio.data.source.local.db.migrations.Migration32to33$migrate$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            ch.icoaching.wrio.data.source.local.db.migrations.Migration32to33$migrate$1 r0 = new ch.icoaching.wrio.data.source.local.db.migrations.Migration32to33$migrate$1
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.f.b(r11)
            goto L_0x0049
        L_0x0029:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0031:
            kotlin.f.b(r11)
            ch.icoaching.wrio.logging.Log r4 = ch.icoaching.wrio.logging.Log.f10572a
            r8 = 4
            r9 = 0
            java.lang.String r5 = "Migration32to33"
            java.lang.String r6 = "migrate() :: Start"
            r7 = 0
            ch.icoaching.wrio.logging.Log.d(r4, r5, r6, r7, r8, r9)
            r0.label = r3
            java.lang.Object r11 = super.d(r0)
            if (r11 != r1) goto L_0x0049
            return r1
        L_0x0049:
            ch.icoaching.wrio.logging.Log r2 = ch.icoaching.wrio.logging.Log.f10572a
            r6 = 4
            r7 = 0
            java.lang.String r3 = "Migration32to33"
            java.lang.String r4 = "migrate() :: Done"
            r5 = 0
            ch.icoaching.wrio.logging.Log.d(r2, r3, r4, r5, r6, r7)
            l2.q r11 = l2.q.f14567a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.data.source.local.db.migrations.Migration32to33.d(kotlin.coroutines.c):java.lang.Object");
    }
}
