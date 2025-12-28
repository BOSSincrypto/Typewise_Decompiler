package ch.icoaching.wrio.data.source.local.db.migrations;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import ch.icoaching.typewise.AILibrarySingletonProvider;
import ch.icoaching.wrio.data.c;
import ch.icoaching.wrio.dictionary.b;
import h2.C0670i;
import h2.C0672k;
import h2.q;
import java.util.Map;
import kotlin.jvm.internal.o;

public final class Migration35to36 implements q {

    /* renamed from: a  reason: collision with root package name */
    private final Context f9537a;

    /* renamed from: b  reason: collision with root package name */
    private final SQLiteDatabase f9538b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f9539c;

    /* renamed from: d  reason: collision with root package name */
    private final AILibrarySingletonProvider f9540d;

    /* renamed from: e  reason: collision with root package name */
    private final b f9541e;

    public Migration35to36(Context context, c cVar, SQLiteDatabase sQLiteDatabase, Object obj, AILibrarySingletonProvider aILibrarySingletonProvider) {
        o.e(context, "context");
        o.e(cVar, "languageSettings");
        o.e(sQLiteDatabase, "writableDatabase");
        o.e(obj, "writableDatabaseLock");
        o.e(aILibrarySingletonProvider, "aiLibrarySingletonProvider");
        this.f9537a = context;
        this.f9538b = sQLiteDatabase;
        this.f9539c = obj;
        this.f9540d = aILibrarySingletonProvider;
        this.f9541e = new b(cVar);
    }

    private final int a(String str) {
        int j4;
        if (str == null) {
            return -1;
        }
        synchronized (this.f9539c) {
            j4 = C0672k.f13645b.j(C0670i.f13642b.a(str, this.f9538b), this.f9538b);
        }
        return j4;
    }

    private final Map b() {
        Map b4;
        synchronized (this.f9539c) {
            b4 = C0670i.f13642b.b(this.f9538b);
        }
        return b4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object d(kotlin.coroutines.c r19) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r2 = 5000(0x1388, float:7.006E-42)
            boolean r3 = r0 instanceof ch.icoaching.wrio.data.source.local.db.migrations.Migration35to36$migrate$1
            if (r3 == 0) goto L_0x0019
            r3 = r0
            ch.icoaching.wrio.data.source.local.db.migrations.Migration35to36$migrate$1 r3 = (ch.icoaching.wrio.data.source.local.db.migrations.Migration35to36$migrate$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001e
        L_0x0019:
            ch.icoaching.wrio.data.source.local.db.migrations.Migration35to36$migrate$1 r3 = new ch.icoaching.wrio.data.source.local.db.migrations.Migration35to36$migrate$1
            r3.<init>(r1, r0)
        L_0x001e:
            java.lang.Object r0 = r3.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.a.f()
            int r5 = r3.label
            r6 = 1
            if (r5 == 0) goto L_0x003f
            if (r5 != r6) goto L_0x0037
            java.lang.Object r4 = r3.L$1
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r3 = r3.L$0
            ch.icoaching.wrio.data.source.local.db.migrations.Migration35to36 r3 = (ch.icoaching.wrio.data.source.local.db.migrations.Migration35to36) r3
            kotlin.f.b(r0)
            goto L_0x0064
        L_0x0037:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x003f:
            kotlin.f.b(r0)
            ch.icoaching.wrio.logging.Log r7 = ch.icoaching.wrio.logging.Log.f10572a
            java.lang.String r8 = "Migration35to36"
            java.lang.String r9 = "migrate() :: Start"
            r11 = 4
            r12 = 0
            r10 = 0
            ch.icoaching.wrio.logging.Log.d(r7, r8, r9, r10, r11, r12)
            java.util.Map r0 = r18.b()
            ch.icoaching.typewise.AILibrarySingletonProvider r5 = r1.f9540d
            r3.L$0 = r1
            r3.L$1 = r0
            r3.label = r6
            java.lang.Object r3 = r5.b(r3)
            if (r3 != r4) goto L_0x0061
            return r4
        L_0x0061:
            r4 = r0
            r0 = r3
            r3 = r1
        L_0x0064:
            ch.icoaching.typewise.AILibrary r0 = (ch.icoaching.typewise.AILibrary) r0
            ch.icoaching.typewise.file_handling.ConfigHolder r0 = r0.b()
            ch.icoaching.typewise.config.CompanyConfig r0 = r0.c()
            ch.icoaching.typewise.config.CompanyConfig$b r0 = r0.e()
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x007a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x011b
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r5.getValue()
            java.lang.Number r5 = (java.lang.Number) r5
            int r11 = r5.intValue()
            ch.icoaching.wrio.dictionary.b r5 = r3.f9541e
            android.content.Context r7 = r3.f9537a
            int r5 = r5.a(r7, r6)
            if (r5 <= 0) goto L_0x007a
            ch.icoaching.wrio.dictionary.b r7 = r3.f9541e
            android.content.Context r8 = r3.f9537a
            ch.icoaching.wrio.dictionary.f r12 = r7.b(r8, r6, r11, r5)
            int r5 = r3.a(r6)
            int r6 = r12.a()
            if (r5 >= r6) goto L_0x007a
            r5 = 0
            int r13 = p2.C0854c.b(r5, r6, r2)
            if (r13 < 0) goto L_0x007a
            r14 = r5
        L_0x00ba:
            java.lang.Object r15 = r3.f9539c
            monitor-enter(r15)
            h2.k$a r5 = h2.C0672k.f13645b     // Catch:{ all -> 0x010e }
            java.util.List r6 = r12.b(r14)     // Catch:{ all -> 0x010e }
            android.database.sqlite.SQLiteDatabase r7 = r3.f9538b     // Catch:{ all -> 0x010e }
            java.util.List r6 = r5.d(r6, r11, r7)     // Catch:{ all -> 0x010e }
            boolean r7 = r6.isEmpty()     // Catch:{ all -> 0x010e }
            if (r7 != 0) goto L_0x0110
            android.database.sqlite.SQLiteDatabase r7 = r3.f9538b     // Catch:{ all -> 0x010e }
            java.lang.Object r8 = r3.f9539c     // Catch:{ all -> 0x010e }
            java.util.Map r10 = r5.f(r6, r7, r8)     // Catch:{ all -> 0x010e }
            ch.icoaching.typewise.autocorrection.scripts.h r16 = new ch.icoaching.typewise.autocorrection.scripts.h     // Catch:{ all -> 0x010e }
            java.util.Set r5 = r10.keySet()     // Catch:{ all -> 0x010e }
            java.util.Iterator r6 = r5.iterator()     // Catch:{ all -> 0x010e }
            r9 = 4
            r17 = 0
            r8 = 0
            r5 = r16
            r7 = r0
            r2 = r10
            r10 = r17
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x010e }
            java.util.Map r5 = r16.d()     // Catch:{ all -> 0x010e }
            java.util.Set r5 = r5.keySet()     // Catch:{ all -> 0x010e }
            android.database.sqlite.SQLiteDatabase r6 = r3.f9538b     // Catch:{ all -> 0x010e }
            java.lang.Object r7 = r3.f9539c     // Catch:{ all -> 0x010e }
            java.util.Map r5 = h2.C0666e.a(r5, r6, r7)     // Catch:{ all -> 0x010e }
            java.util.Map r6 = r16.d()     // Catch:{ all -> 0x010e }
            java.util.List r2 = e.C0641a.a(r6, r2, r5)     // Catch:{ all -> 0x010e }
            android.database.sqlite.SQLiteDatabase r5 = r3.f9538b     // Catch:{ all -> 0x010e }
            java.lang.Object r6 = r3.f9539c     // Catch:{ all -> 0x010e }
            h2.C0666e.b(r2, r5, r6)     // Catch:{ all -> 0x010e }
            goto L_0x0110
        L_0x010e:
            r0 = move-exception
            goto L_0x0119
        L_0x0110:
            l2.q r2 = l2.q.f14567a     // Catch:{ all -> 0x010e }
            monitor-exit(r15)
            r2 = 5000(0x1388, float:7.006E-42)
            if (r14 == r13) goto L_0x007a
            int r14 = r14 + r2
            goto L_0x00ba
        L_0x0119:
            monitor-exit(r15)
            throw r0
        L_0x011b:
            ch.icoaching.wrio.logging.Log r2 = ch.icoaching.wrio.logging.Log.f10572a
            java.lang.String r3 = "Migration35to36"
            java.lang.String r4 = "migrate() :: Done"
            r6 = 4
            r7 = 0
            r5 = 0
            ch.icoaching.wrio.logging.Log.d(r2, r3, r4, r5, r6, r7)
            l2.q r0 = l2.q.f14567a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.data.source.local.db.migrations.Migration35to36.d(kotlin.coroutines.c):java.lang.Object");
    }
}
