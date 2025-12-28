package ch.icoaching.typewise.autocorrection.scripts;

import B0.L;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.autocorrection.scripts.PointCorrection", f = "PointCorrection.kt", l = {948, 968}, m = "singleTriggerCorrection")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class PointCorrection$singleTriggerCorrection$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f7992a;

    /* renamed from: b  reason: collision with root package name */
    Object f7993b;

    /* renamed from: c  reason: collision with root package name */
    Object f7994c;

    /* renamed from: d  reason: collision with root package name */
    Object f7995d;

    /* renamed from: e  reason: collision with root package name */
    Object f7996e;

    /* renamed from: f  reason: collision with root package name */
    /* synthetic */ Object f7997f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ PointCorrection f7998g;

    /* renamed from: h  reason: collision with root package name */
    int f7999h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PointCorrection$singleTriggerCorrection$1(PointCorrection pointCorrection, c cVar) {
        super(cVar);
        this.f7998g = pointCorrection;
    }

    public final Object invokeSuspend(Object obj) {
        this.f7997f = obj;
        this.f7999h |= Integer.MIN_VALUE;
        return this.f7998g.G((L) null, 0, (String) null, this);
    }
}
