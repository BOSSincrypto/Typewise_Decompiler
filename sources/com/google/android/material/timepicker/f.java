package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final c f12517a;

    /* renamed from: b  reason: collision with root package name */
    private final c f12518b;

    /* renamed from: c  reason: collision with root package name */
    final int f12519c;

    /* renamed from: d  reason: collision with root package name */
    int f12520d;

    /* renamed from: e  reason: collision with root package name */
    int f12521e;

    /* renamed from: f  reason: collision with root package name */
    int f12522f;

    /* renamed from: g  reason: collision with root package name */
    int f12523g;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        /* renamed from: b */
        public f[] newArray(int i4) {
            return new f[i4];
        }
    }

    public f(int i4, int i5, int i6, int i7) {
        this.f12520d = i4;
        this.f12521e = i5;
        this.f12522f = i6;
        this.f12519c = i7;
        this.f12523g = v(i4);
        this.f12517a = new c(59);
        this.f12518b = new c(i7 == 1 ? 23 : 12);
    }

    public static String t(Resources resources, CharSequence charSequence) {
        return u(resources, charSequence, "%02d");
    }

    public static String u(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, new Object[]{Integer.valueOf(Integer.parseInt(String.valueOf(charSequence)))});
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static int v(int i4) {
        return i4 >= 12 ? 1 : 0;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f12520d == fVar.f12520d && this.f12521e == fVar.f12521e && this.f12519c == fVar.f12519c && this.f12522f == fVar.f12522f) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f12519c), Integer.valueOf(this.f12520d), Integer.valueOf(this.f12521e), Integer.valueOf(this.f12522f)});
    }

    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f12520d);
        parcel.writeInt(this.f12521e);
        parcel.writeInt(this.f12522f);
        parcel.writeInt(this.f12519c);
    }

    protected f(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
