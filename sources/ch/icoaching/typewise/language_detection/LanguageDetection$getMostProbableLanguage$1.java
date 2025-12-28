package ch.icoaching.typewise.language_detection;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.language_detection.LanguageDetection", f = "LanguageDetection.kt", l = {79}, m = "getMostProbableLanguage")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class LanguageDetection$getMostProbableLanguage$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f8319a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LanguageDetection f8320b;

    /* renamed from: c  reason: collision with root package name */
    int f8321c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LanguageDetection$getMostProbableLanguage$1(LanguageDetection languageDetection, c cVar) {
        super(cVar);
        this.f8320b = languageDetection;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8319a = obj;
        this.f8321c |= Integer.MIN_VALUE;
        return this.f8320b.j((String) null, (List) null, false, false, false, this);
    }
}
