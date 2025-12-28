package ch.icoaching.typewise.language_modelling.language_modelling_library;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup", f = "LanguageModellingLibrarySetup.kt", l = {181, 181}, m = "preloadSentenceModels")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class LanguageModellingLibrarySetup$preloadSentenceModels$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f8627a;

    /* renamed from: b  reason: collision with root package name */
    Object f8628b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f8629c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ LanguageModellingLibrarySetup f8630d;

    /* renamed from: e  reason: collision with root package name */
    int f8631e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LanguageModellingLibrarySetup$preloadSentenceModels$1(LanguageModellingLibrarySetup languageModellingLibrarySetup, c cVar) {
        super(cVar);
        this.f8630d = languageModellingLibrarySetup;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8629c = obj;
        this.f8631e |= Integer.MIN_VALUE;
        return this.f8630d.o(this);
    }
}
