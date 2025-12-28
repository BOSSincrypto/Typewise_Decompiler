package ch.icoaching.typewise.language_detection;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.language_detection.LanguageDetection", f = "LanguageDetection.kt", l = {456, 478}, m = "getLanguageCounterByCountOrElseFrequency")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class LanguageDetection$getLanguageCounterByCountOrElseFrequency$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f8285a;

    /* renamed from: b  reason: collision with root package name */
    Object f8286b;

    /* renamed from: c  reason: collision with root package name */
    Object f8287c;

    /* renamed from: d  reason: collision with root package name */
    Object f8288d;

    /* renamed from: e  reason: collision with root package name */
    boolean f8289e;

    /* renamed from: f  reason: collision with root package name */
    boolean f8290f;

    /* renamed from: g  reason: collision with root package name */
    boolean f8291g;

    /* renamed from: h  reason: collision with root package name */
    /* synthetic */ Object f8292h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ LanguageDetection f8293i;

    /* renamed from: j  reason: collision with root package name */
    int f8294j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LanguageDetection$getLanguageCounterByCountOrElseFrequency$1(LanguageDetection languageDetection, c cVar) {
        super(cVar);
        this.f8293i = languageDetection;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8292h = obj;
        this.f8294j |= Integer.MIN_VALUE;
        return this.f8293i.m((List) null, (List) null, (List) null, false, false, false, this);
    }
}
