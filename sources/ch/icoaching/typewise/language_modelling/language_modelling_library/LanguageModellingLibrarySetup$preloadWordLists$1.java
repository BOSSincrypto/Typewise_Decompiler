package ch.icoaching.typewise.language_modelling.language_modelling_library;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup", f = "LanguageModellingLibrarySetup.kt", l = {187, 190}, m = "preloadWordLists")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class LanguageModellingLibrarySetup$preloadWordLists$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f8632a;

    /* renamed from: b  reason: collision with root package name */
    Object f8633b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f8634c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ LanguageModellingLibrarySetup f8635d;

    /* renamed from: e  reason: collision with root package name */
    int f8636e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LanguageModellingLibrarySetup$preloadWordLists$1(LanguageModellingLibrarySetup languageModellingLibrarySetup, c cVar) {
        super(cVar);
        this.f8635d = languageModellingLibrarySetup;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8634c = obj;
        this.f8636e |= Integer.MIN_VALUE;
        return this.f8635d.q(this);
    }
}
