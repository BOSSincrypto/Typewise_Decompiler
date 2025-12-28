package com.google.android.material.textfield;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import androidx.core.view.accessibility.A;
import androidx.core.view.accessibility.C0406c;
import com.google.android.material.internal.CheckableImageButton;

abstract class t {

    /* renamed from: a  reason: collision with root package name */
    final TextInputLayout f12403a;

    /* renamed from: b  reason: collision with root package name */
    final s f12404b;

    /* renamed from: c  reason: collision with root package name */
    final Context f12405c;

    /* renamed from: d  reason: collision with root package name */
    final CheckableImageButton f12406d;

    t(s sVar) {
        this.f12403a = sVar.f12373a;
        this.f12404b = sVar;
        this.f12405c = sVar.getContext();
        this.f12406d = sVar.r();
    }

    /* access modifiers changed from: package-private */
    public void a(Editable editable) {
    }

    /* access modifiers changed from: package-private */
    public void b(CharSequence charSequence, int i4, int i5, int i6) {
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public View.OnFocusChangeListener e() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public View.OnClickListener f() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public View.OnFocusChangeListener g() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public C0406c.b h() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean i(int i4) {
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean j() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public void n(EditText editText) {
    }

    /* access modifiers changed from: package-private */
    public void o(View view, A a4) {
    }

    /* access modifiers changed from: package-private */
    public void p(View view, AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: package-private */
    public void q(boolean z3) {
    }

    /* access modifiers changed from: package-private */
    public final void r() {
        this.f12404b.L(false);
    }

    /* access modifiers changed from: package-private */
    public void s() {
    }

    /* access modifiers changed from: package-private */
    public boolean t() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public void u() {
    }
}
