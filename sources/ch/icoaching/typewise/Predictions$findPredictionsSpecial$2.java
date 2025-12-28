package ch.icoaching.typewise;

import E0.s;
import ch.icoaching.typewise.predictions.PredictionsResult;
import ch.icoaching.typewise.text.TypewiseInputType;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.collections.C0718m;
import kotlin.collections.L;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.D;
import kotlinx.coroutines.g0;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.typewise.Predictions$findPredictionsSpecial$2", f = "Predictions.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Lch/icoaching/typewise/predictions/PredictionsResult;", "<anonymous>", "(Lkotlinx/coroutines/D;)Lch/icoaching/typewise/predictions/PredictionsResult;"}, k = 3, mv = {2, 0, 0})
final class Predictions$findPredictionsSpecial$2 extends SuspendLambda implements p {

    /* renamed from: a  reason: collision with root package name */
    int f7826a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f7827b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f7828c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ TypewiseInputType f7829d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Predictions f7830e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Predictions$findPredictionsSpecial$2(String str, TypewiseInputType typewiseInputType, Predictions predictions, c cVar) {
        super(2, cVar);
        this.f7828c = str;
        this.f7829d = typewiseInputType;
        this.f7830e = predictions;
    }

    /* renamed from: a */
    public final Object invoke(D d4, c cVar) {
        return ((Predictions$findPredictionsSpecial$2) create(d4, cVar)).invokeSuspend(q.f14567a);
    }

    public final c create(Object obj, c cVar) {
        Predictions$findPredictionsSpecial$2 predictions$findPredictionsSpecial$2 = new Predictions$findPredictionsSpecial$2(this.f7828c, this.f7829d, this.f7830e, cVar);
        predictions$findPredictionsSpecial$2.f7827b = obj;
        return predictions$findPredictionsSpecial$2;
    }

    public final Object invokeSuspend(Object obj) {
        a.f();
        if (this.f7826a == 0) {
            f.b(obj);
            D d4 = (D) this.f7827b;
            String a4 = s.k(this.f7828c, "", 60).a();
            e eVar = e.f8233a;
            TypewiseInputType typewiseInputType = this.f7829d;
            e.b(eVar, "Predictions", "findPredictionsSpecial() :: Before: '" + a4 + "', type = " + typewiseInputType, (Throwable) null, 4, (Object) null);
            if (!this.f7830e.f7792k) {
                return new PredictionsResult(C0718m.j(), L.e());
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            g0 g0Var = (g0) d4.g().get(g0.f14139t);
            if (g0Var != null && g0Var.isCancelled()) {
                return new PredictionsResult(C0718m.j(), L.e());
            }
            for (String str : this.f7830e.f7787f.b(a4, this.f7829d)) {
                if (!this.f7830e.z(str) && linkedHashSet.size() != 60) {
                    linkedHashSet.add(str);
                    PredictionsResult.Candidate candidate = new PredictionsResult.Candidate(str, -1.0f, -1.0f, a4.length(), PredictionsResult.Candidate.Type.SPECIAL_FIELD_PREDICTION, PredictionsResult.Candidate.Source.SPECIAL_PREDICTION, "", this.f7830e.A(linkedHashSet));
                    if (!candidate.h() || !((Boolean) this.f7830e.f7784c.invoke()).booleanValue()) {
                        arrayList2.add(candidate);
                    } else {
                        arrayList.add(candidate);
                    }
                }
            }
            g0 g0Var2 = (g0) d4.g().get(g0.f14139t);
            if (g0Var2 != null && g0Var2.isCancelled()) {
                return new PredictionsResult(arrayList2, L.e());
            }
            PredictionsResult unused = this.f7830e.x(arrayList2, arrayList, new LinkedHashSet());
            return new PredictionsResult(arrayList2, L.e());
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
