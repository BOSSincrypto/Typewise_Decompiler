package P;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.emoji2.text.f;

final class c extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f1088a;

    /* renamed from: b  reason: collision with root package name */
    private final a f1089b;

    public static class a {
        public boolean a(InputConnection inputConnection, Editable editable, int i4, int i5, boolean z3) {
            return f.e(inputConnection, editable, i4, i5, z3);
        }

        public void b(EditorInfo editorInfo) {
            if (f.h()) {
                f.b().u(editorInfo);
            }
        }
    }

    c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new a());
    }

    private Editable a() {
        return this.f1088a.getEditableText();
    }

    public boolean deleteSurroundingText(int i4, int i5) {
        if (this.f1089b.a(this, a(), i4, i5, false) || super.deleteSurroundingText(i4, i5)) {
            return true;
        }
        return false;
    }

    public boolean deleteSurroundingTextInCodePoints(int i4, int i5) {
        if (this.f1089b.a(this, a(), i4, i5, true) || super.deleteSurroundingTextInCodePoints(i4, i5)) {
            return true;
        }
        return false;
    }

    c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo, a aVar) {
        super(inputConnection, false);
        this.f1088a = textView;
        this.f1089b = aVar;
        aVar.b(editorInfo);
    }
}
