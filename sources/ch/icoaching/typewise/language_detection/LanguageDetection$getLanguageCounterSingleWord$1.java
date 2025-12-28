package ch.icoaching.typewise.language_detection;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.language_detection.LanguageDetection", f = "LanguageDetection.kt", l = {316}, m = "getLanguageCounterSingleWord")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class LanguageDetection$getLanguageCounterSingleWord$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f8309a;

    /* renamed from: b  reason: collision with root package name */
    Object f8310b;

    /* renamed from: c  reason: collision with root package name */
    Object f8311c;

    /* renamed from: d  reason: collision with root package name */
    Object f8312d;

    /* renamed from: e  reason: collision with root package name */
    Object f8313e;

    /* renamed from: f  reason: collision with root package name */
    Object f8314f;

    /* renamed from: g  reason: collision with root package name */
    boolean f8315g;

    /* renamed from: h  reason: collision with root package name */
    /* synthetic */ Object f8316h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ LanguageDetection f8317i;

    /* renamed from: j  reason: collision with root package name */
    int f8318j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LanguageDetection$getLanguageCounterSingleWord$1(LanguageDetection languageDetection, c cVar) {
        super(cVar);
        this.f8317i = languageDetection;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8316h = obj;
        this.f8318j |= Integer.MIN_VALUE;
        return this.f8317i.u((String) null, (List) null, false, this);
    }
}
