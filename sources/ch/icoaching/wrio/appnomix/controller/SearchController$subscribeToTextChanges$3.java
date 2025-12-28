package ch.icoaching.wrio.appnomix.controller;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.C0738g;
import kotlinx.coroutines.D;
import kotlinx.coroutines.P;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.q0;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.appnomix.controller.SearchController$subscribeToTextChanges$3", f = "SearchController.kt", l = {246}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
public final class SearchController$subscribeToTextChanges$3 extends SuspendLambda implements p {
    int label;
    final /* synthetic */ SearchController this$0;

    @d(c = "ch.icoaching.wrio.appnomix.controller.SearchController$subscribeToTextChanges$3$1", f = "SearchController.kt", l = {247}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ch.icoaching.wrio.appnomix.controller.SearchController$subscribeToTextChanges$3$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements p {
        int label;

        public final c<q> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(searchController, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object f4 = a.f();
            int i4 = this.label;
            if (i4 == 0) {
                f.b(obj);
                k h4 = searchController.f9221m;
                j jVar = new j(searchController);
                this.label = 1;
                if (h4.a(jVar, this) == f4) {
                    return f4;
                }
            } else if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                f.b(obj);
            }
            throw new KotlinNothingValueException();
        }

        public final Object invoke(D d4, c<? super q> cVar) {
            return ((AnonymousClass1) create(d4, cVar)).invokeSuspend(q.f14567a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchController$subscribeToTextChanges$3(SearchController searchController, c<? super SearchController$subscribeToTextChanges$3> cVar) {
        super(2, cVar);
        this.this$0 = searchController;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new SearchController$subscribeToTextChanges$3(this.this$0, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object f4 = a.f();
        int i4 = this.label;
        if (i4 == 0) {
            f.b(obj);
            q0 c4 = P.c();
            final SearchController searchController = this.this$0;
            AnonymousClass1 r12 = new AnonymousClass1((c<? super AnonymousClass1>) null);
            this.label = 1;
            if (C0738g.e(c4, r12, this) == f4) {
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
        return ((SearchController$subscribeToTextChanges$3) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
