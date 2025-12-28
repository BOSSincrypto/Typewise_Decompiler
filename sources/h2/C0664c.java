package h2;

import android.database.sqlite.SQLiteDatabase;
import ch.icoaching.typewise.autocorrection.scripts.h;
import ch.icoaching.typewise.file_handling.ConfigHolder;
import ch.icoaching.wrio.logging.Log;
import e.C0641a;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

/* renamed from: h2.c  reason: case insensitive filesystem */
public final class C0664c {

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteDatabase f13635a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f13636b;

    /* renamed from: c  reason: collision with root package name */
    private final ConfigHolder f13637c;

    public C0664c(SQLiteDatabase sQLiteDatabase, Object obj, ConfigHolder configHolder) {
        o.e(sQLiteDatabase, "writableDatabase");
        o.e(obj, "writableDatabaseLock");
        o.e(configHolder, "configHolder");
        this.f13635a = sQLiteDatabase;
        this.f13636b = obj;
        this.f13637c = configHolder;
    }

    public final void a(Map map) {
        o.e(map, "words");
        Log log = Log.f10572a;
        Log.d(log, "CreateAndInsertDeletesUseCase", "execute() :: Create deletes", (Throwable) null, 4, (Object) null);
        Map d4 = new h(map.keySet().iterator(), this.f13637c.c().e(), 0, 4, (i) null).d();
        Set keySet = d4.keySet();
        Log.d(log, "CreateAndInsertDeletesUseCase", "execute() :: Insert deletes in DB", (Throwable) null, 4, (Object) null);
        Map a4 = C0666e.a(keySet, this.f13635a, this.f13636b);
        Log.d(log, "CreateAndInsertDeletesUseCase", "execute() :: Insert deletes dictionary in DB", (Throwable) null, 4, (Object) null);
        C0666e.b(C0641a.a(d4, map, a4), this.f13635a, this.f13636b);
    }
}
