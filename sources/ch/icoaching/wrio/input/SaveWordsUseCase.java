package ch.icoaching.wrio.input;

import android.content.Context;
import c.C0489b;
import ch.icoaching.typewise.AILibrarySingletonProvider;
import ch.icoaching.wrio.data.h;
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

public final class SaveWordsUseCase {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Context f9750a;

    /* renamed from: b  reason: collision with root package name */
    private final D f9751b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final CoroutineDispatcher f9752c;

    /* renamed from: d  reason: collision with root package name */
    private final CoroutineDispatcher f9753d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final i f9754e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final C0489b f9755f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final h f9756g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final AILibrarySingletonProvider f9757h;

    public SaveWordsUseCase(Context context, D d4, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, i iVar, C0489b bVar, h hVar, AILibrarySingletonProvider aILibrarySingletonProvider) {
        o.e(context, "applicationContext");
        o.e(d4, "scope");
        o.e(coroutineDispatcher, "ioDispatcher");
        o.e(coroutineDispatcher2, "mainDispatcher");
        o.e(iVar, "inputFieldWordCounters");
        o.e(bVar, "databaseHandler");
        o.e(hVar, "dictionarySettings");
        o.e(aILibrarySingletonProvider, "aiLibrarySingletonProvider");
        this.f9750a = context;
        this.f9751b = d4;
        this.f9752c = coroutineDispatcher;
        this.f9753d = coroutineDispatcher2;
        this.f9754e = iVar;
        this.f9755f = bVar;
        this.f9756g = hVar;
        this.f9757h = aILibrarySingletonProvider;
    }

    /* access modifiers changed from: private */
    public final Object c(String str, String str2, c cVar) {
        Object e4 = C0738g.e(this.f9753d, new SaveWordsUseCase$saveWords$2(this, str, str2, (c<? super SaveWordsUseCase$saveWords$2>) null), cVar);
        if (e4 == a.f()) {
            return e4;
        }
        return q.f14567a;
    }

    public final void d(String str, String str2) {
        o.e(str, "currentText");
        o.e(str2, "dominantLanguage");
        g0 unused = C0739h.d(this.f9751b, (CoroutineContext) null, (CoroutineStart) null, new SaveWordsUseCase$execute$1(this, str, str2, (c<? super SaveWordsUseCase$execute$1>) null), 3, (Object) null);
    }
}
