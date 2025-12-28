package ch.icoaching.typewise.language_modelling.language_modelling_library;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup", f = "LanguageModellingLibrarySetup.kt", l = {138, 151}, m = "getCachedSentenceInference$suspendImpl")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class LanguageModellingLibrarySetup$getCachedSentenceInference$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f8613a;

    /* renamed from: b  reason: collision with root package name */
    Object f8614b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f8615c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ LanguageModellingLibrarySetup f8616d;

    /* renamed from: e  reason: collision with root package name */
    int f8617e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LanguageModellingLibrarySetup$getCachedSentenceInference$1(LanguageModellingLibrarySetup languageModellingLibrarySetup, c cVar) {
        super(cVar);
        this.f8616d = languageModellingLibrarySetup;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8615c = obj;
        this.f8617e |= Integer.MIN_VALUE;
        return LanguageModellingLibrarySetup.b(this.f8616d, (String) null, this);
    }
}
