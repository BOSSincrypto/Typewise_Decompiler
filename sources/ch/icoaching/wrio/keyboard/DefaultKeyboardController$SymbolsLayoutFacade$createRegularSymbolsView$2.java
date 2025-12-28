package ch.icoaching.wrio.keyboard;

import android.content.Context;
import android.util.DisplayMetrics;
import android.widget.FrameLayout;
import ch.icoaching.wrio.J;
import ch.icoaching.wrio.data.k;
import ch.icoaching.wrio.keyboard.DefaultKeyboardController;
import ch.icoaching.wrio.keyboard.model.ThemeModel;
import ch.icoaching.wrio.keyboard.view.B;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.keyboard.DefaultKeyboardController$SymbolsLayoutFacade$createRegularSymbolsView$2", f = "DefaultKeyboardController.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Lch/icoaching/wrio/keyboard/view/B;", "<anonymous>", "(Lkotlinx/coroutines/D;)Lch/icoaching/wrio/keyboard/view/B;"}, k = 3, mv = {2, 0, 0})
final class DefaultKeyboardController$SymbolsLayoutFacade$createRegularSymbolsView$2 extends SuspendLambda implements p {
    final /* synthetic */ int $height;
    final /* synthetic */ int $keyboardLayoutViewBottomMarginCreatedByMarginBottomFactor;
    final /* synthetic */ boolean $showNumbersAndQuickAccessCharacters;
    final /* synthetic */ int $width;
    int label;
    final /* synthetic */ DefaultKeyboardController this$0;
    final /* synthetic */ DefaultKeyboardController.SymbolsLayoutFacade this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultKeyboardController$SymbolsLayoutFacade$createRegularSymbolsView$2(int i4, int i5, DefaultKeyboardController defaultKeyboardController, DefaultKeyboardController.SymbolsLayoutFacade symbolsLayoutFacade, int i6, boolean z3, c<? super DefaultKeyboardController$SymbolsLayoutFacade$createRegularSymbolsView$2> cVar) {
        super(2, cVar);
        this.$width = i4;
        this.$height = i5;
        this.this$0 = defaultKeyboardController;
        this.this$1 = symbolsLayoutFacade;
        this.$keyboardLayoutViewBottomMarginCreatedByMarginBottomFactor = i6;
        this.$showNumbersAndQuickAccessCharacters = z3;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new DefaultKeyboardController$SymbolsLayoutFacade$createRegularSymbolsView$2(this.$width, this.$height, this.this$0, this.this$1, this.$keyboardLayoutViewBottomMarginCreatedByMarginBottomFactor, this.$showNumbersAndQuickAccessCharacters, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z3;
        a.f();
        if (this.label == 0) {
            f.b(obj);
            int i4 = this.$width;
            if (i4 > 0) {
                int i5 = this.$height;
                if (i5 > 0) {
                    FrameLayout j12 = this.this$0.f9899s;
                    if (j12 != null) {
                        if (this.this$0.f9873f.C() != KeyboardLayoutType.RECTANGLE) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        J L3 = this.this$0.f9846J;
                        DisplayMetrics displayMetrics = j12.getResources().getDisplayMetrics();
                        o.d(displayMetrics, "getDisplayMetrics(...)");
                        int[] b4 = L3.b(displayMetrics);
                        int i6 = b4[0];
                        int i7 = b4[1];
                        Context context = j12.getContext();
                        o.d(context, "getContext(...)");
                        B b5 = new B(context);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                        layoutParams.gravity = 1;
                        b5.setLayoutParams(layoutParams);
                        b5.setKeyClickDetectionEnabled(this.this$1.s());
                        Map<String, List<Character>> categories = this.this$0.f9859W.getCategories();
                        ThemeModel F12 = this.this$0.f9862Z;
                        if (F12 == null) {
                            o.p("selectedKeyboardTheme");
                            F12 = null;
                        }
                        b5.R(categories, F12.getSpecialOverlaysTheme(), this.this$0.f9908y, z3, this.$width, this.$height, this.this$0.f9842F, this.$keyboardLayoutViewBottomMarginCreatedByMarginBottomFactor, this.this$0.f9841E, this.this$0.f9854R, this.this$0.f9873f.P(), this.this$0.E1(), this.$showNumbersAndQuickAccessCharacters);
                        b5.K(i6, i7);
                        b5.setOnLongTouchListener(this.this$0.f9858V);
                        b5.setBackspaceButtonVisibility(k.a(this.this$0.f9873f, this.this$0.f9875g).S());
                        b5.U(this.this$0.f9881j.c());
                        return b5;
                    }
                    throw new IllegalStateException("Keyboard root View not inflated");
                }
                throw new IllegalArgumentException(("Height must be greater than 0. Height is " + i5).toString());
            }
            throw new IllegalArgumentException(("Width must be greater than 0. Width is " + i4).toString());
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public final Object invoke(D d4, c<? super B> cVar) {
        return ((DefaultKeyboardController$SymbolsLayoutFacade$createRegularSymbolsView$2) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
