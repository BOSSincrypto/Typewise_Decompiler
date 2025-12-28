package ch.icoaching.wrio.theming;

import android.content.Context;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.theming.DefaultThemeController$loadThemeInBackground$1", f = "DefaultThemeController.kt", l = {159}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
final class DefaultThemeController$loadThemeInBackground$1 extends SuspendLambda implements p {
    final /* synthetic */ Context $context;
    final /* synthetic */ boolean $isInDarkMode;
    int label;
    final /* synthetic */ DefaultThemeController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultThemeController$loadThemeInBackground$1(DefaultThemeController defaultThemeController, boolean z3, Context context, c<? super DefaultThemeController$loadThemeInBackground$1> cVar) {
        super(2, cVar);
        this.this$0 = defaultThemeController;
        this.$isInDarkMode = z3;
        this.$context = context;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new DefaultThemeController$loadThemeInBackground$1(this.this$0, this.$isInDarkMode, this.$context, cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        if (r1 == null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
        if (r1 == null) goto L_0x003f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0068 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r12.label
            r2 = 1
            if (r1 == 0) goto L_0x0017
            if (r1 != r2) goto L_0x000f
            kotlin.f.b(r13)
            goto L_0x0069
        L_0x000f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0017:
            kotlin.f.b(r13)
            ch.icoaching.wrio.theming.DefaultThemeController r13 = r12.this$0
            ch.icoaching.wrio.data.b r13 = r13.f10660c
            java.lang.String[] r13 = r13.T()
            boolean r1 = r12.$isInDarkMode
            r3 = 0
            java.lang.String r4 = "dark"
            java.lang.String r5 = "light"
            if (r1 == 0) goto L_0x0043
            r1 = r13[r2]
            if (r1 != 0) goto L_0x0033
            r8 = r4
            goto L_0x0048
        L_0x0033:
            java.lang.String r6 = "none"
            boolean r6 = kotlin.jvm.internal.o.a(r1, r6)
            if (r6 == 0) goto L_0x0041
            r1 = r13[r3]
            if (r1 != 0) goto L_0x0041
        L_0x003f:
            r8 = r5
            goto L_0x0048
        L_0x0041:
            r8 = r1
            goto L_0x0048
        L_0x0043:
            r1 = r13[r3]
            if (r1 != 0) goto L_0x0041
            goto L_0x003f
        L_0x0048:
            boolean r13 = r12.$isInDarkMode
            if (r13 == 0) goto L_0x004e
            r9 = r4
            goto L_0x004f
        L_0x004e:
            r9 = r5
        L_0x004f:
            ch.icoaching.wrio.theming.DefaultThemeController r13 = r12.this$0
            kotlinx.coroutines.CoroutineDispatcher r13 = r13.f10658a
            ch.icoaching.wrio.theming.DefaultThemeController$loadThemeInBackground$1$themeConfig$1 r1 = new ch.icoaching.wrio.theming.DefaultThemeController$loadThemeInBackground$1$themeConfig$1
            android.content.Context r7 = r12.$context
            ch.icoaching.wrio.theming.DefaultThemeController r10 = r12.this$0
            r11 = 0
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11)
            r12.label = r2
            java.lang.Object r13 = kotlinx.coroutines.C0738g.e(r13, r1, r12)
            if (r13 != r0) goto L_0x0069
            return r0
        L_0x0069:
            ch.icoaching.wrio.keyboard.model.config.ThemeConfig r13 = (ch.icoaching.wrio.keyboard.model.config.ThemeConfig) r13
            ch.icoaching.wrio.theming.DefaultThemeController r0 = r12.this$0
            android.content.Context r1 = r12.$context
            ch.icoaching.wrio.keyboard.model.ThemeModel r13 = ch.icoaching.wrio.keyboard.view.D.k(r13, r1)
            r0.f10663f = r13
            ch.icoaching.wrio.theming.DefaultThemeController r13 = r12.this$0
            u2.l r13 = r13.f10667j
            if (r13 == 0) goto L_0x008f
            ch.icoaching.wrio.theming.DefaultThemeController r0 = r12.this$0
            ch.icoaching.wrio.keyboard.model.ThemeModel r0 = r0.f10663f
            if (r0 != 0) goto L_0x008c
            java.lang.String r0 = "currentTheme"
            kotlin.jvm.internal.o.p(r0)
            r0 = 0
        L_0x008c:
            r13.invoke(r0)
        L_0x008f:
            l2.q r13 = l2.q.f14567a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.theming.DefaultThemeController$loadThemeInBackground$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(D d4, c<? super q> cVar) {
        return ((DefaultThemeController$loadThemeInBackground$1) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
