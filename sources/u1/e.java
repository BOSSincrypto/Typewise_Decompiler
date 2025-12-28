package U1;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

final class e implements Parcelable.Creator {
    e() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z3;
        PendingIntent pendingIntent = (PendingIntent) parcel.readParcelable(a.class.getClassLoader());
        if (parcel.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        return new d(pendingIntent, z3);
    }

    public final /* synthetic */ Object[] newArray(int i4) {
        return new a[i4];
    }
}
