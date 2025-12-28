package ch.icoaching.wrio.data.source.local.db.migrations;

import ch.icoaching.wrio.logging.Log;
import h2.q;
import kotlin.coroutines.c;
import kotlin.jvm.internal.o;

public final class p implements q {

    /* renamed from: a  reason: collision with root package name */
    private final h2.p f9576a;

    public p(h2.p pVar) {
        o.e(pVar, "mainDictionaryDao");
        this.f9576a = pVar;
    }

    public Object d(c cVar) {
        Log.d(Log.f10572a, "Migration49to50", "migrate() :: Start", (Throwable) null, 4, (Object) null);
        for (Number intValue : this.f9576a.f()) {
            this.f9576a.n(intValue.intValue());
        }
        Log.d(Log.f10572a, "Migration49to50", "migrate() :: End", (Throwable) null, 4, (Object) null);
        return l2.q.f14567a;
    }
}
