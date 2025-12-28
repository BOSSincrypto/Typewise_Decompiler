package ch.icoaching.typewise;

import D0.C0266b;
import D0.f0;
import ch.icoaching.typewise.Predictions;
import ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrary;
import ch.icoaching.typewise.word_lists.b;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.typewise.Predictions$initializePredictorsHelperNotSynchronized$languageModellingLibrary$1", f = "Predictions.kt", l = {474, 486}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Lch/icoaching/typewise/language_modelling/language_modelling_library/LanguageModellingLibrary;", "<anonymous>", "(Lkotlinx/coroutines/D;)Lch/icoaching/typewise/language_modelling/language_modelling_library/LanguageModellingLibrary;"}, k = 3, mv = {2, 0, 0})
final class Predictions$initializePredictorsHelperNotSynchronized$languageModellingLibrary$1 extends SuspendLambda implements p {

    /* renamed from: a  reason: collision with root package name */
    Object f7838a;

    /* renamed from: b  reason: collision with root package name */
    int f7839b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Predictions f7840c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ f0 f7841d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ String f7842e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Predictions$initializePredictorsHelperNotSynchronized$languageModellingLibrary$1(Predictions predictions, f0 f0Var, String str, c cVar) {
        super(2, cVar);
        this.f7840c = predictions;
        this.f7841d = f0Var;
        this.f7842e = str;
    }

    /* renamed from: a */
    public final Object invoke(D d4, c cVar) {
        return ((Predictions$initializePredictorsHelperNotSynchronized$languageModellingLibrary$1) create(d4, cVar)).invokeSuspend(q.f14567a);
    }

    public final c create(Object obj, c cVar) {
        return new Predictions$initializePredictorsHelperNotSynchronized$languageModellingLibrary$1(this.f7840c, this.f7841d, this.f7842e, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object f4 = a.f();
        int i4 = this.f7839b;
        if (i4 == 0) {
            f.b(obj);
            C0266b bVar = new C0266b(this.f7840c.f7782a.a(), this.f7841d);
            Predictions.Companion companion = Predictions.f7781m;
            String str = this.f7842e;
            a h4 = this.f7840c.f7782a;
            b b4 = this.f7840c.f7783b.b(this.f7842e);
            b a4 = this.f7840c.f7783b.a(this.f7842e);
            Predictions$initializePredictorsHelperNotSynchronized$languageModellingLibrary$1$result$1 predictions$initializePredictorsHelperNotSynchronized$languageModellingLibrary$1$result$1 = new Predictions$initializePredictorsHelperNotSynchronized$languageModellingLibrary$1$result$1(this.f7840c.f7783b);
            this.f7839b = 1;
            obj = companion.b(str, h4, bVar, b4, a4, predictions$initializePredictorsHelperNotSynchronized$languageModellingLibrary$1$result$1, this);
            if (obj == f4) {
                return f4;
            }
        } else if (i4 == 1) {
            f.b(obj);
        } else if (i4 == 2) {
            LanguageModellingLibrary languageModellingLibrary = (LanguageModellingLibrary) this.f7838a;
            f.b(obj);
            return languageModellingLibrary;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        LanguageModellingLibrary languageModellingLibrary2 = (LanguageModellingLibrary) obj;
        this.f7838a = languageModellingLibrary2;
        this.f7839b = 2;
        return languageModellingLibrary2.e(this) == f4 ? f4 : languageModellingLibrary2;
    }
}
