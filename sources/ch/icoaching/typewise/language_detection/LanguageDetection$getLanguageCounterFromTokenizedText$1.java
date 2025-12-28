package ch.icoaching.typewise.language_detection;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.language_detection.LanguageDetection", f = "LanguageDetection.kt", l = {287}, m = "getLanguageCounterFromTokenizedText")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class LanguageDetection$getLanguageCounterFromTokenizedText$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f8304a;

    /* renamed from: b  reason: collision with root package name */
    boolean f8305b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f8306c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ LanguageDetection f8307d;

    /* renamed from: e  reason: collision with root package name */
    int f8308e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LanguageDetection$getLanguageCounterFromTokenizedText$1(LanguageDetection languageDetection, c cVar) {
        super(cVar);
        this.f8307d = languageDetection;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8306c = obj;
        this.f8308e |= Integer.MIN_VALUE;
        return this.f8307d.o((List) null, (List) null, false, false, (List) null, this);
    }
}
