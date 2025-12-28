package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.a;
import java.util.Arrays;

public class g implements a.c {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final long f11962a;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public g createFromParcel(Parcel parcel) {
            return new g(parcel.readLong(), (a) null);
        }

        /* renamed from: b */
        public g[] newArray(int i4) {
            return new g[i4];
        }
    }

    /* synthetic */ g(long j4, a aVar) {
        this(j4);
    }

    public static g t(long j4) {
        return new g(j4);
    }

    public boolean d(long j4) {
        if (j4 >= this.f11962a) {
            return true;
        }
        return false;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        if (this.f11962a == ((g) obj).f11962a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f11962a)});
    }

    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeLong(this.f11962a);
    }

    private g(long j4) {
        this.f11962a = j4;
    }
}
