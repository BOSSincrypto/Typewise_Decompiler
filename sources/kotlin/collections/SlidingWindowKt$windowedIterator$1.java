package kotlin.collections;

import B2.g;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import l2.q;
import u2.p;

@d(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", l = {34, 40, 49, 55, 58}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "LB2/g;", "", "Ll2/q;", "<anonymous>", "(LB2/g;)V"}, k = 3, mv = {1, 9, 0})
final class SlidingWindowKt$windowedIterator$1 extends RestrictedSuspendLambda implements p {
    final /* synthetic */ Iterator<Object> $iterator;
    final /* synthetic */ boolean $partialWindows;
    final /* synthetic */ boolean $reuseBuffer;
    final /* synthetic */ int $size;
    final /* synthetic */ int $step;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SlidingWindowKt$windowedIterator$1(int i4, int i5, Iterator<Object> it, boolean z3, boolean z4, c<? super SlidingWindowKt$windowedIterator$1> cVar) {
        super(2, cVar);
        this.$size = i4;
        this.$step = i5;
        this.$iterator = it;
        this.$reuseBuffer = z3;
        this.$partialWindows = z4;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        SlidingWindowKt$windowedIterator$1 slidingWindowKt$windowedIterator$1 = new SlidingWindowKt$windowedIterator$1(this.$size, this.$step, this.$iterator, this.$reuseBuffer, this.$partialWindows, cVar);
        slidingWindowKt$windowedIterator$1.L$0 = obj;
        return slidingWindowKt$windowedIterator$1;
    }

    public final Object invoke(g gVar, c<? super q> cVar) {
        return ((SlidingWindowKt$windowedIterator$1) create(gVar, cVar)).invokeSuspend(q.f14567a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0120 A[SYNTHETIC] */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r10.label
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r1 == 0) goto L_0x0057
            if (r1 == r6) goto L_0x0044
            if (r1 == r5) goto L_0x003f
            if (r1 == r4) goto L_0x002e
            if (r1 == r3) goto L_0x0021
            if (r1 != r2) goto L_0x0019
            goto L_0x003f
        L_0x0019:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0021:
            java.lang.Object r1 = r10.L$1
            kotlin.collections.K r1 = (kotlin.collections.K) r1
            java.lang.Object r4 = r10.L$0
            B2.g r4 = (B2.g) r4
            kotlin.f.b(r11)
            goto L_0x0148
        L_0x002e:
            java.lang.Object r1 = r10.L$2
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r5 = r10.L$1
            kotlin.collections.K r5 = (kotlin.collections.K) r5
            java.lang.Object r6 = r10.L$0
            B2.g r6 = (B2.g) r6
            kotlin.f.b(r11)
            goto L_0x011a
        L_0x003f:
            kotlin.f.b(r11)
            goto L_0x0163
        L_0x0044:
            int r1 = r10.I$0
            java.lang.Object r2 = r10.L$2
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r3 = r10.L$1
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.lang.Object r4 = r10.L$0
            B2.g r4 = (B2.g) r4
            kotlin.f.b(r11)
        L_0x0055:
            r11 = r1
            goto L_0x00a5
        L_0x0057:
            kotlin.f.b(r11)
            java.lang.Object r11 = r10.L$0
            B2.g r11 = (B2.g) r11
            int r1 = r10.$size
            r8 = 1024(0x400, float:1.435E-42)
            int r1 = z2.d.d(r1, r8)
            int r8 = r10.$step
            int r9 = r10.$size
            int r8 = r8 - r9
            if (r8 < 0) goto L_0x00d8
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            java.util.Iterator<java.lang.Object> r1 = r10.$iterator
            r3 = 0
            r4 = r11
            r11 = r3
            r3 = r2
            r2 = r1
            r1 = r8
        L_0x007a:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x00b7
            java.lang.Object r8 = r2.next()
            if (r11 <= 0) goto L_0x0089
            int r11 = r11 + -1
            goto L_0x007a
        L_0x0089:
            r3.add(r8)
            int r8 = r3.size()
            int r9 = r10.$size
            if (r8 != r9) goto L_0x007a
            r10.L$0 = r4
            r10.L$1 = r3
            r10.L$2 = r2
            r10.I$0 = r1
            r10.label = r6
            java.lang.Object r11 = r4.d(r3, r10)
            if (r11 != r0) goto L_0x0055
            return r0
        L_0x00a5:
            boolean r1 = r10.$reuseBuffer
            if (r1 == 0) goto L_0x00ad
            r3.clear()
            goto L_0x00b5
        L_0x00ad:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = r10.$size
            r1.<init>(r3)
            r3 = r1
        L_0x00b5:
            r1 = r11
            goto L_0x007a
        L_0x00b7:
            boolean r11 = r3.isEmpty()
            if (r11 != 0) goto L_0x0163
            boolean r11 = r10.$partialWindows
            if (r11 != 0) goto L_0x00c9
            int r11 = r3.size()
            int r1 = r10.$size
            if (r11 != r1) goto L_0x0163
        L_0x00c9:
            r10.L$0 = r7
            r10.L$1 = r7
            r10.L$2 = r7
            r10.label = r5
            java.lang.Object r11 = r4.d(r3, r10)
            if (r11 != r0) goto L_0x0163
            return r0
        L_0x00d8:
            kotlin.collections.K r5 = new kotlin.collections.K
            r5.<init>(r1)
            java.util.Iterator<java.lang.Object> r1 = r10.$iterator
            r6 = r11
        L_0x00e0:
            boolean r11 = r1.hasNext()
            if (r11 == 0) goto L_0x0120
            java.lang.Object r11 = r1.next()
            r5.e(r11)
            boolean r11 = r5.g()
            if (r11 == 0) goto L_0x00e0
            int r11 = r5.size()
            int r8 = r10.$size
            if (r11 >= r8) goto L_0x0100
            kotlin.collections.K r5 = r5.f(r8)
            goto L_0x00e0
        L_0x0100:
            boolean r11 = r10.$reuseBuffer
            if (r11 == 0) goto L_0x0106
            r11 = r5
            goto L_0x010b
        L_0x0106:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r5)
        L_0x010b:
            r10.L$0 = r6
            r10.L$1 = r5
            r10.L$2 = r1
            r10.label = r4
            java.lang.Object r11 = r6.d(r11, r10)
            if (r11 != r0) goto L_0x011a
            return r0
        L_0x011a:
            int r11 = r10.$step
            r5.h(r11)
            goto L_0x00e0
        L_0x0120:
            boolean r11 = r10.$partialWindows
            if (r11 == 0) goto L_0x0163
            r1 = r5
            r4 = r6
        L_0x0126:
            int r11 = r1.size()
            int r5 = r10.$step
            if (r11 <= r5) goto L_0x014e
            boolean r11 = r10.$reuseBuffer
            if (r11 == 0) goto L_0x0134
            r11 = r1
            goto L_0x0139
        L_0x0134:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r1)
        L_0x0139:
            r10.L$0 = r4
            r10.L$1 = r1
            r10.L$2 = r7
            r10.label = r3
            java.lang.Object r11 = r4.d(r11, r10)
            if (r11 != r0) goto L_0x0148
            return r0
        L_0x0148:
            int r11 = r10.$step
            r1.h(r11)
            goto L_0x0126
        L_0x014e:
            boolean r11 = r1.isEmpty()
            if (r11 != 0) goto L_0x0163
            r10.L$0 = r7
            r10.L$1 = r7
            r10.L$2 = r7
            r10.label = r2
            java.lang.Object r11 = r4.d(r1, r10)
            if (r11 != r0) goto L_0x0163
            return r0
        L_0x0163:
            l2.q r11 = l2.q.f14567a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.SlidingWindowKt$windowedIterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
