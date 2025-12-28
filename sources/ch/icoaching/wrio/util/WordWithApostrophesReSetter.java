package ch.icoaching.wrio.util;

import c.C0489b;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.c;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.D;
import kotlinx.coroutines.g0;

public final class WordWithApostrophesReSetter {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C0489b f10690a;

    /* renamed from: b  reason: collision with root package name */
    private final D f10691b;

    public WordWithApostrophesReSetter(C0489b bVar, D d4) {
        o.e(bVar, "databaseHandler");
        o.e(d4, "coroutineScope");
        this.f10690a = bVar;
        this.f10691b = d4;
    }

    public final g0 b() {
        return C0739h.d(this.f10691b, (CoroutineContext) null, (CoroutineStart) null, new WordWithApostrophesReSetter$resetWordsWithApostrophes$1(this, (c<? super WordWithApostrophesReSetter$resetWordsWithApostrophes$1>) null), 3, (Object) null);
    }
}
