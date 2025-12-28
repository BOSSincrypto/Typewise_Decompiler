package ch.icoaching.typewise.autocorrection.scripts;

import B0.L;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.autocorrection.scripts.PointCorrection", f = "PointCorrection.kt", l = {190}, m = "pointCorrection$suspendImpl")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class PointCorrection$pointCorrection$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f7983a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PointCorrection f7984b;

    /* renamed from: c  reason: collision with root package name */
    int f7985c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PointCorrection$pointCorrection$1(PointCorrection pointCorrection, c cVar) {
        super(cVar);
        this.f7984b = pointCorrection;
    }

    public final Object invokeSuspend(Object obj) {
        this.f7983a = obj;
        this.f7985c |= Integer.MIN_VALUE;
        return PointCorrection.q(this.f7984b, (L) null, 0, (String) null, this);
    }
}
