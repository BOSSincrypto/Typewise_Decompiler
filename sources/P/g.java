package P;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.f;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

final class g implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    private final EditText f1101a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f1102b;

    /* renamed from: c  reason: collision with root package name */
    private f.e f1103c;

    /* renamed from: d  reason: collision with root package name */
    private int f1104d = Integer.MAX_VALUE;

    /* renamed from: e  reason: collision with root package name */
    private int f1105e = 0;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1106f;

    private static class a extends f.e {

        /* renamed from: a  reason: collision with root package name */
        private final Reference f1107a;

        a(EditText editText) {
            this.f1107a = new WeakReference(editText);
        }

        public void b() {
            super.b();
            g.b((EditText) this.f1107a.get(), 1);
        }
    }

    g(EditText editText, boolean z3) {
        this.f1101a = editText;
        this.f1102b = z3;
        this.f1106f = true;
    }

    private f.e a() {
        if (this.f1103c == null) {
            this.f1103c = new a(this.f1101a);
        }
        return this.f1103c;
    }

    static void b(EditText editText, int i4) {
        if (i4 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            f.b().o(editableText);
            d.b(editableText, selectionStart, selectionEnd);
        }
    }

    private boolean d() {
        if (!this.f1106f || (!this.f1102b && !f.h())) {
            return true;
        }
        return false;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
    }

    public void c(boolean z3) {
        if (this.f1106f != z3) {
            if (this.f1103c != null) {
                f.b().t(this.f1103c);
            }
            this.f1106f = z3;
            if (z3) {
                b(this.f1101a, f.b().d());
            }
        }
    }

    public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        if (!this.f1101a.isInEditMode() && !d() && i5 <= i6 && (charSequence instanceof Spannable)) {
            int d4 = f.b().d();
            if (d4 != 0) {
                if (d4 == 1) {
                    f.b().r((Spannable) charSequence, i4, i4 + i6, this.f1104d, this.f1105e);
                    return;
                } else if (d4 != 3) {
                    return;
                }
            }
            f.b().s(a());
        }
    }
}
