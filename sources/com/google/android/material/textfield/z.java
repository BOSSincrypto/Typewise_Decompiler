package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.widget.EditText;
import z1.d;
import z1.h;

class z extends t {

    /* renamed from: e  reason: collision with root package name */
    private int f12454e = d.design_password_eye;

    /* renamed from: f  reason: collision with root package name */
    private EditText f12455f;

    /* renamed from: g  reason: collision with root package name */
    private final View.OnClickListener f12456g = new y(this);

    z(s sVar, int i4) {
        super(sVar);
        if (i4 != 0) {
            this.f12454e = i4;
        }
    }

    private boolean w() {
        EditText editText = this.f12455f;
        if (editText == null || !(editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            return false;
        }
        return true;
    }

    private static boolean x(EditText editText) {
        if (editText == null || (editText.getInputType() != 16 && editText.getInputType() != 128 && editText.getInputType() != 144 && editText.getInputType() != 224)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void y(View view) {
        EditText editText = this.f12455f;
        if (editText != null) {
            int selectionEnd = editText.getSelectionEnd();
            if (w()) {
                this.f12455f.setTransformationMethod((TransformationMethod) null);
            } else {
                this.f12455f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            if (selectionEnd >= 0) {
                this.f12455f.setSelection(selectionEnd);
            }
            r();
        }
    }

    /* access modifiers changed from: package-private */
    public void b(CharSequence charSequence, int i4, int i5, int i6) {
        r();
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return h.password_toggle_content_description;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.f12454e;
    }

    /* access modifiers changed from: package-private */
    public View.OnClickListener f() {
        return this.f12456g;
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return !w();
    }

    /* access modifiers changed from: package-private */
    public void n(EditText editText) {
        this.f12455f = editText;
        r();
    }

    /* access modifiers changed from: package-private */
    public void s() {
        if (x(this.f12455f)) {
            this.f12455f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    /* access modifiers changed from: package-private */
    public void u() {
        EditText editText = this.f12455f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
