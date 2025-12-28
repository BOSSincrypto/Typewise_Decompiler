package ch.icoaching.typewise;

import ch.icoaching.typewise.Predictions;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import z0.C0967a;

@d(c = "ch.icoaching.typewise.Predictions$Companion", f = "Predictions.kt", l = {518, 528}, m = "getTypewiseLMCapitalizationInference")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class Predictions$Companion$getTypewiseLMCapitalizationInference$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f7801a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f7802b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Predictions.Companion f7803c;

    /* renamed from: d  reason: collision with root package name */
    int f7804d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Predictions$Companion$getTypewiseLMCapitalizationInference$1(Predictions.Companion companion, c cVar) {
        super(cVar);
        this.f7803c = companion;
    }

    public final Object invokeSuspend(Object obj) {
        this.f7802b = obj;
        this.f7804d |= Integer.MIN_VALUE;
        return this.f7803c.c((String) null, (List) null, (List) null, (a) null, (C0967a) null, this);
    }
}
