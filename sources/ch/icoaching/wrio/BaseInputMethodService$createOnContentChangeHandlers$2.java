package ch.icoaching.wrio;

import ch.icoaching.wrio.input.m;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class BaseInputMethodService$createOnContentChangeHandlers$2 extends m {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BaseInputMethodService f9023b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BaseInputMethodService$createOnContentChangeHandlers$2(Ref$ObjectRef ref$ObjectRef, BaseInputMethodService baseInputMethodService) {
        super((m) ref$ObjectRef.element);
        this.f9023b = baseInputMethodService;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(ch.icoaching.wrio.input.l r8, kotlin.coroutines.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ch.icoaching.wrio.BaseInputMethodService$createOnContentChangeHandlers$2$onContentChanged$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            ch.icoaching.wrio.BaseInputMethodService$createOnContentChangeHandlers$2$onContentChanged$1 r0 = (ch.icoaching.wrio.BaseInputMethodService$createOnContentChangeHandlers$2$onContentChanged$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            ch.icoaching.wrio.BaseInputMethodService$createOnContentChangeHandlers$2$onContentChanged$1 r0 = new ch.icoaching.wrio.BaseInputMethodService$createOnContentChangeHandlers$2$onContentChanged$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r8 = r0.L$0
            ch.icoaching.wrio.input.l r8 = (ch.icoaching.wrio.input.l) r8
            kotlin.f.b(r9)
            goto L_0x00f4
        L_0x002e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0036:
            kotlin.f.b(r9)
            ch.icoaching.wrio.input.OnContentChangeEventFlags r9 = r8.g()
            ch.icoaching.wrio.input.OnContentChangeEventFlags$TriggerEventType r9 = r9.a()
            ch.icoaching.wrio.input.OnContentChangeEventFlags r2 = r8.g()
            boolean r2 = r2.e()
            if (r2 == 0) goto L_0x0054
            ch.icoaching.wrio.BaseInputMethodService r2 = r7.f9023b
            ch.icoaching.wrio.ai_assistant.h r2 = r2.f8956A
            r2.b()
        L_0x0054:
            ch.icoaching.wrio.input.OnContentChangeEventFlags r2 = r8.g()
            boolean r2 = r2.e()
            if (r2 == 0) goto L_0x0083
            ch.icoaching.wrio.input.OnContentChangeEventFlags$TriggerEventType r2 = ch.icoaching.wrio.input.OnContentChangeEventFlags.TriggerEventType.CHARACTER
            if (r9 != r2) goto L_0x0083
            ch.icoaching.wrio.BaseInputMethodService r2 = r7.f9023b
            java.lang.ref.WeakReference r2 = r2.f8971P
            if (r2 == 0) goto L_0x0083
            java.lang.Object r2 = r2.get()
            ch.icoaching.wrio.u r2 = (ch.icoaching.wrio.C0556u) r2
            if (r2 == 0) goto L_0x0083
            java.lang.String r4 = r8.c()
            r5 = 0
            char r4 = r4.charAt(r5)
            int r5 = r8.f()
            int r5 = r5 - r3
            r2.a(r4, r5)
        L_0x0083:
            ch.icoaching.wrio.input.OnContentChangeEventFlags r2 = r8.g()
            boolean r2 = r2.e()
            if (r2 == 0) goto L_0x00b5
            ch.icoaching.wrio.input.OnContentChangeEventFlags$TriggerEventType r2 = ch.icoaching.wrio.input.OnContentChangeEventFlags.TriggerEventType.EMOJI
            if (r9 != r2) goto L_0x00b5
            ch.icoaching.wrio.BaseInputMethodService r2 = r7.f9023b
            java.lang.ref.WeakReference r2 = r2.f8972Q
            if (r2 == 0) goto L_0x00b5
            java.lang.Object r2 = r2.get()
            ch.icoaching.wrio.v r2 = (ch.icoaching.wrio.C0557v) r2
            if (r2 == 0) goto L_0x00b5
            java.lang.String r4 = r8.c()
            int r5 = r8.f()
            java.lang.String r6 = r8.c()
            int r6 = r6.length()
            int r5 = r5 - r6
            r2.a(r4, r5)
        L_0x00b5:
            ch.icoaching.wrio.input.OnContentChangeEventFlags$TriggerEventType r2 = ch.icoaching.wrio.input.OnContentChangeEventFlags.TriggerEventType.DELETE_DONE
            if (r9 == r2) goto L_0x00e3
            ch.icoaching.wrio.input.OnContentChangeEventFlags$TriggerEventType r2 = ch.icoaching.wrio.input.OnContentChangeEventFlags.TriggerEventType.RESTORE_DONE
            if (r9 == r2) goto L_0x00e3
            ch.icoaching.wrio.BaseInputMethodService r9 = r7.f9023b
            java.util.List r9 = r9.f8973R
            java.util.Iterator r9 = r9.iterator()
        L_0x00c7:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x00e3
            java.lang.Object r2 = r9.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r2 = r2.get()
            ch.icoaching.wrio.w r2 = (ch.icoaching.wrio.C0558w) r2
            if (r2 == 0) goto L_0x00c7
            java.lang.String r4 = r8.d()
            r2.a(r4)
            goto L_0x00c7
        L_0x00e3:
            ch.icoaching.wrio.input.m r9 = r7.a()
            if (r9 == 0) goto L_0x00f8
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r9 = r9.b(r8, r0)
            if (r9 != r1) goto L_0x00f4
            return r1
        L_0x00f4:
            ch.icoaching.wrio.input.l r9 = (ch.icoaching.wrio.input.l) r9
            if (r9 != 0) goto L_0x00f9
        L_0x00f8:
            r9 = r8
        L_0x00f9:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.BaseInputMethodService$createOnContentChangeHandlers$2.b(ch.icoaching.wrio.input.l, kotlin.coroutines.c):java.lang.Object");
    }
}
