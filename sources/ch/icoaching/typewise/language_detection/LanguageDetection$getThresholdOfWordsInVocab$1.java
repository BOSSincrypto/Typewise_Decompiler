package ch.icoaching.typewise.language_detection;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.language_detection.LanguageDetection", f = "LanguageDetection.kt", l = {173}, m = "getThresholdOfWordsInVocab$suspendImpl")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class LanguageDetection$getThresholdOfWordsInVocab$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f8331a;

    /* renamed from: b  reason: collision with root package name */
    Object f8332b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f8333c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ LanguageDetection f8334d;

    /* renamed from: e  reason: collision with root package name */
    int f8335e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LanguageDetection$getThresholdOfWordsInVocab$1(LanguageDetection languageDetection, c cVar) {
        super(cVar);
        this.f8334d = languageDetection;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8333c = obj;
        this.f8335e |= Integer.MIN_VALUE;
        return LanguageDetection.d(this.f8334d, (List) null, (String) null, (List) null, this);
    }
}
