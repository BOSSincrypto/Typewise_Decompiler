package ch.icoaching.wrio.input;

import ch.icoaching.wrio.data.b;
import kotlin.jvm.internal.o;

public final class DotShortcutOnContentChangeHandler extends m {

    /* renamed from: b  reason: collision with root package name */
    private final c f9740b;

    /* renamed from: c  reason: collision with root package name */
    private final b f9741c;

    /* renamed from: d  reason: collision with root package name */
    private j f9742d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DotShortcutOnContentChangeHandler(c cVar, b bVar, m mVar) {
        super(mVar);
        o.e(cVar, "inputConnectionController");
        o.e(bVar, "keyboardSettings");
        this.f9740b = cVar;
        this.f9741c = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x017c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(ch.icoaching.wrio.input.l r24, kotlin.coroutines.c r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            java.lang.String r3 = "rangeBounds(...)"
            java.lang.String r4 = "substring(...)"
            boolean r5 = r2 instanceof ch.icoaching.wrio.input.DotShortcutOnContentChangeHandler$onContentChanged$1
            if (r5 == 0) goto L_0x001d
            r5 = r2
            ch.icoaching.wrio.input.DotShortcutOnContentChangeHandler$onContentChanged$1 r5 = (ch.icoaching.wrio.input.DotShortcutOnContentChangeHandler$onContentChanged$1) r5
            int r6 = r5.label
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L_0x001d
            int r6 = r6 - r7
            r5.label = r6
            goto L_0x0022
        L_0x001d:
            ch.icoaching.wrio.input.DotShortcutOnContentChangeHandler$onContentChanged$1 r5 = new ch.icoaching.wrio.input.DotShortcutOnContentChangeHandler$onContentChanged$1
            r5.<init>(r0, r2)
        L_0x0022:
            java.lang.Object r2 = r5.result
            java.lang.Object r6 = kotlin.coroutines.intrinsics.a.f()
            int r7 = r5.label
            r8 = 5
            r9 = 4
            r10 = 2
            r11 = 1
            r12 = 3
            r13 = 0
            if (r7 == 0) goto L_0x0074
            if (r7 == r11) goto L_0x006b
            if (r7 == r10) goto L_0x0063
            if (r7 == r12) goto L_0x0056
            if (r7 == r9) goto L_0x004d
            if (r7 != r8) goto L_0x0045
            java.lang.Object r1 = r5.L$0
            ch.icoaching.wrio.input.l r1 = (ch.icoaching.wrio.input.l) r1
            kotlin.f.b(r2)
            goto L_0x01be
        L_0x0045:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x004d:
            java.lang.Object r1 = r5.L$0
            ch.icoaching.wrio.input.l r1 = (ch.icoaching.wrio.input.l) r1
            kotlin.f.b(r2)
            goto L_0x01a7
        L_0x0056:
            java.lang.Object r1 = r5.L$1
            ch.icoaching.wrio.input.l r1 = (ch.icoaching.wrio.input.l) r1
            java.lang.Object r3 = r5.L$0
            ch.icoaching.wrio.input.DotShortcutOnContentChangeHandler r3 = (ch.icoaching.wrio.input.DotShortcutOnContentChangeHandler) r3
            kotlin.f.b(r2)
            goto L_0x017e
        L_0x0063:
            java.lang.Object r1 = r5.L$0
            ch.icoaching.wrio.input.l r1 = (ch.icoaching.wrio.input.l) r1
            kotlin.f.b(r2)
            goto L_0x00cb
        L_0x006b:
            java.lang.Object r1 = r5.L$0
            ch.icoaching.wrio.input.l r1 = (ch.icoaching.wrio.input.l) r1
            kotlin.f.b(r2)
            goto L_0x01d5
        L_0x0074:
            kotlin.f.b(r2)
            ch.icoaching.wrio.logging.Log r14 = ch.icoaching.wrio.logging.Log.f10572a
            r18 = 4
            r19 = 0
            java.lang.String r15 = "DotShortcutOnContentChangeHandler"
            java.lang.String r16 = "onContentChanged()"
            r17 = 0
            ch.icoaching.wrio.logging.Log.d(r14, r15, r16, r17, r18, r19)
            ch.icoaching.wrio.input.OnContentChangeEventFlags r2 = r24.g()
            ch.icoaching.wrio.input.OnContentChangeEventFlags$TriggerEventType r2 = r2.a()
            ch.icoaching.wrio.input.OnContentChangeEventFlags$TriggerEventType r7 = ch.icoaching.wrio.input.OnContentChangeEventFlags.TriggerEventType.DELETE
            if (r2 == r7) goto L_0x01c4
            ch.icoaching.wrio.input.OnContentChangeEventFlags r2 = r24.g()
            ch.icoaching.wrio.input.OnContentChangeEventFlags$TriggerEventType r2 = r2.a()
            ch.icoaching.wrio.input.OnContentChangeEventFlags$TriggerEventType r7 = ch.icoaching.wrio.input.OnContentChangeEventFlags.TriggerEventType.RESTORE
            if (r2 != r7) goto L_0x00a0
            goto L_0x01c4
        L_0x00a0:
            ch.icoaching.wrio.input.j r2 = r0.f9742d
            if (r2 == 0) goto L_0x00ad
            boolean r2 = r2.c()
            if (r2 != r11) goto L_0x00ad
            java.lang.String r2 = " \n&\\+=\\.!\\?,:;\\/\\\\"
            goto L_0x00af
        L_0x00ad:
            java.lang.String r2 = " \n&\\+=\\/\\\\-"
        L_0x00af:
            java.lang.String r7 = r24.c()
            r14 = 0
            boolean r2 = kotlin.text.o.L(r2, r7, r14, r10, r13)
            if (r2 != 0) goto L_0x00d1
            ch.icoaching.wrio.input.m r2 = r23.a()
            if (r2 == 0) goto L_0x00cf
            r5.L$0 = r1
            r5.label = r10
            java.lang.Object r2 = r2.b(r1, r5)
            if (r2 != r6) goto L_0x00cb
            return r6
        L_0x00cb:
            ch.icoaching.wrio.input.l r2 = (ch.icoaching.wrio.input.l) r2
            if (r2 != 0) goto L_0x00d0
        L_0x00cf:
            r2 = r1
        L_0x00d0:
            return r2
        L_0x00d1:
            java.lang.String r2 = r24.d()     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x0102 }
            int r7 = r24.f()     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x0102 }
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.a.d(r7)     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x0102 }
            java.lang.Integer r10 = kotlin.coroutines.jvm.internal.a.d(r14)     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x0102 }
            java.lang.String r15 = r24.d()     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x0102 }
            int r15 = r15.length()     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x0102 }
            java.lang.Integer r15 = kotlin.coroutines.jvm.internal.a.d(r15)     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x0102 }
            java.lang.Comparable r7 = ch.icoaching.wrio.Y.a(r7, r10, r15)     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x0102 }
            kotlin.jvm.internal.o.d(r7, r3)     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x0102 }
            java.lang.Number r7 = (java.lang.Number) r7     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x0102 }
            int r7 = r7.intValue()     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x0102 }
            java.lang.String r2 = r2.substring(r14, r7)     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x0102 }
            kotlin.jvm.internal.o.d(r2, r4)     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x0102 }
            goto L_0x0103
        L_0x0102:
            r2 = r13
        L_0x0103:
            ch.icoaching.wrio.data.b r7 = r0.f9741c
            boolean r7 = r7.V()
            if (r7 == 0) goto L_0x01ad
            if (r2 == 0) goto L_0x0142
            int r7 = r2.length()     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x0142 }
            int r7 = r7 - r12
            int r10 = r2.length()     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x0142 }
            java.lang.String r2 = r2.substring(r7, r10)     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x0142 }
            kotlin.jvm.internal.o.d(r2, r4)     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x0142 }
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.a.d(r11)     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x0142 }
            java.lang.Integer r10 = kotlin.coroutines.jvm.internal.a.d(r14)     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x0142 }
            int r11 = r2.length()     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x0142 }
            java.lang.Integer r11 = kotlin.coroutines.jvm.internal.a.d(r11)     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x0142 }
            java.lang.Comparable r7 = ch.icoaching.wrio.Y.a(r7, r10, r11)     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x0142 }
            kotlin.jvm.internal.o.d(r7, r3)     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x0142 }
            java.lang.Number r7 = (java.lang.Number) r7     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x0142 }
            int r3 = r7.intValue()     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x0142 }
            java.lang.String r3 = r2.substring(r3)     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x0142 }
            kotlin.jvm.internal.o.d(r3, r4)     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x0142 }
            goto L_0x0144
        L_0x0142:
            r2 = r13
            r3 = r2
        L_0x0144:
            if (r2 == 0) goto L_0x01ad
            java.lang.String r4 = "  "
            boolean r3 = kotlin.jvm.internal.o.a(r3, r4)
            if (r3 == 0) goto L_0x01ad
            int r3 = r2.length()
            if (r3 != r12) goto L_0x0164
            java.lang.String r3 = ".  "
            boolean r3 = kotlin.jvm.internal.o.a(r2, r3)
            if (r3 != 0) goto L_0x0164
            java.lang.String r3 = "   "
            boolean r3 = kotlin.jvm.internal.o.a(r2, r3)
            if (r3 == 0) goto L_0x016a
        L_0x0164:
            int r2 = r2.length()
            if (r2 >= r12) goto L_0x01ad
        L_0x016a:
            ch.icoaching.wrio.input.c r2 = r0.f9740b
            r5.L$0 = r0
            r5.L$1 = r1
            r5.label = r12
            java.lang.String r3 = " "
            java.lang.String r4 = "."
            java.lang.Object r2 = r2.z(r3, r4, r5)
            if (r2 != r6) goto L_0x017d
            return r6
        L_0x017d:
            r3 = r0
        L_0x017e:
            r16 = r2
            java.lang.String r16 = (java.lang.String) r16
            r21 = 61
            r22 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r14 = r1
            ch.icoaching.wrio.input.l r2 = ch.icoaching.wrio.input.l.a(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            ch.icoaching.wrio.input.m r3 = r3.a()
            if (r3 == 0) goto L_0x01ab
            r5.L$0 = r1
            r5.L$1 = r13
            r5.label = r9
            java.lang.Object r2 = r3.b(r2, r5)
            if (r2 != r6) goto L_0x01a7
            return r6
        L_0x01a7:
            ch.icoaching.wrio.input.l r2 = (ch.icoaching.wrio.input.l) r2
            if (r2 != 0) goto L_0x01ac
        L_0x01ab:
            r2 = r1
        L_0x01ac:
            return r2
        L_0x01ad:
            ch.icoaching.wrio.input.m r2 = r23.a()
            if (r2 == 0) goto L_0x01c2
            r5.L$0 = r1
            r5.label = r8
            java.lang.Object r2 = r2.b(r1, r5)
            if (r2 != r6) goto L_0x01be
            return r6
        L_0x01be:
            ch.icoaching.wrio.input.l r2 = (ch.icoaching.wrio.input.l) r2
            if (r2 != 0) goto L_0x01c3
        L_0x01c2:
            r2 = r1
        L_0x01c3:
            return r2
        L_0x01c4:
            ch.icoaching.wrio.input.m r2 = r23.a()
            if (r2 == 0) goto L_0x01d9
            r5.L$0 = r1
            r5.label = r11
            java.lang.Object r2 = r2.b(r1, r5)
            if (r2 != r6) goto L_0x01d5
            return r6
        L_0x01d5:
            ch.icoaching.wrio.input.l r2 = (ch.icoaching.wrio.input.l) r2
            if (r2 != 0) goto L_0x01da
        L_0x01d9:
            r2 = r1
        L_0x01da:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.input.DotShortcutOnContentChangeHandler.b(ch.icoaching.wrio.input.l, kotlin.coroutines.c):java.lang.Object");
    }

    public final void c(j jVar) {
        this.f9742d = jVar;
    }
}
