package ch.icoaching.wrio.data.source.local;

import c.C0489b;
import java.util.List;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.C0738g;
import kotlinx.coroutines.CoroutineDispatcher;
import l2.q;

public final class RecentSymbolsStore {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C0489b f9520a;

    /* renamed from: b  reason: collision with root package name */
    private final CoroutineDispatcher f9521b;

    public RecentSymbolsStore(C0489b bVar, CoroutineDispatcher coroutineDispatcher) {
        o.e(bVar, "databaseHandler");
        o.e(coroutineDispatcher, "ioDispatcher");
        this.f9520a = bVar;
        this.f9521b = coroutineDispatcher;
    }

    public final Object b(List list, c cVar) {
        Object e4 = C0738g.e(this.f9521b, new RecentSymbolsStore$save$2(this, list, (c<? super RecentSymbolsStore$save$2>) null), cVar);
        if (e4 == a.f()) {
            return e4;
        }
        return q.f14567a;
    }

    public final Object c(c cVar) {
        return C0738g.e(this.f9521b, new RecentSymbolsStore$isEmpty$2(this, (c<? super RecentSymbolsStore$isEmpty$2>) null), cVar);
    }
}
