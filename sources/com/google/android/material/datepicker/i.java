package com.google.android.material.datepicker;

import android.os.Build;
import android.widget.BaseAdapter;
import java.util.Calendar;

class i extends BaseAdapter {

    /* renamed from: d  reason: collision with root package name */
    private static final int f11963d;

    /* renamed from: a  reason: collision with root package name */
    private final Calendar f11964a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11965b;

    /* renamed from: c  reason: collision with root package name */
    private final int f11966c;

    static {
        int i4;
        if (Build.VERSION.SDK_INT >= 26) {
            i4 = 4;
        } else {
            i4 = 1;
        }
        f11963d = i4;
    }

    public i() {
        Calendar k4 = y.k();
        this.f11964a = k4;
        this.f11965b = k4.getMaximum(7);
        this.f11966c = k4.getFirstDayOfWeek();
    }

    private int b(int i4) {
        int i5 = i4 + this.f11966c;
        int i6 = this.f11965b;
        if (i5 > i6) {
            return i5 - i6;
        }
        return i5;
    }

    /* renamed from: a */
    public Integer getItem(int i4) {
        if (i4 >= this.f11965b) {
            return null;
        }
        return Integer.valueOf(b(i4));
    }

    public int getCount() {
        return this.f11965b;
    }

    public long getItemId(int i4) {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r6v8, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r5, android.view.View r6, android.view.ViewGroup r7) {
        /*
            r4 = this;
            r0 = 0
            r1 = r6
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r6 != 0) goto L_0x0017
            android.content.Context r6 = r7.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            int r1 = z1.g.mtrl_calendar_day_of_week
            android.view.View r6 = r6.inflate(r1, r7, r0)
            r1 = r6
            android.widget.TextView r1 = (android.widget.TextView) r1
        L_0x0017:
            java.util.Calendar r6 = r4.f11964a
            int r5 = r4.b(r5)
            r2 = 7
            r6.set(r2, r5)
            android.content.res.Resources r5 = r1.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            java.util.Locale r5 = r5.locale
            java.util.Calendar r6 = r4.f11964a
            int r3 = f11963d
            java.lang.String r5 = r6.getDisplayName(r2, r3, r5)
            r1.setText(r5)
            android.content.Context r5 = r7.getContext()
            int r6 = z1.h.mtrl_picker_day_of_week_column_header
            java.lang.String r5 = r5.getString(r6)
            java.util.Calendar r6 = r4.f11964a
            r7 = 2
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.String r6 = r6.getDisplayName(r2, r7, r3)
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r0] = r6
            java.lang.String r5 = java.lang.String.format(r5, r7)
            r1.setContentDescription(r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.i.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public i(int i4) {
        Calendar k4 = y.k();
        this.f11964a = k4;
        this.f11965b = k4.getMaximum(7);
        this.f11966c = i4;
    }
}
