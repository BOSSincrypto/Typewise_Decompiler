package ch.icoaching.typewise;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.Predictions", f = "Predictions.kt", l = {465, 471}, m = "initializePredictorsHelperNotSynchronized")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class Predictions$initializePredictorsHelperNotSynchronized$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f7831a;

    /* renamed from: b  reason: collision with root package name */
    Object f7832b;

    /* renamed from: c  reason: collision with root package name */
    Object f7833c;

    /* renamed from: d  reason: collision with root package name */
    Object f7834d;

    /* renamed from: e  reason: collision with root package name */
    /* synthetic */ Object f7835e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ Predictions f7836f;

    /* renamed from: g  reason: collision with root package name */
    int f7837g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Predictions$initializePredictorsHelperNotSynchronized$1(Predictions predictions, c cVar) {
        super(cVar);
        this.f7836f = predictions;
    }

    public final Object invokeSuspend(Object obj) {
        this.f7835e = obj;
        this.f7837g |= Integer.MIN_VALUE;
        return this.f7836f.y((String) null, (List) null, (List) null, this);
    }
}
