package ch.icoaching.wrio;

import android.view.inputmethod.InputBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import u2.C0906a;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* synthetic */ class BaseInputMethodService$onCreate$4 extends FunctionReferenceImpl implements C0906a {
    BaseInputMethodService$onCreate$4(Object obj) {
        super(0, obj, BaseInputMethodService.class, "getCurrentInputBinding", "getCurrentInputBinding()Landroid/view/inputmethod/InputBinding;", 0);
    }

    public final InputBinding invoke() {
        return ((BaseInputMethodService) this.receiver).getCurrentInputBinding();
    }
}
