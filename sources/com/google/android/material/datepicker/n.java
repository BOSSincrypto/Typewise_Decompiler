package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;

class n extends BaseAdapter {

    /* renamed from: e  reason: collision with root package name */
    static final int f12010e = y.k().getMaximum(4);

    /* renamed from: f  reason: collision with root package name */
    private static final int f12011f = ((y.k().getMaximum(5) + y.k().getMaximum(7)) - 1);

    /* renamed from: a  reason: collision with root package name */
    final m f12012a;

    /* renamed from: b  reason: collision with root package name */
    private Collection f12013b;

    /* renamed from: c  reason: collision with root package name */
    c f12014c;

    /* renamed from: d  reason: collision with root package name */
    final a f12015d;

    n(m mVar, d dVar, a aVar, h hVar) {
        this.f12012a = mVar;
        this.f12015d = aVar;
        this.f12013b = dVar.h();
    }

    private String c(Context context, long j4) {
        return f.a(context, j4, j(j4), i(j4), g(j4));
    }

    private void f(Context context) {
        if (this.f12014c == null) {
            this.f12014c = new c(context);
        }
    }

    private boolean h(long j4) {
        throw null;
    }

    private boolean j(long j4) {
        if (y.i().getTimeInMillis() == j4) {
            return true;
        }
        return false;
    }

    private void m(TextView textView, long j4, int i4) {
        b bVar;
        if (textView != null) {
            textView.setContentDescription(c(textView.getContext(), j4));
            if (this.f12015d.y().d(j4)) {
                textView.setEnabled(true);
                boolean h4 = h(j4);
                textView.setSelected(h4);
                if (h4) {
                    bVar = this.f12014c.f11955b;
                } else if (j(j4)) {
                    bVar = this.f12014c.f11956c;
                } else {
                    bVar = this.f12014c.f11954a;
                }
            } else {
                textView.setEnabled(false);
                bVar = this.f12014c.f11960g;
            }
            bVar.b(textView);
        }
    }

    private void n(MaterialCalendarGridView materialCalendarGridView, long j4) {
        if (m.v(j4).equals(this.f12012a)) {
            int z3 = this.f12012a.z(j4);
            m((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().a(z3) - materialCalendarGridView.getFirstVisiblePosition()), j4, z3);
        }
    }

    /* access modifiers changed from: package-private */
    public int a(int i4) {
        return b() + (i4 - 1);
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f12012a.x(this.f12015d.A());
    }

    /* renamed from: d */
    public Long getItem(int i4) {
        if (i4 < b() || i4 > k()) {
            return null;
        }
        return Long.valueOf(this.f12012a.y(l(i4)));
    }

    /* JADX WARNING: type inference failed for: r7v9, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0063 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0064  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            r0 = 1
            android.content.Context r1 = r8.getContext()
            r5.f(r1)
            r1 = r7
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = 0
            if (r7 != 0) goto L_0x001f
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r1 = z1.g.mtrl_calendar_day
            android.view.View r7 = r7.inflate(r1, r8, r2)
            r1 = r7
            android.widget.TextView r1 = (android.widget.TextView) r1
        L_0x001f:
            int r7 = r5.b()
            int r7 = r6 - r7
            if (r7 < 0) goto L_0x0054
            com.google.android.material.datepicker.m r8 = r5.f12012a
            int r3 = r8.f12007e
            if (r7 < r3) goto L_0x002e
            goto L_0x0054
        L_0x002e:
            int r7 = r7 + r0
            r1.setTag(r8)
            android.content.res.Resources r8 = r1.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r4[r2] = r3
            java.lang.String r3 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r3, r4)
            r1.setText(r8)
            r1.setVisibility(r2)
            r1.setEnabled(r0)
            goto L_0x005d
        L_0x0054:
            r7 = 8
            r1.setVisibility(r7)
            r1.setEnabled(r2)
            r7 = -1
        L_0x005d:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L_0x0064
            return r1
        L_0x0064:
            long r2 = r6.longValue()
            r5.m(r1, r2, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.n.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    /* access modifiers changed from: package-private */
    public boolean g(long j4) {
        throw null;
    }

    public int getCount() {
        return f12011f;
    }

    public long getItemId(int i4) {
        return (long) (i4 / this.f12012a.f12006d);
    }

    public boolean hasStableIds() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean i(long j4) {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public int k() {
        return (b() + this.f12012a.f12007e) - 1;
    }

    /* access modifiers changed from: package-private */
    public int l(int i4) {
        return (i4 - b()) + 1;
    }

    public void o(MaterialCalendarGridView materialCalendarGridView) {
        for (Long longValue : this.f12013b) {
            n(materialCalendarGridView, longValue.longValue());
        }
    }

    /* access modifiers changed from: package-private */
    public boolean p(int i4) {
        if (i4 < b() || i4 > k()) {
            return false;
        }
        return true;
    }
}
