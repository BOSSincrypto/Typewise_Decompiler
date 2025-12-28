package t1;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i4 = SafeParcelReader.i(parcel);
        int i5 = 0;
        PendingIntent pendingIntent = null;
        String str = null;
        int i6 = 0;
        while (parcel.dataPosition() < i4) {
            int e4 = SafeParcelReader.e(parcel);
            int d4 = SafeParcelReader.d(e4);
            if (d4 == 1) {
                i5 = SafeParcelReader.f(parcel, e4);
            } else if (d4 == 2) {
                i6 = SafeParcelReader.f(parcel, e4);
            } else if (d4 == 3) {
                pendingIntent = (PendingIntent) SafeParcelReader.a(parcel, e4, PendingIntent.CREATOR);
            } else if (d4 != 4) {
                SafeParcelReader.h(parcel, e4);
            } else {
                str = SafeParcelReader.b(parcel, e4);
            }
        }
        SafeParcelReader.c(parcel, i4);
        return new C0899a(i5, i6, pendingIntent, str);
    }

    public final /* synthetic */ Object[] newArray(int i4) {
        return new C0899a[i4];
    }
}
