package ch.icoaching.wrio.theming;

import android.content.Context;
import android.content.res.Configuration;
import ch.icoaching.wrio.logging.Log;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.theming.DefaultThemeController$loadThemeFromAssets$1", f = "DefaultThemeController.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Ll2/q;", "<anonymous>", "(Lkotlin/Array;)V"}, k = 3, mv = {2, 0, 0})
final class DefaultThemeController$loadThemeFromAssets$1 extends SuspendLambda implements p {
    final /* synthetic */ Context $context;
    int label;
    final /* synthetic */ DefaultThemeController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultThemeController$loadThemeFromAssets$1(DefaultThemeController defaultThemeController, Context context, c<? super DefaultThemeController$loadThemeFromAssets$1> cVar) {
        super(2, cVar);
        this.this$0 = defaultThemeController;
        this.$context = context;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new DefaultThemeController$loadThemeFromAssets$1(this.this$0, this.$context, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        a.f();
        if (this.label == 0) {
            f.b(obj);
            if (!this.this$0.f10664g) {
                Log.d(Log.f10572a, "DefaultThemeController", "Theme changed", (Throwable) null, 4, (Object) null);
                DefaultThemeController defaultThemeController = this.this$0;
                Context context = this.$context;
                Configuration configuration = context.getResources().getConfiguration();
                o.d(configuration, "getConfiguration(...)");
                defaultThemeController.k(context, c.b(configuration));
            }
            return q.f14567a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public final Object invoke(String[] strArr, c<? super q> cVar) {
        return ((DefaultThemeController$loadThemeFromAssets$1) create(strArr, cVar)).invokeSuspend(q.f14567a);
    }
}
