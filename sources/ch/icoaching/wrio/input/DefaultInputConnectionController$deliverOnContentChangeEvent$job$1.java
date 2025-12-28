package ch.icoaching.wrio.input;

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
import u2.p;

@d(c = "ch.icoaching.wrio.input.DefaultInputConnectionController$deliverOnContentChangeEvent$job$1", f = "DefaultInputConnectionController.kt", l = {526}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
final class DefaultInputConnectionController$deliverOnContentChangeEvent$job$1 extends SuspendLambda implements p {
    final /* synthetic */ l $event;
    int label;
    final /* synthetic */ DefaultInputConnectionController this$0;

    @d(c = "ch.icoaching.wrio.input.DefaultInputConnectionController$deliverOnContentChangeEvent$job$1$1", f = "DefaultInputConnectionController.kt", l = {527}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ch.icoaching.wrio.input.DefaultInputConnectionController$deliverOnContentChangeEvent$job$1$1  reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements p {
        int label;

        public final c<q> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(defaultInputConnectionController, lVar, cVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
            if (r4 == null) goto L_0x0031;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
                int r1 = r3.label
                r2 = 1
                if (r1 == 0) goto L_0x0017
                if (r1 != r2) goto L_0x000f
                kotlin.f.b(r4)
                goto L_0x002d
            L_0x000f:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L_0x0017:
                kotlin.f.b(r4)
                ch.icoaching.wrio.input.DefaultInputConnectionController r4 = r3
                ch.icoaching.wrio.input.m r4 = r4.f9660C
                if (r4 == 0) goto L_0x0031
                ch.icoaching.wrio.input.l r1 = r4
                r3.label = r2
                java.lang.Object r4 = r4.b(r1, r3)
                if (r4 != r0) goto L_0x002d
                return r0
            L_0x002d:
                ch.icoaching.wrio.input.l r4 = (ch.icoaching.wrio.input.l) r4
                if (r4 != 0) goto L_0x0033
            L_0x0031:
                ch.icoaching.wrio.input.l r4 = r4
            L_0x0033:
                ch.icoaching.wrio.input.DefaultInputConnectionController r0 = r3
                java.util.List r0 = r0.f9689z
                java.util.Iterator r0 = r0.iterator()
            L_0x003d:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x004d
                java.lang.Object r1 = r0.next()
                ch.icoaching.wrio.input.n r1 = (ch.icoaching.wrio.input.n) r1
                r1.a(r4)
                goto L_0x003d
            L_0x004d:
                l2.q r4 = l2.q.f14567a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.input.DefaultInputConnectionController$deliverOnContentChangeEvent$job$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object invoke(D d4, c<? super q> cVar) {
            return ((AnonymousClass1) create(d4, cVar)).invokeSuspend(q.f14567a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultInputConnectionController$deliverOnContentChangeEvent$job$1(DefaultInputConnectionController defaultInputConnectionController, l lVar, c<? super DefaultInputConnectionController$deliverOnContentChangeEvent$job$1> cVar) {
        super(2, cVar);
        this.this$0 = defaultInputConnectionController;
        this.$event = lVar;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new DefaultInputConnectionController$deliverOnContentChangeEvent$job$1(this.this$0, this.$event, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object f4 = a.f();
        int i4 = this.label;
        if (i4 == 0) {
            f.b(obj);
            CoroutineDispatcher Q02 = this.this$0.f9666c;
            final DefaultInputConnectionController defaultInputConnectionController = this.this$0;
            final l lVar = this.$event;
            AnonymousClass1 r12 = new AnonymousClass1((c<? super AnonymousClass1>) null);
            this.label = 1;
            if (C0738g.e(Q02, r12, this) == f4) {
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
        return ((DefaultInputConnectionController$deliverOnContentChangeEvent$job$1) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
