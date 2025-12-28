package ch.icoaching.typewise.language_modelling.language_modelling_library;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup", f = "LanguageModellingLibrarySetup.kt", l = {173, 173}, m = "preloadNNModels")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class LanguageModellingLibrarySetup$preloadNNModels$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f8622a;

    /* renamed from: b  reason: collision with root package name */
    Object f8623b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f8624c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ LanguageModellingLibrarySetup f8625d;

    /* renamed from: e  reason: collision with root package name */
    int f8626e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LanguageModellingLibrarySetup$preloadNNModels$1(LanguageModellingLibrarySetup languageModellingLibrarySetup, c cVar) {
        super(cVar);
        this.f8625d = languageModellingLibrarySetup;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8624c = obj;
        this.f8626e |= Integer.MIN_VALUE;
        return this.f8625d.m(this);
    }
}
