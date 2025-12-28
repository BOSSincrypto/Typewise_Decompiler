package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

final class m implements Comparable, Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Calendar f12003a;

    /* renamed from: b  reason: collision with root package name */
    final int f12004b;

    /* renamed from: c  reason: collision with root package name */
    final int f12005c;

    /* renamed from: d  reason: collision with root package name */
    final int f12006d;

    /* renamed from: e  reason: collision with root package name */
    final int f12007e;

    /* renamed from: f  reason: collision with root package name */
    final long f12008f;

    /* renamed from: g  reason: collision with root package name */
    private String f12009g;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public m createFromParcel(Parcel parcel) {
            return m.u(parcel.readInt(), parcel.readInt());
        }

        /* renamed from: b */
        public m[] newArray(int i4) {
            return new m[i4];
        }
    }

    private m(Calendar calendar) {
        calendar.set(5, 1);
        Calendar c4 = y.c(calendar);
        this.f12003a = c4;
        this.f12004b = c4.get(2);
        this.f12005c = c4.get(1);
        this.f12006d = c4.getMaximum(7);
        this.f12007e = c4.getActualMaximum(5);
        this.f12008f = c4.getTimeInMillis();
    }

    static m u(int i4, int i5) {
        Calendar k4 = y.k();
        k4.set(1, i4);
        k4.set(2, i5);
        return new m(k4);
    }

    static m v(long j4) {
        Calendar k4 = y.k();
        k4.setTimeInMillis(j4);
        return new m(k4);
    }

    static m w() {
        return new m(y.i());
    }

    /* access modifiers changed from: package-private */
    public String A() {
        if (this.f12009g == null) {
            this.f12009g = f.f(this.f12003a.getTimeInMillis());
        }
        return this.f12009g;
    }

    /* access modifiers changed from: package-private */
    public long B() {
        return this.f12003a.getTimeInMillis();
    }

    /* access modifiers changed from: package-private */
    public m C(int i4) {
        Calendar c4 = y.c(this.f12003a);
        c4.add(2, i4);
        return new m(c4);
    }

    /* access modifiers changed from: package-private */
    public int D(m mVar) {
        if (this.f12003a instanceof GregorianCalendar) {
            return ((mVar.f12005c - this.f12005c) * 12) + (mVar.f12004b - this.f12004b);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f12004b == mVar.f12004b && this.f12005c == mVar.f12005c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f12004b), Integer.valueOf(this.f12005c)});
    }

    /* renamed from: t */
    public int compareTo(m mVar) {
        return this.f12003a.compareTo(mVar.f12003a);
    }

    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f12005c);
        parcel.writeInt(this.f12004b);
    }

    /* access modifiers changed from: package-private */
    public int x(int i4) {
        int i5 = this.f12003a.get(7);
        if (i4 <= 0) {
            i4 = this.f12003a.getFirstDayOfWeek();
        }
        int i6 = i5 - i4;
        if (i6 < 0) {
            return i6 + this.f12006d;
        }
        return i6;
    }

    /* access modifiers changed from: package-private */
    public long y(int i4) {
        Calendar c4 = y.c(this.f12003a);
        c4.set(5, i4);
        return c4.getTimeInMillis();
    }

    /* access modifiers changed from: package-private */
    public int z(long j4) {
        Calendar c4 = y.c(this.f12003a);
        c4.setTimeInMillis(j4);
        return c4.get(5);
    }
}
