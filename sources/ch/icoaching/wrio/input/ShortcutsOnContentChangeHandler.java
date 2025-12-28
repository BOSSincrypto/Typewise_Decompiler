package ch.icoaching.wrio.input;

import ch.icoaching.wrio.data.b;
import ch.icoaching.wrio.subscription.a;
import kotlin.jvm.internal.o;

public final class ShortcutsOnContentChangeHandler extends m {

    /* renamed from: b  reason: collision with root package name */
    private final c f9758b;

    /* renamed from: c  reason: collision with root package name */
    private final a f9759c;

    /* renamed from: d  reason: collision with root package name */
    private final b f9760d;

    /* renamed from: e  reason: collision with root package name */
    private j f9761e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShortcutsOnContentChangeHandler(c cVar, a aVar, b bVar, m mVar) {
        super(mVar);
        o.e(cVar, "inputConnectionController");
        o.e(aVar, "subscriptionChecker");
        o.e(bVar, "keyboardSettings");
        this.f9758b = cVar;
        this.f9759c = aVar;
        this.f9760d = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(ch.icoaching.wrio.input.l r18, kotlin.coroutines.c r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r2 instanceof ch.icoaching.wrio.input.ShortcutsOnContentChangeHandler$onContentChanged$1
            if (r3 == 0) goto L_0x0019
            r3 = r2
            ch.icoaching.wrio.input.ShortcutsOnContentChangeHandler$onContentChanged$1 r3 = (ch.icoaching.wrio.input.ShortcutsOnContentChangeHandler$onContentChanged$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001e
        L_0x0019:
            ch.icoaching.wrio.input.ShortcutsOnContentChangeHandler$onContentChanged$1 r3 = new ch.icoaching.wrio.input.ShortcutsOnContentChangeHandler$onContentChanged$1
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
            if (r5 == 0) goto L_0x006a
            if (r5 == r10) goto L_0x0062
            if (r5 == r9) goto L_0x005a
            if (r5 == r8) goto L_0x0051
            if (r5 == r7) goto L_0x0048
            if (r5 != r6) goto L_0x0040
            java.lang.Object r1 = r3.L$0
            ch.icoaching.wrio.input.l r1 = (ch.icoaching.wrio.input.l) r1
            kotlin.f.b(r2)
            goto L_0x0162
        L_0x0040:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0048:
            java.lang.Object r1 = r3.L$0
            ch.icoaching.wrio.input.l r1 = (ch.icoaching.wrio.input.l) r1
            kotlin.f.b(r2)
            goto L_0x0150
        L_0x0051:
            java.lang.Object r1 = r3.L$0
            ch.icoaching.wrio.input.l r1 = (ch.icoaching.wrio.input.l) r1
            kotlin.f.b(r2)
            goto L_0x0179
        L_0x005a:
            java.lang.Object r1 = r3.L$0
            ch.icoaching.wrio.input.l r1 = (ch.icoaching.wrio.input.l) r1
            kotlin.f.b(r2)
            goto L_0x00cf
        L_0x0062:
            java.lang.Object r1 = r3.L$0
            ch.icoaching.wrio.input.l r1 = (ch.icoaching.wrio.input.l) r1
            kotlin.f.b(r2)
            goto L_0x009d
        L_0x006a:
            kotlin.f.b(r2)
            ch.icoaching.wrio.logging.Log r11 = ch.icoaching.wrio.logging.Log.f10572a
            r15 = 4
            r16 = 0
            java.lang.String r12 = "ShortcutsOnContentChangeHandler"
            java.lang.String r13 = "onContentChanged()"
            r14 = 0
            ch.icoaching.wrio.logging.Log.d(r11, r12, r13, r14, r15, r16)
            java.lang.String r2 = r18.d()
            int r2 = r2.length()
            java.lang.String r5 = r18.e()
            int r5 = r5.length()
            if (r2 >= r5) goto L_0x00a3
            ch.icoaching.wrio.input.m r2 = r17.a()
            if (r2 == 0) goto L_0x00a1
            r3.L$0 = r1
            r3.label = r10
            java.lang.Object r2 = r2.b(r1, r3)
            if (r2 != r4) goto L_0x009d
            return r4
        L_0x009d:
            ch.icoaching.wrio.input.l r2 = (ch.icoaching.wrio.input.l) r2
            if (r2 != 0) goto L_0x00a2
        L_0x00a1:
            r2 = r1
        L_0x00a2:
            return r2
        L_0x00a3:
            ch.icoaching.wrio.input.j r2 = r0.f9761e
            if (r2 == 0) goto L_0x00b0
            boolean r2 = r2.c()
            if (r2 != r10) goto L_0x00b0
            java.lang.String r2 = " \n&\\+=\\.!\\?,:;\\/\\\\"
            goto L_0x00b2
        L_0x00b0:
            java.lang.String r2 = " \n&\\+=\\/\\\\-"
        L_0x00b2:
            java.lang.String r5 = r18.c()
            r10 = 0
            r11 = 0
            boolean r5 = kotlin.text.o.L(r2, r5, r10, r9, r11)
            if (r5 != 0) goto L_0x00d5
            ch.icoaching.wrio.input.m r2 = r17.a()
            if (r2 == 0) goto L_0x00d3
            r3.L$0 = r1
            r3.label = r9
            java.lang.Object r2 = r2.b(r1, r3)
            if (r2 != r4) goto L_0x00cf
            return r4
        L_0x00cf:
            ch.icoaching.wrio.input.l r2 = (ch.icoaching.wrio.input.l) r2
            if (r2 != 0) goto L_0x00d4
        L_0x00d3:
            r2 = r1
        L_0x00d4:
            return r2
        L_0x00d5:
            java.lang.String r5 = r18.d()     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x010a }
            int r9 = r18.f()     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x010a }
            java.lang.Integer r9 = kotlin.coroutines.jvm.internal.a.d(r9)     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x010a }
            java.lang.Integer r12 = kotlin.coroutines.jvm.internal.a.d(r10)     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x010a }
            java.lang.String r13 = r18.d()     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x010a }
            int r13 = r13.length()     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x010a }
            java.lang.Integer r13 = kotlin.coroutines.jvm.internal.a.d(r13)     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x010a }
            java.lang.Comparable r9 = ch.icoaching.wrio.Y.a(r9, r12, r13)     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x010a }
            java.lang.String r12 = "rangeBounds(...)"
            kotlin.jvm.internal.o.d(r9, r12)     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x010a }
            java.lang.Number r9 = (java.lang.Number) r9     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x010a }
            int r9 = r9.intValue()     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x010a }
            java.lang.String r5 = r5.substring(r10, r9)     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x010a }
            java.lang.String r9 = "substring(...)"
            kotlin.jvm.internal.o.d(r5, r9)     // Catch:{ NullPointerException | StringIndexOutOfBoundsException -> 0x010a }
            r11 = r5
        L_0x010a:
            if (r11 == 0) goto L_0x0168
            int r5 = r11.length()
            if (r5 != 0) goto L_0x0113
            goto L_0x0168
        L_0x0113:
            java.lang.String[] r5 = ch.icoaching.wrio.Y.e(r11)
            kotlin.jvm.internal.o.b(r5)
            ch.icoaching.wrio.data.b r8 = r0.f9760d
            ch.icoaching.wrio.subscription.a r9 = r0.f9759c
            java.lang.String r5 = ch.icoaching.wrio.Z.a(r5, r8, r9)
            java.lang.String r2 = d2.b.c(r5, r2)
            java.lang.String r2 = d2.b.b(r2)
            ch.icoaching.wrio.data.b r5 = r0.f9760d
            kotlin.jvm.internal.o.b(r2)
            java.lang.String r5 = r5.b(r2)
            if (r5 == 0) goto L_0x0151
            boolean r8 = kotlin.jvm.internal.o.a(r5, r2)
            if (r8 != 0) goto L_0x0151
            ch.icoaching.wrio.subscription.a r8 = r0.f9759c
            boolean r8 = r8.b()
            if (r8 == 0) goto L_0x0151
            ch.icoaching.wrio.input.c r6 = r0.f9758b
            r3.L$0 = r1
            r3.label = r7
            java.lang.Object r2 = r6.z(r2, r5, r3)
            if (r2 != r4) goto L_0x0150
            return r4
        L_0x0150:
            return r1
        L_0x0151:
            ch.icoaching.wrio.input.m r2 = r17.a()
            if (r2 == 0) goto L_0x0166
            r3.L$0 = r1
            r3.label = r6
            java.lang.Object r2 = r2.b(r1, r3)
            if (r2 != r4) goto L_0x0162
            return r4
        L_0x0162:
            ch.icoaching.wrio.input.l r2 = (ch.icoaching.wrio.input.l) r2
            if (r2 != 0) goto L_0x0167
        L_0x0166:
            r2 = r1
        L_0x0167:
            return r2
        L_0x0168:
            ch.icoaching.wrio.input.m r2 = r17.a()
            if (r2 == 0) goto L_0x017d
            r3.L$0 = r1
            r3.label = r8
            java.lang.Object r2 = r2.b(r1, r3)
            if (r2 != r4) goto L_0x0179
            return r4
        L_0x0179:
            ch.icoaching.wrio.input.l r2 = (ch.icoaching.wrio.input.l) r2
            if (r2 != 0) goto L_0x017e
        L_0x017d:
            r2 = r1
        L_0x017e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.input.ShortcutsOnContentChangeHandler.b(ch.icoaching.wrio.input.l, kotlin.coroutines.c):java.lang.Object");
    }

    public final void c(j jVar) {
        this.f9761e = jVar;
    }
}
