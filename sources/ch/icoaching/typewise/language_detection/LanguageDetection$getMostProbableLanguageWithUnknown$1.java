package ch.icoaching.typewise.language_detection;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.language_detection.LanguageDetection", f = "LanguageDetection.kt", l = {126, 143}, m = "getMostProbableLanguageWithUnknown")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class LanguageDetection$getMostProbableLanguageWithUnknown$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f8322a;

    /* renamed from: b  reason: collision with root package name */
    Object f8323b;

    /* renamed from: c  reason: collision with root package name */
    Object f8324c;

    /* renamed from: d  reason: collision with root package name */
    float f8325d;

    /* renamed from: e  reason: collision with root package name */
    float f8326e;

    /* renamed from: f  reason: collision with root package name */
    int f8327f;

    /* renamed from: g  reason: collision with root package name */
    /* synthetic */ Object f8328g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ LanguageDetection f8329h;

    /* renamed from: i  reason: collision with root package name */
    int f8330i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LanguageDetection$getMostProbableLanguageWithUnknown$1(LanguageDetection languageDetection, c cVar) {
        super(cVar);
        this.f8329h = languageDetection;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8328g = obj;
        this.f8330i |= Integer.MIN_VALUE;
        return this.f8329h.h((String) null, (List) null, false, 0.0f, 0.0f, false, 0, this);
    }
}
