package ch.icoaching.typewise.language_modelling.language_modelling_library;

import D0.Q;
import ch.icoaching.typewise.word_lists.c;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.C0738g;
import kotlinx.coroutines.CoroutineDispatcher;
import l2.q;
import s0.C0893c;

public final class LanguageModellingLibrary {

    /* renamed from: c  reason: collision with root package name */
    public static final a f8580c = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final a f8581a;

    /* renamed from: b  reason: collision with root package name */
    private final CoroutineDispatcher f8582b;

    public static final class a {
        private a() {
        }

        public final LanguageModellingLibrary a(C0893c cVar, CoroutineDispatcher coroutineDispatcher, c cVar2, Q q4, Integer num, Integer num2, Float f4, Map map) {
            CoroutineDispatcher coroutineDispatcher2 = coroutineDispatcher;
            o.e(cVar, "settings");
            o.e(coroutineDispatcher, "ioDispatcher");
            o.e(cVar2, "wordListRepository");
            o.e(q4, "platformDependencies");
            return new LanguageModellingLibrary(LanguageModellingLibrarySetup.f8594s.a(cVar, cVar2, q4, num, num2, f4, map), coroutineDispatcher);
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public LanguageModellingLibrary(a aVar, CoroutineDispatcher coroutineDispatcher) {
        o.e(aVar, "languageModellingLibrarySetup");
        o.e(coroutineDispatcher, "ioDispatcher");
        this.f8581a = aVar;
        this.f8582b = coroutineDispatcher;
    }

    public static /* synthetic */ Object b(LanguageModellingLibrary languageModellingLibrary, String str, List list, boolean z3, int i4, Float f4, String str2, kotlin.coroutines.c cVar, int i5, Object obj) {
        List list2;
        boolean z4;
        int i6;
        Float f5;
        String str3;
        if ((i5 & 2) != 0) {
            list2 = null;
        } else {
            list2 = list;
        }
        if ((i5 & 4) != 0) {
            z4 = false;
        } else {
            z4 = z3;
        }
        if ((i5 & 8) != 0) {
            i6 = 5;
        } else {
            i6 = i4;
        }
        if ((i5 & 16) != 0) {
            f5 = null;
        } else {
            f5 = f4;
        }
        if ((i5 & 32) != 0) {
            str3 = null;
        } else {
            str3 = str2;
        }
        return languageModellingLibrary.c(str, list2, z4, i6, f5, str3, cVar);
    }

    public final a a() {
        return this.f8581a;
    }

    public final Object c(String str, List list, boolean z3, int i4, Float f4, String str2, kotlin.coroutines.c cVar) {
        return C0738g.e(this.f8582b, new LanguageModellingLibrary$completeWord$2(this, str, list, z3, f4, i4, str2, (kotlin.coroutines.c) null), cVar);
    }

    public final Object d(kotlin.coroutines.c cVar) {
        Object d4 = this.f8581a.d(cVar);
        if (d4 == kotlin.coroutines.intrinsics.a.f()) {
            return d4;
        }
        return q.f14567a;
    }

    public final Object e(kotlin.coroutines.c cVar) {
        Object e4 = C0738g.e(this.f8582b, new LanguageModellingLibrary$preload$2(this, (kotlin.coroutines.c) null), cVar);
        return e4 == kotlin.coroutines.intrinsics.a.f() ? e4 : q.f14567a;
    }
}
