package ch.icoaching.wrio.personalization.dynamic;

import android.graphics.PointF;
import ch.icoaching.wrio.C0552p;
import ch.icoaching.wrio.keyboard.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C0718m;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.C0738g;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.personalization.dynamic.DefaultDynamicLayoutController$loadDynamicOffsets$1", f = "DefaultDynamicLayoutController.kt", l = {42}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
final class DefaultDynamicLayoutController$loadDynamicOffsets$1 extends SuspendLambda implements p {
    int label;
    final /* synthetic */ DefaultDynamicLayoutController this$0;

    @d(c = "ch.icoaching.wrio.personalization.dynamic.DefaultDynamicLayoutController$loadDynamicOffsets$1$1", f = "DefaultDynamicLayoutController.kt", l = {45}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ch.icoaching.wrio.personalization.dynamic.DefaultDynamicLayoutController$loadDynamicOffsets$1$1  reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements p {
        int label;

        public final c<q> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(defaultDynamicLayoutController, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object f4 = a.f();
            int i4 = this.label;
            if (i4 == 0) {
                f.b(obj);
                if (defaultDynamicLayoutController.f10599k == null) {
                    CoroutineDispatcher n4 = defaultDynamicLayoutController.f10594f;
                    DefaultDynamicLayoutController$loadDynamicOffsets$1$1$loadedDynamicOffsets$1 defaultDynamicLayoutController$loadDynamicOffsets$1$1$loadedDynamicOffsets$1 = new DefaultDynamicLayoutController$loadDynamicOffsets$1$1$loadedDynamicOffsets$1(defaultDynamicLayoutController, (c<? super DefaultDynamicLayoutController$loadDynamicOffsets$1$1$loadedDynamicOffsets$1>) null);
                    this.label = 1;
                    obj = C0738g.e(n4, defaultDynamicLayoutController$loadDynamicOffsets$1$1$loadedDynamicOffsets$1, this);
                    if (obj == f4) {
                        return f4;
                    }
                }
                defaultDynamicLayoutController.f10589a.t(new ArrayList(defaultDynamicLayoutController.f10599k));
                return q.f14567a;
            } else if (i4 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List<t> list = (List) obj;
            DefaultDynamicLayoutController defaultDynamicLayoutController = defaultDynamicLayoutController;
            o.b(list);
            ArrayList arrayList = new ArrayList(C0718m.t(list, 10));
            for (t tVar : list) {
                PointF e4 = tVar.e();
                arrayList.add(t.b(tVar, 0, false, 0, new PointF(C0552p.c(e4.x), C0552p.c(e4.y)), 7, (Object) null));
            }
            defaultDynamicLayoutController.f10599k = arrayList;
            defaultDynamicLayoutController.f10589a.t(new ArrayList(defaultDynamicLayoutController.f10599k));
            return q.f14567a;
        }

        public final Object invoke(D d4, c<? super q> cVar) {
            return ((AnonymousClass1) create(d4, cVar)).invokeSuspend(q.f14567a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultDynamicLayoutController$loadDynamicOffsets$1(DefaultDynamicLayoutController defaultDynamicLayoutController, c<? super DefaultDynamicLayoutController$loadDynamicOffsets$1> cVar) {
        super(2, cVar);
        this.this$0 = defaultDynamicLayoutController;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new DefaultDynamicLayoutController$loadDynamicOffsets$1(this.this$0, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object f4 = a.f();
        int i4 = this.label;
        if (i4 == 0) {
            f.b(obj);
            CoroutineDispatcher q4 = this.this$0.f10595g;
            final DefaultDynamicLayoutController defaultDynamicLayoutController = this.this$0;
            AnonymousClass1 r12 = new AnonymousClass1((c<? super AnonymousClass1>) null);
            this.label = 1;
            if (C0738g.e(q4, r12, this) == f4) {
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
        return ((DefaultDynamicLayoutController$loadDynamicOffsets$1) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
