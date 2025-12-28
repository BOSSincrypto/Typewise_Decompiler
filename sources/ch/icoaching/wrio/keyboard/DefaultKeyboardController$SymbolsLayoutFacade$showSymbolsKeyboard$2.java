package ch.icoaching.wrio.keyboard;

import android.widget.FrameLayout;
import ch.icoaching.wrio.keyboard.DefaultKeyboardController;
import ch.icoaching.wrio.keyboard.view.KeyboardLayoutView;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.C0738g;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.keyboard.DefaultKeyboardController$SymbolsLayoutFacade$showSymbolsKeyboard$2", f = "DefaultKeyboardController.kt", l = {1970}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
final class DefaultKeyboardController$SymbolsLayoutFacade$showSymbolsKeyboard$2 extends SuspendLambda implements p {
    final /* synthetic */ boolean $doSetActiveLayerToSymbols;
    final /* synthetic */ boolean $forceRegularSymbolsView;
    final /* synthetic */ KeyboardLayoutView $keyboardLayoutViewLocal;
    final /* synthetic */ int $keyboardLayoutViewWidth;
    final /* synthetic */ FrameLayout $rootViewLocal;
    int label;
    final /* synthetic */ DefaultKeyboardController this$0;
    final /* synthetic */ DefaultKeyboardController.SymbolsLayoutFacade this$1;

    @d(c = "ch.icoaching.wrio.keyboard.DefaultKeyboardController$SymbolsLayoutFacade$showSymbolsKeyboard$2$1", f = "DefaultKeyboardController.kt", l = {2008, 2020}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ch.icoaching.wrio.keyboard.DefaultKeyboardController$SymbolsLayoutFacade$showSymbolsKeyboard$2$1  reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements p {
        int I$0;
        int label;

        public final c<q> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(defaultKeyboardController, keyboardLayoutView, i5, z3, symbolsLayoutFacade, frameLayout, z4, cVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:58:0x010e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
                int r1 = r11.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0022
                if (r1 == r3) goto L_0x001d
                if (r1 != r2) goto L_0x0015
                int r0 = r11.I$0
                kotlin.f.b(r12)
                goto L_0x00fe
            L_0x0015:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L_0x001d:
                kotlin.f.b(r12)
                goto L_0x00b0
            L_0x0022:
                kotlin.f.b(r12)
                ch.icoaching.wrio.keyboard.DefaultKeyboardController r12 = r4
                ch.icoaching.wrio.data.b r12 = r12.f9873f
                ch.icoaching.wrio.keyboard.KeyboardLayoutType r12 = r12.C()
                ch.icoaching.wrio.keyboard.KeyboardLayoutType r1 = ch.icoaching.wrio.keyboard.KeyboardLayoutType.RECTANGLE
                r4 = 0
                if (r12 == r1) goto L_0x0036
                r12 = r3
                goto L_0x0037
            L_0x0036:
                r12 = r4
            L_0x0037:
                ch.icoaching.wrio.keyboard.view.KeyboardLayoutView r1 = r5
                int r7 = r1.getHeight()
                if (r12 == 0) goto L_0x0064
                ch.icoaching.wrio.keyboard.DefaultKeyboardController r12 = r4
                int r12 = r12.f9878h0
                if (r12 == r2) goto L_0x0054
                ch.icoaching.wrio.keyboard.DefaultKeyboardController r12 = r4
                boolean r12 = r12.E1()
                if (r12 == 0) goto L_0x0050
                goto L_0x0054
            L_0x0050:
                int r12 = r6
            L_0x0052:
                r6 = r12
                goto L_0x0067
            L_0x0054:
                int r12 = r6
                float r12 = (float) r12
                ch.icoaching.wrio.keyboard.view.KeyboardLayoutView r1 = r5
                int r1 = r1.getColumnWidth()
                float r1 = (float) r1
                r5 = 1073741824(0x40000000, float:2.0)
                float r1 = r1 * r5
                float r12 = r12 - r1
                int r12 = (int) r12
                goto L_0x0052
            L_0x0064:
                int r12 = r6
                goto L_0x0052
            L_0x0067:
                if (r6 <= 0) goto L_0x0118
                if (r7 > 0) goto L_0x006d
                goto L_0x0118
            L_0x006d:
                ch.icoaching.wrio.keyboard.DefaultKeyboardController r12 = r4
                boolean r12 = r12.y1()
                if (r12 == 0) goto L_0x007a
                ch.icoaching.wrio.keyboard.DefaultKeyboardController r12 = r4
                r12.J1()
            L_0x007a:
                ch.icoaching.wrio.keyboard.DefaultKeyboardController r12 = r4
                boolean r12 = r12.C1()
                if (r12 == 0) goto L_0x00bd
                ch.icoaching.wrio.keyboard.DefaultKeyboardController r12 = r4
                ch.icoaching.wrio.data.b r12 = r12.f9873f
                boolean r12 = r12.p()
                if (r12 == 0) goto L_0x00bd
                boolean r12 = r7
                if (r12 != 0) goto L_0x00bd
                ch.icoaching.wrio.keyboard.DefaultKeyboardController$SymbolsLayoutFacade r12 = r8
                ch.icoaching.wrio.keyboard.view.r r12 = r12.f9912c
                if (r12 != 0) goto L_0x010a
                ch.icoaching.wrio.keyboard.DefaultKeyboardController$SymbolsLayoutFacade r12 = r8
                ch.icoaching.wrio.keyboard.view.KeyboardLayoutView r1 = r5
                android.content.Context r1 = r1.getContext()
                java.lang.String r2 = "getContext(...)"
                kotlin.jvm.internal.o.d(r1, r2)
                r11.label = r3
                java.lang.Object r12 = r12.c(r1, r11)
                if (r12 != r0) goto L_0x00b0
                return r0
            L_0x00b0:
                ch.icoaching.wrio.keyboard.view.r r12 = (ch.icoaching.wrio.keyboard.view.r) r12
                android.widget.FrameLayout r0 = r9
                r0.addView(r12, r3)
                ch.icoaching.wrio.keyboard.DefaultKeyboardController$SymbolsLayoutFacade r0 = r8
                r0.f9912c = r12
                goto L_0x010a
            L_0x00bd:
                ch.icoaching.wrio.keyboard.DefaultKeyboardController$SymbolsLayoutFacade r12 = r8
                ch.icoaching.wrio.keyboard.view.B r12 = r12.f9913d
                if (r12 != 0) goto L_0x010a
                ch.icoaching.wrio.keyboard.DefaultKeyboardController$SymbolsLayoutFacade r12 = r8
                ch.icoaching.wrio.keyboard.view.r r12 = r12.f9912c
                if (r12 != 0) goto L_0x00cf
                r12 = r3
                goto L_0x00d0
            L_0x00cf:
                r12 = r2
            L_0x00d0:
                ch.icoaching.wrio.keyboard.DefaultKeyboardController r1 = r4
                ch.icoaching.wrio.data.b r1 = r1.f9873f
                boolean r1 = r1.p()
                if (r1 == 0) goto L_0x00e7
                ch.icoaching.wrio.keyboard.DefaultKeyboardController r1 = r4
                boolean r1 = r1.C1()
                if (r1 != 0) goto L_0x00e5
                goto L_0x00e7
            L_0x00e5:
                r9 = r4
                goto L_0x00e8
            L_0x00e7:
                r9 = r3
            L_0x00e8:
                ch.icoaching.wrio.keyboard.DefaultKeyboardController$SymbolsLayoutFacade r5 = r8
                ch.icoaching.wrio.keyboard.view.KeyboardLayoutView r1 = r5
                int r8 = r1.getCustomBottomMargin()
                r11.I$0 = r12
                r11.label = r2
                r10 = r11
                java.lang.Object r1 = r5.b(r6, r7, r8, r9, r10)
                if (r1 != r0) goto L_0x00fc
                return r0
            L_0x00fc:
                r0 = r12
                r12 = r1
            L_0x00fe:
                ch.icoaching.wrio.keyboard.view.B r12 = (ch.icoaching.wrio.keyboard.view.B) r12
                android.widget.FrameLayout r1 = r9
                r1.addView(r12, r0)
                ch.icoaching.wrio.keyboard.DefaultKeyboardController$SymbolsLayoutFacade r0 = r8
                r0.f9913d = r12
            L_0x010a:
                boolean r12 = r10
                if (r12 == 0) goto L_0x0115
                ch.icoaching.wrio.keyboard.DefaultKeyboardController r12 = r4
                ch.icoaching.wrio.keyboard.layout.Layer r0 = ch.icoaching.wrio.keyboard.layout.Layer.SYMBOLS
                r12.f9900s0 = r0
            L_0x0115:
                l2.q r12 = l2.q.f14567a
                return r12
            L_0x0118:
                l2.q r12 = l2.q.f14567a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.keyboard.DefaultKeyboardController$SymbolsLayoutFacade$showSymbolsKeyboard$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object invoke(D d4, c<? super q> cVar) {
            return ((AnonymousClass1) create(d4, cVar)).invokeSuspend(q.f14567a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultKeyboardController$SymbolsLayoutFacade$showSymbolsKeyboard$2(DefaultKeyboardController defaultKeyboardController, KeyboardLayoutView keyboardLayoutView, int i4, boolean z3, DefaultKeyboardController.SymbolsLayoutFacade symbolsLayoutFacade, FrameLayout frameLayout, boolean z4, c<? super DefaultKeyboardController$SymbolsLayoutFacade$showSymbolsKeyboard$2> cVar) {
        super(2, cVar);
        this.this$0 = defaultKeyboardController;
        this.$keyboardLayoutViewLocal = keyboardLayoutView;
        this.$keyboardLayoutViewWidth = i4;
        this.$forceRegularSymbolsView = z3;
        this.this$1 = symbolsLayoutFacade;
        this.$rootViewLocal = frameLayout;
        this.$doSetActiveLayerToSymbols = z4;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new DefaultKeyboardController$SymbolsLayoutFacade$showSymbolsKeyboard$2(this.this$0, this.$keyboardLayoutViewLocal, this.$keyboardLayoutViewWidth, this.$forceRegularSymbolsView, this.this$1, this.$rootViewLocal, this.$doSetActiveLayerToSymbols, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object f4 = a.f();
        int i4 = this.label;
        if (i4 == 0) {
            f.b(obj);
            CoroutineDispatcher o12 = this.this$0.f9865b;
            final DefaultKeyboardController defaultKeyboardController = this.this$0;
            final KeyboardLayoutView keyboardLayoutView = this.$keyboardLayoutViewLocal;
            final int i5 = this.$keyboardLayoutViewWidth;
            final boolean z3 = this.$forceRegularSymbolsView;
            final DefaultKeyboardController.SymbolsLayoutFacade symbolsLayoutFacade = this.this$1;
            final FrameLayout frameLayout = this.$rootViewLocal;
            final boolean z4 = this.$doSetActiveLayerToSymbols;
            AnonymousClass1 r32 = new AnonymousClass1((c<? super AnonymousClass1>) null);
            this.label = 1;
            if (C0738g.e(o12, r32, this) == f4) {
                return f4;
            }
        } else if (i4 == 1) {
            f.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return q.f14567a;
    }

    public final Object invoke(D d4, c<? super q> cVar) {
        return ((DefaultKeyboardController$SymbolsLayoutFacade$showSymbolsKeyboard$2) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
