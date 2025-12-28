package ch.icoaching.wrio.keyboard;

import ch.icoaching.wrio.keyboard.view.KeyboardLayoutView;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.keyboard.DefaultKeyboardController$createBlurredSymbolsAndEmojisBackground$1", f = "DefaultKeyboardController.kt", l = {1153, 1169, 1177, 1190}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
final class DefaultKeyboardController$createBlurredSymbolsAndEmojisBackground$1 extends SuspendLambda implements p {
    final /* synthetic */ KeyboardLayoutView $keyboardLayoutViewLocal;
    int label;
    final /* synthetic */ DefaultKeyboardController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultKeyboardController$createBlurredSymbolsAndEmojisBackground$1(KeyboardLayoutView keyboardLayoutView, DefaultKeyboardController defaultKeyboardController, c<? super DefaultKeyboardController$createBlurredSymbolsAndEmojisBackground$1> cVar) {
        super(2, cVar);
        this.$keyboardLayoutViewLocal = keyboardLayoutView;
        this.this$0 = defaultKeyboardController;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new DefaultKeyboardController$createBlurredSymbolsAndEmojisBackground$1(this.$keyboardLayoutViewLocal, this.this$0, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0093 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r9.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L_0x002f
            if (r1 == r5) goto L_0x002b
            if (r1 == r4) goto L_0x0027
            if (r1 == r3) goto L_0x0022
            if (r1 != r2) goto L_0x001a
            kotlin.f.b(r10)
            goto L_0x00b4
        L_0x001a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0022:
            kotlin.f.b(r10)
            goto L_0x0094
        L_0x0027:
            kotlin.f.b(r10)
            goto L_0x007e
        L_0x002b:
            kotlin.f.b(r10)
            goto L_0x003d
        L_0x002f:
            kotlin.f.b(r10)
            r9.label = r5
            r7 = 300(0x12c, double:1.48E-321)
            java.lang.Object r10 = kotlinx.coroutines.L.a(r7, r9)
            if (r10 != r0) goto L_0x003d
            return r0
        L_0x003d:
            int r10 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r10 < r1) goto L_0x004a
            ch.icoaching.wrio.keyboard.view.KeyboardLayoutView r10 = r9.$keyboardLayoutViewLocal
            boolean r10 = r10.isTemporarilyDetached()
            goto L_0x004b
        L_0x004a:
            r10 = 0
        L_0x004b:
            ch.icoaching.wrio.keyboard.view.KeyboardLayoutView r1 = r9.$keyboardLayoutViewLocal
            boolean r1 = r1.isAttachedToWindow()
            if (r1 == 0) goto L_0x00b7
            ch.icoaching.wrio.keyboard.view.KeyboardLayoutView r1 = r9.$keyboardLayoutViewLocal
            boolean r1 = r1.isLaidOut()
            if (r1 == 0) goto L_0x00b7
            if (r10 != 0) goto L_0x00b7
            ch.icoaching.wrio.keyboard.view.KeyboardLayoutView r10 = r9.$keyboardLayoutViewLocal
            boolean r10 = ch.icoaching.wrio.W.b(r10)
            if (r10 != 0) goto L_0x0066
            goto L_0x00b7
        L_0x0066:
            ch.icoaching.wrio.keyboard.DefaultKeyboardController r10 = r9.this$0
            kotlinx.coroutines.CoroutineDispatcher r10 = r10.f9865b
            ch.icoaching.wrio.keyboard.DefaultKeyboardController$createBlurredSymbolsAndEmojisBackground$1$imageComposer$1 r1 = new ch.icoaching.wrio.keyboard.DefaultKeyboardController$createBlurredSymbolsAndEmojisBackground$1$imageComposer$1
            ch.icoaching.wrio.keyboard.view.KeyboardLayoutView r5 = r9.$keyboardLayoutViewLocal
            ch.icoaching.wrio.keyboard.DefaultKeyboardController r7 = r9.this$0
            r1.<init>(r5, r7, r6)
            r9.label = r4
            java.lang.Object r10 = kotlinx.coroutines.C0738g.e(r10, r1, r9)
            if (r10 != r0) goto L_0x007e
            return r0
        L_0x007e:
            j2.c$b r10 = (j2.C0690c.b) r10
            ch.icoaching.wrio.keyboard.DefaultKeyboardController r1 = r9.this$0
            kotlinx.coroutines.CoroutineDispatcher r1 = r1.f9867c
            ch.icoaching.wrio.keyboard.DefaultKeyboardController$createBlurredSymbolsAndEmojisBackground$1$bitmap$1 r4 = new ch.icoaching.wrio.keyboard.DefaultKeyboardController$createBlurredSymbolsAndEmojisBackground$1$bitmap$1
            r4.<init>(r10, r6)
            r9.label = r3
            java.lang.Object r10 = kotlinx.coroutines.C0738g.e(r1, r4, r9)
            if (r10 != r0) goto L_0x0094
            return r0
        L_0x0094:
            android.graphics.Bitmap r10 = (android.graphics.Bitmap) r10
            ch.icoaching.wrio.keyboard.DefaultKeyboardController r1 = r9.this$0
            ch.icoaching.wrio.keyboard.view.KeyboardLayoutView r1 = r1.f9891o
            if (r1 == 0) goto L_0x00b4
            ch.icoaching.wrio.keyboard.DefaultKeyboardController r1 = r9.this$0
            kotlinx.coroutines.CoroutineDispatcher r1 = r1.f9865b
            ch.icoaching.wrio.keyboard.DefaultKeyboardController$createBlurredSymbolsAndEmojisBackground$1$1 r3 = new ch.icoaching.wrio.keyboard.DefaultKeyboardController$createBlurredSymbolsAndEmojisBackground$1$1
            ch.icoaching.wrio.keyboard.DefaultKeyboardController r4 = r9.this$0
            r3.<init>(r10, r4, r6)
            r9.label = r2
            java.lang.Object r10 = kotlinx.coroutines.C0738g.e(r1, r3, r9)
            if (r10 != r0) goto L_0x00b4
            return r0
        L_0x00b4:
            l2.q r10 = l2.q.f14567a
            return r10
        L_0x00b7:
            l2.q r10 = l2.q.f14567a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.keyboard.DefaultKeyboardController$createBlurredSymbolsAndEmojisBackground$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(D d4, c<? super q> cVar) {
        return ((DefaultKeyboardController$createBlurredSymbolsAndEmojisBackground$1) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
