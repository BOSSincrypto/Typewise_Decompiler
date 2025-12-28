package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.D;
import u2.l;
import u2.q;

@d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", l = {222, 355}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lkotlinx/coroutines/D;", "Lkotlinx/coroutines/flow/d;", "downstream", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;Lkotlinx/coroutines/flow/d;)V"}, k = 3, mv = {1, 6, 0})
final class FlowKt__DelayKt$debounceInternal$1 extends SuspendLambda implements q {
    final /* synthetic */ c $this_debounceInternal;
    final /* synthetic */ l $timeoutMillisSelector;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FlowKt__DelayKt$debounceInternal$1(l lVar, c cVar, c<? super FlowKt__DelayKt$debounceInternal$1> cVar2) {
        super(3, cVar2);
        this.$timeoutMillisSelector = lVar;
        this.$this_debounceInternal = cVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:8|27|28|31|32|33|(1:35)|38|40|(1:42)|(1:44)) */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d3, code lost:
        r15 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e2, code lost:
        r7.X(r15);
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c8 A[Catch:{ all -> 0x00d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f4 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r14.label
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0042
            if (r1 == r3) goto L_0x002e
            if (r1 != r2) goto L_0x0026
            java.lang.Object r1 = r14.L$3
            kotlin.jvm.internal.Ref$LongRef r1 = (kotlin.jvm.internal.Ref$LongRef) r1
            java.lang.Object r1 = r14.L$2
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
            java.lang.Object r5 = r14.L$1
            kotlinx.coroutines.channels.p r5 = (kotlinx.coroutines.channels.p) r5
            java.lang.Object r6 = r14.L$0
            kotlinx.coroutines.flow.d r6 = (kotlinx.coroutines.flow.d) r6
            kotlin.f.b(r15)
        L_0x0022:
            r7 = r6
            r6 = r5
            r5 = r1
            goto L_0x0064
        L_0x0026:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x002e:
            java.lang.Object r1 = r14.L$3
            kotlin.jvm.internal.Ref$LongRef r1 = (kotlin.jvm.internal.Ref$LongRef) r1
            java.lang.Object r5 = r14.L$2
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref$ObjectRef) r5
            java.lang.Object r6 = r14.L$1
            kotlinx.coroutines.channels.p r6 = (kotlinx.coroutines.channels.p) r6
            java.lang.Object r7 = r14.L$0
            kotlinx.coroutines.flow.d r7 = (kotlinx.coroutines.flow.d) r7
            kotlin.f.b(r15)
            goto L_0x00a6
        L_0x0042:
            kotlin.f.b(r15)
            java.lang.Object r15 = r14.L$0
            r5 = r15
            kotlinx.coroutines.D r5 = (kotlinx.coroutines.D) r5
            java.lang.Object r15 = r14.L$1
            kotlinx.coroutines.flow.d r15 = (kotlinx.coroutines.flow.d) r15
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1 r8 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1
            kotlinx.coroutines.flow.c r1 = r14.$this_debounceInternal
            r8.<init>(r1, r4)
            r9 = 3
            r10 = 0
            r6 = 0
            r7 = 0
            kotlinx.coroutines.channels.p r1 = kotlinx.coroutines.channels.ProduceKt.e(r5, r6, r7, r8, r9, r10)
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            r7 = r15
            r6 = r1
        L_0x0064:
            T r15 = r5.element
            kotlinx.coroutines.internal.y r1 = kotlinx.coroutines.flow.internal.k.f14126c
            if (r15 == r1) goto L_0x00f5
            kotlin.jvm.internal.Ref$LongRef r1 = new kotlin.jvm.internal.Ref$LongRef
            r1.<init>()
            T r15 = r5.element
            if (r15 == 0) goto L_0x00a8
            u2.l r8 = r14.$timeoutMillisSelector
            kotlinx.coroutines.internal.y r9 = kotlinx.coroutines.flow.internal.k.f14124a
            if (r15 != r9) goto L_0x007a
            r15 = r4
        L_0x007a:
            java.lang.Object r15 = r8.invoke(r15)
            java.lang.Number r15 = (java.lang.Number) r15
            long r10 = r15.longValue()
            r1.element = r10
            r12 = 0
            int r15 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r15 < 0) goto L_0x00ad
            int r15 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r15 != 0) goto L_0x00a8
            T r15 = r5.element
            if (r15 != r9) goto L_0x0095
            r15 = r4
        L_0x0095:
            r14.L$0 = r7
            r14.L$1 = r6
            r14.L$2 = r5
            r14.L$3 = r1
            r14.label = r3
            java.lang.Object r15 = r7.emit(r15, r14)
            if (r15 != r0) goto L_0x00a6
            return r0
        L_0x00a6:
            r5.element = r4
        L_0x00a8:
            r15 = r1
            r1 = r5
            r5 = r6
            r6 = r7
            goto L_0x00b5
        L_0x00ad:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Debounce timeout should not be negative"
            r15.<init>(r0)
            throw r15
        L_0x00b5:
            r14.L$0 = r6
            r14.L$1 = r5
            r14.L$2 = r1
            r14.L$3 = r15
            r14.label = r2
            kotlinx.coroutines.selects.b r7 = new kotlinx.coroutines.selects.b
            r7.<init>(r14)
            T r8 = r1.element     // Catch:{ all -> 0x00d3 }
            if (r8 == 0) goto L_0x00d5
            long r8 = r15.element     // Catch:{ all -> 0x00d3 }
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1 r15 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1     // Catch:{ all -> 0x00d3 }
            r15.<init>(r6, r1, r4)     // Catch:{ all -> 0x00d3 }
            r7.i(r8, r15)     // Catch:{ all -> 0x00d3 }
            goto L_0x00d5
        L_0x00d3:
            r15 = move-exception
            goto L_0x00e2
        L_0x00d5:
            kotlinx.coroutines.selects.c r15 = r5.i()     // Catch:{ all -> 0x00d3 }
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2 r8 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2     // Catch:{ all -> 0x00d3 }
            r8.<init>(r1, r6, r4)     // Catch:{ all -> 0x00d3 }
            r7.g(r15, r8)     // Catch:{ all -> 0x00d3 }
            goto L_0x00e5
        L_0x00e2:
            r7.X(r15)
        L_0x00e5:
            java.lang.Object r15 = r7.W()
            java.lang.Object r7 = kotlin.coroutines.intrinsics.a.f()
            if (r15 != r7) goto L_0x00f2
            kotlin.coroutines.jvm.internal.f.c(r14)
        L_0x00f2:
            if (r15 != r0) goto L_0x0022
            return r0
        L_0x00f5:
            l2.q r15 = l2.q.f14567a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(D d4, d dVar, c<? super l2.q> cVar) {
        FlowKt__DelayKt$debounceInternal$1 flowKt__DelayKt$debounceInternal$1 = new FlowKt__DelayKt$debounceInternal$1(this.$timeoutMillisSelector, this.$this_debounceInternal, cVar);
        flowKt__DelayKt$debounceInternal$1.L$0 = d4;
        flowKt__DelayKt$debounceInternal$1.L$1 = dVar;
        return flowKt__DelayKt$debounceInternal$1.invokeSuspend(l2.q.f14567a);
    }
}
