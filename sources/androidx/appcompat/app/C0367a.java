package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.appcompat.view.b;
import n.j;

/* renamed from: androidx.appcompat.app.a  reason: case insensitive filesystem */
public abstract class C0367a {
    public boolean g() {
        return false;
    }

    public abstract boolean h();

    public abstract void i(boolean z3);

    public abstract int j();

    public abstract Context k();

    public boolean l() {
        return false;
    }

    public void m(Configuration configuration) {
    }

    /* access modifiers changed from: package-private */
    public void n() {
    }

    public abstract boolean o(int i4, KeyEvent keyEvent);

    public boolean p(KeyEvent keyEvent) {
        return false;
    }

    public boolean q() {
        return false;
    }

    public abstract void r(boolean z3);

    public abstract void s(boolean z3);

    public abstract void t(CharSequence charSequence);

    public b u(b.a aVar) {
        return null;
    }

    /* renamed from: androidx.appcompat.app.a$a  reason: collision with other inner class name */
    public static class C0051a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f2603a = 8388627;

        public C0051a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f15038t);
            this.f2603a = obtainStyledAttributes.getInt(j.f15043u, 0);
            obtainStyledAttributes.recycle();
        }

        public C0051a(int i4, int i5) {
            super(i4, i5);
        }

        public C0051a(C0051a aVar) {
            super(aVar);
            this.f2603a = aVar.f2603a;
        }

        public C0051a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
