package ch.icoaching.typewise.autocorrection.scripts;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.autocorrection.scripts.PointCorrection", f = "PointCorrection.kt", l = {1042}, m = "runFullInferenceProcedure")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class PointCorrection$runFullInferenceProcedure$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f7986a;

    /* renamed from: b  reason: collision with root package name */
    Object f7987b;

    /* renamed from: c  reason: collision with root package name */
    boolean f7988c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f7989d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ PointCorrection f7990e;

    /* renamed from: f  reason: collision with root package name */
    int f7991f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PointCorrection$runFullInferenceProcedure$1(PointCorrection pointCorrection, c cVar) {
        super(cVar);
        this.f7990e = pointCorrection;
    }

    public final Object invokeSuspend(Object obj) {
        this.f7989d = obj;
        this.f7991f |= Integer.MIN_VALUE;
        return this.f7990e.t((List) null, 0.0f, this);
    }
}
