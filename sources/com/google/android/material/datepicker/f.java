package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Build;
import android.text.format.DateUtils;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import z1.h;

abstract class f {
    static String a(Context context, long j4, boolean z3, boolean z4, boolean z5) {
        String d4 = d(j4);
        if (z3) {
            d4 = String.format(context.getString(h.mtrl_picker_today_description), new Object[]{d4});
        }
        if (z4) {
            return String.format(context.getString(h.mtrl_picker_start_date_description), new Object[]{d4});
        } else if (!z5) {
            return d4;
        } else {
            return String.format(context.getString(h.mtrl_picker_end_date_description), new Object[]{d4});
        }
    }

    static String b(long j4) {
        return c(j4, Locale.getDefault());
    }

    static String c(long j4, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return y.f(locale).format(new Date(j4));
        }
        return y.e(locale).format(new Date(j4));
    }

    static String d(long j4) {
        if (i(j4)) {
            return b(j4);
        }
        return g(j4);
    }

    static String e(Context context, int i4) {
        if (y.i().get(1) == i4) {
            return String.format(context.getString(h.mtrl_picker_navigate_to_current_year_description), new Object[]{Integer.valueOf(i4)});
        }
        return String.format(context.getString(h.mtrl_picker_navigate_to_year_description), new Object[]{Integer.valueOf(i4)});
    }

    static String f(long j4) {
        if (Build.VERSION.SDK_INT >= 24) {
            return y.m(Locale.getDefault()).format(new Date(j4));
        }
        return DateUtils.formatDateTime((Context) null, j4, 8228);
    }

    static String g(long j4) {
        return h(j4, Locale.getDefault());
    }

    static String h(long j4, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return y.n(locale).format(new Date(j4));
        }
        return y.e(locale).format(new Date(j4));
    }

    private static boolean i(long j4) {
        Calendar i4 = y.i();
        Calendar k4 = y.k();
        k4.setTimeInMillis(j4);
        if (i4.get(1) == k4.get(1)) {
            return true;
        }
        return false;
    }
}
