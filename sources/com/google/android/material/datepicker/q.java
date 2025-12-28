package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

abstract class q extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    protected final LinkedHashSet f12023a = new LinkedHashSet();

    q() {
    }

    /* access modifiers changed from: package-private */
    public boolean h(p pVar) {
        return this.f12023a.add(pVar);
    }

    /* access modifiers changed from: package-private */
    public void i() {
        this.f12023a.clear();
    }
}
