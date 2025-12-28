package ch.icoaching.wrio.input;

import ch.icoaching.wrio.input.DefaultInputConnectionController;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.input.DefaultInputConnectionController$processDeleteInputEvent$2", f = "DefaultInputConnectionController.kt", l = {827, 829, 851, 857}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
final class DefaultInputConnectionController$processDeleteInputEvent$2 extends SuspendLambda implements p {
    final /* synthetic */ DefaultInputConnectionController.a.c $inputEvent;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DefaultInputConnectionController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultInputConnectionController$processDeleteInputEvent$2(DefaultInputConnectionController defaultInputConnectionController, DefaultInputConnectionController.a.c cVar, c<? super DefaultInputConnectionController$processDeleteInputEvent$2> cVar2) {
        super(2, cVar2);
        this.this$0 = defaultInputConnectionController;
        this.$inputEvent = cVar;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new DefaultInputConnectionController$processDeleteInputEvent$2(this.this$0, this.$inputEvent, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0195  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 0
            r8 = 1
            if (r2 == 0) goto L_0x0062
            if (r2 == r8) goto L_0x004c
            if (r2 == r6) goto L_0x0036
            if (r2 == r5) goto L_0x0025
            if (r2 != r4) goto L_0x001d
            kotlin.f.b(r21)
            goto L_0x0192
        L_0x001d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0025:
            java.lang.Object r2 = r0.L$1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r5 = r0.L$0
            java.lang.String r5 = (java.lang.String) r5
            kotlin.f.b(r21)
            r14 = r2
            r10 = r5
            r5 = r21
            goto L_0x0165
        L_0x0036:
            int r2 = r0.I$1
            int r6 = r0.I$0
            java.lang.Object r9 = r0.L$1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r0.L$0
            android.view.inputmethod.InputConnection r10 = (android.view.inputmethod.InputConnection) r10
            kotlin.f.b(r21)
            r11 = r10
            r10 = r9
            r9 = r6
            r6 = r21
            goto L_0x011f
        L_0x004c:
            int r2 = r0.I$1
            int r6 = r0.I$0
            java.lang.Object r9 = r0.L$1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r0.L$0
            android.view.inputmethod.InputConnection r10 = (android.view.inputmethod.InputConnection) r10
            kotlin.f.b(r21)
            r11 = r10
            r10 = r9
            r9 = r6
            r6 = r21
            goto L_0x00f3
        L_0x0062:
            kotlin.f.b(r21)
            ch.icoaching.wrio.input.DefaultInputConnectionController r2 = r0.this$0
            java.util.List r2 = r2.f9658A
            java.util.Iterator r2 = r2.iterator()
        L_0x006f:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L_0x007f
            java.lang.Object r9 = r2.next()
            kotlinx.coroutines.g0 r9 = (kotlinx.coroutines.g0) r9
            kotlinx.coroutines.g0.a.a(r9, r7, r8, r7)
            goto L_0x006f
        L_0x007f:
            ch.icoaching.wrio.input.DefaultInputConnectionController r2 = r0.this$0
            java.util.List r2 = r2.f9658A
            r2.clear()
            ch.icoaching.wrio.input.DefaultInputConnectionController r2 = r0.this$0
            android.view.inputmethod.InputConnection r10 = r2.f9661D
            if (r10 != 0) goto L_0x0093
            l2.q r1 = l2.q.f14567a
            return r1
        L_0x0093:
            ch.icoaching.wrio.logging.Log r11 = ch.icoaching.wrio.logging.Log.f10572a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r9 = "processDeleteInputEvent() :: "
            r2.append(r9)
            ch.icoaching.wrio.input.DefaultInputConnectionController$a$c r9 = r0.$inputEvent
            int r9 = r9.a()
            r2.append(r9)
            java.lang.String r13 = r2.toString()
            r15 = 4
            r16 = 0
            java.lang.String r12 = "DefaultInputConnectionController"
            r14 = 0
            ch.icoaching.wrio.logging.Log.d(r11, r12, r13, r14, r15, r16)
            ch.icoaching.wrio.input.DefaultInputConnectionController r2 = r0.this$0
            ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState r2 = r2.f9659B
            java.lang.String r9 = r2.f()
            ch.icoaching.wrio.input.DefaultInputConnectionController r2 = r0.this$0
            ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState r2 = r2.f9659B
            int r2 = r2.i()
            ch.icoaching.wrio.input.DefaultInputConnectionController r11 = r0.this$0
            ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState r11 = r11.f9659B
            int r11 = r11.h()
            if (r2 == r11) goto L_0x00fb
            ch.icoaching.wrio.input.DefaultInputConnectionController r6 = r0.this$0
            ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState r6 = r6.f9659B
            r0.L$0 = r10
            r0.L$1 = r9
            r0.I$0 = r2
            r0.I$1 = r11
            r0.label = r8
            java.lang.Object r6 = r6.e(r0)
            if (r6 != r1) goto L_0x00ec
            return r1
        L_0x00ec:
            r19 = r9
            r9 = r2
            r2 = r11
            r11 = r10
            r10 = r19
        L_0x00f3:
            java.lang.String r6 = (java.lang.String) r6
        L_0x00f5:
            r19 = r6
            r6 = r2
            r2 = r19
            goto L_0x0122
        L_0x00fb:
            ch.icoaching.wrio.input.DefaultInputConnectionController r12 = r0.this$0
            ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState r12 = r12.f9659B
            ch.icoaching.wrio.input.DefaultInputConnectionController$a$c r13 = r0.$inputEvent
            int r13 = r13.a()
            r0.L$0 = r10
            r0.L$1 = r9
            r0.I$0 = r2
            r0.I$1 = r11
            r0.label = r6
            java.lang.Object r6 = r12.c(r13, r0)
            if (r6 != r1) goto L_0x0118
            return r1
        L_0x0118:
            r19 = r9
            r9 = r2
            r2 = r11
            r11 = r10
            r10 = r19
        L_0x011f:
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x00f5
        L_0x0122:
            int r12 = r2.length()
            if (r12 != 0) goto L_0x013d
            ch.icoaching.wrio.logging.Log r13 = ch.icoaching.wrio.logging.Log.f10572a
            r17 = 4
            r18 = 0
            java.lang.String r14 = "DefaultInputConnectionController"
            java.lang.String r15 = "processDeleteInputEvent() :: nothing deleted, sending delete clicked key event"
            r16 = 0
            ch.icoaching.wrio.logging.Log.d(r13, r14, r15, r16, r17, r18)
            ch.icoaching.wrio.input.f.n(r11)
            l2.q r1 = l2.q.f14567a
            return r1
        L_0x013d:
            r11.beginBatchEdit()
            r11.finishComposingText()
            if (r9 == r6) goto L_0x014b
            java.lang.String r6 = ""
            r11.commitText(r6, r8)
            goto L_0x0152
        L_0x014b:
            int r6 = r2.length()
            r11.deleteSurroundingText(r6, r3)
        L_0x0152:
            r11.endBatchEdit()
            ch.icoaching.wrio.input.DefaultInputConnectionController r6 = r0.this$0
            r0.L$0 = r10
            r0.L$1 = r2
            r0.label = r5
            java.lang.Object r5 = r6.E(r11, r0)
            if (r5 != r1) goto L_0x0164
            return r1
        L_0x0164:
            r14 = r2
        L_0x0165:
            android.view.inputmethod.ExtractedText r5 = (android.view.inputmethod.ExtractedText) r5
            if (r5 == 0) goto L_0x016c
            java.lang.CharSequence r2 = r5.text
            goto L_0x016d
        L_0x016c:
            r2 = r7
        L_0x016d:
            if (r2 == 0) goto L_0x0195
            java.lang.CharSequence r2 = r5.text
            int r2 = r2.length()
            int r5 = r10.length()
            if (r2 != r5) goto L_0x0195
            ch.icoaching.wrio.input.DefaultInputConnectionController r2 = r0.this$0
            ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState r2 = r2.f9659B
            int r3 = r14.length()
            r0.L$0 = r7
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r2 = r2.s(r3, r0)
            if (r2 != r1) goto L_0x0192
            return r1
        L_0x0192:
            l2.q r1 = l2.q.f14567a
            return r1
        L_0x0195:
            ch.icoaching.wrio.input.DefaultInputConnectionController r1 = r0.this$0
            long r4 = android.os.SystemClock.elapsedRealtime()
            r1.f9679p = r4
            ch.icoaching.wrio.input.l r1 = new ch.icoaching.wrio.input.l
            ch.icoaching.wrio.input.DefaultInputConnectionController r2 = r0.this$0
            ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState r2 = r2.f9659B
            java.lang.String r11 = r2.f()
            ch.icoaching.wrio.input.DefaultInputConnectionController r2 = r0.this$0
            ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState r2 = r2.f9659B
            java.util.List r12 = r2.g()
            ch.icoaching.wrio.input.DefaultInputConnectionController r2 = r0.this$0
            ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState r2 = r2.f9659B
            int r13 = r2.i()
            ch.icoaching.wrio.input.OnContentChangeEventFlags r15 = new ch.icoaching.wrio.input.OnContentChangeEventFlags
            ch.icoaching.wrio.input.OnContentChangeEventFlags$TriggerEventType r2 = ch.icoaching.wrio.input.OnContentChangeEventFlags.TriggerEventType.DELETE
            r15.<init>(r3, r8, r2)
            r9 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15)
            ch.icoaching.wrio.input.DefaultInputConnectionController r2 = r0.this$0
            r2.f9676m = r1
            ch.icoaching.wrio.input.DefaultInputConnectionController r2 = r0.this$0
            r2.m0(r1)
            l2.q r1 = l2.q.f14567a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.input.DefaultInputConnectionController$processDeleteInputEvent$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(D d4, c<? super q> cVar) {
        return ((DefaultInputConnectionController$processDeleteInputEvent$2) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
