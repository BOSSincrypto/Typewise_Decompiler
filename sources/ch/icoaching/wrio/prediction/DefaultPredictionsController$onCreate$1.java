package ch.icoaching.wrio.prediction;

import ch.icoaching.typewise.AILibrary;
import ch.icoaching.typewise.AILibrarySingletonProvider;
import ch.icoaching.typewise.Predictions;
import ch.icoaching.wrio.language.e;
import ch.icoaching.wrio.subscription.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.text.o;
import kotlinx.coroutines.C0738g;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.prediction.DefaultPredictionsController$onCreate$1", f = "DefaultPredictionsController.kt", l = {54}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
final class DefaultPredictionsController$onCreate$1 extends SuspendLambda implements p {
    int label;
    final /* synthetic */ DefaultPredictionsController this$0;

    @d(c = "ch.icoaching.wrio.prediction.DefaultPredictionsController$onCreate$1$1", f = "DefaultPredictionsController.kt", l = {55, 72}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ch.icoaching.wrio.prediction.DefaultPredictionsController$onCreate$1$1  reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements p {
        int label;

        /* access modifiers changed from: private */
        public static final boolean g(ch.icoaching.wrio.language.d dVar) {
            if (o.v(dVar.c(), "user_specific", true) || o.v(dVar.c(), "de-ch", true)) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: private */
        public static final boolean h(ch.icoaching.wrio.subscription.a aVar) {
            return !aVar.b();
        }

        public final c<q> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(defaultPredictionsController, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object f4 = a.f();
            int i4 = this.label;
            if (i4 == 0) {
                f.b(obj);
                AILibrarySingletonProvider h4 = defaultPredictionsController.f10605c;
                this.label = 1;
                obj = h4.b(this);
                if (obj == f4) {
                    return f4;
                }
            } else if (i4 == 1) {
                f.b(obj);
            } else if (i4 == 2) {
                f.b(obj);
                return q.f14567a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ch.icoaching.wrio.subscription.a a4 = b.f10644a.a();
            defaultPredictionsController.f10614l = new Predictions((AILibrary) obj, e.f10625a.a(), new b(a4), new a(e.f10568a.a()));
            ch.icoaching.typewise.b o4 = defaultPredictionsController.f10614l;
            kotlin.jvm.internal.o.b(o4);
            String b4 = defaultPredictionsController.f10606d.b();
            List j4 = defaultPredictionsController.f10603a.j();
            List g4 = defaultPredictionsController.f10603a.g();
            this.label = 2;
            if (o4.f(b4, j4, g4, this) == f4) {
                return f4;
            }
            return q.f14567a;
        }

        public final Object invoke(D d4, c<? super q> cVar) {
            return ((AnonymousClass1) create(d4, cVar)).invokeSuspend(q.f14567a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultPredictionsController$onCreate$1(DefaultPredictionsController defaultPredictionsController, c<? super DefaultPredictionsController$onCreate$1> cVar) {
        super(2, cVar);
        this.this$0 = defaultPredictionsController;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new DefaultPredictionsController$onCreate$1(this.this$0, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object f4 = a.f();
        int i4 = this.label;
        if (i4 == 0) {
            f.b(obj);
            CoroutineDispatcher n4 = this.this$0.f10607e;
            final DefaultPredictionsController defaultPredictionsController = this.this$0;
            AnonymousClass1 r12 = new AnonymousClass1((c<? super AnonymousClass1>) null);
            this.label = 1;
            if (C0738g.e(n4, r12, this) == f4) {
                return f4;
            }
        } else if (i4 == 1) {
            f.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return q.f14567a;
    }

    public final Object invoke(D d4, c<? super q> cVar) {
        return ((DefaultPredictionsController$onCreate$1) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
