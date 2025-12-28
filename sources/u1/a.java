package U1;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new e();

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public abstract PendingIntent t();

    /* access modifiers changed from: package-private */
    public abstract boolean u();

    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(t(), 0);
        parcel.writeInt(u() ? 1 : 0);
    }
}
