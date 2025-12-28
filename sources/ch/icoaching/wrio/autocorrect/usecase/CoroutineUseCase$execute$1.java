package ch.icoaching.wrio.autocorrect.usecase;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.C0738g;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.D;
import l2.q;
import u2.l;
import u2.p;

@d(c = "ch.icoaching.wrio.autocorrect.usecase.CoroutineUseCase$execute$1", f = "CoroutineUseCase.kt", l = {17, 21}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
final class CoroutineUseCase$execute$1 extends SuspendLambda implements p {
    final /* synthetic */ l $onResult;
    final /* synthetic */ Object $request;
    int label;
    final /* synthetic */ CoroutineUseCase this$0;

    @d(c = "ch.icoaching.wrio.autocorrect.usecase.CoroutineUseCase$execute$1$1", f = "CoroutineUseCase.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ch.icoaching.wrio.autocorrect.usecase.CoroutineUseCase$execute$1$1  reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements p {
        int label;

        public final c<q> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(lVar, obj, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            a.f();
            if (this.label == 0) {
                f.b(obj);
                lVar.invoke(obj);
                return q.f14567a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(D d4, c<? super q> cVar) {
            return ((AnonymousClass1) create(d4, cVar)).invokeSuspend(q.f14567a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoroutineUseCase$execute$1(CoroutineUseCase coroutineUseCase, Object obj, l lVar, c<? super CoroutineUseCase$execute$1> cVar) {
        super(2, cVar);
        this.this$0 = coroutineUseCase;
        this.$request = obj;
        this.$onResult = lVar;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new CoroutineUseCase$execute$1(this.this$0, this.$request, this.$onResult, cVar);
    }

    public final Object invokeSuspend(final Object obj) {
        Object f4 = a.f();
        int i4 = this.label;
        if (i4 == 0) {
            f.b(obj);
            CoroutineDispatcher b4 = this.this$0.f9316c;
            CoroutineUseCase$execute$1$result$1 coroutineUseCase$execute$1$result$1 = new CoroutineUseCase$execute$1$result$1(this.this$0, this.$request, (c<? super CoroutineUseCase$execute$1$result$1>) null);
            this.label = 1;
            obj = C0738g.e(b4, coroutineUseCase$execute$1$result$1, this);
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
        if (obj != null) {
            CoroutineDispatcher e4 = this.this$0.f9315b;
            final l lVar = this.$onResult;
            AnonymousClass1 r4 = new AnonymousClass1((c<? super AnonymousClass1>) null);
            this.label = 2;
            if (C0738g.e(e4, r4, this) == f4) {
                return f4;
            }
        }
        return q.f14567a;
    }

    public final Object invoke(D d4, c<? super q> cVar) {
        return ((CoroutineUseCase$execute$1) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
