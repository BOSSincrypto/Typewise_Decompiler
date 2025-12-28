package ch.icoaching.wrio.keyboard;

import android.content.Context;
import android.util.DisplayMetrics;
import android.widget.FrameLayout;
import ch.icoaching.wrio.J;
import ch.icoaching.wrio.data.k;
import ch.icoaching.wrio.keyboard.model.ThemeModel;
import ch.icoaching.wrio.keyboard.view.C0537l;
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

@d(c = "ch.icoaching.wrio.keyboard.DefaultKeyboardController$createEmojisView$2", f = "DefaultKeyboardController.kt", l = {1421}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Lch/icoaching/wrio/keyboard/view/l;", "<anonymous>", "(Lkotlinx/coroutines/D;)Lch/icoaching/wrio/keyboard/view/l;"}, k = 3, mv = {2, 0, 0})
final class DefaultKeyboardController$createEmojisView$2 extends SuspendLambda implements p {
    final /* synthetic */ int $height;
    final /* synthetic */ int $width;
    Object L$0;
    int label;
    final /* synthetic */ DefaultKeyboardController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultKeyboardController$createEmojisView$2(DefaultKeyboardController defaultKeyboardController, int i4, int i5, c<? super DefaultKeyboardController$createEmojisView$2> cVar) {
        super(2, cVar);
        this.this$0 = defaultKeyboardController;
        this.$width = i4;
        this.$height = i5;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new DefaultKeyboardController$createEmojisView$2(this.this$0, this.$width, this.$height, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C0537l lVar;
        boolean z3;
        Object f4 = a.f();
        int i4 = this.label;
        if (i4 == 0) {
            f.b(obj);
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
                int i5 = b4[0];
                int i6 = b4[1];
                Context context = j12.getContext();
                o.d(context, "getContext(...)");
                C0537l lVar2 = new C0537l(context);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 1;
                lVar2.setLayoutParams(layoutParams);
                lVar2.setKeyClickDetectionEnabled(this.this$0.f9838B);
                Map a12 = this.this$0.f9860X;
                ThemeModel F12 = this.this$0.f9862Z;
                ThemeModel themeModel = null;
                if (F12 == null) {
                    o.p("selectedKeyboardTheme");
                    F12 = null;
                }
                lVar2.h0(a12, F12.getSpecialOverlaysTheme(), this.this$0.f9908y, z3, this.$width, this.$height, this.this$0.f9842F, this.this$0.f9841E, this.this$0.f9855S, this.this$0.E1());
                lVar2.K(i5, i6);
                lVar2.setOnLongTouchListener(this.this$0.f9858V);
                lVar2.setBackspaceButtonVisibility(k.a(this.this$0.f9873f, this.this$0.f9875g).S());
                ThemeModel F13 = this.this$0.f9862Z;
                if (F13 == null) {
                    o.p("selectedKeyboardTheme");
                } else {
                    themeModel = F13;
                }
                lVar2.setLongClickMenuTheme(themeModel.getDiacriticsPopUpTheme());
                RecentSymbolsAndEmojisUseCase z12 = this.this$0.f9871e;
                this.L$0 = lVar2;
                this.label = 1;
                obj2 = z12.b(this);
                if (obj2 == f4) {
                    return f4;
                }
                lVar = lVar2;
            } else {
                throw new IllegalStateException("Keyboard root View not inflated");
            }
        } else if (i4 == 1) {
            lVar = (C0537l) this.L$0;
            f.b(obj);
            obj2 = obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        List list = (List) obj2;
        if (!list.isEmpty()) {
            lVar.u0(list);
        }
        return lVar;
    }

    public final Object invoke(D d4, c<? super C0537l> cVar) {
        return ((DefaultKeyboardController$createEmojisView$2) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
