package androidx.appcompat.widget;

import P.f;
import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import n.j;

/* renamed from: androidx.appcompat.widget.n  reason: case insensitive filesystem */
class C0390n {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f3642a;

    /* renamed from: b  reason: collision with root package name */
    private final f f3643b;

    C0390n(TextView textView) {
        this.f3642a = textView;
        this.f3643b = new f(textView, false);
    }

    /* access modifiers changed from: package-private */
    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f3643b.a(inputFilterArr);
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void b(AttributeSet attributeSet, int i4) {
        TypedArray obtainStyledAttributes = this.f3642a.getContext().obtainStyledAttributes(attributeSet, j.f14974g0, i4, 0);
        try {
            int i5 = j.f15044u0;
            boolean z3 = true;
            if (obtainStyledAttributes.hasValue(i5)) {
                z3 = obtainStyledAttributes.getBoolean(i5, true);
            }
            obtainStyledAttributes.recycle();
            d(z3);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public void c(boolean z3) {
        this.f3643b.b(z3);
    }

    /* access modifiers changed from: package-private */
    public void d(boolean z3) {
        this.f3643b.c(z3);
    }
}
