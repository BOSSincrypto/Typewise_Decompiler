package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

abstract class s {
    static int a(RecyclerView.z zVar, p pVar, View view, View view2, RecyclerView.o oVar, boolean z3) {
        if (oVar.W() == 0 || zVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z3) {
            return Math.abs(oVar.q0(view) - oVar.q0(view2)) + 1;
        }
        return Math.min(pVar.n(), pVar.d(view2) - pVar.g(view));
    }

    static int b(RecyclerView.z zVar, p pVar, View view, View view2, RecyclerView.o oVar, boolean z3, boolean z4) {
        int i4;
        if (oVar.W() == 0 || zVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(oVar.q0(view), oVar.q0(view2));
        int max = Math.max(oVar.q0(view), oVar.q0(view2));
        if (z4) {
            i4 = Math.max(0, (zVar.b() - max) - 1);
        } else {
            i4 = Math.max(0, min);
        }
        if (!z3) {
            return i4;
        }
        return Math.round((((float) i4) * (((float) Math.abs(pVar.d(view2) - pVar.g(view))) / ((float) (Math.abs(oVar.q0(view) - oVar.q0(view2)) + 1)))) + ((float) (pVar.m() - pVar.g(view))));
    }

    static int c(RecyclerView.z zVar, p pVar, View view, View view2, RecyclerView.o oVar, boolean z3) {
        if (oVar.W() == 0 || zVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z3) {
            return zVar.b();
        }
        return (int) ((((float) (pVar.d(view2) - pVar.g(view))) / ((float) (Math.abs(oVar.q0(view) - oVar.q0(view2)) + 1))) * ((float) zVar.b()));
    }
}
