package P;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.f;

class h implements TransformationMethod {

    /* renamed from: a  reason: collision with root package name */
    private final TransformationMethod f1108a;

    h(TransformationMethod transformationMethod) {
        this.f1108a = transformationMethod;
    }

    public TransformationMethod a() {
        return this.f1108a;
    }

    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f1108a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || f.b().d() != 1) {
            return charSequence;
        }
        return f.b().o(charSequence);
    }

    public void onFocusChanged(View view, CharSequence charSequence, boolean z3, int i4, Rect rect) {
        TransformationMethod transformationMethod = this.f1108a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z3, i4, rect);
        }
    }
}
