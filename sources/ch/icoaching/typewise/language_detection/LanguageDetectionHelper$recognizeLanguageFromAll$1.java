package ch.icoaching.typewise.language_detection;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.language_detection.LanguageDetectionHelper", f = "LanguageDetectionHelper.kt", l = {60, 67}, m = "recognizeLanguageFromAll")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class LanguageDetectionHelper$recognizeLanguageFromAll$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f8350a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f8351b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ LanguageDetectionHelper f8352c;

    /* renamed from: d  reason: collision with root package name */
    int f8353d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LanguageDetectionHelper$recognizeLanguageFromAll$1(LanguageDetectionHelper languageDetectionHelper, c cVar) {
        super(cVar);
        this.f8352c = languageDetectionHelper;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8351b = obj;
        this.f8353d |= Integer.MIN_VALUE;
        return this.f8352c.a((String) null, (List) null, this);
    }
}
