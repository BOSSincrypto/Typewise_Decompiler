package ch.icoaching.typewise.language_modelling.language_modelling_library;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup", f = "LanguageModellingLibrarySetup.kt", l = {105, 106, 107}, m = "preload$suspendImpl")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class LanguageModellingLibrarySetup$preload$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f8618a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f8619b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ LanguageModellingLibrarySetup f8620c;

    /* renamed from: d  reason: collision with root package name */
    int f8621d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LanguageModellingLibrarySetup$preload$1(LanguageModellingLibrarySetup languageModellingLibrarySetup, c cVar) {
        super(cVar);
        this.f8620c = languageModellingLibrarySetup;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8619b = obj;
        this.f8621d |= Integer.MIN_VALUE;
        return LanguageModellingLibrarySetup.p(this.f8620c, this);
    }
}
