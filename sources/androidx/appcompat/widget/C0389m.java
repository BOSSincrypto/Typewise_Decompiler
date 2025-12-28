package androidx.appcompat.widget;

import P.a;
import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import n.j;

/* renamed from: androidx.appcompat.widget.m  reason: case insensitive filesystem */
class C0389m {

    /* renamed from: a  reason: collision with root package name */
    private final EditText f3638a;

    /* renamed from: b  reason: collision with root package name */
    private final a f3639b;

    C0389m(EditText editText) {
        this.f3638a = editText;
        this.f3639b = new a(editText, false);
    }

    /* access modifiers changed from: package-private */
    public KeyListener a(KeyListener keyListener) {
        if (b(keyListener)) {
            return this.f3639b.a(keyListener);
        }
        return keyListener;
    }

    /* access modifiers changed from: package-private */
    public boolean b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void c(AttributeSet attributeSet, int i4) {
        TypedArray obtainStyledAttributes = this.f3638a.getContext().obtainStyledAttributes(attributeSet, j.f14974g0, i4, 0);
        try {
            int i5 = j.f15044u0;
            boolean z3 = true;
            if (obtainStyledAttributes.hasValue(i5)) {
                z3 = obtainStyledAttributes.getBoolean(i5, true);
            }
            obtainStyledAttributes.recycle();
            e(z3);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public InputConnection d(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f3639b.b(inputConnection, editorInfo);
    }

    /* access modifiers changed from: package-private */
    public void e(boolean z3) {
        this.f3639b.c(z3);
    }
}
