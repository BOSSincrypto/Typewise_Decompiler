package ch.icoaching.wrio;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.CoroutineUtilsKt$tickerFlow$1", f = "CoroutineUtils.kt", l = {7, 9, 10}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/flow/d;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/flow/d;)V"}, k = 3, mv = {2, 0, 0})
final class CoroutineUtilsKt$tickerFlow$1 extends SuspendLambda implements p {
    final /* synthetic */ long $initialDelay;
    final /* synthetic */ long $period;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoroutineUtilsKt$tickerFlow$1(long j4, long j5, c<? super CoroutineUtilsKt$tickerFlow$1> cVar) {
        super(2, cVar);
        this.$initialDelay = j4;
        this.$period = j5;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        CoroutineUtilsKt$tickerFlow$1 coroutineUtilsKt$tickerFlow$1 = new CoroutineUtilsKt$tickerFlow$1(this.$initialDelay, this.$period, cVar);
        coroutineUtilsKt$tickerFlow$1.L$0 = obj;
        return coroutineUtilsKt$tickerFlow$1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: kotlinx.coroutines.flow.d} */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0058 A[RETURN] */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r7.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x002a
            if (r1 == r4) goto L_0x0022
            if (r1 == r3) goto L_0x001a
            if (r1 != r2) goto L_0x0012
            goto L_0x0022
        L_0x0012:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x001a:
            java.lang.Object r1 = r7.L$0
            kotlinx.coroutines.flow.d r1 = (kotlinx.coroutines.flow.d) r1
            kotlin.f.b(r8)
            goto L_0x004c
        L_0x0022:
            java.lang.Object r1 = r7.L$0
            kotlinx.coroutines.flow.d r1 = (kotlinx.coroutines.flow.d) r1
            kotlin.f.b(r8)
            goto L_0x003f
        L_0x002a:
            kotlin.f.b(r8)
            java.lang.Object r8 = r7.L$0
            r1 = r8
            kotlinx.coroutines.flow.d r1 = (kotlinx.coroutines.flow.d) r1
            long r5 = r7.$initialDelay
            r7.L$0 = r1
            r7.label = r4
            java.lang.Object r8 = kotlinx.coroutines.L.a(r5, r7)
            if (r8 != r0) goto L_0x003f
            return r0
        L_0x003f:
            l2.q r8 = l2.q.f14567a
            r7.L$0 = r1
            r7.label = r3
            java.lang.Object r8 = r1.emit(r8, r7)
            if (r8 != r0) goto L_0x004c
            return r0
        L_0x004c:
            long r4 = r7.$period
            r7.L$0 = r1
            r7.label = r2
            java.lang.Object r8 = kotlinx.coroutines.L.a(r4, r7)
            if (r8 != r0) goto L_0x003f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.CoroutineUtilsKt$tickerFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(kotlinx.coroutines.flow.d dVar, c<? super q> cVar) {
        return ((CoroutineUtilsKt$tickerFlow$1) create(dVar, cVar)).invokeSuspend(q.f14567a);
    }
}
