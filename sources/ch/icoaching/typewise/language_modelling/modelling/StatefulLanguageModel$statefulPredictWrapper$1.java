package ch.icoaching.typewise.language_modelling.modelling;

import D0.E;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.language_modelling.modelling.StatefulLanguageModel", f = "StatefulLanguageModel.kt", l = {39}, m = "statefulPredictWrapper$suspendImpl")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class StatefulLanguageModel$statefulPredictWrapper$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f8692a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ StatefulLanguageModel f8693b;

    /* renamed from: c  reason: collision with root package name */
    int f8694c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StatefulLanguageModel$statefulPredictWrapper$1(StatefulLanguageModel statefulLanguageModel, c cVar) {
        super(cVar);
        this.f8693b = statefulLanguageModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8692a = obj;
        this.f8694c |= Integer.MIN_VALUE;
        return StatefulLanguageModel.h(this.f8693b, (E) null, (List) null, this);
    }
}
