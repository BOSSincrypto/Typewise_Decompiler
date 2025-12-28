package ch.icoaching.wrio.input;

import ch.icoaching.wrio.autocorrect.c;
import kotlin.jvm.internal.o;

public final class AutocorrectOnContentChangeHandler extends m {

    /* renamed from: b  reason: collision with root package name */
    private final c f9649b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutocorrectOnContentChangeHandler(c cVar, m mVar) {
        super(mVar);
        o.e(cVar, "autocorrectionController");
        this.f9649b = cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(ch.icoaching.wrio.input.l r26, kotlin.coroutines.c r27) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            boolean r3 = r2 instanceof ch.icoaching.wrio.input.AutocorrectOnContentChangeHandler$onContentChanged$1
            if (r3 == 0) goto L_0x0019
            r3 = r2
            ch.icoaching.wrio.input.AutocorrectOnContentChangeHandler$onContentChanged$1 r3 = (ch.icoaching.wrio.input.AutocorrectOnContentChangeHandler$onContentChanged$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001e
        L_0x0019:
            ch.icoaching.wrio.input.AutocorrectOnContentChangeHandler$onContentChanged$1 r3 = new ch.icoaching.wrio.input.AutocorrectOnContentChangeHandler$onContentChanged$1
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.result
            java.lang.Object r12 = kotlin.coroutines.intrinsics.a.f()
            int r4 = r3.label
            r13 = 4
            r14 = 3
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0064
            if (r4 == r6) goto L_0x005b
            if (r4 == r5) goto L_0x004e
            if (r4 == r14) goto L_0x0045
            if (r4 != r13) goto L_0x003d
            java.lang.Object r1 = r3.L$0
            ch.icoaching.wrio.input.l r1 = (ch.icoaching.wrio.input.l) r1
            kotlin.f.b(r2)
            goto L_0x0110
        L_0x003d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0045:
            java.lang.Object r1 = r3.L$0
            ch.icoaching.wrio.input.l r1 = (ch.icoaching.wrio.input.l) r1
            kotlin.f.b(r2)
            goto L_0x00f6
        L_0x004e:
            java.lang.Object r1 = r3.L$1
            ch.icoaching.wrio.input.l r1 = (ch.icoaching.wrio.input.l) r1
            java.lang.Object r4 = r3.L$0
            ch.icoaching.wrio.input.AutocorrectOnContentChangeHandler r4 = (ch.icoaching.wrio.input.AutocorrectOnContentChangeHandler) r4
            kotlin.f.b(r2)
        L_0x0059:
            r15 = r1
            goto L_0x00bf
        L_0x005b:
            java.lang.Object r1 = r3.L$0
            ch.icoaching.wrio.input.l r1 = (ch.icoaching.wrio.input.l) r1
            kotlin.f.b(r2)
            goto L_0x0128
        L_0x0064:
            kotlin.f.b(r2)
            ch.icoaching.wrio.logging.Log r15 = ch.icoaching.wrio.logging.Log.f10572a
            r19 = 4
            r20 = 0
            java.lang.String r16 = "AutocorrectOnContentChangeHandler"
            java.lang.String r17 = "onContentChanged()"
            r18 = 0
            ch.icoaching.wrio.logging.Log.d(r15, r16, r17, r18, r19, r20)
            ch.icoaching.wrio.input.OnContentChangeEventFlags r2 = r26.g()
            ch.icoaching.wrio.input.OnContentChangeEventFlags$TriggerEventType r2 = r2.a()
            ch.icoaching.wrio.input.OnContentChangeEventFlags$TriggerEventType r4 = ch.icoaching.wrio.input.OnContentChangeEventFlags.TriggerEventType.DELETE
            if (r2 == r4) goto L_0x0117
            ch.icoaching.wrio.input.OnContentChangeEventFlags r2 = r26.g()
            ch.icoaching.wrio.input.OnContentChangeEventFlags$TriggerEventType r2 = r2.a()
            ch.icoaching.wrio.input.OnContentChangeEventFlags$TriggerEventType r4 = ch.icoaching.wrio.input.OnContentChangeEventFlags.TriggerEventType.RESTORE
            if (r2 != r4) goto L_0x0090
            goto L_0x0117
        L_0x0090:
            ch.icoaching.wrio.autocorrect.c r4 = r0.f9649b
            java.lang.String r2 = r26.e()
            java.lang.String r6 = r26.d()
            java.util.List r7 = r26.h()
            int r8 = r26.f()
            java.lang.String r9 = r26.c()
            ch.icoaching.wrio.input.OnContentChangeEventFlags r10 = r26.g()
            boolean r10 = r10.d()
            r3.L$0 = r0
            r3.L$1 = r1
            r3.label = r5
            r5 = r2
            r11 = r3
            java.lang.Object r2 = r4.i(r5, r6, r7, r8, r9, r10, r11)
            if (r2 != r12) goto L_0x00bd
            return r12
        L_0x00bd:
            r4 = r0
            goto L_0x0059
        L_0x00bf:
            ch.icoaching.wrio.input.t r2 = (ch.icoaching.wrio.input.t) r2
            r1 = 0
            if (r2 == 0) goto L_0x00fc
            java.lang.String r17 = r2.a()
            java.util.List r18 = r2.c()
            int r19 = r2.b()
            r22 = 49
            r23 = 0
            r16 = 0
            r20 = 0
            r21 = 0
            ch.icoaching.wrio.input.l r2 = ch.icoaching.wrio.input.l.a(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            ch.icoaching.wrio.input.m r4 = r4.a()
            if (r4 == 0) goto L_0x00fb
            r3.L$0 = r2
            r3.L$1 = r1
            r3.label = r14
            java.lang.Object r1 = r4.b(r2, r3)
            if (r1 != r12) goto L_0x00f1
            return r12
        L_0x00f1:
            r24 = r2
            r2 = r1
            r1 = r24
        L_0x00f6:
            ch.icoaching.wrio.input.l r2 = (ch.icoaching.wrio.input.l) r2
            if (r2 != 0) goto L_0x00fb
            r2 = r1
        L_0x00fb:
            return r2
        L_0x00fc:
            ch.icoaching.wrio.input.m r2 = r4.a()
            if (r2 == 0) goto L_0x0115
            r3.L$0 = r15
            r3.L$1 = r1
            r3.label = r13
            java.lang.Object r2 = r2.b(r15, r3)
            if (r2 != r12) goto L_0x010f
            return r12
        L_0x010f:
            r1 = r15
        L_0x0110:
            ch.icoaching.wrio.input.l r2 = (ch.icoaching.wrio.input.l) r2
            if (r2 != 0) goto L_0x0116
            r15 = r1
        L_0x0115:
            r2 = r15
        L_0x0116:
            return r2
        L_0x0117:
            ch.icoaching.wrio.input.m r2 = r25.a()
            if (r2 == 0) goto L_0x012c
            r3.L$0 = r1
            r3.label = r6
            java.lang.Object r2 = r2.b(r1, r3)
            if (r2 != r12) goto L_0x0128
            return r12
        L_0x0128:
            ch.icoaching.wrio.input.l r2 = (ch.icoaching.wrio.input.l) r2
            if (r2 != 0) goto L_0x012d
        L_0x012c:
            r2 = r1
        L_0x012d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.input.AutocorrectOnContentChangeHandler.b(ch.icoaching.wrio.input.l, kotlin.coroutines.c):java.lang.Object");
    }
}
