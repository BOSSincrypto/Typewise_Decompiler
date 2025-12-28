package ch.icoaching.wrio;

import ch.icoaching.wrio.keyboard.model.ThemeModel;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.o;
import l2.q;
import u2.l;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* synthetic */ class BaseInputMethodService$onCreate$1 extends FunctionReferenceImpl implements l {
    BaseInputMethodService$onCreate$1(Object obj) {
        super(1, obj, BaseInputMethodService.class, "onThemeChange", "onThemeChange(Lch/icoaching/wrio/keyboard/model/ThemeModel;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ThemeModel) obj);
        return q.f14567a;
    }

    public final void invoke(ThemeModel themeModel) {
        o.e(themeModel, "p0");
        ((BaseInputMethodService) this.receiver).J0(themeModel);
    }
}
