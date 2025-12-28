package ch.icoaching.wrio.theming;

import android.content.Context;
import android.content.res.AssetManager;
import ch.icoaching.wrio.keyboard.model.config.ThemeConfig;
import ch.icoaching.wrio.keyboard.view.D;
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

@d(c = "ch.icoaching.wrio.theming.DefaultThemeController$loadThemeInBackground$1$themeConfig$1", f = "DefaultThemeController.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Lch/icoaching/wrio/keyboard/model/config/ThemeConfig;", "<anonymous>", "(Lkotlinx/coroutines/D;)Lch/icoaching/wrio/keyboard/model/config/ThemeConfig;"}, k = 3, mv = {2, 0, 0})
final class DefaultThemeController$loadThemeInBackground$1$themeConfig$1 extends SuspendLambda implements p {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $defaultThemeName;
    final /* synthetic */ String $selectedThemeName;
    int label;
    final /* synthetic */ DefaultThemeController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultThemeController$loadThemeInBackground$1$themeConfig$1(Context context, String str, String str2, DefaultThemeController defaultThemeController, c<? super DefaultThemeController$loadThemeInBackground$1$themeConfig$1> cVar) {
        super(2, cVar);
        this.$context = context;
        this.$selectedThemeName = str;
        this.$defaultThemeName = str2;
        this.this$0 = defaultThemeController;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new DefaultThemeController$loadThemeInBackground$1$themeConfig$1(this.$context, this.$selectedThemeName, this.$defaultThemeName, this.this$0, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        a.f();
        if (this.label == 0) {
            f.b(obj);
            AssetManager assets = this.$context.getAssets();
            o.d(assets, "getAssets(...)");
            ThemeConfig c4 = D.c(assets, this.$selectedThemeName, this.$defaultThemeName, this.this$0.f10662e);
            if (!c4.isPremium() || this.this$0.f10661d.b()) {
                Log log = Log.f10572a;
                Log.d(log, "DefaultThemeController", "Premium theme available, setting " + this.$selectedThemeName, (Throwable) null, 4, (Object) null);
                return c4;
            }
            Log.d(Log.f10572a, "DefaultThemeController", "Premium theme not available, setting default", (Throwable) null, 4, (Object) null);
            AssetManager assets2 = this.$context.getAssets();
            o.d(assets2, "getAssets(...)");
            String str = this.$defaultThemeName;
            return D.c(assets2, str, str, this.this$0.f10662e);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public final Object invoke(kotlinx.coroutines.D d4, c<? super ThemeConfig> cVar) {
        return ((DefaultThemeController$loadThemeInBackground$1$themeConfig$1) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
