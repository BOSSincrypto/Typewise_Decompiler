package ch.icoaching.wrio.input;

import ch.icoaching.wrio.data.b;
import ch.icoaching.wrio.keyboard.B;
import kotlin.jvm.internal.o;

public final class BackToLettersOnContentChangeHandler extends m {

    /* renamed from: b  reason: collision with root package name */
    private final B f9650b;

    /* renamed from: c  reason: collision with root package name */
    private final b f9651c;

    /* renamed from: d  reason: collision with root package name */
    private int f9652d = 1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackToLettersOnContentChangeHandler(B b4, b bVar, m mVar) {
        super(mVar);
        o.e(b4, "keyboardController");
        o.e(bVar, "keyboardSettings");
        this.f9650b = b4;
        this.f9651c = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(ch.icoaching.wrio.input.l r12, kotlin.coroutines.c r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof ch.icoaching.wrio.input.BackToLettersOnContentChangeHandler$onContentChanged$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            ch.icoaching.wrio.input.BackToLettersOnContentChangeHandler$onContentChanged$1 r0 = (ch.icoaching.wrio.input.BackToLettersOnContentChangeHandler$onContentChanged$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            ch.icoaching.wrio.input.BackToLettersOnContentChangeHandler$onContentChanged$1 r0 = new ch.icoaching.wrio.input.BackToLettersOnContentChangeHandler$onContentChanged$1
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0042
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r12 = r0.L$0
            ch.icoaching.wrio.input.l r12 = (ch.icoaching.wrio.input.l) r12
            kotlin.f.b(r13)
            goto L_0x00b2
        L_0x0031:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0039:
            java.lang.Object r12 = r0.L$0
            ch.icoaching.wrio.input.l r12 = (ch.icoaching.wrio.input.l) r12
            kotlin.f.b(r13)
            goto L_0x00c9
        L_0x0042:
            kotlin.f.b(r13)
            ch.icoaching.wrio.logging.Log r5 = ch.icoaching.wrio.logging.Log.f10572a
            r9 = 4
            r10 = 0
            java.lang.String r6 = "BackToLettersOnContentChangeHandler"
            java.lang.String r7 = "onContentChanged()"
            r8 = 0
            ch.icoaching.wrio.logging.Log.d(r5, r6, r7, r8, r9, r10)
            ch.icoaching.wrio.input.OnContentChangeEventFlags r13 = r12.g()
            ch.icoaching.wrio.input.OnContentChangeEventFlags$TriggerEventType r13 = r13.a()
            ch.icoaching.wrio.input.OnContentChangeEventFlags$TriggerEventType r2 = ch.icoaching.wrio.input.OnContentChangeEventFlags.TriggerEventType.DELETE
            if (r13 == r2) goto L_0x00b8
            ch.icoaching.wrio.input.OnContentChangeEventFlags r13 = r12.g()
            ch.icoaching.wrio.input.OnContentChangeEventFlags$TriggerEventType r13 = r13.a()
            ch.icoaching.wrio.input.OnContentChangeEventFlags$TriggerEventType r2 = ch.icoaching.wrio.input.OnContentChangeEventFlags.TriggerEventType.RESTORE
            if (r13 != r2) goto L_0x006a
            goto L_0x00b8
        L_0x006a:
            ch.icoaching.wrio.data.b r13 = r11.f9651c
            boolean r13 = r13.l()
            if (r13 == 0) goto L_0x00a1
            ch.icoaching.wrio.keyboard.B r13 = r11.f9650b
            ch.icoaching.wrio.keyboard.layout.Layer r13 = r13.f()
            ch.icoaching.wrio.keyboard.layout.Layer r2 = ch.icoaching.wrio.keyboard.layout.Layer.SYMBOLS
            if (r13 == r2) goto L_0x0086
            ch.icoaching.wrio.keyboard.B r13 = r11.f9650b
            ch.icoaching.wrio.keyboard.layout.Layer r13 = r13.f()
            ch.icoaching.wrio.keyboard.layout.Layer r2 = ch.icoaching.wrio.keyboard.layout.Layer.EMOJI
            if (r13 != r2) goto L_0x00a1
        L_0x0086:
            java.lang.String r13 = r12.c()
            java.lang.String r2 = " "
            boolean r13 = kotlin.jvm.internal.o.a(r13, r2)
            if (r13 == 0) goto L_0x00a1
            int r13 = r11.f9652d
            boolean r13 = ch.icoaching.wrio.util.e.a(r13)
            if (r13 != 0) goto L_0x00a1
            ch.icoaching.wrio.keyboard.B r13 = r11.f9650b
            ch.icoaching.wrio.keyboard.layout.Layer r2 = ch.icoaching.wrio.keyboard.layout.Layer.LETTERS
            r13.y(r2)
        L_0x00a1:
            ch.icoaching.wrio.input.m r13 = r11.a()
            if (r13 == 0) goto L_0x00b6
            r0.L$0 = r12
            r0.label = r3
            java.lang.Object r13 = r13.b(r12, r0)
            if (r13 != r1) goto L_0x00b2
            return r1
        L_0x00b2:
            ch.icoaching.wrio.input.l r13 = (ch.icoaching.wrio.input.l) r13
            if (r13 != 0) goto L_0x00b7
        L_0x00b6:
            r13 = r12
        L_0x00b7:
            return r13
        L_0x00b8:
            ch.icoaching.wrio.input.m r13 = r11.a()
            if (r13 == 0) goto L_0x00cd
            r0.L$0 = r12
            r0.label = r4
            java.lang.Object r13 = r13.b(r12, r0)
            if (r13 != r1) goto L_0x00c9
            return r1
        L_0x00c9:
            ch.icoaching.wrio.input.l r13 = (ch.icoaching.wrio.input.l) r13
            if (r13 != 0) goto L_0x00ce
        L_0x00cd:
            r13 = r12
        L_0x00ce:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.input.BackToLettersOnContentChangeHandler.b(ch.icoaching.wrio.input.l, kotlin.coroutines.c):java.lang.Object");
    }

    public final void c(int i4) {
        this.f9652d = i4;
    }
}
