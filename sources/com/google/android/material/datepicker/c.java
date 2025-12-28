package com.google.android.material.datepicker;

import N1.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import z1.C0970a;
import z1.j;

final class c {

    /* renamed from: a  reason: collision with root package name */
    final b f11954a;

    /* renamed from: b  reason: collision with root package name */
    final b f11955b;

    /* renamed from: c  reason: collision with root package name */
    final b f11956c;

    /* renamed from: d  reason: collision with root package name */
    final b f11957d;

    /* renamed from: e  reason: collision with root package name */
    final b f11958e;

    /* renamed from: f  reason: collision with root package name */
    final b f11959f;

    /* renamed from: g  reason: collision with root package name */
    final b f11960g;

    /* renamed from: h  reason: collision with root package name */
    final Paint f11961h;

    c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(b.d(context, C0970a.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), j.f16737y2);
        this.f11954a = b.a(context, obtainStyledAttributes.getResourceId(j.f16525C2, 0));
        this.f11960g = b.a(context, obtainStyledAttributes.getResourceId(j.f16517A2, 0));
        this.f11955b = b.a(context, obtainStyledAttributes.getResourceId(j.f16521B2, 0));
        this.f11956c = b.a(context, obtainStyledAttributes.getResourceId(j.f16529D2, 0));
        ColorStateList a4 = N1.c.a(context, obtainStyledAttributes, j.f16533E2);
        this.f11957d = b.a(context, obtainStyledAttributes.getResourceId(j.f16541G2, 0));
        this.f11958e = b.a(context, obtainStyledAttributes.getResourceId(j.f16537F2, 0));
        this.f11959f = b.a(context, obtainStyledAttributes.getResourceId(j.f16545H2, 0));
        Paint paint = new Paint();
        this.f11961h = paint;
        paint.setColor(a4.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
