package ch.icoaching.wrio.input;

import kotlin.jvm.internal.o;

public final class AutoSpaceOnContentChangeHandler extends m {

    /* renamed from: b  reason: collision with root package name */
    private final c f9647b;

    /* renamed from: c  reason: collision with root package name */
    private j f9648c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutoSpaceOnContentChangeHandler(c cVar, m mVar) {
        super(mVar);
        o.e(cVar, "inputConnectionController");
        this.f9647b = cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(ch.icoaching.wrio.input.l r22, kotlin.coroutines.c r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            boolean r3 = r2 instanceof ch.icoaching.wrio.input.AutoSpaceOnContentChangeHandler$onContentChanged$1
            if (r3 == 0) goto L_0x0019
            r3 = r2
            ch.icoaching.wrio.input.AutoSpaceOnContentChangeHandler$onContentChanged$1 r3 = (ch.icoaching.wrio.input.AutoSpaceOnContentChangeHandler$onContentChanged$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001e
        L_0x0019:
            ch.icoaching.wrio.input.AutoSpaceOnContentChangeHandler$onContentChanged$1 r3 = new ch.icoaching.wrio.input.AutoSpaceOnContentChangeHandler$onContentChanged$1
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.a.f()
            int r5 = r3.label
            r6 = 5
            r7 = 4
            r8 = 3
            r9 = 2
            r10 = 1
            r11 = 0
            if (r5 == 0) goto L_0x0071
            if (r5 == r10) goto L_0x0068
            if (r5 == r9) goto L_0x0060
            if (r5 == r8) goto L_0x0052
            if (r5 == r7) goto L_0x0049
            if (r5 != r6) goto L_0x0041
            java.lang.Object r1 = r3.L$0
            ch.icoaching.wrio.input.l r1 = (ch.icoaching.wrio.input.l) r1
            kotlin.f.b(r2)
            goto L_0x0171
        L_0x0041:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0049:
            java.lang.Object r1 = r3.L$0
            ch.icoaching.wrio.input.l r1 = (ch.icoaching.wrio.input.l) r1
            kotlin.f.b(r2)
            goto L_0x0155
        L_0x0052:
            java.lang.Object r1 = r3.L$1
            ch.icoaching.wrio.input.l r1 = (ch.icoaching.wrio.input.l) r1
            java.lang.Object r5 = r3.L$0
            ch.icoaching.wrio.input.AutoSpaceOnContentChangeHandler r5 = (ch.icoaching.wrio.input.AutoSpaceOnContentChangeHandler) r5
            kotlin.f.b(r2)
        L_0x005d:
            r12 = r1
            goto L_0x0125
        L_0x0060:
            java.lang.Object r1 = r3.L$0
            ch.icoaching.wrio.input.l r1 = (ch.icoaching.wrio.input.l) r1
            kotlin.f.b(r2)
            goto L_0x00ba
        L_0x0068:
            java.lang.Object r1 = r3.L$0
            ch.icoaching.wrio.input.l r1 = (ch.icoaching.wrio.input.l) r1
            kotlin.f.b(r2)
            goto L_0x0188
        L_0x0071:
            kotlin.f.b(r2)
            ch.icoaching.wrio.logging.Log r12 = ch.icoaching.wrio.logging.Log.f10572a
            r16 = 4
            r17 = 0
            java.lang.String r13 = "AutoSpaceOnContentChangeHandler"
            java.lang.String r14 = "onContentChanged()"
            r15 = 0
            ch.icoaching.wrio.logging.Log.d(r12, r13, r14, r15, r16, r17)
            ch.icoaching.wrio.input.OnContentChangeEventFlags r2 = r22.g()
            ch.icoaching.wrio.input.OnContentChangeEventFlags$TriggerEventType r2 = r2.a()
            ch.icoaching.wrio.input.OnContentChangeEventFlags$TriggerEventType r5 = ch.icoaching.wrio.input.OnContentChangeEventFlags.TriggerEventType.DELETE
            if (r2 == r5) goto L_0x0177
            ch.icoaching.wrio.input.OnContentChangeEventFlags r2 = r22.g()
            ch.icoaching.wrio.input.OnContentChangeEventFlags$TriggerEventType r2 = r2.a()
            ch.icoaching.wrio.input.OnContentChangeEventFlags$TriggerEventType r5 = ch.icoaching.wrio.input.OnContentChangeEventFlags.TriggerEventType.RESTORE
            if (r2 != r5) goto L_0x009c
            goto L_0x0177
        L_0x009c:
            java.lang.String r2 = r22.c()
            java.lang.String r5 = ".,:'?!\"»)]}"
            r12 = 0
            boolean r2 = kotlin.text.o.L(r5, r2, r12, r9, r11)
            if (r2 != 0) goto L_0x00c0
            ch.icoaching.wrio.input.m r2 = r21.a()
            if (r2 == 0) goto L_0x00be
            r3.L$0 = r1
            r3.label = r9
            java.lang.Object r2 = r2.b(r1, r3)
            if (r2 != r4) goto L_0x00ba
            return r4
        L_0x00ba:
            ch.icoaching.wrio.input.l r2 = (ch.icoaching.wrio.input.l) r2
            if (r2 != 0) goto L_0x00bf
        L_0x00be:
            r2 = r1
        L_0x00bf:
            return r2
        L_0x00c0:
            int r2 = r22.f()     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x00fe }
            java.lang.String r5 = r22.c()     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x00fe }
            int r5 = r5.length()     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x00fe }
            int r2 = r2 - r5
            java.lang.String r5 = r22.e()     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x00fe }
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.a.d(r2)     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x00fe }
            java.lang.Integer r9 = kotlin.coroutines.jvm.internal.a.d(r12)     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x00fe }
            java.lang.String r13 = r22.e()     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x00fe }
            int r13 = r13.length()     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x00fe }
            java.lang.Integer r13 = kotlin.coroutines.jvm.internal.a.d(r13)     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x00fe }
            java.lang.Comparable r2 = ch.icoaching.wrio.Y.a(r2, r9, r13)     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x00fe }
            java.lang.String r9 = "rangeBounds(...)"
            kotlin.jvm.internal.o.d(r2, r9)     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x00fe }
            java.lang.Number r2 = (java.lang.Number) r2     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x00fe }
            int r2 = r2.intValue()     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x00fe }
            java.lang.String r2 = r5.substring(r12, r2)     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x00fe }
            java.lang.String r5 = "substring(...)"
            kotlin.jvm.internal.o.d(r2, r5)     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x00fe }
            goto L_0x00ff
        L_0x00fe:
            r2 = r11
        L_0x00ff:
            ch.icoaching.wrio.input.OnContentChangeEventFlags r5 = r22.g()
            ch.icoaching.wrio.input.OnContentChangeEventFlags$TriggerEventType r5 = r5.a()
            ch.icoaching.wrio.input.OnContentChangeEventFlags$TriggerEventType r9 = ch.icoaching.wrio.input.OnContentChangeEventFlags.TriggerEventType.CHARACTER
            if (r5 != r9) goto L_0x010c
            goto L_0x010d
        L_0x010c:
            r10 = r12
        L_0x010d:
            if (r2 == 0) goto L_0x015d
            ch.icoaching.wrio.input.c r5 = r0.f9647b
            java.lang.String r9 = r22.c()
            r3.L$0 = r0
            r3.L$1 = r1
            r3.label = r8
            java.lang.Object r2 = r5.x(r2, r9, r10, r3)
            if (r2 != r4) goto L_0x0122
            return r4
        L_0x0122:
            r5 = r0
            goto L_0x005d
        L_0x0125:
            ch.icoaching.wrio.input.t r2 = (ch.icoaching.wrio.input.t) r2
            if (r2 == 0) goto L_0x015b
            java.lang.String r14 = r2.a()
            java.util.List r15 = r2.c()
            int r16 = r2.b()
            r19 = 49
            r20 = 0
            r13 = 0
            r17 = 0
            r18 = 0
            ch.icoaching.wrio.input.l r1 = ch.icoaching.wrio.input.l.a(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            ch.icoaching.wrio.input.m r2 = r5.a()
            if (r2 == 0) goto L_0x0159
            r3.L$0 = r1
            r3.L$1 = r11
            r3.label = r7
            java.lang.Object r2 = r2.b(r1, r3)
            if (r2 != r4) goto L_0x0155
            return r4
        L_0x0155:
            ch.icoaching.wrio.input.l r2 = (ch.icoaching.wrio.input.l) r2
            if (r2 != 0) goto L_0x015a
        L_0x0159:
            r2 = r1
        L_0x015a:
            return r2
        L_0x015b:
            r1 = r12
            goto L_0x015e
        L_0x015d:
            r5 = r0
        L_0x015e:
            ch.icoaching.wrio.input.m r2 = r5.a()
            if (r2 == 0) goto L_0x0175
            r3.L$0 = r1
            r3.L$1 = r11
            r3.label = r6
            java.lang.Object r2 = r2.b(r1, r3)
            if (r2 != r4) goto L_0x0171
            return r4
        L_0x0171:
            ch.icoaching.wrio.input.l r2 = (ch.icoaching.wrio.input.l) r2
            if (r2 != 0) goto L_0x0176
        L_0x0175:
            r2 = r1
        L_0x0176:
            return r2
        L_0x0177:
            ch.icoaching.wrio.input.m r2 = r21.a()
            if (r2 == 0) goto L_0x018c
            r3.L$0 = r1
            r3.label = r10
            java.lang.Object r2 = r2.b(r1, r3)
            if (r2 != r4) goto L_0x0188
            return r4
        L_0x0188:
            ch.icoaching.wrio.input.l r2 = (ch.icoaching.wrio.input.l) r2
            if (r2 != 0) goto L_0x018d
        L_0x018c:
            r2 = r1
        L_0x018d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.input.AutoSpaceOnContentChangeHandler.b(ch.icoaching.wrio.input.l, kotlin.coroutines.c):java.lang.Object");
    }

    public final void c(j jVar) {
        this.f9648c = jVar;
    }
}
