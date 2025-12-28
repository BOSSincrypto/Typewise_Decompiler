package ch.icoaching.wrio.appnomix.controller;

import kotlinx.coroutines.flow.d;

public final class i implements d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SearchController f9244a;

    public i(SearchController searchController) {
        this.f9244a = searchController;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object emit(java.lang.String r8, kotlin.coroutines.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ch.icoaching.wrio.appnomix.controller.SearchController$subscribeToTextChanges$2$1$1$emit$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            ch.icoaching.wrio.appnomix.controller.SearchController$subscribeToTextChanges$2$1$1$emit$1 r0 = (ch.icoaching.wrio.appnomix.controller.SearchController$subscribeToTextChanges$2$1$1$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            ch.icoaching.wrio.appnomix.controller.SearchController$subscribeToTextChanges$2$1$1$emit$1 r0 = new ch.icoaching.wrio.appnomix.controller.SearchController$subscribeToTextChanges$2$1$1$emit$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0049
            if (r2 == r5) goto L_0x0045
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            kotlin.f.b(r9)
            goto L_0x00d6
        L_0x0031:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0039:
            java.lang.Object r8 = r0.L$1
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r2 = r0.L$0
            ch.icoaching.wrio.appnomix.controller.i r2 = (ch.icoaching.wrio.appnomix.controller.i) r2
            kotlin.f.b(r9)
            goto L_0x00ad
        L_0x0045:
            kotlin.f.b(r9)
            goto L_0x0069
        L_0x0049:
            kotlin.f.b(r9)
            int r9 = r8.length()
            r2 = 4
            if (r9 >= r2) goto L_0x006c
            ch.icoaching.wrio.appnomix.controller.SearchController r8 = r7.f9244a
            kotlinx.coroutines.CoroutineDispatcher r8 = r8.f9214f
            ch.icoaching.wrio.appnomix.controller.SearchController$subscribeToTextChanges$2$1$1$1 r9 = new ch.icoaching.wrio.appnomix.controller.SearchController$subscribeToTextChanges$2$1$1$1
            ch.icoaching.wrio.appnomix.controller.SearchController r2 = r7.f9244a
            r9.<init>(r2, r6)
            r0.label = r5
            java.lang.Object r8 = kotlinx.coroutines.C0738g.e(r8, r9, r0)
            if (r8 != r1) goto L_0x0069
            return r1
        L_0x0069:
            l2.q r8 = l2.q.f14567a
            return r8
        L_0x006c:
            ch.icoaching.wrio.appnomix.controller.SearchController r9 = r7.f9244a
            java.util.Map r9 = r9.f9227s
            boolean r9 = r9.containsKey(r8)
            if (r9 == 0) goto L_0x0099
            ch.icoaching.wrio.appnomix.controller.SearchController r9 = r7.f9244a
            java.util.Map r9 = r9.f9227s
            java.lang.Object r9 = r9.get(r8)
            kotlin.jvm.internal.o.b(r9)
            java.util.Objects.toString(r9)
            ch.icoaching.wrio.appnomix.controller.SearchController r9 = r7.f9244a
            java.util.Map r9 = r9.f9227s
            java.lang.Object r8 = r9.get(r8)
            kotlin.jvm.internal.o.b(r8)
            java.util.List r8 = (java.util.List) r8
            r2 = r7
            goto L_0x00bc
        L_0x0099:
            ch.icoaching.wrio.appnomix.controller.SearchController r9 = r7.f9244a
            ch.icoaching.wrio.appnomix.data.network.g r9 = r9.f9215g
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r9 = r9.a(r8, r0)
            if (r9 != r1) goto L_0x00ac
            return r1
        L_0x00ac:
            r2 = r7
        L_0x00ad:
            java.util.List r9 = (java.util.List) r9
            ch.icoaching.wrio.appnomix.controller.SearchController r4 = r2.f9244a
            java.util.Map r4 = r4.f9227s
            r4.put(r8, r9)
            java.util.Objects.toString(r9)
            r8 = r9
        L_0x00bc:
            ch.icoaching.wrio.appnomix.controller.SearchController r9 = r2.f9244a
            kotlinx.coroutines.CoroutineDispatcher r9 = r9.f9214f
            ch.icoaching.wrio.appnomix.controller.SearchController$subscribeToTextChanges$2$1$1$2 r4 = new ch.icoaching.wrio.appnomix.controller.SearchController$subscribeToTextChanges$2$1$1$2
            ch.icoaching.wrio.appnomix.controller.SearchController r2 = r2.f9244a
            r4.<init>(r2, r8, r6)
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r8 = kotlinx.coroutines.C0738g.e(r9, r4, r0)
            if (r8 != r1) goto L_0x00d6
            return r1
        L_0x00d6:
            l2.q r8 = l2.q.f14567a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.appnomix.controller.i.emit(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }
}
