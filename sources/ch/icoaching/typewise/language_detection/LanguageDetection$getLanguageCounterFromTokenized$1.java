package ch.icoaching.typewise.language_detection;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.language_detection.LanguageDetection", f = "LanguageDetection.kt", l = {378, 380}, m = "getLanguageCounterFromTokenized")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class LanguageDetection$getLanguageCounterFromTokenized$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f8295a;

    /* renamed from: b  reason: collision with root package name */
    Object f8296b;

    /* renamed from: c  reason: collision with root package name */
    Object f8297c;

    /* renamed from: d  reason: collision with root package name */
    Object f8298d;

    /* renamed from: e  reason: collision with root package name */
    boolean f8299e;

    /* renamed from: f  reason: collision with root package name */
    int f8300f;

    /* renamed from: g  reason: collision with root package name */
    /* synthetic */ Object f8301g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ LanguageDetection f8302h;

    /* renamed from: i  reason: collision with root package name */
    int f8303i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LanguageDetection$getLanguageCounterFromTokenized$1(LanguageDetection languageDetection, c cVar) {
        super(cVar);
        this.f8302h = languageDetection;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8301g = obj;
        this.f8303i |= Integer.MIN_VALUE;
        return this.f8302h.n((List) null, (List) null, false, (List) null, this);
    }
}
