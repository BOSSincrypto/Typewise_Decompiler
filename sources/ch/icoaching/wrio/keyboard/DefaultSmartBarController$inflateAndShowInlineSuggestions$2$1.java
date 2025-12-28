package ch.icoaching.wrio.keyboard;

import Q0.f;
import ch.icoaching.wrio.keyboard.view.smartbar.SmartBarView;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.C0738g;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.keyboard.DefaultSmartBarController$inflateAndShowInlineSuggestions$2$1", f = "DefaultSmartBarController.kt", l = {356}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
final class DefaultSmartBarController$inflateAndShowInlineSuggestions$2$1 extends SuspendLambda implements p {
    final /* synthetic */ List<f> $suggestions;
    int label;
    final /* synthetic */ DefaultSmartBarController this$0;

    @d(c = "ch.icoaching.wrio.keyboard.DefaultSmartBarController$inflateAndShowInlineSuggestions$2$1$1", f = "DefaultSmartBarController.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ch.icoaching.wrio.keyboard.DefaultSmartBarController$inflateAndShowInlineSuggestions$2$1$1  reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements p {
        int label;

        public final c<q> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(defaultSmartBarController, list, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            a.f();
            if (this.label == 0) {
                kotlin.f.b(obj);
                SmartBarView D3 = defaultSmartBarController.f9945j;
                if (D3 != null) {
                    D3.M(list);
                }
                return q.f14567a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(D d4, c<? super q> cVar) {
            return ((AnonymousClass1) create(d4, cVar)).invokeSuspend(q.f14567a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultSmartBarController$inflateAndShowInlineSuggestions$2$1(DefaultSmartBarController defaultSmartBarController, List<f> list, c<? super DefaultSmartBarController$inflateAndShowInlineSuggestions$2$1> cVar) {
        super(2, cVar);
        this.this$0 = defaultSmartBarController;
        this.$suggestions = list;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new DefaultSmartBarController$inflateAndShowInlineSuggestions$2$1(this.this$0, this.$suggestions, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object f4 = a.f();
        int i4 = this.label;
        if (i4 == 0) {
            kotlin.f.b(obj);
            CoroutineDispatcher C3 = this.this$0.f9937b;
            final DefaultSmartBarController defaultSmartBarController = this.this$0;
            final List<f> list = this.$suggestions;
            AnonymousClass1 r12 = new AnonymousClass1((c<? super AnonymousClass1>) null);
            this.label = 1;
            if (C0738g.e(C3, r12, this) == f4) {
                return f4;
            }
        } else if (i4 == 1) {
            kotlin.f.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return q.f14567a;
    }

    public final Object invoke(D d4, c<? super q> cVar) {
        return ((DefaultSmartBarController$inflateAndShowInlineSuggestions$2$1) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
