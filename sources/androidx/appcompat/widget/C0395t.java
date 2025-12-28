package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.widget.i;
import n.j;

/* renamed from: androidx.appcompat.widget.t  reason: case insensitive filesystem */
class C0395t extends PopupWindow {

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f3661b = false;

    /* renamed from: a  reason: collision with root package name */
    private boolean f3662a;

    public C0395t(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        a(context, attributeSet, i4, i5);
    }

    private void a(Context context, AttributeSet attributeSet, int i4, int i5) {
        c0 v3 = c0.v(context, attributeSet, j.f14937Y1, i4, i5);
        int i6 = j.f14946a2;
        if (v3.s(i6)) {
            b(v3.a(i6, false));
        }
        setBackgroundDrawable(v3.g(j.f14941Z1));
        v3.w();
    }

    private void b(boolean z3) {
        if (f3661b) {
            this.f3662a = z3;
        } else {
            i.a(this, z3);
        }
    }

    public void showAsDropDown(View view, int i4, int i5) {
        if (f3661b && this.f3662a) {
            i5 -= view.getHeight();
        }
        super.showAsDropDown(view, i4, i5);
    }

    public void update(View view, int i4, int i5, int i6, int i7) {
        if (f3661b && this.f3662a) {
            i5 -= view.getHeight();
        }
        super.update(view, i4, i5, i6, i7);
    }

    public void showAsDropDown(View view, int i4, int i5, int i6) {
        if (f3661b && this.f3662a) {
            i5 -= view.getHeight();
        }
        super.showAsDropDown(view, i4, i5, i6);
    }
}
