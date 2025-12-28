package ch.icoaching.wrio;

import android.view.View;
import android.view.WindowInsets;
import androidx.core.view.C;
import androidx.core.view.C0435o0;
import androidx.core.view.P;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.n;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.BaseInputMethodServiceKt$windowInsetsFlow$1", f = "BaseInputMethodService.kt", l = {1809}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/channels/n;", "Landroid/view/WindowInsets;", "kotlin.jvm.PlatformType", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/channels/n;)V"}, k = 3, mv = {2, 0, 0})
final class BaseInputMethodServiceKt$windowInsetsFlow$1 extends SuspendLambda implements p {
    final /* synthetic */ View $this_windowInsetsFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BaseInputMethodServiceKt$windowInsetsFlow$1(View view, c<? super BaseInputMethodServiceKt$windowInsetsFlow$1> cVar) {
        super(2, cVar);
        this.$this_windowInsetsFlow = view;
    }

    /* access modifiers changed from: private */
    public static final C0435o0 g(n nVar, View view, C0435o0 o0Var) {
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(o0Var.u());
        nVar.k(onApplyWindowInsets);
        return C0435o0.v(onApplyWindowInsets);
    }

    /* access modifiers changed from: private */
    public static final q h(View view) {
        P.C0(view, (C) null);
        return q.f14567a;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        BaseInputMethodServiceKt$windowInsetsFlow$1 baseInputMethodServiceKt$windowInsetsFlow$1 = new BaseInputMethodServiceKt$windowInsetsFlow$1(this.$this_windowInsetsFlow, cVar);
        baseInputMethodServiceKt$windowInsetsFlow$1.L$0 = obj;
        return baseInputMethodServiceKt$windowInsetsFlow$1;
    }

    public final Object invokeSuspend(Object obj) {
        Object f4 = a.f();
        int i4 = this.label;
        if (i4 == 0) {
            f.b(obj);
            n nVar = (n) this.L$0;
            P.C0(this.$this_windowInsetsFlow, new C0509i(nVar));
            C0510j jVar = new C0510j(this.$this_windowInsetsFlow);
            this.label = 1;
            if (ProduceKt.a(nVar, jVar, this) == f4) {
                return f4;
            }
        } else if (i4 == 1) {
            f.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return q.f14567a;
    }

    public final Object invoke(n nVar, c<? super q> cVar) {
        return ((BaseInputMethodServiceKt$windowInsetsFlow$1) create(nVar, cVar)).invokeSuspend(q.f14567a);
    }
}
