package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.view.P;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
import z1.e;
import z1.g;

class o extends RecyclerView.Adapter {

    /* renamed from: d  reason: collision with root package name */
    private final a f12016d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final MaterialCalendar.l f12017e;

    /* renamed from: f  reason: collision with root package name */
    private final int f12018f;

    class a implements AdapterView.OnItemClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MaterialCalendarGridView f12019a;

        a(MaterialCalendarGridView materialCalendarGridView) {
            this.f12019a = materialCalendarGridView;
        }

        public void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
            if (this.f12019a.getAdapter().p(i4)) {
                o.this.f12017e.a(this.f12019a.getAdapter().getItem(i4).longValue());
            }
        }
    }

    public static class b extends RecyclerView.D {

        /* renamed from: u  reason: collision with root package name */
        final TextView f12021u;

        /* renamed from: v  reason: collision with root package name */
        final MaterialCalendarGridView f12022v;

        b(LinearLayout linearLayout, boolean z3) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(e.month_title);
            this.f12021u = textView;
            P.p0(textView, true);
            this.f12022v = (MaterialCalendarGridView) linearLayout.findViewById(e.month_grid);
            if (!z3) {
                textView.setVisibility(8);
            }
        }
    }

    o(Context context, d dVar, a aVar, h hVar, MaterialCalendar.l lVar) {
        int i4;
        m D3 = aVar.D();
        m z3 = aVar.z();
        m C3 = aVar.C();
        if (D3.compareTo(C3) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (C3.compareTo(z3) <= 0) {
            int u3 = n.f12010e * MaterialCalendar.u(context);
            if (k.D(context)) {
                i4 = MaterialCalendar.u(context);
            } else {
                i4 = 0;
            }
            this.f12018f = u3 + i4;
            this.f12016d = aVar;
            this.f12017e = lVar;
            x(true);
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    /* access modifiers changed from: package-private */
    public m A(int i4) {
        return this.f12016d.D().C(i4);
    }

    /* access modifiers changed from: package-private */
    public CharSequence B(int i4) {
        return A(i4).A();
    }

    /* access modifiers changed from: package-private */
    public int C(m mVar) {
        return this.f12016d.D().D(mVar);
    }

    /* renamed from: D */
    public void o(b bVar, int i4) {
        m C3 = this.f12016d.D().C(i4);
        bVar.f12021u.setText(C3.A());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f12022v.findViewById(e.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !C3.equals(materialCalendarGridView.getAdapter().f12012a)) {
            n nVar = new n(C3, (d) null, this.f12016d, (h) null);
            materialCalendarGridView.setNumColumns(C3.f12006d);
            materialCalendarGridView.setAdapter((ListAdapter) nVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().o(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    /* renamed from: E */
    public b q(ViewGroup viewGroup, int i4) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(g.mtrl_calendar_month_labeled, viewGroup, false);
        if (!k.D(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.p(-1, this.f12018f));
        return new b(linearLayout, true);
    }

    public int d() {
        return this.f12016d.B();
    }

    public long e(int i4) {
        return this.f12016d.D().C(i4).B();
    }
}
