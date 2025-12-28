package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;

abstract class r extends LinearLayoutManager {

    class a extends l {
        a(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        public float v(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }

    r(Context context, int i4, boolean z3) {
        super(context, i4, z3);
    }

    public void T1(RecyclerView recyclerView, RecyclerView.z zVar, int i4) {
        a aVar = new a(recyclerView.getContext());
        aVar.p(i4);
        U1(aVar);
    }
}
