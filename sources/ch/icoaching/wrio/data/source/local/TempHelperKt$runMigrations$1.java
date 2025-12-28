package ch.icoaching.wrio.data.source.local;

import h2.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.C0738g;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.D;
import u2.p;

@d(c = "ch.icoaching.wrio.data.source.local.TempHelperKt$runMigrations$1", f = "TempHelper.kt", l = {23}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
final class TempHelperKt$runMigrations$1 extends SuspendLambda implements p {
    final /* synthetic */ CoroutineDispatcher $dispatcher;
    final /* synthetic */ List<q> $migrations;
    int label;

    @d(c = "ch.icoaching.wrio.data.source.local.TempHelperKt$runMigrations$1$1", f = "TempHelper.kt", l = {25, 28}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ch.icoaching.wrio.data.source.local.TempHelperKt$runMigrations$1$1  reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements p {
        Object L$0;
        int label;

        public final c<l2.q> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(list, cVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
                int r1 = r5.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0022
                if (r1 == r3) goto L_0x001e
                if (r1 != r2) goto L_0x0016
                java.lang.Object r1 = r5.L$0
                java.util.Iterator r1 = (java.util.Iterator) r1
                kotlin.f.b(r6)
                goto L_0x0036
            L_0x0016:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L_0x001e:
                kotlin.f.b(r6)
                goto L_0x0030
            L_0x0022:
                kotlin.f.b(r6)
                r5.label = r3
                r3 = 500(0x1f4, double:2.47E-321)
                java.lang.Object r6 = kotlinx.coroutines.L.a(r3, r5)
                if (r6 != r0) goto L_0x0030
                return r0
            L_0x0030:
                java.util.List<h2.q> r6 = r3
                java.util.Iterator r1 = r6.iterator()
            L_0x0036:
                boolean r6 = r1.hasNext()
                if (r6 == 0) goto L_0x004d
                java.lang.Object r6 = r1.next()
                h2.q r6 = (h2.q) r6
                r5.L$0 = r1
                r5.label = r2
                java.lang.Object r6 = r6.d(r5)
                if (r6 != r0) goto L_0x0036
                return r0
            L_0x004d:
                l2.q r6 = l2.q.f14567a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.data.source.local.TempHelperKt$runMigrations$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object invoke(D d4, c<? super l2.q> cVar) {
            return ((AnonymousClass1) create(d4, cVar)).invokeSuspend(l2.q.f14567a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TempHelperKt$runMigrations$1(CoroutineDispatcher coroutineDispatcher, List<? extends q> list, c<? super TempHelperKt$runMigrations$1> cVar) {
        super(2, cVar);
        this.$dispatcher = coroutineDispatcher;
        this.$migrations = list;
    }

    public final c<l2.q> create(Object obj, c<?> cVar) {
        return new TempHelperKt$runMigrations$1(this.$dispatcher, this.$migrations, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object f4 = a.f();
        int i4 = this.label;
        if (i4 == 0) {
            f.b(obj);
            CoroutineDispatcher coroutineDispatcher = this.$dispatcher;
            final List<q> list = this.$migrations;
            AnonymousClass1 r12 = new AnonymousClass1((c<? super AnonymousClass1>) null);
            this.label = 1;
            if (C0738g.e(coroutineDispatcher, r12, this) == f4) {
                return f4;
            }
        } else if (i4 == 1) {
            f.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return l2.q.f14567a;
    }

    public final Object invoke(D d4, c<? super l2.q> cVar) {
        return ((TempHelperKt$runMigrations$1) create(d4, cVar)).invokeSuspend(l2.q.f14567a);
    }
}
