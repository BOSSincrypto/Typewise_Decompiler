package ch.icoaching.wrio.input;

import c.C0489b;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.C0738g;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.D;
import kotlinx.coroutines.g0;
import l2.q;

public final class DeleteWordUseCase {

    /* renamed from: a  reason: collision with root package name */
    private final D f9735a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final CoroutineDispatcher f9736b;

    /* renamed from: c  reason: collision with root package name */
    private final CoroutineDispatcher f9737c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final i f9738d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final C0489b f9739e;

    public DeleteWordUseCase(D d4, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, i iVar, C0489b bVar) {
        o.e(d4, "scope");
        o.e(coroutineDispatcher, "ioDispatcher");
        o.e(coroutineDispatcher2, "mainDispatcher");
        o.e(iVar, "inputFieldWordCounters");
        o.e(bVar, "databaseHandler");
        this.f9735a = d4;
        this.f9736b = coroutineDispatcher;
        this.f9737c = coroutineDispatcher2;
        this.f9738d = iVar;
        this.f9739e = bVar;
    }

    /* access modifiers changed from: private */
    public final Object c(String str, c cVar) {
        Object e4 = C0738g.e(this.f9737c, new DeleteWordUseCase$deleteWord$2(this, str, (c<? super DeleteWordUseCase$deleteWord$2>) null), cVar);
        if (e4 == a.f()) {
            return e4;
        }
        return q.f14567a;
    }

    public final void d(String str) {
        o.e(str, "word");
        g0 unused = C0739h.d(this.f9735a, (CoroutineContext) null, (CoroutineStart) null, new DeleteWordUseCase$execute$1(this, str, (c<? super DeleteWordUseCase$execute$1>) null), 3, (Object) null);
    }
}
