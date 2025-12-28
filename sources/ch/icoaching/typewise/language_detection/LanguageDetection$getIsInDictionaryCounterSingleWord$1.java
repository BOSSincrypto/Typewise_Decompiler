package ch.icoaching.typewise.language_detection;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.language_detection.LanguageDetection", f = "LanguageDetection.kt", l = {353}, m = "getIsInDictionaryCounterSingleWord")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class LanguageDetection$getIsInDictionaryCounterSingleWord$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f8276a;

    /* renamed from: b  reason: collision with root package name */
    Object f8277b;

    /* renamed from: c  reason: collision with root package name */
    Object f8278c;

    /* renamed from: d  reason: collision with root package name */
    Object f8279d;

    /* renamed from: e  reason: collision with root package name */
    Object f8280e;

    /* renamed from: f  reason: collision with root package name */
    boolean f8281f;

    /* renamed from: g  reason: collision with root package name */
    /* synthetic */ Object f8282g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ LanguageDetection f8283h;

    /* renamed from: i  reason: collision with root package name */
    int f8284i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LanguageDetection$getIsInDictionaryCounterSingleWord$1(LanguageDetection languageDetection, c cVar) {
        super(cVar);
        this.f8283h = languageDetection;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8282g = obj;
        this.f8284i |= Integer.MIN_VALUE;
        return this.f8283h.i((String) null, (List) null, false, this);
    }
}
