package N2;

import K2.C0341a;
import c.C0489b;
import c2.C0497c;
import ch.icoaching.typewise.AILibrarySingletonProvider;
import ch.icoaching.wrio.data.a;
import ch.icoaching.wrio.data.c;
import ch.icoaching.wrio.data.h;
import ch.icoaching.wrio.dictionary.d;
import i2.C0680a;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineDispatcher;

public class f extends androidx.work.f {
    public f(C0497c cVar, C0680a aVar, a aVar2, O2.a aVar3, d dVar, h hVar, c cVar2, C0489b bVar, C0341a aVar4, CoroutineDispatcher coroutineDispatcher, AILibrarySingletonProvider aILibrarySingletonProvider) {
        c cVar3 = cVar2;
        C0489b bVar2 = bVar;
        C0497c cVar4 = cVar;
        o.e(cVar4, "dictionaryRepository");
        C0680a aVar5 = aVar;
        o.e(aVar5, "defaultSharedPreferences");
        a aVar6 = aVar2;
        o.e(aVar6, "autocorrectionSettings");
        o.e(aVar3, "notificationHelper");
        o.e(dVar, "dictionaryController");
        o.e(hVar, "dictionarySettings");
        o.e(cVar3, "languageSettings");
        o.e(bVar2, "databaseHandler");
        o.e(aVar4, "json");
        o.e(coroutineDispatcher, "ioDispatcher");
        o.e(aILibrarySingletonProvider, "aiLibrarySingletonProvider");
        g gVar = r1;
        g gVar2 = new g(cVar4, aVar5, aVar6, aVar3, dVar, hVar, cVar2, bVar, aVar4, coroutineDispatcher, aILibrarySingletonProvider);
        d(gVar);
        O2.a aVar7 = aVar3;
        c cVar5 = cVar2;
        C0489b bVar3 = bVar;
        d(new b(aVar7, cVar5, bVar3, coroutineDispatcher, aILibrarySingletonProvider));
        O2.a aVar8 = aVar3;
        CoroutineDispatcher coroutineDispatcher2 = coroutineDispatcher;
        d(new e(aVar8, cVar3, bVar2, coroutineDispatcher2));
        d(new c(aVar8, bVar2, coroutineDispatcher2));
        d(new d(aVar7, cVar5, bVar3, aVar4, coroutineDispatcher));
        d(new a(coroutineDispatcher, aVar3, dVar, hVar, cVar2, bVar, aILibrarySingletonProvider));
    }
}
