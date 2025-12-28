package ch.icoaching.typewise.language_detection;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.language_detection.LanguageDetection", f = "LanguageDetection.kt", l = {198}, m = "isCorrectLangFromTokenized")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class LanguageDetection$isCorrectLangFromTokenized$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    float f8336a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f8337b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ LanguageDetection f8338c;

    /* renamed from: d  reason: collision with root package name */
    int f8339d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LanguageDetection$isCorrectLangFromTokenized$1(LanguageDetection languageDetection, c cVar) {
        super(cVar);
        this.f8338c = languageDetection;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8337b = obj;
        this.f8339d |= Integer.MIN_VALUE;
        return this.f8338c.k((List) null, (String) null, 0.0f, (List) null, this);
    }
}
