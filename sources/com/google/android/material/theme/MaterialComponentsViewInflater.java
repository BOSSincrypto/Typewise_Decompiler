package com.google.android.material.theme;

import D1.d;
import M1.a;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.y;
import androidx.appcompat.widget.C0380d;
import androidx.appcompat.widget.C0382f;
import androidx.appcompat.widget.C0383g;
import androidx.appcompat.widget.C0397v;
import androidx.appcompat.widget.D;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.w;

public class MaterialComponentsViewInflater extends y {
    /* access modifiers changed from: protected */
    public C0380d c(Context context, AttributeSet attributeSet) {
        return new w(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0382f d(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0383g e(Context context, AttributeSet attributeSet) {
        return new d(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0397v k(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public D o(Context context, AttributeSet attributeSet) {
        return new S1.a(context, attributeSet);
    }
}
