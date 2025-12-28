package P;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.f;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

final class d implements InputFilter {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f1090a;

    /* renamed from: b  reason: collision with root package name */
    private f.e f1091b;

    private static class a extends f.e {

        /* renamed from: a  reason: collision with root package name */
        private final Reference f1092a;

        /* renamed from: b  reason: collision with root package name */
        private final Reference f1093b;

        a(TextView textView, d dVar) {
            this.f1092a = new WeakReference(textView);
            this.f1093b = new WeakReference(dVar);
        }

        private boolean c(TextView textView, InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }

        public void b() {
            CharSequence text;
            CharSequence o4;
            super.b();
            TextView textView = (TextView) this.f1092a.get();
            if (c(textView, (InputFilter) this.f1093b.get()) && textView.isAttachedToWindow() && (text = textView.getText()) != (o4 = f.b().o(text))) {
                int selectionStart = Selection.getSelectionStart(o4);
                int selectionEnd = Selection.getSelectionEnd(o4);
                textView.setText(o4);
                if (o4 instanceof Spannable) {
                    d.b((Spannable) o4, selectionStart, selectionEnd);
                }
            }
        }
    }

    d(TextView textView) {
        this.f1090a = textView;
    }

    private f.e a() {
        if (this.f1091b == null) {
            this.f1091b = new a(this.f1090a, this);
        }
        return this.f1091b;
    }

    static void b(Spannable spannable, int i4, int i5) {
        if (i4 >= 0 && i5 >= 0) {
            Selection.setSelection(spannable, i4, i5);
        } else if (i4 >= 0) {
            Selection.setSelection(spannable, i4);
        } else if (i5 >= 0) {
            Selection.setSelection(spannable, i5);
        }
    }

    public CharSequence filter(CharSequence charSequence, int i4, int i5, Spanned spanned, int i6, int i7) {
        if (this.f1090a.isInEditMode()) {
            return charSequence;
        }
        int d4 = f.b().d();
        if (d4 != 0) {
            if (d4 != 1) {
                if (d4 != 3) {
                    return charSequence;
                }
            } else if ((i7 == 0 && i6 == 0 && spanned.length() == 0 && charSequence == this.f1090a.getText()) || charSequence == null) {
                return charSequence;
            } else {
                if (!(i4 == 0 && i5 == charSequence.length())) {
                    charSequence = charSequence.subSequence(i4, i5);
                }
                return f.b().p(charSequence, 0, charSequence.length());
            }
        }
        f.b().s(a());
        return charSequence;
    }
}
