package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import e0.C0642a;

public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final C0642a f7045a;

    static class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        /* renamed from: b */
        public ParcelImpl[] newArray(int i4) {
            return new ParcelImpl[i4];
        }
    }

    protected ParcelImpl(Parcel parcel) {
        this.f7045a = new b(parcel).u();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i4) {
        new b(parcel).L(this.f7045a);
    }
}
