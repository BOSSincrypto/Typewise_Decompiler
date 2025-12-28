package com.google.android.material.bottomsheet;

import android.view.View;
import androidx.core.view.C0409b0;
import androidx.core.view.C0435o0;
import java.util.Iterator;
import java.util.List;

class a extends C0409b0.b {

    /* renamed from: c  reason: collision with root package name */
    private final View f11687c;

    /* renamed from: d  reason: collision with root package name */
    private int f11688d;

    /* renamed from: e  reason: collision with root package name */
    private int f11689e;

    /* renamed from: f  reason: collision with root package name */
    private final int[] f11690f = new int[2];

    public a(View view) {
        super(0);
        this.f11687c = view;
    }

    public void b(C0409b0 b0Var) {
        this.f11687c.setTranslationY(0.0f);
    }

    public void c(C0409b0 b0Var) {
        this.f11687c.getLocationOnScreen(this.f11690f);
        this.f11688d = this.f11690f[1];
    }

    public C0435o0 d(C0435o0 o0Var, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0409b0 b0Var = (C0409b0) it.next();
            if ((b0Var.c() & C0435o0.m.b()) != 0) {
                this.f11687c.setTranslationY((float) A1.a.c(this.f11689e, 0, b0Var.b()));
                break;
            }
        }
        return o0Var;
    }

    public C0409b0.a e(C0409b0 b0Var, C0409b0.a aVar) {
        this.f11687c.getLocationOnScreen(this.f11690f);
        int i4 = this.f11688d - this.f11690f[1];
        this.f11689e = i4;
        this.f11687c.setTranslationY((float) i4);
        return aVar;
    }
}
