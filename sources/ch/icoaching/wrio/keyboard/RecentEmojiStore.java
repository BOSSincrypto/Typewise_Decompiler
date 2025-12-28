package ch.icoaching.wrio.keyboard;

import c.C0489b;
import java.util.List;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.C0738g;
import kotlinx.coroutines.CoroutineDispatcher;
import l2.q;

public final class RecentEmojiStore {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C0489b f9971a;

    /* renamed from: b  reason: collision with root package name */
    private final CoroutineDispatcher f9972b;

    public RecentEmojiStore(C0489b bVar, CoroutineDispatcher coroutineDispatcher) {
        o.e(bVar, "databaseHandler");
        o.e(coroutineDispatcher, "ioDispatcher");
        this.f9971a = bVar;
        this.f9972b = coroutineDispatcher;
    }

    public final Object b(List list, c cVar) {
        Object e4 = C0738g.e(this.f9972b, new RecentEmojiStore$save$2(this, list, (c<? super RecentEmojiStore$save$2>) null), cVar);
        if (e4 == a.f()) {
            return e4;
        }
        return q.f14567a;
    }

    public final Object c(c cVar) {
        return C0738g.e(this.f9972b, new RecentEmojiStore$retrieve$2(this, (c<? super RecentEmojiStore$retrieve$2>) null), cVar);
    }
}
