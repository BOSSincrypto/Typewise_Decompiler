package ch.icoaching.typewise.language_modelling.language_modelling_library;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrary$preload$2", f = "LanguageModellingLibrary.kt", l = {18}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
final class LanguageModellingLibrary$preload$2 extends SuspendLambda implements p {

    /* renamed from: a  reason: collision with root package name */
    int f8592a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LanguageModellingLibrary f8593b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LanguageModellingLibrary$preload$2(LanguageModellingLibrary languageModellingLibrary, c cVar) {
        super(2, cVar);
        this.f8593b = languageModellingLibrary;
    }

    /* renamed from: a */
    public final Object invoke(D d4, c cVar) {
        return ((LanguageModellingLibrary$preload$2) create(d4, cVar)).invokeSuspend(q.f14567a);
    }

    public final c create(Object obj, c cVar) {
        return new LanguageModellingLibrary$preload$2(this.f8593b, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object f4 = a.f();
        int i4 = this.f8592a;
        if (i4 == 0) {
            f.b(obj);
            a a4 = this.f8593b.a();
            this.f8592a = 1;
            if (a4.f(this) == f4) {
                return f4;
            }
        } else if (i4 == 1) {
            f.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return q.f14567a;
    }
}
