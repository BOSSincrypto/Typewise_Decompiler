package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;
import z1.g;

class z extends RecyclerView.Adapter {

    /* renamed from: d  reason: collision with root package name */
    private final MaterialCalendar f12029d;

    public static class a extends RecyclerView.D {

        /* renamed from: u  reason: collision with root package name */
        final TextView f12030u;

        a(TextView textView) {
            super(textView);
            this.f12030u = textView;
        }
    }

    z(MaterialCalendar materialCalendar) {
        this.f12029d = materialCalendar;
    }

    /* access modifiers changed from: package-private */
    public int A(int i4) {
        return this.f12029d.q().D().f12005c + i4;
    }

    /* renamed from: B */
    public void o(a aVar, int i4) {
        int A3 = A(i4);
        aVar.f12030u.setText(String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(A3)}));
        TextView textView = aVar.f12030u;
        textView.setContentDescription(f.e(textView.getContext(), A3));
        c r4 = this.f12029d.r();
        if (y.i().get(1) == A3) {
            b bVar = r4.f11959f;
        } else {
            b bVar2 = r4.f11957d;
        }
        this.f12029d.t();
        throw null;
    }

    /* renamed from: C */
    public a q(ViewGroup viewGroup, int i4) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(g.mtrl_calendar_year, viewGroup, false));
    }

    public int d() {
        return this.f12029d.q().E();
    }

    /* access modifiers changed from: package-private */
    public int z(int i4) {
        return i4 - this.f12029d.q().D().f12005c;
    }
}
