package ch.icoaching.typewise.autocorrection.scripts;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.autocorrection.scripts.CombinationModel", f = "CombinationModel.kt", l = {45}, m = "runInference$suspendImpl")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class CombinationModel$runInference$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f7941a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CombinationModel f7942b;

    /* renamed from: c  reason: collision with root package name */
    int f7943c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CombinationModel$runInference$1(CombinationModel combinationModel, c cVar) {
        super(cVar);
        this.f7942b = combinationModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.f7941a = obj;
        this.f7943c |= Integer.MIN_VALUE;
        return CombinationModel.b(this.f7942b, (List) null, this);
    }
}
