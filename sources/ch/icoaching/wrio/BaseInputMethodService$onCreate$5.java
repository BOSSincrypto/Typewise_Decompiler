package ch.icoaching.wrio;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.o;
import l2.q;
import u2.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* synthetic */ class BaseInputMethodService$onCreate$5 extends FunctionReferenceImpl implements p {
    BaseInputMethodService$onCreate$5(Object obj) {
        super(2, obj, BaseInputMethodService.class, "processOnStartInput", "processOnStartInput(Landroid/view/inputmethod/EditorInfo;Landroid/view/inputmethod/InputConnection;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((EditorInfo) obj, (InputConnection) obj2);
        return q.f14567a;
    }

    public final void invoke(EditorInfo editorInfo, InputConnection inputConnection) {
        o.e(editorInfo, "p0");
        ((BaseInputMethodService) this.receiver).i(editorInfo, inputConnection);
    }
}
