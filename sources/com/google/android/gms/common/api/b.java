package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import t1.C0899a;

public final class b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i4 = SafeParcelReader.i(parcel);
        int i5 = 0;
        int i6 = 0;
        String str = null;
        PendingIntent pendingIntent = null;
        C0899a aVar = null;
        while (parcel.dataPosition() < i4) {
            int e4 = SafeParcelReader.e(parcel);
            int d4 = SafeParcelReader.d(e4);
            if (d4 == 1) {
                i6 = SafeParcelReader.f(parcel, e4);
            } else if (d4 == 2) {
                str = SafeParcelReader.b(parcel, e4);
            } else if (d4 == 3) {
                pendingIntent = (PendingIntent) SafeParcelReader.a(parcel, e4, PendingIntent.CREATOR);
            } else if (d4 == 4) {
                aVar = (C0899a) SafeParcelReader.a(parcel, e4, C0899a.CREATOR);
            } else if (d4 != 1000) {
                SafeParcelReader.h(parcel, e4);
            } else {
                i5 = SafeParcelReader.f(parcel, e4);
            }
        }
        SafeParcelReader.c(parcel, i4);
        return new Status(i5, i6, str, pendingIntent, aVar);
    }

    public final /* synthetic */ Object[] newArray(int i4) {
        return new Status[i4];
    }
}
