package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.P;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.i;
import com.google.android.material.internal.m;
import com.google.android.material.textfield.TextInputLayout;
import z1.e;
import z1.g;

class ChipTextInputComboView extends FrameLayout implements Checkable {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Chip f12457a;

    /* renamed from: b  reason: collision with root package name */
    private final TextInputLayout f12458b;

    /* renamed from: c  reason: collision with root package name */
    private final EditText f12459c;

    /* renamed from: d  reason: collision with root package name */
    private TextWatcher f12460d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f12461e;

    private class b extends i {
        private b() {
        }

        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f12457a.setText(ChipTextInputComboView.this.c("00"));
                return;
            }
            String a4 = ChipTextInputComboView.this.c(editable);
            Chip b4 = ChipTextInputComboView.this.f12457a;
            if (TextUtils.isEmpty(a4)) {
                a4 = ChipTextInputComboView.this.c("00");
            }
            b4.setText(a4);
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: private */
    public String c(CharSequence charSequence) {
        return f.t(getResources(), charSequence);
    }

    private void d() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f12459c.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    public boolean isChecked() {
        return this.f12457a.isChecked();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d();
    }

    public void setChecked(boolean z3) {
        int i4;
        int i5;
        this.f12457a.setChecked(z3);
        EditText editText = this.f12459c;
        if (z3) {
            i4 = 0;
        } else {
            i4 = 4;
        }
        editText.setVisibility(i4);
        Chip chip = this.f12457a;
        if (z3) {
            i5 = 8;
        } else {
            i5 = 0;
        }
        chip.setVisibility(i5);
        if (isChecked()) {
            m.k(this.f12459c, false);
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f12457a.setOnClickListener(onClickListener);
    }

    public void setTag(int i4, Object obj) {
        this.f12457a.setTag(i4, obj);
    }

    public void toggle() {
        this.f12457a.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(g.material_time_chip, this, false);
        this.f12457a = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(g.material_time_input, this, false);
        this.f12458b = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f12459c = editText;
        editText.setVisibility(4);
        b bVar = new b();
        this.f12460d = bVar;
        editText.addTextChangedListener(bVar);
        d();
        addView(chip);
        addView(textInputLayout);
        this.f12461e = (TextView) findViewById(e.material_label);
        editText.setId(P.k());
        P.B0(this.f12461e, editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}
